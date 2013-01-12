package p500.srm535;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 3/3/12
 * Time: 12:25 PM
 */
public class FoxAndGCDLCM {
  public long get(long G, long L) {
    if (G == 1L && L == 1L) {
      return 2L;
    }
    if (G == 1L) {
      return L + G;
    }
    long a = G;
    long b = L / G;

    List<Long> numbers = new ArrayList<Long>();
    for (long i = 2; i * i <= L; ++i) {
      if (L % i == 0) {
        System.out.println("i = " + i);
        numbers.add(i);
      }
    }

    return 0L;
  }

  private boolean isPrime(long b) {
    int cnt = 0;
    for (long i = 2; i * i <= b; ++i) {
      cnt++;
      if (b % i == 0)
        return false;
    }
    System.out.println("cnt = " + cnt);
    return true;
  }


  public static void main(String[] args) {
    System.out.println(14L == new FoxAndGCDLCM().get(2L, 20L));
  }
}
