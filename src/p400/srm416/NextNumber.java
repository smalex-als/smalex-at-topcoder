package p400.srm416;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 04.09.2008
 * Time: 15:22:48
 */
public class NextNumber {
  public int getNextNumber(int N) {
    List<Integer> numbers = new ArrayList<Integer>();
    while (N > 0) {
      numbers.add(N % 2);
      N /= 2;
    }
    numbers.add(0);
//        dump(integerList);
    int num = 0;
    for (int i = 0; i < numbers.size() - 1; i++) {
      if (numbers.get(i) == 1 && numbers.get(i + 1) == 0) {
        numbers.set(i, 0);
        numbers.set(i + 1, 1);
//                dump(integerList);
        for (int j = 0; j < num; ++j) {
          numbers.set(j, 1);
//                    dump(integerList);
        }
        for (int j = num; j < i; ++j) {
          numbers.set(j, 0);
//                    dump(integerList);
        }
        break;
      }
      num += numbers.get(i);
    }
    return toInt(numbers);
  }

  private int toInt(List<Integer> numbers) {
    int result = 0;
    for (int i = numbers.size() - 1; i >= 0; i--) {
      result = result * 2 + numbers.get(i);
    }
    return result;
  }

  private void dump(List<Integer> integerList) {
    StringBuilder sb = new StringBuilder();
    final ArrayList<Integer> list = new ArrayList<Integer>(integerList);
//        Collections.reverse(list);
    for (Integer integer : list) {
      sb.append(integer);
    }
    System.out.println(sb.toString());
  }

  public static void main(String[] args) {
    System.out.println(new NextNumber().getNextNumber(4) == 8);
    System.out.println(new NextNumber().getNextNumber(7) == 11);
    System.out.println(new NextNumber().getNextNumber(12) == 17);
    System.out.println(new NextNumber().getNextNumber(1717) == 1718);
    System.out.println(new NextNumber().getNextNumber(555555) == 555557);
    System.out.println(new NextNumber().getNextNumber(1000000000) == 1000000512);
    System.out.println(new NextNumber().getNextNumber(1000000000) == 1000000512);
    System.out.println(new NextNumber().getNextNumber(999999999) == 1000000255);
    System.out.println(new NextNumber().getNextNumber(268435455) == 402653183);
  }
}
