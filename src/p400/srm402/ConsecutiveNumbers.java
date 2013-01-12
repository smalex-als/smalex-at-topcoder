package p400.srm402;

import java.util.Arrays;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 24.05.2008
 * Time: 20:27:28
 */
public class ConsecutiveNumbers {
  public int[] missingNumber(int[] rest) {
    Arrays.sort(rest);
    for (int i = 1; i < rest.length; i++) {
      if (rest[i - 1] == rest[i]) {
        return new int[0];
      }
    }
    boolean ok = isConsecutive(rest);
    if (ok) {
      if (rest[0] - 1 > 0) {
        return new int[]{rest[0] - 1, rest[rest.length - 1] + 1};
      } else {
        return new int[]{rest[rest.length - 1] + 1};
      }
    }
    if (countErrors(rest) > 1) {
      return new int[0];
    }
    int missing = getMissing(rest);
    if (missing > 0) {
      return new int[]{missing};
    }
    return new int[0];
  }

  private boolean isConsecutive(int[] rest) {
    for (int i = 1; i < rest.length; i++) {
      if (rest[i - 1] + 1 != rest[i]) {
        return false;
      }
    }
    return true;
  }

  private int countErrors(int[] rest) {
    int cnt = 0;
    for (int i = 1; i < rest.length; i++) {
      if (rest[i] - rest[i - 1] > 1) {
        cnt += rest[i] - rest[i - 1] - 1;
      }
    }
    return cnt;
  }

  private int getMissing(int[] rest) {
    for (int i = 1; i < rest.length; i++) {
      if (rest[i] - rest[i - 1] > 1) {
        return rest[i - 1] + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {

    ExampleRunner.eq(1, new int[]{9}, new ConsecutiveNumbers().missingNumber(new int[]{10, 7, 12, 8, 11}));
    ExampleRunner.eq(2, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{3, 6}));
    ExampleRunner.eq(3, new int[]{4, 9}, new ConsecutiveNumbers().missingNumber(new int[]{5, 6, 7, 8}));
    ExampleRunner.eq(4, new int[]{999999999, 1000000001}, new ConsecutiveNumbers().missingNumber(new int[]{1000000000}));
    ExampleRunner.eq(5, new int[]{2}, new ConsecutiveNumbers().missingNumber(new int[]{1, 6, 9, 3, 8, 12, 7, 4, 11, 5, 10}));
    ExampleRunner.eq(6, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{5, 5}));
    ExampleRunner.eq(7, new int[]{2}, new ConsecutiveNumbers().missingNumber(new int[]{1}));
    ExampleRunner.eq(8, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{2, 2, 4}));
    ExampleRunner.eq(9, new int[]{2}, new ConsecutiveNumbers().missingNumber(new int[]{1, 6, 9, 3, 8, 12, 7, 4, 11, 5, 10}));
    ExampleRunner.eq(10, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 3, 5}));
    ExampleRunner.eq(11, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{5, 2, 1, 2}));
    ExampleRunner.eq(12, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 4}));
    ExampleRunner.eq(13, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 1}));
    ExampleRunner.eq(14, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{472, 467, 471}));
    ExampleRunner.eq(15, new int[]{86393085}, new ConsecutiveNumbers().missingNumber(new int[]{86393090, 86393072, 86393083, 86393071, 86393093, 86393081, 86393068, 86393099, 86393102, 86393073, 86393104, 86393075, 86393086, 86393082, 86393088, 86393098, 86393080, 86393091, 86393087, 86393094, 86393096, 86393076, 86393067, 86393089, 86393106, 86393066, 86393097, 86393077, 86393105, 86393078, 86393101, 86393069, 86393092, 86393103, 86393084, 86393074, 86393070, 86393095, 86393100, 86393079}));
    ExampleRunner.eq(16, new int[]{2}, new ConsecutiveNumbers().missingNumber(new int[]{1}));
    ExampleRunner.eq(17, new int[]{7483}, new ConsecutiveNumbers().missingNumber(new int[]{7485, 7482, 7484}));
    ExampleRunner.eq(18, new int[]{165, 167}, new ConsecutiveNumbers().missingNumber(new int[]{166}));
    ExampleRunner.eq(19, new int[]{98773612}, new ConsecutiveNumbers().missingNumber(new int[]{98773594, 98773608, 98773604, 98773602, 98773610, 98773598, 98773603, 98773600, 98773606, 98773601, 98773607, 98773599, 98773597, 98773605, 98773596, 98773609, 98773611, 98773595, 98773613}));
    ExampleRunner.eq(20, new int[]{94}, new ConsecutiveNumbers().missingNumber(new int[]{95, 97, 92, 98, 93, 96, 91, 99, 90}));
    ExampleRunner.eq(21, new int[]{605}, new ConsecutiveNumbers().missingNumber(new int[]{611, 602, 603, 604, 616, 610, 609, 606, 608, 601, 614, 607, 615, 613, 612, 600}));
    ExampleRunner.eq(22, new int[]{42431465}, new ConsecutiveNumbers().missingNumber(new int[]{42431495, 42431490, 42431485, 42431482, 42431468, 42431489, 42431476, 42431467, 42431480, 42431484, 42431487, 42431477, 42431494, 42431488, 42431496, 42431463, 42431486, 42431493, 42431462, 42431472, 42431471, 42431479, 42431483, 42431478, 42431481, 42431475, 42431461, 42431473, 42431491, 42431464, 42431474, 42431469, 42431466, 42431492, 42431470}));
    ExampleRunner.eq(23, new int[]{84}, new ConsecutiveNumbers().missingNumber(new int[]{92, 83, 67, 78, 74, 95, 66, 56, 64, 59, 63, 81, 80, 58, 55, 77, 68, 79, 54, 61, 90, 82, 75, 91, 73, 89, 65, 96, 70, 62, 88, 86, 72, 93, 94, 71, 60, 69, 85, 87, 76, 53, 57}));
    ExampleRunner.eq(24, new int[]{46675944}, new ConsecutiveNumbers().missingNumber(new int[]{46675953, 46675952, 46675964, 46675950, 46675967, 46675962, 46675955, 46675968, 46675956, 46675954, 46675942, 46675969, 46675960, 46675941, 46675965, 46675940, 46675946, 46675945, 46675970, 46675947, 46675959, 46675949, 46675963, 46675961, 46675957, 46675951, 46675958, 46675971, 46675966, 46675948, 46675943}));
    ExampleRunner.eq(25, new int[]{886238}, new ConsecutiveNumbers().missingNumber(new int[]{886219, 886247, 886237, 886248, 886223, 886220, 886241, 886242, 886228, 886239, 886226, 886224, 886225, 886234, 886243, 886221, 886216, 886235, 886233, 886231, 886215, 886240, 886222, 886229, 886232, 886246, 886230, 886236, 886218, 886244, 886245, 886217, 886227}));
    ExampleRunner.eq(26, new int[]{25506}, new ConsecutiveNumbers().missingNumber(new int[]{25496, 25502, 25508, 25510, 25515, 25499, 25495, 25524, 25519, 25493, 25513, 25525, 25526, 25494, 25523, 25522, 25503, 25492, 25521, 25517, 25491, 25518, 25504, 25489, 25505, 25507, 25516, 25500, 25497, 25512, 25498, 25509, 25511, 25514, 25490, 25520, 25501}));
    ExampleRunner.eq(27, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{76157441, 76157425, 76157427, 76157413, 76157426, 76157436, 76157410, 76157431, 76157447, 76157435, 76157414, 76157409}));
    ExampleRunner.eq(28, new int[]{84207054, 84207067}, new ConsecutiveNumbers().missingNumber(new int[]{84207060, 84207055, 84207062, 84207056, 84207066, 84207063, 84207059, 84207061, 84207058, 84207064, 84207057, 84207065}));
    ExampleRunner.eq(29, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{6, 2, 4, 8}));
    ExampleRunner.eq(30, new int[]{4612616, 4612619}, new ConsecutiveNumbers().missingNumber(new int[]{4612618, 4612617}));
    ExampleRunner.eq(31, new int[]{10}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(32, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{870192503, 870192496, 870192497, 870192511, 870192509, 870192501, 870192513, 870192494, 870192512}));
    ExampleRunner.eq(33, new int[]{993255816, 993255864}, new ConsecutiveNumbers().missingNumber(new int[]{993255830, 993255861, 993255839, 993255821, 993255829, 993255857, 993255828, 993255855, 993255850, 993255852, 993255836, 993255843, 993255848, 993255851, 993255818, 993255858, 993255826, 993255849, 993255838, 993255832, 993255831, 993255824, 993255844, 993255837, 993255835, 993255854, 993255842, 993255827, 993255833, 993255841, 993255820, 993255822, 993255846, 993255862, 993255863, 993255825, 993255819, 993255834, 993255856, 993255817, 993255847, 993255845, 993255840, 993255860, 993255823, 993255853, 993255859}));
    ExampleRunner.eq(34, new int[]{8, 57}, new ConsecutiveNumbers().missingNumber(new int[]{47, 56, 34, 23, 42, 55, 13, 48, 51, 50, 33, 12, 19, 40, 54, 24, 46, 30, 35, 36, 10, 22, 21, 11, 53, 28, 49, 17, 32, 41, 14, 16, 45, 25, 26, 9, 29, 15, 39, 43, 27, 52, 44, 20, 38, 18, 37, 31}));
    ExampleRunner.eq(35, new int[]{2, 4}, new ConsecutiveNumbers().missingNumber(new int[]{3}));
    ExampleRunner.eq(36, new int[]{27428, 27447}, new ConsecutiveNumbers().missingNumber(new int[]{27435, 27434, 27446, 27443, 27432, 27442, 27441, 27433, 27445, 27430, 27438, 27437, 27429, 27440, 27444, 27436, 27431, 27439}));
    ExampleRunner.eq(37, new int[]{209198206}, new ConsecutiveNumbers().missingNumber(new int[]{209198190, 209198191, 209198226, 209198200, 209198218, 209198192, 209198228, 209198189, 209198188, 209198196, 209198231, 209198205, 209198203, 209198227, 209198194, 209198216, 209198232, 209198195, 209198224, 209198212, 209198210, 209198208, 209198215, 209198187, 209198202, 209198222, 209198197, 209198229, 209198221, 209198185, 209198186, 209198219, 209198230, 209198201, 209198213, 209198207, 209198209, 209198217, 209198233, 209198199, 209198220, 209198211, 209198193, 209198198, 209198214, 209198225, 209198204, 209198223}));
    ExampleRunner.eq(38, new int[]{3127102}, new ConsecutiveNumbers().missingNumber(new int[]{3127105, 3127098, 3127112, 3127115, 3127110, 3127107, 3127106, 3127099, 3127111, 3127104, 3127113, 3127117, 3127114, 3127116, 3127108, 3127101, 3127109, 3127103, 3127097, 3127100}));
    ExampleRunner.eq(39, new int[]{16679}, new ConsecutiveNumbers().missingNumber(new int[]{16675, 16680, 16673, 16677, 16668, 16669, 16674, 16670, 16682, 16676, 16678, 16667, 16671, 16672, 16681}));
    ExampleRunner.eq(40, new int[]{11}, new ConsecutiveNumbers().missingNumber(new int[]{8, 6, 4, 10, 9, 2, 3, 1, 5, 7}));
    ExampleRunner.eq(41, new int[]{765}, new ConsecutiveNumbers().missingNumber(new int[]{767, 762, 760, 766, 770, 764, 771, 758, 763, 761, 769, 759, 768}));
    ExampleRunner.eq(42, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{66523439, 66523448, 66523466, 66523469, 66523455, 66523450, 66523472, 66523458, 66523454, 66523445, 66523462}));
    ExampleRunner.eq(43, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{2612, 2615, 2622, 2618, 2620, 2609, 2621, 2624, 2614}));
    ExampleRunner.eq(44, new int[]{59295, 59331}, new ConsecutiveNumbers().missingNumber(new int[]{59304, 59298, 59321, 59309, 59326, 59300, 59324, 59322, 59319, 59308, 59318, 59330, 59302, 59312, 59315, 59328, 59311, 59310, 59320, 59297, 59301, 59329, 59305, 59327, 59317, 59306, 59307, 59296, 59314, 59323, 59303, 59325, 59313, 59299, 59316}));
    ExampleRunner.eq(45, new int[]{2780, 2810}, new ConsecutiveNumbers().missingNumber(new int[]{2804, 2781, 2784, 2787, 2805, 2798, 2789, 2783, 2801, 2790, 2795, 2794, 2792, 2808, 2803, 2791, 2793, 2802, 2809, 2786, 2807, 2785, 2806, 2800, 2799, 2782, 2797, 2788, 2796}));
    ExampleRunner.eq(46, new int[]{244498}, new ConsecutiveNumbers().missingNumber(new int[]{244505, 244497, 244493, 244489, 244491, 244502, 244490, 244494, 244488, 244495, 244506, 244499, 244503, 244500, 244496, 244501, 244492, 244486, 244487, 244504}));
    ExampleRunner.eq(47, new int[]{7712, 7744}, new ConsecutiveNumbers().missingNumber(new int[]{7718, 7715, 7725, 7732, 7733, 7713, 7734, 7717, 7739, 7730, 7736, 7721, 7719, 7731, 7740, 7716, 7741, 7743, 7722, 7738, 7737, 7727, 7729, 7735, 7728, 7723, 7714, 7742, 7726, 7720, 7724}));
    ExampleRunner.eq(48, new int[]{32780844}, new ConsecutiveNumbers().missingNumber(new int[]{32780843, 32780822, 32780846, 32780811, 32780818, 32780810, 32780833, 32780825, 32780826, 32780828, 32780848, 32780842, 32780812, 32780829, 32780816, 32780838, 32780809, 32780831, 32780852, 32780851, 32780823, 32780821, 32780820, 32780830, 32780817, 32780836, 32780849, 32780847, 32780837, 32780824, 32780832, 32780835, 32780827, 32780808, 32780819, 32780840, 32780841, 32780834, 32780850, 32780813, 32780814, 32780845, 32780839, 32780815}));
    ExampleRunner.eq(49, new int[]{6233311, 6233320}, new ConsecutiveNumbers().missingNumber(new int[]{6233316, 6233312, 6233314, 6233318, 6233315, 6233317, 6233319, 6233313}));
    ExampleRunner.eq(50, new int[]{4}, new ConsecutiveNumbers().missingNumber(new int[]{7, 3, 2, 5, 6, 1}));
    ExampleRunner.eq(51, new int[]{56, 62}, new ConsecutiveNumbers().missingNumber(new int[]{61, 60, 58, 57, 59}));
    ExampleRunner.eq(52, new int[]{599}, new ConsecutiveNumbers().missingNumber(new int[]{601, 597, 596, 619, 625, 595, 615, 624, 613, 593, 609, 614, 626, 623, 629, 598, 622, 594, 620, 610, 618, 608, 611, 612, 592, 607, 616, 604, 600, 605, 606, 603, 627, 628, 621, 602, 617}));
    ExampleRunner.eq(53, new int[]{97595616}, new ConsecutiveNumbers().missingNumber(new int[]{97595625, 97595608, 97595617, 97595623, 97595600, 97595619, 97595598, 97595622, 97595606, 97595599, 97595604, 97595609, 97595610, 97595607, 97595605, 97595611, 97595620, 97595624, 97595614, 97595601, 97595621, 97595597, 97595615, 97595602, 97595618, 97595603, 97595613, 97595612}));
    ExampleRunner.eq(54, new int[]{59710086}, new ConsecutiveNumbers().missingNumber(new int[]{59710097, 59710093, 59710088, 59710104, 59710101, 59710094, 59710091, 59710102, 59710096, 59710105, 59710100, 59710103, 59710090, 59710095, 59710085, 59710092, 59710099, 59710098, 59710089, 59710087}));
    ExampleRunner.eq(55, new int[]{389649019}, new ConsecutiveNumbers().missingNumber(new int[]{389649018, 389648993, 389649004, 389649009, 389649016, 389648996, 389649011, 389649021, 389649000, 389649008, 389649015, 389649002, 389649028, 389648999, 389649007, 389649026, 389648995, 389649027, 389649014, 389648990, 389649022, 389649023, 389648992, 389649005, 389649006, 389649025, 389648998, 389649017, 389649013, 389649001, 389649024, 389649020, 389649010, 389649012, 389648991, 389649029, 389648994, 389648997, 389649003}));
    ExampleRunner.eq(56, new int[]{4}, new ConsecutiveNumbers().missingNumber(new int[]{10, 13, 36, 22, 9, 5, 26, 28, 25, 37, 16, 8, 24, 35, 6, 19, 23, 12, 11, 27, 3, 31, 29, 14, 34, 15, 33, 17, 32, 18, 30, 20, 7, 21}));
    ExampleRunner.eq(57, new int[]{8050679}, new ConsecutiveNumbers().missingNumber(new int[]{8050701, 8050693, 8050700, 8050690, 8050705, 8050697, 8050675, 8050699, 8050676, 8050691, 8050706, 8050674, 8050684, 8050683, 8050681, 8050686, 8050682, 8050685, 8050680, 8050677, 8050692, 8050702, 8050695, 8050673, 8050698, 8050689, 8050694, 8050678, 8050707, 8050687, 8050703, 8050688, 8050696, 8050704}));
    ExampleRunner.eq(58, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{731, 725, 738, 728, 726, 733, 718, 721, 736, 732, 722, 714, 737, 717, 743, 735, 744, 734, 720, 723, 727, 713, 739, 729, 742, 741}));
    ExampleRunner.eq(59, new int[]{9088}, new ConsecutiveNumbers().missingNumber(new int[]{9126, 9104, 9103, 9081, 9080, 9110, 9125, 9123, 9083, 9098, 9090, 9109, 9099, 9112, 9111, 9107, 9084, 9097, 9106, 9105, 9108, 9124, 9085, 9087, 9117, 9086, 9101, 9120, 9089, 9093, 9082, 9122, 9115, 9096, 9114, 9095, 9119, 9118, 9102, 9092, 9094, 9116, 9113, 9121, 9091, 9100}));
    ExampleRunner.eq(60, new int[]{45541}, new ConsecutiveNumbers().missingNumber(new int[]{45534, 45539, 45544, 45530, 45517, 45525, 45526, 45536, 45519, 45538, 45524, 45518, 45532, 45522, 45535, 45513, 45531, 45543, 45542, 45537, 45514, 45523, 45516, 45540, 45533, 45527, 45515, 45521, 45529, 45520, 45528, 45545}));
    ExampleRunner.eq(61, new int[]{9}, new ConsecutiveNumbers().missingNumber(new int[]{4, 6, 1, 5, 2, 3, 8, 7}));
    ExampleRunner.eq(62, new int[]{75}, new ConsecutiveNumbers().missingNumber(new int[]{87, 49, 65, 46, 77, 57, 53, 71, 56, 70, 52, 84, 48, 86, 62, 76, 81, 73, 51, 59, 47, 64, 78, 80, 72, 55, 58, 85, 82, 69, 67, 79, 74, 54, 50, 83, 68, 61, 66, 88, 63, 60}));
    ExampleRunner.eq(63, new int[]{38949}, new ConsecutiveNumbers().missingNumber(new int[]{38939, 38954, 38948, 38951, 38961, 38947, 38960, 38952, 38958, 38956, 38942, 38953, 38950, 38955, 38959, 38946, 38941, 38943, 38957, 38962, 38944, 38938, 38940, 38945}));
    ExampleRunner.eq(64, new int[]{18599}, new ConsecutiveNumbers().missingNumber(new int[]{18622, 18625, 18609, 18629, 18621, 18616, 18633, 18602, 18626, 18604, 18613, 18632, 18614, 18630, 18605, 18638, 18600, 18606, 18615, 18639, 18597, 18624, 18618, 18634, 18635, 18636, 18610, 18631, 18620, 18611, 18607, 18612, 18617, 18608, 18598, 18627, 18637, 18628, 18601, 18623, 18640, 18619, 18603}));
    ExampleRunner.eq(65, new int[]{589}, new ConsecutiveNumbers().missingNumber(new int[]{571, 596, 570, 580, 608, 600, 597, 609, 574, 581, 598, 613, 594, 604, 601, 603, 612, 595, 592, 591, 610, 606, 599, 605, 602, 611, 590, 572, 576, 579, 573, 585, 586, 582, 607, 583, 593, 577, 588, 584, 587, 578, 575}));
    ExampleRunner.eq(66, new int[]{6}, new ConsecutiveNumbers().missingNumber(new int[]{1, 3, 2, 4, 5}));
    ExampleRunner.eq(67, new int[]{261}, new ConsecutiveNumbers().missingNumber(new int[]{266, 275, 273, 255, 250, 254, 269, 276, 274, 267, 265, 272, 268, 271, 249, 256, 253, 248, 246, 263, 259, 264, 257, 247, 252, 251, 262, 258, 270, 260, 245}));
    ExampleRunner.eq(68, new int[]{2}, new ConsecutiveNumbers().missingNumber(new int[]{1}));
    ExampleRunner.eq(69, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{72263, 72267, 72280}));
    ExampleRunner.eq(70, new int[]{92129}, new ConsecutiveNumbers().missingNumber(new int[]{92095, 92120, 92118, 92107, 92098, 92124, 92116, 92125, 92105, 92110, 92093, 92102, 92109, 92119, 92128, 92131, 92097, 92111, 92096, 92100, 92121, 92113, 92126, 92117, 92130, 92099, 92114, 92122, 92103, 92123, 92127, 92106, 92104, 92133, 92132, 92094, 92112, 92101, 92108, 92115}));
    ExampleRunner.eq(71, new int[]{71052204}, new ConsecutiveNumbers().missingNumber(new int[]{71052199, 71052200, 71052206, 71052203, 71052220, 71052186, 71052183, 71052215, 71052195, 71052194, 71052202, 71052176, 71052174, 71052208, 71052192, 71052190, 71052188, 71052221, 71052197, 71052218, 71052185, 71052180, 71052207, 71052217, 71052214, 71052210, 71052193, 71052209, 71052222, 71052196, 71052198, 71052211, 71052181, 71052213, 71052205, 71052216, 71052182, 71052179, 71052175, 71052177, 71052189, 71052187, 71052212, 71052201, 71052178, 71052191, 71052184, 71052219}));
    ExampleRunner.eq(72, new int[]{70011052}, new ConsecutiveNumbers().missingNumber(new int[]{70011065, 70011047, 70011053, 70011051, 70011050, 70011062, 70011060, 70011055, 70011066, 70011049, 70011039, 70011041, 70011058, 70011064, 70011040, 70011067, 70011044, 70011046, 70011054, 70011048, 70011059, 70011057, 70011056, 70011068, 70011069, 70011042, 70011045, 70011061, 70011043, 70011063}));
    ExampleRunner.eq(73, new int[]{855100508}, new ConsecutiveNumbers().missingNumber(new int[]{855100506, 855100496, 855100509, 855100503, 855100481, 855100491, 855100490, 855100498, 855100502, 855100487, 855100499, 855100488, 855100493, 855100483, 855100485, 855100486, 855100497, 855100500, 855100482, 855100494, 855100501, 855100484, 855100504, 855100505, 855100489, 855100495, 855100507, 855100492}));
    ExampleRunner.eq(74, new int[]{665428734, 665428739}, new ConsecutiveNumbers().missingNumber(new int[]{665428735, 665428737, 665428738, 665428736}));
    ExampleRunner.eq(75, new int[]{84477725, 84477746}, new ConsecutiveNumbers().missingNumber(new int[]{84477738, 84477731, 84477726, 84477736, 84477737, 84477740, 84477742, 84477741, 84477733, 84477739, 84477743, 84477744, 84477734, 84477730, 84477727, 84477729, 84477728, 84477745, 84477732, 84477735}));
    ExampleRunner.eq(76, new int[]{75334424, 75334433}, new ConsecutiveNumbers().missingNumber(new int[]{75334425, 75334431, 75334429, 75334430, 75334427, 75334432, 75334428, 75334426}));
    ExampleRunner.eq(77, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{4962847, 4962870, 4962841, 4962858}));
    ExampleRunner.eq(78, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{759626, 759638, 759623, 759632, 759635, 759642, 759627, 759622, 759618, 759650, 759629, 759621, 759648, 759649}));
    ExampleRunner.eq(79, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{58362553, 58362557, 58362568, 58362551, 58362559, 58362576, 58362577, 58362584, 58362594}));
    ExampleRunner.eq(80, new int[]{2, 4}, new ConsecutiveNumbers().missingNumber(new int[]{3}));
    ExampleRunner.eq(81, new int[]{38313}, new ConsecutiveNumbers().missingNumber(new int[]{38315, 38297, 38272, 38270, 38306, 38289, 38298, 38301, 38291, 38299, 38276, 38277, 38302, 38282, 38308, 38287, 38307, 38293, 38317, 38275, 38311, 38269, 38294, 38305, 38296, 38292, 38288, 38278, 38281, 38271, 38285, 38314, 38303, 38283, 38280, 38295, 38273, 38312, 38284, 38274, 38310, 38300, 38290, 38316, 38309, 38286, 38304, 38279}));
    ExampleRunner.eq(82, new int[]{798801, 798816}, new ConsecutiveNumbers().missingNumber(new int[]{798803, 798814, 798809, 798810, 798804, 798812, 798808, 798807, 798802, 798815, 798813, 798805, 798811, 798806}));
    ExampleRunner.eq(83, new int[]{46, 76}, new ConsecutiveNumbers().missingNumber(new int[]{49, 63, 51, 69, 59, 72, 68, 57, 55, 54, 61, 65, 60, 53, 75, 56, 67, 50, 52, 71, 62, 48, 64, 74, 73, 47, 58, 66, 70}));
    ExampleRunner.eq(84, new int[]{1, 3}, new ConsecutiveNumbers().missingNumber(new int[]{2}));
    ExampleRunner.eq(85, new int[]{847199}, new ConsecutiveNumbers().missingNumber(new int[]{847193, 847196, 847202, 847201, 847191, 847197, 847194, 847192, 847195, 847203, 847200, 847198}));
    ExampleRunner.eq(86, new int[]{2}, new ConsecutiveNumbers().missingNumber(new int[]{1, 4, 3}));
    ExampleRunner.eq(87, new int[]{95637}, new ConsecutiveNumbers().missingNumber(new int[]{95657, 95626, 95615, 95611, 95646, 95654, 95648, 95610, 95639, 95634, 95642, 95655, 95650, 95638, 95647, 95652, 95628, 95653, 95644, 95629, 95624, 95656, 95651, 95627, 95619, 95617, 95614, 95649, 95612, 95643, 95618, 95620, 95616, 95645, 95632, 95622, 95640, 95658, 95633, 95659, 95636, 95635, 95621, 95630, 95625, 95613, 95631, 95641, 95623}));
    ExampleRunner.eq(88, new int[]{8875}, new ConsecutiveNumbers().missingNumber(new int[]{8847, 8844, 8870, 8837, 8857, 8858, 8834, 8852, 8835, 8845, 8851, 8868, 8859, 8865, 8836, 8849, 8839, 8861, 8873, 8840, 8830, 8855, 8872, 8833, 8866, 8829, 8867, 8877, 8846, 8853, 8871, 8854, 8838, 8850, 8856, 8862, 8831, 8863, 8841, 8848, 8876, 8843, 8874, 8864, 8832, 8842, 8860, 8869}));
    ExampleRunner.eq(89, new int[]{9677, 9683}, new ConsecutiveNumbers().missingNumber(new int[]{9682, 9679, 9680, 9681, 9678}));
    ExampleRunner.eq(90, new int[]{231602889}, new ConsecutiveNumbers().missingNumber(new int[]{231602878, 231602853, 231602891, 231602861, 231602850, 231602875, 231602845, 231602857, 231602873, 231602884, 231602886, 231602876, 231602881, 231602851, 231602883, 231602864, 231602890, 231602868, 231602866, 231602871, 231602882, 231602863, 231602888, 231602872, 231602852, 231602865, 231602893, 231602860, 231602858, 231602885, 231602846, 231602867, 231602869, 231602854, 231602887, 231602856, 231602848, 231602859, 231602879, 231602849, 231602870, 231602855, 231602880, 231602862, 231602874, 231602892, 231602877, 231602847}));
    ExampleRunner.eq(91, new int[]{1269, 1293}, new ConsecutiveNumbers().missingNumber(new int[]{1290, 1274, 1277, 1270, 1271, 1283, 1284, 1285, 1278, 1291, 1281, 1280, 1276, 1275, 1282, 1288, 1272, 1292, 1273, 1289, 1279, 1287, 1286}));
    ExampleRunner.eq(92, new int[]{815287}, new ConsecutiveNumbers().missingNumber(new int[]{815268, 815275, 815262, 815304, 815270, 815286, 815276, 815281, 815263, 815265, 815277, 815294, 815266, 815283, 815290, 815272, 815280, 815278, 815271, 815299, 815307, 815279, 815305, 815284, 815261, 815292, 815297, 815273, 815274, 815285, 815295, 815282, 815302, 815267, 815264, 815289, 815301, 815269, 815293, 815291, 815303, 815298, 815308, 815309, 815306, 815300, 815288, 815296}));
    ExampleRunner.eq(93, new int[]{282541}, new ConsecutiveNumbers().missingNumber(new int[]{282534, 282540, 282519, 282517, 282528, 282533, 282544, 282526, 282527, 282537, 282516, 282522, 282529, 282545, 282521, 282518, 282538, 282520, 282525, 282536, 282523, 282543, 282535, 282539, 282524, 282532, 282530, 282531, 282542}));
    ExampleRunner.eq(94, new int[]{7}, new ConsecutiveNumbers().missingNumber(new int[]{5, 17, 8, 15, 25, 14, 18, 27, 26, 31, 9, 12, 13, 11, 4, 24, 10, 22, 16, 19, 23, 28, 20, 33, 29, 34, 32, 6, 30, 21}));
    ExampleRunner.eq(95, new int[]{5632}, new ConsecutiveNumbers().missingNumber(new int[]{5618, 5613, 5625, 5612, 5630, 5605, 5616, 5631, 5629, 5628, 5634, 5622, 5627, 5619, 5620, 5610, 5615, 5626, 5608, 5607, 5633, 5623, 5621, 5611, 5617, 5614, 5606, 5609, 5624}));
    ExampleRunner.eq(96, new int[]{10463219, 10463230}, new ConsecutiveNumbers().missingNumber(new int[]{10463222, 10463220, 10463227, 10463223, 10463229, 10463226, 10463225, 10463224, 10463221, 10463228}));
    ExampleRunner.eq(97, new int[]{582388417}, new ConsecutiveNumbers().missingNumber(new int[]{582388415, 582388410, 582388416, 582388413, 582388409, 582388418, 582388411, 582388408, 582388412, 582388407, 582388405, 582388422, 582388414, 582388420, 582388406, 582388401, 582388403, 582388404, 582388419, 582388421, 582388402}));
    ExampleRunner.eq(98, new int[]{2}, new ConsecutiveNumbers().missingNumber(new int[]{1}));
    ExampleRunner.eq(99, new int[]{1393772, 1393777}, new ConsecutiveNumbers().missingNumber(new int[]{1393775, 1393776, 1393774, 1393773}));
    ExampleRunner.eq(100, new int[]{214}, new ConsecutiveNumbers().missingNumber(new int[]{228, 235, 246, 226, 222, 223, 251, 249, 219, 227, 217, 240, 248, 211, 213, 231, 225, 216, 250, 229, 233, 234, 212, 239, 244, 224, 245, 243, 237, 242, 236, 232, 230, 252, 253, 221, 220, 241, 218, 238, 247, 215}));
    ExampleRunner.eq(101, new int[]{180551}, new ConsecutiveNumbers().missingNumber(new int[]{180548, 180554, 180564, 180563, 180552, 180565, 180556, 180566, 180555, 180557, 180561, 180558, 180559, 180546, 180562, 180545, 180553, 180547, 180549, 180550, 180560}));
    ExampleRunner.eq(102, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{4715914, 4715926, 4715930, 4715915, 4715913, 4715924, 4715927, 4715923, 4715912, 4715918, 4715925, 4715919, 4715917, 4715929, 4715921, 4715928, 4715922}));
    ExampleRunner.eq(103, new int[]{720992, 720994}, new ConsecutiveNumbers().missingNumber(new int[]{720993}));
    ExampleRunner.eq(104, new int[]{894437}, new ConsecutiveNumbers().missingNumber(new int[]{894438, 894442, 894432, 894435, 894444, 894433, 894440, 894429, 894430, 894428, 894436, 894443, 894434, 894439, 894441, 894431}));
    ExampleRunner.eq(105, new int[]{8}, new ConsecutiveNumbers().missingNumber(new int[]{23, 6, 22, 1, 26, 20, 24, 14, 11, 2, 27, 12, 9, 3, 19, 18, 7, 25, 16, 15, 31, 10, 29, 30, 28, 13, 5, 21, 4, 17}));
    ExampleRunner.eq(106, new int[]{486591133}, new ConsecutiveNumbers().missingNumber(new int[]{486591111, 486591112, 486591120, 486591131, 486591132, 486591115, 486591118, 486591126, 486591124, 486591123, 486591119, 486591130, 486591117, 486591135, 486591109, 486591113, 486591108, 486591125, 486591134, 486591122, 486591129, 486591127, 486591114, 486591121, 486591128, 486591116, 486591110}));
    ExampleRunner.eq(107, new int[]{2626074, 2626125}, new ConsecutiveNumbers().missingNumber(new int[]{2626117, 2626098, 2626105, 2626084, 2626114, 2626096, 2626082, 2626122, 2626092, 2626121, 2626086, 2626110, 2626093, 2626080, 2626103, 2626106, 2626077, 2626090, 2626124, 2626102, 2626095, 2626118, 2626107, 2626113, 2626100, 2626120, 2626078, 2626089, 2626099, 2626109, 2626111, 2626104, 2626088, 2626081, 2626119, 2626112, 2626101, 2626123, 2626075, 2626115, 2626087, 2626079, 2626097, 2626076, 2626083, 2626108, 2626116, 2626085, 2626094, 2626091}));
    ExampleRunner.eq(108, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{569198432, 569198466, 569198442, 569198457, 569198464, 569198429, 569198435, 569198438, 569198427, 569198452, 569198465, 569198448, 569198459, 569198453, 569198431, 569198451, 569198443, 569198458, 569198454, 569198461, 569198445, 569198463}));
    ExampleRunner.eq(109, new int[]{5524}, new ConsecutiveNumbers().missingNumber(new int[]{5516, 5520, 5526, 5513, 5519, 5515, 5522, 5527, 5528, 5523, 5521, 5517, 5518, 5514, 5525}));
    ExampleRunner.eq(110, new int[]{213117489, 213117496}, new ConsecutiveNumbers().missingNumber(new int[]{213117492, 213117491, 213117495, 213117494, 213117493, 213117490}));
    ExampleRunner.eq(111, new int[]{73298034}, new ConsecutiveNumbers().missingNumber(new int[]{73298033, 73298035, 73298032}));
    ExampleRunner.eq(112, new int[]{2}, new ConsecutiveNumbers().missingNumber(new int[]{1}));
    ExampleRunner.eq(113, new int[]{907237820}, new ConsecutiveNumbers().missingNumber(new int[]{907237816, 907237821, 907237809, 907237815, 907237806, 907237803, 907237818, 907237811, 907237800, 907237807, 907237804, 907237808, 907237814, 907237802, 907237810, 907237822, 907237817, 907237805, 907237812, 907237819, 907237813, 907237801}));
    ExampleRunner.eq(114, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 1000000000}));
    ExampleRunner.eq(115, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 4, 6, 8}));
    ExampleRunner.eq(116, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{999999996, 999999997, 999999998, 1000000000, 777777777, 565656565}));
    ExampleRunner.eq(117, new int[]{1000000, 1000003}, new ConsecutiveNumbers().missingNumber(new int[]{1000001, 1000002}));
    ExampleRunner.eq(118, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{6, 6}));
    ExampleRunner.eq(119, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{8, 6, 4}));
    ExampleRunner.eq(120, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{2, 2}));
    ExampleRunner.eq(121, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 2}));
    ExampleRunner.eq(122, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 1}));
    ExampleRunner.eq(123, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 1, 2, 2}));
    ExampleRunner.eq(124, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{3, 3}));
    ExampleRunner.eq(125, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 3, 4, 6}));
    ExampleRunner.eq(126, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{2, 2, 2}));
    ExampleRunner.eq(127, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 4, 5, 7, 8}));
    ExampleRunner.eq(128, new int[]{999999999, 1000000001}, new ConsecutiveNumbers().missingNumber(new int[]{1000000000}));
    ExampleRunner.eq(129, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{2, 3, 4, 6, 8, 9, 10}));
    ExampleRunner.eq(130, new int[]{3}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2}));
    ExampleRunner.eq(131, new int[]{6}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 3, 4, 5}));
    ExampleRunner.eq(132, new int[]{2}, new ConsecutiveNumbers().missingNumber(new int[]{1}));
    ExampleRunner.eq(133, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 3, 5, 7}));
    ExampleRunner.eq(134, new int[]{2, 4}, new ConsecutiveNumbers().missingNumber(new int[]{3}));
    ExampleRunner.eq(135, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 3, 5}));
    ExampleRunner.eq(136, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{2, 4, 6, 8}));
    ExampleRunner.eq(137, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{2, 3, 4, 6, 6}));
    ExampleRunner.eq(138, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{5, 5, 5}));
    ExampleRunner.eq(139, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 1000000000}));
    ExampleRunner.eq(140, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 3, 5, 6, 7}));
    ExampleRunner.eq(141, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{3, 6, 4, 5, 5, 6}));
    ExampleRunner.eq(142, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{100, 100, 100}));
    ExampleRunner.eq(143, new int[]{2}, new ConsecutiveNumbers().missingNumber(new int[]{3, 1}));
    ExampleRunner.eq(144, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 1}));
    ExampleRunner.eq(145, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{12, 14, 16}));
    ExampleRunner.eq(146, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{3, 5, 7, 9}));
    ExampleRunner.eq(147, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{3, 4, 6, 7, 9, 10}));
    ExampleRunner.eq(148, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 3, 5, 7, 9}));
    ExampleRunner.eq(149, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{2, 2, 4}));
    ExampleRunner.eq(150, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{2, 4, 4}));
    ExampleRunner.eq(151, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 4, 6}));
    ExampleRunner.eq(152, new int[]{4}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 3}));
    ExampleRunner.eq(153, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{2, 3, 3, 5}));
    ExampleRunner.eq(154, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 4, 6, 8, 9}));
    ExampleRunner.eq(155, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 3, 5, 6, 7, 9, 10}));
    ExampleRunner.eq(156, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 3, 5, 6, 7, 8, 10, 11, 12}));
    ExampleRunner.eq(157, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{2, 4, 6}));
    ExampleRunner.eq(158, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 4, 5, 6, 8, 9}));
    ExampleRunner.eq(159, new int[]{5}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 3, 4}));
    ExampleRunner.eq(160, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{999999996, 999999997, 999999998, 1000000000, 777777777, 565656565, 111111111}));
    ExampleRunner.eq(161, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 1, 4}));
    ExampleRunner.eq(162, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 1, 1}));
    ExampleRunner.eq(163, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{5, 7, 8, 10, 11}));
    ExampleRunner.eq(164, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{3, 3, 5, 6}));
    ExampleRunner.eq(165, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 4, 4, 5}));
    ExampleRunner.eq(166, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{98, 100, 101, 101, 101}));
    ExampleRunner.eq(167, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 1, 3}));
    ExampleRunner.eq(168, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{5, 3, 7, 9, 11}));
    ExampleRunner.eq(169, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{4, 4, 4, 4}));
    ExampleRunner.eq(170, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{8, 8, 8}));
    ExampleRunner.eq(171, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{2, 4, 5, 5, 6}));
    ExampleRunner.eq(172, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 4, 5, 6, 7}));
    ExampleRunner.eq(173, new int[]{10}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(174, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1000000000, 1}));
    ExampleRunner.eq(175, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 4, 4}));
    ExampleRunner.eq(176, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{3, 5, 7}));
    ExampleRunner.eq(177, new int[]{3}, new ConsecutiveNumbers().missingNumber(new int[]{1, 2, 4}));
    ExampleRunner.eq(178, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 1, 1, 4}));
    ExampleRunner.eq(179, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{3, 5, 6, 7, 9, 10}));
    ExampleRunner.eq(180, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{101, 101, 101}));
    ExampleRunner.eq(181, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{10, 2, 3, 6, 4, 7, 9}));
    ExampleRunner.eq(182, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{3, 3, 5}));
    ExampleRunner.eq(183, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{10, 7, 12, 8, 11, 13, 15}));
    ExampleRunner.eq(184, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{2, 2, 2, 2, 2}));
    ExampleRunner.eq(185, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{1, 4, 4, 2}));
    ExampleRunner.eq(186, new int[]{}, new ConsecutiveNumbers().missingNumber(new int[]{5, 6, 8, 10}));
  }

}
