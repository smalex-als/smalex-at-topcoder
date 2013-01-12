package p400.srm405;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 14.06.2008
 * Time: 19:59:55
 */
public class FallingFactorialPower {
  public double compute(int n, int k) {
    if (k == 0) {
      return 1;
    }
    if (k > 0) {
      return n * compute(n - 1, k - 1);
    }
    return compute(n, k + 1) / (n - k);
  }

  public static void main(String[] args) {
    System.out.println(210.0 == new FallingFactorialPower().compute(7, 3));
    System.out.println(10.0 == new FallingFactorialPower().compute(10, 1));
    System.out.println(1.0 == new FallingFactorialPower().compute(5, 0));
    System.out.println(0.25 == new FallingFactorialPower().compute(3, -1));
    System.out.println(0.016666666666666666 == new FallingFactorialPower().compute(2, -3));
  }
}
