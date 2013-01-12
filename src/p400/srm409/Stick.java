// BEGIN CUT HERE
package p400.srm409;

import static utils.ExampleRunner.eq;

public class Stick {
  public int pieces(int x) {
    int res = 0;
    int length = 64;

    while (x > 0) {
      if (x >= length) {
        x -= length;
        res++;
      }
      length = length / 2;
    }
    return res;
  }

  // BEGIN CUT HERE
  public static void main(String[] args) {
    try {
      eq(2, (new Stick()).pieces(32), 1);
      eq(2, (new Stick()).pieces(48), 2);
      eq(2, (new Stick()).pieces(10), 2);
      eq(2, (new Stick()).pieces(1), 1);
      eq(2, (new Stick()).pieces(2), 1);
      eq(2, (new Stick()).pieces(3), 2);
      eq(2, (new Stick()).pieces(4), 1);
      eq(2, (new Stick()).pieces(5), 2);
      eq(2, (new Stick()).pieces(6), 2);
      eq(2, (new Stick()).pieces(7), 3);
      eq(2, (new Stick()).pieces(8), 1);
      eq(2, (new Stick()).pieces(9), 2);
      eq(2, (new Stick()).pieces(11), 3);
      eq(2, (new Stick()).pieces(12), 2);
      eq(2, (new Stick()).pieces(13), 3);
      eq(2, (new Stick()).pieces(14), 3);
      eq(2, (new Stick()).pieces(15), 4);
      eq(2, (new Stick()).pieces(16), 1);
      eq(2, (new Stick()).pieces(17), 2);
      eq(2, (new Stick()).pieces(18), 2);
      eq(2, (new Stick()).pieces(19), 3);
      eq(2, (new Stick()).pieces(20), 2);
      eq(2, (new Stick()).pieces(21), 3);
      eq(2, (new Stick()).pieces(22), 3);
      eq(2, (new Stick()).pieces(23), 4);
      eq(2, (new Stick()).pieces(24), 2);
      eq(2, (new Stick()).pieces(25), 3);
      eq(2, (new Stick()).pieces(26), 3);
      eq(2, (new Stick()).pieces(27), 4);
      eq(2, (new Stick()).pieces(28), 3);
      eq(2, (new Stick()).pieces(29), 4);
      eq(2, (new Stick()).pieces(30), 4);
      eq(2, (new Stick()).pieces(31), 5);
      eq(2, (new Stick()).pieces(33), 2);
      eq(2, (new Stick()).pieces(34), 2);
      eq(2, (new Stick()).pieces(35), 3);
      eq(2, (new Stick()).pieces(36), 2);
      eq(2, (new Stick()).pieces(37), 3);
      eq(2, (new Stick()).pieces(38), 3);
      eq(2, (new Stick()).pieces(39), 4);
      eq(2, (new Stick()).pieces(40), 2);
      eq(2, (new Stick()).pieces(41), 3);
      eq(2, (new Stick()).pieces(42), 3);
      eq(2, (new Stick()).pieces(43), 4);
      eq(2, (new Stick()).pieces(44), 3);
      eq(2, (new Stick()).pieces(45), 4);
      eq(2, (new Stick()).pieces(46), 4);
      eq(2, (new Stick()).pieces(47), 5);
      eq(2, (new Stick()).pieces(49), 3);
      eq(2, (new Stick()).pieces(50), 3);
      eq(2, (new Stick()).pieces(51), 4);
      eq(2, (new Stick()).pieces(52), 3);
      eq(2, (new Stick()).pieces(53), 4);
      eq(2, (new Stick()).pieces(54), 4);
      eq(2, (new Stick()).pieces(55), 5);
      eq(2, (new Stick()).pieces(56), 3);
      eq(2, (new Stick()).pieces(57), 4);
      eq(2, (new Stick()).pieces(58), 4);
      eq(2, (new Stick()).pieces(59), 5);
      eq(2, (new Stick()).pieces(60), 4);
      eq(2, (new Stick()).pieces(61), 5);
      eq(2, (new Stick()).pieces(62), 5);
      eq(2, (new Stick()).pieces(63), 6);
      eq(2, (new Stick()).pieces(64), 1);
    } catch (Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
// END CUT HERE
}
