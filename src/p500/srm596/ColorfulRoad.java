package p500.srm596;

import utils.ExampleRunner;

/**
 * Created by smalex on 03/06/15.
 */
public class ColorfulRoad {
  private int ans = Integer.MAX_VALUE;
  private int[] road;

  public int getMin(String in) {
    road = new int[in.length()];
    for (int i = 0; i < in.length(); i++) {
      road[i] = in.charAt(i) == 'R' ? 0 : in.charAt(i) == 'G' ? 1 : 2;
    }
    dfs(0, 0, 0);
    return ans == Integer.MAX_VALUE ? -1 : ans;
  }

  private void dfs(int x, int color, int cost) {
    if (x == road.length - 1) {
      ans = Math.min(ans, cost);
      return;
    }
    int nextColor = (color + 1) % 3;
    for (int i = x + 1; i < road.length; i++) {
      if (road[i] == nextColor) {
        dfs(i, nextColor, cost + (x - i) * (x - i));
      }
    }
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 8, new ColorfulRoad().getMin("RGGGB"));
    ExampleRunner.eq(2, 8, new ColorfulRoad().getMin("RGBRGBRGB"));
    ExampleRunner.eq(3, -1, new ColorfulRoad().getMin("RBBGGGRR"));
    ExampleRunner.eq(4, 50, new ColorfulRoad().getMin("RBRRBGGGBBBBR"));
    ExampleRunner.eq(5, 1, new ColorfulRoad().getMin("RG"));
    ExampleRunner.eq(6, 52, new ColorfulRoad().getMin("RBRGBGBGGBGRGGG"));
    ExampleRunner.eq(7, -1, new ColorfulRoad().getMin("RB"));
    ExampleRunner.eq(8, -1, new ColorfulRoad().getMin("RR"));
    ExampleRunner.eq(9, 196, new ColorfulRoad().getMin("RBRBRBRBRBRBRBG"));
    ExampleRunner.eq(10, -1, new ColorfulRoad().getMin("RGRGRGRGRGRGRGR"));
    ExampleRunner.eq(11, -1, new ColorfulRoad().getMin("RBRBRBRBRGRGRGR"));
    ExampleRunner.eq(12, -1, new ColorfulRoad().getMin("RRRRRRRRRRRRRRR"));
    ExampleRunner.eq(13, -1, new ColorfulRoad().getMin("RGGGGGGGGGGGGGR"));
    ExampleRunner.eq(14, -1, new ColorfulRoad().getMin("RBBBBBBBBBBBBBR"));
    ExampleRunner.eq(15, 34, new ColorfulRoad().getMin("RGGGBBRRRRGGBBR"));
    ExampleRunner.eq(16, 25, new ColorfulRoad().getMin("RGGBBRRGGBBRRG"));
    ExampleRunner.eq(17, 35, new ColorfulRoad().getMin("RGGGBBBRRRGGGB"));
    ExampleRunner.eq(18, 43, new ColorfulRoad().getMin("RGGGGBBBBRRRRG"));
    ExampleRunner.eq(19, 50, new ColorfulRoad().getMin("RGGGGGBBBBBRRRG"));
    ExampleRunner.eq(20, 1, new ColorfulRoad().getMin("RG"));
    ExampleRunner.eq(21, -1, new ColorfulRoad().getMin("RRB"));
    ExampleRunner.eq(22, 3, new ColorfulRoad().getMin("RGBR"));
    ExampleRunner.eq(23, 16, new ColorfulRoad().getMin("RGRBG"));
    ExampleRunner.eq(24, 7, new ColorfulRoad().getMin("RGBRRG"));
    ExampleRunner.eq(25, 36, new ColorfulRoad().getMin("RRBRBGG"));
    ExampleRunner.eq(26, 21, new ColorfulRoad().getMin("RRGBGRRR"));
    ExampleRunner.eq(27, 34, new ColorfulRoad().getMin("RGBGBRRRB"));
    ExampleRunner.eq(28, 27, new ColorfulRoad().getMin("RRGGGBBGGR"));
    ExampleRunner.eq(29, 52, new ColorfulRoad().getMin("RBGGGRGRRGB"));
    ExampleRunner.eq(30, 47, new ColorfulRoad().getMin("RBRGBRBGBGBG"));
    ExampleRunner.eq(31, 50, new ColorfulRoad().getMin("RGBGBBRGBBBBG"));
    ExampleRunner.eq(32, 73, new ColorfulRoad().getMin("RRGRGRGGRRRRBR"));
    ExampleRunner.eq(33, 50, new ColorfulRoad().getMin("RGGBGBGBRBRGBGG"));
    ExampleRunner.eq(34, -1, new ColorfulRoad().getMin("RRBRB"));
    ExampleRunner.eq(35, -1, new ColorfulRoad().getMin("RRRBR"));
    ExampleRunner.eq(36, 16, new ColorfulRoad().getMin("RGBGG"));
    ExampleRunner.eq(37, -1, new ColorfulRoad().getMin("RBBBB"));
    ExampleRunner.eq(38, -1, new ColorfulRoad().getMin("RRRRB"));
    ExampleRunner.eq(39, 54, new ColorfulRoad().getMin("RBBGBBGGGGRGRGG"));
    ExampleRunner.eq(40, 54, new ColorfulRoad().getMin("RRRRRGBGRBRBRRG"));
    ExampleRunner.eq(41, 78, new ColorfulRoad().getMin("RBRRBRRGRRGGBGR"));
    ExampleRunner.eq(42, 40, new ColorfulRoad().getMin("RRGBRGRGRRBBBBR"));
    ExampleRunner.eq(43, 44, new ColorfulRoad().getMin("RGBGRGRGRGRGRBR"));
    ExampleRunner.eq(44, 6, new ColorfulRoad().getMin("RGGBR"));
    ExampleRunner.eq(45, 9, new ColorfulRoad().getMin("RGBBBR"));
    ExampleRunner.eq(46, 14, new ColorfulRoad().getMin("RRRGBBR"));
    ExampleRunner.eq(47, 17, new ColorfulRoad().getMin("RRRGGBBR"));
    ExampleRunner.eq(48, 169, new ColorfulRoad().getMin("RRRRRRRRRRRRRG"));
    ExampleRunner.eq(49, 89, new ColorfulRoad().getMin("RRRRRRRRGGGGGB"));
    ExampleRunner.eq(50, 54, new ColorfulRoad().getMin("RRGGGGGGGGBBR"));
    ExampleRunner.eq(51, 52, new ColorfulRoad().getMin("RGGGGGGGGGBRG"));
    ExampleRunner.eq(52, 196, new ColorfulRoad().getMin("RRRRRRRRRRRRRRG"));
    ExampleRunner.eq(53, 98, new ColorfulRoad().getMin("RGGGGGGGGGGGGGB"));
    ExampleRunner.eq(54, 66, new ColorfulRoad().getMin("RGGGGGGGBBBBBBR"));
    ExampleRunner.eq(55, 50, new ColorfulRoad().getMin("RRRGGGGBRRRRRRG"));
    ExampleRunner.eq(56, 50, new ColorfulRoad().getMin("RRRRGGGBBBBBRGB"));
    ExampleRunner.eq(57, 40, new ColorfulRoad().getMin("RRRRGBBBBBRRGBR"));
    ExampleRunner.eq(58, 42, new ColorfulRoad().getMin("RRRRRGBBBBRGBRG"));
    ExampleRunner.eq(59, 32, new ColorfulRoad().getMin("RGBRRRRGGGGBRGB"));
    ExampleRunner.eq(60, 24, new ColorfulRoad().getMin("RGBBRGBBBRGGGBR"));
    ExampleRunner.eq(61, 22, new ColorfulRoad().getMin("RGBRGGGBBRRGBRG"));
    ExampleRunner.eq(62, 20, new ColorfulRoad().getMin("RGBBRGBBRGGBRGB"));
    ExampleRunner.eq(63, 18, new ColorfulRoad().getMin("RGBRGBRGBBRGBBR"));
    ExampleRunner.eq(64, 16, new ColorfulRoad().getMin("RRGBRGBRGBRGBRG"));
    ExampleRunner.eq(65, 14, new ColorfulRoad().getMin("RGBRGBRGBRGBRGB"));
    ExampleRunner.eq(66, 66, new ColorfulRoad().getMin("RRRRRRGGGGGBRRG"));
    ExampleRunner.eq(67, 52, new ColorfulRoad().getMin("RRRRGGBBBBBBRRG"));
    ExampleRunner.eq(68, 54, new ColorfulRoad().getMin("RGGGGGGGGBRRRRG"));
    ExampleRunner.eq(69, 106, new ColorfulRoad().getMin("RRRRRRRRRRGBRRG"));
    ExampleRunner.eq(70, 40, new ColorfulRoad().getMin("RGGGGBBBBRGGGGB"));
    ExampleRunner.eq(71, 42, new ColorfulRoad().getMin("RRRRGBBBBBRGGGB"));
    ExampleRunner.eq(72, 44, new ColorfulRoad().getMin("RRRGGGGBBRRRRGB"));
    ExampleRunner.eq(73, 44, new ColorfulRoad().getMin("RGGGBBBRRRRRRGB"));
    ExampleRunner.eq(74, 34, new ColorfulRoad().getMin("RGGBBBBBRGGGBBR"));
    ExampleRunner.eq(75, 38, new ColorfulRoad().getMin("RRRRGBBRRRRGBBR"));
    ExampleRunner.eq(76, 48, new ColorfulRoad().getMin("RGBBRRRRRRRRGBR"));
    ExampleRunner.eq(77, 36, new ColorfulRoad().getMin("RGGGBBRRRRRGGBR"));
    ExampleRunner.eq(78, -1, new ColorfulRoad().getMin("RRRRRRRRRRRRRRR"));
    ExampleRunner.eq(79, 11, new ColorfulRoad().getMin("RGBRGBRGBRGB"));
    ExampleRunner.eq(80, 8, new ColorfulRoad().getMin("RGGRB"));
    ExampleRunner.eq(81, 11, new ColorfulRoad().getMin("RGBGRR"));
  }
}
