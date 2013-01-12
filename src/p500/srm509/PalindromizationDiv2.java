package p500.srm509;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 6/8/11
 * Time: 3:05 PM
 */
public class PalindromizationDiv2 {
  public int getMinimumCost(int X) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < 200000; i++) {
      if (isPalidrom(i)) {
        min = Math.min(min, Math.abs(X - i));
      }
    }
    return min;
  }

  private boolean isPalidrom(int x) {
    final String s = String.valueOf(x);
    final int length = s.length() / 2;

    for (int i = 0; i < length; i++) {
      if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(3 == new PalindromizationDiv2().getMinimumCost(25));
    System.out.println(1 == new PalindromizationDiv2().getMinimumCost(99998));
    System.out.println(1 == new PalindromizationDiv2().getMinimumCost(100000));
  }
}
