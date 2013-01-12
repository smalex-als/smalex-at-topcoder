package p500.srm536;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 3/7/12
 * Time: 7:10 AM
 */
public class BinaryPolynomialDivTwo {
  public int countRoots(int[] a) {
    return check(a, 0) + check(a, 1);
  }

  private int check(int[] a, int x) {
    int result = 0;
    for (int i = 0; i < a.length; i++) {
      result += a[i] * getPower(x, i);
    }
    return result % 2 == 0 ? 1 : 0;
  }

  private int getPower(int x, int i) {
    if (i == 0) {
      return 1;
    }
    if (x == 0) {
      return 0;
    }
    return 1;
  }

  public static void main(String[] args) {
    System.out.println(2 == new BinaryPolynomialDivTwo().countRoots(new int[]{0, 1, 0, 1}));
  }
}
