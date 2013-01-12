package p500.srm504_5;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 5/17/11
 * Time: 7:19 PM
 */
public class TheNumbersWithLuckyLastDigit {
  public int find(int n) {
    return solve(n);
  }

  private int solve(int n) {
    if (n < 0) {
      return -1;
    }
    int rest = n % 10;
    if (rest == 4 || rest == 7) {
      return 1;
    }
    int s1 = solve(n - 7);
    int s2 = solve(n - 4);
    if (s1 == -1 && s2 == -1) {
      return -1;
    }
    if (s1 != -1 && s2 != -1) {
      return 1 + Math.min(s1, s2);
    }
    if (s1 == -1) {
      return 1 + s2;
    }
    return 1 + s1;
  }

  public static void main(String[] args) {
//    System.out.println(4 == new TheNumbersWithLuckyLastDigit().find(99));
//    System.out.println(new TheNumbersWithLuckyLastDigit().find(1000000000));
//    System.out.println(1 == new TheNumbersWithLuckyLastDigit().find(1234567));
//    System.out.println(new TheNumbersWithLuckyLastDigit().find(13));
//    System.out.println(new TheNumbersWithLuckyLastDigit().find(7));
//    System.out.println(new TheNumbersWithLuckyLastDigit().find(1));
//    for (int i = 20; i < 30; i++) {
//      System.out.println(new TheNumbersWithLuckyLastDigit().find(i));
//    }
    System.out.println(new TheNumbersWithLuckyLastDigit().find(16));
    System.out.println(new TheNumbersWithLuckyLastDigit().find(26));
  }
}
