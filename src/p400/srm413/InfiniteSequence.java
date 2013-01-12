// BEGIN CUT HERE
package p400.srm413;

import java.util.HashMap;
import java.util.Map;

import static utils.ExampleRunner.eq;

public class InfiniteSequence {
  private Map<Long, Long> cache = new HashMap<Long, Long>();

  public long calc(long n, int p, int q) {
    if (n == 0) {
      return 1L;
    }
    if (cache.containsKey(n)) {
      return cache.get(n);
    }
    final long l = calc(n / p, p, q) + calc(n / q, p, q);
    cache.put(n, l);
    return l;
  }

  // BEGIN CUT HERE
  public static void main(String[] args) {
    try {
      eq(0, (new InfiniteSequence()).calc(0L, 2, 3), 1L);
      eq(1, (new InfiniteSequence()).calc(7L, 2, 3), 7L);
      eq(2, (new InfiniteSequence()).calc(10000000000000L, 3, 3), 32768L);
      eq(3, (new InfiniteSequence()).calc(256L, 2, 4), 89L);
      eq(4, (new InfiniteSequence()).calc(1L, 1000000, 1000000), 2L);
    } catch (Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
// END CUT HERE
}
