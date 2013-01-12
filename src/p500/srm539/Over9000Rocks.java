package p500.srm539;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 4/4/12
 * Time: 9:44 PM
 */
public class Over9000Rocks {
  private boolean[] m = new boolean[17000000];
  public int countPossibilities(int[] lowerBound, int[] upperBound) {
    int n = lowerBound.length;
    for (int i = 0; i < (1 << n); i++) {
      int result0 = 0;
      int result1 = 0;
      for (int j = 0; j < lowerBound.length; j++) {
        if (((1 << j) & i) != 0) {
          result0 += lowerBound[j];
          result1 += upperBound[j];
        }
      }

      Arrays.fill(m, result0, result1 + 1, true);
    }

    int result = 0;
    for (int i = 9001; i < m.length; i++) {
      boolean b = m[i];
      if (b) {
        result++;
      }
    }
    System.out.println("result = " + result);
    return result;
  }

  public static void main(String[] args) {
    System.out.println(15 == new Over9000Rocks().countPossibilities(new int[]{9000, 1, 10}, new int[]{9000, 2, 20}));
    System.out.println(1 == new Over9000Rocks().countPossibilities(new int[]{9000}, new int[]{9001}));
    System.out.println(9 == new Over9000Rocks().countPossibilities(new int[]{1001, 2001, 3001, 3001}, new int[]{1003, 2003, 3003, 3003}));
    System.out.println(9 == new Over9000Rocks().countPossibilities(new int[]{1, 1, 1, 1, 1},
        new int[]{1000000, 1000000, 1000000, 1000000, 1000000}));
  }
}
