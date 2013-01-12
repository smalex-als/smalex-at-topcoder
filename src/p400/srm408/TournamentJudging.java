// BEGIN CUT HERE
package p400.srm408;

import static utils.ExampleRunner.eq;

public class TournamentJudging {
  public int getPoints(int[] rawScores, int[] conversionFactor) {
    int res = 0;
    for (int i = 0; i < rawScores.length; i++) {
      res += (int) Math.round(((double) rawScores[i] / conversionFactor[i]));

    }
    return res;
  }

  // BEGIN CUT HERE
  public static void main(String[] args) {
    try {
      eq(0, new TournamentJudging().getPoints(new int[]{10, 20, 30}, new int[]{10, 10, 5}), 9);
      eq(1, new TournamentJudging().getPoints(new int[]{8, 16, 32}, new int[]{10, 10, 5}), 9);
      eq(2, new TournamentJudging().getPoints(new int[]{60, 59}, new int[]{24, 24}), 5);
      eq(3, new TournamentJudging().getPoints(new int[]{47, 42, 37, 30, 27, 21, 18}, new int[]{1, 2, 3, 4, 5, 6, 7}), 100);
      eq(4, new TournamentJudging().getPoints(new int[]{0, 1000000, 5000, 1000000}, new int[]{1, 2, 1000000, 4}), 750000);
    } catch (Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
// END CUT HERE
}
