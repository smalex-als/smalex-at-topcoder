package p400.srm400;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 01.05.2008
 * Time: 15:01:33
 */
public class GrabbingTaxi {
  public int minTime(int[] tXs, int[] tYs, int gX, int gY, int walkTime, int taxiTime) {
    int result = Integer.MAX_VALUE;
    result = Math.min(result, Math.abs(gX) * walkTime + Math.abs(gY) * walkTime);
    if (tXs.length > 0) {
      for (int i = 0; i < tXs.length; i++) {
        int tX = Math.abs(tXs[i]) * walkTime + Math.abs(gX - tXs[i]) * taxiTime;
        int tY = Math.abs(tYs[i]) * walkTime + Math.abs(gY - tYs[i]) * taxiTime;
        result = Math.min(tX + tY, result);
      }
    }
    System.out.println("result = " + result);
    return result;
  }

  public static void main(String[] args) {
    System.out.println(50 == new GrabbingTaxi().minTime(new int[]{}, new int[]{}, 3, 2, 10, 2));
    System.out.println(42 == new GrabbingTaxi().minTime(new int[]{-2, -2}, new int[]{0, -2}, -4, -2, 15, 3));
    System.out.println(2476 == new GrabbingTaxi().minTime(
        new int[]{34, -12, 1, 0, 21, -43, -98, 11, 86, -31},
        new int[]{11, 5, -68, 69, -78, -49, -36, -2, 1, 70},
        -97, -39, 47, 13));
  }
}
