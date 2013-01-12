package p400.srm460;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 18.03.2010
 * Time: 8:40:00
 */
public class TheFansAndMeetingsDivTwo {
  public double find(int[] minJ, int[] maxJ, int[] minB, int[] maxB) {
    double[] pJ = createMap(minJ, maxJ);
    double[] pB = createMap(minB, maxB);

    double res = 0;
    for (int i = 0; i < pJ.length; i++) {
      res += pJ[i] * pB[i];
    }
    return res;
  }

  private double[] createMap(int[] min, int[] max) {
    double p[] = new double[51];
    for (int i = 0; i < min.length; i++) {
      for (int j = min[i]; j <= max[i]; j++) {
        p[j] += 1 / (((double) max[i] - min[i] + 1)) / min.length;
      }
    }
    return p;
  }

  public static void main(String[] args) {
    System.out.println(compare(0.3333333333333333, new TheFansAndMeetingsDivTwo().find(new int[]{1}, new int[]{3}, new int[]{1}, new int[]{1})));
    System.out.println(compare(0.014880952380952378, new TheFansAndMeetingsDivTwo().find(new int[]{5, 7, 7, 1, 6, 1, 1}, new int[]{8, 9, 7, 3, 9, 5, 3}, new int[]{9, 12, 10, 14, 50, 9, 10}, new int[]{9, 13, 50, 15, 50, 12, 11})));
    System.out.println(compare(0, new TheFansAndMeetingsDivTwo().find(new int[]{44}, new int[]{47}, new int[]{4}, new int[]{7})));
    System.out.println(compare(0.11562305130385474, new TheFansAndMeetingsDivTwo().find(new int[]{1, 6, 3, 1, 4, 3, 5, 1}, new int[]{7, 8, 5, 7, 9, 7, 9, 3}, new int[]{5, 1, 5, 3, 1, 2, 4, 1}, new int[]{9, 2, 7, 9, 4, 5, 4, 9})));
    System.out.println(compare(0.0200000000000089, new TheFansAndMeetingsDivTwo().find(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50})));
  }

  private static boolean compare(double v1, double v) {
    return Math.abs(v1 - v) < 1E-12;
  }
}
