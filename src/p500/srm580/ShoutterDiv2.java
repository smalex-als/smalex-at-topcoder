package p500.srm580;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 5/25/13
 * Time: 8:11 PM
 */
public class ShoutterDiv2 {
  public int count(int[] s, int[] t) {
    int result = 0;
    int N = s.length;
    for (int i = 0; i < N; i++) {
      int s1 = s[i];
      int t1 = t[i];
      for (int j = i + 1; j < N; j++) {
        int s2 = s[j];
        int t2 = t[j];
        if (s1 <= s2 && s2 <= t1) {
          result++;
        } else if (s1 >= s2 && s1 <= t2) {
          result++;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {

    int count = new ShoutterDiv2().count(new int[]{1, 2, 4}, new int[]{3, 4, 6});
    System.out.println("count = " + count);
  }
}
