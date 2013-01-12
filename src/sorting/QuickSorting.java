package sorting;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 29.02.2008
 * Time: 14:35:38
 */
public class QuickSorting implements Sorting {
  public void sort(int[] arr) {
    Arrays.sort(arr);
  }

  public int getCntCompare() {
    return 0;
  }

  public int getCntSwap() {
    return 0;
  }
}
