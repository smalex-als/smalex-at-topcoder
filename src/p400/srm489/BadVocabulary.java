package p400.srm489;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 30.11.10
 * Time: 15:02
 */
public class BadVocabulary {
  public int count(String badPrefix, String badSuffix, String badSubstring, String[] vocabulary) {
    int result = 0;
    for (String word : vocabulary) {
      if (word.startsWith(badPrefix) || word.endsWith(badSuffix)) {
        result++;
        continue;
      }
      final int indx = word.indexOf(badSubstring, 1);
      if (indx > 0 && indx + badSubstring.length() != word.length()) {
        result++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new BadVocabulary().count("bug", "bug", "bug", new String[]{"buggy", "debugger", "debug"}) == 3);
    System.out.println(new BadVocabulary().count("cut", "sore", "scar", new String[]{"scary", "oscar"}) == 0);
    System.out.println(new BadVocabulary().count("bar", "else", "foo", new String[]{"foofoofoo", "foobar", "elsewhere"}) == 1);
  }
}
