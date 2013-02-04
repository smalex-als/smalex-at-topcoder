package common;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/4/13
 * Time: 8:38 PM
 */
public class SecondMostHighest {
  public int findSecondMostHighest(int[] arr) {
      int res0 = 0;
      int res1 = 0;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] > res0) {
          res1 = res0;
          res0 = arr[i];
        } else if (arr[i] > res1 && arr[i] != res0) {
          res1 = arr[i];
        }
      }
      return res1;
  }

  public static void main(String[] args) {
    System.out.println("secodMostHighest = " +
        new SecondMostHighest().findSecondMostHighest(new int[]{5, 7, 9, 3, 2, 4, 5, 1, 9, 2, 4, 5}));
  }
}
