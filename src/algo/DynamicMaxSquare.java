package algo;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 1/27/13
 * Time: 2:52 PM
 */
public class DynamicMaxSquare {
  public static void main(String[] args) {
    new DynamicMaxSquare().solve(
        new int[][]{
            {0, 1, 0, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 0, 0},
            {1, 0, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1},
            {1, 1, 0, 0, 1, 1, 0},
        });
  }

  private int solve(int[][] A) {
    int n = A.length;
    int m = A[0].length;
    int[][] B = new int[n][m];
    for (int i = 0; i < n; i++) {
      B[i][0] = A[i][0];
    }
    for (int i = 0; i < n; i++) {
      B[0][i] = A[0][i];
    }
    for (int j = 1; j < n; j++) {
      for (int i = 1; i < m; i++) {

        if (A[j][i] != 0) {
          B[j][i] = Math.min(B[j - 1][i - 1], Math.min(B[j][i - 1], B[j - 1][i])) + 1;
        } else {
          B[j][i] = 0;
        }
      }
    }

    int max = 0;
    for (int j = 0; j < n; j++) {
      for (int i = 0; i < m; i++) {
        max = Math.max(B[j][i], max);
      }
    }
//    System.out.println("max = " + max);

//    dump(A);
//    dump(B);
    return max;
  }

  private void dump(int[][] b) {
    for (int i = 0; i < b.length; i++) {
      System.out.println(" " + Arrays.toString(b[i]));
    }
    System.out.println();
  }

}
