// BEGIN CUT HERE
package p400.srm407;

import static utils.ExampleRunner.eq;


// END CUT HERE

public class CheapestRoute {
  public int[] routePrice(int[] cellPrice, int[] enterCell, int[] exitCell, int teleportPrice) {
    int[] res = new int[]{};
    return res;
  }

  // BEGIN CUT HERE
  public static void main(String[] args) {
    try {
      eq(0, (new CheapestRoute()).routePrice(new int[]{100}, new int[]{0}, new int[]{0}, 1000), new int[]{0, 0});
      eq(1, (new CheapestRoute()).routePrice(new int[]{0, -1, 0, 0}, new int[]{0}, new int[]{2}, 1000), new int[]{1000, 2});
      eq(2, (new CheapestRoute()).routePrice(new int[]{1, 2, 3}, new int[]{}, new int[]{}, 100), new int[]{5, 2});
      eq(3, (new CheapestRoute()).routePrice(new int[]{1, 0, -1}, new int[]{0}, new int[]{2}, 0), new int[]{});
      eq(4, (new CheapestRoute()).routePrice(new int[]{4, 2, 1, 0, 5, 6, 0, 3, 0}, new int[]{4, 4, 3, 7, 5, 4, 2, 5, 8, 4}, new int[]{7, 3, 5, 0, 5, 4, 5, 0, 8, 3}, 8), new int[]{14, 6});
    } catch (Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
// END CUT HERE
}
