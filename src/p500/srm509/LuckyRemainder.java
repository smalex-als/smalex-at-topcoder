package p500.srm509;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 6/8/11
 * Time: 3:19 PM
 */
public class LuckyRemainder {
  public int getLuckyRemainder(String X) {
    String x = "";
    for (int i = 1; i <= 9; i++) {
      char c = (char) ('0' + i);
      if (X.indexOf(c) != -1) {
        x += c;
      }
    }
    return gen(x, 0) % 9;
  }

  private int gen(String x, int offset) {
    if (x.length() == 0) {
      return 0;
    }
    if (x.length() == offset) {
//      System.out.println("x = " + x);
      return Integer.parseInt(x);
    }
    return gen(x.substring(0, offset) + x.substring(offset), offset + 1)
        + gen(x.substring(0, offset) + x.substring(offset + 1), offset);
  }

  public static void main(String[] args) {
    System.out.println(6 == new LuckyRemainder().getLuckyRemainder("123"));
    System.out.println(3 == new LuckyRemainder().getLuckyRemainder("24816"));
    System.out.println(8 == new LuckyRemainder().getLuckyRemainder("8"));
    System.out.println(7 == new LuckyRemainder().getLuckyRemainder("11235813213455"));
  }
}
