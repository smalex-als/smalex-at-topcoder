package p500.srm584;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 7/10/13
 * Time: 3:11 PM
 */
public class TopFox {
  public int possibleHandles(String familyName, String givenName) {
    Set<String> names = new HashSet<String>();
    for (int i = 1; i <= familyName.length(); i++) {
      for (int j = 1; j <= givenName.length(); j++) {
        names.add(familyName.substring(0, i) + givenName.substring(0, j));
      }
    }
    return names.size();
  }

  public static void main(String[] args) {
    System.out.println(12 == new TopFox().possibleHandles("fox", "ciel"));
  }
}
