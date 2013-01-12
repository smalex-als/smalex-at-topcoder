package p400.srm400;

/**
 * Created by IntelliJ IDEA.
 * User: Tanya
 * Date: 01.05.2008
 * Time: 15:40:51
 */
public class StrongPrimePower {
  public int[] baseAndExponent(String _n) {
    long n = Long.parseLong(_n);
    for (int exp = 2; exp <= 70; exp++) {
      double x = Math.pow(n, 1.0 / exp);
      long a = Math.max(2, (long) x - 1);
      for (long b = a; b <= a + 2; ++b) {
        if (isOK(b, exp, n) && isPrime(b)) {
          System.out.println("OK");
          return new int[]{(int) b, exp};
        }
      }
    }
    return new int[]{};
  }

  private boolean isOK(long b, int exp, long n) {
    while (n % b == 0) {
      n /= b;
      exp--;
    }
    return exp == 0 && n == 1;
  }

  public int[] getPrimes(int n) {
    int[] m = new int[n];
    for (int i = 2; i < n; i++) {
      m[i] = i;
    }
    for (int i = 2; i * i <= n; i++) {
      for (int j = 2 * i; j < n; j += i) {
        m[j] = 0;
      }
    }
    return m;
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
//        System.out.println(Arrays.equals(new int[]{3, 3}, new StrongPrimePower().baseAndExponent("27")));
//        System.out.println(Arrays.equals(new int[]{999999937, 2}, new StrongPrimePower().baseAndExponent("999999874000003969")));
//        System.out.println(Arrays.equals(new int[]{2, 59}, new StrongPrimePower().baseAndExponent("576460752303423488")));
//        System.out.println(Arrays.toString(new StrongPrimePower().getPrimes(100)));
    System.out.println(new StrongPrimePower().isPrime(999999937));
  }
}
