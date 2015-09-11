package p600.srm667;

import java.util.Arrays;

/**
 * Created by smalex on 11/09/15.
 */
public class PointDistance {
  public int[] findPoint(int x1, int y1, int x2, int y2) {
    for (int x = -100; x <= 100; x++) {
      for (int y = -100; y <= 100; y++) {
        if (x1 == x && y1 == y || x2 == x && y2 == y) {
          continue;
        }
        double distanceA = Math.sqrt(getDistance(x1, y1, x, y));
        double distanceB = Math.sqrt(getDistance(x2, y2, x, y));
        if (distanceA > distanceB) {
          return new int[]{x, y};
        }
      }
    }
    return new int[]{1, 1};
  }

  private int getDistance(int x1, int y1, int x, int y) {
    return (x - x1) * (x - x1) + (y - y1) * (y - y1);
  }

  public static void main(String[] args) {
    int[] point = new PointDistance().findPoint(-1, 0, 1, 0);
    System.out.println(Arrays.toString(point));
  }
}
