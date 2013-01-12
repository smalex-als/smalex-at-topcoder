package algo;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 18.01.11
 * Time: 7:17
 */
public class Sudoku {
  private int call;

  public String[] solveSudoku(String[] sudoku) {
    int[][] map = toMap(sudoku);
    if (solve(map)) {
      System.out.println("call = " + call);
      return toStrings(map);
    }
    return new String[0];
  }

  private boolean solve(int[][] map) {
    int[] yx = find(map);
    if (yx == null) {
      return true;
    }
    int y = yx[0];
    int x = yx[1];
    for (int i = 1; i <= 9; i++) {
      map[y][x] = i;
      if (isCorrect(y, x, map) && solve(map)) {
        return true;
      }
      map[y][x] = 0;
    }
    return false;
  }

  private int[] find(int[][] map) {
    for (int i = 0; i < map.length; i++) {
      int[] row = map[i];
      for (int j = 0; j < row.length; j++) {
        if (row[j] == 0) {
          return new int[]{i, j};
        }
      }
    }
    return null;
  }

  private boolean isCorrect(int y, int x, int[][] map) {
    call++;
    int[] h = new int[10];
    for (int i = 0; i < 9; i++) {
      final int col = map[y][i];
      if (col > 0) {
        if (h[col] > 0) {
          return false;
        }
        h[col]++;
      }
    }

    int[] v = new int[10];
    for (int i = 0; i < 9; i++) {
      final int col = map[i][x];
      if (col > 0) {
        if (v[col] > 0) {
          return false;
        }
        v[col]++;
      }
    }
    final int offsetY = y / 3 * 3;
    final int offsetX = x / 3 * 3;
    int[] square = new int[10];
    for (int j = 0; j < 3; j++) {
      for (int i = 0; i < 3; i++) {
        int c = map[offsetY + j][offsetX + i];
        if (c > 0) {
          if (square[c] > 0) {
            return false;
          }
          square[c]++;
        }
      }
    }

    return true;
  }

  private int[][] toMap(String[] sudoku) {
    int[][] map = new int[9][9];
    for (int i = 0; i < sudoku.length; i++) {
      for (int j = 0; j < sudoku[i].length(); j++) {
        map[i][j] = (int) sudoku[i].charAt(j) - (int) '0';
      }
    }
    return map;
  }

  private String[] toStrings(int[][] map) {
    String[] solvedSudoku = new String[map.length];
    for (int i = 0; i < map.length; i++) {
      StringBuilder row = new StringBuilder();
      for (int col : map[i]) {
        row.append(col);
      }
      solvedSudoku[i] = row.toString();
    }
    return solvedSudoku;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(new Sudoku().solveSudoku(new String[]{
        "158000430",
        "037005000",
        "096700001",
        "709050002",
        "000901000",
        "300060109",
        "500009740",
        "000400910",
        "074000823"
    })));
    System.out.println(Arrays.toString(new Sudoku().solveSudoku(new String[]{
        "370006000",
        "500003200",
        "000581070",
        "609100823",
        "700000006",
        "183004507",
        "030679000",
        "006800002",
        "000300019",
    })));
  }
}
