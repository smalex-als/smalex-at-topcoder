// BEGIN CUT HERE
package p400.srm411;

import static utils.ExampleRunner.eq;


// END CUT HERE
public class MaximumScoredNumber {
  public int getNumber(int lowerBound, int upperBound) {
    int[] m = new int[upperBound + 1];
    final int n = (int) (Math.sqrt(upperBound) + 1);
    for (int i = 0; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        final int sum = i * i + j * j;
        if (sum >= lowerBound && sum <= upperBound) {
          m[sum]++;
        }
      }
    }
    int max = 0;
    for (int i = 0; i < m.length; i++) {
      if (m[i] >= m[max]) {
        max = i;
      }
    }
    return max == 0 ? upperBound : max;
  }

  // BEGIN CUT HERE
  public static void main(String[] args) {
    try {
      eq(6, (new MaximumScoredNumber()).getNumber(0, 2), 2);
      eq(6, (new MaximumScoredNumber()).getNumber(0, 30), 25);
      eq(6, (new MaximumScoredNumber()).getNumber(0, 0), 0);
      eq(6, (new MaximumScoredNumber()).getNumber(100, 101), 100);
      eq(6, (new MaximumScoredNumber()).getNumber(5, 99), 85);
      eq(6, (new MaximumScoredNumber()).getNumber(0, 10000), 9425);
      eq(6, (new MaximumScoredNumber()).getNumber(0, 9424), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(9424, 9424), 9424);
      eq(6, (new MaximumScoredNumber()).getNumber(10000, 10000), 10000);
      eq(6, (new MaximumScoredNumber()).getNumber(3, 3), 3);
      eq(6, (new MaximumScoredNumber()).getNumber(5, 5000), 4225);
      eq(6, (new MaximumScoredNumber()).getNumber(0, 5524), 4225);
      eq(6, (new MaximumScoredNumber()).getNumber(1, 5525), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(2393, 7971), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(2205, 7829), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(5737, 8673), 8450);
      eq(6, (new MaximumScoredNumber()).getNumber(1048, 3787), 3770);
      eq(6, (new MaximumScoredNumber()).getNumber(1109, 1577), 1525);
      eq(6, (new MaximumScoredNumber()).getNumber(6457, 9047), 8450);
      eq(6, (new MaximumScoredNumber()).getNumber(250, 1034), 1025);
      eq(6, (new MaximumScoredNumber()).getNumber(1226, 8869), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(321, 493), 425);
      eq(6, (new MaximumScoredNumber()).getNumber(279, 7777), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(861, 1846), 1625);
      eq(6, (new MaximumScoredNumber()).getNumber(5986, 9251), 8450);
      eq(6, (new MaximumScoredNumber()).getNumber(511, 3369), 3250);
      eq(6, (new MaximumScoredNumber()).getNumber(1022, 2607), 2465);
      eq(6, (new MaximumScoredNumber()).getNumber(738, 1375), 1105);
      eq(6, (new MaximumScoredNumber()).getNumber(5191, 8700), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(2639, 6681), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(111, 1978), 1885);
      eq(6, (new MaximumScoredNumber()).getNumber(3828, 4173), 3965);
      eq(6, (new MaximumScoredNumber()).getNumber(2225, 6721), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(50, 388), 325);
      eq(6, (new MaximumScoredNumber()).getNumber(3638, 5815), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(8080, 9351), 8450);
      eq(6, (new MaximumScoredNumber()).getNumber(4275, 4589), 4505);
      eq(6, (new MaximumScoredNumber()).getNumber(15, 41), 25);
      eq(6, (new MaximumScoredNumber()).getNumber(212, 1902), 1885);
      eq(6, (new MaximumScoredNumber()).getNumber(485, 2812), 2665);
      eq(6, (new MaximumScoredNumber()).getNumber(4286, 7592), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(1344, 4042), 3965);
      eq(6, (new MaximumScoredNumber()).getNumber(3899, 6351), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(3502, 5718), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(1360, 2022), 1885);
      eq(6, (new MaximumScoredNumber()).getNumber(825, 2236), 2210);
      eq(6, (new MaximumScoredNumber()).getNumber(999, 3692), 3625);
      eq(6, (new MaximumScoredNumber()).getNumber(3693, 9798), 9425);
      eq(6, (new MaximumScoredNumber()).getNumber(36, 77), 65);
      eq(6, (new MaximumScoredNumber()).getNumber(461, 1365), 1105);
      eq(6, (new MaximumScoredNumber()).getNumber(718, 1069), 1025);
      eq(6, (new MaximumScoredNumber()).getNumber(645, 9116), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(443, 8870), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(552, 791), 725);
      eq(6, (new MaximumScoredNumber()).getNumber(5807, 6523), 6500);
      eq(6, (new MaximumScoredNumber()).getNumber(627, 6343), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(180, 2456), 2405);
      eq(6, (new MaximumScoredNumber()).getNumber(762, 4437), 4225);
      eq(6, (new MaximumScoredNumber()).getNumber(6216, 7542), 7225);
      eq(6, (new MaximumScoredNumber()).getNumber(4309, 9302), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(695, 746), 725);
      eq(6, (new MaximumScoredNumber()).getNumber(590, 2991), 2665);
      eq(6, (new MaximumScoredNumber()).getNumber(1281, 1373), 1325);
      eq(6, (new MaximumScoredNumber()).getNumber(6042, 7784), 7225);
      eq(6, (new MaximumScoredNumber()).getNumber(1382, 3548), 3485);
      eq(6, (new MaximumScoredNumber()).getNumber(797, 1922), 1885);
      eq(6, (new MaximumScoredNumber()).getNumber(319, 703), 650);
      eq(6, (new MaximumScoredNumber()).getNumber(2932, 7635), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(351, 2135), 2125);
      eq(6, (new MaximumScoredNumber()).getNumber(2283, 2940), 2665);
      eq(6, (new MaximumScoredNumber()).getNumber(1724, 3213), 3145);
      eq(6, (new MaximumScoredNumber()).getNumber(1886, 3003), 2665);
      eq(6, (new MaximumScoredNumber()).getNumber(407, 428), 425);
      eq(6, (new MaximumScoredNumber()).getNumber(708, 2958), 2665);
      eq(6, (new MaximumScoredNumber()).getNumber(40, 4395), 4225);
      eq(6, (new MaximumScoredNumber()).getNumber(269, 317), 305);
      eq(6, (new MaximumScoredNumber()).getNumber(1775, 4103), 3965);
      eq(6, (new MaximumScoredNumber()).getNumber(5851, 8221), 8125);
      eq(6, (new MaximumScoredNumber()).getNumber(4596, 9771), 9425);
      eq(6, (new MaximumScoredNumber()).getNumber(6953, 8729), 8450);
      eq(6, (new MaximumScoredNumber()).getNumber(3201, 3376), 3250);
      eq(6, (new MaximumScoredNumber()).getNumber(3999, 8693), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(3423, 5251), 4225);
      eq(6, (new MaximumScoredNumber()).getNumber(4605, 7812), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(1654, 3068), 2665);
      eq(6, (new MaximumScoredNumber()).getNumber(1882, 3136), 2665);
      eq(6, (new MaximumScoredNumber()).getNumber(8134, 8191), 8177);
      eq(6, (new MaximumScoredNumber()).getNumber(3362, 3425), 3425);
      eq(6, (new MaximumScoredNumber()).getNumber(5824, 9116), 8450);
      eq(6, (new MaximumScoredNumber()).getNumber(1252, 4464), 4225);
      eq(6, (new MaximumScoredNumber()).getNumber(1442, 4236), 4225);
      eq(6, (new MaximumScoredNumber()).getNumber(168, 849), 845);
      eq(6, (new MaximumScoredNumber()).getNumber(563, 5757), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(1214, 1947), 1885);
      eq(6, (new MaximumScoredNumber()).getNumber(571, 3805), 3770);
      eq(6, (new MaximumScoredNumber()).getNumber(7544, 8831), 8450);
      eq(6, (new MaximumScoredNumber()).getNumber(532, 1297), 1105);
      eq(6, (new MaximumScoredNumber()).getNumber(2117, 7521), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(1102, 4360), 4225);
      eq(6, (new MaximumScoredNumber()).getNumber(4121, 5380), 4225);
      eq(6, (new MaximumScoredNumber()).getNumber(1836, 6907), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(4, 6), 5);
      eq(6, (new MaximumScoredNumber()).getNumber(5028, 5080), 5050);
      eq(6, (new MaximumScoredNumber()).getNumber(2278, 3841), 3770);
      eq(6, (new MaximumScoredNumber()).getNumber(3152, 7151), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(1261, 3025), 2665);
      eq(6, (new MaximumScoredNumber()).getNumber(29, 92), 85);
      eq(6, (new MaximumScoredNumber()).getNumber(222, 284), 265);
      eq(6, (new MaximumScoredNumber()).getNumber(2507, 4222), 3965);
      eq(6, (new MaximumScoredNumber()).getNumber(8325, 9112), 8450);
      eq(6, (new MaximumScoredNumber()).getNumber(70, 1332), 1105);
      eq(6, (new MaximumScoredNumber()).getNumber(1023, 8823), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(5844, 7312), 7225);
      eq(6, (new MaximumScoredNumber()).getNumber(60, 705), 650);
      eq(6, (new MaximumScoredNumber()).getNumber(1090, 6142), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(1194, 6145), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(3899, 4379), 4225);
      eq(6, (new MaximumScoredNumber()).getNumber(72, 5867), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(2791, 4911), 4225);
      eq(6, (new MaximumScoredNumber()).getNumber(1805, 7784), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(115, 4189), 3965);
      eq(6, (new MaximumScoredNumber()).getNumber(6850, 9163), 8450);
      eq(6, (new MaximumScoredNumber()).getNumber(1677, 6868), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(7340, 9137), 8450);
      eq(6, (new MaximumScoredNumber()).getNumber(82, 740), 725);
      eq(6, (new MaximumScoredNumber()).getNumber(269, 2164), 2125);
      eq(6, (new MaximumScoredNumber()).getNumber(474, 1027), 1025);
      eq(6, (new MaximumScoredNumber()).getNumber(922, 3333), 3250);
      eq(6, (new MaximumScoredNumber()).getNumber(1903, 3497), 3485);
      eq(6, (new MaximumScoredNumber()).getNumber(7625, 9758), 9425);
      eq(6, (new MaximumScoredNumber()).getNumber(1315, 5057), 4225);
      eq(6, (new MaximumScoredNumber()).getNumber(1638, 7035), 5525);
      eq(6, (new MaximumScoredNumber()).getNumber(2150, 2771), 2665);
      eq(6, (new MaximumScoredNumber()).getNumber(5, 84), 65);
      eq(6, (new MaximumScoredNumber()).getNumber(72, 73), 73);
      eq(6, (new MaximumScoredNumber()).getNumber(7, 7), 7);
      eq(6, (new MaximumScoredNumber()).getNumber(25, 169), 169);
      eq(6, (new MaximumScoredNumber()).getNumber(1, 9999), 9425);
      eq(6, (new MaximumScoredNumber()).getNumber(20, 25), 25);
      eq(6, (new MaximumScoredNumber()).getNumber(25, 30), 25);
      eq(6, (new MaximumScoredNumber()).getNumber(0, 3), 2);
      eq(6, (new MaximumScoredNumber()).getNumber(0, 16), 16);
      eq(6, (new MaximumScoredNumber()).getNumber(24, 26), 25);
      eq(6, (new MaximumScoredNumber()).getNumber(0, 8), 8);
      eq(6, (new MaximumScoredNumber()).getNumber(9971, 9971), 9971);
      eq(6, (new MaximumScoredNumber()).getNumber(1, 4), 4);
      eq(6, (new MaximumScoredNumber()).getNumber(12, 13), 13);
    } catch (Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
// END CUT HERE
}
