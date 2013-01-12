package p400.srm491;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 12/18/10
 * Time: 8:24 PM
 */
public class FoxMakingDiceEasy {

  public int theCount(int N, int K) {
    int result = 0;
    for (int i0 = 1; i0 <= N; i0++) {
      for (int i1 = i0 + 1; i1 <= N; i1++) {
        for (int i2 = i1 + 1; i2 <= N; i2++) {
          for (int i3 = i2 + 1; i3 <= N; i3++) {
            for (int i4 = i3 + 1; i4 <= N; i4++) {
              for (int i5 = i4 + 1; i5 <= N; i5++) {
                final int s0 = i0 + i5;
                final int s1 = i1 + i4;
                final int s2 = i2 + i3;
                if (s0 >= K && s1 >= K && s2 >= K && s1 == s0 && s0 == s2) {
                  result++;
                }
              }
            }
          }
        }
      }
    }
    return result * 2;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 2, new FoxMakingDiceEasy().theCount(6, 7));
    ExampleRunner.eq(2, 0, new FoxMakingDiceEasy().theCount(5, 7));
    ExampleRunner.eq(3, 48, new FoxMakingDiceEasy().theCount(10, 10));
    ExampleRunner.eq(4, 504, new FoxMakingDiceEasy().theCount(31, 46));
    ExampleRunner.eq(5, 105800, new FoxMakingDiceEasy().theCount(50, 1));
    ExampleRunner.eq(6, 97152, new FoxMakingDiceEasy().theCount(49, 2));
  }
}
