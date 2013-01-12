package p400.srm402;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 24.05.2008
 * Time: 20:04:55
 */
public class WordAbbreviation {
  public String[] getAbbreviations(String[] words) {
    String[] result = new String[words.length];
    for (int i = 0; i < words.length; i++) {
      result[i] = findAbbr(words, i, words[i]);
    }
    return result;
  }

  private String findAbbr(String[] words, int ignore, String word) {
    for (int i = 1; i < word.length(); i++) {
      String test = word.substring(0, i);
      boolean ok = true;
      for (int j = 0; j < words.length; j++) {
        if (j != ignore && words[j].startsWith(test)) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return test;
      }
    }
    return word;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.equals(new String[]{"t", "cod", "con"},
        new WordAbbreviation().getAbbreviations(new String[]{"top", "coder", "contest"})));
  }
}
