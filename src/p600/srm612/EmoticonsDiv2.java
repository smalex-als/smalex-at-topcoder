package p600.srm612;

import utils.ExampleRunner;

/**
 * Created by smalex on 03/06/15.
 */
public class EmoticonsDiv2 {
  int ans = Integer.MAX_VALUE;
  int[][] grid = new int[1001][1001];

  public int printSmiles(int smiles) {
    dfs(1, 0, smiles, 0);
    return ans;
  }

  private void dfs(int screen, int clipboard, int dest, int cost) {
    if (screen > dest || clipboard > dest) {
      return;
    }
    if (grid[screen][clipboard] > 0) {
      return;
    }
    grid[screen][clipboard] = cost;
    if (screen == dest) {
      ans = Math.min(cost, ans);
      return;
    }
    dfs(screen, screen, dest, cost + 1);
    dfs(screen + clipboard, clipboard, dest, cost + 1);
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 2, new EmoticonsDiv2().printSmiles(2));
    ExampleRunner.eq(2, 5, new EmoticonsDiv2().printSmiles(6));
    ExampleRunner.eq(3, 11, new EmoticonsDiv2().printSmiles(11));
    ExampleRunner.eq(4, 8, new EmoticonsDiv2().printSmiles(16));
    ExampleRunner.eq(5, 21, new EmoticonsDiv2().printSmiles(1000));
    ExampleRunner.eq(6, 3, new EmoticonsDiv2().printSmiles(3));
    ExampleRunner.eq(7, 4, new EmoticonsDiv2().printSmiles(4));
    ExampleRunner.eq(8, 5, new EmoticonsDiv2().printSmiles(5));
    ExampleRunner.eq(9, 7, new EmoticonsDiv2().printSmiles(7));
    ExampleRunner.eq(10, 6, new EmoticonsDiv2().printSmiles(8));
    ExampleRunner.eq(11, 6, new EmoticonsDiv2().printSmiles(9));
    ExampleRunner.eq(12, 11, new EmoticonsDiv2().printSmiles(11));
    ExampleRunner.eq(13, 7, new EmoticonsDiv2().printSmiles(12));
    ExampleRunner.eq(14, 13, new EmoticonsDiv2().printSmiles(13));
    ExampleRunner.eq(15, 17, new EmoticonsDiv2().printSmiles(99));
    ExampleRunner.eq(16, 9, new EmoticonsDiv2().printSmiles(14));
    ExampleRunner.eq(17, 8, new EmoticonsDiv2().printSmiles(15));
    ExampleRunner.eq(18, 17, new EmoticonsDiv2().printSmiles(17));
    ExampleRunner.eq(19, 10, new EmoticonsDiv2().printSmiles(21));
    ExampleRunner.eq(20, 9, new EmoticonsDiv2().printSmiles(24));
    ExampleRunner.eq(21, 29, new EmoticonsDiv2().printSmiles(29));
    ExampleRunner.eq(22, 31, new EmoticonsDiv2().printSmiles(31));
    ExampleRunner.eq(23, 10, new EmoticonsDiv2().printSmiles(32));
    ExampleRunner.eq(24, 14, new EmoticonsDiv2().printSmiles(33));
    ExampleRunner.eq(25, 32, new EmoticonsDiv2().printSmiles(87));
    ExampleRunner.eq(26, 34, new EmoticonsDiv2().printSmiles(93));
    ExampleRunner.eq(27, 101, new EmoticonsDiv2().printSmiles(101));
    ExampleRunner.eq(28, 44, new EmoticonsDiv2().printSmiles(123));
    ExampleRunner.eq(29, 110, new EmoticonsDiv2().printSmiles(321));
    ExampleRunner.eq(30, 129, new EmoticonsDiv2().printSmiles(254));
    ExampleRunner.eq(31, 25, new EmoticonsDiv2().printSmiles(255));
    ExampleRunner.eq(32, 16, new EmoticonsDiv2().printSmiles(256));
    ExampleRunner.eq(33, 257, new EmoticonsDiv2().printSmiles(257));
    ExampleRunner.eq(34, 17, new EmoticonsDiv2().printSmiles(300));
    ExampleRunner.eq(35, 21, new EmoticonsDiv2().printSmiles(343));
    ExampleRunner.eq(36, 18, new EmoticonsDiv2().printSmiles(400));
    ExampleRunner.eq(37, 19, new EmoticonsDiv2().printSmiles(500));
    ExampleRunner.eq(38, 601, new EmoticonsDiv2().printSmiles(601));
    ExampleRunner.eq(39, 236, new EmoticonsDiv2().printSmiles(699));
    ExampleRunner.eq(40, 28, new EmoticonsDiv2().printSmiles(765));
    ExampleRunner.eq(41, 39, new EmoticonsDiv2().printSmiles(897));
    ExampleRunner.eq(42, 66, new EmoticonsDiv2().printSmiles(893));
    ExampleRunner.eq(43, 70, new EmoticonsDiv2().printSmiles(901));
    ExampleRunner.eq(44, 66, new EmoticonsDiv2().printSmiles(989));
    ExampleRunner.eq(45, 24, new EmoticonsDiv2().printSmiles(990));
    ExampleRunner.eq(46, 991, new EmoticonsDiv2().printSmiles(991));
    ExampleRunner.eq(47, 41, new EmoticonsDiv2().printSmiles(992));
    ExampleRunner.eq(48, 334, new EmoticonsDiv2().printSmiles(993));
    ExampleRunner.eq(49, 80, new EmoticonsDiv2().printSmiles(994));
    ExampleRunner.eq(50, 204, new EmoticonsDiv2().printSmiles(995));
    ExampleRunner.eq(51, 90, new EmoticonsDiv2().printSmiles(996));
    ExampleRunner.eq(52, 997, new EmoticonsDiv2().printSmiles(997));
    ExampleRunner.eq(53, 501, new EmoticonsDiv2().printSmiles(998));
    ExampleRunner.eq(54, 46, new EmoticonsDiv2().printSmiles(999));
    ExampleRunner.eq(55, 971, new EmoticonsDiv2().printSmiles(971));
    ExampleRunner.eq(56, 15, new EmoticonsDiv2().printSmiles(125));
    ExampleRunner.eq(57, 196, new EmoticonsDiv2().printSmiles(955));
    ExampleRunner.eq(58, 53, new EmoticonsDiv2().printSmiles(53));
    ExampleRunner.eq(59, 14, new EmoticonsDiv2().printSmiles(49));
    ExampleRunner.eq(60, 43, new EmoticonsDiv2().printSmiles(333));
    ExampleRunner.eq(61, 37, new EmoticonsDiv2().printSmiles(37));
  }
}
