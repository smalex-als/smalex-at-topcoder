package p400.srm491;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 12/18/10
 * Time: 9:14 PM
 */
public class TestSubset {
  private int N;
  private int K;

  public int theCount(int N, int K) {
    int[] a = new int[6];
    this.N = N;
    this.K = K;
    return 2 * innerCnt(a, 0, 0);
  }

  private int innerCnt(int[] a, int offset, int len) {
    if (len == 6) {
      final int s0 = a[0] + a[5];
      final int s1 = a[1] + a[4];
      final int s2 = a[2] + a[3];
      if (s0 >= K && s1 >= K && s2 >= K && s1 == s0 && s0 == s2) {
        return 1;
      }
      return 0;
    }
    if (offset == N) {
      return 0;
    }
    a[len] = offset + 1;
    int res = innerCnt(a, offset + 1, len + 1);
    res += innerCnt(a, offset + 1, len);
    return res;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 2, new TestSubset().theCount(6, 7));
    ExampleRunner.eq(2, 0, new TestSubset().theCount(5, 7));
    ExampleRunner.eq(3, 48, new TestSubset().theCount(10, 10));
    ExampleRunner.eq(4, 504, new TestSubset().theCount(31, 46));
    ExampleRunner.eq(5, 105800, new TestSubset().theCount(50, 1));
    ExampleRunner.eq(6, 97152, new TestSubset().theCount(49, 2));
    ExampleRunner.eq(7, 97152, new TestSubset().theCount(100, 2));
  }
}
