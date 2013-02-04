package algo;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 1/27/13
 * Time: 5:08 PM
 */
public class DynamicMaxRectangle {
  public static void main(String[] args) {
    new DynamicMaxRectangle().solve(
        new int[][]{
            {0, 1, 0, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 0, 0},
            {1, 0, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1},
            {1, 1, 0, 0, 1, 1, 0},
        });
  }

  private void solve(int[][] A) {
  }
}
