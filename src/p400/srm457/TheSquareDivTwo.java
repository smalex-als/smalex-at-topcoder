package p400.srm457;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 20.01.2010
 * Time: 13:14:10
 */
public class TheSquareDivTwo {
  public String[] solve(String[] board) {
    final int N = board.length;
    int[] R = new int[N];
    for (int i = 0; i < N; i++) {
      int cnt = 0;
      for (char c : board[i].toCharArray()) {
        if (c == 'C') {
          cnt++;
        }
      }
      R[i] = cnt;
    }
    char[][] table = new char[N][N];
    for (int i = N - 1; i >= 0; i--) {
      for (int j = 0; j < R.length; j++) {
        if (R[j] > 0) {
          table[i][j] = 'C';
          R[j]--;
        } else {
          table[i][j] = '.';
        }
      }
    }
    String[] result = new String[N];
    for (int i = 0; i < N; i++) {
      result[i] = new String(table[i]);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.equals(new String[]{"..", ".C"}, new TheSquareDivTwo().solve(new String[]{"..", "C."})));
    System.out.println(Arrays.equals(new String[]{"C.", "CC"}, new TheSquareDivTwo().solve(new String[]{"CC", ".C"})));
    System.out.println(Arrays.equals(new String[]{"...C", ".C.C", ".C.C", "CCCC"}, new TheSquareDivTwo().solve(new String[]{".C..", "CC.C", "..C.", "CCCC"})));
    System.out.println(Arrays.equals(new String[]{"......", "......", "......", "CCCCCC", "CCCCCC", "CCCCCC"}, new TheSquareDivTwo().solve(new String[]{"...CCC", "...CCC", "...CCC", "CCC...", "CCC...", "CCC..."})));
    System.out.println(Arrays.equals(new String[]{".....C", "....CC", "...CCC", "..CCCC", ".CCCCC", "CCCCCC"}, new TheSquareDivTwo().solve(new String[]{".....C", "....CC", "...CCC", "..CCCC", ".CCCCC", "CCCCCC"})));
    System.out.println(Arrays.equals(new String[]{"...............", "...............", "...............", "...............", "...............", ".........C..C..", ".........C.CC..", ".C....C.CCCCC.C", ".C.C.CC.CCCCCCC", "CCCC.CC.CCCCCCC", "CCCC.CCCCCCCCCC", "CCCCCCCCCCCCCCC", "CCCCCCCCCCCCCCC", "CCCCCCCCCCCCCCC", "CCCCCCCCCCCCCCC"},
        new TheSquareDivTwo().solve(new String[]{"C.C..C.C..C..C.", "CCC...C..CCC.C.", "......CC...CCCC", ".C..CC.C.C.C.C.", "C....C.C......C", ".....C..CCCCC.C", "CCC.......CCCCC", "..C.C..C.C...C.", "CCC....CCC.CC..", "CC.CCCC.CCCC...", ".C..C.CC.C.CC.C", "C.CCCC..CC..C.C", ".CCCC.CCCCCC...", "..C...C.CCC.CC.", "CCCC..CCC.C...."})));
  }
}
