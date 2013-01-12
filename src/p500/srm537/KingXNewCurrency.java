package p500.srm537;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 3/17/12
 * Time: 12:27 PM
 * with help
 */
public class KingXNewCurrency {
  public int howMany(int A, int B, int X) {
    if (A % X == 0 && B % X == 0) {
      return -1;
    }
    int result = 0;
    for (int i = 1; i <= 200; i++) {
      if (isDenominited(A, X, i) && isDenominited(B, X, i)) {
        result++;
      }
    }
    System.out.println("result = " + result);
    return result;
  }

  private static boolean isDenominited(int price, int A, int B) {
    if (price % A == 0 || price % B == 0) {
      return true;
    }
    for (int i = 1; i <= 200; i++) {
      if ((price % (B * i)) % A == 0 || (price % (A * i)) % B == 0) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(5 == new KingXNewCurrency().howMany(5, 8, 5));
    System.out.println(-1 == new KingXNewCurrency().howMany(8, 4, 2));
    System.out.println(2 == new KingXNewCurrency().howMany(47, 74, 44));
    System.out.println(65 == new KingXNewCurrency().howMany(128, 96, 3));
//    System.out.println(KingXNewCurrency.isDenominited(5, 2, 10));
//    System.out.println(KingXNewCurrency.isDenominited(5, 8, 10));

  }
}
