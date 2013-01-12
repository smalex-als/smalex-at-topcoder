package p500.srm521;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 10/13/11
 * Time: 7:06 AM
 */
public class RedAndGreen {
  public int minPaints(String row) {
    int result = 0;
    for (int i = row.length() - 1; i >= 0; i--) {
      if (row.charAt(i) == 'R' && row.lastIndexOf('G', i) != -1) {
        result++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
//    System.out.println(new RedAndGreen().minPaints("RGRGR") == 2);
//    System.out.println(new RedAndGreen().minPaints("RRRGGGGG") == 0);
//    System.out.println(new RedAndGreen().minPaints("GGGGRRR") == 3);
    System.out.println(new RedAndGreen().minPaints("GRRGGGGRRGRRGRGRRRRRRRGGGGGGGGGGGRRRRGGRGGGGRGGRGR") == 16);
  }
}
