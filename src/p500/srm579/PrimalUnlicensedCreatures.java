package p500.srm579;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 5/18/13
 * Time: 8:17 PM
 */
public class PrimalUnlicensedCreatures {
  public int maxWins(int initialLevel, int[] grezPower) {
    boolean[] won = new boolean[grezPower.length];
    int result = 0;
    Arrays.sort(grezPower);
    while (true) {
      int idx = -1;
      for (int i = 0; i < grezPower.length; i++) {
        if (!won[i]) {
          idx = i;
          break;
        }
      }
      if (idx == -1 || initialLevel <= grezPower[idx]) {
        return result;
      }
      won[idx] = true;
      initialLevel += grezPower[idx] / 2;
      result++;
    }
  }

  public static void main(String[] args) {
    System.out.println(new PrimalUnlicensedCreatures().maxWins(31, new int[]{10, 20, 30}));
    System.out.println(new PrimalUnlicensedCreatures().maxWins(20, new int[]{3, 3, 3, 3, 3, 1, 25 }));

  }
}
