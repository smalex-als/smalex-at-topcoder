package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.ExampleRunner.eq;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 28.06.2008
 * Time: 15:28:18
 */
public class Coins {
  private int[] change(int[] money, int s) {
    int[][] t = new int[money.length][s + 1];
    for (int i = 0; i <= s; i++) {
      t[0][i] = i % money[0] == 0 ? i / money[0] : Integer.MAX_VALUE / 2;
    }
    for (int j = 1; j < money.length; j++) {
      for (int i = 0; i <= s; i++) {
        t[j][i] = Math.min(t[j - 1][i], i >= money[j] ? t[j][i - money[j]] + 1 : Integer.MAX_VALUE / 2);
      }
    }
    int j = money.length - 1;
    int i = s;
    List<Integer> res = new ArrayList<Integer>();
    while (i > 0 && j >= 0) {
      if (i >= money[j] && t[j][i] == t[j][i - money[j]] + 1) {
        res.add(money[j]);
        i -= money[j];
      } else {
        j--;
      }
    }
    int[] integers = convResult(res);
    System.out.println(Arrays.toString(integers));
    return integers;
  }

  private int[] convResult(List<Integer> list) {
    int[] res = new int[list.size()];
    int cnt = 0;
    for (Integer re : list) {
      res[cnt++] = re;
    }
    Arrays.sort(res);
    return res;
  }

  public static void main(String[] args) {
    try {
      eq(0, (new Coins()).change(new int[]{1, 3, 5}, 11), new int[]{1, 5, 5});
      eq(1, (new Coins()).change(new int[]{1, 10, 23}, 50), new int[]{10, 10, 10, 10, 10});
      eq(2, (new Coins()).change(new int[]{1, 3, 15}, 17), new int[]{1, 1, 15});
      eq(2, (new Coins()).change(new int[]{2, 3, 15}, 17), new int[]{2, 15});
    } catch (Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
}
