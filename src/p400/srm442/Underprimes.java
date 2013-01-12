package p400.srm442;

import java.util.ArrayList;
import java.util.List;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 3/28/11
 * Time: 1:53 PM
 */
public class Underprimes {
  private boolean[] prime;

  public int howMany(int A, int B) {
    initPrime(B + 1);
    int result = 0;
    for (int i = A; i <= B; i++) {
      if (!isPrime(i) && isPrime(factorise(i).size())) {
        result++;
      }
    }
    return result;
  }

  private void initPrime(int n) {
    prime = new boolean[n];
    for (int i = 2; i < prime.length; i++) {
      prime[i] = true;
    }
    for (int i = 2; i * i < n; i++) {
      if (prime[i]) {
        for (int j = i + i; j < n; j += i) {
          prime[j] = false;
        }
      }
    }
  }

  private boolean isPrime(int num) {
    return prime[num];
  }

  private List<Integer> factorise(int num) {
    List<Integer> factors = new ArrayList<Integer>();
    while (!isPrime(num)) {
      for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
          num /= i;
          factors.add(i);
          break;
        }
      }
    }
    factors.add(num);
    return factors;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 5, new Underprimes().howMany(2, 10));
    ExampleRunner.eq(2, 2, new Underprimes().howMany(100, 105));
    ExampleRunner.eq(3, 0, new Underprimes().howMany(17, 17));
    ExampleRunner.eq(4, 7987, new Underprimes().howMany(312, 12839));
    ExampleRunner.eq(5, 217, new Underprimes().howMany(123, 456));
    ExampleRunner.eq(6, 1, new Underprimes().howMany(12345, 12345));
    ExampleRunner.eq(7, 63255, new Underprimes().howMany(2, 100000));
    ExampleRunner.eq(8, 2, new Underprimes().howMany(127, 129));
    ExampleRunner.eq(9, 20824, new Underprimes().howMany(162, 32918));
    ExampleRunner.eq(10, 63255, new Underprimes().howMany(2, 99999));
    ExampleRunner.eq(11, 63250, new Underprimes().howMany(11, 99998));
    ExampleRunner.eq(12, 63189, new Underprimes().howMany(111, 99997));
    ExampleRunner.eq(13, 1, new Underprimes().howMany(12345, 12345));
    ExampleRunner.eq(14, 1, new Underprimes().howMany(11, 13));
    ExampleRunner.eq(15, 14563, new Underprimes().howMany(228, 23094));
    ExampleRunner.eq(16, 1456, new Underprimes().howMany(29, 2309));
    ExampleRunner.eq(17, 10228, new Underprimes().howMany(7328, 23409));
    ExampleRunner.eq(18, 19142, new Underprimes().howMany(2378, 32492));
    ExampleRunner.eq(19, 56250, new Underprimes().howMany(9832, 98829));
    ExampleRunner.eq(20, 7045, new Underprimes().howMany(11111, 22222));
    ExampleRunner.eq(21, 1, new Underprimes().howMany(11111, 11111));
    ExampleRunner.eq(22, 1, new Underprimes().howMany(1111, 1111));
    ExampleRunner.eq(23, 1, new Underprimes().howMany(111, 111));
    ExampleRunner.eq(24, 1, new Underprimes().howMany(12, 13));
    ExampleRunner.eq(25, 18, new Underprimes().howMany(47203, 47230));
    ExampleRunner.eq(26, 2, new Underprimes().howMany(12345, 12346));
    ExampleRunner.eq(27, 79, new Underprimes().howMany(888, 999));
    ExampleRunner.eq(28, 6396, new Underprimes().howMany(2, 10000));
    ExampleRunner.eq(29, 1, new Underprimes().howMany(12, 12));
    ExampleRunner.eq(30, 55435, new Underprimes().howMany(397, 87993));
    ExampleRunner.eq(31, 62642, new Underprimes().howMany(17, 99013));
    ExampleRunner.eq(32, 63255, new Underprimes().howMany(3, 99999));
    ExampleRunner.eq(33, 63197, new Underprimes().howMany(98, 99998));
    ExampleRunner.eq(34, 4486, new Underprimes().howMany(5, 7000));
    ExampleRunner.eq(35, 63250, new Underprimes().howMany(12, 99999));
    ExampleRunner.eq(36, 5746, new Underprimes().howMany(3, 9000));
    ExampleRunner.eq(37, 63254, new Underprimes().howMany(2, 99997));
    ExampleRunner.eq(38, 63255, new Underprimes().howMany(3, 100000));
    ExampleRunner.eq(39, 62218, new Underprimes().howMany(56, 98345));
    ExampleRunner.eq(40, 0, new Underprimes().howMany(99999, 100000));
    ExampleRunner.eq(41, 6392, new Underprimes().howMany(10, 10000));
    ExampleRunner.eq(42, 1425, new Underprimes().howMany(123, 2356));
    ExampleRunner.eq(43, 35958, new Underprimes().howMany(123, 56798));
    ExampleRunner.eq(44, 1, new Underprimes().howMany(5498, 5499));
    ExampleRunner.eq(45, 1, new Underprimes().howMany(99842, 99842));
    ExampleRunner.eq(46, 1, new Underprimes().howMany(4, 4));
    ExampleRunner.eq(47, 1, new Underprimes().howMany(10, 10));
    ExampleRunner.eq(48, 62028, new Underprimes().howMany(2, 98000));
    ExampleRunner.eq(49, 0, new Underprimes().howMany(512, 512));
  }
}
