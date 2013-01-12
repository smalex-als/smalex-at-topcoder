package p400.srm498;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 2/26/11
 * Time: 8:05 PM
 */
public class AdditionGame {
  public int getMaximumPoints(int A, int B, int C, int N) {
    int[] m = {A, B, C};

    int score = 0;
    for (int i = 0; i < N; i++) {
      int maxIndex = 0;
      int maxValue = m[maxIndex];
      for (int j = 0; j < m.length; j++) {
        if (m[j] > maxValue) {
          maxIndex = j;
          maxValue = m[j];
        }
      }
      score += maxValue;
      if (maxValue >= 1) {
        m[maxIndex]--;
      }
      System.out.println("maxValue = " + maxValue);
      System.out.println("m = " + Arrays.toString(m));
    }
    System.out.println("score = " + score);
    return score;
  }

  public static void main(String[] args) {
    System.out.println(new AdditionGame().getMaximumPoints(3, 4, 5, 3) == 13);
  }
}
