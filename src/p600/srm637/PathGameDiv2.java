package p600.srm637;

import utils.ExampleRunner;

/**
 * Created by smalex on 18/05/15.
 */
public class PathGameDiv2 {
  public int calc(String[] board) {
    final int N = board[0].length();
    int res = Math.min(solve(board, N, 0), solve(board, N, 1));

    int sum = 0;
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < N; j++) {
        if (board[i].charAt(j) == '#') {
          sum++;
        }
      }
    }

    return N * 2 - sum - res - 1;
  }

  private int solve(String[] board, int n, int row) {
    if (!isWhite(board, row, 0)) {
      return Integer.MAX_VALUE;
    }
    int res = 0;
    int col = 0;
    while (col < n - 1) {
      final int x = col + 1;
      if (isWhite(board, row, x)) {
        res++;
        col++;
      } else if (isWhite(board, (row + 1) % 2, col) && isWhite(board, (row + 1) % 2, col + 1)) {
        res++;
        res++;
        row = (row + 1) % 2;
        col++;
      } else {
        return Integer.MAX_VALUE;
      }
    }
    return res;
  }

  private boolean isWhite(String[] board, int row, int col) {
    return board[row].charAt(col) == '.';
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 2, new PathGameDiv2().calc(new String[]{"#....", "...#."}));
    ExampleRunner.eq(2, 0, new PathGameDiv2().calc(new String[]{"#", "."}));
    ExampleRunner.eq(3, 1, new PathGameDiv2().calc(new String[]{".", "."}));
    ExampleRunner.eq(4, 13, new PathGameDiv2().calc(new String[]{"....#.##.....#...........", "..#......#.......#..#...."}));
    ExampleRunner.eq(5, 0, new PathGameDiv2().calc(new String[]{".", "#"}));
    ExampleRunner.eq(6, 1, new PathGameDiv2().calc(new String[]{".", "."}));
    ExampleRunner.eq(7, 0, new PathGameDiv2().calc(new String[]{".", "#"}));
    ExampleRunner.eq(8, 2, new PathGameDiv2().calc(new String[]{"..", ".."}));
    ExampleRunner.eq(9, 1, new PathGameDiv2().calc(new String[]{"..", ".#"}));
    ExampleRunner.eq(10, 1, new PathGameDiv2().calc(new String[]{"..", "#."}));
    ExampleRunner.eq(11, 3, new PathGameDiv2().calc(new String[]{"...", "..."}));
    ExampleRunner.eq(12, 2, new PathGameDiv2().calc(new String[]{"...", ".#."}));
    ExampleRunner.eq(13, 0, new PathGameDiv2().calc(new String[]{"..#", "#.."}));
    ExampleRunner.eq(14, 1, new PathGameDiv2().calc(new String[]{"...", ".##"}));
    ExampleRunner.eq(15, 1, new PathGameDiv2().calc(new String[]{"#.#", "..."}));
    ExampleRunner.eq(16, 0, new PathGameDiv2().calc(new String[]{"...", "###"}));
    ExampleRunner.eq(17, 1, new PathGameDiv2().calc(new String[]{"##.", "..."}));
    ExampleRunner.eq(18, 0, new PathGameDiv2().calc(new String[]{"#", "."}));
    ExampleRunner.eq(19, 1, new PathGameDiv2().calc(new String[]{"..", "#."}));
    ExampleRunner.eq(20, 2, new PathGameDiv2().calc(new String[]{"..#", "..."}));
    ExampleRunner.eq(21, 1, new PathGameDiv2().calc(new String[]{"...#", "#..."}));
    ExampleRunner.eq(22, 1, new PathGameDiv2().calc(new String[]{"#....", "..##."}));
    ExampleRunner.eq(23, 4, new PathGameDiv2().calc(new String[]{"......", "##...."}));
    ExampleRunner.eq(24, 5, new PathGameDiv2().calc(new String[]{".......", "..##..."}));
    ExampleRunner.eq(25, 3, new PathGameDiv2().calc(new String[]{".......#", ".##..#.."}));
    ExampleRunner.eq(26, 2, new PathGameDiv2().calc(new String[]{"####..#..", "........#"}));
    ExampleRunner.eq(27, 6, new PathGameDiv2().calc(new String[]{".#........", "...##....."}));
    ExampleRunner.eq(28, 5, new PathGameDiv2().calc(new String[]{"#..........", "....####..."}));
    ExampleRunner.eq(29, 5, new PathGameDiv2().calc(new String[]{"#..###......", ".......#..#."}));
    ExampleRunner.eq(30, 5, new PathGameDiv2().calc(new String[]{"#........#...", "..##..##....."}));
    ExampleRunner.eq(31, 7, new PathGameDiv2().calc(new String[]{"###..#..###...", ".............."}));
    ExampleRunner.eq(32, 11, new PathGameDiv2().calc(new String[]{"...............", ".#....#.#.#...."}));
    ExampleRunner.eq(33, 9, new PathGameDiv2().calc(new String[]{"###.......#.....", "....#..........."}));
    ExampleRunner.eq(34, 11, new PathGameDiv2().calc(new String[]{"...#.#......#....", "........#........"}));
    ExampleRunner.eq(35, 12, new PathGameDiv2().calc(new String[]{"............#....#", "..##.....#........"}));
    ExampleRunner.eq(36, 7, new PathGameDiv2().calc(new String[]{"....#....#.........", "#.....##...###....."}));
    ExampleRunner.eq(37, 14, new PathGameDiv2().calc(new String[]{"##..................", ".....#.#........#..."}));
    ExampleRunner.eq(38, 10, new PathGameDiv2().calc(new String[]{"#....##...##..#......", "........#...........#"}));
    ExampleRunner.eq(39, 7, new PathGameDiv2().calc(new String[]{"..#..#.....####.#.##..", "#.......##............"}));
    ExampleRunner.eq(40, 2, new PathGameDiv2().calc(new String[]{"......#....#...#..###..", "#####...##...#........#"}));
    ExampleRunner.eq(41, 8, new PathGameDiv2().calc(new String[]{"...###..#......##...####", "..........#.......#....."}));
    ExampleRunner.eq(42, 19, new PathGameDiv2().calc(new String[]{".............#.#.......#.", "#........#..............."}));
    ExampleRunner.eq(43, 10, new PathGameDiv2().calc(new String[]{"..............###.........", "...#..#####.#......##..##."}));
    ExampleRunner.eq(44, 22, new PathGameDiv2().calc(new String[]{".......#...................", ".........#.....#.#........."}));
    ExampleRunner.eq(45, 7, new PathGameDiv2().calc(new String[]{"#.....#....####.............", "...##...##.......#.#..##.##."}));
    ExampleRunner.eq(46, 16, new PathGameDiv2().calc(new String[]{"#.........................##.", "..###...#....#.#.....#.#....."}));
    ExampleRunner.eq(47, 13, new PathGameDiv2().calc(new String[]{"##....#..#...###........#..##.", "...........#.........##......."}));
    ExampleRunner.eq(48, 14, new PathGameDiv2().calc(new String[]{".......#...#..............#....", ".#..#....#....#..#..#.......#.#"}));
    ExampleRunner.eq(49, 16, new PathGameDiv2().calc(new String[]{".#..................#.....##....", "...#..##..##.....#.....##......."}));
    ExampleRunner.eq(50, 16, new PathGameDiv2().calc(new String[]{".....#.......##......#....#......", ".#.#.......#.....#..........#..#."}));
    ExampleRunner.eq(51, 8, new PathGameDiv2().calc(new String[]{"#........######..............###..", "..#..#..........######..#..#.....#"}));
    ExampleRunner.eq(52, 22, new PathGameDiv2().calc(new String[]{".#....#..#......#..#........#.....#", "...#...................#..........."}));
    ExampleRunner.eq(53, 18, new PathGameDiv2().calc(new String[]{"#...#........#....###...#........#..", ".......#.......##..............#...."}));
    ExampleRunner.eq(54, 19, new PathGameDiv2().calc(new String[]{"..#.#...#.....................#......", "#.....#....#...#...#.#............##."}));
    ExampleRunner.eq(55, 9, new PathGameDiv2().calc(new String[]{".....###......#..........####..#..###.", "####.....####...###....#.............."}));
    ExampleRunner.eq(56, 12, new PathGameDiv2().calc(new String[]{"####.##.#....#...#.......#..#....#.....", "..........##...#...#.###.............#."}));
    ExampleRunner.eq(57, 24, new PathGameDiv2().calc(new String[]{"#....#..#..#.#................#.........", "...#............##.#..................#."}));
    ExampleRunner.eq(58, 17, new PathGameDiv2().calc(new String[]{"........#........#...................#.##", "....#.....###..#.......#..#.####.###....."}));
    ExampleRunner.eq(59, 21, new PathGameDiv2().calc(new String[]{"#.............##...#.#..............#.....", "...#....##.......#.......#........#...##.."}));
    ExampleRunner.eq(60, 19, new PathGameDiv2().calc(new String[]{"....#..#....##....#.###.........##.........", "..........#....##........#...#.......#.#..."}));
    ExampleRunner.eq(61, 10, new PathGameDiv2().calc(new String[]{"...#..............#######...#..########.....", "##...#..##..##..#.........#.............##.."}));
    ExampleRunner.eq(62, 28, new PathGameDiv2().calc(new String[]{"..#....#.##.#.......#............##.#.......#", "..............#...#...#......................"}));
    ExampleRunner.eq(63, 15, new PathGameDiv2().calc(new String[]{"...#...........##......#.....######........##.", "##...#..###..#....##.....###.................."}));
    ExampleRunner.eq(64, 22, new PathGameDiv2().calc(new String[]{"#..#......#....#.................#.....##....#.", ".....##......#...#.#.#.#.....#......#.........."}));
    ExampleRunner.eq(65, 26, new PathGameDiv2().calc(new String[]{".........#........#.#.#...............#....#....", "##....#.....#...#..........#...#.#......#......."}));
    ExampleRunner.eq(66, 28, new PathGameDiv2().calc(new String[]{".............#............#.##...##...#.#...#...#", "....#.#.........#..#....#.....................#.."}));
    ExampleRunner.eq(67, 22, new PathGameDiv2().calc(new String[]{".#..................#...........#...#....#......#.", ".....#....##.....##...#....###....#....#....#....."}));
    ExampleRunner.eq(68, 25, new PathGameDiv2().calc(new String[]{".........................", "........................."}));
    ExampleRunner.eq(69, 50, new PathGameDiv2().calc(new String[]{"..................................................", ".................................................."}));
    ExampleRunner.eq(70, 13, new PathGameDiv2().calc(new String[]{"....#.##.....#...........", "..#......#.......#..#...."}));
    ExampleRunner.eq(71, 5, new PathGameDiv2().calc(new String[]{"###............................##.................", "....######.....###############....################"}));
    ExampleRunner.eq(72, 0, new PathGameDiv2().calc(new String[]{".", "#"}));
    ExampleRunner.eq(73, 0, new PathGameDiv2().calc(new String[]{"#..", "..#"}));
    ExampleRunner.eq(74, 2, new PathGameDiv2().calc(new String[]{"..", ".."}));
    ExampleRunner.eq(75, 1, new PathGameDiv2().calc(new String[]{"#.#", "..."}));
    ExampleRunner.eq(76, 15, new PathGameDiv2().calc(new String[]{"............#...", "................"}));
    ExampleRunner.eq(77, 2, new PathGameDiv2().calc(new String[]{"#....", "...#."}));
    ExampleRunner.eq(78, 0, new PathGameDiv2().calc(new String[]{"#...#", "..#.."}));
    ExampleRunner.eq(79, 41, new PathGameDiv2().calc(new String[]{".....#...................#........................", ".............#....#....#.........................#"}));
    ExampleRunner.eq(80, 50, new PathGameDiv2().calc(new String[]{"..................................................", ".................................................."}));
    ExampleRunner.eq(81, 1, new PathGameDiv2().calc(new String[]{".#..", "...#"}));
    ExampleRunner.eq(82, 1, new PathGameDiv2().calc(new String[]{"#...#...", "..#....#"}));
    ExampleRunner.eq(83, 29, new PathGameDiv2().calc(new String[]{"................#...............", ".....................#.........."}));
    ExampleRunner.eq(84, 1, new PathGameDiv2().calc(new String[]{"#...", "...#"}));
    ExampleRunner.eq(85, 3, new PathGameDiv2().calc(new String[]{"...", "..."}));
    ExampleRunner.eq(86, 1, new PathGameDiv2().calc(new String[]{"#.#..", "....#"}));
    ExampleRunner.eq(87, 2, new PathGameDiv2().calc(new String[]{".#.", "..."}));
    ExampleRunner.eq(88, 4, new PathGameDiv2().calc(new String[]{"....", "...."}));
    ExampleRunner.eq(89, 0, new PathGameDiv2().calc(new String[]{"...##", "##..."}));
    ExampleRunner.eq(90, 1, new PathGameDiv2().calc(new String[]{"...#", "#..."}));
    ExampleRunner.eq(91, 1, new PathGameDiv2().calc(new String[]{".#", ".."}));
    ExampleRunner.eq(92, 0, new PathGameDiv2().calc(new String[]{".....", "#####"}));
    ExampleRunner.eq(93, 49, new PathGameDiv2().calc(new String[]{".................................................", "................................................."}));
    ExampleRunner.eq(94, 0, new PathGameDiv2().calc(new String[]{"##...#", "...#.."}));
    ExampleRunner.eq(95, 0, new PathGameDiv2().calc(new String[]{"#...#..", "..#...#"}));
    ExampleRunner.eq(96, 0, new PathGameDiv2().calc(new String[]{"###", "..."}));
    ExampleRunner.eq(97, 4, new PathGameDiv2().calc(new String[]{".#.#.#.", "......."}));
    ExampleRunner.eq(98, 0, new PathGameDiv2().calc(new String[]{"#", "."}));
    ExampleRunner.eq(99, 4, new PathGameDiv2().calc(new String[]{"....#", "....."}));
    ExampleRunner.eq(100, 1, new PathGameDiv2().calc(new String[]{".", "."}));
    ExampleRunner.eq(101, 1, new PathGameDiv2().calc(new String[]{"..", "#."}));
    ExampleRunner.eq(102, 2, new PathGameDiv2().calc(new String[]{"..#", "..."}));
    ExampleRunner.eq(103, 13, new PathGameDiv2().calc(new String[]{"..#......#.......#..#....", "....#.##.....#..........."}));
    ExampleRunner.eq(104, 3, new PathGameDiv2().calc(new String[]{"..#.", "...."}));
    ExampleRunner.eq(105, 6, new PathGameDiv2().calc(new String[]{"...#...", "......."}));
    ExampleRunner.eq(106, 5, new PathGameDiv2().calc(new String[]{"...#...#..", ".....#...."}));
    ExampleRunner.eq(107, 2, new PathGameDiv2().calc(new String[]{"##...#..", "...#...."}));
    ExampleRunner.eq(108, 2, new PathGameDiv2().calc(new String[]{".#...", "...#."}));
    ExampleRunner.eq(109, 3, new PathGameDiv2().calc(new String[]{".##..", "....."}));
    ExampleRunner.eq(110, 4, new PathGameDiv2().calc(new String[]{"..#....", "....#.."}));
    ExampleRunner.eq(111, 4, new PathGameDiv2().calc(new String[]{"..#..", "....."}));
    ExampleRunner.eq(112, 5, new PathGameDiv2().calc(new String[]{"..###.....###...", "......###......."}));
    ExampleRunner.eq(113, 11, new PathGameDiv2().calc(new String[]{"....#.##.....#..........#", "..#......#.......#..#...."}));
    ExampleRunner.eq(114, 9, new PathGameDiv2().calc(new String[]{"...#......", ".........."}));
    ExampleRunner.eq(115, 3, new PathGameDiv2().calc(new String[]{"...#", "...."}));
  }
}
