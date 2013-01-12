package p300.srm399;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 24.04.2008
 * Time: 9:39:22
 */
public class AvoidingProduct {
  int best = Integer.MAX_VALUE;

  public int[] getTriple(int[] a, int n) {
    long time = System.currentTimeMillis();
    boolean ok[] = new boolean[n + 52];
    for (int i : a) {
      ok[i] = true;
    }
    int cnt = 0;
    int min = Integer.MAX_VALUE;
    int bx = 0, by = 0, bz = 0;
    for (int x = 1; x <= n + 51; x++) {
      if (!ok[x]) {
        for (int y = x; y <= n + 51; y++) {
          if (!ok[y]) {
            for (int z = y; z <= n + 51; z++) {
              if (!ok[z]) {
                cnt++;
                if (Math.abs(n - x * y * z) < min) {
                  min = Math.abs(n - x * y * z);
                  bx = x;
                  by = y;
                  bz = z;
                }
              }
            }
          }
        }
      }
    }
    System.out.println("cnt = " + cnt);
    System.out.println(String.format("%.4f", (System.currentTimeMillis() - time) / 1000.f));
    return new int[]{bx, by, bz};
  }

  public static void main(String[] args) {
    System.out.println(Arrays.equals(new int[]{1, 1, 3}, new AvoidingProduct().getTriple(new int[]{2, 4}, 4)));
    System.out.println(Arrays.equals(new int[]{24, 24, 24}, new AvoidingProduct().getTriple(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 16, 32, 64, 128, 256, 512, 11, 12, 13, 14, 15, 17, 18, 19, 20, 21, 22, 23, 34, 25, 26, 27, 28, 29, 30, 31, 51, 33, 340, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45}, 512)));
    System.out.println(Arrays.equals(new int[]{1, 1, 1000}, new AvoidingProduct().getTriple(new int[]{}, 1000)));
  }
}
