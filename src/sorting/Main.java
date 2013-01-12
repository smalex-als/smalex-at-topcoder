package sorting;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 29.02.2008
 * Time: 12:44:16
 */
public class Main {
  public static void main(String[] args) {
    Sorting[] sortings = new Sorting[]{new BubbleSorting(), new SelectSorting(), new InsertSorting(),
                                       new QuickSorting()};
    final int[] arr = new int[]{4, 6, 1, 8, 2, 7, 10, 3, 5, 9};
    final int[] bigArr = createArray(1000);

    for (int i = 0; i < sortings.length; i++) {
      final int[] ints = bigArr.clone();
      final long start = System.currentTimeMillis();
      Sorting sorting = sortings[i];
      System.out.println("\n" + sorting.getClass().getSimpleName());
//            System.out.println("before = " + Arrays.toString(ints));
      sorting.sort(ints);
//            System.out.println("after = " + Arrays.toString(ints));
      System.out.println("sorting.getCntCompare() = " + sorting.getCntCompare());
      System.out.println("sorting.getCntSwap() = " + sorting.getCntSwap());
      System.out.println(String.format("%.05f", (System.currentTimeMillis() - start) / 1000.f));
    }
  }

  private static int[] createArray(int size) {
    final Random rnd = new Random();
    final int[] ints = new int[size];
    for (int i = 0; i < ints.length; i++) {
      ints[i] = rnd.nextInt(size);
    }
    return ints;
  }
}
