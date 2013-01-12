package p400.srm479;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 12/14/10
 * Time: 8:49 PM
 */
public class TheCoffeeTimeDivTwo {
  public int find(int n, int[] tea) {
    int[] map = new int[n + 1];
    for (int i = 1; i < map.length; i++) {
      map[i] = 1;
    }
    for (int aTea : tea) {
      map[aTea] = 2;
    }
    return solve(map, 1) + solve(map, 2);
  }

  private int solve(int[] map, int mode) {
    int result = 0;
    int flack = 0;
    int pos = 0;
    int foundIndex;
    while ((foundIndex = findIndex(map, mode)) != -1) {
      if (flack == 0) {
        result += pos + 47;
        pos = 0;
        flack = 7;
      }
      flack--;
      result += Math.abs(foundIndex - pos);
      result += 4;
      pos = foundIndex;
      map[foundIndex] = 0;
    }
    result += pos; // вернуться назад в исходную позицию
    return result;
  }

  private int findIndex(int[] map, int mode) {
    for (int i = map.length - 1; i >= 0; i--) {
      if (map[i] == mode) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 108, new TheCoffeeTimeDivTwo().find(2, new int[]{1}));
    ExampleRunner.eq(2, 59, new TheCoffeeTimeDivTwo().find(2, new int[]{2, 1}));
    ExampleRunner.eq(3, 261, new TheCoffeeTimeDivTwo().find(15, new int[]{1, 2, 3, 4, 5, 6, 7}));
    ExampleRunner.eq(4, 891, new TheCoffeeTimeDivTwo().find(47, new int[]{1, 10, 6, 2, 4}));
    ExampleRunner.eq(5, 154, new TheCoffeeTimeDivTwo().find(9, new int[]{3, 1}));
    ExampleRunner.eq(6, 142, new TheCoffeeTimeDivTwo().find(7, new int[]{3, 2}));
    ExampleRunner.eq(7, 130, new TheCoffeeTimeDivTwo().find(5, new int[]{4, 2, 1, 5}));
    ExampleRunner.eq(8, 953, new TheCoffeeTimeDivTwo().find(49, new int[]{10, 16, 40, 41, 27, 47, 26, 43, 21, 34, 22, 13, 31, 17, 4, 23, 7, 9, 36, 28, 20, 18, 8, 49, 11, 45, 15, 38, 25, 35, 48, 6, 32, 1, 3, 39, 24, 42, 2, 37, 29, 5}));
    ExampleRunner.eq(9, 863, new TheCoffeeTimeDivTwo().find(44, new int[]{19, 29, 7, 41, 26, 39}));
    ExampleRunner.eq(10, 726, new TheCoffeeTimeDivTwo().find(39, new int[]{27, 29, 16, 18, 28, 4, 7, 39, 1, 25, 37, 33, 26, 9, 19, 14, 38, 10, 35, 24, 3, 22, 12, 15, 17, 2, 20, 34, 36, 30, 5, 6, 13, 21}));
    ExampleRunner.eq(11, 386, new TheCoffeeTimeDivTwo().find(22, new int[]{4, 5, 10, 11, 9, 12, 15, 19, 13, 3, 6, 1, 22, 17, 14}));
    ExampleRunner.eq(12, 845, new TheCoffeeTimeDivTwo().find(43, new int[]{19, 28, 34, 11, 4, 35, 10, 13, 12, 31, 30, 18, 5, 39, 33, 2, 32, 27, 43, 1, 36, 42, 8, 15, 26, 16, 14, 41, 17, 29, 37, 25, 38, 23, 22, 3, 24, 9, 40, 20, 7, 6}));
    ExampleRunner.eq(13, 424, new TheCoffeeTimeDivTwo().find(24, new int[]{9, 21, 7, 19, 13, 10, 18, 15, 22, 1, 20, 12, 23, 4, 5, 16, 11, 17}));
    ExampleRunner.eq(14, 1183, new TheCoffeeTimeDivTwo().find(54, new int[]{21, 10, 48}));
    ExampleRunner.eq(15, 338, new TheCoffeeTimeDivTwo().find(18, new int[]{7, 1}));
    ExampleRunner.eq(16, 2193, new TheCoffeeTimeDivTwo().find(86, new int[]{53, 42, 17, 71, 35, 39, 59, 52, 5, 41}));
    ExampleRunner.eq(17, 696, new TheCoffeeTimeDivTwo().find(37, new int[]{4, 1, 25, 31, 3, 36, 34, 32, 6, 29, 24, 23, 7, 27, 33, 19}));
    ExampleRunner.eq(18, 2057, new TheCoffeeTimeDivTwo().find(82, new int[]{81, 69, 15, 27, 63, 38, 79, 49}));
    ExampleRunner.eq(19, 2515, new TheCoffeeTimeDivTwo().find(94, new int[]{7, 33, 31, 58, 45, 65, 38, 6, 3, 53, 63, 39, 43, 91, 89, 73, 24, 47, 67, 55, 1, 71, 57, 56, 37, 80, 51, 10, 77, 21, 59, 44, 82, 87, 70, 28, 19, 52, 85, 49, 11, 81, 83}));
    ExampleRunner.eq(20, 2001, new TheCoffeeTimeDivTwo().find(80, new int[]{43}));
    ExampleRunner.eq(21, 585, new TheCoffeeTimeDivTwo().find(35, new int[]{31, 4, 12, 19, 9, 25, 18, 16, 33, 10, 30, 2, 17, 6, 13, 23, 8, 35, 34, 20, 7, 27, 29, 21, 11, 5, 32, 28, 1, 22, 15, 24, 26, 14, 3}));
    ExampleRunner.eq(22, 440, new TheCoffeeTimeDivTwo().find(28, new int[]{23, 15, 28, 6, 25, 7, 24, 1, 18, 21, 27, 20, 17, 22, 26, 11, 4, 14, 5, 12, 13, 19, 2, 16, 10, 9, 8, 3}));
    ExampleRunner.eq(23, 515, new TheCoffeeTimeDivTwo().find(30, new int[]{9, 29, 30, 16, 4, 26, 21, 5, 10, 2, 19, 1, 20, 6, 25, 8, 3, 14, 18, 11, 23, 13, 15, 12, 27, 28, 22, 17, 7, 24}));
    ExampleRunner.eq(24, 77, new TheCoffeeTimeDivTwo().find(5, new int[]{1, 4, 3, 2, 5}));
    ExampleRunner.eq(25, 809, new TheCoffeeTimeDivTwo().find(43, new int[]{9, 16, 12, 15, 5, 4, 29, 21, 38, 28, 31, 1, 8, 20, 11, 27, 37, 2, 10, 42, 43, 33, 22, 25, 6, 40, 18, 39, 35, 26, 34, 7, 14, 23, 24, 3, 17, 30, 32, 36, 13, 19, 41}));
    ExampleRunner.eq(26, 128570, new TheCoffeeTimeDivTwo().find(906, new int[]{219, 163, 364, 709, 129, 611, 205, 867, 859, 549, 628, 715, 431, 605, 256, 745, 97, 255, 733, 424, 145, 673, 471, 139, 643, 169, 629, 228, 470, 805, 1, 157, 598, 747, 671, 475, 409, 109, 264, 562, 697, 543}));
    ExampleRunner.eq(27, 5365, new TheCoffeeTimeDivTwo().find(154, new int[]{127, 71, 85, 103, 39, 14, 111, 72, 19, 40, 113, 151, 147, 7, 137, 83, 65, 78, 148, 93, 58, 121, 75, 135, 55, 128, 25, 144, 99, 131, 50, 57, 37, 53, 36, 115, 26, 51, 97, 88}));
    ExampleRunner.eq(28, 128198, new TheCoffeeTimeDivTwo().find(902, new int[]{861, 452}));
    ExampleRunner.eq(29, 67018, new TheCoffeeTimeDivTwo().find(641, new int[]{392, 96, 631, 125, 409}));
    ExampleRunner.eq(30, 143976, new TheCoffeeTimeDivTwo().find(960, new int[]{629, 681, 265, 661, 950, 475, 193, 111, 425}));
    ExampleRunner.eq(31, 9881, new TheCoffeeTimeDivTwo().find(222, new int[]{104}));
    ExampleRunner.eq(32, 37128, new TheCoffeeTimeDivTwo().find(467, new int[]{240, 332, 16, 208, 382, 130, 394, 354, 162, 403, 219, 89, 50, 356, 134, 363, 214, 237, 229, 138, 352, 440, 30, 20, 85, 119, 203, 206, 183, 150, 284, 76, 391, 390, 235, 11, 451, 236, 288, 380, 326, 370, 438, 287, 142}));
    ExampleRunner.eq(33, 64987, new TheCoffeeTimeDivTwo().find(632, new int[]{599, 99, 225, 402, 289, 48, 425, 89, 307, 333, 115, 352, 497, 9, 93, 241, 1, 412, 21, 103, 73, 493, 300, 137, 627, 610, 521, 45, 227, 384, 575, 184, 205}));
    ExampleRunner.eq(34, 45055, new TheCoffeeTimeDivTwo().find(519, new int[]{57, 69, 340, 264, 248, 83, 265, 437, 147, 325, 406, 271, 104, 112, 470, 438, 349, 212, 241, 448, 425, 66, 443, 139, 343, 436, 312, 344, 58, 238, 49, 490, 166, 214, 65}));
    ExampleRunner.eq(35, 46240, new TheCoffeeTimeDivTwo().find(526, new int[]{409, 213, 137, 321}));
    ExampleRunner.eq(36, 127952, new TheCoffeeTimeDivTwo().find(906, new int[]{1, 12, 40, 5, 6, 29, 31, 36, 23, 18, 26, 30, 19, 38, 35, 37, 25, 8, 4, 15, 7, 39, 11, 27, 14, 13, 21, 10, 2, 16, 22, 34, 32, 42, 41, 3, 28, 33, 24, 20, 9, 17}));
    ExampleRunner.eq(37, 17852, new TheCoffeeTimeDivTwo().find(314, new int[]{4, 10, 16, 8, 3, 15, 6, 11, 5, 1, 18, 14, 2, 7, 13, 19, 17, 12, 9}));
    ExampleRunner.eq(38, 3560, new TheCoffeeTimeDivTwo().find(121, new int[]{5, 4, 6, 9, 1, 11, 3, 7, 13, 2, 8, 12, 10}));
    ExampleRunner.eq(39, 114995, new TheCoffeeTimeDivTwo().find(857, new int[]{7, 1, 9, 15, 5, 2, 12, 14, 10, 3, 13, 16, 18, 6, 11, 17, 4, 8}));
    ExampleRunner.eq(40, 27352, new TheCoffeeTimeDivTwo().find(398, new int[]{5, 4, 6, 2, 7, 1, 8, 3}));
    ExampleRunner.eq(41, 154894, new TheCoffeeTimeDivTwo().find(1000, new int[]{444, 455, 483, 448, 449, 487, 490, 479, 466, 489, 469, 473, 462, 481, 478, 480, 488, 451, 447, 458, 486, 482, 454, 470, 457, 456, 464, 453, 445, 459, 465, 477, 475, 485, 484, 446, 471, 476, 467, 463, 452, 460, 450, 472, 468, 461, 474}));
    ExampleRunner.eq(42, 155600, new TheCoffeeTimeDivTwo().find(1000, new int[]{607, 227, 545, 365, 226, 369, 269, 125, 437, 590, 811, 135, 523, 31, 573, 799, 611, 217, 252, 852, 199, 744, 563, 291, 165, 529, 501, 41, 749, 796, 134, 7, 357, 417, 388, 73, 868, 873, 61, 981, 784, 137, 681, 434, 677, 605, 907}));
    ExampleRunner.eq(43, 155542, new TheCoffeeTimeDivTwo().find(1000, new int[]{681, 105, 576, 313, 414, 943, 89, 585, 279, 181, 310, 253, 201, 883, 85, 239, 481, 997, 401, 191, 701, 686, 901, 23, 2, 803, 97, 748, 396, 385, 979, 255, 685, 271, 345, 793, 601, 900, 795, 985, 831, 565, 111, 517, 45, 948, 277}));
    ExampleRunner.eq(44, 155580, new TheCoffeeTimeDivTwo().find(1000, new int[]{897, 737, 25, 579, 37, 116, 719, 73, 553, 189, 876, 479, 885, 997, 513, 373, 655, 657, 541, 119, 914, 971, 219, 806, 793, 506, 701, 770, 798, 619, 835, 236, 241, 31, 915, 251, 629, 617, 267, 27, 270, 105, 636, 429, 751, 265, 424}));
    ExampleRunner.eq(45, 155524, new TheCoffeeTimeDivTwo().find(1000, new int[]{595, 887, 885, 961, 601, 641, 482, 232, 876, 361, 517, 561, 753, 401, 281, 799, 433, 877, 681, 717, 556, 851, 713, 376, 745, 853, 633, 161, 701, 463, 353, 551, 751, 156, 881, 781, 445, 89, 358, 499, 309, 725, 818, 571, 941, 669, 55}));
    ExampleRunner.eq(46, 155500, new TheCoffeeTimeDivTwo().find(1000, new int[]{109, 848, 271, 580, 846, 741, 26, 843, 785, 605, 521, 301, 841, 463, 748, 845, 667, 209, 201, 551, 516, 1, 440, 125, 648, 663, 177, 278, 353, 651, 161, 981, 961, 685, 295, 988, 137, 159, 817, 81, 676, 486, 245, 151, 734, 266, 473}));
    ExampleRunner.eq(47, 155468, new TheCoffeeTimeDivTwo().find(1000, new int[]{922, 761, 257, 31, 869, 356, 601, 461, 117, 661, 218, 521, 689, 911, 519, 553, 479, 804, 8, 225, 124, 863, 821, 101, 276, 476, 368, 481, 313, 833, 741, 189, 401, 153, 216, 305, 692, 537, 876, 538, 358, 370, 157, 817, 341, 205, 97}));
    ExampleRunner.eq(48, 891, new TheCoffeeTimeDivTwo().find(47, new int[]{1, 10, 6, 2, 4}));
    ExampleRunner.eq(49, 261, new TheCoffeeTimeDivTwo().find(15, new int[]{1, 2, 3, 4, 5, 6, 7}));
    ExampleRunner.eq(50, 108, new TheCoffeeTimeDivTwo().find(2, new int[]{1}));
    ExampleRunner.eq(51, 891, new TheCoffeeTimeDivTwo().find(47, new int[]{1, 10, 6, 2, 4, 8}));
    ExampleRunner.eq(52, 153133, new TheCoffeeTimeDivTwo().find(995, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(53, 2771, new TheCoffeeTimeDivTwo().find(100, new int[]{1, 2, 3, 4, 88, 99, 33}));
    ExampleRunner.eq(54, 154724, new TheCoffeeTimeDivTwo().find(1000, new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 87, 88, 90, 96, 105}));
    ExampleRunner.eq(55, 956, new TheCoffeeTimeDivTwo().find(47, new int[]{1, 5, 32, 23, 2, 34, 35, 21}));
    ExampleRunner.eq(56, 155612, new TheCoffeeTimeDivTwo().find(1000, new int[]{1, 10, 6, 2, 4, 800, 325, 453, 564}));
    ExampleRunner.eq(57, 364, new TheCoffeeTimeDivTwo().find(20, new int[]{1, 3, 6, 8, 10, 12, 13, 14, 15, 17}));
    ExampleRunner.eq(58, 156172, new TheCoffeeTimeDivTwo().find(1000, new int[]{500, 90, 1000, 1}));
    ExampleRunner.eq(59, 265, new TheCoffeeTimeDivTwo().find(15, new int[]{1, 2, 3, 4, 5, 6, 7, 9, 14, 11}));
    ExampleRunner.eq(60, 261, new TheCoffeeTimeDivTwo().find(15, new int[]{1, 2, 3, 4, 5, 6, 7, 15}));
    ExampleRunner.eq(61, 155502, new TheCoffeeTimeDivTwo().find(1000, new int[]{21, 42, 63, 84, 105, 126, 147, 168, 189, 210, 231, 252, 273, 294, 315, 336, 357, 378, 399, 420, 441, 462, 483, 504, 525, 546, 567, 588, 609, 630, 651, 672, 693, 714, 735, 756, 777, 798, 819, 840, 861, 882, 903, 924, 945, 966, 987}));
    ExampleRunner.eq(62, 996, new TheCoffeeTimeDivTwo().find(50, new int[]{1, 2, 3, 4, 5, 6, 7}));
    ExampleRunner.eq(63, 261, new TheCoffeeTimeDivTwo().find(15, new int[]{8, 9, 10, 11, 14, 12, 15, 13}));
    ExampleRunner.eq(64, 156300, new TheCoffeeTimeDivTwo().find(1000, new int[]{50, 90, 1000, 1}));
    ExampleRunner.eq(65, 1052, new TheCoffeeTimeDivTwo().find(50, new int[]{1, 2, 9, 7, 5, 6, 8, 12, 15, 18, 43, 50}));
    ExampleRunner.eq(66, 8580, new TheCoffeeTimeDivTwo().find(207, new int[]{1, 2, 3, 4, 200, 201, 202, 203, 204, 205, 206}));
    ExampleRunner.eq(67, 152, new TheCoffeeTimeDivTwo().find(9, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(68, 259, new TheCoffeeTimeDivTwo().find(15, new int[]{1, 2, 3, 4, 5, 6, 7, 13}));
    ExampleRunner.eq(69, 267, new TheCoffeeTimeDivTwo().find(15, new int[]{1, 2, 3, 4, 5, 6, 7, 14, 9, 12, 11}));
    ExampleRunner.eq(70, 285, new TheCoffeeTimeDivTwo().find(17, new int[]{2, 3, 7, 9, 13, 1, 5}));
    ExampleRunner.eq(71, 356, new TheCoffeeTimeDivTwo().find(19, new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18}));
    ExampleRunner.eq(72, 152324, new TheCoffeeTimeDivTwo().find(990, new int[]{1, 2, 3, 4, 10, 13, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 100, 101, 105, 112, 550, 551, 900, 901, 120, 121, 122, 129, 130, 888}));
    ExampleRunner.eq(73, 299, new TheCoffeeTimeDivTwo().find(20, new int[]{20, 19, 18, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17}));
    ExampleRunner.eq(74, 972, new TheCoffeeTimeDivTwo().find(47, new int[]{29, 46, 39, 5, 33, 35, 41, 22, 20, 31, 34, 6, 4, 24, 30, 28, 36, 11, 9, 8, 2, 43, 19, 27}));
    ExampleRunner.eq(75, 176, new TheCoffeeTimeDivTwo().find(12, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
    ExampleRunner.eq(76, 155544, new TheCoffeeTimeDivTwo().find(1000, new int[]{11, 12, 13, 7, 8, 9, 23, 53, 64, 65, 66, 67, 68, 32, 33, 37, 35, 343, 234, 235, 236, 238, 240, 242, 244, 873, 897, 674, 888, 889, 893, 833, 787, 973, 999, 1000}));
    ExampleRunner.eq(77, 314, new TheCoffeeTimeDivTwo().find(16, new int[]{5}));
    ExampleRunner.eq(78, 160, new TheCoffeeTimeDivTwo().find(10, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
  }
}

