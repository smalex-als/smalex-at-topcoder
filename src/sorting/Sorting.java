package sorting;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 29.02.2008
 * Time: 12:18:15
 */
public interface Sorting {
  void sort(int[] arr);

  int getCntCompare();

  int getCntSwap();
}
