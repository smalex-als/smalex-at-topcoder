package p400.srm485;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 12/17/10
 * Time: 12:15 PM
 */
public class RectangleAvoidingColoringEasy {
  private char[][] map;
  private int h;
  private int w;

  public int count(String[] board) {
    h = board.length;
    w = board[0].length();
    map = new char[h][w];
    for (int j = 0; j < h; j++) {
      for (int i = 0; i < w; i++) {
        map[j][i] = board[j].charAt(i);
      }
    }

//    dump(map);
    return innerCount(0, 0);
  }

  private boolean ok(int r, int c, char color) {
    for (int j = 0; j < r; j++) {
      for (int i = 0; i < c; i++) {
        if (map[j][i] == color && map[r][i] == color && map[j][c] == color) {
          return false;
        }
      }
    }
    return true;
  }

  private int innerCount(int y, int x) {
    if (y == h) {
      return 1;
    }
    if (x == w) {
      return innerCount(y + 1, 0);
    }
    if (map[y][x] == '?') {
      int res = 0;
      if (ok(y, x, 'B')) {
        map[y][x] = 'B';
        res += innerCount(y, x + 1);
      }
      if (ok(y, x, 'W')) {
        map[y][x] = 'W';
        res += innerCount(y, x + 1);
      }
      map[y][x] = '?';
      return res;
    }
    if (ok(y, x, map[y][x])) {
      return innerCount(y, x + 1);
    }
    return 0;
  }

  private void dump(char[][] map) {
    System.out.println("===============");
    for (char[] row : map) {
      for (char col : row) {
        System.out.print(col);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 14, new RectangleAvoidingColoringEasy().count(new String[]{"??", "??"}));
    ExampleRunner.eq(2, 3, new RectangleAvoidingColoringEasy().count(new String[]{"B?", "?B"}));
    ExampleRunner.eq(3, 0, new RectangleAvoidingColoringEasy().count(new String[]{"WW", "WW"}));
    ExampleRunner.eq(4, 12, new RectangleAvoidingColoringEasy().count(new String[]{"??B??", "W???W", "??B??"}));
    ExampleRunner.eq(5, 2, new RectangleAvoidingColoringEasy().count(new String[]{"?"}));
    ExampleRunner.eq(6, 1, new RectangleAvoidingColoringEasy().count(new String[]{"B"}));
    ExampleRunner.eq(7, 1, new RectangleAvoidingColoringEasy().count(new String[]{"W"}));
    ExampleRunner.eq(8, 4, new RectangleAvoidingColoringEasy().count(new String[]{"??"}));
    ExampleRunner.eq(9, 1, new RectangleAvoidingColoringEasy().count(new String[]{"BB"}));
    ExampleRunner.eq(10, 1, new RectangleAvoidingColoringEasy().count(new String[]{"BB"}));
    ExampleRunner.eq(11, 8, new RectangleAvoidingColoringEasy().count(new String[]{"???"}));
    ExampleRunner.eq(12, 2, new RectangleAvoidingColoringEasy().count(new String[]{"W?BWBWBBB"}));
    ExampleRunner.eq(13, 8, new RectangleAvoidingColoringEasy().count(new String[]{"WW?W?B?"}));
    ExampleRunner.eq(14, 1024, new RectangleAvoidingColoringEasy().count(new String[]{"??????????"}));
    ExampleRunner.eq(15, 1, new RectangleAvoidingColoringEasy().count(new String[]{"BWBWBWWBWW"}));
    ExampleRunner.eq(16, 8, new RectangleAvoidingColoringEasy().count(new String[]{"WWB?BW?WB?"}));
    ExampleRunner.eq(17, 4, new RectangleAvoidingColoringEasy().count(new String[]{"?", "?"}));
    ExampleRunner.eq(18, 1, new RectangleAvoidingColoringEasy().count(new String[]{"B", "B"}));
    ExampleRunner.eq(19, 2, new RectangleAvoidingColoringEasy().count(new String[]{"W", "?"}));
    ExampleRunner.eq(20, 8, new RectangleAvoidingColoringEasy().count(new String[]{"?", "?", "?"}));
    ExampleRunner.eq(21, 1, new RectangleAvoidingColoringEasy().count(new String[]{"B", "B", "W", "W"}));
    ExampleRunner.eq(22, 1, new RectangleAvoidingColoringEasy().count(new String[]{"B", "B", "B"}));
    ExampleRunner.eq(23, 0, new RectangleAvoidingColoringEasy().count(new String[]{"???????", "???????", "???????", "???????", "???????", "???????", "???????", "???????", "???????", "???????"}));
    ExampleRunner.eq(24, 1024, new RectangleAvoidingColoringEasy().count(new String[]{"?", "?", "?", "?", "?", "?", "?", "?", "?", "?"}));
    ExampleRunner.eq(25, 14, new RectangleAvoidingColoringEasy().count(new String[]{"??", "??"}));
    ExampleRunner.eq(26, 4, new RectangleAvoidingColoringEasy().count(new String[]{"?B", "?W"}));
    ExampleRunner.eq(27, 7, new RectangleAvoidingColoringEasy().count(new String[]{"??", "W?"}));
    ExampleRunner.eq(28, 44, new RectangleAvoidingColoringEasy().count(new String[]{"???", "???"}));
    ExampleRunner.eq(29, 0, new RectangleAvoidingColoringEasy().count(new String[]{"BBBBWBB", "BWBWBBW"}));
    ExampleRunner.eq(30, 4, new RectangleAvoidingColoringEasy().count(new String[]{"WW?BWWWBW", "B?BB?B?WB"}));
    ExampleRunner.eq(31, 44, new RectangleAvoidingColoringEasy().count(new String[]{"??", "??", "??"}));
    ExampleRunner.eq(32, 3, new RectangleAvoidingColoringEasy().count(new String[]{"??", "BB", "BW", "WB", "WB"}));
    ExampleRunner.eq(33, 204, new RectangleAvoidingColoringEasy().count(new String[]{"W?", "?W", "?W", "?W", "B?", "??", "?W", "??", "??"}));
    ExampleRunner.eq(34, 34304, new RectangleAvoidingColoringEasy().count(new String[]{"??????????", "??????????"}));
    ExampleRunner.eq(35, 16, new RectangleAvoidingColoringEasy().count(new String[]{"W??BWB?WW?", "???B???WB?"}));
    ExampleRunner.eq(36, 1, new RectangleAvoidingColoringEasy().count(new String[]{"WBWWBBBWBB", "B?BBBWWB?W"}));
    ExampleRunner.eq(37, 34304, new RectangleAvoidingColoringEasy().count(new String[]{"??", "??", "??", "??", "??", "??", "??", "??", "??", "??"}));
    ExampleRunner.eq(38, 0, new RectangleAvoidingColoringEasy().count(new String[]{"?W", "WB", "BB", "?B", "?W", "BW", "WW", "WB", "BW", "BB"}));
    ExampleRunner.eq(39, 12, new RectangleAvoidingColoringEasy().count(new String[]{"B?", "B?", "BW", "WB", "??", "BB", "BW", "??", "W?", "BW"}));
    ExampleRunner.eq(40, 156, new RectangleAvoidingColoringEasy().count(new String[]{"???", "???", "???"}));
    ExampleRunner.eq(41, 2, new RectangleAvoidingColoringEasy().count(new String[]{"WWW", "W??", "???"}));
    ExampleRunner.eq(42, 4, new RectangleAvoidingColoringEasy().count(new String[]{"?WB", "W?W", "?W?"}));
    ExampleRunner.eq(43, 408, new RectangleAvoidingColoringEasy().count(new String[]{"????", "????", "????"}));
    ExampleRunner.eq(44, 3, new RectangleAvoidingColoringEasy().count(new String[]{"B?BW", "?BB?", "B??B"}));
    ExampleRunner.eq(45, 28, new RectangleAvoidingColoringEasy().count(new String[]{"?W??", "??W?", "?WB?"}));
    ExampleRunner.eq(46, 408, new RectangleAvoidingColoringEasy().count(new String[]{"???", "???", "???", "???"}));
    ExampleRunner.eq(47, 2, new RectangleAvoidingColoringEasy().count(new String[]{"WB?", "?W?", "?WW", "BWB"}));
    ExampleRunner.eq(48, 14, new RectangleAvoidingColoringEasy().count(new String[]{"???", "?B?", "?BB", "??B"}));
    ExampleRunner.eq(49, 720, new RectangleAvoidingColoringEasy().count(new String[]{"?????", "?????", "?????"}));
    ExampleRunner.eq(50, 0, new RectangleAvoidingColoringEasy().count(new String[]{"WW?BB", "WWWW?", "BBWWW"}));
    ExampleRunner.eq(51, 4, new RectangleAvoidingColoringEasy().count(new String[]{"B?WB?", "??BBB", "??W?B"}));
    ExampleRunner.eq(52, 720, new RectangleAvoidingColoringEasy().count(new String[]{"???", "???", "???", "???", "???"}));
    ExampleRunner.eq(53, 0, new RectangleAvoidingColoringEasy().count(new String[]{"??B", "BBB", "B?W", "?WB", "W?B"}));
    ExampleRunner.eq(54, 4, new RectangleAvoidingColoringEasy().count(new String[]{"B??", "?BW", "W??", "WW?", "WB?"}));
    ExampleRunner.eq(55, 0, new RectangleAvoidingColoringEasy().count(new String[]{"???????", "???????", "???????"}));
    ExampleRunner.eq(56, 0, new RectangleAvoidingColoringEasy().count(new String[]{"?B?WW??", "BW?B??W", "????B?B"}));
    ExampleRunner.eq(57, 0, new RectangleAvoidingColoringEasy().count(new String[]{"???", "???", "???", "???", "???", "???", "???", "???", "???"}));
    ExampleRunner.eq(58, 0, new RectangleAvoidingColoringEasy().count(new String[]{"WWB", "BBB", "BWB", "WWB", "BBB", "WBB"}));
    ExampleRunner.eq(59, 0, new RectangleAvoidingColoringEasy().count(new String[]{"??????????", "??????????", "??????????"}));
    ExampleRunner.eq(60, 0, new RectangleAvoidingColoringEasy().count(new String[]{"BBWBB?BBWB", "BWWBWBWW?W", "WWWWBBWWB?"}));
    ExampleRunner.eq(61, 0, new RectangleAvoidingColoringEasy().count(new String[]{"???", "???", "???", "???", "???", "???", "???", "???", "???", "???"}));
    ExampleRunner.eq(62, 0, new RectangleAvoidingColoringEasy().count(new String[]{"WBW", "WWW", "W?W", "WW?", "WWW", "WWW", "W?W", "WWW", "BWW", "WBW"}));
    ExampleRunner.eq(63, 840, new RectangleAvoidingColoringEasy().count(new String[]{"????", "????", "????", "????"}));
    ExampleRunner.eq(64, 0, new RectangleAvoidingColoringEasy().count(new String[]{"W?W?", "W?WW", "W?W?", "BBWW"}));
    ExampleRunner.eq(65, 3, new RectangleAvoidingColoringEasy().count(new String[]{"B?BW", "W???", "WBWW", "BW??"}));
    ExampleRunner.eq(66, 720, new RectangleAvoidingColoringEasy().count(new String[]{"?????", "?????", "?????", "?????"}));
    ExampleRunner.eq(67, 1, new RectangleAvoidingColoringEasy().count(new String[]{"WB?WB", "?WBBB", "?W?B?", "BBB?W"}));
    ExampleRunner.eq(68, 42, new RectangleAvoidingColoringEasy().count(new String[]{"B????", "B???W", "???B?", "?????"}));
    ExampleRunner.eq(69, 720, new RectangleAvoidingColoringEasy().count(new String[]{"????", "????", "????", "????", "????"}));
    ExampleRunner.eq(70, 0, new RectangleAvoidingColoringEasy().count(new String[]{"?BBB", "B?BB", "BBBB", "BWBB", "B?BB"}));
    ExampleRunner.eq(71, 14, new RectangleAvoidingColoringEasy().count(new String[]{"W???", "?B?W", "?B??", "???W", "?W??"}));
    ExampleRunner.eq(72, 0, new RectangleAvoidingColoringEasy().count(new String[]{"????????", "????????", "????????", "????????"}));
    ExampleRunner.eq(73, 0, new RectangleAvoidingColoringEasy().count(new String[]{"WWBWW?BB", "WB???WBB", "BW??BBBW", "BBWWWWBB"}));
    ExampleRunner.eq(74, 0, new RectangleAvoidingColoringEasy().count(new String[]{"????", "????", "????", "????", "????", "????", "????", "????", "????"}));
    ExampleRunner.eq(75, 0, new RectangleAvoidingColoringEasy().count(new String[]{"WBBB", "BBBB", "W?BB", "WBBB", "WW?B", "B?WB"}));
    ExampleRunner.eq(76, 0, new RectangleAvoidingColoringEasy().count(new String[]{"??????????", "??????????", "??????????", "??????????"}));
    ExampleRunner.eq(77, 0, new RectangleAvoidingColoringEasy().count(new String[]{"BW???W?BBB", "?WBW????B?", "W??????BB?", "W?WBB?B?BW"}));
    ExampleRunner.eq(78, 0, new RectangleAvoidingColoringEasy().count(new String[]{"????", "????", "????", "????", "????", "????", "????", "????", "????", "????"}));
    ExampleRunner.eq(79, 0, new RectangleAvoidingColoringEasy().count(new String[]{"BB??", "?W?B", "BB??", "?BB?", "?B??", "BWBB", "WW??", "WBB?", "??WB", "?W??"}));
    ExampleRunner.eq(80, 0, new RectangleAvoidingColoringEasy().count(new String[]{"????????", "????????", "????????", "????????", "????????", "????????", "????????"}));
    ExampleRunner.eq(81, 0, new RectangleAvoidingColoringEasy().count(new String[]{"WBWWWBWWB", "WWWWWBW?W", "B?WW?W?W?", "WWB?WWWW?", "WWBWWWWBW", "BWWW?WWWB", "B??WBWW?W", "BBB??WWWB", "WWWWWBWWB"}));
    ExampleRunner.eq(82, 0, new RectangleAvoidingColoringEasy().count(new String[]{"????????", "????????", "????????", "????????", "????????", "????????", "????????", "????????"}));
    ExampleRunner.eq(83, 0, new RectangleAvoidingColoringEasy().count(new String[]{"??B?B????", "??BBB?W??", "????B??B?", "?BBBWBW?B", "WB?BB???B", "BW?BB??WW", "?W??B?WW?"}));
    ExampleRunner.eq(84, 0, new RectangleAvoidingColoringEasy().count(new String[]{"??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????"}));
    ExampleRunner.eq(85, 0, new RectangleAvoidingColoringEasy().count(new String[]{"WBBWWBBBWW", "?BB?BBBWWB", "BBBBBBBWWB", "WWBBBBBWWW", "?BWW?BWBWW", "WWWB?WWB?B", "BBBBB?BWBB"}));
    ExampleRunner.eq(86, 0, new RectangleAvoidingColoringEasy().count(new String[]{"???????", "???????", "???????", "???????", "???????", "???????", "???????", "???????", "???????", "???????"}));
    ExampleRunner.eq(87, 0, new RectangleAvoidingColoringEasy().count(new String[]{"WWWWWW", "WWWWWW", "WWWWWW", "WWWWWW", "WWWWWW", "WWWWWW", "?WWWWW", "WWWWWW", "WWWWWW", "WWWWWW"}));
    ExampleRunner.eq(88, 0, new RectangleAvoidingColoringEasy().count(new String[]{"??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????"}));
    ExampleRunner.eq(89, 0, new RectangleAvoidingColoringEasy().count(new String[]{"?BBBWWWBWW", "W??BB??WWW", "?W?BWB?WBB", "WW?WW?BWWW", "WB?WBBBBBW", "?WBW?BWWWW", "WWWBWBBBBB", "WWWBWB?WWB", "WBBBWWBWB?", "BWWWBWBWWW"}));
    ExampleRunner.eq(90, 512, new RectangleAvoidingColoringEasy().count(new String[]{"???B??????"}));
    ExampleRunner.eq(91, 512, new RectangleAvoidingColoringEasy().count(new String[]{"???????B??"}));
    ExampleRunner.eq(92, 512, new RectangleAvoidingColoringEasy().count(new String[]{"?B????????"}));
    ExampleRunner.eq(93, 17152, new RectangleAvoidingColoringEasy().count(new String[]{"??????????", "W?????????"}));
    ExampleRunner.eq(94, 8704, new RectangleAvoidingColoringEasy().count(new String[]{"?????W????", "?B????????"}));
    ExampleRunner.eq(95, 2816, new RectangleAvoidingColoringEasy().count(new String[]{"W?????????", "W?????????"}));
    ExampleRunner.eq(96, 168, new RectangleAvoidingColoringEasy().count(new String[]{"????B", "?????", "??W??"}));
    ExampleRunner.eq(97, 120, new RectangleAvoidingColoringEasy().count(new String[]{"?B???", "?B???", "?????"}));
    ExampleRunner.eq(98, 192, new RectangleAvoidingColoringEasy().count(new String[]{"W????", "?????", "????W"}));
    ExampleRunner.eq(99, 168, new RectangleAvoidingColoringEasy().count(new String[]{"?????", "??B??", "????W", "?????"}));
    ExampleRunner.eq(100, 120, new RectangleAvoidingColoringEasy().count(new String[]{"W????", "?????", "W????", "?????"}));
    ExampleRunner.eq(101, 192, new RectangleAvoidingColoringEasy().count(new String[]{"???B?", "?????", "????B", "?????"}));
    ExampleRunner.eq(102, 512, new RectangleAvoidingColoringEasy().count(new String[]{"B", "?", "?", "?", "?", "?", "?", "?", "?", "?"}));
    ExampleRunner.eq(103, 256, new RectangleAvoidingColoringEasy().count(new String[]{"?", "?", "?", "?", "?", "W", "?", "?", "W", "?"}));
    ExampleRunner.eq(104, 256, new RectangleAvoidingColoringEasy().count(new String[]{"W", "?", "?", "?", "?", "?", "?", "W", "?", "?"}));
    ExampleRunner.eq(105, 17152, new RectangleAvoidingColoringEasy().count(new String[]{"??", "??", "?B", "??", "??", "??", "??", "??", "??", "??"}));
    ExampleRunner.eq(106, 8448, new RectangleAvoidingColoringEasy().count(new String[]{"??", "??", "??", "B?", "??", "??", "??", "??", "B?", "??"}));
    ExampleRunner.eq(107, 8704, new RectangleAvoidingColoringEasy().count(new String[]{"??", "B?", "??", "??", "??", "??", "W?", "??", "??", "??"}));
    ExampleRunner.eq(108, 192, new RectangleAvoidingColoringEasy().count(new String[]{"???", "???", "???", "W??", "?W?"}));
    ExampleRunner.eq(109, 360, new RectangleAvoidingColoringEasy().count(new String[]{"???", "???", "?W?", "???", "???"}));
    ExampleRunner.eq(110, 360, new RectangleAvoidingColoringEasy().count(new String[]{"??W", "???", "???", "???", "???"}));
    ExampleRunner.eq(111, 360, new RectangleAvoidingColoringEasy().count(new String[]{"????", "????", "????", "?W??", "????"}));
    ExampleRunner.eq(112, 144, new RectangleAvoidingColoringEasy().count(new String[]{"???B", "????", "???B", "????", "????"}));
    ExampleRunner.eq(113, 216, new RectangleAvoidingColoringEasy().count(new String[]{"????", "W???", "????", "B???", "????"}));
    ExampleRunner.eq(114, 0, new RectangleAvoidingColoringEasy().count(new String[]{"??????????", "??????????", "???????B??", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????"}));
    ExampleRunner.eq(115, 0, new RectangleAvoidingColoringEasy().count(new String[]{"??????B???", "??????????", "?????????W", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????"}));
    ExampleRunner.eq(116, 0, new RectangleAvoidingColoringEasy().count(new String[]{"??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "?????W????", "??????????", "????????W?"}));
    ExampleRunner.eq(117, 0, new RectangleAvoidingColoringEasy().count(new String[]{"??????", "???B??", "???W??", "??????", "??????", "??????", "??????"}));
    ExampleRunner.eq(118, 64, new RectangleAvoidingColoringEasy().count(new String[]{"?W?????"}));
    ExampleRunner.eq(119, 0, new RectangleAvoidingColoringEasy().count(new String[]{"???", "???", "???", "???", "???", "???", "??B", "???", "???"}));
    ExampleRunner.eq(120, 512, new RectangleAvoidingColoringEasy().count(new String[]{"????????B?"}));
    ExampleRunner.eq(121, 0, new RectangleAvoidingColoringEasy().count(new String[]{"???????W", "????????", "????????", "????????", "????????", "W???????"}));
    ExampleRunner.eq(122, 16, new RectangleAvoidingColoringEasy().count(new String[]{"W", "?", "?", "?", "?", "W"}));
    ExampleRunner.eq(123, 216, new RectangleAvoidingColoringEasy().count(new String[]{"?????", "?????", "W??B?", "?????"}));
    ExampleRunner.eq(124, 0, new RectangleAvoidingColoringEasy().count(new String[]{"???", "???", "???", "???", "???", "???", "???", "???", "???", "?W?"}));
    ExampleRunner.eq(125, 360, new RectangleAvoidingColoringEasy().count(new String[]{"??????", "?W????", "??????"}));
    ExampleRunner.eq(126, 64, new RectangleAvoidingColoringEasy().count(new String[]{"?B?????W"}));
    ExampleRunner.eq(127, 0, new RectangleAvoidingColoringEasy().count(new String[]{"?B????", "??????", "??????", "??????", "??????", "??????"}));
    ExampleRunner.eq(128, 360, new RectangleAvoidingColoringEasy().count(new String[]{"??????", "??????", "W?????"}));
    ExampleRunner.eq(129, 0, new RectangleAvoidingColoringEasy().count(new String[]{"???????", "???????", "???????", "???????", "???????", "????B??", "???????"}));
    ExampleRunner.eq(130, 720, new RectangleAvoidingColoringEasy().count(new String[]{"??????", "??????", "??????"}));
    ExampleRunner.eq(131, 16, new RectangleAvoidingColoringEasy().count(new String[]{"WBW??B", "??????", "?WW???"}));
    ExampleRunner.eq(132, 6, new RectangleAvoidingColoringEasy().count(new String[]{"????WW", "WW??W?", "???W??"}));
    ExampleRunner.eq(133, 720, new RectangleAvoidingColoringEasy().count(new String[]{"??????", "??????", "??????", "??????"}));
    ExampleRunner.eq(134, 2, new RectangleAvoidingColoringEasy().count(new String[]{"?WB???", "?B?W??", "??BWBW", "?WW???"}));
    ExampleRunner.eq(135, 84, new RectangleAvoidingColoringEasy().count(new String[]{"????BB", "??????", "??????", "?B????"}));
    ExampleRunner.eq(136, 720, new RectangleAvoidingColoringEasy().count(new String[]{"???", "???", "???", "???", "???", "???"}));
    ExampleRunner.eq(137, 1, new RectangleAvoidingColoringEasy().count(new String[]{"BW?", "?W?", "?BB", "W??", "?WW", "???"}));
    ExampleRunner.eq(138, 6, new RectangleAvoidingColoringEasy().count(new String[]{"?W?", "??B", "B?W", "???", "?W?", "?W?"}));
    ExampleRunner.eq(139, 720, new RectangleAvoidingColoringEasy().count(new String[]{"????", "????", "????", "????", "????", "????"}));
    ExampleRunner.eq(140, 0, new RectangleAvoidingColoringEasy().count(new String[]{"?B?B", "?WBB", "??BW", "?WB?", "?W?W", "B?WB"}));
    ExampleRunner.eq(141, 2, new RectangleAvoidingColoringEasy().count(new String[]{"W???", "?B??", "W??W", "??W?", "B???", "B??B"}));
    ExampleRunner.eq(142, 360, new RectangleAvoidingColoringEasy().count(new String[]{"??????", "??????", "????B?"}));
    ExampleRunner.eq(143, 360, new RectangleAvoidingColoringEasy().count(new String[]{"??????", "W?????", "??????"}));
    ExampleRunner.eq(144, 240, new RectangleAvoidingColoringEasy().count(new String[]{"????W?", "????B?", "??????"}));
    ExampleRunner.eq(145, 216, new RectangleAvoidingColoringEasy().count(new String[]{"?BW???", "??????", "??????", "??????"}));
    ExampleRunner.eq(146, 192, new RectangleAvoidingColoringEasy().count(new String[]{"??B???", "?????B", "??????", "??????"}));
    ExampleRunner.eq(147, 144, new RectangleAvoidingColoringEasy().count(new String[]{"??????", "??????", "???W?W", "??????"}));
    ExampleRunner.eq(148, 360, new RectangleAvoidingColoringEasy().count(new String[]{"???", "B??", "???", "???", "???", "???"}));
    ExampleRunner.eq(149, 360, new RectangleAvoidingColoringEasy().count(new String[]{"???", "??W", "???", "???", "???", "???"}));
    ExampleRunner.eq(150, 360, new RectangleAvoidingColoringEasy().count(new String[]{"???", "???", "??B", "???", "???", "???"}));
    ExampleRunner.eq(151, 360, new RectangleAvoidingColoringEasy().count(new String[]{"????", "B???", "????", "????", "????", "????"}));
    ExampleRunner.eq(152, 360, new RectangleAvoidingColoringEasy().count(new String[]{"????", "????", "????", "????", "????", "W???"}));
    ExampleRunner.eq(153, 192, new RectangleAvoidingColoringEasy().count(new String[]{"B???", "????", "????", "????", "?B??", "????"}));
    ExampleRunner.eq(154, 0, new RectangleAvoidingColoringEasy().count(new String[]{"?????", "?????", "?????", "?????", "?????"}));
    ExampleRunner.eq(155, 0, new RectangleAvoidingColoringEasy().count(new String[]{"W???W", "WB?WB", "??B??", "WWW??", "W??WW"}));
    ExampleRunner.eq(156, 0, new RectangleAvoidingColoringEasy().count(new String[]{"??????", "??????", "??????", "??????", "??????"}));
    ExampleRunner.eq(157, 0, new RectangleAvoidingColoringEasy().count(new String[]{"W?WWBBW?B", "BW?W?BWB?", "BBBBBBWBW", "BBWWBWBWW", "WWBWWBWBW"}));
    ExampleRunner.eq(158, 0, new RectangleAvoidingColoringEasy().count(new String[]{"?????", "?????", "?????", "?????", "?????", "?????"}));
    ExampleRunner.eq(159, 0, new RectangleAvoidingColoringEasy().count(new String[]{"BWWBB", "BWBBB", "WBWWW", "BWBWW", "WBWB?", "BWBWB", "BBBBB"}));
    ExampleRunner.eq(160, 0, new RectangleAvoidingColoringEasy().count(new String[]{"??????????", "??????????", "??????????", "??????????", "??????????"}));
    ExampleRunner.eq(161, 0, new RectangleAvoidingColoringEasy().count(new String[]{"BBBBB??WBB", "BB??BBBBBW", "WWBBBBBWBB", "BW?WB?BB?W", "B?BWBW?BBB"}));
    ExampleRunner.eq(162, 0, new RectangleAvoidingColoringEasy().count(new String[]{"?????", "?????", "?????", "?????", "?????", "?????", "?????", "?????", "?????", "?????"}));
    ExampleRunner.eq(163, 0, new RectangleAvoidingColoringEasy().count(new String[]{"??W?W", "W?BWW", "?WW?W", "???W?", "???WW", "???W?", "W?WWW", "WW?WW", "WW??W", "???BW"}));
    ExampleRunner.eq(164, 0, new RectangleAvoidingColoringEasy().count(new String[]{"B???????W?", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "?????B????", "??????W???", "??????????"}));
    ExampleRunner.eq(165, 0, new RectangleAvoidingColoringEasy().count(new String[]{"WB??B?????", "WB??B?????", "WB??B?????", "WB??B???BB", "WB??B?????", "WB??B?WW??", "WB??B?????", "WB??B??B??", "WB??B?????", "WB??B?W???"}));
    ExampleRunner.eq(166, 0, new RectangleAvoidingColoringEasy().count(new String[]{"??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????", "??????????"}));
    ExampleRunner.eq(167, 12, new RectangleAvoidingColoringEasy().count(new String[]{"??B??", "W???W", "??B??"}));
    ExampleRunner.eq(168, 8, new RectangleAvoidingColoringEasy().count(new String[]{"W???B", "?W??B", "W????", "??B?W"}));
  }
}
