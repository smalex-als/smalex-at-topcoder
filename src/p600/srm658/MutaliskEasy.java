package p600.srm658;

import utils.ExampleRunner;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by smalex on 07/06/15.
 */
public class MutaliskEasy {
  private static class Point {
    int x;
    int y;
    int z;

    public Point(int x, int y, int z) {
      this.x = x;
      this.y = y;
      this.z = z;
    }
  }

  private int minimalAttacks(int[] x) {
    int[][] attacks = {{1, 3, 9}, {3, 1, 9}, {1, 9, 3}, {3, 9, 1}, {9, 3, 1}, {9, 1, 3}};
    LinkedList<Point> q = new LinkedList<Point>();
    final int starty = x.length > 1 ? x[1] : 0;
    final int startz = x.length > 2 ? x[2] : 0;
    q.add(new Point(x[0], starty, startz));
    int[][][] dp = new int[61][61][61];
    for (int[][] ints : dp) {
      for (int[] anInt : ints) {
        Arrays.fill(anInt, Integer.MAX_VALUE);
      }
    }
    dp[x[0]][starty][startz] = 0;
    while (!q.isEmpty()) {
      final Point pop = q.pop();
      final int cost = dp[pop.x][pop.y][pop.z];
      for (int[] attack : attacks) {
        int newx = Math.max(0, pop.x - attack[0]);
        int newy = Math.max(0, pop.y - attack[1]);
        int newz = Math.max(0, pop.z - attack[2]);
        if (dp[newx][newy][newz] > cost + 1) {
          q.add(new Point(newx, newy, newz));
          dp[newx][newy][newz] = cost + 1;
        }
      }
    }
    return dp[0][0][0];
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 2, new MutaliskEasy().minimalAttacks(new int[]{12, 10, 4}));
    ExampleRunner.eq(2, 6, new MutaliskEasy().minimalAttacks(new int[]{54, 18, 6}));
    ExampleRunner.eq(3, 13, new MutaliskEasy().minimalAttacks(new int[]{55, 60, 53}));
    ExampleRunner.eq(4, 1, new MutaliskEasy().minimalAttacks(new int[]{1, 1, 1}));
    ExampleRunner.eq(5, 9, new MutaliskEasy().minimalAttacks(new int[]{60, 40}));
    ExampleRunner.eq(6, 7, new MutaliskEasy().minimalAttacks(new int[]{60}));
    ExampleRunner.eq(7, 1, new MutaliskEasy().minimalAttacks(new int[]{1}));
    ExampleRunner.eq(8, 7, new MutaliskEasy().minimalAttacks(new int[]{60}));
    ExampleRunner.eq(9, 6, new MutaliskEasy().minimalAttacks(new int[]{51}));
    ExampleRunner.eq(10, 10, new MutaliskEasy().minimalAttacks(new int[]{16, 57, 52}));
    ExampleRunner.eq(11, 7, new MutaliskEasy().minimalAttacks(new int[]{55}));
    ExampleRunner.eq(12, 11, new MutaliskEasy().minimalAttacks(new int[]{52, 49, 38}));
    ExampleRunner.eq(13, 3, new MutaliskEasy().minimalAttacks(new int[]{3, 22}));
    ExampleRunner.eq(14, 9, new MutaliskEasy().minimalAttacks(new int[]{25, 33, 56}));
    ExampleRunner.eq(15, 2, new MutaliskEasy().minimalAttacks(new int[]{14}));
    ExampleRunner.eq(16, 6, new MutaliskEasy().minimalAttacks(new int[]{1, 40, 24}));
    ExampleRunner.eq(17, 3, new MutaliskEasy().minimalAttacks(new int[]{15, 13}));
    ExampleRunner.eq(18, 9, new MutaliskEasy().minimalAttacks(new int[]{45, 53}));
    ExampleRunner.eq(19, 3, new MutaliskEasy().minimalAttacks(new int[]{22}));
    ExampleRunner.eq(20, 7, new MutaliskEasy().minimalAttacks(new int[]{43, 32}));
    ExampleRunner.eq(21, 6, new MutaliskEasy().minimalAttacks(new int[]{37, 26}));
    ExampleRunner.eq(22, 1, new MutaliskEasy().minimalAttacks(new int[]{9}));
    ExampleRunner.eq(23, 6, new MutaliskEasy().minimalAttacks(new int[]{18, 46, 9}));
    ExampleRunner.eq(24, 4, new MutaliskEasy().minimalAttacks(new int[]{27, 17}));
    ExampleRunner.eq(25, 9, new MutaliskEasy().minimalAttacks(new int[]{31, 45, 27}));
    ExampleRunner.eq(26, 6, new MutaliskEasy().minimalAttacks(new int[]{50, 8}));
    ExampleRunner.eq(27, 8, new MutaliskEasy().minimalAttacks(new int[]{38, 49}));
    ExampleRunner.eq(28, 1, new MutaliskEasy().minimalAttacks(new int[]{9}));
    ExampleRunner.eq(29, 7, new MutaliskEasy().minimalAttacks(new int[]{37, 31}));
    ExampleRunner.eq(30, 4, new MutaliskEasy().minimalAttacks(new int[]{33}));
    ExampleRunner.eq(31, 4, new MutaliskEasy().minimalAttacks(new int[]{28}));
    ExampleRunner.eq(32, 7, new MutaliskEasy().minimalAttacks(new int[]{29, 9, 47}));
    ExampleRunner.eq(33, 1, new MutaliskEasy().minimalAttacks(new int[]{1}));
    ExampleRunner.eq(34, 5, new MutaliskEasy().minimalAttacks(new int[]{38}));
    ExampleRunner.eq(35, 4, new MutaliskEasy().minimalAttacks(new int[]{34}));
    ExampleRunner.eq(36, 8, new MutaliskEasy().minimalAttacks(new int[]{28, 20, 55}));
    ExampleRunner.eq(37, 7, new MutaliskEasy().minimalAttacks(new int[]{59, 8}));
    ExampleRunner.eq(38, 11, new MutaliskEasy().minimalAttacks(new int[]{37, 52, 49}));
    ExampleRunner.eq(39, 5, new MutaliskEasy().minimalAttacks(new int[]{37}));
    ExampleRunner.eq(40, 3, new MutaliskEasy().minimalAttacks(new int[]{20}));
    ExampleRunner.eq(41, 9, new MutaliskEasy().minimalAttacks(new int[]{46, 57}));
    ExampleRunner.eq(42, 3, new MutaliskEasy().minimalAttacks(new int[]{26, 7}));
    ExampleRunner.eq(43, 7, new MutaliskEasy().minimalAttacks(new int[]{27, 47, 4}));
    ExampleRunner.eq(44, 4, new MutaliskEasy().minimalAttacks(new int[]{23, 8, 13}));
    ExampleRunner.eq(45, 7, new MutaliskEasy().minimalAttacks(new int[]{14, 50, 15}));
    ExampleRunner.eq(46, 7, new MutaliskEasy().minimalAttacks(new int[]{59, 11}));
    ExampleRunner.eq(47, 4, new MutaliskEasy().minimalAttacks(new int[]{2, 33}));
    ExampleRunner.eq(48, 9, new MutaliskEasy().minimalAttacks(new int[]{55, 7, 48}));
    ExampleRunner.eq(49, 8, new MutaliskEasy().minimalAttacks(new int[]{58, 26}));
    ExampleRunner.eq(50, 7, new MutaliskEasy().minimalAttacks(new int[]{57, 20, 12}));
    ExampleRunner.eq(51, 1, new MutaliskEasy().minimalAttacks(new int[]{7}));
    ExampleRunner.eq(52, 6, new MutaliskEasy().minimalAttacks(new int[]{20, 26, 27}));
    ExampleRunner.eq(53, 4, new MutaliskEasy().minimalAttacks(new int[]{34}));
    ExampleRunner.eq(54, 9, new MutaliskEasy().minimalAttacks(new int[]{29, 55, 19}));
    ExampleRunner.eq(55, 5, new MutaliskEasy().minimalAttacks(new int[]{37}));
    ExampleRunner.eq(56, 8, new MutaliskEasy().minimalAttacks(new int[]{42, 49, 3}));
    ExampleRunner.eq(57, 2, new MutaliskEasy().minimalAttacks(new int[]{14}));
    ExampleRunner.eq(58, 3, new MutaliskEasy().minimalAttacks(new int[]{9, 15}));
    ExampleRunner.eq(59, 14, new MutaliskEasy().minimalAttacks(new int[]{60, 60, 60}));
    ExampleRunner.eq(60, 3, new MutaliskEasy().minimalAttacks(new int[]{9, 9, 8}));
    ExampleRunner.eq(61, 2, new MutaliskEasy().minimalAttacks(new int[]{12, 10, 4}));
    ExampleRunner.eq(62, 13, new MutaliskEasy().minimalAttacks(new int[]{60, 53, 51}));
    ExampleRunner.eq(63, 2, new MutaliskEasy().minimalAttacks(new int[]{10, 1, 1}));
    ExampleRunner.eq(64, 7, new MutaliskEasy().minimalAttacks(new int[]{1, 1, 60}));
    ExampleRunner.eq(65, 7, new MutaliskEasy().minimalAttacks(new int[]{60, 1, 1}));
    ExampleRunner.eq(66, 4, new MutaliskEasy().minimalAttacks(new int[]{14, 16, 22}));
    ExampleRunner.eq(67, 2, new MutaliskEasy().minimalAttacks(new int[]{10}));
    ExampleRunner.eq(68, 3, new MutaliskEasy().minimalAttacks(new int[]{12, 9, 5}));
    ExampleRunner.eq(69, 3, new MutaliskEasy().minimalAttacks(new int[]{8, 8, 8}));
    ExampleRunner.eq(70, 2, new MutaliskEasy().minimalAttacks(new int[]{7, 3, 2}));
    ExampleRunner.eq(71, 2, new MutaliskEasy().minimalAttacks(new int[]{10, 1}));
    ExampleRunner.eq(72, 4, new MutaliskEasy().minimalAttacks(new int[]{28, 1, 1}));
    ExampleRunner.eq(73, 8, new MutaliskEasy().minimalAttacks(new int[]{60, 13, 17}));
    ExampleRunner.eq(74, 14, new MutaliskEasy().minimalAttacks(new int[]{60, 57, 59}));
    ExampleRunner.eq(75, 1, new MutaliskEasy().minimalAttacks(new int[]{9}));
    ExampleRunner.eq(76, 3, new MutaliskEasy().minimalAttacks(new int[]{18, 7, 1}));
    ExampleRunner.eq(77, 1, new MutaliskEasy().minimalAttacks(new int[]{1, 3, 9}));
    ExampleRunner.eq(78, 2, new MutaliskEasy().minimalAttacks(new int[]{6, 9, 9}));
    ExampleRunner.eq(79, 7, new MutaliskEasy().minimalAttacks(new int[]{60, 10, 1}));
    ExampleRunner.eq(80, 6, new MutaliskEasy().minimalAttacks(new int[]{52}));
    ExampleRunner.eq(81, 4, new MutaliskEasy().minimalAttacks(new int[]{27, 8, 4}));
    ExampleRunner.eq(82, 4, new MutaliskEasy().minimalAttacks(new int[]{18, 18, 3}));
    ExampleRunner.eq(83, 1, new MutaliskEasy().minimalAttacks(new int[]{1, 9, 3}));
    ExampleRunner.eq(84, 3, new MutaliskEasy().minimalAttacks(new int[]{5, 15, 19}));
    ExampleRunner.eq(85, 2, new MutaliskEasy().minimalAttacks(new int[]{8, 3, 2}));
    ExampleRunner.eq(86, 2, new MutaliskEasy().minimalAttacks(new int[]{6, 6, 1}));
    ExampleRunner.eq(87, 6, new MutaliskEasy().minimalAttacks(new int[]{54, 1, 1}));
    ExampleRunner.eq(88, 2, new MutaliskEasy().minimalAttacks(new int[]{10, 2}));
  }
}
