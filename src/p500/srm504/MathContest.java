package p500.srm504;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 4/26/11
 * Time: 7:31 PM
 */
public class MathContest {
  private boolean inversion = false;
  private boolean dir = true;

  public int countBlack(String ballSequence, int repetitions) {
    LinkedList<Boolean> data = new LinkedList<Boolean>();
    for (int j = 0; j < repetitions; j++) {
      for (int i = 0; i < ballSequence.length(); i++) {
        data.add(ballSequence.charAt(i) == 'B');
      }
    }
    int cnt = data.size();
    int result = 0;
    while (cnt > 0) {
      boolean color;
      if (dir) {
        color = data.removeFirst();
      } else {
        color = data.removeLast();
      }
      if (inversion) {
        color = !color;
      }
      if (color) {
        result++;
      }
      cnt--;
      // black
      if (color) {
        inversion = !inversion;
      } else {
        dir = !dir;
      }
    }
    System.out.println("result = " + result);
    return result;
  }

  public static void main(String[] args) {
    System.out.println(2 == new MathContest().countBlack("WWWBWBWBWWWWBWWWBWWBWWWWWBWBWBWWWWBWWWBWWBWWBBB", 3500));
  }
}
