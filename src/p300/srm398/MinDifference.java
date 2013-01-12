package p300.srm398;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 15.04.2008
 * Time: 15:00:44
 */
public class MinDifference {
  public int closestElements(int A0, int X, int Y, int M, int n) {
    int a[] = new int[n];
    a[0] = A0;
    for (int i = 1; i < n; i++) {
      a[i] = (a[i - 1] * X + Y) % M;
    }
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    int min = Integer.MAX_VALUE / 2;
    for (int i = 1; i < a.length; i++) {
      int diff = Math.abs(a[i] - a[i - 1]);
      if (diff < min) {
        min = diff;
      }
    }
    return min;
  }

  public static void main(String[] args) {
    System.out.println(6 == new MinDifference().closestElements(3, 7, 1, 101, 5));
  }
}
