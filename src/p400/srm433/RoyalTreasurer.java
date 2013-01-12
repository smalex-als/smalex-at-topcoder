package p400.srm433;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 21.01.2009
 * Time: 19:01:29
 */
public class RoyalTreasurer {
  private static class myInt implements Comparable<myInt> {
    int value;
    int pos;

    private myInt(int value, int pos) {
      this.value = value;
      this.pos = pos;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof myInt)) return false;

      myInt myInt = (myInt) o;

      if (pos != myInt.pos) return false;
      if (value != myInt.value) return false;

      return true;
    }

    @Override
    public int hashCode() {
      int result = value;
      result = 31 * result + pos;
      return result;
    }

    public int compareTo(myInt o) {
      int thisVal = this.value;
      int anotherVal = o.value;
      return (thisVal < anotherVal ? -1 : (thisVal == anotherVal ? 0 : 1));
    }

    @Override
    public String toString() {
      return String.format("value=%d pos=%d", value, pos);
    }
  }

  public int minimalArrangement(int[] A, int[] B) {
    List<myInt> a = toList(A);
    List<myInt> b = toList(B);
    Collections.sort(a);
    Collections.sort(b);
    Collections.reverse(b);
    int j = 0;
    for (myInt myInt : b) {
      A[myInt.pos] = a.get(j++).value;
    }
    int result = 0;
    for (int i = 0; i < A.length; i++) {
      result += B[i] * A[i];
    }
    return result;
  }

  private List<myInt> toList(int[] A) {
    List<myInt> a = new ArrayList<myInt>();
    for (int i = 0; i < A.length; i++) {
      a.add(new myInt(A[i], i));

    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(80 == new RoyalTreasurer().minimalArrangement(new int[]{1, 1, 3},
        new int[]{10, 30, 20}));
    System.out.println(18 == new RoyalTreasurer().minimalArrangement(new int[]{1, 1, 1, 6, 0},
        new int[]{2, 7, 8, 3, 1}));

  }
}
