package p400.srm499;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 3/8/11
 * Time: 7:14 PM
 */
public class ColorfulRabbits {
  public int getMinimum(int[] replies) {
    Map<Integer, Integer> allSums = new HashMap<Integer, Integer>();
    int result = 0;
    for (int reply : replies) {
      Integer count = allSums.get(reply);
      if (count == null) {
        count = reply + 1;
        result += reply + 1;
      }
      count--;
      if (count < 0) {
        result += reply + 1;
        count = reply;
      }
      allSums.put(reply, count);
    }
    return result;
  }

  public int getMinimum2(int[] replies) {
    Map<Integer, Integer> allSums = new HashMap<Integer, Integer>();
    for (int reply : replies) {
      Integer count = allSums.get(reply);
      if (count == null) {
        count = 0;
      }
      count++;
      allSums.put(reply, count);
    }
    int result = 0;
    for (Integer reply : allSums.keySet()) {
      Integer count = allSums.get(reply);
      int realCount = reply + 1;
      if (count > realCount) {
        result += realCount * (count + reply) / realCount;
      } else {
        result += realCount;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(1 == new ColorfulRabbits().getMinimum(new int[]{0}));
    System.out.println(5 == new ColorfulRabbits().getMinimum(new int[]{1, 1, 2, 2}));
    System.out.println(499 == new ColorfulRabbits().getMinimum(new int[]{2, 2, 44, 2, 2, 2, 444, 2, 2}));
    System.out.println(5 == new ColorfulRabbits().getMinimum(new int[]{1, 1, 2, 2, 2}));
    System.out.println(8 == new ColorfulRabbits().getMinimum(new int[]{1, 1, 2, 2, 2, 2}));
    System.out.println(8 == new ColorfulRabbits().getMinimum(new int[]{1, 1, 2, 2, 2, 2, 2}));
    System.out.println(8 == new ColorfulRabbits().getMinimum(new int[]{1000000, 1, 2, 2, 2, 2, 2, 2}));
  }
}
