package p400.srm477;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 22.12.10
 * Time: 12:01
 */
public class VacationTime {
  public int bestSchedule(int N, int K, int[] workingDays) {
    boolean map[] = new boolean[N + 1];
    for (int workingDay : workingDays) {
      map[workingDay] = true;
    }
    int min = Integer.MAX_VALUE;
    for (int i = 1; i <= N; i++) {
      if (i + K <= map.length) {
        int curMin = 0;
        for (int j = 0; j < K; j++) {
          if (map[j + i]) {
            curMin++;
          }
        }
        if (curMin < min) {
          min = curMin;
        }
      }

    }
    return min;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 1, new VacationTime().bestSchedule(3, 3, new int[]{2}));
    ExampleRunner.eq(2, 2, new VacationTime().bestSchedule(4, 3, new int[]{3, 1, 2}));
    ExampleRunner.eq(3, 1, new VacationTime().bestSchedule(5, 3, new int[]{4, 1}));
    ExampleRunner.eq(4, 0, new VacationTime().bestSchedule(9, 2, new int[]{7, 4, 5, 6, 2}));
    ExampleRunner.eq(5, 2, new VacationTime().bestSchedule(4, 4, new int[]{1, 3}));
    ExampleRunner.eq(6, 1, new VacationTime().bestSchedule(2, 2, new int[]{1}));
    ExampleRunner.eq(7, 0, new VacationTime().bestSchedule(5, 1, new int[]{3}));
    ExampleRunner.eq(8, 1, new VacationTime().bestSchedule(2, 2, new int[]{1}));
    ExampleRunner.eq(9, 0, new VacationTime().bestSchedule(5, 3, new int[]{4}));
    ExampleRunner.eq(10, 0, new VacationTime().bestSchedule(3, 1, new int[]{1, 2}));
    ExampleRunner.eq(11, 14, new VacationTime().bestSchedule(911, 526, new int[]{185, 565, 512, 425, 274, 367, 658, 722, 645, 684, 859, 888, 823, 380, 523, 352, 95, 376, 72, 302, 457, 92, 317, 637, 431}));
    ExampleRunner.eq(12, 9, new VacationTime().bestSchedule(551, 293, new int[]{108, 82, 51, 322, 16, 532, 180, 140, 363, 435, 478, 504, 484, 294, 274, 224, 7, 262, 193, 411, 513, 169}));
    ExampleRunner.eq(13, 0, new VacationTime().bestSchedule(143, 4, new int[]{114, 40, 20, 96, 14}));
    ExampleRunner.eq(14, 2, new VacationTime().bestSchedule(570, 276, new int[]{374, 106, 9, 89, 125, 231, 368, 219}));
    ExampleRunner.eq(15, 3, new VacationTime().bestSchedule(369, 121, new int[]{265, 260, 131, 173, 95, 108, 152, 117, 248, 227, 13, 256, 186}));
    ExampleRunner.eq(16, 2, new VacationTime().bestSchedule(987, 160, new int[]{479, 628, 522, 168, 436, 162, 350, 181, 493, 311, 619, 783, 913, 583, 325, 983, 242, 314, 127, 870, 435, 19, 612, 534, 239, 155, 969, 79, 949, 191, 356, 484, 199, 238, 702, 556, 908, 214, 222, 917, 582, 506, 854, 858, 302, 679}));
    ExampleRunner.eq(17, 1, new VacationTime().bestSchedule(601, 169, new int[]{458, 393, 371, 295, 74, 461, 472, 292, 220, 109, 48}));
    ExampleRunner.eq(18, 2, new VacationTime().bestSchedule(199, 65, new int[]{6, 87, 117, 65, 115, 44, 149, 11, 143, 29}));
    ExampleRunner.eq(19, 13, new VacationTime().bestSchedule(560, 510, new int[]{117, 266, 8, 272, 89, 337, 80, 262, 305, 63, 511, 205, 533, 306, 87}));
    ExampleRunner.eq(20, 6, new VacationTime().bestSchedule(318, 148, new int[]{196, 180, 139, 253, 172, 276, 79, 293, 84, 47, 306, 179, 175, 32, 18, 267, 52, 76}));
    ExampleRunner.eq(21, 12, new VacationTime().bestSchedule(558, 409, new int[]{23, 390, 95, 25, 21, 327, 43, 36, 312, 442, 485, 80, 333, 181, 435, 225, 291, 360, 428}));
    ExampleRunner.eq(22, 1, new VacationTime().bestSchedule(248, 81, new int[]{10, 104, 14, 39, 118, 16, 178, 8, 206, 150, 126}));
    ExampleRunner.eq(23, 1, new VacationTime().bestSchedule(315, 66, new int[]{233, 81, 105, 5, 288, 182, 108, 123, 23, 287, 194, 246, 111, 88, 272}));
    ExampleRunner.eq(24, 0, new VacationTime().bestSchedule(105, 6, new int[]{14, 59, 10, 98, 42, 4, 28, 1, 89, 61, 37, 3, 17, 82, 58}));
    ExampleRunner.eq(25, 13, new VacationTime().bestSchedule(368, 344, new int[]{145, 213, 296, 18, 363, 167, 16, 202, 34, 100, 239, 175, 171, 261, 221, 219}));
    ExampleRunner.eq(26, 14, new VacationTime().bestSchedule(720, 622, new int[]{582, 716, 75, 421, 687, 294, 555, 13, 113, 370, 402, 127, 312, 128, 429, 136, 11, 274}));
    ExampleRunner.eq(27, 8, new VacationTime().bestSchedule(619, 318, new int[]{152, 578, 158, 317, 111, 84, 174, 497, 556, 286, 10, 559, 293, 541, 466, 552, 561, 229, 362, 549, 190, 442, 207}));
    ExampleRunner.eq(28, 1, new VacationTime().bestSchedule(607, 551, new int[]{18, 215}));
    ExampleRunner.eq(29, 15, new VacationTime().bestSchedule(645, 414, new int[]{237, 614, 10, 438, 42, 314, 506, 473, 315, 4, 597, 89, 234, 526, 517, 428, 206, 532, 385, 81, 424, 197, 174, 367, 611, 510, 214, 395, 512}));
    ExampleRunner.eq(30, 7, new VacationTime().bestSchedule(813, 339, new int[]{396, 546, 312, 343, 139, 376, 583, 472, 238, 751, 393, 723, 14, 361, 793, 144, 683, 564, 627, 9, 500, 607, 105, 154, 750, 533}));
    ExampleRunner.eq(31, 4, new VacationTime().bestSchedule(661, 442, new int[]{368, 370, 573, 11, 25, 290, 149}));
    ExampleRunner.eq(32, 0, new VacationTime().bestSchedule(242, 190, new int[]{214}));
    ExampleRunner.eq(33, 26, new VacationTime().bestSchedule(609, 450, new int[]{174, 525, 75, 93, 608, 12, 261, 61, 102, 340, 597, 106, 207, 222, 243, 391, 141, 77, 56, 328, 566, 400, 218, 468, 214, 487, 551, 310, 536, 535, 320, 151, 54, 371, 572, 266, 107, 410, 533, 364}));
    ExampleRunner.eq(34, 7, new VacationTime().bestSchedule(582, 509, new int[]{104, 517, 543, 162, 473, 243, 318, 547, 467, 314}));
    ExampleRunner.eq(35, 0, new VacationTime().bestSchedule(383, 76, new int[]{27, 135, 309, 344, 238, 67, 261, 148, 242, 356, 275, 100, 127, 306, 161, 382, 6}));
    ExampleRunner.eq(36, 0, new VacationTime().bestSchedule(77, 19, new int[]{39, 43, 64, 6, 72, 68, 3}));
    ExampleRunner.eq(37, 4, new VacationTime().bestSchedule(437, 189, new int[]{247, 268, 106, 98, 215, 340, 230, 146, 102, 65, 127, 387, 360, 112, 66}));
    ExampleRunner.eq(38, 9, new VacationTime().bestSchedule(285, 153, new int[]{247, 210, 164, 113, 50, 97, 15, 144, 138, 216, 95, 184, 4, 194, 253, 23, 48, 62, 192}));
    ExampleRunner.eq(39, 0, new VacationTime().bestSchedule(448, 40, new int[]{124, 115, 207, 327, 215}));
    ExampleRunner.eq(40, 19, new VacationTime().bestSchedule(735, 400, new int[]{491, 390, 663, 555, 432, 480, 243, 470, 245, 418, 621, 78, 543, 201, 118, 402, 598, 496, 438, 716, 460, 685, 360, 26, 384, 337, 643, 713, 261, 57, 292, 97, 2, 188, 667, 361, 55, 723, 441, 155, 525, 520, 700}));
    ExampleRunner.eq(41, 17, new VacationTime().bestSchedule(968, 451, new int[]{264, 35, 396, 553, 296, 858, 870, 207, 797, 475, 373, 10, 411, 70, 180, 786, 133, 323, 531, 269, 776, 600, 830, 534, 81, 450, 132, 554, 123, 867, 221, 74, 179, 911, 771, 634, 488, 372, 585, 605, 300, 783, 596}));
    ExampleRunner.eq(42, 3, new VacationTime().bestSchedule(970, 848, new int[]{179, 538, 364}));
    ExampleRunner.eq(43, 11, new VacationTime().bestSchedule(628, 442, new int[]{440, 408, 479, 18, 569, 376, 583, 313, 208, 69, 72, 163, 135, 286, 192, 406}));
    ExampleRunner.eq(44, 0, new VacationTime().bestSchedule(391, 44, new int[]{339, 278, 180, 100, 203, 18, 85, 11, 282, 28, 213, 301, 247, 273, 101, 173, 86}));
    ExampleRunner.eq(45, 11, new VacationTime().bestSchedule(752, 707, new int[]{13, 7, 271, 304, 591, 742, 241, 308, 670, 84, 273, 550, 293, 609}));
    ExampleRunner.eq(46, 5, new VacationTime().bestSchedule(441, 246, new int[]{173, 260, 7, 203, 383, 397, 313, 380, 323, 55, 377, 128, 163}));
    ExampleRunner.eq(47, 6, new VacationTime().bestSchedule(813, 763, new int[]{765, 57, 175, 576, 610, 643, 621}));
    ExampleRunner.eq(48, 4, new VacationTime().bestSchedule(647, 259, new int[]{452, 439, 198, 36, 123, 644, 109, 167, 494, 441, 253, 193, 332, 272, 116, 271, 87, 86}));
    ExampleRunner.eq(49, 3, new VacationTime().bestSchedule(916, 193, new int[]{403, 556, 277, 100, 455, 905, 783, 67, 531, 861, 318, 54, 631, 130, 422, 241, 562, 846, 602, 463, 654, 179, 11, 358, 694, 233, 387, 150}));
    ExampleRunner.eq(50, 0, new VacationTime().bestSchedule(934, 459, new int[]{667}));
    ExampleRunner.eq(51, 0, new VacationTime().bestSchedule(480, 158, new int[]{33}));
    ExampleRunner.eq(52, 0, new VacationTime().bestSchedule(960, 63, new int[]{277, 640, 666, 837, 919, 256, 713, 559, 121, 302, 672, 23}));
    ExampleRunner.eq(53, 0, new VacationTime().bestSchedule(901, 149, new int[]{436, 286, 708, 141, 534, 75, 296, 375, 494, 658, 608, 339, 76, 236}));
    ExampleRunner.eq(54, 0, new VacationTime().bestSchedule(961, 249, new int[]{861, 834, 813, 407, 915}));
    ExampleRunner.eq(55, 6, new VacationTime().bestSchedule(816, 557, new int[]{125, 290, 267, 535, 538, 72, 707, 241, 399, 766}));
    ExampleRunner.eq(56, 4, new VacationTime().bestSchedule(842, 483, new int[]{523, 770, 398, 28, 777, 725, 257, 112, 141, 531}));
    ExampleRunner.eq(57, 7, new VacationTime().bestSchedule(196, 133, new int[]{187, 164, 120, 61, 153, 137, 67, 15, 75, 96, 4, 145}));
    ExampleRunner.eq(58, 43, new VacationTime().bestSchedule(714, 705, new int[]{49, 114, 309, 107, 123, 649, 438, 187, 507, 619, 400, 383, 659, 553, 281, 93, 220, 308, 697, 517, 257, 340, 283, 547, 30, 321, 491, 365, 620, 408, 137, 495, 392, 557, 617, 325, 353, 282, 109, 219, 183, 332, 501}));
    ExampleRunner.eq(59, 8, new VacationTime().bestSchedule(222, 80, new int[]{16, 70, 45, 205, 37, 184, 150, 76, 183, 5, 52, 104, 190, 88, 108, 118, 71, 195, 10, 83, 12, 120, 78, 135, 7, 147, 206, 84, 144, 48}));
    ExampleRunner.eq(60, 11, new VacationTime().bestSchedule(697, 416, new int[]{275, 369, 447, 362, 479, 341, 47, 582, 403, 188, 608, 10, 430, 211, 439, 472, 332, 655, 366, 325}));
    ExampleRunner.eq(61, 0, new VacationTime().bestSchedule(360, 8, new int[]{130, 339, 146, 127, 3, 227, 8, 179, 110, 188, 319, 224, 350, 173, 263, 288, 104, 343, 102, 9, 289, 118, 199, 222, 80, 49, 81, 308}));
    ExampleRunner.eq(62, 2, new VacationTime().bestSchedule(734, 349, new int[]{550, 465, 8, 109, 595, 426, 343}));
    ExampleRunner.eq(63, 0, new VacationTime().bestSchedule(31, 3, new int[]{7, 11, 29}));
    ExampleRunner.eq(64, 14, new VacationTime().bestSchedule(917, 878, new int[]{71, 458, 432, 754, 234, 687, 746, 631, 810, 248, 81, 753, 847, 240}));
    ExampleRunner.eq(65, 6, new VacationTime().bestSchedule(938, 216, new int[]{387, 390, 841, 147, 372, 812, 310, 809, 355, 307, 819, 761, 848, 622, 671, 505, 920, 132, 230, 391, 597, 226, 278, 820, 104, 595, 261, 514, 650, 476, 486, 917, 892, 267, 14, 492, 638, 795, 248, 96, 865, 83, 326, 610, 423}));
    ExampleRunner.eq(66, 6, new VacationTime().bestSchedule(425, 237, new int[]{137, 238, 23, 180, 412, 195, 39, 264, 203, 316, 12}));
    ExampleRunner.eq(67, 4, new VacationTime().bestSchedule(259, 153, new int[]{109, 127, 207, 122, 90, 26, 79}));
    ExampleRunner.eq(68, 0, new VacationTime().bestSchedule(530, 33, new int[]{447, 144, 260, 108, 352, 102, 350}));
    ExampleRunner.eq(69, 3, new VacationTime().bestSchedule(758, 550, new int[]{329, 526, 638, 496}));
    ExampleRunner.eq(70, 3, new VacationTime().bestSchedule(599, 409, new int[]{334, 336, 409}));
    ExampleRunner.eq(71, 2, new VacationTime().bestSchedule(468, 293, new int[]{236, 185}));
    ExampleRunner.eq(72, 0, new VacationTime().bestSchedule(655, 109, new int[]{51, 42, 31, 479, 268, 234, 420, 164, 203, 290, 602, 39, 302, 281, 293, 310, 269, 257}));
    ExampleRunner.eq(73, 1, new VacationTime().bestSchedule(894, 277, new int[]{132, 311, 476, 888, 131, 646}));
    ExampleRunner.eq(74, 0, new VacationTime().bestSchedule(511, 22, new int[]{139, 231, 199, 70, 270, 482, 18, 307, 256, 328, 202, 428, 303, 296, 90}));
    ExampleRunner.eq(75, 3, new VacationTime().bestSchedule(839, 705, new int[]{687, 346, 380}));
    ExampleRunner.eq(76, 1, new VacationTime().bestSchedule(1000, 436, new int[]{627, 392, 669, 468}));
    ExampleRunner.eq(77, 9, new VacationTime().bestSchedule(1000, 654, new int[]{130, 544, 63, 532, 188, 616, 843, 400, 423, 186, 591, 692, 771, 650}));
    ExampleRunner.eq(78, 6, new VacationTime().bestSchedule(1000, 409, new int[]{446, 558, 772, 796, 649, 249, 283, 233, 473, 982, 80, 799, 26, 943, 298, 296, 706, 605}));
    ExampleRunner.eq(79, 2, new VacationTime().bestSchedule(1000, 513, new int[]{808, 459, 792, 863, 715, 70, 336, 731}));
    ExampleRunner.eq(80, 5, new VacationTime().bestSchedule(1000, 315, new int[]{116, 635, 618, 441, 974, 883, 76, 168, 238, 359, 542, 344, 262, 716, 754, 133, 816, 4, 564, 157, 612, 54, 977, 47, 658, 178, 91, 142, 879}));
    ExampleRunner.eq(81, 0, new VacationTime().bestSchedule(10, 6, new int[]{2, 9}));
    ExampleRunner.eq(82, 13, new VacationTime().bestSchedule(1000, 361, new int[]{275, 551, 136, 93, 357, 685, 906, 715, 108, 991, 234, 708, 125, 62, 468, 718, 391, 409, 649, 580, 157, 174, 56, 300, 588, 758, 354, 542, 728, 533, 353, 829, 226, 430, 988, 217, 419, 489, 786, 396, 69, 250, 412, 471, 716, 949, 662, 22, 560, 548}));
    ExampleRunner.eq(83, 43, new VacationTime().bestSchedule(1000, 853, new int[]{194, 97, 613, 719, 133, 555, 918, 308, 550, 535, 516, 975, 349, 337, 35, 234, 163, 40, 122, 762, 148, 181, 605, 633, 954, 562, 870, 696, 524, 744, 212, 319, 645, 476, 266, 202, 657, 720, 671, 289, 128, 765, 530, 915, 463, 849, 13, 656, 499, 635}));
    ExampleRunner.eq(84, 43, new VacationTime().bestSchedule(1000, 932, new int[]{392, 959, 384, 233, 122, 71, 137, 547, 926, 251, 200, 361, 598, 762, 321, 919, 938, 455, 914, 205, 285, 813, 399, 254, 479, 974, 418, 312, 961, 40, 688, 983, 943, 226, 649, 773, 601, 324, 766, 356, 114, 788, 912, 836, 739, 993, 808, 850, 913, 267}));
    ExampleRunner.eq(85, 13, new VacationTime().bestSchedule(1000, 356, new int[]{261, 11, 397, 895, 975, 774, 378, 197, 687, 271, 500, 351, 559, 571, 521, 910, 482, 361, 734, 530, 515, 909, 174, 691, 534, 962, 603, 494, 765, 998, 633, 503, 154, 135, 879, 552, 186, 708, 290, 700, 472, 341, 717, 939, 630, 938, 219, 214, 735, 810}));
    ExampleRunner.eq(86, 2, new VacationTime().bestSchedule(1000, 513, new int[]{808, 459, 792, 863, 715, 70, 336, 731}));
    ExampleRunner.eq(87, 3, new VacationTime().bestSchedule(3, 3, new int[]{1, 2, 3}));
    ExampleRunner.eq(88, 1, new VacationTime().bestSchedule(945, 450, new int[]{2, 53, 88, 45, 3, 6, 89, 452, 753}));
    ExampleRunner.eq(89, 0, new VacationTime().bestSchedule(9, 2, new int[]{7, 4, 5, 6, 2}));
    ExampleRunner.eq(90, 6, new VacationTime().bestSchedule(1000, 1000, new int[]{1, 3, 5, 7, 9, 78}));
    ExampleRunner.eq(91, 1, new VacationTime().bestSchedule(1, 1, new int[]{1}));
    ExampleRunner.eq(92, 1, new VacationTime().bestSchedule(3, 3, new int[]{2}));
    ExampleRunner.eq(93, 0, new VacationTime().bestSchedule(4, 2, new int[]{2, 1}));
    ExampleRunner.eq(94, 1, new VacationTime().bestSchedule(3, 3, new int[]{3}));
    ExampleRunner.eq(95, 0, new VacationTime().bestSchedule(10, 5, new int[]{1, 2, 3, 4, 5}));
    ExampleRunner.eq(96, 2, new VacationTime().bestSchedule(200, 200, new int[]{1, 198}));
    ExampleRunner.eq(97, 0, new VacationTime().bestSchedule(2, 1, new int[]{2}));
    ExampleRunner.eq(98, 0, new VacationTime().bestSchedule(10, 5, new int[]{10}));
    ExampleRunner.eq(99, 1, new VacationTime().bestSchedule(3, 1, new int[]{3, 1, 2}));
    ExampleRunner.eq(100, 1, new VacationTime().bestSchedule(3, 1, new int[]{2, 3, 1}));
    ExampleRunner.eq(101, 0, new VacationTime().bestSchedule(3, 1, new int[]{1, 3}));
    ExampleRunner.eq(102, 0, new VacationTime().bestSchedule(4, 2, new int[]{3, 4}));
    ExampleRunner.eq(103, 0, new VacationTime().bestSchedule(5, 1, new int[]{5}));
    ExampleRunner.eq(104, 2, new VacationTime().bestSchedule(2, 2, new int[]{1, 2}));
    ExampleRunner.eq(105, 1, new VacationTime().bestSchedule(3, 2, new int[]{2}));
    ExampleRunner.eq(106, 1, new VacationTime().bestSchedule(5, 1, new int[]{1, 2, 3, 4, 5}));
    ExampleRunner.eq(107, 1, new VacationTime().bestSchedule(5, 3, new int[]{1, 2, 4}));
    ExampleRunner.eq(108, 0, new VacationTime().bestSchedule(6, 5, new int[]{6}));
    ExampleRunner.eq(109, 0, new VacationTime().bestSchedule(4, 3, new int[]{4}));
    ExampleRunner.eq(110, 1, new VacationTime().bestSchedule(5, 3, new int[]{1, 3, 5}));
    ExampleRunner.eq(111, 0, new VacationTime().bestSchedule(10, 4, new int[]{1, 2, 3, 4, 5, 10}));
    ExampleRunner.eq(112, 1, new VacationTime().bestSchedule(2, 2, new int[]{2}));
  }
}
