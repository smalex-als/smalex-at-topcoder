package sorting;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 29.02.2008
 * Time: 12:56:16
 */
public class InsertSorting implements Sorting {
  private int cntCompare;
  private int cntSwap;

  public void sort(int[] arr) {
    cntCompare = 0;
    cntSwap = 0;

    for (int i = 1; i < arr.length; i++) {
      int value = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > value) {
        cntSwap++;
        arr[j + 1] = arr[j];
        j--;
      }
      cntSwap++;
      arr[j + 1] = value;
    }
    cntCompare = cntSwap;
    cntSwap = cntSwap / 2;
  }

  public int getCntCompare() {
    return cntCompare;
  }

  public int getCntSwap() {
    return cntSwap;
  }
}
