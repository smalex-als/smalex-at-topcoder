package p500.srm502;

import java.util.Arrays;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 4/10/11
 * Time: 10:41 AM
 */
public class TheProgrammingContestDivTwo {
  public int[] find(int T, int[] requiredTime) {
    int[] res = {0, 0};
    Arrays.sort(requiredTime);
    int time = 0;
    for (int t : requiredTime) {
      if (t + time <= T) {
        res[0]++;
        res[1] += time + t;
        time += t;
      }
    }
    return res;
  }

  public int[] find2(int T, int[] requiredTime) {
    int[] res = {0, 0};
    boolean[] used = new boolean[requiredTime.length];
    int spendTime = 0;
    for (int aRequiredTime : requiredTime) {
      int minIndex = -1;
      for (int i = 0; i < requiredTime.length; i++) {
        int re = requiredTime[i];
        if (!used[i] && re + spendTime <= T) {
          if (minIndex == -1 || re < requiredTime[minIndex]) {
            minIndex = i;
          }
        }
      }
      if (minIndex != -1) {
        res[0]++;
        res[1] += spendTime + requiredTime[minIndex];
        used[minIndex] = true;
        spendTime += requiredTime[minIndex];
      } else {
        break;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, new int[]{1, 47}, new TheProgrammingContestDivTwo().find(74, new int[]{47}));
    ExampleRunner.eq(2, new int[]{0, 0}, new TheProgrammingContestDivTwo().find(74, new int[]{4747}));
    ExampleRunner.eq(3, new int[]{2, 18}, new TheProgrammingContestDivTwo().find(47, new int[]{8, 5}));
    ExampleRunner.eq(4, new int[]{5, 86}, new TheProgrammingContestDivTwo().find(47, new int[]{12, 3, 21, 6, 4, 13}));
    ExampleRunner.eq(5, new int[]{10, 249}, new TheProgrammingContestDivTwo().find(58, new int[]{4, 5, 82, 3, 4, 65, 7, 6, 8, 7, 6, 4, 8, 7, 6, 37, 8}));
    ExampleRunner.eq(6, new int[]{1, 100000}, new TheProgrammingContestDivTwo().find(100000, new int[]{100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000}));
    ExampleRunner.eq(7, new int[]{50, 1275}, new TheProgrammingContestDivTwo().find(100000, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(8, new int[]{50, 2550000}, new TheProgrammingContestDivTwo().find(100000, new int[]{2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000}));
    ExampleRunner.eq(9, new int[]{1, 100000}, new TheProgrammingContestDivTwo().find(100000, new int[]{100000}));
    ExampleRunner.eq(10, new int[]{1, 1}, new TheProgrammingContestDivTwo().find(100000, new int[]{1}));
    ExampleRunner.eq(11, new int[]{10, 351773}, new TheProgrammingContestDivTwo().find(100000, new int[]{78655, 900, 3792, 2727, 11762, 23903, 81013, 93484, 16756, 16062, 71435, 33494, 22157, 97528, 46337, 29409, 80715, 15638, 3676, 27084, 42368, 38735, 50028, 24417, 99019, 94304, 60398, 19417, 71492, 66583, 47839, 32092, 30891, 98437, 17476, 96981, 36972, 57098, 85362, 72872, 64730, 56324, 99946, 6957, 96796, 70832, 52534, 89819, 66109, 41056}));
    ExampleRunner.eq(12, new int[]{10, 316897}, new TheProgrammingContestDivTwo().find(100000, new int[]{48947, 77445, 50005, 43774, 586, 78981, 15189, 99986, 13930, 14423, 21793, 54045, 77485, 96278, 38065, 40565, 72969, 15042, 70353, 53350, 73374, 98641, 4159, 80543, 95381, 47609, 2424, 1852, 20363, 22586, 45390, 30027, 5256, 25386, 14034, 22086, 73100, 63838, 85831, 84334, 42011, 99294, 77576, 90059, 31982, 33729, 63920, 15280, 46580, 81266}));
    ExampleRunner.eq(13, new int[]{10, 292073}, new TheProgrammingContestDivTwo().find(100000, new int[]{83474, 2314, 99075, 62766, 52487, 38912, 91761, 756, 4509, 22128, 32218, 28672, 30306, 13772, 45782, 84754, 24876, 73180, 68451, 19794, 32958, 91216, 46838, 31019, 87370, 6962, 39688, 34811, 61174, 31140, 68501, 13123, 50113, 31071, 75866, 38998, 59200, 6523, 7780, 68872, 29309, 30589, 20941, 79655, 48947, 60806, 53586, 5120, 69355, 75766}));
    ExampleRunner.eq(14, new int[]{9, 284466}, new TheProgrammingContestDivTwo().find(100000, new int[]{12955, 72088, 72714, 71219, 1778, 81052, 82080, 95854, 2368, 92667, 94284, 82948, 42838, 56248, 91578, 86683, 81807, 91634, 51022, 65473, 56629, 63376, 3718, 73519, 84828, 93352, 66175, 53722, 62471, 33262, 86908, 42494, 75010, 89089, 9338, 21068, 37892, 19158, 26107, 42367, 50969, 1119, 40902, 23167, 31220, 30941, 34868, 82420, 59510, 65546}));
    ExampleRunner.eq(15, new int[]{9, 283336}, new TheProgrammingContestDivTwo().find(100000, new int[]{26334, 30997, 30633, 63237, 81620, 32064, 14474, 58786, 62804, 49442, 5497, 85618, 52892, 66187, 351, 78395, 96650, 95225, 46816, 34731, 91856, 72061, 42222, 79175, 77907, 56628, 41701, 67914, 44751, 7126, 79248, 52453, 2285, 58944, 4705, 95070, 29632, 82445, 59045, 87294, 22305, 44290, 53245, 86370, 11496, 34645, 74035, 41912, 29871, 46555}));
    ExampleRunner.eq(16, new int[]{43, 1456214}, new TheProgrammingContestDivTwo().find(100000, new int[]{4557, 3041, 598, 96, 2183, 2607, 2317, 1158, 2729, 3126, 3856, 665, 1904, 3546, 4895, 336, 4801, 4655, 2621, 2757, 3444, 4566, 4906, 4811, 4747, 2191, 3833, 106, 3912, 2774, 3921, 532, 722, 992, 773, 4268, 2009, 3145, 2965, 2080, 1943, 866, 320, 538, 4908, 1056, 3515, 4393, 2301, 3539}));
    ExampleRunner.eq(17, new int[]{43, 1322710}, new TheProgrammingContestDivTwo().find(100000, new int[]{4476, 4040, 3882, 2915, 3535, 4096, 1539, 2667, 4772, 2065, 58, 4363, 143, 867, 3081, 4667, 1910, 386, 4751, 414, 972, 4526, 3678, 4616, 4397, 1925, 4649, 1653, 4921, 3556, 3159, 2469, 1254, 4395, 369, 2995, 3056, 583, 1291, 409, 2529, 3352, 717, 2827, 197, 94, 4924, 16, 2258, 2370}));
    ExampleRunner.eq(18, new int[]{44, 1662919}, new TheProgrammingContestDivTwo().find(100000, new int[]{2422, 3411, 2839, 3540, 2683, 3392, 2025, 1883, 1166, 2579, 100, 2189, 2638, 2961, 4773, 2984, 3290, 4990, 2509, 4973, 1197, 3025, 4804, 4243, 1380, 4783, 648, 730, 4933, 772, 3802, 2549, 2628, 1726, 2621, 2444, 2139, 1167, 1520, 787, 2035, 1859, 202, 2707, 1739, 3994, 1838, 1378, 4472, 3768}));
    ExampleRunner.eq(19, new int[]{44, 1452537}, new TheProgrammingContestDivTwo().find(100000, new int[]{270, 419, 2347, 2453, 832, 3459, 4538, 3872, 1481, 1230, 3221, 3223, 4900, 1349, 281, 4670, 2525, 4632, 1551, 885, 512, 856, 990, 3932, 3288, 3682, 2512, 3942, 4656, 4029, 3508, 616, 74, 1393, 2002, 3213, 4180, 3782, 3801, 3220, 3493, 4696, 1566, 1454, 767, 4685, 1326, 503, 2744, 1869}));
    ExampleRunner.eq(20, new int[]{44, 1529976}, new TheProgrammingContestDivTwo().find(100000, new int[]{3269, 2906, 3234, 548, 2155, 4055, 2665, 782, 2237, 676, 4588, 3899, 2962, 4964, 877, 2325, 2457, 3827, 4751, 4321, 1596, 2587, 3241, 2921, 548, 1079, 3405, 1957, 1370, 3114, 4982, 1162, 729, 932, 4151, 1511, 2438, 4336, 1203, 787, 182, 662, 800, 3754, 4266, 1749, 3513, 4021, 1791, 4692}));
    ExampleRunner.eq(21, new int[]{7, 44497}, new TheProgrammingContestDivTwo().find(23166, new int[]{1210, 308, 3154, 2036, 2755, 4064, 1660}));
    ExampleRunner.eq(22, new int[]{8, 90274}, new TheProgrammingContestDivTwo().find(80964, new int[]{3713, 1342, 1333, 4344, 2497, 3447, 3510, 4238}));
    ExampleRunner.eq(23, new int[]{26, 689142}, new TheProgrammingContestDivTwo().find(93081, new int[]{3299, 2697, 899, 2142, 4185, 2242, 4540, 3799, 254, 2786, 2148, 2448, 1081, 1657, 2871, 3064, 3005, 1244, 3753, 4777, 2784, 314, 3150, 3269, 3396, 1865}));
    ExampleRunner.eq(24, new int[]{12, 112896}, new TheProgrammingContestDivTwo().find(40725, new int[]{305, 3840, 4980, 1739, 1592, 3757, 781, 2732, 4792, 944, 153, 1953}));
    ExampleRunner.eq(25, new int[]{15, 239676}, new TheProgrammingContestDivTwo().find(66505, new int[]{614, 4953, 2085, 4251, 1606, 601, 4096, 3299, 897, 731, 3473, 3136, 3713, 4961, 3631}));
    ExampleRunner.eq(26, new int[]{17, 251084}, new TheProgrammingContestDivTwo().find(43906, new int[]{4064, 152, 2556, 867, 4673, 3290, 313, 4890, 801, 941, 4708, 4987, 1844, 1556, 4304, 3478, 4474, 3093, 1241}));
    ExampleRunner.eq(27, new int[]{2, 3643}, new TheProgrammingContestDivTwo().find(3889, new int[]{849, 3399, 4110, 3234, 1945}));
    ExampleRunner.eq(28, new int[]{20, 220436}, new TheProgrammingContestDivTwo().find(29151, new int[]{777, 4407, 3521, 2803, 1956, 2651, 4912, 1059, 4437, 4477, 1764, 975, 4526, 1442, 2035, 872, 3316, 1626, 1352, 3717, 4243, 3352, 3609, 1234, 2989, 891, 219, 638, 2164, 3838, 4654, 4693, 3001, 1207, 4655, 3732, 1775, 3445, 3807, 4184, 2701, 723, 3012, 4656}));
    ExampleRunner.eq(29, new int[]{13, 139099}, new TheProgrammingContestDivTwo().find(80251, new int[]{518, 4731, 2524, 2729, 1163, 4257, 1832, 4636, 2157, 1992, 999, 1910, 100}));
    ExampleRunner.eq(30, new int[]{6, 37964}, new TheProgrammingContestDivTwo().find(83325, new int[]{1615, 3668, 25, 2963, 2621, 3349}));
    ExampleRunner.eq(31, new int[]{2, 18}, new TheProgrammingContestDivTwo().find(47, new int[]{8, 5}));
    ExampleRunner.eq(32, new int[]{4, 172}, new TheProgrammingContestDivTwo().find(100, new int[]{20, 15, 19, 18}));
    ExampleRunner.eq(33, new int[]{10, 249}, new TheProgrammingContestDivTwo().find(58, new int[]{4, 5, 82, 3, 4, 65, 7, 6, 8, 7, 6, 4, 8, 7, 6, 37, 8}));
    ExampleRunner.eq(34, new int[]{1, 100}, new TheProgrammingContestDivTwo().find(100, new int[]{100, 100, 100, 100, 100}));
    ExampleRunner.eq(35, new int[]{12, 291}, new TheProgrammingContestDivTwo().find(58, new int[]{4, 5, 82, 3, 4, 65, 7, 6, 8, 7, 6, 4, 8, 7, 6, 37, 8, 111, 123, 3, 11, 123, 333, 11112, 1231, 123, 1, 66, 55, 77, 6, 123, 6, 66}));
    ExampleRunner.eq(36, new int[]{5, 86}, new TheProgrammingContestDivTwo().find(47, new int[]{12, 3, 21, 6, 4, 13}));
    ExampleRunner.eq(37, new int[]{10, 55}, new TheProgrammingContestDivTwo().find(10, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(38, new int[]{3, 10}, new TheProgrammingContestDivTwo().find(6, new int[]{1, 2, 3}));
    ExampleRunner.eq(39, new int[]{5, 83}, new TheProgrammingContestDivTwo().find(47, new int[]{12, 3, 21, 4, 13, 5}));
    ExampleRunner.eq(40, new int[]{0, 0}, new TheProgrammingContestDivTwo().find(74, new int[]{4747}));
    ExampleRunner.eq(41, new int[]{4, 50}, new TheProgrammingContestDivTwo().find(25, new int[]{5, 8, 5, 5, 5, 8, 8}));
    ExampleRunner.eq(42, new int[]{2, 15}, new TheProgrammingContestDivTwo().find(10, new int[]{5, 5}));
    ExampleRunner.eq(43, new int[]{5, 35}, new TheProgrammingContestDivTwo().find(10000, new int[]{2, 1, 3, 4, 5}));
    ExampleRunner.eq(44, new int[]{4, 20}, new TheProgrammingContestDivTwo().find(10, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(45, new int[]{1, 1}, new TheProgrammingContestDivTwo().find(1, new int[]{1, 1}));
    ExampleRunner.eq(46, new int[]{5, 82}, new TheProgrammingContestDivTwo().find(47, new int[]{12, 3, 21, 6, 3, 13}));
    ExampleRunner.eq(47, new int[]{0, 0}, new TheProgrammingContestDivTwo().find(1, new int[]{2}));
  }
}
