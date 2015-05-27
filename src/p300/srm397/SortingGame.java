package p300.srm397;

import utils.ExampleRunner;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by smalex on 27/05/15.
 */
public class SortingGame {
  public int fewestMoves(int[] board, int k) {
    final int N = board.length;
    int[] finalNumber = new int[N];
    for (int i = 1; i <= N; i++) {
      finalNumber[i - 1] = i;
    }

    final int toNumber = toNumber(finalNumber);
    int inNumber = toNumber(board);
    LinkedList<Integer> q = new LinkedList<Integer>();
    q.add(inNumber);
    Map<Integer, Integer> visited = new HashMap<Integer, Integer>();
    visited.put(inNumber, 0);
    int[] tmpBoard = new int[N];
    while (!q.isEmpty() && !visited.containsKey(toNumber)) {
      final Integer num = q.poll();
      final Integer count = visited.get(num);
      toBoard(num, tmpBoard);
      for (int i = 0; i <= N - k; i++) {
        toBoard(num, tmpBoard);
        swapNumbers(tmpBoard, k, i);
        final int nextNumber = toNumber(tmpBoard);
        if (!visited.containsKey(nextNumber)) {
          visited.put(nextNumber, count + 1);
          q.add(nextNumber);
        }
      }
    }
    return visited.containsKey(toNumber) ? visited.get(toNumber) : -1;
  }

  private static void swapNumbers(int[] tmpBoard, int k, int i) {
//    System.out.println("swapNumbers = (" + i + "," + (i + k) + ")");
    for (int j = 0; j < k / 2; j++) {
      final int tmp = tmpBoard[i + k - j - 1];
      tmpBoard[i + k - j - 1] = tmpBoard[i + j];
      tmpBoard[i + j] = tmp;
    }
  }

  private int toNumber(int[] board) {
    int res = 0;
    for (int num : board) {
      res *= 10;
      res += num;
    }
    return res;
  }
  private void toBoard(int num, int[] board) {
    for (int i = 0; i < board.length; i++) {
      board[board.length - i - 1] = num % 10;
      num /= 10;
    }
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 0, new SortingGame().fewestMoves(new int[]{1, 2, 3}, 3));
    ExampleRunner.eq(2, 1, new SortingGame().fewestMoves(new int[]{3, 2, 1}, 3));
    ExampleRunner.eq(3, 10, new SortingGame().fewestMoves(new int[]{5, 4, 3, 2, 1}, 2));
    ExampleRunner.eq(4, -1, new SortingGame().fewestMoves(new int[]{3, 2, 4, 1, 5}, 4));
    ExampleRunner.eq(5, -1, new SortingGame().fewestMoves(new int[]{1, 4, 3, 2, 5}, 5));
    ExampleRunner.eq(6, -1, new SortingGame().fewestMoves(new int[]{2, 5, 1, 4, 3}, 3));
    ExampleRunner.eq(7, -1, new SortingGame().fewestMoves(new int[]{2, 5, 3, 4, 1}, 3));
    ExampleRunner.eq(8, 6, new SortingGame().fewestMoves(new int[]{4, 3, 1, 5, 2}, 2));
    ExampleRunner.eq(9, -1, new SortingGame().fewestMoves(new int[]{2, 1, 4, 3, 5}, 3));
    ExampleRunner.eq(10, 3, new SortingGame().fewestMoves(new int[]{5, 4, 1, 2, 3}, 3));
    ExampleRunner.eq(11, 2, new SortingGame().fewestMoves(new int[]{5, 2, 1, 4, 3}, 3));
    ExampleRunner.eq(12, 4, new SortingGame().fewestMoves(new int[]{5, 4, 3, 2, 1}, 3));
    ExampleRunner.eq(13, 9, new SortingGame().fewestMoves(new int[]{2, 4, 6, 5, 3, 1}, 2));
    ExampleRunner.eq(14, 8, new SortingGame().fewestMoves(new int[]{6, 3, 1, 2, 5, 4}, 2));
    ExampleRunner.eq(15, -1, new SortingGame().fewestMoves(new int[]{3, 4, 6, 2, 5, 1}, 4));
    ExampleRunner.eq(16, -1, new SortingGame().fewestMoves(new int[]{4, 1, 2, 3, 5, 6}, 3));
    ExampleRunner.eq(17, 8, new SortingGame().fewestMoves(new int[]{3, 4, 2, 6, 5, 1}, 2));
    ExampleRunner.eq(18, 6, new SortingGame().fewestMoves(new int[]{2, 5, 6, 3, 1, 4}, 4));
    ExampleRunner.eq(19, 5, new SortingGame().fewestMoves(new int[]{5, 6, 3, 2, 1, 4}, 3));
    ExampleRunner.eq(20, -1, new SortingGame().fewestMoves(new int[]{2, 6, 4, 3, 7, 5, 1}, 3));
    ExampleRunner.eq(21, 7, new SortingGame().fewestMoves(new int[]{2, 4, 6, 7, 1, 5, 3}, 4));
    ExampleRunner.eq(22, 0, new SortingGame().fewestMoves(new int[]{1, 2, 3, 4, 5, 6, 7}, 2));
    ExampleRunner.eq(23, 9, new SortingGame().fewestMoves(new int[]{5, 4, 2, 1, 6, 3, 7}, 2));
    ExampleRunner.eq(24, 5, new SortingGame().fewestMoves(new int[]{2, 1, 5, 4, 3, 7, 6}, 2));
    ExampleRunner.eq(25, -1, new SortingGame().fewestMoves(new int[]{1, 4, 6, 7, 2, 5, 3}, 4));
    ExampleRunner.eq(26, 9, new SortingGame().fewestMoves(new int[]{2, 6, 4, 1, 7, 3, 5}, 2));
    ExampleRunner.eq(27, -1, new SortingGame().fewestMoves(new int[]{1, 5, 2, 3, 4, 7, 6}, 3));
    ExampleRunner.eq(28, -1, new SortingGame().fewestMoves(new int[]{1, 6, 3, 4, 2, 7, 5}, 5));
    ExampleRunner.eq(29, 4, new SortingGame().fewestMoves(new int[]{3, 2, 7, 4, 5, 6, 1}, 5));
    ExampleRunner.eq(30, 6, new SortingGame().fewestMoves(new int[]{2, 3, 4, 5, 6, 7, 1}, 6));
    ExampleRunner.eq(31, 7, new SortingGame().fewestMoves(new int[]{7, 6, 5, 4, 3, 2, 1}, 6));
    ExampleRunner.eq(32, 21, new SortingGame().fewestMoves(new int[]{7, 6, 5, 4, 3, 2, 1}, 2));
    ExampleRunner.eq(33, 28, new SortingGame().fewestMoves(new int[]{8, 7, 6, 5, 4, 3, 2, 1}, 2));
    ExampleRunner.eq(34, -1, new SortingGame().fewestMoves(new int[]{8, 5, 1, 2, 4, 3, 6, 7}, 3));
    ExampleRunner.eq(35, 7, new SortingGame().fewestMoves(new int[]{7, 2, 1, 6, 8, 4, 3, 5}, 4));
    ExampleRunner.eq(36, 16, new SortingGame().fewestMoves(new int[]{8, 1, 4, 6, 5, 7, 2, 3}, 2));
    ExampleRunner.eq(37, -1, new SortingGame().fewestMoves(new int[]{6, 2, 5, 8, 3, 1, 7, 4}, 5));
    ExampleRunner.eq(38, -1, new SortingGame().fewestMoves(new int[]{6, 7, 3, 2, 4, 5, 8, 1}, 3));
    ExampleRunner.eq(39, 12, new SortingGame().fewestMoves(new int[]{7, 8, 5, 6, 3, 4, 1, 2}, 3));
    ExampleRunner.eq(40, -1, new SortingGame().fewestMoves(new int[]{8, 7, 6, 5, 4, 3, 2, 1}, 7));
    ExampleRunner.eq(41, 4, new SortingGame().fewestMoves(new int[]{5, 6, 7, 8, 1, 2, 3, 4}, 7));
    ExampleRunner.eq(42, 1, new SortingGame().fewestMoves(new int[]{8, 7, 6, 5, 4, 3, 2, 1}, 8));
    ExampleRunner.eq(43, 28, new SortingGame().fewestMoves(new int[]{8, 7, 6, 5, 4, 3, 2, 1}, 2));
    ExampleRunner.eq(44, 10, new SortingGame().fewestMoves(new int[]{8, 6, 5, 2, 3, 4, 7, 1}, 4));
    ExampleRunner.eq(45, 7, new SortingGame().fewestMoves(new int[]{7, 4, 1, 6, 3, 8, 5, 2}, 5));
    ExampleRunner.eq(46, 28, new SortingGame().fewestMoves(new int[]{8, 7, 6, 5, 4, 3, 2, 1}, 6));
    ExampleRunner.eq(47, 1, new SortingGame().fewestMoves(new int[]{8, 7, 6, 5, 4, 3, 2, 1}, 8));
    ExampleRunner.eq(48, 9, new SortingGame().fewestMoves(new int[]{7, 6, 5, 4, 3, 2, 1}, 3));
    ExampleRunner.eq(49, 9, new SortingGame().fewestMoves(new int[]{6, 1, 4, 2, 7, 5, 3}, 4));
    ExampleRunner.eq(50, 7, new SortingGame().fewestMoves(new int[]{3, 6, 7, 4, 1, 2, 5}, 5));
    ExampleRunner.eq(51, 6, new SortingGame().fewestMoves(new int[]{5, 6, 3, 4, 1, 2}, 3));
    ExampleRunner.eq(52, 11, new SortingGame().fewestMoves(new int[]{6, 4, 2, 5, 3, 1}, 4));
    ExampleRunner.eq(53, 3, new SortingGame().fewestMoves(new int[]{3, 2, 1, 6, 5, 4}, 5));
    ExampleRunner.eq(54, 5, new SortingGame().fewestMoves(new int[]{5, 4, 3, 2, 1}, 4));
    ExampleRunner.eq(55, 0, new SortingGame().fewestMoves(new int[]{1, 2}, 2));
    ExampleRunner.eq(56, 1, new SortingGame().fewestMoves(new int[]{2, 1}, 2));
    ExampleRunner.eq(57, -1, new SortingGame().fewestMoves(new int[]{1, 2, 3, 4, 5, 6, 8, 7}, 4));
    ExampleRunner.eq(58, 19, new SortingGame().fewestMoves(new int[]{7, 5, 3, 4, 8, 2, 6, 1}, 2));
    ExampleRunner.eq(59, 1, new SortingGame().fewestMoves(new int[]{3, 2, 1}, 3));
    ExampleRunner.eq(60, 7, new SortingGame().fewestMoves(new int[]{7, 2, 1, 6, 8, 4, 3, 5}, 4));
    ExampleRunner.eq(61, 10, new SortingGame().fewestMoves(new int[]{5, 4, 3, 2, 1}, 2));
    ExampleRunner.eq(62, 14, new SortingGame().fewestMoves(new int[]{7, 2, 1, 6, 8, 4, 3, 5}, 2));
    ExampleRunner.eq(63, 0, new SortingGame().fewestMoves(new int[]{1, 2, 3, 4, 5, 6}, 3));
    ExampleRunner.eq(64, 28, new SortingGame().fewestMoves(new int[]{8, 7, 6, 5, 4, 3, 2, 1}, 2));
    ExampleRunner.eq(65, -1, new SortingGame().fewestMoves(new int[]{8, 4, 7, 2, 1, 5, 3, 6}, 4));
    ExampleRunner.eq(66, 28, new SortingGame().fewestMoves(new int[]{8, 7, 6, 5, 4, 3, 2, 1}, 6));
    ExampleRunner.eq(67, 21, new SortingGame().fewestMoves(new int[]{4, 2, 5, 7, 1, 8, 3, 6}, 6));
    ExampleRunner.eq(68, 14, new SortingGame().fewestMoves(new int[]{7, 1, 2, 8, 6, 4, 3, 5}, 6));
    ExampleRunner.eq(69, 6, new SortingGame().fewestMoves(new int[]{8, 7, 6, 5, 4, 3, 2, 1}, 4));
    ExampleRunner.eq(70, -1, new SortingGame().fewestMoves(new int[]{5, 3, 2, 4, 1, 7, 8, 6}, 3));
    ExampleRunner.eq(71, -1, new SortingGame().fewestMoves(new int[]{7, 2, 1, 6, 8, 4, 3, 5}, 3));
    ExampleRunner.eq(72, -1, new SortingGame().fewestMoves(new int[]{4, 5, 3, 8, 7, 1, 2, 6}, 4));
    ExampleRunner.eq(73, 23, new SortingGame().fewestMoves(new int[]{6, 4, 1, 7, 3, 8, 5, 2}, 6));
    ExampleRunner.eq(74, 18, new SortingGame().fewestMoves(new int[]{5, 3, 8, 2, 1, 4, 6, 7}, 6));
  }
}
