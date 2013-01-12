package p500.srm537;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 3/17/12
 * Time: 12:10 PM
 */
public class KingXNewBaby {
  public String isValid(String name) {
    boolean ok = name.length() == 8;
    int[] count = new int[27];
    for (char c : name.toCharArray()) {
      if (c < 'a' || c > 'z') {
        ok = false;
        break;
      } else {
        count[c - 'a']++;
      }
    }

    int vowels = 0;
    boolean vowelsTwoLetters = false;
    for (int aChar : new int[]{'a', 'e', 'i', 'o', 'u'}) {
      final int oneUsage = count[aChar - 'a'];
      if (oneUsage == 2) {
        vowelsTwoLetters = true;
      }
      vowels += oneUsage;

    }
    if (!ok || vowels != 2 || !vowelsTwoLetters) {
      ok = false;
    }
    return ok ? "YES" : "NO";
  }

  public static void main(String[] args) {
    System.out.println("YES".equals(new KingXNewBaby().isValid("dengklek")));
    System.out.println("NO".equals(new KingXNewBaby().isValid("dEngklek")));
  }
}
