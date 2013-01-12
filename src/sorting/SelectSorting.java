package sorting;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 29.02.2008
 * Time: 12:43:52
 */
public class SelectSorting implements Sorting {
  private int cntCompare;
  private int cntSwap;

  public void sort(int[] arr) {
    cntCompare = 0;
    cntSwap = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        cntCompare++;
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      int tmp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = tmp;
      cntSwap++;
    }
  }

  public int getCntCompare() {
    return cntCompare;
  }

  public int getCntSwap() {
    return cntSwap;
  }
}
