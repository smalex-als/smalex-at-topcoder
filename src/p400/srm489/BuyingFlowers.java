package p400.srm489;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 30.11.10
 * Time: 15:26
 */
public class BuyingFlowers {

  public int buy(int[] roses, int[] lilies) {
    final long start = System.currentTimeMillis();
    int min = Integer.MAX_VALUE;
    for (int flag = 1; flag < (1 << roses.length); flag++) {
      int rosesSum = 0;
      int liliesSum = 0;
      for (int i = 0; i < roses.length; i++) {
        if ((flag & 1 << i) != 0) {
          rosesSum += roses[i];
          liliesSum += lilies[i];
        }
      }
      min = Math.min(findMin(liliesSum, rosesSum), min);
    }
    final int result = min == Integer.MAX_VALUE ? -1 : min;
    System.out.println("time = " + (System.currentTimeMillis() - start) + " millis");
    return result;
  }

  private int findMin(int a, int b) {
    if (Math.abs(b - a) <= 1) {
      final int total = a + b;
      int min = Integer.MAX_VALUE;
      final int sqrt = (int) Math.sqrt(total);
      for (int w = 1; w <= sqrt; w++) {
        if (total % w == 0) {
          final int h = total / w;
          min = h - w;
        }
      }
      return min;
    }
    return Integer.MAX_VALUE;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 1, new BuyingFlowers().buy(new int[]{2, 4}, new int[]{4, 2}));
    ExampleRunner.eq(2, 0, new BuyingFlowers().buy(new int[]{2, 7, 3}, new int[]{3, 4, 1}));
    ExampleRunner.eq(3, -1, new BuyingFlowers().buy(new int[]{4, 5, 2, 1}, new int[]{6, 10, 5, 9}));
    ExampleRunner.eq(4, 36, new BuyingFlowers().buy(new int[]{1, 208, 19, 0, 3, 234, 1, 106, 99, 17}, new int[]{58, 30, 3, 5, 0, 997, 9, 615, 77, 5}));
    ExampleRunner.eq(5, 0, new BuyingFlowers().buy(new int[]{0}, new int[]{1}));
    ExampleRunner.eq(6, 1, new BuyingFlowers().buy(new int[]{9909, 9942, 9943, 9963, 9900, 9955, 9931, 9904, 9911, 9906, 9977, 9926, 9965, 9926, 9909, 9998}, new int[]{9936, 9901, 9972, 9912, 9904, 9957, 9940, 9927, 9959, 9963, 9909, 9944, 9962, 9930, 9960, 9905}));
    ExampleRunner.eq(7, 0, new BuyingFlowers().buy(new int[]{9909, 9942, 9943, 9963, 9900, 9955, 9931, 9904, 9911, 9906, 9977, 9926, 9965, 9926, 9909, 9998}, new int[]{9909, 9942, 9943, 9963, 9900, 9955, 9931, 9904, 9911, 9906, 9977, 9926, 9965, 9926, 9909, 9998}));
    ExampleRunner.eq(8, 0, new BuyingFlowers().buy(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(9, 0, new BuyingFlowers().buy(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(10, 0, new BuyingFlowers().buy(new int[]{10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000}, new int[]{10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000}));
    ExampleRunner.eq(11, 1, new BuyingFlowers().buy(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, new int[]{16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
    ExampleRunner.eq(12, -1, new BuyingFlowers().buy(new int[]{3234, 632, 6}, new int[]{21, 5342, 42}));
    ExampleRunner.eq(13, 996, new BuyingFlowers().buy(new int[]{499}, new int[]{498}));
    ExampleRunner.eq(14, 1, new BuyingFlowers().buy(new int[]{342, 343, 192, 999, 231, 555}, new int[]{512, 981, 211, 888, 231, 429}));
    ExampleRunner.eq(15, 0, new BuyingFlowers().buy(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192}, new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192}));
    ExampleRunner.eq(16, 0, new BuyingFlowers().buy(new int[]{7, 5, 4, 1, 7, 6, 3, 7, 5, 9, 7, 7, 9, 3, 3, 1}, new int[]{1, 9, 9, 7, 1, 1, 3, 5, 1, 2, 1, 4, 9, 9, 9, 6}));
    ExampleRunner.eq(17, 504, new BuyingFlowers().buy(new int[]{5132, 1405, 6260, 2708, 9286, 8699, 8931, 6471, 443, 6768, 285, 3070, 6048, 9450, 8171}, new int[]{189, 6774, 4919, 8482, 6664, 942, 9115, 5271, 2515, 1736, 4840, 9287, 3715, 2670, 2435}));
    ExampleRunner.eq(18, 391, new BuyingFlowers().buy(new int[]{8587, 7801, 3839, 6429, 2092, 3125, 5128, 1023, 1178, 5571, 9373, 1463, 223, 5421}, new int[]{913, 9976, 7192, 9268, 4895, 5674, 5933, 7418, 6371, 1204, 1516, 8106, 6043, 803}));
    ExampleRunner.eq(19, 14, new BuyingFlowers().buy(new int[]{9643, 9838, 9908, 9449, 9920, 9661, 9767, 9960, 9409, 9094, 9565, 9675, 9214}, new int[]{9818, 9828, 9581, 9941, 9979, 9104, 9935, 9977, 9030, 9771, 9657, 9936, 9325}));
    ExampleRunner.eq(20, 650, new BuyingFlowers().buy(new int[]{8227, 8286, 8843, 8257, 8991, 8487, 8447, 8251, 8936, 8367, 8913, 8703}, new int[]{8327, 8322, 8149, 8893, 8349, 8715, 8063, 8178, 8649, 8356, 8509, 8753}));
    ExampleRunner.eq(21, 35, new BuyingFlowers().buy(new int[]{10000}, new int[]{10000}));
    ExampleRunner.eq(22, -1, new BuyingFlowers().buy(new int[]{0}, new int[]{10000}));
    ExampleRunner.eq(23, 0, new BuyingFlowers().buy(new int[]{9973, 9967, 9949, 9941, 9931, 9929, 9923, 9907, 9901, 9887, 9883, 9871, 9859, 9857, 9851, 9839}, new int[]{9973, 9967, 9949, 9941, 9931, 9929, 9923, 9907, 9901, 9887, 9883, 9871, 9859, 9857, 9851, 9839}));
    ExampleRunner.eq(24, 9838, new BuyingFlowers().buy(new int[]{4986, 4983, 4974, 4970, 4965, 4964, 4961, 4953, 4950, 4943, 4941, 4935, 4929, 4928, 4925, 4919}, new int[]{4987, 4984, 4975, 4971, 4966, 4965, 4962, 4954, 4951, 4944, 4942, 4936, 4930, 4929, 4926, 4920}));
    ExampleRunner.eq(25, 53, new BuyingFlowers().buy(new int[]{7517, 6389, 6353, 1867, 2879, 397, 7583, 3709, 2053, 9439, 6079, 439, 7759, 5711, 6737, 6793}, new int[]{9829, 2647, 5639, 4787, 1259, 4999, 5087, 3217, 8647, 6131, 1031, 59, 1459, 269, 71, 6599}));
    ExampleRunner.eq(26, 10, new BuyingFlowers().buy(new int[]{4057, 3697, 6211, 7691, 4349, 3911, 1693, 7019, 881, 8447, 4919, 9161, 4229, 9679, 5981, 1453}, new int[]{61, 9643, 6781, 9013, 1987, 9907, 2341, 853, 6067, 1129, 8521, 5209, 1553, 8681, 2089, 3361}));
    ExampleRunner.eq(27, 0, new BuyingFlowers().buy(new int[]{2503, 9041, 1381, 4663, 3037, 3461, 9749, 1619, 9811, 1993, 953, 4051, 1699, 4517, 3253, 1861}, new int[]{4177, 557, 1039, 6781, 7867, 1153, 5171, 4019, 2609, 3733, 61, 1931, 191, 5, 5843, 409}));
    ExampleRunner.eq(28, 33, new BuyingFlowers().buy(new int[]{6101, 4919, 5387, 6997, 6229, 2381, 9337, 6067, 4877, 449, 8111, 4289, 2531, 1579, 3917, 7451}, new int[]{73, 2663, 1621, 8059, 4217, 4523, 2273, 4637, 6199, 97, 7187, 6563, 7247, 701, 7247, 3529}));
    ExampleRunner.eq(29, 26, new BuyingFlowers().buy(new int[]{5981, 389, 967, 2447, 523, 7793, 6329, 5711, 5651, 4519, 607, 8941, 3833, 4871, 3541, 4003}, new int[]{5347, 5711, 2267, 251, 8263, 5021, 2351, 4513, 2503, 157, 1451, 313, 8513, 6343, 4027, 1861}));
    ExampleRunner.eq(30, 11143, new BuyingFlowers().buy(new int[]{4157, 2683, 2089, 5009, 839, 9187, 1171, 6907, 1171, 9743, 5861, 5483, 1931, 157, 211, 7919}, new int[]{3251, 2633, 5479, 1693, 5483, 8609, 6803, 8753, 5923, 5881, 6343, 1811, 2543, 8419, 4091, 4517}));
    ExampleRunner.eq(31, 1, new BuyingFlowers().buy(new int[]{8929, 6827, 251, 101, 3251, 9239, 4253, 4831, 8999, 8147, 8317, 8677, 5519, 8747, 3733, 9613}, new int[]{9209, 47, 9011, 4723, 5743, 3041, 1009, 2003, 9811, 4967, 4253, 79, 3467, 6269, 2011, 2473}));
    ExampleRunner.eq(32, 449, new BuyingFlowers().buy(new int[]{757, 2411, 283, 4327, 1759, 4789, 7103, 8501, 587, 5483, 4241, 6427, 1619, 8837, 3271, 997}, new int[]{6011, 2377, 3371, 2063, 3229, 2081, 1861, 3061, 7699, 3877, 727, 9133, 673, 3019, 1723, 9323}));
    ExampleRunner.eq(33, 67, new BuyingFlowers().buy(new int[]{3259, 2207, 3691, 2777, 4783, 8783, 9137, 5689, 1657, 3461, 97, 3691, 97, 3467, 2377, 6217}, new int[]{3631, 6343, 6047, 7589, 6217, 8623, 8599, 4021, 229, 6761, 3251, 8597, 367, 2713, 7877, 1237}));
    ExampleRunner.eq(34, 239, new BuyingFlowers().buy(new int[]{2711, 9521, 4457, 8263, 5413, 3643, 1427, 7673, 4957, 1579, 1627, 5167, 2789, 1811, 1709, 7121}, new int[]{5881, 5501, 4799, 2383, 1499, 3491, 4229, 1877, 719, 8269, 8179, 8821, 8839, 6073, 7669, 1709}));
    ExampleRunner.eq(35, -1, new BuyingFlowers().buy(new int[]{6977, 5879, 5693, 1361, 6991, 5113, 2671, 9293, 6089, 8513}, new int[]{409, 2099, 4231, 2083, 1061, 2663, 5563, 8821, 6659, 1451}));
    ExampleRunner.eq(36, 99, new BuyingFlowers().buy(new int[]{2503, 5347, 9323, 1051, 2137, 8929, 1741, 1733, 8861, 4001}, new int[]{311, 3089, 7873, 3457, 4933, 4957, 9421, 8329, 1613, 5521}));
    ExampleRunner.eq(37, -1, new BuyingFlowers().buy(new int[]{3931, 2243, 8363, 6091, 4801, 6961, 6571, 8389, 3023, 3391}, new int[]{233, 3343, 6607, 9767, 2099, 9491, 5741, 4283, 8969, 1979}));
    ExampleRunner.eq(38, -1, new BuyingFlowers().buy(new int[]{6211, 9521, 5639, 1531, 557, 8573, 7039, 167, 4007, 6361}, new int[]{5849, 8819, 9397, 1613, 2239, 1579, 6299, 9551, 7639, 83}));
    ExampleRunner.eq(39, -1, new BuyingFlowers().buy(new int[]{547, 5171, 3529, 7537, 2243, 3413, 4153, 8731, 8563, 3221}, new int[]{919, 2087, 379, 6977, 4021, 1051, 2789, 9109, 1319, 7549}));
    ExampleRunner.eq(40, -1, new BuyingFlowers().buy(new int[]{5519, 4871, 3541, 2221, 7057, 6361, 1583, 3541, 5981, 9871}, new int[]{1123, 4003, 5077, 2357, 1787, 8039, 6361, 3701, 3889, 2267}));
    ExampleRunner.eq(41, -1, new BuyingFlowers().buy(new int[]{7673, 5231, 4831, 5431, 131, 9781, 6959, 3049, 8867, 5903}, new int[]{8537, 1783, 8821, 2213, 4457, 3137, 9349, 6619, 4507, 2617}));
    ExampleRunner.eq(42, -1, new BuyingFlowers().buy(new int[]{6529, 6121, 4423, 9643, 6277, 6827, 4783, 2879, 983, 9533}, new int[]{5711, 6211, 2087, 1031, 1933, 2341, 8369, 6659, 3203, 7229}));
    ExampleRunner.eq(43, -1, new BuyingFlowers().buy(new int[]{379, 1873, 9721, 9467, 4547, 1559, 2683, 1319, 8831, 7907}, new int[]{1693, 2657, 1489, 6703, 47, 8429, 1097, 4909, 9199, 2351}));
    ExampleRunner.eq(44, -1, new BuyingFlowers().buy(new int[]{1783, 4951, 6343, 4327, 3607, 9011, 4463, 2137, 2887, 8467}, new int[]{7159, 3529, 8081, 4019, 577, 353, 6133, 3539, 1867, 2293}));
    ExampleRunner.eq(45, 29, new BuyingFlowers().buy(new int[]{434, 220, 731, 613, 420, 730, 582, 162, 658, 585, 940, 48, 322}, new int[]{328, 148, 84, 365, 446, 687, 456, 934, 626, 363, 35, 435, 500}));
    ExampleRunner.eq(46, 4, new BuyingFlowers().buy(new int[]{753, 309, 7, 368, 931, 441, 940, 14, 406, 713, 744, 988, 875}, new int[]{402, 925, 167, 451, 248, 495, 951, 332, 861, 397, 371, 317, 684}));
    ExampleRunner.eq(47, 1, new BuyingFlowers().buy(new int[]{349, 32, 719, 136, 884, 824, 445, 891, 192, 376, 332, 484, 390}, new int[]{738, 197, 486, 78, 424, 241, 4, 592, 44, 604, 87, 995, 288}));
    ExampleRunner.eq(48, 148, new BuyingFlowers().buy(new int[]{300, 745, 11, 969, 429, 360, 1, 500, 496, 885, 324, 941, 128}, new int[]{868, 669, 812, 352, 411, 550, 550, 897, 981, 326, 138, 337, 918}));
    ExampleRunner.eq(49, 2, new BuyingFlowers().buy(new int[]{182, 293, 6, 530, 581, 306, 275, 592, 628, 704, 304, 629, 204}, new int[]{800, 867, 880, 93, 995, 748, 762, 808, 100, 173, 710, 2, 70}));
    ExampleRunner.eq(50, 2, new BuyingFlowers().buy(new int[]{43, 329, 561, 380, 599, 743, 673, 605, 625, 606, 264, 900, 550}, new int[]{892, 956, 854, 873, 512, 654, 92, 744, 747, 440, 492, 861, 600}));
    ExampleRunner.eq(51, 11, new BuyingFlowers().buy(new int[]{945, 34, 310, 947, 457, 706, 628, 18, 86, 228, 113, 112, 185}, new int[]{739, 70, 801, 991, 621, 693, 300, 475, 919, 164, 482, 11, 909}));
    ExampleRunner.eq(52, 9, new BuyingFlowers().buy(new int[]{581, 803, 753, 443, 403, 698, 829, 714, 998, 286, 772, 978, 656}, new int[]{858, 206, 770, 322, 392, 861, 393, 193, 204, 366, 239, 856, 193}));
    ExampleRunner.eq(53, 8, new BuyingFlowers().buy(new int[]{510, 373, 675, 873, 634, 609, 677, 387, 404, 80, 438, 233, 146}, new int[]{436, 520, 918, 414, 528, 129, 973, 298, 451, 717, 511, 196, 262}));
    ExampleRunner.eq(54, 92, new BuyingFlowers().buy(new int[]{716, 562, 501, 924, 108, 363, 297, 783, 237, 931, 744, 914, 671}, new int[]{148, 994, 109, 382, 141, 897, 254, 411, 311, 782, 540, 636, 433}));
    ExampleRunner.eq(55, -1, new BuyingFlowers().buy(new int[]{57, 5}, new int[]{28, 36}));
    ExampleRunner.eq(56, 46, new BuyingFlowers().buy(new int[]{23, 4}, new int[]{24, 78}));
    ExampleRunner.eq(57, -1, new BuyingFlowers().buy(new int[]{83, 1}, new int[]{91, 61}));
    ExampleRunner.eq(58, -1, new BuyingFlowers().buy(new int[]{94, 47}, new int[]{85, 17}));
    ExampleRunner.eq(59, -1, new BuyingFlowers().buy(new int[]{41, 70}, new int[]{94, 88}));
    ExampleRunner.eq(60, 0, new BuyingFlowers().buy(new int[]{56, 50}, new int[]{97, 50}));
    ExampleRunner.eq(61, -1, new BuyingFlowers().buy(new int[]{8, 31}, new int[]{78, 8}));
    ExampleRunner.eq(62, -1, new BuyingFlowers().buy(new int[]{11, 93}, new int[]{20, 68}));
    ExampleRunner.eq(63, -1, new BuyingFlowers().buy(new int[]{51, 48}, new int[]{56, 74}));
    ExampleRunner.eq(64, 0, new BuyingFlowers().buy(new int[]{5, 32}, new int[]{4, 88}));
    ExampleRunner.eq(65, -1, new BuyingFlowers().buy(new int[]{8554, 8977, 4296, 1400, 1191, 1641, 2605, 614, 907, 3890, 2362}, new int[]{5864, 9593, 3855, 4765, 5868, 1497, 4603, 318, 6937, 888, 7435}));
    ExampleRunner.eq(66, -1, new BuyingFlowers().buy(new int[]{6841, 2219, 6921, 6756, 9943, 9750, 1676, 3799, 5586, 6582}, new int[]{9128, 9883, 7982, 6671, 7876, 6939, 3638, 5135, 830, 6000}));
    ExampleRunner.eq(67, -1, new BuyingFlowers().buy(new int[]{7351, 6775, 6207, 2116, 2643, 4056, 3072, 2961, 993}, new int[]{3960, 6748, 7834, 6180, 21, 4590, 6123, 9771, 2619}));
    ExampleRunner.eq(68, -1, new BuyingFlowers().buy(new int[]{6274, 5357, 9201, 1755, 1592, 3536, 4778, 5820}, new int[]{475, 8416, 956, 7657, 768, 8307, 4432, 6976}));
    ExampleRunner.eq(69, -1, new BuyingFlowers().buy(new int[]{6776, 7075, 1032, 9848, 6388, 8378, 160}, new int[]{3136, 2564, 6340, 3157, 3507, 8815, 9280}));
    ExampleRunner.eq(70, -1, new BuyingFlowers().buy(new int[]{2478, 1442, 990, 8031, 3197, 2582}, new int[]{1567, 4327, 8403, 8395, 2744, 5711}));
    ExampleRunner.eq(71, -1, new BuyingFlowers().buy(new int[]{6052, 9864, 4018, 485, 3192}, new int[]{7146, 7560, 577, 6994, 301}));
    ExampleRunner.eq(72, -1, new BuyingFlowers().buy(new int[]{8955, 7155, 3437, 7871}, new int[]{9847, 2947, 7730, 5015}));
    ExampleRunner.eq(73, -1, new BuyingFlowers().buy(new int[]{8579, 208, 6457}, new int[]{9569, 4592, 6006}));
    ExampleRunner.eq(74, -1, new BuyingFlowers().buy(new int[]{2152, 2511}, new int[]{333, 6907}));
    ExampleRunner.eq(75, 230, new BuyingFlowers().buy(new int[]{5486, 5289, 5801, 5223, 5637, 5480, 5822, 5776, 5942, 5694, 5388, 5976, 5979, 5354}, new int[]{5398, 5674, 5167, 5734, 5531, 5593, 5330, 5584, 5214, 5523, 5095, 5117, 5983, 5096}));
    ExampleRunner.eq(76, 20, new BuyingFlowers().buy(new int[]{5160, 5945, 5743, 5999, 5587, 5896, 5222, 5224, 5376, 5396, 5352, 5670, 5090, 5092}, new int[]{5999, 5421, 5798, 5397, 5447, 5965, 5131, 5979, 5911, 5462, 5915, 5125, 5337, 5010}));
    ExampleRunner.eq(77, 6, new BuyingFlowers().buy(new int[]{5594, 5320, 5458, 5106, 5265, 5553, 5105, 5852, 5449, 5679, 5429, 5826, 5075, 5133}, new int[]{5848, 5517, 5578, 5847, 5291, 5376, 5244, 5090, 5342, 5728, 5421, 5253, 5190, 5336}));
    ExampleRunner.eq(78, 0, new BuyingFlowers().buy(new int[]{5730, 5879, 5698, 5676, 5199, 5508, 5782, 5816, 5061, 5240, 5021, 5511, 5919, 5802}, new int[]{5689, 5347, 5287, 5537, 5216, 5865, 5385, 5507, 5242, 5981, 5950, 5936, 5709, 5371}));
    ExampleRunner.eq(79, 10, new BuyingFlowers().buy(new int[]{5541, 5251, 5708, 5271, 5130, 5758, 5299, 5681, 5267, 5081, 5850, 5328, 5321, 5871}, new int[]{5191, 5593, 5025, 5880, 5940, 5312, 5770, 5156, 5178, 5507, 5016, 5772, 5488, 5966}));
    ExampleRunner.eq(80, 124, new BuyingFlowers().buy(new int[]{5708, 5550, 5337, 5249, 5801, 5397, 5872, 5284, 5508, 5171, 5965, 5775, 5604, 5815}, new int[]{5455, 5278, 5038, 5647, 5871, 5063, 5879, 5163, 5728, 5649, 5319, 5906, 5156, 5335}));
    ExampleRunner.eq(81, 17, new BuyingFlowers().buy(new int[]{5030, 5997, 5653, 5738, 5547, 5343, 5339, 5700, 5740, 5563, 5984, 5248, 5086, 5302}, new int[]{5375, 5690, 5469, 5831, 5320, 5860, 5830, 5191, 5275, 5709, 5354, 5003, 5359, 5026}));
    ExampleRunner.eq(82, 17, new BuyingFlowers().buy(new int[]{5261, 5867, 5713, 5291, 5864, 5367, 5029, 5411, 5710, 5720, 5464, 5802, 5283, 5448}, new int[]{5403, 5369, 5102, 5778, 5412, 5924, 5961, 5732, 5784, 5791, 5924, 5059, 5853, 5630}));
    ExampleRunner.eq(83, -1, new BuyingFlowers().buy(new int[]{5063, 5212, 5656, 5324, 5079, 5722, 5968, 5296, 5089, 5349, 5059, 5151, 5070, 5523}, new int[]{5953, 5705, 5324, 5708, 5427, 5426, 5839, 5839, 5350, 5800, 5571, 5486, 5944, 5847}));
    ExampleRunner.eq(84, 84, new BuyingFlowers().buy(new int[]{5546, 5797, 5830, 5961, 5361, 5838, 5637, 5792, 5560, 5605, 5088, 5001, 5307, 5148}, new int[]{5152, 5377, 5023, 5458, 5434, 5347, 5166, 5861, 5774, 5005, 5700, 5476, 5158, 5624}));
    ExampleRunner.eq(85, 0, new BuyingFlowers().buy(new int[]{89, 74, 41, 78, 79, 2, 96, 3, 18, 3, 94, 46, 26, 15, 19, 86}, new int[]{16, 95, 37, 41, 86, 20, 77, 87, 73, 80, 30, 65, 87, 83, 35, 76}));
    ExampleRunner.eq(86, 0, new BuyingFlowers().buy(new int[]{9, 76, 54, 89, 30, 2, 44, 48, 5, 91, 94, 83, 6, 13, 70, 22}, new int[]{9, 7, 64, 47, 79, 93, 34, 4, 73, 16, 69, 12, 99, 4, 88, 9}));
    ExampleRunner.eq(87, 0, new BuyingFlowers().buy(new int[]{32, 94, 50, 62, 97, 94, 10, 2, 85, 56, 86, 43, 22, 56, 66, 31}, new int[]{15, 82, 78, 46, 27, 64, 50, 0, 81, 20, 12, 80, 76, 52, 41, 9}));
    ExampleRunner.eq(88, 0, new BuyingFlowers().buy(new int[]{46, 43, 71, 43, 90, 34, 98, 27, 90, 36, 71, 12, 44, 89, 95, 11}, new int[]{71, 25, 57, 98, 90, 7, 50, 23, 79, 14, 3, 56, 66, 97, 65, 64}));
    ExampleRunner.eq(89, 0, new BuyingFlowers().buy(new int[]{40, 88, 60, 30, 22, 10, 58, 65, 46, 81, 29, 42, 70, 77, 53, 93}, new int[]{2, 62, 43, 44, 21, 93, 67, 1, 59, 23, 57, 77, 20, 74, 41, 12}));
    ExampleRunner.eq(90, 4, new BuyingFlowers().buy(new int[]{9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999}, new int[]{9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999}));
    ExampleRunner.eq(91, 27, new BuyingFlowers().buy(new int[]{9557, 9509, 9993, 9362, 9156, 9615, 9682, 9026, 9863, 9555, 9444, 9226}, new int[]{9451, 9676, 9064, 9362, 9980, 9915, 9661, 9047, 9614, 9832, 9570, 9039}));
    ExampleRunner.eq(92, 46, new BuyingFlowers().buy(new int[]{9218, 9746, 9071, 9026, 9512, 9080, 9714, 9069, 9941, 9707, 9783, 9449}, new int[]{9674, 9466, 9475, 9537, 9373, 9271, 9763, 9825, 9299, 9180, 9187, 9279}));
    ExampleRunner.eq(93, 523, new BuyingFlowers().buy(new int[]{9095, 9201, 9326, 9061, 9033, 9896, 9100, 9604, 9994, 9524, 9630, 9858}, new int[]{9956, 9344, 9279, 9249, 9403, 9063, 9699, 9077, 9881, 9526, 9967, 9254}));
    ExampleRunner.eq(94, 54, new BuyingFlowers().buy(new int[]{9798, 9082, 9431, 9097, 9614, 9971, 9729, 9062, 9524, 9407, 9123, 9557}, new int[]{9656, 9224, 9513, 9650, 9100, 9143, 9861, 9056, 9839, 9492, 9305, 9594}));
    ExampleRunner.eq(95, 54, new BuyingFlowers().buy(new int[]{9907, 9004, 9024, 9788, 9531, 9991, 9395, 9681, 9073, 9826, 9130, 9040}, new int[]{9149, 9859, 9102, 9673, 9619, 9225, 9583, 9275, 9801, 9096, 9277, 9901}));
    ExampleRunner.eq(96, 36, new BuyingFlowers().buy(new int[]{1, 208, 19, 0, 3, 234, 1, 106, 99, 17}, new int[]{58, 30, 3, 5, 0, 997, 9, 615, 77, 5}));
    ExampleRunner.eq(97, 0, new BuyingFlowers().buy(new int[]{2, 7, 3}, new int[]{3, 4, 1}));
    ExampleRunner.eq(98, 0, new BuyingFlowers().buy(new int[]{10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 1, 10000}, new int[]{10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 1, 10000}));
    ExampleRunner.eq(99, -1, new BuyingFlowers().buy(new int[]{4, 5, 2, 1}, new int[]{6, 10, 5, 9}));
    ExampleRunner.eq(100, 0, new BuyingFlowers().buy(new int[]{10000, 10000, 430, 860}, new int[]{10000, 10000, 470, 740}));
    ExampleRunner.eq(101, 234, new BuyingFlowers().buy(new int[]{768, 435, 42, 1, 76, 87, 3324, 565, 5643, 5234, 23, 34, 9978, 78, 67, 55}, new int[]{78, 9, 65, 34, 5342, 43, 1324, 32, 4, 234, 5, 4354, 2314, 234, 32, 4}));
    ExampleRunner.eq(102, 8, new BuyingFlowers().buy(new int[]{9999, 9998, 9997, 9996, 9995}, new int[]{9999, 9998, 9997, 9996, 9995}));
    ExampleRunner.eq(103, -1, new BuyingFlowers().buy(new int[]{5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000}, new int[]{1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000}));
    ExampleRunner.eq(104, 0, new BuyingFlowers().buy(new int[]{10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000}, new int[]{10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000}));
    ExampleRunner.eq(105, 1, new BuyingFlowers().buy(new int[]{1, 1, 1}, new int[]{1, 3, 2}));
    ExampleRunner.eq(106, 0, new BuyingFlowers().buy(new int[]{10000, 10000, 10000, 10000, 10000, 1000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000}, new int[]{10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 1000, 10000, 10000, 10000, 10000, 10000, 10000}));
    ExampleRunner.eq(107, -1, new BuyingFlowers().buy(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9}));
    ExampleRunner.eq(108, 0, new BuyingFlowers().buy(new int[]{0}, new int[]{1}));
    ExampleRunner.eq(109, 6, new BuyingFlowers().buy(new int[]{3}, new int[]{4}));
    ExampleRunner.eq(110, 8, new BuyingFlowers().buy(new int[]{1, 208, 234, 1, 106, 99, 17, 54, 1, 10000, 9999, 190, 0, 3}, new int[]{58, 30, 997, 9, 615, 77, 5, 0, 53, 9999, 9009, 3, 5, 0}));
    ExampleRunner.eq(111, 0, new BuyingFlowers().buy(new int[]{4, 4}, new int[]{4, 5}));
    ExampleRunner.eq(112, 112, new BuyingFlowers().buy(new int[]{8226, 5077, 9693, 7372, 5517, 5689, 6908, 9672, 7288, 6108, 9975, 5605, 8773, 9855, 8532, 7851}, new int[]{8233, 9847, 5592, 5055, 9115, 9672, 8491, 9095, 7846, 7384, 5872, 7942, 5992, 7473, 8655, 7331}));
    ExampleRunner.eq(113, 0, new BuyingFlowers().buy(new int[]{3, 5}, new int[]{5, 3}));
    ExampleRunner.eq(114, 1, new BuyingFlowers().buy(new int[]{3}, new int[]{3}));
  }
}
