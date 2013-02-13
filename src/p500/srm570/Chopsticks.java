package p500.srm570;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/13/13
 * Time: 4:11 PM
 */
public class Chopsticks {
  public int getmax(int[] length) {
    int[] stat = new int[105];
    for (int i = 0; i < length.length; i++) {
      stat[length[i]]++;
    }
    int res = 0;
    for (int i = 0; i < stat.length; i++) {
      res += stat[i] >> 1;
    }
    return res;
  }

  public static void main(String[] args) {
    int getmax = new Chopsticks().getmax(new int[]{1, 2, 3, 2, 1, 2, 3, 2, 1});
    System.out.println("getmax = " + getmax);
  }
}
