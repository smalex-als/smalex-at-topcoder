package p500.srm525;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 1/5/12
 * Time: 8:11 PM
 */
public class RainyRoad {
  public String isReachable(String[] road) {
    for (int i = 0; i < road[0].length(); i++) {
      if (road[0].charAt(i) == 'W' && road[1].charAt(i) == 'W') {
        return "NO";
      }
    }
    return "YES";
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, "YES", new RainyRoad().isReachable(new String[]{".W..", "...."}));
    ExampleRunner.eq(2, "YES", new RainyRoad().isReachable(new String[]{".W..", "..W."}));
    ExampleRunner.eq(3, "NO", new RainyRoad().isReachable(new String[]{".W..W..", "...WWW."}));
    ExampleRunner.eq(4, "YES", new RainyRoad().isReachable(new String[]{"..", "WW"}));
    ExampleRunner.eq(5, "NO", new RainyRoad().isReachable(new String[]{".WWWW.", "WWWWWW"}));
    ExampleRunner.eq(6, "YES", new RainyRoad().isReachable(new String[]{".W.W.W.", "W.W.W.W"}));
    ExampleRunner.eq(7, "NO", new RainyRoad().isReachable(new String[]{".............................................W.", ".............................................W."}));
    ExampleRunner.eq(8, "YES", new RainyRoad().isReachable(new String[]{"..", "W."}));
    ExampleRunner.eq(9, "YES", new RainyRoad().isReachable(new String[]{"..", ".."}));
    ExampleRunner.eq(10, "YES", new RainyRoad().isReachable(new String[]{"..", ".W"}));
    ExampleRunner.eq(11, "NO", new RainyRoad().isReachable(new String[]{".W.", "WWW"}));
    ExampleRunner.eq(12, "YES", new RainyRoad().isReachable(new String[]{".W.", "W.W"}));
    ExampleRunner.eq(13, "YES", new RainyRoad().isReachable(new String[]{"...", "..."}));
    ExampleRunner.eq(14, "YES", new RainyRoad().isReachable(new String[]{".W...", "W...."}));
    ExampleRunner.eq(15, "YES", new RainyRoad().isReachable(new String[]{"...W......", "WW..W.W.W."}));
    ExampleRunner.eq(16, "YES", new RainyRoad().isReachable(new String[]{"....WW.......W.", ".WW...WW......W"}));
    ExampleRunner.eq(17, "YES", new RainyRoad().isReachable(new String[]{"..W.W....W..........", "WW..............W.WW"}));
    ExampleRunner.eq(18, "YES", new RainyRoad().isReachable(new String[]{"........W......W...W.....", "W.WW........WW........W.."}));
    ExampleRunner.eq(19, "YES", new RainyRoad().isReachable(new String[]{"..................................................", "W................................................."}));
    ExampleRunner.eq(20, "YES", new RainyRoad().isReachable(new String[]{"..................................................", ".WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW"}));
    ExampleRunner.eq(21, "YES", new RainyRoad().isReachable(new String[]{".WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW.", "W................................................W"}));
    ExampleRunner.eq(22, "YES", new RainyRoad().isReachable(new String[]{".WWWWW.", "W.....W"}));
    ExampleRunner.eq(23, "YES", new RainyRoad().isReachable(new String[]{"..WW.WW.WWW.WWWWWWWWW.W.W.", "WW..W..W...W.........W.W.W"}));
    ExampleRunner.eq(24, "YES", new RainyRoad().isReachable(new String[]{".WWWWW.WWWWW.WWWW.WW.WWWWWW..WWWWWWWWWWWWWWW.", "......W.....W....W..W......WW................"}));
    ExampleRunner.eq(25, "YES", new RainyRoad().isReachable(new String[]{".W.....", "......W"}));
    ExampleRunner.eq(26, "YES", new RainyRoad().isReachable(new String[]{".WWW.W....W...........W...", "...............W........WW"}));
    ExampleRunner.eq(27, "YES", new RainyRoad().isReachable(new String[]{"............W..W........W...........WW.......", "......W..........W.....W.................W..."}));
    ExampleRunner.eq(28, "NO", new RainyRoad().isReachable(new String[]{".WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW.", ".WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW"}));
    ExampleRunner.eq(29, "NO", new RainyRoad().isReachable(new String[]{"...WW...W.WWW.WWWWWW.W..WW.WWWW.......WWWW.WWW..W.", "W..WW...W.WWW.WWWWWW.W..WW.WWWW.......WWWW.WWW..WW"}));
    ExampleRunner.eq(30, "NO", new RainyRoad().isReachable(new String[]{".W.W..W.W..W.WW...W..W.WW..W.W..WW..W.............", "WW...W.........W.W.WWW.W.WW.W..W......W..WW.WWWW.W"}));
    ExampleRunner.eq(31, "NO", new RainyRoad().isReachable(new String[]{".W..WWW.W..W.WWW......W.W......W..W.W.WWW.WW.WWW..", ".W..WWW.W..W.WWW......W.W......W..W.W.WWW.WW.WWW.."}));
    ExampleRunner.eq(32, "NO", new RainyRoad().isReachable(new String[]{"..W.W.WW..W.W.WW..WWWWWW.WW....W....W........W....", ".WWW.W..W..W....W...W.WWW..WW.W.WWWW..WW.......WW."}));
    ExampleRunner.eq(33, "YES", new RainyRoad().isReachable(new String[]{"..W..W.", "WW.WW.W"}));
    ExampleRunner.eq(34, "NO", new RainyRoad().isReachable(new String[]{".WWWWW.WWWWWWWWWWWWWWW..W.", "....W.W.....W..WW...W.WW.."}));
    ExampleRunner.eq(35, "NO", new RainyRoad().isReachable(new String[]{".WWWWWWWWWWWWWWW.WW.W.WWWW.W..W.W.W.WWWWWWWW.", "....W.....WWWW..W..WWWWW.WW.WW.WWW.WW.....W.W"}));
    ExampleRunner.eq(36, "NO", new RainyRoad().isReachable(new String[]{"....WW.", "....WWW"}));
    ExampleRunner.eq(37, "NO", new RainyRoad().isReachable(new String[]{".WWW...WW.W.W.W.WW....WWW.", "W.W....WW.WWW...W...W.W.WW"}));
    ExampleRunner.eq(38, "NO", new RainyRoad().isReachable(new String[]{".WWW..W....WWWW..W.WWWW.WWWW....W..WW.WW..W..", "WWWW...W..W..W.WW..W.WW.WWW..W...W..W.WW...W."}));
    ExampleRunner.eq(39, "NO", new RainyRoad().isReachable(new String[]{".W.W.W.", "WWWW.WW"}));
    ExampleRunner.eq(40, "NO", new RainyRoad().isReachable(new String[]{".W.W.WWWWWWWWW.WWW.WWWWW..", "WW.W.W.WWWWW.W.WWW.WWW.WW."}));
    ExampleRunner.eq(41, "NO", new RainyRoad().isReachable(new String[]{".W.WW.WWWWWWW.WWWWWWW.W.WWWWWWWWW.W..WWWWWWW.", ".WWWWWW.WWWWW.W..WWWWWW.WWWWWWWWW.W.WWWWWWWW."}));
    ExampleRunner.eq(42, "NO", new RainyRoad().isReachable(new String[]{".WWWWW.", "WWWWWW."}));
    ExampleRunner.eq(43, "NO", new RainyRoad().isReachable(new String[]{".WWWWWWWWWWWWWWWWWWWWWWWW.", "WWWWWWWWWWWWWWWWWWWWWWWWW."}));
    ExampleRunner.eq(44, "NO", new RainyRoad().isReachable(new String[]{".WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW.", "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW."}));
    ExampleRunner.eq(45, "NO", new RainyRoad().isReachable(new String[]{".W.............................................", ".W............................................."}));
    ExampleRunner.eq(46, "YES", new RainyRoad().isReachable(new String[]{".W..", "..W."}));
    ExampleRunner.eq(47, "YES", new RainyRoad().isReachable(new String[]{".W.W.W.", "W.W.W.W"}));
    ExampleRunner.eq(48, "YES", new RainyRoad().isReachable(new String[]{".W..", "...."}));
    ExampleRunner.eq(49, "NO", new RainyRoad().isReachable(new String[]{".W..", ".W.."}));
    ExampleRunner.eq(50, "NO", new RainyRoad().isReachable(new String[]{".W.", ".W."}));
    ExampleRunner.eq(51, "YES", new RainyRoad().isReachable(new String[]{"..W.", ".W.."}));
    ExampleRunner.eq(52, "YES", new RainyRoad().isReachable(new String[]{"...", ".W."}));
    ExampleRunner.eq(53, "NO", new RainyRoad().isReachable(new String[]{".WW.", "..W."}));
    ExampleRunner.eq(54, "NO", new RainyRoad().isReachable(new String[]{".W..W..", "...WWW."}));
    ExampleRunner.eq(55, "NO", new RainyRoad().isReachable(new String[]{"...W.", "...W."}));
    ExampleRunner.eq(56, "NO", new RainyRoad().isReachable(new String[]{".............................................W.", ".............................................W."}));
    ExampleRunner.eq(57, "YES", new RainyRoad().isReachable(new String[]{".W.", "W.W"}));
    ExampleRunner.eq(58, "NO", new RainyRoad().isReachable(new String[]{"...........................................W...", "...........................................W..."}));
  }
}
