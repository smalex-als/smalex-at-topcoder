package p400.srm434;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 07.02.2009
 * Time: 20:00:58
 */
public class LeastMajorityMultiple {
  public int leastMajorityMultiple(int a, int b, int c, int d, int e) {
    int[] n = new int[]{a, b, c, d, e};
    for (int i = 1; i <= 100 * 100 * 100; i++) {
      int cnt = 0;
      for (int i1 : n) {
        if (i % i1 == 0) {
          cnt++;
        }
      }
      if (cnt >= 3) {
        return i;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(4 == new LeastMajorityMultiple().leastMajorityMultiple(1, 2, 3, 4, 5));
    System.out.println(210 == new LeastMajorityMultiple().leastMajorityMultiple(30, 42, 70, 35, 90));
  }
}
