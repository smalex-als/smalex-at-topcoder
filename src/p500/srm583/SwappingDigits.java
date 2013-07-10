package p500.srm583;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 6/18/13
 * Time: 7:11 PM
 */
public class SwappingDigits {
  public String minNumber(String num) {
    String min = num;
    for (int i = 0; i < num.length(); i++) {
      char[] chars = num.toCharArray();
      for (int j = i + 1; j < num.length(); j++) {
        char aChar = chars[i];
        char bChar = chars[j];
        chars[i] = bChar;
        chars[j] = aChar;
        String test = new String(chars);
        if (test.compareTo(min) < 0 && test.charAt(0) != '0') {
          min = test;
        }
        chars[i] = aChar;
        chars[j] = bChar;
      }
    }
    return min;
  }

  public static void main(String[] args) {
    System.out.println("569".equals(new SwappingDigits().minNumber("596")));
  }
}
