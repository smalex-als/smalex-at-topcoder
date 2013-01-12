package p500.srm505;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 5/3/11
 * Time: 3:05 PM
 */
public class SentenceCapitalizerInator {
  public String fixCaps(String paragraph) {
    StringBuilder sb = new StringBuilder();
    boolean started = false;
    for (int i = 0; i < paragraph.length(); i++) {
      char c = paragraph.charAt(i);
      if (!started) {
        if (c >= 'a' && c <= 'z') {
          started = true;
          c = Character.toUpperCase(c);
        }
      } else {
        if (c == '.') {
          started = false;
        }
      }
      sb.append(c);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(new SentenceCapitalizerInator().fixCaps("example four. the long fourth example. a. b. c. d."));
  }
}
