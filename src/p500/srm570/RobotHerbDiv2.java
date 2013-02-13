package p500.srm570;

import utils.ExampleRunner;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/13/13
 * Time: 4:16 PM
 */
public class RobotHerbDiv2 {
  // y, x
  private static final int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

  public int getdist(int T, int[] a) {
    long[] A = new long[]{0, 0};
    int dir = 0;
    for (int t = 0; t < T; t++) {
      for (int i = 0; i < a.length; i++) {
        A[0] += a[i] * directions[dir % 4][0];
        A[1] += a[i] * directions[dir % 4][1];
        dir += a[i];
      }
    }
    // |x1-x2| + |y1-y2|
    return (int) (Math.abs(A[0]) + Math.abs(A[1]));
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 2, new RobotHerbDiv2().getdist(1, new int[]{1,2,3}));
    ExampleRunner.eq(2, 0, new RobotHerbDiv2().getdist(100, new int[]{1}));
    ExampleRunner.eq(3, 10, new RobotHerbDiv2().getdist(5, new int[]{1,1,2}));
    ExampleRunner.eq(4, 40000000, new RobotHerbDiv2().getdist(100,
        new int[]{
            400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000,
            400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000,
            400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000,
            400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000,
            400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000, 400000
        }));
  }
}
