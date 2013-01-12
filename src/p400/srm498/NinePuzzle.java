package p400.srm498;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 2/26/11
 * Time: 8:59 PM
 */
public class NinePuzzle {
  public int getMinimumCost(String init, String goal) {
    int[] colorOrig = fill(init);
    int[] colorGoal = fill(goal);
    int result = 0;
    System.out.println("colorOrig = " + Arrays.toString(colorOrig));
    System.out.println("colorGoal = " + Arrays.toString(colorGoal));
    for (int i = 0; i < colorGoal.length; i++) {
      if (colorGoal[i] > 0 && colorGoal[i] - colorOrig[i] > 0) {
        result += Math.abs(colorGoal[i] - colorOrig[i]);
      }
    }
    System.out.println("result = " + result);
    return result;
  }

  private int[] fill(String init) {
    int[] color = new int[4];
    for (int i = 0; i < init.length(); i++) {
      switch (init.charAt(i)) {
        case 'R':
          color[0]++;
          break;
        case 'G':
          color[1]++;
          break;
        case 'B':
          color[2]++;
          break;
        case 'Y':
          color[3]++;
          break;
      }
    }
    return color;
  }

  public static void main(String[] args) {
    System.out.println(9 == new NinePuzzle().getMinimumCost("GBBB*BGBBG", "RYYY*YRYYR"));
    System.out.println(1 == new NinePuzzle().getMinimumCost("RRBR*BRBBB", "BBRB*RBRRR"));
  }
}
