package p500.srm512;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 7/13/11
 * Time: 7:18 PM
 * with help
 */
public class MysteriousRestaurant {

  public int maxDays(String[] prices, int budget) {
    int days = prices.length;
    int types = prices[0].length();

    int res = 0;
    for (int t = 1; t <= days; t++) {
      int have = 0;
      for (int i = 0; i < 7 && i < t; i++) {
        int best = Integer.MAX_VALUE;
        for (int j = 0; j < types; j++) {
          int cur = 0;
          for (int k = i; k < t; k += 7) {
            cur += getDishCost(prices, j, k);
          }
          best = Math.min(best, cur);
        }
        have += best;
      }
      if (have <= budget) {
        res = Math.max(res, t);
      }
    }
//    return result;
    System.out.println("res = " + res);
    return res;
  }

  private int getDishCost(String[] prices, int type, int day) {
    int c = (int) prices[day].charAt(type);
    if (c >= '0' && c <= '9') {
      return c - '0';
    } else if (c >= 'a' && c <= 'z') {
      return c - 'a' + 10;
    }
    return c - 'A' + 36;
  }

  public static void main(String[] args) {
    System.out.println(new MysteriousRestaurant().maxDays(new String[]{"26", "14", "72", "39", "32", "85", "06"}, 13) == 5);
    System.out.println(new MysteriousRestaurant().maxDays(new String[]{"SRM", "512"}, 4) == 0);
    System.out.println(new MysteriousRestaurant().maxDays(new String[]{"26", "14", "72", "39", "32", "85", "06", "91"}, 20) == 8);
  }
}
