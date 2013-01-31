package p500.srm568;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 1/29/13
 * Time: 8:10 PM
 */
public class TheSimilarNumbers {
  public int find(int lower, int upper) {
    int result = 0;
    while (true) {
      if (lower <= upper) {
        lower = (lower) * 10 + 1;
        result++;
      } else {
        break;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new TheSimilarNumbers().find(1, 10));
    System.out.println(new TheSimilarNumbers().find(5, 511));
    System.out.println(new TheSimilarNumbers().find(5, 4747));
    System.out.println(new TheSimilarNumbers().find(1, 1000000));
    System.out.println(new TheSimilarNumbers().find(10, 10110));
  }
}
