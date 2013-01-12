package p300.srm399;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Tanya
 * Date: 24.04.2008
 * Time: 5:00:56
 */
public class MaximalProduct {
  private long[][] cache;

  public long maximalProduct(int s, int k) {
    cache = new long[s + 1][k + 1];
    for (int i = 0; i < cache.length; i++) {
      Arrays.fill(cache[i], -1);
    }
    long result = best(s, k);
    System.out.println("result = " + result);
    return result;
  }

  private long best(int s, int k) {
    if (k == 1) return s;
    if (s == 0) return 1;
    if (cache[s][k] != -1) {
      return cache[s][k];
    }
    for (int i = 1; i < s; i++) {
      cache[s][k] = Math.max(cache[s][k], best(s - i, k - 1) * i);
    }
    return cache[s][k];
  }

  public long maximalProduct2(int s, int k) {
    int result = 1;
    int n0 = s / k;
    int rest = s % k;
    for (int i = 0; i < k - rest; i++) {
      result *= n0;
    }
    for (int i = 0; i < rest; i++) {
      result *= n0 + 1;
    }
    System.out.println("result = " + result);
    return result;
  }


  public static void main(String[] args) {
    System.out.println(36 == new MaximalProduct().maximalProduct(10, 3));
    System.out.println(12 == new MaximalProduct().maximalProduct(7, 2));
    System.out.println(100000 == new MaximalProduct().maximalProduct(27, 7));
    System.out.println(941192 == new MaximalProduct().maximalProduct(50, 7));
    System.out.println(95367431640625l == new MaximalProduct().maximalProduct(100, 20));
    System.out.println(121010400 == new MaximalProduct().maximalProduct(100, 7));
  }
}
