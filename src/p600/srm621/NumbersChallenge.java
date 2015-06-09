package p600.srm621;

import utils.ExampleRunner;

/**
 * Created by smalex on 08/06/15.
 * with help
 */
public class NumbersChallenge {
  public int MinNumber(int[] S) {
    int ms = S[0];
    for (int s : S) {
      ms = Math.max(s, ms);
    }
    boolean[] dp = new boolean[(ms + 1) * (S.length + 1)];
    int max = 0;
    dp[0] = true;
    for (int s : S) {
      for (int j = max; j >= 0; j--) {
        if (dp[j]) {
          dp[j + s] = true;
          max = Math.max(max, j + s);
        }
      }
    }
    for (int i = 0; i < dp.length; i++) {
      if (!dp[i]) {
        return i;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 4, new NumbersChallenge().MinNumber(new int[]{5, 1, 2}));
    ExampleRunner.eq(2, 500, new NumbersChallenge().MinNumber(new int[]{1, 3, 26, 14, 28, 15, 3, 3, 35, 1, 2, 212, 30, 126}));
    ExampleRunner.eq(3, 2630, new NumbersChallenge().MinNumber(new int[]{6, 3, 33, 158, 100, 331, 4, 66, 132, 512, 2, 1, 1, 12, 3, 1, 1257, 1, 6}));
    ExampleRunner.eq(4, 739, new NumbersChallenge().MinNumber(new int[]{2, 12, 137, 3, 1, 8, 60, 25, 184, 1, 23, 6, 276}));
    ExampleRunner.eq(5, 613, new NumbersChallenge().MinNumber(new int[]{53, 29, 1, 82, 125, 7, 1, 3, 29, 2, 2, 5, 7, 44, 1, 160, 3, 50, 1, 7}));
    ExampleRunner.eq(6, 32768, new NumbersChallenge().MinNumber(new int[]{2048, 256, 16384, 2, 1024, 8, 16, 32, 1, 512, 128, 4, 64, 4096, 8192}));
    ExampleRunner.eq(7, 16384, new NumbersChallenge().MinNumber(new int[]{1024, 8, 256, 4, 2048, 4096, 64, 2, 8192, 16, 1, 512, 128, 32}));
    ExampleRunner.eq(8, 256, new NumbersChallenge().MinNumber(new int[]{32, 64, 1, 128, 2, 4, 8, 16}));
    ExampleRunner.eq(9, 8192, new NumbersChallenge().MinNumber(new int[]{256, 1024, 16, 2, 4, 8, 64, 128, 1, 32, 4096, 2048, 512}));
    ExampleRunner.eq(10, 246923, new NumbersChallenge().MinNumber(new int[]{64, 8192, 99932, 512, 65536, 1024, 2, 2048, 4, 4096, 16384, 8, 15919, 256, 32, 1, 32768, 128, 16}));
    ExampleRunner.eq(11, 8, new NumbersChallenge().MinNumber(new int[]{2, 1, 4}));
    ExampleRunner.eq(12, 8, new NumbersChallenge().MinNumber(new int[]{4, 1, 2}));
    ExampleRunner.eq(13, 6, new NumbersChallenge().MinNumber(new int[]{2, 1, 2, 7}));
    ExampleRunner.eq(14, 8, new NumbersChallenge().MinNumber(new int[]{46148, 4, 2, 58416, 1, 80011}));
    ExampleRunner.eq(15, 9, new NumbersChallenge().MinNumber(new int[]{1, 14225, 1, 1, 1, 59962, 93481, 71261, 14875, 4}));
    ExampleRunner.eq(16, 7, new NumbersChallenge().MinNumber(new int[]{19755, 72594, 48311, 98571, 1, 1, 1, 2, 1, 9408}));
    ExampleRunner.eq(17, 33, new NumbersChallenge().MinNumber(new int[]{1, 4545, 99004, 17031, 60877, 9816, 3, 8, 14, 20698, 5, 1}));
    ExampleRunner.eq(18, 117, new NumbersChallenge().MinNumber(new int[]{79150, 8, 8561, 51120, 29, 47009, 97589, 2, 58299, 1, 49825, 2, 4, 83988, 11752, 33509, 2, 57, 11}));
    ExampleRunner.eq(19, 3, new NumbersChallenge().MinNumber(new int[]{1, 32667, 84703, 1, 58792}));
    ExampleRunner.eq(20, 2, new NumbersChallenge().MinNumber(new int[]{9380, 1, 50305}));
    ExampleRunner.eq(21, 12, new NumbersChallenge().MinNumber(new int[]{4, 44682, 79954, 53565, 98353, 1, 26006, 2, 2, 11421, 2}));
    ExampleRunner.eq(22, 12, new NumbersChallenge().MinNumber(new int[]{84772, 50764, 47506, 3, 5, 5511, 23417, 2, 1}));
    ExampleRunner.eq(23, 1, new NumbersChallenge().MinNumber(new int[]{2, 10, 9, 3, 4, 6}));
    ExampleRunner.eq(24, 3, new NumbersChallenge().MinNumber(new int[]{1, 40560, 1, 928}));
    ExampleRunner.eq(25, 3, new NumbersChallenge().MinNumber(new int[]{1, 1}));
    ExampleRunner.eq(26, 147, new NumbersChallenge().MinNumber(new int[]{29, 55, 1, 85684, 85684, 85684, 3, 85684, 8, 33, 1, 85684, 1, 85684, 85684, 14, 85684, 1}));
    ExampleRunner.eq(27, 114, new NumbersChallenge().MinNumber(new int[]{3, 2, 14, 9, 1, 1, 47, 2, 2, 32}));
    ExampleRunner.eq(28, 42, new NumbersChallenge().MinNumber(new int[]{55064, 55064, 55064, 7, 3, 1, 1, 55064, 55064, 4, 55064, 55064, 3, 55064, 1, 3, 6, 55064, 12}));
    ExampleRunner.eq(29, 76, new NumbersChallenge().MinNumber(new int[]{1, 92050, 1, 92050, 92050, 1, 6, 92050, 92050, 14, 1, 4, 92050, 92050, 33, 11, 92050, 92050, 3}));
    ExampleRunner.eq(30, 51, new NumbersChallenge().MinNumber(new int[]{7, 44741, 44741, 1, 1, 44741, 44741, 44741, 12, 3, 12, 44741, 1, 44741, 3, 44741, 2, 8}));
    ExampleRunner.eq(31, 2, new NumbersChallenge().MinNumber(new int[]{1}));
    ExampleRunner.eq(32, 4, new NumbersChallenge().MinNumber(new int[]{2, 1}));
    ExampleRunner.eq(33, 6, new NumbersChallenge().MinNumber(new int[]{1, 2, 1, 1}));
    ExampleRunner.eq(34, 6, new NumbersChallenge().MinNumber(new int[]{1, 1, 1, 1, 1}));
    ExampleRunner.eq(35, 53, new NumbersChallenge().MinNumber(new int[]{10, 5, 10, 1, 1, 4, 1, 20}));
    ExampleRunner.eq(36, 95, new NumbersChallenge().MinNumber(new int[]{17183, 1, 50885, 20797, 10, 20, 43, 37249, 48449, 75677, 54065, 8, 5, 61635, 1, 1, 71149, 81500, 3, 2}));
    ExampleRunner.eq(37, 90, new NumbersChallenge().MinNumber(new int[]{47222, 1, 62178, 3, 5, 5, 65487, 71317, 17, 2, 31048, 5, 8, 41824, 57562, 75483, 41, 2, 70955, 19211}));
    ExampleRunner.eq(38, 150, new NumbersChallenge().MinNumber(new int[]{86151, 61450, 18234, 9, 90468, 17, 69809, 3, 88415, 23, 24, 60312, 35320, 1, 6, 7067, 1, 79865, 60, 5}));
    ExampleRunner.eq(39, 103, new NumbersChallenge().MinNumber(new int[]{74271, 84843, 23652, 38973, 7, 3, 6, 1, 88876, 33265, 9, 20603, 33, 40913, 2, 4806, 49045, 10, 2, 29}));
    ExampleRunner.eq(40, 54, new NumbersChallenge().MinNumber(new int[]{75105, 1, 2, 2, 87062, 40717, 24, 2, 1, 63328, 3, 1, 95196, 77310, 19266, 21865, 15, 41093, 2, 85003}));
    ExampleRunner.eq(41, 209, new NumbersChallenge().MinNumber(new int[]{2, 20047, 98042, 5319, 1598, 6868, 1, 47301, 27692, 87, 2, 94767, 50758, 7, 16, 30, 53, 7, 56747, 3}));
    ExampleRunner.eq(42, 38, new NumbersChallenge().MinNumber(new int[]{2, 39688, 1, 64279, 1, 26989, 14, 52436, 37830, 17915, 29382, 5, 9454, 3, 2, 3, 93588, 4, 2, 32461}));
    ExampleRunner.eq(43, 71, new NumbersChallenge().MinNumber(new int[]{15347, 83708, 22160, 60267, 6, 5, 2, 11, 83508, 31485, 1, 67618, 1, 84047, 60461, 6, 41964, 3, 11, 24}));
    ExampleRunner.eq(44, 38, new NumbersChallenge().MinNumber(new int[]{91671, 1, 58769, 63024, 14317, 95285, 1, 16, 1, 1, 4, 89237, 5, 42303, 1, 69789, 60660, 1, 8943, 6}));
    ExampleRunner.eq(45, 1092, new NumbersChallenge().MinNumber(new int[]{2, 173, 3, 2, 194, 92, 23, 41, 475, 1, 11, 2, 1, 71}));
    ExampleRunner.eq(46, 43, new NumbersChallenge().MinNumber(new int[]{1, 70560, 1, 7, 70560, 55747, 12370, 28273, 8, 18499, 1, 2, 2, 7, 79906, 74838, 44507, 28585, 1, 12}));
    ExampleRunner.eq(47, 2493, new NumbersChallenge().MinNumber(new int[]{16, 14, 14, 26732, 1, 2989, 190, 96410, 149, 34, 2, 362, 705, 63, 5239, 4, 488, 407, 6, 37}));
    ExampleRunner.eq(48, 1134, new NumbersChallenge().MinNumber(new int[]{54, 2, 24, 1, 11, 1, 42, 44831, 3, 35, 115, 18564, 125, 1, 128, 509, 13165, 74, 8, 18962}));
    ExampleRunner.eq(49, 785, new NumbersChallenge().MinNumber(new int[]{2, 10, 1, 354, 40, 1, 1, 5, 16, 96280, 4207, 59995, 71, 121, 3, 130, 25, 2, 52827, 2}));
    ExampleRunner.eq(50, 504, new NumbersChallenge().MinNumber(new int[]{42318, 3, 14, 1, 21, 71075, 88014, 2, 86718, 4, 14, 106, 1, 164, 1, 43, 51, 18, 55, 5}));
    ExampleRunner.eq(51, 1092, new NumbersChallenge().MinNumber(new int[]{94512, 2, 87654, 81316, 6, 5, 6, 37151, 6, 139, 1, 36, 307, 1, 377, 101, 8, 37, 58, 1}));
    ExampleRunner.eq(52, 948, new NumbersChallenge().MinNumber(new int[]{7, 34, 75798, 17, 61124, 62989, 161, 114, 450, 1, 83086, 1, 11, 22, 2, 41, 70, 11, 2, 3}));
    ExampleRunner.eq(53, 816, new NumbersChallenge().MinNumber(new int[]{10, 86, 1, 1, 42, 57389, 85, 2, 1, 11754, 5, 363, 1, 5, 192, 13, 1, 13745, 40861, 7}));
    ExampleRunner.eq(54, 1124, new NumbersChallenge().MinNumber(new int[]{28, 4, 48463, 23, 32, 183, 202, 17, 27495, 9, 1, 46, 11935, 94762, 498, 1, 74, 1, 1, 3}));
    ExampleRunner.eq(55, 933, new NumbersChallenge().MinNumber(new int[]{78225, 29, 2, 145, 15, 141, 2, 12, 36, 82, 85390, 1, 90765, 3, 7, 88847, 1, 1, 4, 451}));
    ExampleRunner.eq(56, 7, new NumbersChallenge().MinNumber(new int[]{2, 3, 1}));
    ExampleRunner.eq(57, 1653, new NumbersChallenge().MinNumber(new int[]{217, 76694, 1, 13546, 319, 20, 1, 1, 93155, 3, 22, 13, 25, 28, 180, 7, 78, 27008, 714, 23}));
    ExampleRunner.eq(58, 11659, new NumbersChallenge().MinNumber(new int[]{16, 69, 2, 91, 452, 66170, 240, 23, 8, 909, 18, 1462, 8, 32, 1, 3257, 60, 4, 5006, 38613}));
    ExampleRunner.eq(59, 4647, new NumbersChallenge().MinNumber(new int[]{738, 27, 97092, 79963, 35, 4, 70, 36, 2260, 829, 2, 242, 3, 120, 38, 10, 1, 6, 157, 68}));
    ExampleRunner.eq(60, 4115, new NumbersChallenge().MinNumber(new int[]{1, 17, 6, 276, 99, 1, 87009, 1, 77, 2, 1497, 24, 1094, 11, 634, 74132, 2, 211, 64, 97}));
    ExampleRunner.eq(61, 1998, new NumbersChallenge().MinNumber(new int[]{7, 185, 1, 6, 16, 64, 1, 3, 15, 85464, 26, 843, 143, 257, 71886, 33, 187, 1, 208, 1}));
    ExampleRunner.eq(62, 1913, new NumbersChallenge().MinNumber(new int[]{11, 6, 688, 39130, 85, 243, 15, 1, 521, 1, 1, 1, 1, 39677, 30, 41, 28, 177, 21, 41}));
    ExampleRunner.eq(63, 1238, new NumbersChallenge().MinNumber(new int[]{2, 91670, 7, 2, 2, 34, 301, 1, 2, 48, 451, 12, 62039, 16, 38, 14, 45, 227, 2, 33}));
    ExampleRunner.eq(64, 1316, new NumbersChallenge().MinNumber(new int[]{134, 31, 10, 45, 3, 11, 7, 346, 68, 1, 89746, 513, 12, 1, 60, 1, 5, 40, 69615, 27}));
    ExampleRunner.eq(65, 1198, new NumbersChallenge().MinNumber(new int[]{55, 2, 78, 20, 382, 121, 142, 19, 2, 10, 1, 9, 64055, 1, 288, 2, 4, 90207, 54, 7}));
    ExampleRunner.eq(66, 3390, new NumbersChallenge().MinNumber(new int[]{115, 3, 1396, 1, 369, 15, 3, 1, 97455, 6, 5290, 1, 30, 91, 12, 955, 191, 43, 67, 90}));
    ExampleRunner.eq(67, 319, new NumbersChallenge().MinNumber(new int[]{28, 9, 5, 67, 4, 2, 1, 21, 34, 95, 52}));
    ExampleRunner.eq(68, 1865, new NumbersChallenge().MinNumber(new int[]{27, 101, 36, 485, 1, 4, 1, 14, 1, 29, 2, 86154, 325, 17, 127, 3, 208, 481, 76223, 2}));
    ExampleRunner.eq(69, 7269, new NumbersChallenge().MinNumber(new int[]{12, 9, 73, 64, 38525, 3386, 5, 459, 1662, 1, 29, 843, 1, 77582, 306, 204, 2, 188, 18, 6}));
    ExampleRunner.eq(70, 6461, new NumbersChallenge().MinNumber(new int[]{192, 3, 720, 2, 1, 67188, 3, 577, 85, 26, 1, 9, 60, 2153, 128, 48, 18, 288, 63746, 2146}));
    ExampleRunner.eq(71, 13968, new NumbersChallenge().MinNumber(new int[]{595, 13, 74, 1832, 5041, 4355, 15611, 953, 187, 4, 3, 69609, 31, 9, 1, 9, 1, 202, 72, 585}));
    ExampleRunner.eq(72, 5663, new NumbersChallenge().MinNumber(new int[]{1887, 1, 11, 93621, 1, 331, 886, 88239, 5, 49, 130, 5, 273, 2, 9, 31, 1398, 34, 112, 497}));
    ExampleRunner.eq(73, 3953, new NumbersChallenge().MinNumber(new int[]{21, 259, 1, 35, 225, 812, 1, 1, 58544, 361, 14, 82, 58, 1516, 5, 17494, 541, 6, 4, 10}));
    ExampleRunner.eq(74, 3625, new NumbersChallenge().MinNumber(new int[]{3, 7, 1, 1, 142, 8795, 38, 25, 85, 57, 5, 98120, 21, 805, 1208, 358, 318, 537, 10, 3}));
    ExampleRunner.eq(75, 3631, new NumbersChallenge().MinNumber(new int[]{115, 54, 2, 1210, 405, 8246, 5, 46, 1, 18, 9278, 12, 8, 1, 462, 4, 3, 1034, 173, 77}));
    ExampleRunner.eq(76, 7730, new NumbersChallenge().MinNumber(new int[]{86023, 1039, 3, 66, 895, 73247, 29, 2, 439, 4, 1608, 366, 11, 126, 41, 84, 3003, 7, 1, 5}));
    ExampleRunner.eq(77, 6927, new NumbersChallenge().MinNumber(new int[]{42, 95, 1, 6, 406, 84422, 2745, 10, 385, 1441, 10, 913, 3, 609, 15, 142, 1, 39, 23206, 63}));
    ExampleRunner.eq(78, 5948, new NumbersChallenge().MinNumber(new int[]{1, 1, 94, 7, 172, 354, 1, 8, 34, 561, 1606, 2407, 1, 12, 4, 9, 204, 19, 449, 3}));
    ExampleRunner.eq(79, 3277, new NumbersChallenge().MinNumber(new int[]{16, 687, 3, 1, 5, 65822, 3486, 7, 1, 2, 728, 1092, 1, 85, 38, 84, 256, 257, 11, 2}));
    ExampleRunner.eq(80, 31726, new NumbersChallenge().MinNumber(new int[]{990, 31, 15860, 1984, 1, 7931, 6, 1, 1, 248, 62, 126, 40882, 5, 498, 3963, 1, 1, 16, 90687}));
    ExampleRunner.eq(81, 28749, new NumbersChallenge().MinNumber(new int[]{56138, 1, 6, 7, 1, 225, 1, 31, 12, 14372, 34357, 7188, 56, 451, 109, 1, 3592, 1796, 1, 898}));
    ExampleRunner.eq(82, 25676, new NumbersChallenge().MinNumber(new int[]{62031, 9, 1, 82308, 401, 804, 99, 10, 50, 6420, 3, 1601, 3210, 1, 201, 1, 1, 26, 1, 12836}));
    ExampleRunner.eq(83, 43103, new NumbersChallenge().MinNumber(new int[]{5387, 12, 2, 674, 39, 3, 2693, 1, 58558, 169, 85, 98182, 1, 21547, 21, 1, 10775, 5, 1347, 340}));
    ExampleRunner.eq(84, 51944, new NumbersChallenge().MinNumber(new int[]{3245, 52475, 811, 201, 410, 54813, 1623, 24, 3, 1, 12984, 51, 5, 1, 1, 25971, 102, 5, 6490, 15}));
    ExampleRunner.eq(85, 30115, new NumbersChallenge().MinNumber(new int[]{3763, 7527, 31, 12, 474, 1, 234, 7, 940, 3, 116, 4, 3, 1881, 15056, 54186, 1, 31835, 1, 60}));
    ExampleRunner.eq(86, 9386, new NumbersChallenge().MinNumber(new int[]{149, 1, 17, 1, 2344, 4, 1172, 1, 37249, 2, 5, 1, 73, 1, 8, 99615, 586, 4691, 294, 35}));
    ExampleRunner.eq(87, 22391, new NumbersChallenge().MinNumber(new int[]{1, 11, 700, 352, 3, 4, 70288, 3, 24, 2796, 174, 71018, 85, 1, 1, 5600, 11191, 1, 1400, 43}));
    ExampleRunner.eq(88, 23330, new NumbersChallenge().MinNumber(new int[]{66766, 5832, 363, 46, 1, 731, 1, 185, 90, 1, 1, 4, 1, 62245, 13, 2917, 1456, 6, 11661, 20}));
    ExampleRunner.eq(89, 43, new NumbersChallenge().MinNumber(new int[]{14, 4, 9, 1, 1, 9, 1, 3}));
    ExampleRunner.eq(90, 56523, new NumbersChallenge().MinNumber(new int[]{883, 66392, 3531, 28257, 1, 14131, 57, 1, 25, 88474, 4, 1, 110, 6, 1769, 220, 442, 7064, 7, 13}));
    ExampleRunner.eq(91, 56523, new NumbersChallenge().MinNumber(new int[]{883, 66392, 3531, 28257, 1, 14131, 57, 1, 25, 88474, 4, 1, 110, 6, 1769, 220, 442, 7064, 7, 13}));
    ExampleRunner.eq(92, 131072, new NumbersChallenge().MinNumber(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536}));
    ExampleRunner.eq(93, 1, new NumbersChallenge().MinNumber(new int[]{10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000}));
    ExampleRunner.eq(94, 4, new NumbersChallenge().MinNumber(new int[]{1, 2}));
    ExampleRunner.eq(95, 2, new NumbersChallenge().MinNumber(new int[]{1, 10, 100, 1000, 10000, 100000, 100000, 100000, 99999, 99997, 99999, 99993, 99995, 99996, 99992, 39999, 99991, 99998, 100000, 999}));
    ExampleRunner.eq(96, 1, new NumbersChallenge().MinNumber(new int[]{5}));
    ExampleRunner.eq(97, 8, new NumbersChallenge().MinNumber(new int[]{2, 1, 4}));
    ExampleRunner.eq(98, 1, new NumbersChallenge().MinNumber(new int[]{5, 3, 2}));
    ExampleRunner.eq(99, 211, new NumbersChallenge().MinNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}));
    ExampleRunner.eq(100, 1, new NumbersChallenge().MinNumber(new int[]{2}));
    ExampleRunner.eq(101, 1, new NumbersChallenge().MinNumber(new int[]{7}));
    ExampleRunner.eq(102, 1, new NumbersChallenge().MinNumber(new int[]{5, 4, 2}));
    ExampleRunner.eq(103, 1092, new NumbersChallenge().MinNumber(new int[]{94512, 2, 87654, 81316, 6, 5, 6, 37151, 6, 139, 1, 36, 307, 1, 377, 101, 8, 37, 58, 1}));
    ExampleRunner.eq(104, 231072, new NumbersChallenge().MinNumber(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 100000}));
    ExampleRunner.eq(105, 1, new NumbersChallenge().MinNumber(new int[]{5, 2}));
    ExampleRunner.eq(106, 1, new NumbersChallenge().MinNumber(new int[]{2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 65536, 65537, 99999, 99988}));
    ExampleRunner.eq(107, 1, new NumbersChallenge().MinNumber(new int[]{2, 100, 4}));
    ExampleRunner.eq(108, 2, new NumbersChallenge().MinNumber(new int[]{1}));
    ExampleRunner.eq(109, 430914, new NumbersChallenge().MinNumber(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 99941, 99967, 99934}));
    ExampleRunner.eq(110, 1, new NumbersChallenge().MinNumber(new int[]{2, 3, 4}));
    ExampleRunner.eq(111, 4, new NumbersChallenge().MinNumber(new int[]{5, 1, 2}));
    ExampleRunner.eq(112, 31, new NumbersChallenge().MinNumber(new int[]{1, 2, 3, 7, 8, 9}));
    ExampleRunner.eq(113, 231071, new NumbersChallenge().MinNumber(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 99999}));
    ExampleRunner.eq(114, 327680, new NumbersChallenge().MinNumber(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 65536, 65536, 65536}));
    ExampleRunner.eq(115, 1, new NumbersChallenge().MinNumber(new int[]{5, 6, 7}));
    ExampleRunner.eq(116, 8, new NumbersChallenge().MinNumber(new int[]{1, 2, 4}));
  }
}
