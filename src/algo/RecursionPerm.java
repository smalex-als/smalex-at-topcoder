package algo;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 04.04.2010
 * Time: 12:14:15
 */
public class RecursionPerm {
  public void generate(int n) {
    int a[] = new int[n];
    for (int i = 0; i < a.length; i++) {
      a[i] = i;
    }
    innerGenerate(a, n, 0);
  }

  private void innerGenerate(int[] a, int n, int t) {
    String tab = "";
    for (int i = 0; i < t; i++) {
      tab += "   ";
    }
    System.out.println(tab + "enter t = " + t);
    if (t + 1 == n) {
      System.out.println(tab + "a = " + Arrays.toString(a));
    } else if (t < n) {
      for (int i = t; i < n; i++) {
        swap(a, t + 1, i);
        System.out.println(tab + "i = " + i + " a = " + Arrays.toString(a));
        innerGenerate(a, n, t + 1);
        swap(a, t + 1, i);
      }
    }
  }

  private void swap(int[] x, int a, int b) {
    int t = x[a];
    x[a] = x[b];
    x[b] = t;
  }

  public static void main(String[] args) {
    new RecursionPerm().generate(3);
  }
}
