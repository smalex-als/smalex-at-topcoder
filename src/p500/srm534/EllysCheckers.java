package p500.srm534;

import java.util.LinkedList;
import java.util.List;

import utils.ExampleRunner;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/23/12
 * Time: 9:32 PM
 */
public class EllysCheckers {

  private int N;
  private int pos;

  public String getWinner(String board) {
    N = board.length();
    int boardInt = toInt(board);
    dump("init", boardInt);
    List<Integer> queueWho = new LinkedList<Integer>();
    List<Integer> queue = new LinkedList<Integer>();
    queue.add(boardInt);
    queueWho.add(0);
    pos = 0;

    while (pos < queue.size()) {
      Integer currentBoard = queue.get(pos);
      int who = queueWho.get(pos);
      pos++;
      if (currentBoard == -1) {
        continue;
      }
      dump("get", currentBoard);
      if ((currentBoard & 1) == 1) {
        currentBoard = currentBoard ^ 1;
      }
      dump("cur", currentBoard);
      boolean makeMove = false;
      for (int i = N - 1; i >= 0; i--) {
        if (isOn(currentBoard, i)) {
          if (!isOn(currentBoard, i - 3) && i > 2) {
            queue.add(turnOn(turnOff(currentBoard, i), i - 3));
            queueWho.add(who == 0 ? 1 : 0);
            makeMove = true;
          }
          if (!isOn(currentBoard, i - 1) && i > 0) {
            queue.add(turnOn(turnOff(currentBoard, i), i - 1));
            queueWho.add(who == 0 ? 1 : 0);
            makeMove = true;
          }
        }
      }
      if (!makeMove) {
        return who == 1 ? "YES" : "NO";
//        queue.add(-1);
//        queueWho.add(who);
      }
    }

    return board;
  }

  private int toInt(String board) {
    int boardInt = 0;
    for (int i = N - 1; i >= 0; i--) {
      if (board.charAt(i) == 'o') {
        boardInt = boardInt | (1 << (N - i - 1));
      }
    }
    return boardInt;
  }

  private int turnOn(int boardInt, int i) {
    return boardInt | 1 << i;
  }

  private int turnOff(int boardInt, int i) {
    return boardInt ^ 1 << i;
  }

  private boolean isOn(int boardInt, int i) {
    return (boardInt & (1 << i)) == 1 << i;
  }

  private void dump(String text, int boardInt) {
    String d = "";
    for (int i = N - 1; i >= 0; i--) {
      if (((1 << i) & boardInt) == (1 << i)) {
        d += "o";
      } else {
        d += ".";
      }
    }
    System.out.println(text + " d = " + d + " pos = " + pos);
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, "YES", new EllysCheckers().getWinner(".o..."));
    ExampleRunner.eq(2, "YES", new EllysCheckers().getWinner("..o..o"));
//    ExampleRunner.eq(3, "NO", new EllysCheckers().getWinner(".o...ooo..oo.."));
    ExampleRunner.eq(4, "YES", new EllysCheckers().getWinner("......o.ooo.o......"));
  }
}
