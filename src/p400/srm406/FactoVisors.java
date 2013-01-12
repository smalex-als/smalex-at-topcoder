// BEGIN CUT HERE
package p400.srm406;

import static utils.ExampleRunner.eq;
// http://www.topcoder.com/tc?module=AlgoCompetitionHistory&cr=22710714

// END CUT HERE
public class FactoVisors {
  private int[] divisors;
  private int[] multiples;

  public int getNum(int[] divisors, int[] multiples) {
    this.divisors = divisors;
    this.multiples = multiples;
    int res = 0;
    int max = 0;
    for (int multiple : multiples) {
      max = Math.max(max, multiple);
    }
    for (int i = 1; i * i <= max; i++) {
      if (max % i == 0) {
        if (isOK(i)) {
          res++;
        }
        if (max / i != i && isOK(max / i)) {
          res++;
        }
      }
    }
    return res;
  }

  private boolean isOK(int x) {
    for (int divisor : divisors) {
      if (x % divisor != 0) {
        return false;
      }
    }
    for (int multiple : multiples) {
      if (multiple % x != 0) {
        return false;
      }
    }
    return true;
  }

  // BEGIN CUT HERE
  public static void main(String[] args) {
    try {
      eq(0, (new FactoVisors()).getNum(new int[]{1}, new int[]{100}), 9);
      eq(1, (new FactoVisors()).getNum(new int[]{6, 9}, new int[]{18}), 1);
      eq(2, (new FactoVisors()).getNum(new int[]{6, 9}, new int[]{96, 180}), 0);
      eq(3, (new FactoVisors()).getNum(new int[]{2, 4}, new int[]{256}), 7);
      eq(4, (new FactoVisors()).getNum(new int[]{1000, 10000, 100000}, new int[]{1000000000}), 25);
    } catch (Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
// END CUT HERE
}
