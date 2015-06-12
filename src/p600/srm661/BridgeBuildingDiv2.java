package p600.srm661;

import utils.ExampleRunner;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by smalex on 11/06/15.
 */
public class BridgeBuildingDiv2 {
  private int ans = Integer.MAX_VALUE;
  private int N;

  public int minDiameter(int[] a, int[] b, int K) {
    N = a.length + 1;
    int[][] grid = new int[2 * N][2 * N];
    for (int i = 0; i < grid.length; i++) {
      Arrays.fill(grid[i], -1);
    }
    for (int i = 0; i < a.length; i++) {
      grid[i][i + 1] = a[i];
      grid[i + 1][i] = a[i];
      grid[i + N][i + 1 + N] = b[i];
      grid[i + 1 + N][i + N] = b[i];
    }

    int[] connections = new int[N];
    dfs(grid, connections, 0, 0, K);
    return ans;
  }

  private int getShortestPath(int[][] grid, int[] connections) {
    for (int i = 0; i < connections.length; i++) {
      int connection = connections[i];
      if (connection == 1) {
        grid[i][i + N] = 0;
        grid[i + N][i] = 0;
      } else {
        grid[i][i + N] = -1;
        grid[i + N][i] = -1;
      }
    }

    int res = 0;
    for (int i = 0; i < N * 2; i++) {
      res = Math.max(res, bfs(grid, i));
    }
    return res;
  }

  private int bfs(int[][] grid, int i) {
    int res = 0;
    int[] costs = new int[N * 2];
    Arrays.fill(costs, Integer.MAX_VALUE);
    LinkedList<Integer> q = new LinkedList<Integer>();
    q.add(i);
    costs[i] = 0;
    while (!q.isEmpty()) {
      final Integer x = q.pop();
      for (int j = 0; j < grid[x].length; j++) {
        if (grid[x][j] >= 0 && costs[x] + grid[x][j] < costs[j]) {
          q.add(j);
          costs[j] = costs[x] + grid[x][j];
        }
      }
    }
    for (int cost : costs) {
      if (cost == Integer.MAX_VALUE) {
        return cost;
      }
      res = Math.max(res, cost);
    }
    return res;
  }

  private void dfs(int[][] grid, int[] connections, int x, int cost, int k) {
    if (cost == k) {
      ans = Math.min(ans, getShortestPath(grid, connections));
      return;
    }
    if (x == connections.length) {
      return;
    }
    connections[x] = 1;
    dfs(grid, connections, x + 1, cost + 1, k);
    connections[x] = 0;
    dfs(grid, connections, x + 1, cost, k);
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 6, new BridgeBuildingDiv2().minDiameter(new int[]{2, 1, 1, 1, 2}, new int[]{1, 9, 1, 9, 1}, 4));
    ExampleRunner.eq(2, 124, new BridgeBuildingDiv2().minDiameter(new int[]{50,10,15,31,20,23,7,48,5,50}, new int[]{2,5,1,8,3,2,16,11,9,1}, 3));
    ExampleRunner.eq(3, 54, new BridgeBuildingDiv2().minDiameter(new int[]{2,4,10,2,2,22,30,7,28}, new int[]{5,26,1,2,6,2,16,3,15}, 5));
  }
}
