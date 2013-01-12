// BEGIN CUT HERE
package p400.srm406;

import static utils.ExampleRunner.eq;

// END CUT HERE

public class HappyCells {
  public int[] getHappy(String[] grid) {
    int[] res = new int[3];
    for (int y = 0; y < grid.length; y++) {
      final String row = grid[y];
      for (int x = 0; x < row.length(); x++) {
        if (row.charAt(x) == '.') {
          final int dialonalOK = isDialonalOK(x, y, grid);
          final int orthogonalOK = isOrthogonalOK(x, y, grid);
          if (dialonalOK == 0 && orthogonalOK == 0) res[0]++;
          if (dialonalOK > 0 && orthogonalOK == 0) res[1]++;
          if (dialonalOK == 0 && orthogonalOK > 0) res[2]++;
        }
      }
    }
    return res;
  }

  private int isDialonalOK(int x, int y, String[] grid) {
    return isOK(x, y, 1, 1, grid)
        + isOK(x, y, -1, 1, grid)
        + isOK(x, y, -1, -1, grid)
        + isOK(x, y, 1, -1, grid);
  }

  private int isOrthogonalOK(int x, int y, String[] grid) {
    return isOK(x, y, 0, 1, grid)
        + isOK(x, y, 0, -1, grid)
        + isOK(x, y, 1, 0, grid)
        + isOK(x, y, -1, 0, grid);
  }

  private int isOK(int x, int y, int dX, int dY, String[] grid) {
    if (y + dY >= 0 && x + dX >= 0 && y + dY < grid.length && x + dX < grid[y + dY].length()) {
      return grid[y + dY].charAt(x + dX) == '.' ? 1 : 0;
    }
    return 0;
  }

  // BEGIN CUT HERE
  public static void main(String[] args) {
    try {
      eq(0, (new HappyCells()).getHappy(new String[]{
          "XXX",
          "X.X",
          "XXX"
      }), new int[]{1, 0, 0});
      eq(1, (new HappyCells()).getHappy(new String[]{"."}), new int[]{1, 0, 0});
      eq(2, (new HappyCells()).getHappy(new String[]{
          "XXXXXX",
          "X.XXXX",
          "XXX.XX",
          "X..XXX",
          "XXXXXX"
      }), new int[]{1, 1, 1});
      eq(3, (new HappyCells()).getHappy(new String[]{"..."}), new int[]{0, 0, 3});
      eq(4, (new HappyCells()).getHappy(new String[]{
          "....XX.XX......XXXXX.XXXXX..X.XX.XXXX.X.X.XXX..XX.",
          "XX.X...X..XXX.XX.X.X......X.XX.X....X.XX..X.....XX",
          "X.X..X.XX...X...XXXX..XX.X..XX....XX.XX.X...X.X.X.",
          "..XX..X.XXX.XXXX..X.X.X...XXX.X..XX....X.XX..X....",
          "..XXX..XXXXX.X..XXX...XXX...X..XXX.X....X....X..X.",
          "XX.XXX.X...X...X...XX..........XX..X..X...XX.X..XX",
          "XX.XX.X.X...XX.XX....X...XXX..XX.X..X.XXX.X...XXX.",
          "...XXXX......X..XX.XX.X..XXXX.XX.X..X.X.XXX.X.X.X.",
          "..XX.XX.X.XX.X.X....X..X.XX..X..XXXX.X.XX.....XX.X",
          "X...X....X....X..XXX.X.XX....XXX.X..XXXX..XXXX.X..",
          ".XX.XXX.......X.X...X.XXXXX....X.XX..X..X.X...XX..",
          "..X..XX..XXX.X..XXXX.X..X.XX.X...X.X.X.X..X..XX.X.",
          "X.XXX..XX.XX.X..X.X.X...X.X.X.XXX..XX..X.X..XXX..X",
          "XXXXXX.XXX...XX.XXX..XXXXXXXX..X......XXX.XXX.....",
          "X..X.XXX...XX.X...X...X.XXXXX..X....XX.XX.X....X.X",
          "..X.X....X...XXX...XXXXX...XX.X..XXX.XX..X...X.XX.",
          ".....X.XX.XXX..XXX..XXX..X.X.XXXXXX...X..XXXXXXX.X",
          "X...XX.XX.X...X.XX.XX.XXXX.XXX.X..X.XXXXXX........",
          "..X.X.XX....X....XX.XX.X.XX.XX...XXXXXX.....XX.X..",
          "XXX...X..XXX.X.XX.X.X.XXX...X..XX........XX..XX...",
          ".XX.XXXX.X.....X.XXXXX.XX..X.X.XXXX.XX.XXX..XXXX..",
          "XXX...XXXXXXX..XXX.X.XXX.X...X.X.XXX.X..X.X..X.XX.",
          ".XXX.XX.X.XXXX.XX.XXXXX.XX....X.XX..X.X..X.X.....X",
          "XX.XXXX.X......X..X...X....X..X....XXX..X..XX..X..",
          "XX..X.X.X..X.XX..X...X..XX.X.X.XXX.X.XX.XXX.X....X",
          ".X.X....XXX...X....XXX........XX.XX.XX..XXX.X.....",
          "X....XXX.XXX.X.XX.XX.X.X...XXX......XX.XX.XXX..XXX",
          ".X.X..XX..XX..X.X....XX.XXXXX..X...X.XXXXX.XX..XXX",
          ".XXXXXX.X.XX.XXXXX....XX.X.XXX.X..X..XX.X..XXX.X..",
          "..X...XX.XXX.X...X.X..XX.X.X.XXXXX.X.X.XXXXXX..XXX",
          "X.X..X.X.XX.XXX...XX.XX..XXXXXXX..XXX.X..XXXXXXX.X",
          "X..XXX.X.X.X..X..XXXX.XXX.XXXX...XXXXXXX.X.X.X...X",
          "X...XXX...XXXX..X.XX......X.X.X.X.X..XXXXX......X.",
          ".X..XX....X.X.XX.XX.XX...X.XXX.X....X.....X.XX..X.",
          "X..XX.XXX...X....X..X..XX.X.XXXX.XX.XX.XXXX......X",
          "XX..X.XXXX....XX..XX.XX..........XX...XXXX....X.X.",
          ".......XXXXX..XXX....X.X...X.....X.X.X.XXXX..XX..X",
          "........X.XX.....X..XX...XX...XXXXX.XX.XX.X.XXX..X",
          "X.XXXXXX....XXXX.XXXXX....X.X...XX.......X...X.X.X",
          ".X...XXX..X.XXXX..X.XXX..XX.XXX.X...X.....XXX..XX.",
          "X.X..XXXX...XXX..X...X.......XXXX.X.X.XXXXXXXXX..X",
          "....X.X......XX.X.XX..X.X.X.XX..X..X.X...XX..XXXXX",
          "X.XXXX..XXX.X.XXXXXXX.X.X.XX.XX.XX.X.X.XX....X..X.",
          ".XXXX......XXX.X..X....X....X.XX...X..X...XXXX..XX",
          ".XXX..XXXXX..XXX...XX...X.X..XX...XX.X..X..X..XXX.",
          "X.XX.XX..XXXXX.X.XXXXX.X...XX..X.XXX...XX.X.XX...X",
          "..XX..XXXXXX.X.XXXX...X.X.XXXXXXXX..XX.XXXX.X.XXX.",
          ".XXX....X..X..XX......X...X.X.....XXX..X.XX...X...",
          "...X..XX..XX.XXXX..X.XX.X.X.X..X.X........XXXXXXXX",
          "XXXX.X..XXXX.X.X.X..X.X.XXX...X.XXXXXXX.X..XXXX..."}), new int[]{9, 72, 83});
    } catch (Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
// END CUT HERE
}
