package p500.srm522;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 10/25/11
 * Time: 9:03 PM
 */
public class PointErasingTwo {
  public int getMaximum(int[] y) {
    int result = 0;
    for (int i = 0; i < y.length; i++) {
      for (int j = i + 1; j < y.length; j++) {
        result = Math.max(result, calc(i, j, y));
      }
    }
    return result;
  }

  private int calc(int start, int end, int[] y) {
    int minY = Math.min(y[start], y[end]);
    int maxY = Math.max(y[start], y[end]);
    int result = 0;
    for (int i = start + 1; i < end; i++) {
      if (y[i] > minY && y[i] < maxY) {
        result++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 2, new PointErasingTwo().getMaximum(new int[]{1, 2, 1, 1, 0, 4, 3}));
    ExampleRunner.eq(2, 0, new PointErasingTwo().getMaximum(new int[]{0, 1}));
    ExampleRunner.eq(3, 3, new PointErasingTwo().getMaximum(new int[]{0, 1, 2, 3, 4}));
    ExampleRunner.eq(4, 0, new PointErasingTwo().getMaximum(new int[]{10, 19, 10, 19}));
    ExampleRunner.eq(5, 5, new PointErasingTwo().getMaximum(new int[]{0, 23, 49, 50, 32, 0, 18, 50, 0, 28, 50, 27, 49, 0}));
    ExampleRunner.eq(6, 0, new PointErasingTwo().getMaximum(new int[]{15, 39}));
    ExampleRunner.eq(7, 0, new PointErasingTwo().getMaximum(new int[]{49, 40}));
    ExampleRunner.eq(8, 0, new PointErasingTwo().getMaximum(new int[]{39, 39, 42}));
    ExampleRunner.eq(9, 0, new PointErasingTwo().getMaximum(new int[]{8, 9, 8}));
    ExampleRunner.eq(10, 0, new PointErasingTwo().getMaximum(new int[]{16, 26, 26}));
    ExampleRunner.eq(11, 0, new PointErasingTwo().getMaximum(new int[]{47, 0, 0}));
    ExampleRunner.eq(12, 0, new PointErasingTwo().getMaximum(new int[]{49, 32, 49}));
    ExampleRunner.eq(13, 0, new PointErasingTwo().getMaximum(new int[]{41, 41, 31}));
    ExampleRunner.eq(14, 1, new PointErasingTwo().getMaximum(new int[]{5, 26, 37}));
    ExampleRunner.eq(15, 0, new PointErasingTwo().getMaximum(new int[]{1, 42, 38}));
    ExampleRunner.eq(16, 0, new PointErasingTwo().getMaximum(new int[]{28, 1, 46}));
    ExampleRunner.eq(17, 0, new PointErasingTwo().getMaximum(new int[]{29, 45, 10}));
    ExampleRunner.eq(18, 0, new PointErasingTwo().getMaximum(new int[]{23, 10, 16}));
    ExampleRunner.eq(19, 1, new PointErasingTwo().getMaximum(new int[]{31, 7, 6}));
    ExampleRunner.eq(20, 48, new PointErasingTwo().getMaximum(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49}));
    ExampleRunner.eq(21, 39, new PointErasingTwo().getMaximum(new int[]{19, 29, 9, 18, 43, 49, 25, 30, 35, 36, 45, 22, 13, 11, 21, 46, 7, 37, 24, 34, 14, 33, 17, 39, 0, 28, 32, 47, 6, 44, 42, 38, 8, 12, 27, 26, 23, 31, 15, 40, 16, 10, 3, 5, 20, 2, 1, 48, 4, 41}));
    ExampleRunner.eq(22, 38, new PointErasingTwo().getMaximum(new int[]{17, 1, 22, 16, 9, 34, 4, 44, 46, 26, 30, 18, 32, 39, 5, 12, 14, 45, 24, 0, 10, 49, 13, 27, 40, 48, 35, 23, 29, 25, 42, 6, 8, 20, 47, 38, 19, 28, 15, 37, 33, 21, 7, 11, 3, 41, 2, 43, 31, 36}));
    ExampleRunner.eq(23, 46, new PointErasingTwo().getMaximum(new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 18, 18, 19, 19, 20, 20, 21, 21, 22, 22, 23, 23, 24, 24}));
    ExampleRunner.eq(24, 39, new PointErasingTwo().getMaximum(new int[]{20, 2, 5, 22, 7, 5, 23, 4, 12, 11, 17, 15, 20, 19, 7, 23, 24, 22, 1, 12, 21, 0, 8, 1, 8, 13, 19, 16, 6, 16, 18, 14, 10, 0, 9, 2, 6, 3, 11, 15, 17, 13, 14, 3, 18, 10, 21, 24, 4, 9}));
    ExampleRunner.eq(25, 31, new PointErasingTwo().getMaximum(new int[]{13, 9, 15, 3, 13, 17, 23, 16, 7, 14, 0, 12, 19, 14, 15, 16, 5, 20, 11, 18, 24, 6, 23, 7, 2, 8, 12, 4, 0, 10, 20, 2, 17, 6, 10, 18, 22, 24, 21, 1, 21, 1, 4, 5, 22, 11, 9, 3, 8, 19}));
    ExampleRunner.eq(26, 45, new PointErasingTwo().getMaximum(new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16}));
    ExampleRunner.eq(27, 32, new PointErasingTwo().getMaximum(new int[]{1, 7, 7, 2, 4, 14, 16, 0, 13, 16, 6, 9, 1, 13, 3, 8, 11, 13, 8, 5, 0, 6, 12, 15, 5, 11, 4, 5, 8, 9, 15, 4, 6, 1, 11, 9, 2, 15, 0, 10, 10, 12, 14, 7, 2, 14, 3, 12, 10, 3}));
    ExampleRunner.eq(28, 31, new PointErasingTwo().getMaximum(new int[]{5, 1, 3, 15, 11, 10, 14, 0, 6, 6, 12, 4, 0, 11, 7, 0, 14, 11, 7, 5, 9, 15, 8, 12, 1, 5, 14, 16, 9, 3, 8, 6, 2, 1, 16, 15, 2, 13, 7, 13, 10, 13, 4, 4, 8, 9, 2, 10, 3, 12}));
    ExampleRunner.eq(29, 0, new PointErasingTwo().getMaximum(new int[]{48, 48, 48, 48, 49, 49, 49, 49, 49, 48, 48, 48, 49, 49, 48, 48, 48, 48, 49, 49, 49, 49, 48, 49, 49, 49, 49, 49, 48, 48, 49, 49, 48, 49, 48, 49, 48, 48, 48, 49, 48, 49, 49, 49, 48, 49, 49, 49, 48, 49}));
    ExampleRunner.eq(30, 0, new PointErasingTwo().getMaximum(new int[]{32, 7, 32, 7, 7, 7, 32, 7, 7, 7, 7, 7, 32, 7, 32, 7, 7, 32, 32, 32, 7, 7, 32, 7, 7, 7, 7}));
    ExampleRunner.eq(31, 0, new PointErasingTwo().getMaximum(new int[]{10, 50, 10, 50, 50, 50, 10, 10, 10, 10, 50}));
    ExampleRunner.eq(32, 0, new PointErasingTwo().getMaximum(new int[]{36, 36, 1, 1, 36, 36, 1, 1, 36, 36, 36, 1, 36, 36}));
    ExampleRunner.eq(33, 27, new PointErasingTwo().getMaximum(new int[]{29, 29, 29, 29, 4, 50, 10, 10, 10, 10, 50, 10, 4, 50, 10, 10, 10, 4, 10, 29, 29, 10, 4, 4, 29, 29, 10, 4, 29, 10, 4, 29, 10, 29, 50, 50, 10, 29, 10, 50, 4, 4, 29, 29, 29, 4, 50, 10, 4, 4}));
    ExampleRunner.eq(34, 2, new PointErasingTwo().getMaximum(new int[]{35, 27, 9, 9, 27, 9}));
    ExampleRunner.eq(35, 26, new PointErasingTwo().getMaximum(new int[]{15, 45, 36, 28, 28, 36, 28, 15, 28, 36, 45, 15, 45, 36, 36, 36, 15, 45, 36, 45, 45, 15, 36, 36, 36, 28, 36, 28, 15, 36, 15, 15, 36, 15, 28, 28, 28, 45, 36, 36, 36, 45, 28, 45, 28, 28}));
    ExampleRunner.eq(36, 14, new PointErasingTwo().getMaximum(new int[]{19, 48, 19, 27, 0, 48, 48, 48, 27, 27, 19, 19, 27, 0, 27, 0, 27, 0, 19, 27, 19, 19, 19, 0, 0, 27, 19, 19}));
    ExampleRunner.eq(37, 31, new PointErasingTwo().getMaximum(new int[]{3, 27, 13, 45, 13, 45, 3, 27, 24, 25, 27, 24, 34, 24, 13, 45, 3, 45, 47, 45, 24, 24, 3, 34, 47, 3, 25, 47, 25, 34, 3, 24, 13, 25, 45, 3, 34, 45, 47, 3, 3, 13, 25, 13, 47, 13, 27, 34, 27, 13}));
    ExampleRunner.eq(38, 9, new PointErasingTwo().getMaximum(new int[]{16, 46, 37, 46, 46, 39, 39, 37, 34, 7, 7, 37, 46, 46, 37, 37, 39, 46, 40}));
    ExampleRunner.eq(39, 3, new PointErasingTwo().getMaximum(new int[]{37, 33, 14, 39, 28, 45, 45, 33, 14, 14}));
    ExampleRunner.eq(40, 3, new PointErasingTwo().getMaximum(new int[]{32, 21, 21, 32, 46, 21, 32, 18, 32}));
    ExampleRunner.eq(41, 39, new PointErasingTwo().getMaximum(new int[]{39, 17, 11, 17, 23, 21, 4, 17, 16, 14, 4, 17, 14, 0, 14, 12, 39, 39, 16, 17, 41, 21, 39, 16, 50, 10, 4, 12, 21, 28, 12, 28, 12, 41, 14, 12, 17, 21, 35, 21, 21, 23, 4, 23, 14, 0, 28, 50, 28, 0}));
    ExampleRunner.eq(42, 8, new PointErasingTwo().getMaximum(new int[]{1, 35, 0, 16, 34, 40, 31, 37, 31, 19, 19, 19, 31, 35, 26, 22}));
    ExampleRunner.eq(43, 26, new PointErasingTwo().getMaximum(new int[]{39, 29, 22, 37, 43, 27, 43, 35, 48, 43, 35, 25, 25, 15, 11, 18, 15, 41, 43, 29, 48, 43, 25, 43, 39, 25, 27, 43, 18, 40, 48, 36, 41, 43, 40, 18, 48, 11, 3, 18, 40, 22, 37, 35}));
    ExampleRunner.eq(44, 23, new PointErasingTwo().getMaximum(new int[]{22, 19, 21, 25, 22, 16, 48, 21, 7, 20, 32, 39, 48, 7, 21, 39, 7, 38, 19, 39, 20, 39, 20, 19, 39, 10, 10, 25, 10, 16, 38, 12, 27, 25, 48, 48, 12, 25, 25, 11}));
    ExampleRunner.eq(45, 0, new PointErasingTwo().getMaximum(new int[]{0, 50}));
    ExampleRunner.eq(46, 0, new PointErasingTwo().getMaximum(new int[]{50, 0}));
    ExampleRunner.eq(47, 45, new PointErasingTwo().getMaximum(new int[]{0, 25, 13, 38, 7, 32, 19, 44, 4, 29, 16, 41, 10, 35, 22, 47, 2, 27, 15, 40, 9, 34, 21, 46, 6, 31, 18, 43, 12, 37, 24, 49, 1, 26, 14, 39, 8, 33, 20, 45, 5, 30, 17, 42, 11, 36, 23, 48, 3, 28}));
    ExampleRunner.eq(48, 48, new PointErasingTwo().getMaximum(new int[]{50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
    ExampleRunner.eq(49, 34, new PointErasingTwo().getMaximum(new int[]{6, 5, 25, 47, 0, 23, 26, 9, 49, 17, 20, 16, 15, 34, 25, 14, 12, 23, 38, 30, 17, 24, 43, 38, 13, 16, 24, 33, 27, 24, 16, 26, 23, 15, 7, 14, 35, 16, 38, 20, 31, 27, 19, 12, 19, 30}));
    ExampleRunner.eq(50, 36, new PointErasingTwo().getMaximum(new int[]{5, 18, 11, 20, 40, 8, 40, 0, 37, 20, 31, 29, 7, 4, 20, 24, 20, 7, 31, 6, 9, 15, 28, 18, 49, 6, 28, 22, 17, 18, 8, 9, 14, 3, 10, 13, 18, 7, 14, 18, 7, 42, 20, 20, 23}));
    ExampleRunner.eq(51, 23, new PointErasingTwo().getMaximum(new int[]{11, 17, 27, 38, 3, 23, 20, 30, 3, 42, 41, 8, 10, 23, 16, 45, 27, 38, 30, 43, 39, 19, 18, 3, 46, 23, 40, 23, 23, 50}));
    ExampleRunner.eq(52, 37, new PointErasingTwo().getMaximum(new int[]{44, 2, 31, 49, 44, 48, 44, 45, 16, 45, 46, 48, 45, 42, 31, 47, 49, 33, 18, 44, 50, 45, 44, 44, 23, 41, 7, 37, 34, 48, 44, 46, 47, 37, 44, 45, 23, 9, 47, 48, 49, 46, 44, 49}));
    ExampleRunner.eq(53, 36, new PointErasingTwo().getMaximum(new int[]{39, 18, 38, 8, 30, 39, 27, 12, 11, 18, 23, 47, 17, 6, 26, 39, 18, 33, 30, 32, 19, 16, 24, 25, 41, 12, 29, 12, 12, 20, 8, 29, 48, 3, 28, 24, 26, 31, 3, 36, 44, 10, 3, 40, 31, 50, 50, 3}));
    ExampleRunner.eq(54, 38, new PointErasingTwo().getMaximum(new int[]{34, 40, 36, 17, 8, 23, 3, 24, 24, 31, 48, 15, 0, 17, 20, 22, 26, 26, 22, 13, 24, 12, 10, 23, 31, 31, 35, 16, 22, 33, 32, 2, 19, 38, 30, 13, 15, 27, 44, 37, 6, 26, 30, 1, 15}));
    ExampleRunner.eq(55, 16, new PointErasingTwo().getMaximum(new int[]{12, 3, 17, 40, 12, 11, 12, 12, 41, 12, 0, 10, 11, 38, 11, 24, 11, 11, 12, 11, 26, 12, 28, 11, 12, 11}));
    ExampleRunner.eq(56, 39, new PointErasingTwo().getMaximum(new int[]{19, 11, 19, 7, 38, 9, 19, 19, 42, 19, 26, 14, 15, 19, 31, 19, 19, 19, 19, 24, 19, 17, 17, 19, 19, 12, 20, 19, 11, 45, 19, 19, 19, 19, 31, 19, 19, 8, 19, 10, 31, 19, 19, 19, 4, 39, 19, 19, 36, 19}));
    ExampleRunner.eq(57, 24, new PointErasingTwo().getMaximum(new int[]{3, 50, 10, 5, 35, 31, 11, 49, 49, 9, 44, 18, 9, 16, 26, 41, 33, 4, 15, 20, 10, 18, 6, 8, 21, 13, 46, 9, 32, 11, 8, 15, 10, 22, 23}));
    ExampleRunner.eq(58, 21, new PointErasingTwo().getMaximum(new int[]{34, 50, 32, 29, 22, 50, 23, 20, 30, 22, 15, 24, 23, 33, 2, 19, 33, 45, 19, 14, 35, 20, 31, 20, 20, 43, 22, 18}));
    ExampleRunner.eq(59, 2, new PointErasingTwo().getMaximum(new int[]{1, 2, 1, 1, 0, 4, 3}));
    ExampleRunner.eq(60, 2, new PointErasingTwo().getMaximum(new int[]{0, 1, 2, 3}));
    ExampleRunner.eq(61, 17, new PointErasingTwo().getMaximum(new int[]{0, 1, 2, 23, 12, 0, 34, 9, 8, 7, 5, 3, 2, 1, 12, 32, 5, 6, 8, 37}));
    ExampleRunner.eq(62, 6, new PointErasingTwo().getMaximum(new int[]{0, 1, 1, 1, 1, 0, 0, 0, 10, 10, 0, 0, 0, 0, 0, 20, 20, 20, 20, 20}));
    ExampleRunner.eq(63, 2, new PointErasingTwo().getMaximum(new int[]{5, 1, 2, 0}));
    ExampleRunner.eq(64, 3, new PointErasingTwo().getMaximum(new int[]{0, 1, 2, 3, 4}));
    ExampleRunner.eq(65, 2, new PointErasingTwo().getMaximum(new int[]{0, 9, 8, 7, 6}));
    ExampleRunner.eq(66, 6, new PointErasingTwo().getMaximum(new int[]{0, 6, 7, 7, 10, 10, 10, 15}));
  }
}
