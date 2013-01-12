package p500.srm507;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 5/28/11
 * Time: 8:12 PM
 */
public class CubeStickers {
  private static final String YES = "YES";
  private static final String NO = "NO";

  public String isPossible(String[] sticker) {
    Map<String, Integer> count = new HashMap<String, Integer>();
    for (String s : sticker) {
      Integer cnt = count.get(s);
      if (cnt == null) {
        cnt = 0;
      }
      cnt++;
      count.put(s, cnt);
    }
    int cntPair = 0;
    int notPair = 0;
    for (String color : count.keySet()) {
      if (count.get(color) >= 2) {
        cntPair++;
      } else {
        notPair++;
      }
    }
    if (cntPair >= 3) {
      return YES;
    }
    if (cntPair >= 2 && notPair >= 2) {
      return YES;
    }
    if (cntPair >= 1 && notPair >= 4) {
      return YES;
    }
    if (notPair >= 6) {
      return YES;
    }
    return NO;
  }

  public static void main(String[] args) {
    System.out.println("YES".equals(new CubeStickers().isPossible(new String[]{"cyan", "magenta", "yellow", "purple", "black", "white", "purple"})));
  }
}
