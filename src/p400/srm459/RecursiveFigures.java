package p400.srm459;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 19.01.2010
 * Time: 19:30:40
 */
public class RecursiveFigures {
  public double getArea(int sideLength, int K) {
    return area(sideLength, K);
  }

  public double area(double sideLength, int K) {
    if (K <= 0) {
      return 0;
    }
    double R = sideLength / 2;
    double v = Math.PI * R * R;
    final double newR = R * Math.sqrt(2);
    if (K > 1) {
      v -= newR * newR;
    }
    return area(newR, K - 1) + v;
  }

  public static void main(String[] args) {
    System.out.println(78.53981633974483 == new RecursiveFigures().getArea(10, 0));
    System.out.println(78.53981633974483 == new RecursiveFigures().getArea(10, 1));
    System.out.println(67.80972450961724 == new RecursiveFigures().getArea(10, 2));
    System.out.println(67.80972450961724 == new RecursiveFigures().getArea(100, 10));
  }
}
