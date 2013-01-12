package p400.srm458;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 14.01.2010
 * Time: 19:01:56
 */
public class Desertification {
  private int[][] dir = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
  private int H;
  private int W;

  public int desertArea(String[] island, int T) {
    H = island.length;
    W = island[0].length();
    char[][] map = new char[H][W];
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        map[i][j] = island[i].charAt(j);
      }
    }

    int prev = countDesert(map);
    for (int i = 0; i < T; i++) {
      map = oneYear(map);
      final int newCount = countDesert(map);
      if (prev == newCount) {
        // no more changes
        break;
      }
      prev = newCount;
//      System.out.println("year " + i + " count " + newCount);
    }

    return countDesert(map);
  }

  private char[][] oneYear(char[][] island) {
    char[][] result = new char[H][W];
    for (int i = 0; i < H; i++) {
      System.arraycopy(island[i], 0, result[i], 0, W);
    }
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (island[i][j] == 'D') {
          markAsDesert(result, i, j);
        }
      }
    }
    return result;
  }

  private void markAsDesert(char[][] result, int i, int j) {
    for (int[] x : dir) {
      final int nx = x[0] + i;
      final int ny = x[1] + j;
      if (nx >= 0 && nx < H
          && ny >= 0 && ny < W) {
        result[nx][ny] = 'D';
      }
    }
  }

  private int countDesert(char[][] island) {
    int result = 0;
    for (char[] row : island) {
      for (char c : row) {
        if (c == 'D') {
          result++;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(5 == new Desertification().desertArea(new String[]{"FFF", "FDF", "FFF"}, 1));
    System.out.println(0 == new Desertification().desertArea(new String[]{"FFFFFF", "FFFFFF", "FFFFFF", "FFFFFF"}, 1000000000));
    System.out.println(100 == new Desertification().desertArea(new String[]{"FFFFFDFFFF", "FDFDFFFFFF", "FFFFFFFFFD", "FFFFFFFFFF", "DDFFFFFFFF", "FFFFFFFFFD", "FFFFFFFFFF", "FFFFFFFDFF", "FFFFFFFDFF", "FFFFDDFFFF"}, 98765432));
    System.out.println(8 == new Desertification().desertArea(new String[]{"D", "F", "F", "F", "F", "F", "F", "F", "F", "F"}, 7));
  }
}
