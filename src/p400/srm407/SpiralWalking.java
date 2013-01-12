// BEGIN CUT HERE
package p400.srm407;

import static utils.ExampleRunner.eq;

// END CUT HERE

public class SpiralWalking {
  private int height;
  private int width;

  public int totalPoints(String[] levelMap) {
    height = levelMap.length;
    width = levelMap[0].length();

    boolean[][] visited = new boolean[height][width];
    int cnt = height * width;
    int res = 0;
    int cy = 0, cx = -1;

    int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    while (cnt > 0) {
      for (int[] d : directions) {
        while (isOK(visited, cy + d[0], cx + d[1])) {
          cx += d[1];
          cy += d[0];
          visited[cy][cx] = true;
          cnt--;
          if (isOK(visited, cy + d[0], cx + d[1]) || isLastCell(cnt)) {
            res += (int) levelMap[cy].charAt(cx) - (int) '0';
          }
        }
      }
    }
    return res;
  }

  private boolean isLastCell(int cnt) {
    return cnt == 0;
  }

  private boolean isOK(boolean[][] map, int ny, int nx) {
    return nx >= 0 && nx < width
        && ny >= 0 && ny < height && !map[ny][nx];
  }

  // BEGIN CUT HERE
  public static void main(String[] args) {
    try {
      eq(0, (new SpiralWalking()).totalPoints(new String[]{"111",
                                                           "111",
                                                           "111"}), 5);
      eq(1, (new SpiralWalking()).totalPoints(new String[]{"101",
                                                           "110"}), 3);
      eq(2, (new SpiralWalking()).totalPoints(new String[]{"00",
                                                           "10"}), 1);
      eq(3, (new SpiralWalking()).totalPoints(new String[]{"86850",
                                                           "76439",
                                                           "15863",
                                                           "24568",
                                                           "45679",
                                                           "71452",
                                                           "05483"}), 142);
    } catch (Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
// END CUT HERE
}
