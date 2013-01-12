package p400.srm461;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 13.02.2010
 * Time: 20:00:55
 */
public class TrappingRabbit {

  public int findMinimumTime(int[] trapX, int[] trapY) {
    int minX = 99999;
    int minY = 99999;
    for (int i = 0; i < trapX.length; i++) {
      if (trapX[i] + trapY[i] < minX + minY) {
        minX = trapX[i];
        minY = trapY[i];
      }
    }
    System.out.println("minX = " + minX);
    System.out.println("minY = " + minY);
    return minX + minY - 2;
  }

  public static void main(String[] args) {
    System.out.println(3 == new TrappingRabbit().findMinimumTime(new int[]{4, 6, 8}, new int[]{1, 2, 1}));
    System.out.println(878 == new TrappingRabbit().findMinimumTime(new int[]{958, 375, 195, 686, 483, 629, 377}, new int[]{104, 505, 882, 357, 759, 400, 869}));
  }
}
