package p500.srm505;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 5/3/11
 * Time: 3:57 PM
 */
public class RectangleArea {
  public int minimumQueries(String[] known) {
    boolean[][] map = new boolean[known.length][known[0].length()];
    for (int i = 0; i < known.length; i++) {
      String row = known[i];
      for (int j = 0; j < row.length(); j++) {
        map[i][j] = row.charAt(j) == 'Y';
      }
    }

    if (map.length == 1) {
      return map[0].length;
    }
    if (map[0].length == 1) {
      return map.length;
    }
    int max = map.length * map[0].length;

    int result = 0;
    for (int i = 0; i < map.length; i++) {
      int cnt = getRowSum(map, i);
      System.out.println("cnt = " + cnt);
      if (cnt < 2) {
        int needCnt = 2 - cnt;
        for (int k = 0; k < needCnt; k++) {
          result++;
          int minIndex = 0;
          int minValue = getColumnSum(map, 0);
          for (int j = 0; j < map[0].length; j++) {
            int v = getColumnSum(map, j);
            if (v < minValue) {
              minValue = v;
              minIndex = j;
            }
          }
          fixColumn(map, minIndex);
        }
      }
    }
    System.out.println("result = " + result);
    if (result == max) {
      return result - 1;
    }
    return result;
  }

  private void fixColumn(boolean[][] map, int minIndex) {
    for (int j = 0; j < map.length; j++) {
      if (!map[j][minIndex]) {
        map[j][minIndex] = true;
        return;
      }
    }
  }

  public int getColumnSum(boolean[][] map, int x) {
    int cnt = 0;
    for (boolean[] aMap : map) {
      if (aMap[x]) {
        cnt++;
      }
    }
    return cnt;
  }

  public int getRowSum(boolean[][] map, int x) {
    int cnt = 0;
    for (int i = 0; i < map[0].length; i++) {
      if (map[x][i]) {
        cnt++;
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
//    System.out.println(3 == new RectangleArea().minimumQueries(new String[]{"NN", "NN"}));
//    System.out.println(1 == new RectangleArea().minimumQueries(new String[]{"YNY", "NYN", "YNY"}));
//    System.out.println(0 == new RectangleArea().minimumQueries(new String[]{"YY", "YY", "YY", "YY"}));
    System.out.println(10 == new RectangleArea().minimumQueries(new String[]{"NNNNNNNNNN"}));
    System.out.println(4 == new RectangleArea().minimumQueries(new String[]{"N", "N", "N", "N"}));
    System.out.println(4 == new RectangleArea().minimumQueries(new String[]{"NN", "NN", "NN", "NN"}));
//    System.out.println(2 == new RectangleArea().minimumQueries(new String[]{"NNYYYNN", "NNNNNYN", "YYNNNNY", "NNNYNNN", "YYNNNNY"}));
  }
}
