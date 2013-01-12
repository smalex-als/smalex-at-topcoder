package algo;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 31.01.11
 * Time: 18:22
 */
public class Parentheses {
  private Set<String> visit = new HashSet<String>();

  public int count(int n) {
    return innerCount("", n);
  }

  private int innerCount(String s, int n) {
    if (n == 0) {
      if (!visit.contains(s)) {
        visit.add(s);
        System.out.println(s);
        return 1;
      }
      return 0;
    }
    int result = 0;
    for (int i = 0; i <= s.length(); i++) {
      result += innerCount(s.substring(0, i) + "()" + s.substring(i), n - 1);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(5 == new Parentheses().count(3));
  }
}
