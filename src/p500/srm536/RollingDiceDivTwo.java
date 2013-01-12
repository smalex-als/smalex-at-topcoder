package p500.srm536;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 3/7/12
 * Time: 7:34 AM
 */
public class RollingDiceDivTwo {
  public int minimumFaces(String[] rolls) {
    for (int i = 0; i < rolls.length; i++) {
      String roll = rolls[i];
      final char[] chars = roll.toCharArray();
      Arrays.sort(chars);
      rolls[i] = new String(chars);
    }
    int result = 0;
    for (int i = 0; i < rolls[0].length(); i++) {
      int max = rolls[0].charAt(i) - '0';

      for (String roll : rolls) {
        max = Math.max(max, roll.charAt(i) - '0');
      }
      result += max;
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println(14 == new RollingDiceDivTwo().minimumFaces(new String[]{"137", "364", "115", "724"}));
  }
}
