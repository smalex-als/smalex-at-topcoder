package p300.srm382;

import utils.ExampleRunner;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by smalex on 27/05/15.
 */
public class CollectingRiders {
  public int minimalMoves(String[] board) {
    int res = Integer.MAX_VALUE;
    final int NY = board.length;
    final int NX = board[0].length();
    for (int y = 0; y < NY; y++) {
       loop: for (int x = 0; x < NX; x++) {
        final int[][] grid = new int[NY][NX];
        for (int[] row : grid) {
          Arrays.fill(row, -1);
        }
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(y * 100 + x);
        grid[y][x] = 0;
        while (!q.isEmpty()) {
          final Integer next = q.poll();
          int nx = next % 100;
          int ny = next / 100;
          int count = grid[ny][nx] + 1;
          for (int dd = -2; dd <= 2; dd++) {
            for (int kk = -2; kk <= 2; kk++) {
              if (Math.abs(dd * kk) == 2) {
                int nextX = dd + nx;
                int nextY = kk + ny;
                if (nextX >= 0 && nextY >= 0 && nextY < NY && nextX < NX && grid[nextY][nextX] == -1) {
                  grid[nextY][nextX] = count;
                  q.add(nextY * 100 + nextX);
                }
              }
            }
          }
        }

        int ans = 0;
        for (int j = 0; j < NY; j++) {
          for (int i = 0; i < NX; i++) {
            int val = board[j].charAt(i);
            if (val >= '1' && val <= '9') {
              if (grid[j][i] < 0) {
                continue loop;
              }
              final int len = val - '0';
              ans += (grid[j][i] + len - 1) / len;
            }
          }
        }
        res = Math.min(res, ans);
      }
    }
    return res == Integer.MAX_VALUE ? -1 : res;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 2, new CollectingRiders().minimalMoves(new String[]{"...1", "....", "2..."}));
    ExampleRunner.eq(2, 2, new CollectingRiders().minimalMoves(new String[]{"........", ".1......", "........", "....3...", "........", "........", ".7......", "........"}));
    ExampleRunner.eq(3, 0, new CollectingRiders().minimalMoves(new String[]{"..", "2.", ".."}));
    ExampleRunner.eq(4, -1, new CollectingRiders().minimalMoves(new String[]{".1....1."}));
    ExampleRunner.eq(5, 121, new CollectingRiders().minimalMoves(new String[]{"9133632343", "5286698232", "8329333369", "5425579782", "4465864375", "8192124686", "3191624314", "5198496853", "1638163997", "6457337215"}));
    ExampleRunner.eq(6, -1, new CollectingRiders().minimalMoves(new String[]{"1..", ".1.", "..."}));
    ExampleRunner.eq(7, 2, new CollectingRiders().minimalMoves(new String[]{"1...1", "....."}));
    ExampleRunner.eq(8, 266, new CollectingRiders().minimalMoves(new String[]{"1111111111", "1111111111", "1111111111", "1111111111", "1111111111", "1111111111", "1111111111", "1111111111", "1111111111", "1111111111"}));
    ExampleRunner.eq(9, 19, new CollectingRiders().minimalMoves(new String[]{"..45.....5", ".......5..", ".........2", "3.9......1", ".....2....", "..1.......", "......68..", "....1..9..", "..........", "......5..7"}));
    ExampleRunner.eq(10, 15, new CollectingRiders().minimalMoves(new String[]{"..........", "1....4.7..", "9.2.......", "....3.9...", "......2.4.", "3......9..", "......8...", ".....7..7.", "...8....5.", ".........."}));
    ExampleRunner.eq(11, 21, new CollectingRiders().minimalMoves(new String[]{".1.....2..", "6.8......8", "....6.7...", "..........", "9.........", "....16....", "....1.....", "..7.....2.", "..86......", "...1......"}));
    ExampleRunner.eq(12, 24, new CollectingRiders().minimalMoves(new String[]{".........5", "3.........", ".....2.578", "..4...1...", ".....72...", ".2........", "...41....9", ".........5", "64..9..499", "...4.....9"}));
    ExampleRunner.eq(13, 24, new CollectingRiders().minimalMoves(new String[]{".........2", ".16.1..6..", "........34", ".....6....", "..21.3....", "2......9..", "78........", "23.4......", ".....7....", "4........."}));
    ExampleRunner.eq(14, 24, new CollectingRiders().minimalMoves(new String[]{".....31396", ".37.......", "..6.....8.", ".8........", "........3.", "......3..8", ".........2", ".......4..", "...9....7.", "...17.4..."}));
    ExampleRunner.eq(15, 33, new CollectingRiders().minimalMoves(new String[]{"281..5....", ".99.....8.", "....26.5..", "598....1..", "....6.....", "........9.", "...9.2...6", "..2.......", "..21...8..", ".4..1.6..."}));
    ExampleRunner.eq(16, 22, new CollectingRiders().minimalMoves(new String[]{"......7...", "...49...5.", "..........", ".7........", "..19.9....", "..........", ".43.572.9.", "....3.....", "6.........", "2....54.1."}));
    ExampleRunner.eq(17, 17, new CollectingRiders().minimalMoves(new String[]{"..........", "..9..9....", "..........", "4.3.......", "......7...", "...1.3....", "....2.6..2", "7......9.8", "..........", "..7.4....2"}));
    ExampleRunner.eq(18, 23, new CollectingRiders().minimalMoves(new String[]{"...7.7....", ".5........", "..6..63...", "....9.....", ".4...6....", "..8....5..", "6..6.9...7", "....91.6.6", "...6.7..28", ".........."}));
    ExampleRunner.eq(19, 55, new CollectingRiders().minimalMoves(new String[]{"213.9.3.87", "..8.1.2..4", "..5.8.81.2", "9.3..2.2..", "...175.4..", ".1.....65.", ".5.1...221", "....4...86", ".7367.1...", "..74....8."}));
    ExampleRunner.eq(20, 65, new CollectingRiders().minimalMoves(new String[]{"7.82.27..5", "..9.735.56", "..924..9..", "....86744.", ".94.47.6..", "13.8...145", ".7137.7431", ".3.8664...", "355247.76.", "5...538..3"}));
    ExampleRunner.eq(21, 58, new CollectingRiders().minimalMoves(new String[]{".7546.58.8", "27.7..5.7.", "6..1....8.", "33.72.5.83", "..1..3.42.", "5978998.68", "...1..99..", ".....9.7..", "...2.635.6", ".23558.8.1"}));
    ExampleRunner.eq(22, 56, new CollectingRiders().minimalMoves(new String[]{"73...971..", "1..888....", ".6532.2..4", "...4....24", "..71.27.6.", "......3...", "..6...6333", "8377..919.", "2.99276..7", "...15.4768"}));
    ExampleRunner.eq(23, 67, new CollectingRiders().minimalMoves(new String[]{"162....973", "659....2.1", "7....2.68.", "1.447973.4", "7.49472..7", ".26.55.8..", "31..496.3.", "3.....4539", ".8.6....65", "39.4..1.37"}));
    ExampleRunner.eq(24, 55, new CollectingRiders().minimalMoves(new String[]{"241.6.21..", ".1.8422...", ".11...47..", ".....13...", ".542.5..19", "73..86.6.1", "86.5..8.8.", "88..33...2", ".6..7...6.", "..6....89."}));
    ExampleRunner.eq(25, 68, new CollectingRiders().minimalMoves(new String[]{"4652.1..1.", "3.6...8.16", ".1852.2..7", "3.5..73515", "467.1716..", ".7338895..", ".54458.4..", "....14..48", "4...4.7..3", "..24...7.4"}));
    ExampleRunner.eq(26, 70, new CollectingRiders().minimalMoves(new String[]{"99246.938.", "7.1574..26", "...1.2..8.", "..1..67.4.", "27..585499", "...9298...", "4518.4.6.6", "4.52...64.", "..7.1..214", ".634.85748"}));
    ExampleRunner.eq(27, 59, new CollectingRiders().minimalMoves(new String[]{"13794654.3", ".5..8....5", ".4165.7239", "...571...2", "1..7.326..", "3.9.....23", "....556.6.", ".7.1.5.67.", "5.7.3.272.", ".....7...8"}));
    ExampleRunner.eq(28, 57, new CollectingRiders().minimalMoves(new String[]{"4..48.1...", "2..276...5", "....5.38.5", ".4165.63..", "1.44..18.2", ".12.8.5..4", "..8.4.6752", "..........", "2.3.8....3", "56.1..75.6"}));
    ExampleRunner.eq(29, 111, new CollectingRiders().minimalMoves(new String[]{"15547.4317", "439872379.", ".782452356", "3968.92516", "1652562..8", "3585131598", "68141..218", "7599185894", ".327957657", "3518387255"}));
    ExampleRunner.eq(30, 103, new CollectingRiders().minimalMoves(new String[]{"3996234424", "4442382957", "2.6.1.6327", "728.679314", "1647466885", "9.5.572729", ".239875365", "3543553254", "7333413824", "97.2773..8"}));
    ExampleRunner.eq(31, 104, new CollectingRiders().minimalMoves(new String[]{"5793558.43", "42.7259878", "33.2554566", "86569843.3", "7745263213", "2.8..45715", "177167.5.4", "5344981581", "9853.57573", "14.4613.26"}));
    ExampleRunner.eq(32, 111, new CollectingRiders().minimalMoves(new String[]{"8237388739", "86.9123298", "9136821564", "3.2.8.4.87", "2223443815", "4336488723", "4893881933", "82.27.9363", "72236.17.1", "6.324..912"}));
    ExampleRunner.eq(33, 115, new CollectingRiders().minimalMoves(new String[]{"6879226641", "7.2177511.", ".3387679.4", "1.4866673.", "4266184392", "..85531144", "499.436423", "1976252338", "..81216952", "864413.322"}));
    ExampleRunner.eq(34, 116, new CollectingRiders().minimalMoves(new String[]{"1313425.8.", "127514713.", "8464478343", "61.9112319", "26.5381138", "5996564485", "6418..7597", "1467249846", "916.71.63.", "5713.12355"}));
    ExampleRunner.eq(35, 102, new CollectingRiders().minimalMoves(new String[]{"679695.26.", "4636447929", "2685.22531", "4965253539", "2297915622", "3653426524", "633.91.385", "579.646697", "36447851.6", "549378.179"}));
    ExampleRunner.eq(36, 109, new CollectingRiders().minimalMoves(new String[]{"27885.4823", "4273918.36", "3466117894", "9295268811", "974596897.", "3348976659", "53994662.1", "6997.53193", "6.64479139", "3.36765344"}));
    ExampleRunner.eq(37, 111, new CollectingRiders().minimalMoves(new String[]{"3775657264", "7285935211", "1237.25542", "7889337885", "65.7455494", "5.2.534946", "9216291322", "8325399592", "5633212646", "6856953597"}));
    ExampleRunner.eq(38, 119, new CollectingRiders().minimalMoves(new String[]{"811533.1.4", "8612211243", "3828699715", "6845791.4.", "8756427734", "398..21672", "2983968918", "8518958654", "7843167.78", "1324236265"}));
    ExampleRunner.eq(39, 11, new CollectingRiders().minimalMoves(new String[]{"..........", "......1...", "....1.....", "......1..1", "..........", "..........", ".....1....", "..........", "..........", ".....1...."}));
    ExampleRunner.eq(40, 13, new CollectingRiders().minimalMoves(new String[]{"........11", "..........", "1.........", "..........", ".1........", "..........", "..........", "..........", "..........", "...1......"}));
    ExampleRunner.eq(41, 0, new CollectingRiders().minimalMoves(new String[]{"..........", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "........1.", ".........."}));
    ExampleRunner.eq(42, 8, new CollectingRiders().minimalMoves(new String[]{"..........", "......1...", "..........", "..........", "....1.....", "..........", "..........", "...1....1.", "..........", ".........."}));
    ExampleRunner.eq(43, 7, new CollectingRiders().minimalMoves(new String[]{"..........", "1.........", "..........", "..........", "..........", "..........", "......1...", "..........", "..........", "1........."}));
    ExampleRunner.eq(44, 6, new CollectingRiders().minimalMoves(new String[]{"..........", "..........", "..........", "1.........", "..........", "..1..1....", "..........", ".....1....", "..........", ".........."}));
    ExampleRunner.eq(45, 8, new CollectingRiders().minimalMoves(new String[]{"..........", "..........", "......1...", "...1......", "..........", "..........", "..........", "..1.......", "..........", "....1....."}));
    ExampleRunner.eq(46, 17, new CollectingRiders().minimalMoves(new String[]{"..........", "..1.......", "1.........", "....1....1", "........1.", "....1.....", ".......1..", "..........", ".....1....", ".........."}));
    ExampleRunner.eq(47, 14, new CollectingRiders().minimalMoves(new String[]{"...1......", "......1...", "..........", "..........", "..........", "..........", ".........1", "..........", ".......1.1", "......1..."}));
    ExampleRunner.eq(48, 11, new CollectingRiders().minimalMoves(new String[]{"..........", "..........", "11........", "..........", "..........", ".........1", "..........", "..........", "..........", ".......1.."}));
    ExampleRunner.eq(49, 14, new CollectingRiders().minimalMoves(new String[]{"..........", ".2....2...", "......2...", "1.........", "...2.1....", "...1......", "..........", ".......21.", "..........", ".........."}));
    ExampleRunner.eq(50, 28, new CollectingRiders().minimalMoves(new String[]{"...3.1.3..", "....2.321.", "..2...3...", "..32......", ".......1..", "...13.....", "..........", "......2.3.", "..21..32..", "......3..."}));
    ExampleRunner.eq(51, 22, new CollectingRiders().minimalMoves(new String[]{"..1.......", "...1......", "....1.....", "3......2..", ".2........", "..........", ".....1....", ".3.....2..", "2......1..", ".1..3....."}));
    ExampleRunner.eq(52, 28, new CollectingRiders().minimalMoves(new String[]{"..2.1.1...", "2..3...1..", "..........", "........3.", "3......1..", ".....2....", "2........1", ".....1.3..", "..........", "......2.1."}));
    ExampleRunner.eq(53, 44, new CollectingRiders().minimalMoves(new String[]{"...3......", ".1..32...2", "..2.......", "...1.12...", "2..1.2.2.1", ".......321", "1.......1.", ".....1....", ".3...2....", ".1...1...."}));
    ExampleRunner.eq(54, 17, new CollectingRiders().minimalMoves(new String[]{"..........", "..3....1..", "..3.1.....", "1.3.3.....", "..........", "..........", "3......1..", "....2...3.", ".....2....", ".........."}));
    ExampleRunner.eq(55, 28, new CollectingRiders().minimalMoves(new String[]{"..........", "...2......", "........1.", ".....1..1.", "3......313", ".2...2....", ".........1", "..2...2.13", "..........", "....13...."}));
    ExampleRunner.eq(56, 26, new CollectingRiders().minimalMoves(new String[]{".......3..", ".2...2....", ".3...3...3", ".....3....", ".3.....3..", ".....1....", ".11.....3.", "..1...2.1.", "........2.", "...1......"}));
    ExampleRunner.eq(57, 28, new CollectingRiders().minimalMoves(new String[]{".....3.1.3", "...22..12.", "........22", "1..3......", "3........2", ".....3....", "1.........", "..........", "..........", "..2..2...."}));
    ExampleRunner.eq(58, 24, new CollectingRiders().minimalMoves(new String[]{"3.........", "........3.", "2.2.....2.", ".....3....", "....3....1", ".3.....33.", "...1......", ".........3", "..2....3..", "..12.2...."}));
    ExampleRunner.eq(59, 2, new CollectingRiders().minimalMoves(new String[]{"1.", "..", "..", "..", "1."}));
    ExampleRunner.eq(60, -1, new CollectingRiders().minimalMoves(new String[]{"1.", "..", "..", "..", "..", "1."}));
    ExampleRunner.eq(61, -1, new CollectingRiders().minimalMoves(new String[]{"1....1", "......"}));
    ExampleRunner.eq(62, 4, new CollectingRiders().minimalMoves(new String[]{"........", "...1.1..", "........", "........", "........", "...1.1..", "........", "........"}));
    ExampleRunner.eq(63, 121, new CollectingRiders().minimalMoves(new String[]{"9133632343", "5286698232", "8329333369", "5425579782", "4465864375", "8192124686", "3191624314", "5198496853", "1638163997", "6457337215"}));
    ExampleRunner.eq(64, -1, new CollectingRiders().minimalMoves(new String[]{"...", ".99", "..."}));
    ExampleRunner.eq(65, 139, new CollectingRiders().minimalMoves(new String[]{"232..11123", "323.323232", "23.1232323", "3232323232", "121.12121.", "3232323232", "1111653278", "21326.5487", "1914181613", "2323232323"}));
    ExampleRunner.eq(66, 103, new CollectingRiders().minimalMoves(new String[]{".73363234.", "522367.654", "8323243369", "54..576782", ".578564375", "8194364686", "3129865557", "5134754353", "1356733997", ".87654551."}));
    ExampleRunner.eq(67, 4, new CollectingRiders().minimalMoves(new String[]{"1...1", ".....", ".....", ".1.1.", "....."}));
    ExampleRunner.eq(68, -1, new CollectingRiders().minimalMoves(new String[]{".1111"}));
    ExampleRunner.eq(69, 7, new CollectingRiders().minimalMoves(new String[]{"123", "4.5", "678"}));
    ExampleRunner.eq(70, 1, new CollectingRiders().minimalMoves(new String[]{"..........", ".........1", "..........", "..........", "..........", "..........", "..........", "..........", "..........", "9........."}));
    ExampleRunner.eq(71, 4, new CollectingRiders().minimalMoves(new String[]{"1..", "...", "..1"}));
    ExampleRunner.eq(72, -1, new CollectingRiders().minimalMoves(new String[]{"1..", ".1.", "..1"}));
    ExampleRunner.eq(73, 2, new CollectingRiders().minimalMoves(new String[]{"..1..", "1...1"}));
    ExampleRunner.eq(74, -1, new CollectingRiders().minimalMoves(new String[]{"..", "29", ".."}));
    ExampleRunner.eq(75, 266, new CollectingRiders().minimalMoves(new String[]{"1111111111", "1111111111", "1111111111", "1111111111", "1111111111", "1111111111", "1111111111", "1111111111", "1111111111", "1111111111"}));
    ExampleRunner.eq(76, 233, new CollectingRiders().minimalMoves(new String[]{"1111111111", "1111111111", "1111111111", "1111111111", "1111111111", "1111111111", "2222222222", "2222222222", "2222222222", "1111111111"}));
    ExampleRunner.eq(77, -1, new CollectingRiders().minimalMoves(new String[]{"1.", ".1"}));
    ExampleRunner.eq(78, -1, new CollectingRiders().minimalMoves(new String[]{"1....1", "..1..."}));
    ExampleRunner.eq(79, -1, new CollectingRiders().minimalMoves(new String[]{"9..9"}));
    ExampleRunner.eq(80, -1, new CollectingRiders().minimalMoves(new String[]{"1111"}));
    ExampleRunner.eq(81, -1, new CollectingRiders().minimalMoves(new String[]{"99"}));
    ExampleRunner.eq(82, 4, new CollectingRiders().minimalMoves(new String[]{"1...1", ".....", "1...1"}));
    ExampleRunner.eq(83, 4, new CollectingRiders().minimalMoves(new String[]{"1.1", "...", "..1"}));
    ExampleRunner.eq(84, -1, new CollectingRiders().minimalMoves(new String[]{".111"}));
    ExampleRunner.eq(85, 89, new CollectingRiders().minimalMoves(new String[]{"999999999", "999999999", "999999999", "999999999", "999999999", "999999999", "999989999", "999999999", "999999991", "999999999"}));
  }
}
