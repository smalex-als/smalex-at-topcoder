package algo;

import utils.ExampleRunner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 1/25/13
 * Time: 12:58 PM
 */
public class BreakWordIntoPieces {
  public String breakWorkIntoPieces(String text, Set<String> dict) {
    if (dict.contains(text)) {
      return text;
    }
    for (int i = 1; i < text.length(); i++) {
      String t = text.substring(0, i);
      if (dict.contains(t)) {
        String res = breakWorkIntoPieces(text.substring(i), dict);
        if (res != null) {
          return t + " " + res;
        }
      }
    }
    return null;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, "i love you", new BreakWordIntoPieces().breakWorkIntoPieces("iloveyou",
        new HashSet<String>(Arrays.asList("i", "love", "you", "yo", "none"))));
    ExampleRunner.eq(2, "a a aaaaa", new BreakWordIntoPieces().breakWorkIntoPieces("aaaaaaa",
        new HashSet<String>(Arrays.asList("a", "aa", "aaa", "aaaa", "aaaaa"))));
  }
}
