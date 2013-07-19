package p500.srm585;// BEGIN CUT HERE

// END CUT HERE

public class LISNumberDivTwo {
  public int calculate(int[] seq) {
    int res = 1;
    for (int i = 1; i < seq.length; i++) {
      if (seq[i - 1] < seq[i]) {
      } else {
        res++;
      }
    }
    return res;
  }
}

