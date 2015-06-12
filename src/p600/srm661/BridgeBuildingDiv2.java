package p600.srm661;

import utils.ExampleRunner;

import java.util.Arrays;
import java.util.PriorityQueue;

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

    for (int i = 0; i < (1 << N); i++) {
      if (Integer.bitCount(i) != K) {
        continue;
      }
      for (int j = 0; j < N; j++) {
        final int cost = (i & 1 << j) != 0 ? 0 : -1;
        grid[j][j + N] = cost;
        grid[j + N][j] = cost;
      }

      int max = 0;
      for (int j = 0; j < N * 2; j++) {
        max = Math.max(max, bfs(grid, j));
      }
      ans = Math.min(ans, max);
    }
    return ans;
  }

  private static class Point implements Comparable<Point> {
    private int x;
    private int cost;

    public Point(int x, int cost) {
      this.x = x;
      this.cost = cost;
    }

    @Override
    public int compareTo(Point o) {
      return Integer.compare(cost, o.cost);
    }

    @Override
    public String toString() {
      return "Point{" +
          "x=" + x +
          ", cost=" + cost +
          '}';
    }
  }

  private int bfs(int[][] grid, int i) {
    int res = 0;
    int[] costs = new int[N * 2];
    Arrays.fill(costs, Integer.MAX_VALUE);
    PriorityQueue<Point> q = new PriorityQueue<Point>();
    q.add(new Point(i, 0));
    costs[i] = 0;
    while (!q.isEmpty()) {
      final Point cur = q.poll();
      final Integer x = cur.x;
      if (costs[cur.x] < cur.cost) {
        // better solutions exists
        continue;
      }
      for (int j = 0; j < grid[x].length; j++) {
        if (grid[x][j] >= 0) {
          final int newcost = costs[x] + grid[x][j];
          if (newcost < costs[j]) {
            final Point e = new Point(j, newcost);
            q.add(e);
            costs[j] = newcost;
          }
        }
      }
    }
    for (int cost : costs) {
      res = Math.max(res, cost);
    }
    return res;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 6, new BridgeBuildingDiv2().minDiameter(new int[]{2, 1, 1, 1, 2}, new int[]{1, 9, 1, 9, 1}, 4));
    ExampleRunner.eq(2, 8, new BridgeBuildingDiv2().minDiameter(new int[]{1, 50, 1, 50, 1, 50, 1, 50}, new int[]{50, 1, 50, 1, 50, 1, 50, 1}, 9));
    ExampleRunner.eq(3, 124, new BridgeBuildingDiv2().minDiameter(new int[]{50, 10, 15, 31, 20, 23, 7, 48, 5, 50}, new int[]{2, 5, 1, 8, 3, 2, 16, 11, 9, 1}, 3));
    ExampleRunner.eq(4, 54, new BridgeBuildingDiv2().minDiameter(new int[]{2, 4, 10, 2, 2, 22, 30, 7, 28}, new int[]{5, 26, 1, 2, 6, 2, 16, 3, 15}, 5));
    ExampleRunner.eq(5, 52, new BridgeBuildingDiv2().minDiameter(new int[]{1, 4, 7, 3, 24, 39}, new int[]{5, 11, 37, 11, 1, 26}, 3));
    ExampleRunner.eq(6, 56, new BridgeBuildingDiv2().minDiameter(new int[]{34, 14, 9, 2, 6}, new int[]{25, 30, 2, 22, 23}, 5));
    ExampleRunner.eq(7, 63, new BridgeBuildingDiv2().minDiameter(new int[]{3, 40, 33, 3, 7, 1, 10, 35, 1}, new int[]{1, 15, 6, 1, 2, 19, 11, 1, 27}, 4));
    ExampleRunner.eq(8, 63, new BridgeBuildingDiv2().minDiameter(new int[]{1, 24, 2, 36, 16}, new int[]{10, 23, 7, 29, 4}, 4));
    ExampleRunner.eq(9, 53, new BridgeBuildingDiv2().minDiameter(new int[]{2, 1, 16, 35, 1, 9, 1, 5}, new int[]{30, 2, 1, 21, 8, 13, 3, 1}, 3));
    ExampleRunner.eq(10, 74, new BridgeBuildingDiv2().minDiameter(new int[]{4, 1, 6, 1, 1, 4, 36, 5, 2}, new int[]{46, 11, 8, 8, 13, 1, 8, 1, 2}, 2));
    ExampleRunner.eq(11, 126, new BridgeBuildingDiv2().minDiameter(new int[]{2, 2, 38, 37, 8, 1, 42, 4}, new int[]{1, 12, 1, 4, 8, 16, 41, 39}, 2));
    ExampleRunner.eq(12, 73, new BridgeBuildingDiv2().minDiameter(new int[]{13, 28, 19, 2, 19, 6, 13}, new int[]{5, 1, 2, 2, 1, 11, 28}, 2));
    ExampleRunner.eq(13, 55, new BridgeBuildingDiv2().minDiameter(new int[]{7, 1, 1, 36}, new int[]{20, 20, 7, 19}, 2));
    ExampleRunner.eq(14, 59, new BridgeBuildingDiv2().minDiameter(new int[]{3, 4, 8, 1, 4, 1, 23, 4}, new int[]{8, 18, 2, 27, 2, 6, 1, 11}, 2));
    ExampleRunner.eq(15, 83, new BridgeBuildingDiv2().minDiameter(new int[]{2, 31, 10, 9, 2, 3, 47, 16, 12}, new int[]{1, 27, 23, 17, 3, 8, 14, 4, 46}, 6));
    ExampleRunner.eq(16, 68, new BridgeBuildingDiv2().minDiameter(new int[]{4, 4, 2, 2, 45, 4, 45, 1}, new int[]{4, 23, 2, 11, 17, 1, 1, 25}, 3));
    ExampleRunner.eq(17, 20, new BridgeBuildingDiv2().minDiameter(new int[]{2, 3, 31, 24, 1}, new int[]{23, 14, 1, 4, 30}, 5));
    ExampleRunner.eq(18, 28, new BridgeBuildingDiv2().minDiameter(new int[]{20, 2, 3, 1}, new int[]{7, 39, 1, 5}, 2));
    ExampleRunner.eq(19, 60, new BridgeBuildingDiv2().minDiameter(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, new int[]{20, 18, 16, 14, 12, 10, 8, 6, 4, 2}, 11));
    ExampleRunner.eq(20, 57, new BridgeBuildingDiv2().minDiameter(new int[]{4, 25, 22, 45, 2}, new int[]{19, 45, 12, 12, 4}, 4));
    ExampleRunner.eq(21, 107, new BridgeBuildingDiv2().minDiameter(new int[]{36, 36, 22, 12, 14, 14, 6}, new int[]{43, 10, 41, 20, 21, 1, 5}, 5));
    ExampleRunner.eq(22, 184, new BridgeBuildingDiv2().minDiameter(new int[]{34, 22, 34, 4, 6, 46, 45}, new int[]{30, 2, 43, 49, 31, 6, 21}, 2));
    ExampleRunner.eq(23, 39, new BridgeBuildingDiv2().minDiameter(new int[]{11, 21, 7, 5, 14}, new int[]{10, 2, 36, 24, 26}, 5));
    ExampleRunner.eq(24, 70, new BridgeBuildingDiv2().minDiameter(new int[]{9, 37, 1, 22}, new int[]{28, 32, 1, 23}, 2));
    ExampleRunner.eq(25, 73, new BridgeBuildingDiv2().minDiameter(new int[]{22, 26, 16, 4}, new int[]{5, 38, 26, 13}, 2));
    ExampleRunner.eq(26, 231, new BridgeBuildingDiv2().minDiameter(new int[]{6, 37, 35, 41, 19, 32, 13, 41, 6}, new int[]{26, 50, 3, 19, 19, 22, 39, 40, 23}, 2));
    ExampleRunner.eq(27, 101, new BridgeBuildingDiv2().minDiameter(new int[]{45, 35, 36, 33}, new int[]{4, 27, 12, 13}, 2));
    ExampleRunner.eq(28, 78, new BridgeBuildingDiv2().minDiameter(new int[]{12, 26, 2, 9, 12, 4, 5, 3}, new int[]{33, 7, 19, 47, 5, 13, 41, 4}, 3));
    ExampleRunner.eq(29, 125, new BridgeBuildingDiv2().minDiameter(new int[]{33, 13, 31, 23, 22}, new int[]{36, 29, 17, 22, 34}, 2));
    ExampleRunner.eq(30, 114, new BridgeBuildingDiv2().minDiameter(new int[]{23, 16, 4, 29, 35}, new int[]{45, 25, 29, 25, 2}, 2));
    ExampleRunner.eq(31, 98, new BridgeBuildingDiv2().minDiameter(new int[]{11, 46, 16, 16, 14}, new int[]{30, 33, 36, 23, 22}, 4));
    ExampleRunner.eq(32, 87, new BridgeBuildingDiv2().minDiameter(new int[]{6, 8, 15, 48}, new int[]{33, 36, 4, 34}, 2));
    ExampleRunner.eq(33, 105, new BridgeBuildingDiv2().minDiameter(new int[]{21, 27, 38, 43, 4, 19, 19}, new int[]{4, 9, 15, 23, 9, 3, 38}, 3));
    ExampleRunner.eq(34, 150, new BridgeBuildingDiv2().minDiameter(new int[]{18, 9, 15, 33, 43, 43, 19, 12, 29}, new int[]{15, 34, 24, 17, 17, 36, 7, 13, 18}, 4));
    ExampleRunner.eq(35, 90, new BridgeBuildingDiv2().minDiameter(new int[]{11, 40, 23, 1, 9, 36}, new int[]{3, 20, 6, 8, 12, 25}, 2));
    ExampleRunner.eq(36, 117, new BridgeBuildingDiv2().minDiameter(new int[]{7, 22, 13, 45, 13, 37, 17}, new int[]{28, 37, 50, 19, 20, 11, 48}, 5));
    ExampleRunner.eq(37, 124, new BridgeBuildingDiv2().minDiameter(new int[]{50, 10, 15, 31, 20, 23, 7, 48, 5, 50}, new int[]{2, 5, 1, 8, 3, 2, 16, 11, 9, 1}, 3));
    ExampleRunner.eq(38, 24, new BridgeBuildingDiv2().minDiameter(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 1, 2}, new int[]{3, 4, 2, 1, 3, 4, 5, 2, 1, 1}, 7));
  }
}
