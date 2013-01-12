package p400.srm466;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 03.04.2010
 * Time: 20:02:22
 */
public class LotteryTicket {
  public String buy(int price, int b1, int b2, int b3, int b4) {
    int[] b = new int[]{b1, b2, b3, b4};
    for (int i = 0; i < 16; i++) {
      int sum = 0;
      for (int j = 0; j < b.length; j++) {
        if ((i & 1 << j) != 0) {
          sum += b[j];
        }
      }
      if (sum == price) {
        return "POSSIBLE";
      }
    }
    return "IMPOSSIBLE";
  }

  public String buyBak(int price, int b1, int b2, int b3, int b4) {
    int[] b = new int[]{b1, b2, b3, b4};
    for (int i = 0; i < 16; i++) {
      int sum = 0;
      for (int j = 0; j < b.length; j++) {
        if ((i & 1 << j) != 0) {
          sum += b[j];
        }
      }
      if (sum == price) {
        return "POSSIBLE";
      }
    }
    return "IMPOSSIBLE";
  }

  public static void main(String[] args) {
    System.out.println("POSSIBLE".equals(new LotteryTicket().buy(10, 1, 5, 10, 50)));
    System.out.println("POSSIBLE".equals(new LotteryTicket().buy(15, 1, 5, 10, 50)));
  }
}
