package p400.srm449;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 23.09.2009
 * Time: 19:03:29
 */
public class MountainRoad {
  public double findDistance(int[] start, int[] finish) {
    double summa = 0;
    for (int i = 0; i < start.length; i++) {
      final double v = dist((finish[i] - start[i]) / 2);
      summa += v;
      if (i + 1 < start.length && finish[i] > start[i + 1]) {
        double v2 = dist(finish[i] - start[i + 1]);
        summa += v - v2;
      } else {
        summa += v;
      }

    }
    return summa;
  }

  private double dist(int len) {
    return Math.sqrt((double) (len * len + len * len));
  }

  public static void main(String[] args) {
//    System.out.println(new MountainRoad().findDistance(new int[]{1}, new int[]{7}));
    System.out.println(new MountainRoad().findDistance(new int[]{0, 3}, new int[]{5, 9}));
//    new MountainRoad().findDistance(new int[]{0, 3, 4}, new int[]{5, 9, 6});
  }
}
