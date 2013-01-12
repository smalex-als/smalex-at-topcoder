package p400.srm416;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 04.09.2008
 * Time: 15:05:09
 */
public class MostCommonLetters {
  public String listMostCommon(String[] text) {
    int[] usage = new int[100];
    for (String s : text) {
      for (int i = 0; i < s.length(); i++) {
        final char c = s.charAt(i);
        if (c >= 'a' && c <= 'z') {
          usage[c - 'a']++;
        }
      }
    }
    int max = 0;
    for (int index : usage) {
      if (index > max) {
        max = index;
      }
    }
    if (max == 0) {
      return "";
    }
    List<Character> characters = new ArrayList<Character>();
    for (int i = 0; i < usage.length; i++) {
      if (usage[i] == max) {
        characters.add((char) ((int) 'a' + i));
      }
    }
    Collections.sort(characters);
    String result = "";
    for (Character character : characters) {
      result += character;
    }
    System.out.println("result = " + result);
    return result;
  }

  public static void main(String[] args) {
    System.out.println("a".equals(new MostCommonLetters().listMostCommon(new String[]{"abc a"})));
    System.out.println("ab".equals(new MostCommonLetters().listMostCommon(new String[]{"abc", "ab"})));
    System.out.println("aeqw".equals(new MostCommonLetters().listMostCommon(new String[]{"qwerty", "abc", "qwe", "a"})));
    System.out.println("a".equals(new MostCommonLetters().listMostCommon(new String[]{"english is a west germanic language originating",
                                                                                      "in england and is the first language for most",
                                                                                      "people in the united kingdom the united",
                                                                                      "states canada australia new zealand ireland",
                                                                                      "and the anglophone caribbean it is used",
                                                                                      "extensively as a second language and as an",
                                                                                      "official language throughout the world",
                                                                                      "especially in commonwealth countries and in",
                                                                                      "many international organizations"})));
  }
}
