package p400.srm458;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 14.01.2010
 * Time: 19:37:43
 */
public class ProductTriplet {
  public long countTriplets(int minx, int maxx, int miny, int maxy, int minz, int maxz) {
    long l = 0L;
    for (int y = miny; y <= maxy; y++) {
      int sx = Math.max(minx, (minz + y - 1) / y);
//      while (sx * y < minz && sx < maxx) {
//        sx++;
//        System.out.println("inc " + y);
//      }
      int fx = Math.min(maxx, maxz / y);
//      while (fx * y > maxz && fx > minx) {
//        fx--;
//        System.out.println("dec " + y);
//      }
      if (sx * y >= minz && fx * y <= maxz) {
        l += fx - sx + 1;
//        System.out.println("sx = " + sx);
//        System.out.println("fx = " + fx);
      }
    }
//    System.out.println("l = " + l);
    return l;
  }

  public static void main(String[] args) {
    System.out.println(1L == new ProductTriplet().countTriplets(2, 2, 3, 3, 6, 6));
    System.out.println(0L == new ProductTriplet().countTriplets(2, 2, 3, 3, 7, 7));
    System.out.println(4L == new ProductTriplet().countTriplets(6, 8, 4, 5, 27, 35));
    System.out.println(2877L == new ProductTriplet().countTriplets(1, 458, 1, 458, 1, 458));
    System.out.println(2365846085L == new ProductTriplet().countTriplets(8176, 184561, 1348, 43168, 45814517, 957843164));
//    System.out.println(20877697633L == new ProductTriplet().countTriplets(1, 999999999, 1, 1000000000, 1, 1000000000));
    System.out.println(0L == new ProductTriplet().countTriplets(88570, 1000000000, 18108208, 1000000000, 138149, 1000000000));
    System.out.println(9176028858L == new ProductTriplet().countTriplets(1, 1000000000, 11429, 117157997, 7713, 1000000000));
    System.out.println(0L == new ProductTriplet().countTriplets(3269, 5748439, 83150301, 1000000000, 9493, 28203));
  }
}
