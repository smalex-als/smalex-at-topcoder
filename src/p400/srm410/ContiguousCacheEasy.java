// BEGIN CUT HERE
package p400.srm410;

import static utils.ExampleRunner.eq;


// END CUT HERE
public class ContiguousCacheEasy {
  public int bytesRead(int n, int k, int[] addresses) {
    int res = 0;
    int pos = 0;
    for (int address : addresses) {
      if (pos <= address && address < pos + k) {
        continue;
      }
      int newpos = pos < address ? address - k + 1 : address;
      res += Math.min(k, Math.abs(pos - newpos));
      pos = newpos;
    }
    return res;
  }

  // BEGIN CUT HERE
  public static void main(String[] args) {
    try {
      eq(1, (new ContiguousCacheEasy()).bytesRead(100, 5, new int[]{6, 0, 3, 20, 22, 16}), 13);
      eq(2, (new ContiguousCacheEasy()).bytesRead(100, 1, new int[]{0, 4, 6, 6, 4, 10}), 4);
      eq(3, (new ContiguousCacheEasy()).bytesRead(1000, 999, new int[]{0, 4, 123, 987, 999, 500, 0}), 2);
      eq(4, (new ContiguousCacheEasy()).bytesRead(1, 1, new int[]{0}), 0);
      eq(5, (new ContiguousCacheEasy()).bytesRead(1, 1, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}), 0);
      eq(6, (new ContiguousCacheEasy()).bytesRead(1000, 11, new int[]{0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300, 310, 320, 330, 340, 350, 360, 370, 380, 390, 400, 410, 420, 430, 440, 450, 460, 470, 480, 490}), 480);
      eq(7, (new ContiguousCacheEasy()).bytesRead(49500, 11000, new int[]{49000, 48000, 47000, 46000, 45000, 44000, 43000, 42000, 41000, 40000, 39000, 38000, 37000, 36000, 35000, 34000, 33000, 32000, 31000, 30000, 29000, 28000, 27000, 26000, 25000, 24000, 23000, 22000, 21000, 20000, 19000, 18000, 17000, 16000, 15000, 14000, 13000, 12000, 11000, 10000, 9000, 8000, 7000, 6000, 5000, 4000, 3000, 2000, 1000, 0}), 49001);
      eq(8, (new ContiguousCacheEasy()).bytesRead(100, 5, new int[]{0, 50, 49, 51, 48, 52}), 7);
      eq(9, (new ContiguousCacheEasy()).bytesRead(100, 5, new int[]{50, 49, 51, 48, 52, 47, 53, 46, 54, 50}), 17);
      eq(10, (new ContiguousCacheEasy()).bytesRead(100, 30, new int[]{69, 6, 52, 66, 62, 4, 50, 85, 93, 95, 50, 6, 38, 76, 82, 40, 70, 93, 64, 46, 23, 8, 4, 33, 60, 71, 25, 82, 13, 23, 22, 33, 52, 64, 35, 34, 35, 77, 67, 16, 90, 9, 70, 70, 43, 77, 67, 62, 9, 88}), 697);
      eq(11, (new ContiguousCacheEasy()).bytesRead(1000000, 1000000, new int[]{0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999}), 0);
      eq(12, (new ContiguousCacheEasy()).bytesRead(1000000, 999999, new int[]{0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999}), 49);
      eq(13, (new ContiguousCacheEasy()).bytesRead(1000000, 1000000, new int[]{383799, 925986, 163657, 28408, 791195, 29140, 447177, 314587, 411663, 103551, 292867, 377407, 377552, 283178, 859676, 739859, 65480, 994363, 138151, 168331, 553143, 17689, 68268, 653532, 914528, 375948, 961282, 578845, 426531, 87887, 288894, 264243, 892633, 627858, 411195, 352783, 555065, 210579, 81659, 192418, 17515, 419418, 27351, 326499, 365849, 873288, 693378, 950806, 212467, 504101}), 0);
      eq(14, (new ContiguousCacheEasy()).bytesRead(1000000, 2, new int[]{568771, 507071, 316597, 155137, 101950, 350795, 296515, 854584, 482457, 455764, 878315, 902931, 792325, 486367, 134272, 413609, 417582, 393545, 129785, 209544, 921560, 625576, 24124, 691280, 795675, 422784, 576752, 962861, 785674, 360833, 747520, 528572, 624002, 107742, 587221, 152582, 264723, 638819, 881730, 159209, 668040, 552939, 472946, 412195, 946898, 310232, 970521, 955817, 226281, 88157}), 100);
      eq(15, (new ContiguousCacheEasy()).bytesRead(1000, 34, new int[]{0, 4, 123, 987, 999, 500, 0}), 148);
      eq(16, (new ContiguousCacheEasy()).bytesRead(200, 33, new int[]{0, 20, 70, 5, 1, 3, 2, 9, 15}), 70);
      eq(17, (new ContiguousCacheEasy()).bytesRead(100, 5, new int[]{6, 0, 3, 20, 22, 16}), 13);
      eq(18, (new ContiguousCacheEasy()).bytesRead(100, 5, new int[]{5}), 1);
      eq(19, (new ContiguousCacheEasy()).bytesRead(500, 45, new int[]{23, 67, 98, 120, 165, 499, 0, 45, 46, 1}), 214);
      eq(20, (new ContiguousCacheEasy()).bytesRead(1000000, 1, new int[]{1, 33, 14, 0, 55, 666666, 999999, 0}), 8);
      eq(21, (new ContiguousCacheEasy()).bytesRead(100, 5, new int[]{99, 98}), 5);
      eq(22, (new ContiguousCacheEasy()).bytesRead(20, 7, new int[]{1, 10, 19}), 11);
      eq(23, (new ContiguousCacheEasy()).bytesRead(1000, 20, new int[]{100, 3, 101, 2, 103, 1}), 120);
      eq(24, (new ContiguousCacheEasy()).bytesRead(100, 3, new int[]{10, 99, 7}), 9);
      eq(25, (new ContiguousCacheEasy()).bytesRead(10, 1, new int[]{0}), 0);
      eq(26, (new ContiguousCacheEasy()).bytesRead(10, 2, new int[]{6, 0}), 4);
      eq(27, (new ContiguousCacheEasy()).bytesRead(1000, 8, new int[]{1, 2, 10, 8, 20, 5, 26, 40, 12, 31, 9, 10, 0, 0, 0, 1, 1, 1, 24, 32, 24, 33, 25}), 87);
      eq(28, (new ContiguousCacheEasy()).bytesRead(100, 4, new int[]{0, 4, 99, 98, 3, 97, 98}), 14);
      eq(29, (new ContiguousCacheEasy()).bytesRead(10, 1, new int[]{1, 3, 3}), 2);
      eq(30, (new ContiguousCacheEasy()).bytesRead(100, 10, new int[]{6, 0, 3, 20, 22, 16, 66, 99, 77}), 42);
      eq(31, (new ContiguousCacheEasy()).bytesRead(100, 10, new int[]{1, 3, 7, 13, 5, 99, 55, 88, 33}), 44);
      eq(32, (new ContiguousCacheEasy()).bytesRead(100, 5, new int[]{99, 98, 2, 3, 2, 8}), 12);
      eq(33, (new ContiguousCacheEasy()).bytesRead(1000, 10, new int[]{90, 800, 200, 100, 29, 899, 120}), 70);
      eq(34, (new ContiguousCacheEasy()).bytesRead(1000, 50, new int[]{200, 149, 200}), 54);
      eq(35, (new ContiguousCacheEasy()).bytesRead(1000000, 20, new int[]{456, 54654, 5, 456, 1, 80, 999999, 999998, 876, 67}), 180);
      eq(36, (new ContiguousCacheEasy()).bytesRead(100, 3, new int[]{99, 10, 9, 8, 7, 5, 4, 3}), 13);
      eq(37, (new ContiguousCacheEasy()).bytesRead(10, 1, new int[]{1, 2, 1}), 3);
      eq(38, (new ContiguousCacheEasy()).bytesRead(100, 5, new int[]{50, 3, 5}), 10);
      eq(39, (new ContiguousCacheEasy()).bytesRead(5, 3, new int[]{4}), 2);
      eq(40, (new ContiguousCacheEasy()).bytesRead(1000000, 499999, new int[]{999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0, 999999, 0}), 24999950);
    } catch (Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
// END CUT HERE
}
