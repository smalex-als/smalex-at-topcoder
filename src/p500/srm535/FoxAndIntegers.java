package p500.srm535;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 3/3/12
 * Time: 12:06 PM
 */
public class FoxAndIntegers {
  public int[] get(int AminusB, int BminusC, int AplusB, int BplusC) {
    int B = (AplusB - AminusB) / 2;
    int A = AminusB + B;
    int C = BplusC - B;
    if (A - B == AminusB && B - C == BminusC && A + B == AplusB && B + C == BplusC) {
      return new int[]{A, B, C};
    }
    return new int[]{};
  }

  public static void main(String[] args) {
    System.out.println(Arrays.equals(new FoxAndIntegers().get(1, -2, 3, 4), new int[]{2, 1, 3}));
  }
}
