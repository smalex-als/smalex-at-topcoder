package p400.srm417;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 11.09.2008
 * Time: 19:11:38
 */
public class ReversedSum {
  public int getReversedSum(int x, int y) {
    return rev(rev(x) + rev(y));
  }

  static int rev(int x) {
    List<Integer> numbers = new ArrayList<Integer>();
    while (x > 0) {
      numbers.add(x % 10);
      x /= 10;
    }
    int res = 0;
    for (Integer number : numbers) {
      res = res * 10 + number;
    }

    return res;
  }

  public static void main(String[] args) {
    System.out.println(rev(123));
    System.out.println(rev(100));
    System.out.println(223 == new ReversedSum().getReversedSum(100, 123));
  }
}
