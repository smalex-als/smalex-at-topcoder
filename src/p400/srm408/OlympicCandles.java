// BEGIN CUT HERE
package p400.srm408;

import java.util.Arrays;

import static utils.ExampleRunner.eq;

public class OlympicCandles {
  public int numberOfNights(int[] candles) {
    int res = 0;
    while (true) {
      int cnt = res + 1;
      Arrays.sort(candles);
      for (int i = candles.length - 1; i >= 0; i--) {
        if (candles[i] > 0) {
          candles[i]--;
          cnt--;
          if (cnt == 0) {
            break;
          }
        }
      }
      if (cnt != 0) {
        return res;
      }
      res++;
    }
  }

  // BEGIN CUT HERE
  public static void main(String[] args) {
    try {
      eq(0, (new OlympicCandles()).numberOfNights(new int[]{2, 2, 2}), 3);
      eq(1, (new OlympicCandles()).numberOfNights(new int[]{2, 2, 2, 4}), 4);
      eq(2, (new OlympicCandles()).numberOfNights(new int[]{5, 2, 2, 1}), 3);
      eq(3, (new OlympicCandles()).numberOfNights(new int[]{1, 2, 3, 4, 5, 6}), 6);
      eq(4, (new OlympicCandles()).numberOfNights(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}), 4);
      eq(4, (new OlympicCandles()).numberOfNights(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,}), 7);
    } catch (Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
// END CUT HERE
}
