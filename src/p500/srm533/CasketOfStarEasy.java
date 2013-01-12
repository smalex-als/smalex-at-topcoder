package p500.srm533;

import java.util.LinkedList;
import java.util.List;

import utils.ExampleRunner;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/24/12
 * Time: 4:35 PM
 */
public class CasketOfStarEasy {
  public int maxEnergy(int[] weight) {
    int[] used = new int[weight.length];
    for (int i = 0; i < used.length; i++) {
      used[i] = -1;
    }
    List<Integer> num = new LinkedList<Integer>();
    for (int aWeight : weight) {
      num.add(aWeight);
    }
    return solve(num, 0);
  }

  private int solve(List<Integer> num, int res) {
    if (num.size() == 2) {
      return res;
    }
    int max = 0;
    int N = num.size();
    for (int i = 1; i < N - 1; i++) {
      int nextRes = res + num.get(i - 1) * num.get(i + 1);
      Integer n = num.remove(i);
      max = Math.max(max, solve(num, nextRes));
      num.add(i, n);
    }
    return max;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 12, new CasketOfStarEasy().maxEnergy(new int[]{1, 2, 3, 4}));
    ExampleRunner.eq(2, 10400, new CasketOfStarEasy().maxEnergy(new int[]{100, 2, 1, 3, 100}));
    ExampleRunner.eq(3, 1818, new CasketOfStarEasy().maxEnergy(new int[]{2, 2, 7, 6, 90, 5, 9}));
    ExampleRunner.eq(4, 2937051, new CasketOfStarEasy().maxEnergy(new int[]{477, 744, 474, 777, 447, 747, 777, 474}));
    ExampleRunner.eq(5, 8, new CasketOfStarEasy().maxEnergy(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(6, 138953, new CasketOfStarEasy().maxEnergy(new int[]{213, 220, 224, 224, 197}));
    ExampleRunner.eq(7, 4308867, new CasketOfStarEasy().maxEnergy(new int[]{784, 783, 785, 785, 784, 783, 785, 785, 783}));
    ExampleRunner.eq(8, 2689691, new CasketOfStarEasy().maxEnergy(new int[]{526, 530, 662, 627, 472, 601, 626, 603, 634}));
    ExampleRunner.eq(9, 182726, new CasketOfStarEasy().maxEnergy(new int[]{422, 792, 433}));
    ExampleRunner.eq(10, 297570, new CasketOfStarEasy().maxEnergy(new int[]{546, 529, 545}));
    ExampleRunner.eq(11, 313612, new CasketOfStarEasy().maxEnergy(new int[]{481, 652, 652}));
    ExampleRunner.eq(12, 544544, new CasketOfStarEasy().maxEnergy(new int[]{748, 704, 728}));
    ExampleRunner.eq(13, 5037382, new CasketOfStarEasy().maxEnergy(new int[]{864, 638, 752, 820, 721, 697, 830, 726, 447, 664}));
    ExampleRunner.eq(14, 1008900, new CasketOfStarEasy().maxEnergy(new int[]{531, 342, 276, 421, 349, 279, 392, 183}));
    ExampleRunner.eq(15, 22655, new CasketOfStarEasy().maxEnergy(new int[]{115, 88, 90, 107}));
    ExampleRunner.eq(16, 161625, new CasketOfStarEasy().maxEnergy(new int[]{375, 402, 431}));
    ExampleRunner.eq(17, 2749047, new CasketOfStarEasy().maxEnergy(new int[]{486, 555, 593, 564, 589, 576, 582, 563, 635, 502}));
    ExampleRunner.eq(18, 411506, new CasketOfStarEasy().maxEnergy(new int[]{271, 315, 235, 313, 359, 341}));
    ExampleRunner.eq(19, 1444605, new CasketOfStarEasy().maxEnergy(new int[]{615, 555, 564, 636, 590, 549}));
    ExampleRunner.eq(20, 2581290, new CasketOfStarEasy().maxEnergy(new int[]{670, 874, 622, 897, 928, 544}));
    ExampleRunner.eq(21, 2891675, new CasketOfStarEasy().maxEnergy(new int[]{714, 761, 694, 754, 769, 807, 727}));
    ExampleRunner.eq(22, 233889, new CasketOfStarEasy().maxEnergy(new int[]{175, 191, 133, 279, 134, 280}));
    ExampleRunner.eq(23, 1260448, new CasketOfStarEasy().maxEnergy(new int[]{662, 597, 613, 622, 669}));
    ExampleRunner.eq(24, 604260, new CasketOfStarEasy().maxEnergy(new int[]{810, 743, 746}));
    ExampleRunner.eq(25, 3153843, new CasketOfStarEasy().maxEnergy(new int[]{713, 518, 558, 655, 494, 703, 565, 460, 670}));
    ExampleRunner.eq(26, 2983666, new CasketOfStarEasy().maxEnergy(new int[]{849, 869, 768, 809, 903, 859}));
    ExampleRunner.eq(27, 124248, new CasketOfStarEasy().maxEnergy(new int[]{334, 271, 372}));
    ExampleRunner.eq(28, 329000, new CasketOfStarEasy().maxEnergy(new int[]{153, 213, 297, 337, 117, 329}));
    ExampleRunner.eq(29, 1506790, new CasketOfStarEasy().maxEnergy(new int[]{496, 474, 343, 366, 333, 362, 469, 379, 530}));
    ExampleRunner.eq(30, 1335096, new CasketOfStarEasy().maxEnergy(new int[]{293, 801, 418, 330, 883}));
    ExampleRunner.eq(31, 6173039, new CasketOfStarEasy().maxEnergy(new int[]{963, 893, 836, 970, 917, 909, 929, 839, 896}));
    ExampleRunner.eq(32, 337680, new CasketOfStarEasy().maxEnergy(new int[]{335, 339, 580, 428}));
    ExampleRunner.eq(33, 3291889, new CasketOfStarEasy().maxEnergy(new int[]{799, 320, 437, 941, 323, 408, 252, 507, 628}));
    ExampleRunner.eq(34, 2673444, new CasketOfStarEasy().maxEnergy(new int[]{724, 728, 420, 446, 794, 545, 782}));
    ExampleRunner.eq(35, 1299174, new CasketOfStarEasy().maxEnergy(new int[]{799, 800, 842, 784}));
    ExampleRunner.eq(36, 1141696, new CasketOfStarEasy().maxEnergy(new int[]{582, 359, 398, 382, 602, 550}));
    ExampleRunner.eq(37, 1823544, new CasketOfStarEasy().maxEnergy(new int[]{703, 860, 888, 761, 744}));
    ExampleRunner.eq(38, 255850, new CasketOfStarEasy().maxEnergy(new int[]{116, 134, 221, 229, 210, 108, 200, 235}));
    ExampleRunner.eq(39, 129897, new CasketOfStarEasy().maxEnergy(new int[]{459, 386, 283}));
    ExampleRunner.eq(40, 3213000, new CasketOfStarEasy().maxEnergy(new int[]{695, 563, 523, 586, 659, 748, 488, 728, 564}));
    ExampleRunner.eq(41, 821420, new CasketOfStarEasy().maxEnergy(new int[]{531, 695, 588, 670}));
    ExampleRunner.eq(42, 3032562, new CasketOfStarEasy().maxEnergy(new int[]{246, 621, 649, 307, 831, 430, 705, 285, 579}));
    ExampleRunner.eq(43, 1551760, new CasketOfStarEasy().maxEnergy(new int[]{203, 341, 270, 175, 628, 416, 171, 368, 232, 509}));
    ExampleRunner.eq(44, 106764, new CasketOfStarEasy().maxEnergy(new int[]{492, 238, 217}));
    ExampleRunner.eq(45, 1856005, new CasketOfStarEasy().maxEnergy(new int[]{566, 569, 598, 635, 639, 592, 617}));
    ExampleRunner.eq(46, 2906786, new CasketOfStarEasy().maxEnergy(new int[]{661, 357, 192, 503, 330, 745, 770, 301, 702}));
    ExampleRunner.eq(47, 250301, new CasketOfStarEasy().maxEnergy(new int[]{321, 256, 208, 62, 245, 168}));
    ExampleRunner.eq(48, 86655, new CasketOfStarEasy().maxEnergy(new int[]{265, 267, 327}));
    ExampleRunner.eq(49, 427770, new CasketOfStarEasy().maxEnergy(new int[]{630, 719, 679}));
    ExampleRunner.eq(50, 803164, new CasketOfStarEasy().maxEnergy(new int[]{491, 592, 475, 442, 500}));
    ExampleRunner.eq(51, 416172, new CasketOfStarEasy().maxEnergy(new int[]{432, 446, 406, 474}));
    ExampleRunner.eq(52, 102378, new CasketOfStarEasy().maxEnergy(new int[]{35, 226, 218, 191, 80, 131}));
    ExampleRunner.eq(53, 338031, new CasketOfStarEasy().maxEnergy(new int[]{291, 220, 135, 186, 197, 121, 114, 151, 252}));
    ExampleRunner.eq(54, 1751514, new CasketOfStarEasy().maxEnergy(new int[]{349, 393, 250, 476, 325, 490, 460, 199, 577, 230}));
    ExampleRunner.eq(55, 4381290, new CasketOfStarEasy().maxEnergy(new int[]{920, 945, 912, 915, 943, 932, 935}));
    ExampleRunner.eq(56, 91314, new CasketOfStarEasy().maxEnergy(new int[]{114, 123, 119, 115, 120, 130, 130, 122}));
    ExampleRunner.eq(57, 1601408, new CasketOfStarEasy().maxEnergy(new int[]{340, 342, 726, 438, 645, 302, 518}));
    ExampleRunner.eq(58, 2586309, new CasketOfStarEasy().maxEnergy(new int[]{392, 178, 617, 119, 518, 281, 630, 401, 747, 218}));
    ExampleRunner.eq(59, 474821, new CasketOfStarEasy().maxEnergy(new int[]{219, 212, 213, 290, 311, 272, 248, 313}));
    ExampleRunner.eq(60, 548680, new CasketOfStarEasy().maxEnergy(new int[]{215, 261, 203, 252, 357, 430, 246, 230}));
    ExampleRunner.eq(61, 2693931, new CasketOfStarEasy().maxEnergy(new int[]{743, 775, 636, 741, 590, 591, 744}));
    ExampleRunner.eq(62, 170180, new CasketOfStarEasy().maxEnergy(new int[]{105, 403, 293, 335}));
    ExampleRunner.eq(63, 1880250, new CasketOfStarEasy().maxEnergy(new int[]{512, 559, 865, 384, 619, 655}));
    ExampleRunner.eq(64, 511928, new CasketOfStarEasy().maxEnergy(new int[]{719, 214, 204, 508}));
    ExampleRunner.eq(65, 1707911, new CasketOfStarEasy().maxEnergy(new int[]{566, 529, 385, 563, 503, 393, 529, 403}));
    ExampleRunner.eq(66, 1665964, new CasketOfStarEasy().maxEnergy(new int[]{410, 526, 377, 536, 280, 511, 510, 497, 252}));
    ExampleRunner.eq(67, 2455047, new CasketOfStarEasy().maxEnergy(new int[]{184, 712, 785, 634, 375, 799, 786}));
    ExampleRunner.eq(68, 1645981, new CasketOfStarEasy().maxEnergy(new int[]{634, 647, 615, 623, 642, 646}));
    ExampleRunner.eq(69, 1298304, new CasketOfStarEasy().maxEnergy(new int[]{619, 663, 650, 646, 672}));
    ExampleRunner.eq(70, 2593941, new CasketOfStarEasy().maxEnergy(new int[]{710, 834, 828, 757, 742, 829}));
    ExampleRunner.eq(71, 1087713, new CasketOfStarEasy().maxEnergy(new int[]{292, 242, 342, 236, 392, 442, 176, 381, 300, 357}));
    ExampleRunner.eq(72, 1991782, new CasketOfStarEasy().maxEnergy(new int[]{793, 872, 782, 791, 782}));
    ExampleRunner.eq(73, 213024, new CasketOfStarEasy().maxEnergy(new int[]{336, 315, 321, 313}));
    ExampleRunner.eq(74, 616835, new CasketOfStarEasy().maxEnergy(new int[]{817, 732, 755}));
    ExampleRunner.eq(75, 103818, new CasketOfStarEasy().maxEnergy(new int[]{146, 140, 87, 363}));
    ExampleRunner.eq(76, 749892, new CasketOfStarEasy().maxEnergy(new int[]{874, 872, 858}));
    ExampleRunner.eq(77, 1034885, new CasketOfStarEasy().maxEnergy(new int[]{237, 392, 103, 250, 473, 121, 128, 82, 319, 453}));
    ExampleRunner.eq(78, 4435579, new CasketOfStarEasy().maxEnergy(new int[]{826, 814, 598, 684, 532, 775, 517, 511, 666, 728}));
    ExampleRunner.eq(79, 253057, new CasketOfStarEasy().maxEnergy(new int[]{283, 390, 247, 265, 163, 101}));
    ExampleRunner.eq(80, 1720811, new CasketOfStarEasy().maxEnergy(new int[]{779, 744, 778, 716, 715}));
    ExampleRunner.eq(81, 3643640, new CasketOfStarEasy().maxEnergy(new int[]{598, 618, 488, 800, 518, 798, 805, 722, 580}));
    ExampleRunner.eq(82, 451902, new CasketOfStarEasy().maxEnergy(new int[]{451, 247, 211, 239, 324, 228}));
    ExampleRunner.eq(83, 222777, new CasketOfStarEasy().maxEnergy(new int[]{74, 153, 405, 168, 223, 55, 146}));
    ExampleRunner.eq(84, 3338193, new CasketOfStarEasy().maxEnergy(new int[]{650, 648, 634, 630, 629, 642, 648, 652, 653, 634}));
    ExampleRunner.eq(85, 372091, new CasketOfStarEasy().maxEnergy(new int[]{607, 610, 613}));
    ExampleRunner.eq(86, 10400, new CasketOfStarEasy().maxEnergy(new int[]{100, 3, 1, 2, 100}));
    ExampleRunner.eq(87, 14, new CasketOfStarEasy().maxEnergy(new int[]{2, 3, 2, 1, 2}));
    ExampleRunner.eq(88, 135, new CasketOfStarEasy().maxEnergy(new int[]{3, 8, 21, 8, 3}));
    ExampleRunner.eq(89, 10700, new CasketOfStarEasy().maxEnergy(new int[]{100, 4, 2, 1, 3, 100}));
    ExampleRunner.eq(90, 60, new CasketOfStarEasy().maxEnergy(new int[]{1, 3, 5, 2, 1, 2, 5}));
    ExampleRunner.eq(91, 12, new CasketOfStarEasy().maxEnergy(new int[]{1, 2, 3, 4}));
    ExampleRunner.eq(92, 53, new CasketOfStarEasy().maxEnergy(new int[]{1, 2, 7, 4, 1, 2, 3}));
    ExampleRunner.eq(93, 271, new CasketOfStarEasy().maxEnergy(new int[]{1, 1, 10, 90, 10, 1}));
    ExampleRunner.eq(94, 159, new CasketOfStarEasy().maxEnergy(new int[]{3, 10, 25, 10, 3}));
    ExampleRunner.eq(95, 160, new CasketOfStarEasy().maxEnergy(new int[]{8, 16, 8, 4, 4}));
    ExampleRunner.eq(96, 773, new CasketOfStarEasy().maxEnergy(new int[]{10, 21, 6, 9, 1, 8, 7, 3, 4, 1}));
    ExampleRunner.eq(97, 912, new CasketOfStarEasy().maxEnergy(new int[]{8, 1, 8, 64, 32, 1, 2}));
    ExampleRunner.eq(98, 349, new CasketOfStarEasy().maxEnergy(new int[]{5, 6, 7, 8, 9, 8, 7, 6, 5}));
    ExampleRunner.eq(99, 120, new CasketOfStarEasy().maxEnergy(new int[]{4, 1, 5, 8, 5, 1, 4}));
    ExampleRunner.eq(100, 4993966, new CasketOfStarEasy().maxEnergy(new int[]{999, 997, 998, 995, 996, 1, 2, 3, 4, 1000}));
    ExampleRunner.eq(101, 130, new CasketOfStarEasy().maxEnergy(new int[]{10, 2, 1, 1, 10}));
    ExampleRunner.eq(102, 55000, new CasketOfStarEasy().maxEnergy(new int[]{50, 1000, 50, 1, 50}));
    ExampleRunner.eq(103, 22090, new CasketOfStarEasy().maxEnergy(new int[]{10, 100, 3, 200, 9}));
    ExampleRunner.eq(104, 1463600, new CasketOfStarEasy().maxEnergy(new int[]{400, 1000, 60, 2, 60, 1000}));
    ExampleRunner.eq(105, 3592727, new CasketOfStarEasy().maxEnergy(new int[]{363, 28, 691, 60, 764, 927, 541, 427, 173, 737}));
    ExampleRunner.eq(106, 289, new CasketOfStarEasy().maxEnergy(new int[]{3, 5, 7, 4, 8, 3, 2, 1, 8, 3}));
    ExampleRunner.eq(107, 16, new CasketOfStarEasy().maxEnergy(new int[]{1, 2, 3, 2, 1, 2}));
    ExampleRunner.eq(108, 5504000, new CasketOfStarEasy().maxEnergy(new int[]{1000, 1, 1000, 2, 1000, 4, 1000, 500, 2, 2}));
    ExampleRunner.eq(109, 5351049, new CasketOfStarEasy().maxEnergy(new int[]{897, 802, 765, 992, 1, 521, 220, 380, 729, 969}));
    ExampleRunner.eq(110, 1200, new CasketOfStarEasy().maxEnergy(new int[]{10, 100, 10, 1, 10}));
    ExampleRunner.eq(111, 44, new CasketOfStarEasy().maxEnergy(new int[]{2, 5, 3, 1, 1, 4}));
    ExampleRunner.eq(112, 16501, new CasketOfStarEasy().maxEnergy(new int[]{1, 25, 100, 30, 2, 3, 4, 1, 100, 1}));
    ExampleRunner.eq(113, 4912000, new CasketOfStarEasy().maxEnergy(new int[]{1000, 223, 345, 460, 521, 633, 784, 385, 249, 1000}));
    ExampleRunner.eq(114, 12500, new CasketOfStarEasy().maxEnergy(new int[]{100, 20, 5, 1, 100}));
    ExampleRunner.eq(115, 10600, new CasketOfStarEasy().maxEnergy(new int[]{100, 5, 1, 1, 100}));
    ExampleRunner.eq(116, 47315, new CasketOfStarEasy().maxEnergy(new int[]{60, 49, 80, 23, 54, 90, 12, 95, 26, 59}));
    ExampleRunner.eq(117, 802401, new CasketOfStarEasy().maxEnergy(new int[]{1, 100, 800, 100, 1, 1, 800, 1, 1}));
    ExampleRunner.eq(118, 77, new CasketOfStarEasy().maxEnergy(new int[]{7, 3, 1, 2, 7}));
    ExampleRunner.eq(119, 22, new CasketOfStarEasy().maxEnergy(new int[]{1, 1, 1, 1, 1, 1, 2, 3, 2, 1}));
    ExampleRunner.eq(120, 17040, new CasketOfStarEasy().maxEnergy(new int[]{80, 40, 2, 50, 88, 50}));
    ExampleRunner.eq(121, 32, new CasketOfStarEasy().maxEnergy(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
    ExampleRunner.eq(122, 4169432, new CasketOfStarEasy().maxEnergy(new int[]{100, 200, 500, 894, 451, 984, 102, 1, 874, 874}));
    ExampleRunner.eq(123, 1235, new CasketOfStarEasy().maxEnergy(new int[]{20, 25, 20, 15, 19}));
    ExampleRunner.eq(124, 216, new CasketOfStarEasy().maxEnergy(new int[]{9, 3, 5, 9, 10}));
    ExampleRunner.eq(125, 45420, new CasketOfStarEasy().maxEnergy(new int[]{50, 90, 1, 8, 1, 1, 300}));
    ExampleRunner.eq(126, 31000, new CasketOfStarEasy().maxEnergy(new int[]{100, 1, 3, 100, 3, 1, 3, 1, 100}));
    ExampleRunner.eq(127, 38, new CasketOfStarEasy().maxEnergy(new int[]{1, 1, 2, 1, 1, 1, 2, 5, 3}));
    ExampleRunner.eq(128, 10200, new CasketOfStarEasy().maxEnergy(new int[]{100, 2, 100, 2}));
    ExampleRunner.eq(129, 152, new CasketOfStarEasy().maxEnergy(new int[]{1, 1, 4, 8, 4, 1, 1, 8}));
    ExampleRunner.eq(130, 2937051, new CasketOfStarEasy().maxEnergy(new int[]{477, 744, 474, 777, 447, 747, 777, 474}));
    ExampleRunner.eq(131, 32, new CasketOfStarEasy().maxEnergy(new int[]{2, 4, 7, 4, 2}));
    ExampleRunner.eq(132, 48, new CasketOfStarEasy().maxEnergy(new int[]{1, 7, 8, 6}));
    ExampleRunner.eq(133, 144, new CasketOfStarEasy().maxEnergy(new int[]{3, 10, 4, 1, 1, 8}));
    ExampleRunner.eq(134, 1194282, new CasketOfStarEasy().maxEnergy(new int[]{1, 90, 1000, 3, 1, 5, 1000, 11, 90, 2}));
    ExampleRunner.eq(135, 10500, new CasketOfStarEasy().maxEnergy(new int[]{100, 3, 2, 1, 100}));
    ExampleRunner.eq(136, 15000, new CasketOfStarEasy().maxEnergy(new int[]{100, 49, 1, 2, 100}));
    ExampleRunner.eq(137, 23, new CasketOfStarEasy().maxEnergy(new int[]{1, 3, 11, 4, 1}));
    ExampleRunner.eq(138, 301, new CasketOfStarEasy().maxEnergy(new int[]{1, 10, 100, 11, 1, 1}));
    ExampleRunner.eq(139, 120100, new CasketOfStarEasy().maxEnergy(new int[]{100, 3, 100, 1000, 101}));
    ExampleRunner.eq(140, 11, new CasketOfStarEasy().maxEnergy(new int[]{2, 4, 3, 1, 1}));
    ExampleRunner.eq(141, 18544, new CasketOfStarEasy().maxEnergy(new int[]{88, 40, 2, 50, 88, 50}));
    ExampleRunner.eq(142, 429, new CasketOfStarEasy().maxEnergy(new int[]{3, 2, 1, 8, 4, 7, 9, 3, 9, 9}));
    ExampleRunner.eq(143, 2747906, new CasketOfStarEasy().maxEnergy(new int[]{872, 1, 437, 101, 1, 605, 721, 997, 17, 1}));
    ExampleRunner.eq(144, 10143, new CasketOfStarEasy().maxEnergy(new int[]{69, 38, 29, 46, 72}));
    ExampleRunner.eq(145, 132, new CasketOfStarEasy().maxEnergy(new int[]{6, 1, 5, 9, 8}));
    ExampleRunner.eq(146, 4609048, new CasketOfStarEasy().maxEnergy(new int[]{712, 546, 712, 364, 712, 678, 453, 999, 804, 243}));
    ExampleRunner.eq(147, 51, new CasketOfStarEasy().maxEnergy(new int[]{3, 1, 4, 10, 3}));
    ExampleRunner.eq(148, 335, new CasketOfStarEasy().maxEnergy(new int[]{7, 50, 8, 1, 5}));
  }
}
