package p600.srm667;


/**
 * Created by smalex on 11/09/15.
 */
public class OrderOfOperationsDiv2 {
  public int minTime(String[] s) {
    boolean[] cached = new boolean[s[0].length()];
    int res = 0;
    for (int i = 0; i < s.length; i++) {
      for (int m = i + 1; m < s.length; m++) {
        int cost = cost(s[i], s[m], cached);
        if (cost > 0) {
          String tmp = s[m];
          s[m] = s[i];
          s[i] = tmp;
        }
      }
      int k = 0;
      for (int j = 0; j < s[i].length(); j++) {
        if (s[i].charAt(j) == '1' && !cached[j]) {
          cached[j] = true;
          k++;
        }
      }
      res += k * k;
    }
    return res;
  }

  private int cost(String first, String second, boolean[] cached) {
    int fk = 0;
    int sk = 0;
    for (int j = 0; j < first.length(); j++) {
      if (cached[j]) {
        continue;
      }
      if (first.charAt(j) == '1') {
        fk++;
      }
      if (second.charAt(j) == '1') {
        sk++;
      }
    }
    return fk - sk;
  }

  public static void main(String[] args) {
    int res = new OrderOfOperationsDiv2().minTime(new String[]{
        "111",
        "111",
        "110",
        "100"
    });
    System.out.println("res = " + res);
  }
}
