package p500.srm565;

import utils.ExampleRunner;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 1/13/13
 * Time: 11:34 AM
 * with help
 * Dynamic Programming
 */
public class MonstersValley {
  public int minimumPrice(long[] dread, int[] price) {
    int n = dread.length;
    long[][] maxDread = new long[n * 2 + 1][n + 1];
    for (int p = 0; p <= n * 2; p++) {
      maxDread[p][0] = 0;
      for (int i = 1; i <= n; i++) {
        maxDread[p][i] = Long.MIN_VALUE;
        // bribe
        if (p >= price[i - 1]) {
          maxDread[p][i] = maxDread[p - price[i - 1]][i - 1] + dread[i - 1];
        }
        if (maxDread[p][i - 1] >= dread[i - 1]) {
          maxDread[p][i] = Math.max(maxDread[p][i], maxDread[p][i - 1]);
        }
      }
    }
    for (int i = 0; i < maxDread.length; i++) {
      if (maxDread[i][n] >= 0) {
        return i;
      }
    }
    return 2 * n;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 2, new MonstersValley().minimumPrice(new long[]{8, 5, 10}, new int[]{1, 1, 2}));
    ExampleRunner.eq(2, 5, new MonstersValley().minimumPrice(new long[]{1, 2, 4, 1000000000}, new int[]{1, 1, 1, 2}));
    ExampleRunner.eq(3, 2, new MonstersValley().minimumPrice(new long[]{200, 107, 105, 206, 307, 400}, new int[]{1, 2, 1, 1, 1, 2}));
    ExampleRunner.eq(4, 5, new MonstersValley().minimumPrice(new long[]{5216, 12512, 613, 1256, 66, 17202, 30000, 23512, 2125, 33333}, new int[]{2, 2, 1, 1, 1, 1, 2, 1, 2, 1}));
    ExampleRunner.eq(5, 2, new MonstersValley().minimumPrice(new long[]{606}, new int[]{2}));
    ExampleRunner.eq(6, 2, new MonstersValley().minimumPrice(new long[]{524657775}, new int[]{2}));
    ExampleRunner.eq(7, 3, new MonstersValley().minimumPrice(new long[]{3, 2, 5, 7}, new int[]{1, 1, 2, 2}));
  }
}
