package p500.srm500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 3/19/11
 * Time: 7:03 PM
 */
public class SRMCards {
  public int maxTurns(int[] cards) {
    Arrays.sort(cards);
    List<Integer> integers = new ArrayList<Integer>();
    for (int card : cards) {
      integers.add(card);
    }
    int result = 0;
    while (!integers.isEmpty()) {
      result++;
      int num = integers.get(0);
      integers.remove(0);
      if (integers.contains(num + 1)) {
        integers.remove(new Integer(num + 1));
      }
      if (integers.contains(num - 1)) {
        integers.remove(new Integer(num - 1));
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(1 == new SRMCards().maxTurns(new int[]{498, 499}));
    System.out.println(4 == new SRMCards().maxTurns(new int[]{491, 492, 495, 497, 498, 499}));
  }
}
