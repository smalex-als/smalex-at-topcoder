package p400.srm490;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 12/8/10
 * Time: 7:03 PM
 */
public class LuckyCounter {
  public int countLuckyMoments(String[] moments) {
    int result = 0;
    for (String moment : moments) {
      if (isLuckMoment(moment)) {
        result++;
      }
    }
    return result;
  }

  private boolean isLuckMoment(String moment) {
    char c0 = moment.charAt(0);
    char c1 = moment.charAt(1);
    char c2 = moment.charAt(3);
    char c3 = moment.charAt(4);
    if (c0 == c2 && c1 == c3) {
      return true;
    }
    if (c0 == c1 && c2 == c3) {
      return true;
    }
    return c0 == c3 && c1 == c2;
  }

  public static void main(String[] args) {
    System.out.println(1 == new LuckyCounter().countLuckyMoments(new String[]{"12:21", "11:10"}));
  }
}
