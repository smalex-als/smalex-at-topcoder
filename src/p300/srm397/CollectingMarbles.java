package p300.srm397;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 12.04.2008
 * Time: 21:05:09
 */
public class CollectingMarbles {
  public int mostMabrbles(int[] marblesWeights, int bagCapacity, int numberOfBags) {
    int result = 0;
    Arrays.sort(marblesWeights);
    int bags[] = new int[numberOfBags];
    for (int i = 0; i < marblesWeights.length; i++) {
      int weight = marblesWeights[i];
      for (int j = 0; j < bags.length; j++) {
        if (bagCapacity - weight > bags[j]) {
          bags[j] += weight;
          result++;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(4 == new CollectingMarbles().mostMabrbles(new int[]{2, 2, 2, 2, 2}, 5, 2));
    System.out.println(4 == new CollectingMarbles().mostMabrbles(new int[]{1, 3, 5, 2, 4}, 5, 2));
    System.out.println(4 == new CollectingMarbles().mostMabrbles(new int[]{7, 6, 6, 5}, 12, 2));
    System.out.println(0 == new CollectingMarbles().mostMabrbles(new int[]{2, 2, 2}, 1, 10));
  }
}
