package p400.srm491;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 12/18/10
 * Time: 8:02 PM
 */
public class OneDigitDifference {
  public int getSmallest(int N) {
    if (N == 0) {
      return 1;
    }
    final String result = String.valueOf(N).replaceFirst("[1-9]", "0").replaceAll("^0+", "");
    return result.length() == 0 ? 0 : Integer.parseInt(result);
  }

  public static void main(String[] args) {
    System.out.println(0 == new OneDigitDifference().getSmallest(9));
    System.out.println(1 == new OneDigitDifference().getSmallest(0));
    System.out.println(123 == new OneDigitDifference().getSmallest(900000123));
    System.out.println(0 == new OneDigitDifference().getSmallest(30000));
    System.out.println(7 == new OneDigitDifference().getSmallest(47));
    System.out.println(907654321 == new OneDigitDifference().getSmallest(1907654321));
  }
}
