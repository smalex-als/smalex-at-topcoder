package p400.srm490;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 12/8/10
 * Time: 7:25 PM
 */
public class Starport {
  public double getExpectedTime(int N, int M) {
    long i = 0;
    long sum = 0;
    long ships = 0;
    while (true) {
      if (i > 0 && i % N == 0 && i % M == 0) {
        break;
      }
      long up = i + N;
      for (long j = (i + M - 1) / M * M; j <= i + N; j += M) {
        if (j > 0) {
          sum += up - j;
          ships++;
        }
      }
      i += N;
    }
    final double v = (double) sum / (double) ships;
    System.out.println("v = " + v);
    return v;
  }

  public double getExpectedTimePetr(int N, int M) {
    int delta = BigInteger.valueOf(N).gcd(BigInteger.valueOf(M)).intValue();
    System.out.println("delta = " + delta);
    if (delta == 0) {
      return 0.0d;
    } else {
      final double v = (N - delta) / 2.0;
      System.out.println("v = " + v);
      return v;
    }
  }

  public static void main(String[] args) {
//    System.out.println(1 == new Starport().getExpectedTime(4, 2));
    System.out.println(2 == new Starport().getExpectedTimePetr(5, 3));
//    System.out.println(0 == Double.compare(2.5d, new Starport().getExpectedTime(6, 1)));
//    System.out.println(0 == Double.compare(6170.0d, new Starport().getExpectedTime(12345, 2345)));
//    System.out.println(2 == new Starport().getExpectedTime(1000000000, 5));
//    System.out.println(2 == new Starport().getExpectedTime(999999999, 1000000000));
  }
}
