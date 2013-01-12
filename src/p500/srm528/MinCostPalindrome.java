package p500.srm528;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 12/28/11
 * Time: 11:17 AM
 */
public class MinCostPalindrome {

  private int oCost;
  private int xCost;

  public int getMinimum(String s, int oCost, int xCost) {
    this.oCost = oCost;
    this.xCost = xCost;
    int m[] = new int[s.length()];
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'o') {
        m[i] = 1;
      } else {
        m[i] = s.charAt(i) == 'x' ? -1 : 0;
      }
    }
    int result = 0;
    int solve = solve(result, m, 0);
    if (solve == Integer.MAX_VALUE) {
      return -1;
    }
    return solve;
  }

  private int solve(int result, int[] m, int pos) {
    if (m.length == pos) {
      if (isPalindrome(m)) {
        return result;
      }
      return Integer.MAX_VALUE;
    }
    if (m[pos] == 0) {
      m[pos] = 1;
      int solve1 = solve(result + oCost, m, pos + 1);
      m[pos] = -1;
      int solve2 = solve(result + xCost, m, pos + 1);
      m[pos] = 0;
      return Math.min(solve1, solve2);
    }
    return solve(result, m, pos + 1);
  }

  private boolean isPalindrome(int[] m) {
    for (int i = 0; i < m.length / 2; i++) {
      if (m[i] != m[m.length - 1 - i]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(8 == new MinCostPalindrome().getMinimum("oxo?xox?", 3, 5));
  }
}
