package p500.srm569;

import utils.ExampleRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/7/13
 * Time: 6:53 AM
 */
public class MegaFactorialDiv2 {
  int[][][] memorize = new int[1000][100][1000];
  public int countDivisors(int N, int K) {
    int[] numbers = new int[1001];
    fact(N, K, numbers);
    int max = Math.max(N, K);
    boolean[] prime = new boolean[1001];
    Arrays.fill(prime, true);
    for (int i = 2; i <= 1000; i++) {
      for (int j = 2 * i; j <= max; j += i) {
        prime[j] = false;
      }
    }
    int[] stats = new int[1000];
    for (int j = 0; j < numbers.length; j++) {
      int cnt = numbers[j];
      int number = j;
      if (cnt == 0) {
        continue;
      }
//      System.out.println("number = " + number + " cnt = " + cnt);
      if (!prime[number]) {
        for (int i = 2; i <= max; i++) {
          if (number % i == 0 && prime[i]) {
            long tmpnum = number;
            int power = 0;
            while (tmpnum > 0 && tmpnum % i == 0) {
              power++;
              tmpnum /= i;
            }
//            System.out.println("power = " + power + " d = " + i);
            for (int m = 0; m < power; m++) {
              stats[i] += cnt;
            }
          }
        }

      } else {
        stats[number] += cnt;
      }
    }
    long res = 1;
    for (int i = 2; i < stats.length; i++) {
      int stat = stats[i];
      if (stat > 0) {
        res *= (stat + 1);
        res %= 1000000009;
      }
    }
//    res *= (power + 1);

//    System.out.println("cnt = " + cnt);
    return (int) res;
  }

  private long fact(int n, int k, int[] numbers) {
    if (n == 0) {
      return 1;
    }
    if (k == 0) {
      if (n > 1) {
        numbers[n]++;
      }
      return n;
    }
    fact(n, k - 1, numbers);
    fact(n - 1, k, numbers);
    return 0;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 4, new MegaFactorialDiv2().countDivisors(3, 1));
    ExampleRunner.eq(2, 6, new MegaFactorialDiv2().countDivisors(3, 2));
    ExampleRunner.eq(3, 18, new MegaFactorialDiv2().countDivisors(4, 2));
    ExampleRunner.eq(4, 1392, new MegaFactorialDiv2().countDivisors(6, 3));
    ExampleRunner.eq(5, 321266186, new MegaFactorialDiv2().countDivisors(100, 2));
    ExampleRunner.eq(6, 92104295, new MegaFactorialDiv2().countDivisors(1000, 2));
  }
}
