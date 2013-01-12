package p500.srm520;

import java.util.ArrayList;
import java.util.List;

import utils.ExampleRunner;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/24/12
 * Time: 6:10 PM
 */
public class SRMCodingPhase {
  private int countScore(int[] points, int[] skills, int luck) {
    int max = 0;
    for (int i = 0; i <= luck; i++) {
      for (int j = 0; j <= luck - i; j++) {
        for (int k = 0; k <= luck - j - i; k++) {
          int a0 = solve(points, skills, 0, 2, i);
          int at0 = Math.max(0, skills[0] - i);
          int a1 = solve(points, skills, 1, 4, j);
          int at1 = Math.max(0, skills[1] - j);
          int a2 = solve(points, skills, 2, 8, k);
          int at2 = Math.max(0, skills[2] - k);
          int[] a = new int[]{a0, a1, a2};
          int[] at = new int[]{at0, at1, at2};
          for (int f = 1; f < 8; f++) {
            int r = 0;
            int t = 0;
            for (int l = 0; l < a.length; l++) {
              if ((f >> l & 1) == 1) {
                t += at[l];
                r += a[l];
              }
            }

            if (t <= 75) {
              max = Math.max(r, max);
            }
          }
        }
      }
    }
    return max;
  }

  private int solve(int[] points, int[] skills, int index, int diff, int luck) {
    return points[index] - diff * (Math.max(1, skills[index] - luck));
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 1310, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{10, 25, 40}, 0));
    ExampleRunner.eq(2, 680, new SRMCodingPhase().countScore(new int[]{300, 600, 900}, new int[]{30, 65, 90}, 25));
    ExampleRunner.eq(3, 540, new SRMCodingPhase().countScore(new int[]{250, 450, 1100}, new int[]{50, 70, 90}, 20));
    ExampleRunner.eq(4, 1736, new SRMCodingPhase().countScore(new int[]{250, 550, 950}, new int[]{10, 25, 40}, 75));
    ExampleRunner.eq(5, 1216, new SRMCodingPhase().countScore(new int[]{256, 512, 1024}, new int[]{35, 30, 25}, 0));
    ExampleRunner.eq(6, 0, new SRMCodingPhase().countScore(new int[]{300, 600, 1100}, new int[]{80, 90, 100}, 4));
    ExampleRunner.eq(7, 1586, new SRMCodingPhase().countScore(new int[]{250, 450, 900}, new int[]{1, 1, 1}, 0));
    ExampleRunner.eq(8, 121, new SRMCodingPhase().countScore(new int[]{271, 549, 942}, new int[]{75, 100, 100}, 0));
    ExampleRunner.eq(9, 255, new SRMCodingPhase().countScore(new int[]{256, 555, 999}, new int[]{100, 75, 100}, 0));
    ExampleRunner.eq(10, 500, new SRMCodingPhase().countScore(new int[]{300, 600, 1100}, new int[]{100, 100, 75}, 0));
    ExampleRunner.eq(11, 0, new SRMCodingPhase().countScore(new int[]{299, 460, 1002}, new int[]{77, 77, 77}, 1));
    ExampleRunner.eq(12, 1188, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{26, 26, 26}, 0));
    ExampleRunner.eq(13, 1295, new SRMCodingPhase().countScore(new int[]{300, 500, 999}, new int[]{75, 75, 75}, 100));
    ExampleRunner.eq(14, 1092, new SRMCodingPhase().countScore(new int[]{300, 600, 1100}, new int[]{100, 100, 100}, 100));
    ExampleRunner.eq(15, 400, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{76, 76, 76}, 1));
    ExampleRunner.eq(16, 890, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{40, 100, 35}, 0));
    ExampleRunner.eq(17, 1040, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{100, 35, 40}, 0));
    ExampleRunner.eq(18, 500, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{25, 50, 100}, 0));
    ExampleRunner.eq(19, 1184, new SRMCodingPhase().countScore(new int[]{266, 457, 991}, new int[]{80, 82, 61}, 78));
    ExampleRunner.eq(20, 875, new SRMCodingPhase().countScore(new int[]{253, 492, 1043}, new int[]{75, 71, 30}, 9));
    ExampleRunner.eq(21, 1476, new SRMCodingPhase().countScore(new int[]{275, 468, 1064}, new int[]{92, 39, 72}, 98));
    ExampleRunner.eq(22, 1602, new SRMCodingPhase().countScore(new int[]{296, 538, 930}, new int[]{25, 74, 7}, 54));
    ExampleRunner.eq(23, 699, new SRMCodingPhase().countScore(new int[]{285, 564, 963}, new int[]{33, 54, 94}, 33));
    ExampleRunner.eq(24, 1654, new SRMCodingPhase().countScore(new int[]{288, 498, 910}, new int[]{30, 12, 3}, 28));
    ExampleRunner.eq(25, 484, new SRMCodingPhase().countScore(new int[]{269, 600, 1098}, new int[]{92, 46, 95}, 17));
    ExampleRunner.eq(26, 1047, new SRMCodingPhase().countScore(new int[]{282, 501, 910}, new int[]{35, 15, 97}, 59));
    ExampleRunner.eq(27, 463, new SRMCodingPhase().countScore(new int[]{296, 587, 958}, new int[]{100, 36, 71}, 5));
    ExampleRunner.eq(28, 1728, new SRMCodingPhase().countScore(new int[]{284, 503, 955}, new int[]{12, 7, 13}, 100));
    ExampleRunner.eq(29, 1625, new SRMCodingPhase().countScore(new int[]{284, 590, 923}, new int[]{12, 62, 66}, 92));
    ExampleRunner.eq(30, 1288, new SRMCodingPhase().countScore(new int[]{269, 479, 1053}, new int[]{18, 94, 16}, 20));
    ExampleRunner.eq(31, 1288, new SRMCodingPhase().countScore(new int[]{267, 599, 933}, new int[]{52, 59, 4}, 3));
    ExampleRunner.eq(32, 1537, new SRMCodingPhase().countScore(new int[]{256, 481, 994}, new int[]{13, 95, 45}, 99));
    ExampleRunner.eq(33, 1142, new SRMCodingPhase().countScore(new int[]{264, 466, 988}, new int[]{54, 50, 29}, 15));
    ExampleRunner.eq(34, 1074, new SRMCodingPhase().countScore(new int[]{266, 556, 922}, new int[]{97, 15, 59}, 16));
    ExampleRunner.eq(35, 1040, new SRMCodingPhase().countScore(new int[]{284, 475, 993}, new int[]{52, 19, 45}, 1));
    ExampleRunner.eq(36, 1043, new SRMCodingPhase().countScore(new int[]{261, 594, 937}, new int[]{47, 26, 62}, 14));
    ExampleRunner.eq(37, 687, new SRMCodingPhase().countScore(new int[]{262, 514, 927}, new int[]{80, 57, 68}, 38));
    ExampleRunner.eq(38, 1429, new SRMCodingPhase().countScore(new int[]{293, 496, 997}, new int[]{95, 34, 58}, 77));
    ExampleRunner.eq(39, 1719, new SRMCodingPhase().countScore(new int[]{271, 529, 975}, new int[]{47, 6, 28}, 57));
    ExampleRunner.eq(40, 1274, new SRMCodingPhase().countScore(new int[]{252, 461, 1093}, new int[]{79, 95, 45}, 71));
    ExampleRunner.eq(41, 1582, new SRMCodingPhase().countScore(new int[]{296, 470, 902}, new int[]{46, 15, 12}, 34));
    ExampleRunner.eq(42, 1201, new SRMCodingPhase().countScore(new int[]{259, 561, 904}, new int[]{80, 62, 2}, 0));
    ExampleRunner.eq(43, 1682, new SRMCodingPhase().countScore(new int[]{280, 476, 964}, new int[]{43, 12, 29}, 69));
    ExampleRunner.eq(44, 1050, new SRMCodingPhase().countScore(new int[]{253, 471, 919}, new int[]{63, 98, 85}, 90));
    ExampleRunner.eq(45, 1318, new SRMCodingPhase().countScore(new int[]{253, 517, 1033}, new int[]{33, 79, 58}, 80));
    ExampleRunner.eq(46, 650, new SRMCodingPhase().countScore(new int[]{270, 504, 1050}, new int[]{12, 35, 75}, 10));
    ExampleRunner.eq(47, 1674, new SRMCodingPhase().countScore(new int[]{290, 536, 1034}, new int[]{41, 42, 37}, 54));
    ExampleRunner.eq(48, 789, new SRMCodingPhase().countScore(new int[]{292, 581, 950}, new int[]{14, 23, 86}, 9));
    ExampleRunner.eq(49, 544, new SRMCodingPhase().countScore(new int[]{264, 487, 1016}, new int[]{19, 88, 89}, 30));
    ExampleRunner.eq(50, 792, new SRMCodingPhase().countScore(new int[]{257, 533, 1021}, new int[]{3, 99, 99}, 39));
    ExampleRunner.eq(51, 1880, new SRMCodingPhase().countScore(new int[]{272, 527, 1097}, new int[]{39, 1, 32}, 68));
    ExampleRunner.eq(52, 506, new SRMCodingPhase().countScore(new int[]{287, 551, 1026}, new int[]{16, 69, 70}, 5));
    ExampleRunner.eq(53, 1217, new SRMCodingPhase().countScore(new int[]{274, 559, 906}, new int[]{87, 86, 69}, 94));
    ExampleRunner.eq(54, 685, new SRMCodingPhase().countScore(new int[]{255, 554, 904}, new int[]{82, 5, 97}, 26));
    ExampleRunner.eq(55, 1276, new SRMCodingPhase().countScore(new int[]{291, 549, 1037}, new int[]{6, 94, 26}, 21));
    ExampleRunner.eq(56, 692, new SRMCodingPhase().countScore(new int[]{252, 596, 980}, new int[]{88, 96, 51}, 15));
    ExampleRunner.eq(57, 584, new SRMCodingPhase().countScore(new int[]{270, 555, 1072}, new int[]{62, 96, 91}, 30));
    ExampleRunner.eq(58, 451, new SRMCodingPhase().countScore(new int[]{276, 491, 1027}, new int[]{57, 98, 72}, 0));
    ExampleRunner.eq(59, 166, new SRMCodingPhase().countScore(new int[]{278, 526, 1045}, new int[]{56, 83, 78}, 0));
    ExampleRunner.eq(60, 1397, new SRMCodingPhase().countScore(new int[]{288, 547, 1022}, new int[]{44, 21, 12}, 1));
    ExampleRunner.eq(61, 1682, new SRMCodingPhase().countScore(new int[]{296, 490, 910}, new int[]{13, 65, 1}, 100));
    ExampleRunner.eq(62, 1504, new SRMCodingPhase().countScore(new int[]{257, 580, 907}, new int[]{22, 49, 31}, 32));
    ExampleRunner.eq(63, 1022, new SRMCodingPhase().countScore(new int[]{278, 499, 962}, new int[]{13, 81, 34}, 10));
    ExampleRunner.eq(64, 1469, new SRMCodingPhase().countScore(new int[]{294, 569, 1092}, new int[]{94, 55, 82}, 90));
    ExampleRunner.eq(65, 776, new SRMCodingPhase().countScore(new int[]{279, 458, 976}, new int[]{66, 99, 66}, 41));
    ExampleRunner.eq(66, 767, new SRMCodingPhase().countScore(new int[]{294, 571, 983}, new int[]{55, 75, 34}, 7));
    ExampleRunner.eq(67, 803, new SRMCodingPhase().countScore(new int[]{285, 486, 1051}, new int[]{82, 68, 50}, 19));
    ExampleRunner.eq(68, 772, new SRMCodingPhase().countScore(new int[]{271, 505, 919}, new int[]{21, 30, 70}, 23));
    ExampleRunner.eq(69, 1736, new SRMCodingPhase().countScore(new int[]{250, 550, 950}, new int[]{10, 25, 40}, 75));
    ExampleRunner.eq(70, 0, new SRMCodingPhase().countScore(new int[]{300, 600, 1100}, new int[]{80, 90, 100}, 4));
    ExampleRunner.eq(71, 700, new SRMCodingPhase().countScore(new int[]{300, 600, 900}, new int[]{50, 50, 100}, 25));
    ExampleRunner.eq(72, 1140, new SRMCodingPhase().countScore(new int[]{300, 600, 900}, new int[]{80, 30, 30}, 0));
    ExampleRunner.eq(73, 680, new SRMCodingPhase().countScore(new int[]{300, 600, 900}, new int[]{30, 65, 90}, 25));
    ExampleRunner.eq(74, 1488, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{77, 2, 2}, 4));
    ExampleRunner.eq(75, 500, new SRMCodingPhase().countScore(new int[]{250, 500, 900}, new int[]{25, 50, 100}, 0));
    ExampleRunner.eq(76, 1760, new SRMCodingPhase().countScore(new int[]{284, 568, 1066}, new int[]{65, 46, 28}, 68));
    ExampleRunner.eq(77, 1338, new SRMCodingPhase().countScore(new int[]{250, 450, 900}, new int[]{100, 55, 3}, 65));
    ExampleRunner.eq(78, 980, new SRMCodingPhase().countScore(new int[]{250, 450, 1100}, new int[]{74, 74, 100}, 85));
    ExampleRunner.eq(79, 1700, new SRMCodingPhase().countScore(new int[]{300, 500, 1000}, new int[]{10, 10, 10}, 5));
    ExampleRunner.eq(80, 1686, new SRMCodingPhase().countScore(new int[]{250, 550, 950}, new int[]{10, 25, 40}, 55));
    ExampleRunner.eq(81, 408, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{76, 76, 75}, 1));
    ExampleRunner.eq(82, 400, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{75, 75, 75}, 0));
    ExampleRunner.eq(83, 992, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{76, 76, 76}, 75));
    ExampleRunner.eq(84, 190, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{30, 99, 99}, 0));
    ExampleRunner.eq(85, 644, new SRMCodingPhase().countScore(new int[]{250, 450, 1100}, new int[]{26, 26, 100}, 25));
    ExampleRunner.eq(86, 1240, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{1, 99, 40}, 60));
    ExampleRunner.eq(87, 960, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{71, 71, 5}, 0));
    ExampleRunner.eq(88, 120, new SRMCodingPhase().countScore(new int[]{250, 450, 900}, new int[]{65, 100, 100}, 0));
    ExampleRunner.eq(89, 1390, new SRMCodingPhase().countScore(new int[]{300, 450, 1100}, new int[]{1, 74, 1}, 0));
    ExampleRunner.eq(90, 1406, new SRMCodingPhase().countScore(new int[]{250, 450, 1100}, new int[]{42, 32, 2}, 0));
    ExampleRunner.eq(91, 1104, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{75, 100, 5}, 10));
    ExampleRunner.eq(92, 1690, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{10, 10, 10}, 11));
    ExampleRunner.eq(93, 1586, new SRMCodingPhase().countScore(new int[]{250, 450, 900}, new int[]{1, 1, 1}, 1));
    ExampleRunner.eq(94, 248, new SRMCodingPhase().countScore(new int[]{250, 450, 900}, new int[]{10, 99, 99}, 20));
    ExampleRunner.eq(95, 0, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{100, 100, 100}, 0));
    ExampleRunner.eq(96, 1180, new SRMCodingPhase().countScore(new int[]{250, 500, 1100}, new int[]{30, 45, 30}, 0));
    ExampleRunner.eq(97, 1256, new SRMCodingPhase().countScore(new int[]{250, 550, 950}, new int[]{60, 60, 60}, 60));
    ExampleRunner.eq(98, 1150, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{10, 100, 10}, 0));
    ExampleRunner.eq(99, 500, new SRMCodingPhase().countScore(new int[]{250, 450, 900}, new int[]{100, 100, 100}, 50));
    ExampleRunner.eq(100, 920, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{90, 90, 10}, 0));
    ExampleRunner.eq(101, 130, new SRMCodingPhase().countScore(new int[]{250, 450, 900}, new int[]{60, 100, 100}, 0));
    ExampleRunner.eq(102, 1626, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{10, 25, 40}, 40));
    ExampleRunner.eq(103, 524, new SRMCodingPhase().countScore(new int[]{250, 450, 1100}, new int[]{35, 40, 76}, 4));
    ExampleRunner.eq(104, 1526, new SRMCodingPhase().countScore(new int[]{300, 500, 1000}, new int[]{15, 75, 60}, 75));
    ExampleRunner.eq(105, 680, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{100, 45, 50}, 10));
    ExampleRunner.eq(106, 1626, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{20, 20, 20}, 20));
    ExampleRunner.eq(107, 102, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{75, 100, 100}, 1));
    ExampleRunner.eq(108, 1784, new SRMCodingPhase().countScore(new int[]{300, 600, 900}, new int[]{31, 26, 21}, 74));
    ExampleRunner.eq(109, 1230, new SRMCodingPhase().countScore(new int[]{250, 500, 990}, new int[]{30, 65, 10}, 11));
    ExampleRunner.eq(110, 1236, new SRMCodingPhase().countScore(new int[]{300, 600, 900}, new int[]{65, 65, 65}, 65));
    ExampleRunner.eq(111, 1752, new SRMCodingPhase().countScore(new int[]{300, 600, 900}, new int[]{40, 40, 40}, 100));
    ExampleRunner.eq(112, 1256, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{80, 80, 80}, 100));
    ExampleRunner.eq(113, 1717, new SRMCodingPhase().countScore(new int[]{266, 511, 1022}, new int[]{11, 14, 50}, 50));
    ExampleRunner.eq(114, 992, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{100, 100, 1}, 1));
    ExampleRunner.eq(115, 1450, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{30, 30, 30}, 15));
    ExampleRunner.eq(116, 1180, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{40, 40, 40}, 20));
    ExampleRunner.eq(117, 1544, new SRMCodingPhase().countScore(new int[]{250, 450, 900}, new int[]{10, 10, 10}, 12));
    ExampleRunner.eq(118, 1216, new SRMCodingPhase().countScore(new int[]{256, 512, 1024}, new int[]{35, 30, 25}, 0));
    ExampleRunner.eq(119, 1626, new SRMCodingPhase().countScore(new int[]{250, 550, 950}, new int[]{20, 30, 40}, 50));
    ExampleRunner.eq(120, 650, new SRMCodingPhase().countScore(new int[]{300, 600, 900}, new int[]{25, 51, 76}, 1));
    ExampleRunner.eq(121, 1240, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{1, 100, 1}, 1));
    ExampleRunner.eq(122, 1234, new SRMCodingPhase().countScore(new int[]{300, 450, 1000}, new int[]{40, 100, 40}, 50));
    ExampleRunner.eq(123, 400, new SRMCodingPhase().countScore(new int[]{250, 500, 1000}, new int[]{75, 76, 75}, 0));
    ExampleRunner.eq(124, 1092, new SRMCodingPhase().countScore(new int[]{250, 450, 1100}, new int[]{80, 90, 75}, 75));
    ExampleRunner.eq(125, 300, new SRMCodingPhase().countScore(new int[]{300, 600, 900}, new int[]{100, 100, 75}, 0));
    ExampleRunner.eq(126, 894, new SRMCodingPhase().countScore(new int[]{300, 600, 900}, new int[]{1, 1, 75}, 0));
  }
}
