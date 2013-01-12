package p400.srm496;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 01.02.11
 * Time: 15:19
 */
public class ColoredStrokes {
  private int lastIndex = 0;

  public int getLeast(String[] picture) {
    innerCount(picture, 'B', 0, 1);
    innerCount(picture, 'R', 1, 0);
    return lastIndex;
  }

  private void innerCount(String[] picture, char color, int dx, int dy) {
    int[][] map = new int[picture.length][picture[0].length()];
    int[][] mapNumered = new int[picture.length][picture[0].length()];
    for (int y = 0; y < picture.length; y++) {
      String s = picture[y];
      for (int x = 0; x < s.length(); x++) {
        map[y][x] = s.charAt(x);
      }
    }
    for (int y = 0; y < map.length; y++) {
      for (int x = 0; x < map[y].length; x++) {
        if ((map[y][x] == color || map[y][x] == 'G') && mapNumered[y][x] == 0) {
          setNumbers(map, mapNumered, color, x, y, dx, dy);
        }
      }
    }
  }

  private void setNumbers(int[][] map, int[][] mapNumered, char color, int x, int y, int dx, int dy) {
    lastIndex++;
    mapNumered[y][x] = lastIndex;
    while (y + dy < map.length && x + dx < map[0].length) {
      y += dy;
      x += dx;
      if (map[y][x] != color && map[y][x] != 'G') {
        break;
      }
      mapNumered[y][x] = lastIndex;
    }
  }

  public static void main(String[] args) {
    System.out.println(0 == new ColoredStrokes().getLeast(new String[]{"...", "..."}));
    System.out.println(1 == new ColoredStrokes().getLeast(new String[]{"..B.", "..B."}));
    System.out.println(2 == new ColoredStrokes().getLeast(new String[]{"..R.", "..R."}));
    System.out.println(2 == new ColoredStrokes().getLeast(new String[]{".RRR", ".RR."}));
    System.out.println(2 == new ColoredStrokes().getLeast(new String[]{"..GR", "..B."}));
  }
}
