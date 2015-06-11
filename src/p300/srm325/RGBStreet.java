package p300.srm325;

import utils.ExampleRunner;

/**
 * Created by smalex on 11/06/15.
 */
public class RGBStreet {
  int ans = Integer.MAX_VALUE;
  public int estimateCost(String[] houses) {
    final int N = houses.length;
    int[][] costGrid = new int[N][3];
    for (int i = 0; i < N; i++) {
      final String[] costs = houses[i].split("\\s+");
      costGrid[i][0] = Integer.parseInt(costs[0]);
      costGrid[i][1] = Integer.parseInt(costs[1]);
      costGrid[i][2] = Integer.parseInt(costs[2]);
    }
    for (int i = 0; i < 3; i++) {
      dfs(costGrid, i, 0, costGrid[0][i]);
    }
    return ans;
  }

  private void dfs(int[][] grid, int x, int pos, int cost) {
    if (pos == grid.length - 1) {
      ans = Math.min(ans, cost);
      return;
    }

    pos++;
    for (int i = 0; i < 3; i++) {
      if (i != x) {
        dfs(grid, i, pos, cost + grid[pos][i]);
      }
    }
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 3, new RGBStreet().estimateCost(new String[]{"1 100 100", "100 1 100", "100 100 1"}));
    ExampleRunner.eq(2, 102, new RGBStreet().estimateCost(new String[]{"1 100 100", "100 100 100", "1 100 100"}));
    ExampleRunner.eq(97, 33, new RGBStreet().estimateCost(new String[]{"2 3 1", "5 4 2", "4 3 1", "3 4 1", "5 4 1", "5 2 1", "4 1 1", "1 4 1", "2 1 2", "5 1 2", "3 3 2", "4 1 1", "4 1 2", "3 1 2", "4 2 1", "4 2 2", "2 3 2", "5 2 1", "2 3 2", "2 3 2"}));
    ExampleRunner.eq(98, 20, new RGBStreet().estimateCost(new String[]{"1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1", "1 1 1"}));
    ExampleRunner.eq(99, 1085, new RGBStreet().estimateCost(new String[]{"2 3 4", "20 20 30", "11 21 31", "12 22 32", "31 32 33", "111 112 113", "221 222 223", "331 332 113", "221 442 443", "1 2 3", "1 2 3", "1 2 3", "1 2 3", "1 2 3", "999 99 9", "999 99 9", "999 99 9", "999 99 9", "999 99 9", "999 99 9"}));
  }
}
