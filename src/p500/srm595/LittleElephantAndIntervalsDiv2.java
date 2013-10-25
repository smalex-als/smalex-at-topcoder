package p500.srm595;

import utils.ExampleRunner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LittleElephantAndIntervalsDiv2 {
  private int[] l;
  private int[] r;
  private Set<String> all = new HashSet<String>();

  public int getNumber(int M, int[] L, int[] R) {
    l = L;
    r = R;

    int[] row = new int[M];
    solve(0, 0, row);
    solve(0, 1, row);
    return all.size();
  }

  private int solve(int k, int color, int[] row) {
    if (k == l.length) {
      all.add(Arrays.toString(row));
      return 1;
    }
    int[] newrow = new int[row.length];
    System.arraycopy(row, 0, newrow, 0, row.length);
    for (int i = l[k]; i <= r[k]; i++) {
      newrow[i - 1] = color;
    }
    solve(k + 1, 0, newrow);
    solve(k + 1, 1, newrow);
    return 0;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 8, new LittleElephantAndIntervalsDiv2().getNumber(4, new int[]{1, 2, 3}, new int[]{1, 2, 3}));
    ExampleRunner.eq(2, 4, new LittleElephantAndIntervalsDiv2().getNumber(3, new int[]{1, 1, 2}, new int[]{3, 1, 3}));
    ExampleRunner.eq(3, 2, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{47}, new int[]{74}));
    ExampleRunner.eq(4, 8, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{10, 20, 50}, new int[]{20, 50, 100}));
    ExampleRunner.eq(5, 2, new LittleElephantAndIntervalsDiv2().getNumber(1, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(6, 512, new LittleElephantAndIntervalsDiv2().getNumber(42, new int[]{5, 23, 4, 1, 15, 2, 22, 26, 13, 16}, new int[]{30, 41, 17, 1, 21, 6, 28, 30, 15, 19}));
    ExampleRunner.eq(7, 16, new LittleElephantAndIntervalsDiv2().getNumber(5, new int[]{1, 2, 1, 4, 1, 1, 3, 2, 1, 4}, new int[]{3, 3, 2, 4, 3, 2, 5, 3, 1, 4}));
    ExampleRunner.eq(8, 256, new LittleElephantAndIntervalsDiv2().getNumber(23, new int[]{14, 18, 2, 3, 15, 4, 3, 9, 17, 19}, new int[]{20, 19, 7, 15, 22, 6, 3, 13, 20, 23}));
    ExampleRunner.eq(9, 128, new LittleElephantAndIntervalsDiv2().getNumber(43, new int[]{6, 11, 1, 3, 10, 6, 13, 13, 18, 5}, new int[]{31, 11, 1, 13, 24, 33, 43, 13, 22, 5}));
    ExampleRunner.eq(10, 256, new LittleElephantAndIntervalsDiv2().getNumber(57, new int[]{11, 12, 17, 1, 28, 19, 21, 10, 50, 19}, new int[]{42, 24, 32, 7, 38, 50, 31, 12, 51, 19}));
    ExampleRunner.eq(11, 512, new LittleElephantAndIntervalsDiv2().getNumber(91, new int[]{55, 6, 17, 80, 83, 24, 2, 54, 62, 61}, new int[]{61, 12, 22, 82, 91, 27, 4, 54, 68, 68}));
    ExampleRunner.eq(12, 512, new LittleElephantAndIntervalsDiv2().getNumber(96, new int[]{23, 53, 95, 29, 71, 48, 10, 96, 16, 78}, new int[]{24, 53, 96, 35, 78, 55, 17, 96, 21, 87}));
    ExampleRunner.eq(13, 128, new LittleElephantAndIntervalsDiv2().getNumber(99, new int[]{66, 87, 84, 79, 10, 52, 86, 4, 66, 74}, new int[]{74, 93, 84, 87, 11, 57, 95, 11, 69, 75}));
    ExampleRunner.eq(14, 512, new LittleElephantAndIntervalsDiv2().getNumber(93, new int[]{78, 54, 47, 28, 43, 26, 85, 47, 39, 69}, new int[]{79, 58, 53, 36, 51, 27, 88, 55, 39, 76}));
    ExampleRunner.eq(15, 256, new LittleElephantAndIntervalsDiv2().getNumber(98, new int[]{5, 51, 70, 3, 78, 2, 22, 21, 56, 63}, new int[]{8, 54, 71, 10, 82, 8, 23, 30, 62, 66}));
    ExampleRunner.eq(16, 512, new LittleElephantAndIntervalsDiv2().getNumber(95, new int[]{84, 25, 23, 61, 94, 68, 4, 26, 64, 37}, new int[]{88, 34, 28, 64, 95, 72, 12, 34, 64, 45}));
    ExampleRunner.eq(17, 1024, new LittleElephantAndIntervalsDiv2().getNumber(92, new int[]{86, 42, 49, 47, 59, 67, 47, 36, 21, 11}, new int[]{92, 49, 51, 49, 68, 74, 48, 44, 22, 15}));
    ExampleRunner.eq(18, 1024, new LittleElephantAndIntervalsDiv2().getNumber(93, new int[]{61, 48, 51, 69, 55, 22, 7, 52, 27, 19}, new int[]{69, 50, 56, 78, 59, 23, 9, 53, 34, 21}));
    ExampleRunner.eq(19, 1024, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{76, 1, 4, 62, 2, 56, 3, 83, 89, 18}, new int[]{78, 1, 13, 70, 11, 59, 8, 88, 95, 25}));
    ExampleRunner.eq(20, 1024, new LittleElephantAndIntervalsDiv2().getNumber(93, new int[]{57, 16, 78, 82, 49, 47, 89, 27, 19, 34}, new int[]{66, 17, 84, 90, 54, 51, 90, 32, 27, 43}));
    ExampleRunner.eq(21, 512, new LittleElephantAndIntervalsDiv2().getNumber(94, new int[]{18, 50, 84, 33, 6, 8, 87, 49, 48, 67}, new int[]{23, 56, 84, 39, 10, 12, 92, 49, 50, 71}));
    ExampleRunner.eq(22, 256, new LittleElephantAndIntervalsDiv2().getNumber(97, new int[]{11, 42, 9, 72, 42, 91, 15, 62, 47, 71}, new int[]{15, 43, 9, 74, 47, 92, 21, 62, 52, 76}));
    ExampleRunner.eq(23, 256, new LittleElephantAndIntervalsDiv2().getNumber(93, new int[]{62, 49, 14, 48, 67, 49, 22, 3, 74, 11}, new int[]{63, 59, 20, 67, 86, 53, 32, 12, 87, 13}));
    ExampleRunner.eq(24, 128, new LittleElephantAndIntervalsDiv2().getNumber(99, new int[]{60, 6, 66, 62, 59, 85, 36, 63, 54, 83}, new int[]{67, 24, 68, 79, 73, 99, 48, 76, 61, 99}));
    ExampleRunner.eq(25, 256, new LittleElephantAndIntervalsDiv2().getNumber(98, new int[]{36, 98, 43, 65, 10, 1, 50, 74, 48, 28}, new int[]{46, 98, 48, 65, 17, 20, 55, 78, 60, 29}));
    ExampleRunner.eq(26, 128, new LittleElephantAndIntervalsDiv2().getNumber(94, new int[]{79, 52, 60, 49, 79, 5, 89, 49, 31, 2}, new int[]{84, 57, 72, 51, 83, 12, 94, 59, 46, 13}));
    ExampleRunner.eq(27, 32, new LittleElephantAndIntervalsDiv2().getNumber(91, new int[]{60, 6, 50, 57, 83, 5, 91, 82, 38, 10}, new int[]{77, 6, 69, 81, 83, 24, 91, 91, 56, 19}));
    ExampleRunner.eq(28, 512, new LittleElephantAndIntervalsDiv2().getNumber(99, new int[]{52, 86, 70, 46, 6, 21, 33, 88, 61, 59}, new int[]{71, 86, 80, 56, 26, 22, 51, 99, 68, 74}));
    ExampleRunner.eq(29, 512, new LittleElephantAndIntervalsDiv2().getNumber(98, new int[]{80, 78, 44, 42, 43, 26, 14, 4, 89, 29}, new int[]{98, 80, 47, 62, 55, 47, 25, 4, 98, 45}));
    ExampleRunner.eq(30, 256, new LittleElephantAndIntervalsDiv2().getNumber(91, new int[]{34, 14, 68, 45, 1, 15, 13, 89, 60, 16}, new int[]{45, 25, 71, 60, 14, 30, 25, 89, 68, 31}));
    ExampleRunner.eq(31, 128, new LittleElephantAndIntervalsDiv2().getNumber(98, new int[]{12, 89, 50, 52, 10, 44, 6, 55, 58, 2}, new int[]{12, 98, 60, 66, 18, 51, 26, 73, 82, 2}));
    ExampleRunner.eq(32, 512, new LittleElephantAndIntervalsDiv2().getNumber(92, new int[]{1, 65, 3, 42, 33, 66, 18, 88, 14, 51}, new int[]{26, 77, 16, 48, 39, 72, 45, 92, 40, 58}));
    ExampleRunner.eq(33, 16, new LittleElephantAndIntervalsDiv2().getNumber(93, new int[]{70, 54, 58, 50, 50, 70, 57, 51, 52, 68}, new int[]{76, 65, 67, 55, 72, 75, 69, 55, 74, 93}));
    ExampleRunner.eq(34, 1024, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    ExampleRunner.eq(35, 1024, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{100, 100, 100, 100, 100, 100, 100, 100, 100, 100}));
    ExampleRunner.eq(36, 1024, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{100, 99, 98, 97, 96, 95, 94, 93, 92, 91}));
    ExampleRunner.eq(37, 1024, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19}, new int[]{4, 4, 8, 8, 12, 12, 16, 16, 20, 20}));
    ExampleRunner.eq(38, 32, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{3, 1, 7, 5, 11, 9, 15, 13, 19, 17}, new int[]{4, 4, 8, 8, 12, 12, 16, 16, 20, 20}));
    ExampleRunner.eq(39, 2, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 99}));
    ExampleRunner.eq(40, 1024, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{1, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{99, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(41, 8, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{1, 50, 50}, new int[]{50, 100, 50}));
    ExampleRunner.eq(42, 2, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{100, 100, 100, 100, 100, 100, 100, 100, 100, 100}));
    ExampleRunner.eq(43, 512, new LittleElephantAndIntervalsDiv2().getNumber(42, new int[]{5, 23, 4, 1, 15, 2, 22, 26, 13, 16}, new int[]{30, 41, 17, 1, 21, 6, 28, 30, 15, 19}));
    ExampleRunner.eq(44, 4, new LittleElephantAndIntervalsDiv2().getNumber(4, new int[]{1, 1, 3}, new int[]{3, 2, 3}));
    ExampleRunner.eq(45, 4, new LittleElephantAndIntervalsDiv2().getNumber(3, new int[]{1, 2}, new int[]{3, 2}));
    ExampleRunner.eq(46, 4, new LittleElephantAndIntervalsDiv2().getNumber(3, new int[]{1, 1, 2}, new int[]{3, 1, 3}));
    ExampleRunner.eq(47, 2, new LittleElephantAndIntervalsDiv2().getNumber(4, new int[]{1, 1, 1, 1}, new int[]{4, 4, 4, 4}));
    ExampleRunner.eq(48, 8, new LittleElephantAndIntervalsDiv2().getNumber(10, new int[]{1, 5, 5}, new int[]{10, 10, 5}));
    ExampleRunner.eq(49, 4, new LittleElephantAndIntervalsDiv2().getNumber(4, new int[]{1, 2, 2}, new int[]{4, 2, 2}));
    ExampleRunner.eq(50, 4, new LittleElephantAndIntervalsDiv2().getNumber(3, new int[]{1, 3}, new int[]{3, 3}));
    ExampleRunner.eq(51, 2, new LittleElephantAndIntervalsDiv2().getNumber(1, new int[]{1, 1, 1}, new int[]{1, 1, 1}));
    ExampleRunner.eq(52, 8, new LittleElephantAndIntervalsDiv2().getNumber(10, new int[]{1, 3, 6}, new int[]{9, 4, 7}));
    ExampleRunner.eq(53, 4, new LittleElephantAndIntervalsDiv2().getNumber(50, new int[]{1, 3}, new int[]{10, 6}));
    ExampleRunner.eq(54, 32, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{10, 20, 30, 40, 50}, new int[]{90, 80, 70, 60, 50}));
    ExampleRunner.eq(55, 8, new LittleElephantAndIntervalsDiv2().getNumber(5, new int[]{1, 2, 3}, new int[]{5, 4, 3}));
    ExampleRunner.eq(56, 2, new LittleElephantAndIntervalsDiv2().getNumber(3, new int[]{1, 1}, new int[]{3, 3}));
    ExampleRunner.eq(57, 2, new LittleElephantAndIntervalsDiv2().getNumber(6, new int[]{4, 3}, new int[]{5, 6}));
    ExampleRunner.eq(58, 64, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{1, 1, 2, 8, 10, 56, 14}, new int[]{1, 10, 100, 9, 54, 58, 16}));
    ExampleRunner.eq(59, 4, new LittleElephantAndIntervalsDiv2().getNumber(10, new int[]{1, 2}, new int[]{6, 5}));
    ExampleRunner.eq(60, 2, new LittleElephantAndIntervalsDiv2().getNumber(100, new int[]{10, 10, 10}, new int[]{20, 20, 20}));
    ExampleRunner.eq(61, 4, new LittleElephantAndIntervalsDiv2().getNumber(4, new int[]{1, 2}, new int[]{4, 3}));
    ExampleRunner.eq(62, 8, new LittleElephantAndIntervalsDiv2().getNumber(4, new int[]{1, 3, 4}, new int[]{1, 3, 4}));
  }
}
