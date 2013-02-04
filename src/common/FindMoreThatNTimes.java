package common;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/4/13
 * Time: 8:11 PM
 */
public class FindMoreThatNTimes {
  public int find(int[] array, int n) {
    if (array.length != 0) {
      Arrays.sort(array);
      int k = array[0];
      int cnt = 1;
      for (int i = 1; i < array.length; i++) {
        int cur = array[i];
        if (k == cur) {
          if (++cnt > n) {
            return k;
          }
        } else {
          k = cur;
          cnt = 1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(new FindMoreThatNTimes().find(new int[]{4, 5, 3, 2, 3, 4, 5, 7, 1, 2, 3}, 2));
  }
}
