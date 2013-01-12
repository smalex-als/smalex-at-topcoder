package algo;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 17.03.2010
 * Time: 7:37:26
 */
public class Permutations {
  public boolean nextNumber(int[] digit) {
    int s = digit.length - 1;
    // ищем перелом
    while (s > 0 && digit[s - 1] >= digit[s]) {
      s--;
    }
    if (s == 0) {
      return false;
    }
    s--;
    int i = digit.length - 1;
    // ищем цифру которая больше текущей цифры digit_s
    // нам подойдёт первая найденная цифра потому что все цифры в этом отрезке
    // должны стоять в порядке убывания.
    while (i > s && digit[s] >= digit[i]) {
      i--;
    }
    swap(digit, s, i);
    int k = (digit.length - s - 1) / 2;
    // поменяем порядок чисел чтобы они шли в возрастающем порядке
    // сейчас цифры идут в убывающем
    for (i = 0; i < k; i++) {
      swap(digit, s + 1 + i, digit.length - 1 - i);
    }
    return true;
  }

  private void swap(int[] x, int a, int b) {
    int t = x[a];
    x[a] = x[b];
    x[b] = t;
  }

  private String printDigit(int[] digit) {
    String result = "";
    for (int i1 : digit) {
      result += (char) (i1 + '0');
    }
    return result;
  }

  private int[] initNumber(int n) {
    int result[] = new int[n];
    for (int i = 0; i < n; i++) {
      result[i] = i + 1;
    }
    return result;
  }

  public static void main(String[] args) {
    final Permutations p = new Permutations();
    final int[] number = p.initNumber(4);
    do {
      System.out.println("number = " + p.printDigit(number));
    } while (p.nextNumber(number));
  }
}
