package p600.srm661;

import utils.ExampleRunner;

/**
 * Created by smalex on 11/06/15.
 */
public class FallingSand {
  public String[] simulate(String[] board) {
    final int N = board.length;
    final int MX = board[0].length();
    int[][] grid = toGrid(board, N, MX);
    for (int i = 0; i < N; i++) {
      for (int j = MX - 1; j >= 0; j--) {
        if (grid[i][j] == 1) {
          for (int k = i; k < N - 1; k++) {
            if (grid[k + 1][j] == 0) {
              grid[k][j] = 0;
              grid[k + 1][j] = 1;
            } else {
              break;
            }
          }
        }
      }
    }
    return toStrings(N, MX, grid);
  }

  private String[] toStrings(int n, int MX, int[][] grid) {
    String[] res = new String[n];
    for (int i = 0; i < n; i++) {
      res[i] = "";
      for (int j = 0; j < MX; j++) {
        res[i] += grid[i][j] == 1 ? 'o' : grid[i][j] == 2 ? 'x' : '.';
      }
    }
    return res;
  }

  private int[][] toGrid(String[] board, int n, int MX) {
    int[][] grid = new int[n][MX];
    for (int i = 0; i < n; i++) {
      String s = board[i];
      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(j) == 'o') {
          grid[i][j] = 1;
        } else if (s.charAt(j) == 'x') {
          grid[i][j] = 2;
        }
      }
    }
    return grid;
  }

  public static void main(String[] args) {
    final String[] res = new FallingSand().simulate(new String[]{"ooooo", "..x..", "....x", ".....", "....o"});
    ExampleRunner.eq(1, new String[]{"..o..", "..x.o", "....x", ".....", "oo.oo" }, res);
  }
}
