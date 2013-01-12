package p400.srm499;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 3/8/11
 * Time: 7:02 PM
 */
public class SimpleGuess {
  public int getMaximum(int[] hints) {
    int max = 0;
    for (int x = 1; x < 101; x++) {
      for (int y = 1; y < 101; y++) {
        boolean ok_sum = false;
        boolean ok_sub = false;
        for (int i = 0; i < hints.length; i++) {
          int hint = hints[i];
          if (x - y == hint) {
            ok_sum = true;
          }
          if (x + y == hint) {
            ok_sub = true;
          }
        }
        if (ok_sum && ok_sub) {
          if (max < x * y) {
            max = x * y;
          }
        }
      }
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println(6 == new SimpleGuess().getMaximum(new int[]{1, 4, 5}));
  }
}
