package p500.srm531;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 1/31/12
 * Time: 7:10 AM
 */
public class UnsortedSequence {
  public int[] getUnsorted(int[] s) {
    Arrays.sort(s);
    if (s.length > 0) {
      for (int i = s.length - 1; i > 0; i--) {
        if (s[i - 1] < s[i]) {
          int tmp = s[i - 1];
          s[i - 1] = s[i];
          s[i] = tmp;
          return s;
        }
      }
    }
    return new int[]{};
  }
}
