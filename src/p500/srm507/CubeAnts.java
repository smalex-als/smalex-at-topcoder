package p500.srm507;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 5/28/11
 * Time: 8:04 PM
 */
public class CubeAnts {

  private static int map[] = {
      0, // 0
      1, // 1
      2, // 2
      1, // 3
      1, // 4
      2, // 5
      3, // 6
      2, // 7
  };

  public int getMinimumSteps(int[] pos) {
    int result = 0;
    for (int p : pos) {
      result = Math.max(result, map[p]);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(3 == new CubeAnts().getMinimumSteps(new int[]{6, 1, 6}));
  }
}
