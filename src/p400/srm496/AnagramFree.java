package p400.srm496;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 01.02.11
 * Time: 15:03
 */
public class AnagramFree {
  public int getMaximumSubset(String[] S) {
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    for (String s : S) {
      final char[] chars = s.toCharArray();
      Arrays.sort(chars);
      final String w = new String(chars);
      Integer cnt = map.get(w);
      if (cnt == null) {
        cnt = 0;
      }
      cnt++;
      map.put(w, cnt);
    }
    return map.size();
  }

  public static void main(String[] args) {
    System.out.println(1 == new AnagramFree().getMaximumSubset(new String[]{"abcd", "abdc", "dabc", "bacd"}));
    System.out.println(2 == new AnagramFree().getMaximumSubset(new String[]{"abcd", "abac", "aabc", "bacd"}));
    System.out.println(6 == new AnagramFree().getMaximumSubset(new String[]{"aa", "aaaaa", "aaa", "a", "bbaaaa", "aaababaa"}));
    System.out.println(4 == new AnagramFree().getMaximumSubset(new String[]{"creation", "sentence", "reaction", "sneak", "star", "rats", "snake"}));
  }
}
