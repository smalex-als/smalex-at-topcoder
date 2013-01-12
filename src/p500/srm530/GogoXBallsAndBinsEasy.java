package p500.srm530;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 1/20/12
 * Time: 5:14 AM
 */
public class GogoXBallsAndBinsEasy {
  public int solve(int[] T) {
    Arrays.sort(T);
    int j = 0;
    for (int i = 0; i < T.length / 2; i++) {
      int diff = T[T.length - i - 1] - T[i];
      j += diff;
    }
    return j;
  }

  public static void main(String[] args) {
    System.out.println(5 == new GogoXBallsAndBinsEasy().solve(new int[]{0, 2, 5}));
  }
}
