package p500.srm530;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 1/20/12
 * Time: 5:30 AM
 */
public class GogoXCake {
  public String solve(String[] inCake, String[] inCutter) {
    boolean[][] cake = conv(inCake, false);
    boolean[][] cutter = conv(inCutter, true);
    dump(cake);
    dump(cutter);
    int W = cake.length - cutter.length;
    int H = cake[0].length - cutter[0].length;
    boolean cont = false;
    while (true)      {
      for (int j = 0; j <= W; j++) {
        for (int i = 0; i <= H; i++) {
          if (ok(cake, cutter, j, i)) {
            dump(cake);
            cont = true;
          }
        }
      }
      if (cont) {
        cont = false;
      } else {
        break;
      }
    }
    return hasEmpty(cake) ? "NO" : "YES";
  }

  private boolean hasEmpty(boolean[][] cake) {
    for (boolean[] row : cake) {
      for (int i = 0; i < cake[0].length; i++) {
        if (!row[i]) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean ok(boolean[][] cake, boolean[][] cutter, int y, int x) {
    for (int j = 0; j < cutter.length; j++) {
      for (int i = 0; i < cutter[0].length; i++) {
        if (cutter[j][i]) {
          if (cake[j + y][i + x]) {
            return false;
          }
        }
      }
    }

    // mark as used
    for (int j = 0; j < cutter.length; j++) {
      for (int i = 0; i < cutter[0].length; i++) {
        if (cutter[j][i]) {
          cake[j + y][i + x] = true;
        }
      }
    }
    return true;
  }

  private boolean[][] conv(String[] cake, boolean invert) {
    boolean[][] c = new boolean[cake.length][cake[0].length()];
    for (int j = 0; j < cake.length; j++) {
      for (int i = 0; i < cake[0].length(); i++) {
        c[j][i] = cake[j].charAt(i) == 'X';
        if (invert) {
          c[j][i] = !c[j][i];
        }
      }
    }
    return c;
  }

  private void dump(boolean[][] c) {
//    for (boolean[] booleans : c) {
//      System.out.println(Arrays.toString(booleans));
//    }
  }

  public static void main(String[] args) {
    System.out.println("YES".equals(new GogoXCake().solve(new String[]{"X.X", "...", "...", "X.X"}, new String[]{".X", "..", "X."})));
    System.out.println("NO".equals(new GogoXCake().solve(new String[]{"..XX", "...X", "X...", "XX.."}, new String[]{"..", ".."})));
  }
}
