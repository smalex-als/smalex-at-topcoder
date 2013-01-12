package sorting;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 29.02.2008
 * Time: 12:18:46
 */
public class BubbleSorting implements Sorting {
  private int cntCompare;
  private int cntSwap;

  public void sort(int[] arr) {
    cntCompare = 0;
    cntSwap = 0;
    for (int i = 0; i < arr.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        cntCompare++;
        if (arr[j] < arr[minIndex]) {
          int tmp = arr[minIndex];
          arr[minIndex] = arr[j];
          arr[j] = tmp;
          minIndex = j;
          cntSwap++;
        }
      }
    }
  }

  public int getCntCompare() {
    return cntCompare;
  }

  public int getCntSwap() {
    return cntSwap;
  }
}
