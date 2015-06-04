package p600.srm660;

/**
 * Created by smalex on 04/06/15.
 */
public class Cyclemin {
  public Cyclemin() {
  }

  public String bestmod(String s, int k) {
    String max = s;
    for (int i = 0; i < s.length(); i++) {
      String tmp = s.substring(i) + s.substring(0, i);

      final char[] chars = tmp.toCharArray();
      int tmpk = k;
      for (int j = 0; j < chars.length && tmpk > 0; j++) {
        if (chars[j] != 'a') {
          chars[j] = 'a';
          tmpk--;
        }
      }
      tmp = new String(chars);
      if (max.compareTo(tmp) > 0) {
        max = tmp;
      }
    }
    System.out.println("max = " + max);

    return max;
  }

  public static void main(String[] args) {
    final String ans = new Cyclemin().bestmod("zzzz", 4);
//    final String ans = new Cyclemin().bestmod("12345", 1);
    System.out.println("ans = " + ans.equals("aasgsg"));
  }
}
