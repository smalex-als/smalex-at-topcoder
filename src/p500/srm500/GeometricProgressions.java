package p500.srm500;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 3/19/11
 * Time: 7:31 PM
 * with help
 */
public class GeometricProgressions {
  private static class Pair {
    long a;
    long b;

    private Pair(long a, long b) {
      this.a = a;
      this.b = b;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Pair)) return false;

      Pair pair = (Pair) o;

      if (a != pair.a) return false;
      if (b != pair.b) return false;

      return true;
    }

    @Override
    public int hashCode() {
      int result = (int) (a ^ (a >>> 32));
      result = 31 * result + (int) (b ^ (b >>> 32));
      return result;
    }
  }

  public int count(int b1, int q1, int n1, int b2, int q2, int n2) {
    Set<Pair> set = new HashSet<Pair>();
    makeProgress(set, b1, q1, n1);
    makeProgress(set, b2, q2, n2);
    int size = set.size();
    System.out.println("size = " + size);
    return size;
  }

  private void makeProgress(Set<Pair> set, int b, int q, int n) {
    long a1 = b;
    long a2 = b;
    while (n-- > 0) {
      set.add(new Pair(a1, a2));
      a1 *= q;
      a2 *= q;
      a1 %= 1000000007;
      a2 %= 1000000009;
    }
  }

  public static void main(String[] args) {
    System.out.println(6 == new GeometricProgressions().count(3, 2, 5, 6, 2, 5));
    System.out.println(9 == new GeometricProgressions().count(3, 2, 5, 2, 3, 5));
    System.out.println(2 == new GeometricProgressions().count(1, 1, 1, 0, 0, 1));
    System.out.println(100500 == new GeometricProgressions().count(3, 4, 100500, 48, 1024, 1000));
  }
}
