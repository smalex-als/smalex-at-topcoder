package p400.srm410;

import utils.ExampleRunner;

import java.util.Arrays;

/**
 * Created by smalex on 27/05/15.
 * with help
 */
public class AddElectricalWires {
  public int maxNewWires(String[] wires, int[] gridConnections) {
    final int N = wires.length;

    int alr = 0;
    boolean[][] grid = new boolean[N][N];
    for (int i = 0; i < wires.length; i++) {
      String wire = wires[i];
      for (int m = 0; m < wire.length(); m++) {
        if (wire.charAt(m) == '1') {
          grid[i][m] = true;
          grid[m][i] = true;
          alr++;
        }
      }
    }

    int[] comps = new int[gridConnections.length];
    boolean[] got = new boolean[N];
    for (int i = 0; i < gridConnections.length; i++) {
      comps[i] = dfs(grid, gridConnections[i], N, got);
    }

    Arrays.sort(comps);
    for (int i = 0; i < N; ++i) {
      comps[comps.length - 1] += dfs(grid, i, N, got);
    }

    int res = -alr;
    for (Integer x : comps) {
      res += x * (x - 1);
    }
    return res / 2;
  }

  private int dfs(boolean[][] grid, int s, int N, boolean[] got) {
    if (got[s]) {
      return 0;
    }
    got[s] = true;
    int r = 1;
    for (int i = 0; i < N; i++) {
      if (grid[s][i]) {
        r += dfs(grid, i, N, got);
      }
    }
    return r;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 3, new AddElectricalWires().maxNewWires(new String[]{"000", "000", "000"}, new int[]{0}));
    ExampleRunner.eq(2, 1, new AddElectricalWires().maxNewWires(new String[]{"000", "000", "000"}, new int[]{0, 1}));
    ExampleRunner.eq(3, 0, new AddElectricalWires().maxNewWires(new String[]{"01", "10"}, new int[]{0}));
    ExampleRunner.eq(4, 0, new AddElectricalWires().maxNewWires(new String[]{"00000", "00000", "00000", "00000", "00000"}, new int[]{0, 1, 2, 3, 4}));
    ExampleRunner.eq(5, 3, new AddElectricalWires().maxNewWires(new String[]{"01000", "10100", "01010", "00100", "00000"}, new int[]{2, 4}));
  }
}
