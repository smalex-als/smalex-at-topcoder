package p400.srm452;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: Nov 8, 2009
 * Time: 5:44:54 AM
 */
public class EggCartons {
  public int minCartons(int n) {
    int m = n / 6 + 1;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < m; j++) {
        if (n == i * 6 + j * 8) {
          return i + j;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(new EggCartons().minCartons(20) == 3);
    System.out.println(new EggCartons().minCartons(24) == 3);
    System.out.println(new EggCartons().minCartons(15) == -1);
    System.out.println(new EggCartons().minCartons(4) == -1);
  }
}
