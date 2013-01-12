package p500.srm535;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 3/3/12
 * Time: 12:57 PM
 */
public class FoxAndSorting {
  public long get(long idx) {
    idx--;
    StringBuilder sb = new StringBuilder();
    for (long i = 5L; i > 0; i--) {
      long d = idx / i;
      if (d > 0) {
        sb.append(d);
        idx -= d * i;
      } else {
        if (sb.length() > 0) {
          sb.append(0);
        }
      }
    }
    return new Long(sb.toString());
  }

  public void print() {
    List<Integer> integers = new ArrayList<Integer>();
    for (int i = 0; i < 1000000; i++) {
      integers.add(i);
    }

    Collections.sort(integers, new Comparator<Integer>() {
      public int compare(Integer integer, Integer integer1) {
        int num = getDigits(integer);
        int num1 = getDigits(integer1);
        if (num == num1) {
          return String.format("%06d", integer).compareTo(String.format("%06d", integer1));
        }
        return num - num1;
      }
    });
    int cnt = 1;
    for (Integer integer : integers) {
      System.out.println(String.format("%06d = %d", integer, cnt));
      cnt++;
      if (cnt == 10000) {
        break;
      }
    }
  }

  private int getDigits(Integer integer) {
    int result = 0;
    while (integer > 0) {
      result += integer % 10;
      integer /= 10;
    }
    return result;
  }

  public static void main(String[] args) {
//    System.out.println(new FoxAndSorting().get(10L));
//    for (int i = 2; i < 50; i++) {
//      System.out.println(new FoxAndSorting().get(i));
//
//    }
      new FoxAndSorting().print();
//    System.out.println(new FoxAndSorting().get(58L));
//    System.out.println(new FoxAndSorting().get(58L));
//    System.out.println(new FoxAndSorting().get(1000000000000000000L));
  }
}
