package p400.srm487;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 13.11.2010
 * Time: 20:03:44
 */
public class BunnyExamAfter {
  public int getMaximum(String black, String gray, String white) {
    int result = 0;
    for (int i = 0; i < gray.length(); i++) {
      if (black.charAt(i) != gray.charAt(i) && gray.charAt(i) == white.charAt(i)) {
        result += 2;
      } else if (black.charAt(i) != gray.charAt(i) || black.charAt(i) != white.charAt(i)) {
        result++;
      }
    }
//    System.out.println("result = " + result);
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new BunnyExamAfter().getMaximum("ABC", "PQR", "XYZ") == 3);
    System.out.println(new BunnyExamAfter().getMaximum("ABC", "ABC", "ABC") == 0);
    System.out.println(new BunnyExamAfter().getMaximum("A", "B", "B") == 2);
    System.out.println(new BunnyExamAfter().getMaximum("AAAAA", "AABBB", "BBBAA") == 6);
    System.out.println(new BunnyExamAfter().getMaximum("AAAAA", "BBBBB", "BBBBB") == 10);
    System.out.println(new BunnyExamAfter().getMaximum("AAAAA", "BBBBB", "BBBBC") == 9);
    System.out.println(new BunnyExamAfter().getMaximum("TOPCODER", "TOPBUNNY", "THEHONEY") == 9);
  }
}
