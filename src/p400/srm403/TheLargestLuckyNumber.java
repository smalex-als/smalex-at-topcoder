package p400.srm403;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 29.05.2008
 * Time: 5:02:40
 */
public class TheLargestLuckyNumber {
  public int find(int n) {
    final long start = System.currentTimeMillis();
    int[] num = new int[11];
    int p = Integer.toString(n).length();
    for (int i = num.length - 1; i > num.length - p; i--) {
      num[i] = 4;
    }
    int prev_search = toInteger(num);
    int search = prev_search;
    int i = 0;
    while (search <= n) {
      prev_search = search;
      next(num);
      search = toInteger(num);
      i++;
    }
    System.out.println("iterated = " + i);
    System.out.println(String.format("time: %.4f", ((System.currentTimeMillis() - start) / 1000.f)));
    System.out.println("prev_search = " + prev_search);
    return prev_search;
  }

  private void next(int[] num) {
    int s = num.length - 1;
    while (!(num[s] < 7)) s--;
    num[s] = inc(num[s]);
    for (int i = s + 1; i < num.length; i++) {
      num[i] = 4;
    }
  }

  private int toInteger(int[] num) {
    int result = 0;
    for (int i : num) {
      result = result * 10 + i;
    }
    return result;
  }

  private int inc(int i) {
    return i == 4 ? 7 : 4;
  }

  public static void main(String[] args) {
    System.out.println(77 == new TheLargestLuckyNumber().find(100));
    System.out.println(74 == new TheLargestLuckyNumber().find(75));
    System.out.println(4 == new TheLargestLuckyNumber().find(5));
    System.out.println(474747 == new TheLargestLuckyNumber().find(474747));
    System.out.println(774747477 == new TheLargestLuckyNumber().find(774747478));
    System.out.println(774747477 == new TheLargestLuckyNumber().find(1000000000));
  }
}
