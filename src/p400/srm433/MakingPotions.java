package p400.srm433;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 21.01.2009
 * Time: 19:55:14
 */
public class MakingPotions {
  private static abstract class CalcPrice {
    private String name;

    protected CalcPrice(String name) {
      this.name = name;
    }

    abstract int getPrice();

    public String getName() {
      return name;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      CalcPrice calcPrice = (CalcPrice) o;

      if (name != null ? !name.equals(calcPrice.name) : calcPrice.name != null) return false;

      return true;
    }

    @Override
    public int hashCode() {
      return name != null ? name.hashCode() : 0;
    }
  }

  private static class MarketPrice extends CalcPrice {
    private int price;

    private MarketPrice(String name, int price) {
      super(name);
      this.price = price;
    }

    int getPrice() {
      return price;
    }
  }

  private static class RecipePrice extends CalcPrice {
    private String recipe;
    private CalcPrice prevPrice;
    private MakingPotions makingPotions;
    private boolean started;
    private boolean finished;
    private int price;

    private RecipePrice(String name, String recipe, CalcPrice prevPrice, MakingPotions makingPotions) {
      super(name);
      this.recipe = recipe;
      this.prevPrice = prevPrice;
      this.makingPotions = makingPotions;
    }

    int getPrice() {
      if (started && finished) {
        return price;
      }
      if (started && !finished) {
        return prevPrice != null ? prevPrice.getPrice() : -1;
      }
      started = true;
      price = 0;
      long n = 0;
      Pattern p = Pattern.compile("^(\\d+)([A-Z]+)$");
      for (String goodWithCount : recipe.split("\\+")) {
        final Matcher matcher = p.matcher(goodWithCount);
        if (!matcher.matches()) {
          throw new RuntimeException("Not matched " + goodWithCount);
        }
        int cnt = Integer.parseInt(matcher.group(1));
        final String goodName = matcher.group(2);
        final int cost = makingPotions.getCost(goodName);
        if (cost == -1) {
          n = -1;
          break;
        }
//                System.out.println(String.format("%s - %d * %d = %d", goodName, cnt, cost, cnt * cost ));
        n += (long) cnt * cost;
        if (n > 1000000000L) {
          n = 1000000001;
        }
      }
      price = (int) n;
      finished = true;
      if (prevPrice != null && prevPrice.getPrice() != -1) {
        if (price != -1) {
          price = Math.min(prevPrice.getPrice(), price);
        } else {
          price = prevPrice.getPrice();
        }
      }
      return price;
    }
  }

  private Map<String, CalcPrice> priceMap;

  public int getCost(String[] marketGoods, int[] cost, String[] recipes) {
    priceMap = new HashMap<String, CalcPrice>();
    for (int i = 0; i < marketGoods.length; i++) {
      priceMap.put(marketGoods[i], new MarketPrice(marketGoods[i], cost[i]));
    }
    for (String recipe : recipes) {
      final String[] strings = recipe.split("=", 2);
      String name = strings[0];
      String rec = strings[1];
      priceMap.put(name, new RecipePrice(name, rec, priceMap.get(name), this));
    }
    return getCost("LOVE");
  }

  private int getCost(String name) {
    final CalcPrice calcPrice = priceMap.get(name);
    if (calcPrice != null) {
      return calcPrice.getPrice();
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(95 == new MakingPotions().getCost(
        new String[]{"LOVE", "WATER", "HONEY"},
        new int[]{100, 1, 30},
        new String[]{"LOVE=5WATER+3HONEY"}
    ));
    System.out.println(76 == new MakingPotions().getCost(
        new String[]{"WATER", "HONEY", "HOP"},
        new int[]{2, 6, 9},
        new String[]{"LOVE=2WATER+4HONEY+2BEER", "BEER=1HOP+3WATER+1HOP"}
    ));
    System.out.println(-1 == new MakingPotions().getCost(
        new String[]{"ORANGEJUICE", "APPLEJUICE"},
        new int[]{6, 4},
        new String[]{"JUICEMIX=1ORANGEJUICE+1APPLEJUICE"}
    ));
    System.out.println(73 == new MakingPotions().getCost(
        new String[]{"WATER", "HONEY", "HOP"},
        new int[]{1, 22, 17},
        new String[]{"LOVE=7WATER+3HONEY", "LOVE=2HONEY+2HOP"}
    ));
    System.out.println(-1 == new MakingPotions().getCost(
        new String[]{"OIL", "WATER"},
        new int[]{60, 70},
        new String[]{"FIRSTPOTION=1OIL+1SECONDPOTION", "SECONDPOTION=4WATER+1FIRSTPOTION", "LOVE=1FIRSTPOTION+1SECONDPOTION"}
    ));
    System.out.println(1000000001 == new MakingPotions().getCost(
        new String[]{"HONEYBIT"},
        new int[]{100},
        new String[]{"LOVE=6HONEYMEGABYTE", "HONEYMEGABYTE=2HONEYFIFTYTWELVEKBYTES",
                     "HONEYFIFTYTWELVEKBYTES=8HONEYSIXTYFOURKBYTES", "HONEYSIXTYFOURKBYTES=8HONEYEIGHTKBYTES",
                     "HONEYEIGHTKBYTES=8HONEYKBYTE", "HONEYKBYTE=2EIGHTBYEIGHTWORDS", "EIGHTBYEIGHTWORDS=8EIGHTWORDS",
                     "EIGHTWORDS=8HONEYWORD", "HONEYWORD=8HONEYBYTE", "HONEYBYTE=8HONEYBIT"}
    ));
    System.out.println(-1 == new MakingPotions().getCost(
        new String[]{"WATER"},
        new int[]{1},
        new String[]{"LOVE=1LOVE"}
    ));
    System.out.println(110 == new MakingPotions().getCost(
        new String[]{"MILK", "WATER", "HOP"},
        new int[]{6, 1, 14},
        new String[]{"NECTAR=4HOP+2MILK", "LOVE=5MILK+3BEER", "LOVE=2WATER+1LOVE", "LOVE=2MIX+1NECTAR",
                     "MIX=1MILK+1WATER+1HOP", "BEER=5WATER+2HOP", "LOVE=1NECTAR+3WATER+3HOP", "NECTAR=3BEER+1MILK+2MILK"}
    ));
  }
}