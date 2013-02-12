package common;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/4/13
 * Time: 9:02 PM
 */
public class MergeAndFindKth {
  public int findKth(int[] a, int[] b, int k) {

    if (a.length + b.length <= k) {
      return -1;
    }
    int offsetA = 0;
    int offsetB = 0;

    while (true) {
      while (offsetA < a.length && (offsetB == b.length || a[offsetA] <= b[offsetB])) {
        if (offsetA + offsetB == k) {
          return a[offsetA];
        }
        offsetA++;
      }
      while (offsetB < b.length && (offsetA == a.length || b[offsetB] <= a[offsetA])) {
        if (offsetB + offsetA == k) {
          return b[offsetB];
        }
        offsetB++;
      }
    }
  }

  public static void main(String[] args) {
//    int kth = new MergeAndFindKth().findKth(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 6, 7}, 5);
    int kth = new MergeAndFindKth().findKth(new int[]{1, 2, 3}, new int[]{4, 5}, 5);
    System.out.println("kth = " + kth);
  }
}
