package p500.srm504_5;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 5/17/11
 * Time: 7:07 PM
 */
public class TheJackpotDivTwo {

  public int[] find(int[] money, int jackpot) {
    if (money.length == 1) {
      money[0] += jackpot;
    } else {
      while (jackpot != 0) {
        Arrays.sort(money);
        int delta = Math.min(jackpot, money[1] - money[0]);
        if (delta == 0) {
          delta++;
        }
        money[0] += delta;
        jackpot -= delta;
      }
      Arrays.sort(money);
    }
    return money;
  }

  public static void main(String[] args) {
    System.out.println("args = " + Arrays.toString(new TheJackpotDivTwo().find(new int[]{1, 2, 3, 4}, 2)));
    System.out.println("args = " + Arrays.toString(new TheJackpotDivTwo().find(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1000000)));
  }
}
