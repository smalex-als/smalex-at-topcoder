package p500.srm569;

import utils.ExampleRunner;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/7/13
 * Time: 6:13 AM
 */
public class TheJediTestDiv2 {
  public int countSupervisors(int[] students, int Y, int J) {
    int N = students.length;
    int best = Integer.MAX_VALUE;
    for (int j = 0; j < N; j++) {
      int res = 0;
      for (int i = 0; i < N; i++) {
        int student = students[i];
        if (i == j) {
          student -= Y;
        }
        if (student > 0) {
          res += student / J;
          if (student % J != 0) {
            res++;
          }
        }
      }
      best = Math.min(best, res);
    }
    return best == Integer.MAX_VALUE ? 0 : best;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 3, new TheJediTestDiv2().countSupervisors(new int[]{10, 15}, 12, 5));
    ExampleRunner.eq(1, 3, new TheJediTestDiv2().countSupervisors(new int[]{10, 15}, 12, 5));
  }

}
