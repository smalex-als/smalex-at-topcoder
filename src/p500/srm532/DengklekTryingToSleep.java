package p500.srm532;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/9/12
 * Time: 11:05 AM
 */
public class DengklekTryingToSleep {
  public int minDucks(int[] ducks) {
    boolean[] counted = new boolean[1000];
    for (int duck : ducks) {
      counted[duck] = true;
    }
    Arrays.sort(ducks);
    int a0 = ducks[0];
    int a1 = ducks[ducks.length - 1];
    int result = 0;
    for (int i = a0; i <= a1; i++) {
      if (!counted[i]) {
        result++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(68 == new DengklekTryingToSleep().minDucks(new int[]{7, 4, 77, 47, 74, 44}));
  }
}
