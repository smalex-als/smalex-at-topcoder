package p500.srm500;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 3/27/11
 * Time: 6:16 PM
 * with help
 */
public class MafiaGame {
  public double probabilityToLose(int N, int[] decisions) {
    int voting[] = new int[N];
    for (int decision : decisions) {
      voting[decision]++;
    }
    int maxVote = 0;
    for (int v : voting) {
      maxVote = Math.max(maxVote, v);
    }
    if (maxVote <= 1) {
      return 0.0;
    }
    int cnt = 0;
    for (int aVoting : voting) {
      if (aVoting == maxVote) {
        cnt++;
      }
    }
    double res = 1.0 / cnt;
    while (cnt > 1) {
      if (N % cnt == 0) {
        return 0.0;
      }
      cnt = N % cnt;
    }
    return res;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 1.0, new MafiaGame().probabilityToLose(3, new int[]{1, 1, 1}));
    ExampleRunner.eq(2, 0.0, new MafiaGame().probabilityToLose(20, new int[]{1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6}));
    ExampleRunner.eq(3, 1.0, new MafiaGame().probabilityToLose(500, new int[]{1, 2, 1}));
    ExampleRunner.eq(4, 0.0, new MafiaGame().probabilityToLose(5, new int[]{1, 2, 3}));
    ExampleRunner.eq(5, 0.0, new MafiaGame().probabilityToLose(20, new int[]{1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 18, 19, 0}));
    ExampleRunner.eq(6, 0.14285714285714285, new MafiaGame().probabilityToLose(23, new int[]{17, 10, 3, 14, 22, 5, 11, 10, 22, 3, 14, 5, 11, 17}));
    ExampleRunner.eq(7, 0.0, new MafiaGame().probabilityToLose(3, new int[]{2, 1}));
    ExampleRunner.eq(8, 0.0, new MafiaGame().probabilityToLose(4, new int[]{0, 1}));
    ExampleRunner.eq(9, 1.0, new MafiaGame().probabilityToLose(5, new int[]{4, 3, 3}));
    ExampleRunner.eq(10, 0.0, new MafiaGame().probabilityToLose(6, new int[]{4, 2, 5}));
    ExampleRunner.eq(11, 1.0, new MafiaGame().probabilityToLose(7, new int[]{5, 6, 6, 0}));
    ExampleRunner.eq(12, 1.0, new MafiaGame().probabilityToLose(8, new int[]{3, 3, 6, 3}));
    ExampleRunner.eq(13, 1.0, new MafiaGame().probabilityToLose(8, new int[]{4, 7, 4, 6, 1, 4, 6}));
    ExampleRunner.eq(14, 1.0, new MafiaGame().probabilityToLose(2, new int[]{1, 1}));
    ExampleRunner.eq(15, 1.0, new MafiaGame().probabilityToLose(9, new int[]{0, 2, 0, 6, 4, 8, 1, 7}));
    ExampleRunner.eq(16, 1.0, new MafiaGame().probabilityToLose(10, new int[]{4, 3, 1, 2, 3}));
    ExampleRunner.eq(17, 0.3333333333333333, new MafiaGame().probabilityToLose(10, new int[]{3, 4, 1, 1, 3, 8, 7, 4}));
    ExampleRunner.eq(18, 0.0, new MafiaGame().probabilityToLose(11, new int[]{3}));
    ExampleRunner.eq(19, 0.0, new MafiaGame().probabilityToLose(21, new int[]{18, 3}));
    ExampleRunner.eq(20, 0.0, new MafiaGame().probabilityToLose(31, new int[]{25, 12}));
    ExampleRunner.eq(21, 0.0, new MafiaGame().probabilityToLose(41, new int[]{24, 18, 40}));
    ExampleRunner.eq(22, 0.0, new MafiaGame().probabilityToLose(51, new int[]{25, 26, 5}));
    ExampleRunner.eq(23, 1.0, new MafiaGame().probabilityToLose(61, new int[]{12, 44, 33, 12}));
    ExampleRunner.eq(24, 0.0, new MafiaGame().probabilityToLose(71, new int[]{67, 23, 70, 40}));
    ExampleRunner.eq(25, 0.0, new MafiaGame().probabilityToLose(71, new int[]{20, 57, 55, 17, 14, 25, 3}));
    ExampleRunner.eq(26, 1.0, new MafiaGame().probabilityToLose(81, new int[]{12, 65, 27, 68, 27}));
    ExampleRunner.eq(27, 0.0, new MafiaGame().probabilityToLose(81, new int[]{28, 45, 14, 25, 5, 80, 64, 15}));
    ExampleRunner.eq(28, 0.0, new MafiaGame().probabilityToLose(91, new int[]{43, 56, 39, 77, 62}));
    ExampleRunner.eq(29, 0.0, new MafiaGame().probabilityToLose(91, new int[]{11, 80, 88, 70, 10, 84, 89, 83}));
    ExampleRunner.eq(30, 0.5, new MafiaGame().probabilityToLose(41, new int[]{31, 8, 37, 10, 21, 0, 19, 4, 28, 7, 38, 7, 4, 34, 13, 30, 1, 6, 18, 22, 10, 3, 39, 35, 13, 39, 3, 2, 8, 35, 26, 27, 29, 15, 8, 21, 0, 28, 37, 10}));
    ExampleRunner.eq(31, 1.0, new MafiaGame().probabilityToLose(42, new int[]{35, 5, 37, 14, 29, 24, 38, 40, 38, 10, 33, 20, 18, 41, 30, 17, 22, 17, 30, 41, 2, 15, 1, 9, 32, 32, 1, 8, 8, 16, 18, 39, 6, 15, 12, 40, 7, 30, 11, 25}));
    ExampleRunner.eq(32, 0.3333333333333333, new MafiaGame().probabilityToLose(43, new int[]{16, 31, 20, 4, 24, 37, 30, 15, 9, 37, 5, 13, 34, 38, 23, 11, 33, 5, 15, 36, 3, 3, 7, 37, 8, 31, 32, 0, 39, 15, 25, 22, 13, 17, 40, 24, 36, 39, 31, 0}));
    ExampleRunner.eq(33, 1.0, new MafiaGame().probabilityToLose(44, new int[]{12, 32, 38, 18, 32, 40, 14, 13, 9, 30, 25, 9, 12, 38, 14, 16, 10, 23, 18, 1, 38, 31, 15, 8, 16, 27, 10, 38, 28, 35, 0, 30, 6, 2, 43, 9, 37, 34, 40, 8}));
    ExampleRunner.eq(34, 0.0, new MafiaGame().probabilityToLose(44, new int[]{13, 10, 26, 39, 33, 23, 37, 8, 40, 13, 15, 20, 4, 2, 15, 29, 41, 36, 25, 21, 31, 11, 30, 25, 26, 33, 28, 10, 17, 41, 20, 0, 33, 42, 25, 29, 0, 1, 36, 4, 41, 39, 2}));
    ExampleRunner.eq(35, 1.0, new MafiaGame().probabilityToLose(45, new int[]{34, 16, 17, 40, 15, 28, 18, 29, 3, 34, 31, 37, 19, 4, 22, 21, 34, 13, 20, 12, 31, 26, 40, 8, 37, 35, 39, 24, 1, 41, 16, 26, 23, 38, 10, 0, 28, 12, 8, 32}));
    ExampleRunner.eq(36, 1.0, new MafiaGame().probabilityToLose(45, new int[]{20, 38, 36, 16, 28, 21, 37, 31, 4, 21, 17, 19, 1, 0, 20, 13, 26, 29, 14, 12, 24, 18, 44, 9, 35, 20, 39, 1, 33, 19, 32, 8, 23, 22, 5, 3, 11, 32, 25, 17, 4, 44, 39}));
    ExampleRunner.eq(37, 0.0, new MafiaGame().probabilityToLose(46, new int[]{32, 22, 38, 11, 11, 10, 35, 7, 20, 35, 17, 24, 15, 0, 34, 1, 20, 16, 3, 37, 18, 5, 29, 3, 25, 38, 29, 26, 43, 13, 45, 16, 25, 39, 1, 13, 28, 4, 18, 6}));
    ExampleRunner.eq(38, 1.0, new MafiaGame().probabilityToLose(46, new int[]{0, 34, 5, 34, 11, 16, 10, 6, 5, 13, 23, 0, 36, 21, 17, 38, 2, 32, 27, 4, 5, 9, 34, 28, 26, 36, 29, 18, 32, 7, 23, 0, 6, 36, 5, 14, 40, 9, 10, 40, 40, 19, 16}));
    ExampleRunner.eq(39, 1.0, new MafiaGame().probabilityToLose(47, new int[]{11, 35, 6, 11, 10, 20, 33, 33, 25, 2, 9, 14, 45, 40, 12, 36, 15, 43, 38, 40, 16, 29, 15, 24, 7, 43, 1, 42, 35, 45, 32, 1, 22, 12, 33, 19, 26, 3, 41, 39}));
    ExampleRunner.eq(40, 1.0, new MafiaGame().probabilityToLose(47, new int[]{25, 14, 2, 5, 30, 3, 11, 21, 41, 17, 0, 46, 35, 9, 25, 20, 0, 0, 23, 40, 21, 38, 32, 10, 35, 14, 8, 31, 9, 21, 30, 41, 7, 44, 34, 4, 20, 9, 22, 23, 9, 17, 45}));
    ExampleRunner.eq(41, 1.0, new MafiaGame().probabilityToLose(47, new int[]{28, 4, 19, 9, 9, 6, 40, 33, 18, 3, 7, 7, 27, 37, 23, 24, 30, 18, 24, 6, 26, 2, 18, 10, 21, 42, 12, 30, 27, 5, 25, 34, 19, 2, 22, 39, 18, 26, 9, 6, 22, 13, 14, 5, 19, 25}));
    ExampleRunner.eq(42, 1.0, new MafiaGame().probabilityToLose(48, new int[]{37, 15, 3, 17, 5, 14, 42, 14, 37, 7, 42, 22, 7, 45, 1, 14, 5, 38, 36, 25, 0, 25, 2, 36, 41, 12, 13, 33, 31, 39, 38, 38, 11, 13, 24, 38, 24, 11, 24, 1}));
    ExampleRunner.eq(43, 0.0, new MafiaGame().probabilityToLose(48, new int[]{8, 1, 11, 8, 2, 34, 9, 4, 32, 23, 17, 23, 24, 40, 29, 34, 9, 45, 22, 25, 9, 18, 27, 4, 12, 26, 47, 23, 8, 21, 16, 37, 39, 37, 15, 16, 12, 45, 29, 36, 25, 43, 35}));
    ExampleRunner.eq(44, 1.0, new MafiaGame().probabilityToLose(48, new int[]{21, 17, 40, 21, 38, 9, 29, 7, 43, 5, 40, 0, 33, 16, 15, 30, 28, 43, 4, 43, 18, 42, 10, 47, 39, 12, 23, 5, 7, 42, 11, 34, 43, 33, 0, 20, 6, 35, 33, 7, 32, 42, 16, 30, 5, 31}));
    ExampleRunner.eq(45, 0.5, new MafiaGame().probabilityToLose(49, new int[]{20, 9, 5, 28, 26, 11, 26, 31, 28, 30, 1, 34, 47, 4, 9, 5, 23, 42, 20, 16, 19, 23, 18, 19, 28, 45, 38, 46, 1, 13, 21, 6, 48, 3, 20, 11, 2, 17, 48, 36}));
    ExampleRunner.eq(46, 1.0, new MafiaGame().probabilityToLose(49, new int[]{19, 1, 28, 28, 32, 14, 30, 3, 44, 16, 3, 2, 26, 20, 23, 20, 14, 4, 43, 15, 14, 34, 4, 11, 5, 17, 42, 13, 19, 28, 7, 3, 33, 44, 31, 4, 2, 3, 19, 29, 27, 15, 21}));
    ExampleRunner.eq(47, 0.3333333333333333, new MafiaGame().probabilityToLose(49, new int[]{44, 10, 43, 43, 29, 4, 20, 33, 9, 39, 13, 9, 30, 18, 39, 28, 21, 32, 45, 33, 42, 4, 7, 27, 15, 41, 46, 20, 20, 7, 3, 13, 36, 35, 42, 16, 24, 37, 24, 17, 0, 32, 43, 4, 2, 5}));
    ExampleRunner.eq(48, 1.0, new MafiaGame().probabilityToLose(50, new int[]{25, 11, 37, 36, 40, 0, 12, 34, 43, 3, 16, 2, 8, 12, 33, 4, 3, 34, 3, 6, 48, 24, 17, 13, 9, 28, 0, 30, 18, 8, 0, 5, 11, 14, 3, 26, 43, 9, 2, 11}));
    ExampleRunner.eq(49, 1.0, new MafiaGame().probabilityToLose(50, new int[]{39, 48, 32, 3, 24, 20, 2, 23, 31, 19, 28, 9, 8, 19, 21, 3, 45, 31, 4, 42, 35, 13, 48, 39, 22, 38, 37, 10, 11, 34, 8, 11, 9, 43, 15, 19, 37, 19, 8, 0, 21, 14, 17}));
    ExampleRunner.eq(50, 1.0, new MafiaGame().probabilityToLose(50, new int[]{15, 5, 15, 30, 39, 12, 38, 32, 4, 35, 10, 34, 24, 30, 15, 1, 41, 15, 29, 10, 48, 23, 38, 27, 32, 6, 39, 13, 8, 41, 40, 23, 13, 28, 34, 28, 0, 21, 35, 24, 21, 33, 17, 3, 45, 18}));
    ExampleRunner.eq(51, 1.0, new MafiaGame().probabilityToLose(50, new int[]{25, 26, 29, 0, 48, 9, 43, 36, 30, 16, 49, 17, 28, 29, 14, 21, 5, 26, 16, 16, 26, 16, 37, 31, 14, 40, 36, 21, 12, 21, 14, 9, 15, 2, 23, 24, 41, 45, 12, 23, 31, 6, 18, 18, 2, 7, 7, 31, 12}));
    ExampleRunner.eq(52, 0.0, new MafiaGame().probabilityToLose(213, new int[]{131}));
    ExampleRunner.eq(53, 1.0, new MafiaGame().probabilityToLose(213, new int[]{101, 101}));
    ExampleRunner.eq(54, 1.0, new MafiaGame().probabilityToLose(213, new int[]{45, 65, 65}));
    ExampleRunner.eq(55, 1.0, new MafiaGame().probabilityToLose(213, new int[]{87, 87, 137, 87}));
    ExampleRunner.eq(56, 1.0, new MafiaGame().probabilityToLose(213, new int[]{88, 88, 70, 70, 70}));
    ExampleRunner.eq(57, 0.5, new MafiaGame().probabilityToLose(213, new int[]{24, 191, 24, 191, 134, 61}));
    ExampleRunner.eq(58, 0.5, new MafiaGame().probabilityToLose(213, new int[]{64, 186, 36, 36, 157, 149, 64}));
    ExampleRunner.eq(59, 0.0, new MafiaGame().probabilityToLose(213, new int[]{29, 29, 18, 208, 66, 208, 173, 66}));
    ExampleRunner.eq(60, 1.0, new MafiaGame().probabilityToLose(213, new int[]{175, 98, 175, 212, 82, 168, 165, 175, 80}));
    ExampleRunner.eq(61, 1.0, new MafiaGame().probabilityToLose(213, new int[]{71, 184, 10, 191, 71, 164, 27, 71, 164, 86}));
    ExampleRunner.eq(62, 0.0, new MafiaGame().probabilityToLose(213, new int[]{123, 40, 197, 45, 124, 36, 36, 197, 203, 124, 150}));
    ExampleRunner.eq(63, 0.5, new MafiaGame().probabilityToLose(213, new int[]{92, 46, 87, 207, 154, 27, 46, 117, 208, 96, 71, 92}));
    ExampleRunner.eq(64, 0.5, new MafiaGame().probabilityToLose(213, new int[]{42, 30, 101, 113, 41, 179, 113, 76, 69, 30, 18, 159, 36}));
    ExampleRunner.eq(65, 0.25, new MafiaGame().probabilityToLose(213, new int[]{23, 63, 18, 18, 149, 28, 23, 95, 15, 62, 56, 15, 209, 209}));
    ExampleRunner.eq(66, 0.0, new MafiaGame().probabilityToLose(213, new int[]{34, 76, 95, 177, 101, 65, 120, 191, 18, 34, 93, 168, 191, 108, 95}));
    ExampleRunner.eq(67, 0.0, new MafiaGame().probabilityToLose(213, new int[]{29, 69, 40, 107, 161, 91, 128, 91, 118, 168, 44, 168, 4, 42, 128, 204}));
    ExampleRunner.eq(68, 1.0, new MafiaGame().probabilityToLose(213, new int[]{211, 27, 178, 72, 36, 142, 184, 191, 1, 62, 36, 51, 153, 86, 147, 21, 140}));
    ExampleRunner.eq(69, 0.5, new MafiaGame().probabilityToLose(213, new int[]{51, 197, 202, 163, 49, 30, 42, 148, 8, 22, 8, 67, 67, 176, 82, 43, 169, 93}));
    ExampleRunner.eq(70, 0.0, new MafiaGame().probabilityToLose(213, new int[]{57, 146, 164, 139, 52, 96, 132, 61, 195, 113, 143, 57, 96, 59, 143, 104, 124, 11, 193}));
    ExampleRunner.eq(71, 0.0, new MafiaGame().probabilityToLose(213, new int[]{27, 195, 61, 99, 63, 180, 47, 66, 41, 193, 31, 174, 193, 27, 61, 128, 96, 41, 174, 169}));
    ExampleRunner.eq(72, 0.0, new MafiaGame().probabilityToLose(213, new int[]{147, 136, 198, 96, 154, 37, 128, 195, 55, 140, 94, 198, 171, 37, 176, 69, 114, 153, 178, 69, 188}));
    ExampleRunner.eq(73, 0.0, new MafiaGame().probabilityToLose(213, new int[]{186, 99, 199, 98, 68, 99, 170, 74, 75, 186, 18, 29, 26, 185, 120, 140, 101, 98, 18, 68, 192, 19}));
    ExampleRunner.eq(74, 0.0, new MafiaGame().probabilityToLose(213, new int[]{138, 143, 47, 185, 152, 53, 44, 184, 10, 152, 82, 97, 184, 176, 134, 191, 82, 13, 124, 13, 62, 134, 185}));
    ExampleRunner.eq(75, 0.0, new MafiaGame().probabilityToLose(213, new int[]{20, 13, 120, 51, 193, 4, 195, 80, 70, 162, 41, 207, 207, 13, 128, 22, 41, 4, 211, 150, 132, 160, 211, 56}));
    ExampleRunner.eq(76, 0.0, new MafiaGame().probabilityToLose(213, new int[]{7, 149, 76, 43, 7, 160, 76, 64, 118, 179, 3, 166, 134, 118, 133, 98, 95, 142, 138, 107, 128, 45, 91, 134, 128}));
    ExampleRunner.eq(77, 0.0, new MafiaGame().probabilityToLose(497, new int[]{39}));
    ExampleRunner.eq(78, 0.5, new MafiaGame().probabilityToLose(497, new int[]{295, 485, 35, 342, 295, 342, 115, 473}));
    ExampleRunner.eq(79, 0.3333333333333333, new MafiaGame().probabilityToLose(497, new int[]{199, 444, 199, 154, 391, 41, 345, 46, 51, 414, 55, 428, 97, 345, 428}));
    ExampleRunner.eq(80, 0.2, new MafiaGame().probabilityToLose(497, new int[]{13, 343, 27, 256, 125, 125, 293, 438, 494, 13, 50, 4, 160, 4, 488, 44, 448, 25, 160, 186, 118, 27}));
    ExampleRunner.eq(81, 0.0, new MafiaGame().probabilityToLose(491, new int[]{111}));
    ExampleRunner.eq(82, 1.0, new MafiaGame().probabilityToLose(491, new int[]{193, 57, 57, 128}));
    ExampleRunner.eq(83, 1.0, new MafiaGame().probabilityToLose(491, new int[]{238, 238, 313, 300, 129, 238, 189}));
    ExampleRunner.eq(84, 1.0, new MafiaGame().probabilityToLose(491, new int[]{174, 92, 391, 243, 448, 224, 448, 391, 174, 391}));
    ExampleRunner.eq(85, 1.0, new MafiaGame().probabilityToLose(491, new int[]{30, 51, 251, 44, 28, 356, 425, 330, 425, 425, 117, 51, 286}));
    ExampleRunner.eq(86, 0.16666666666666666, new MafiaGame().probabilityToLose(491, new int[]{17, 87, 280, 245, 44, 280, 396, 160, 17, 160, 35, 68, 35, 340, 87, 340}));
    ExampleRunner.eq(87, 0.25, new MafiaGame().probabilityToLose(491, new int[]{465, 100, 390, 210, 307, 227, 470, 30, 355, 227, 465, 71, 47, 307, 65, 108, 363, 30, 281}));
    ExampleRunner.eq(88, 0.16666666666666666, new MafiaGame().probabilityToLose(491, new int[]{196, 478, 50, 50, 79, 245, 145, 358, 408, 145, 349, 258, 327, 275, 472, 408, 245, 318, 419, 327, 196, 228}));
    ExampleRunner.eq(89, 0.14285714285714285, new MafiaGame().probabilityToLose(491, new int[]{293, 449, 287, 224, 134, 419, 261, 449, 31, 287, 115, 437, 39, 270, 87, 115, 164, 178, 50, 261, 474, 87, 331, 39, 331}));
    ExampleRunner.eq(90, 0.0, new MafiaGame().probabilityToLose(500, new int[]{394}));
    ExampleRunner.eq(91, 0.0, new MafiaGame().probabilityToLose(500, new int[]{43, 355, 236, 188, 280, 24, 245, 236, 43}));
    ExampleRunner.eq(92, 0.0, new MafiaGame().probabilityToLose(500, new int[]{113, 309, 374, 341, 312, 447, 447, 164, 17, 164, 17, 37, 416, 184, 238, 121, 292}));
    ExampleRunner.eq(93, 0.0, new MafiaGame().probabilityToLose(500, new int[]{124, 56, 8, 99, 21, 421, 167, 368, 355, 248, 163, 8, 71, 88, 270, 234, 56, 495, 46, 234, 137, 38, 158, 158, 21}));
    ExampleRunner.eq(94, 1.0, new MafiaGame().probabilityToLose(348, new int[]{66, 327, 230, 263, 180, 180, 245, 263, 178, 263}));
    ExampleRunner.eq(95, 0.2, new MafiaGame().probabilityToLose(309, new int[]{62, 241, 199, 94, 291, 212, 64, 17, 75, 138, 158, 138, 201, 254, 62, 27, 48, 262, 158, 28, 76, 262, 28, 10}));
    ExampleRunner.eq(96, 0.5, new MafiaGame().probabilityToLose(187, new int[]{144, 160, 38, 139, 136, 22, 101, 46, 38, 15, 137, 69, 169, 179, 87, 153, 101}));
    ExampleRunner.eq(97, 0.0, new MafiaGame().probabilityToLose(178, new int[]{42, 76, 31, 145, 7, 76, 42, 6, 7, 58, 6}));
    ExampleRunner.eq(98, 0.3333333333333333, new MafiaGame().probabilityToLose(313, new int[]{278, 120, 179, 74, 138, 177, 269, 217, 178, 200, 179, 177, 23, 307, 227, 256, 227, 125, 225}));
    ExampleRunner.eq(99, 0.0, new MafiaGame().probabilityToLose(306, new int[]{142, 24}));
    ExampleRunner.eq(100, 1.0, new MafiaGame().probabilityToLose(294, new int[]{261, 261, 27, 232, 168, 269, 59}));
    ExampleRunner.eq(101, 0.0, new MafiaGame().probabilityToLose(448, new int[]{203, 193, 258, 77, 38, 189, 11, 45, 321, 232, 321, 444, 418, 242, 199, 31, 149, 203, 262, 258, 199, 444, 220, 56, 242}));
    ExampleRunner.eq(102, 0.0, new MafiaGame().probabilityToLose(342, new int[]{214, 58, 76, 52, 244, 160, 199, 293, 244, 238, 28, 52, 277, 287, 89, 172, 129}));
    ExampleRunner.eq(103, 0.2, new MafiaGame().probabilityToLose(291, new int[]{135, 244, 56, 56, 259, 241, 79, 184, 154, 150, 273, 196, 2, 12, 246, 241, 184, 150, 77, 189, 157, 196}));
    ExampleRunner.eq(104, 0.3333333333333333, new MafiaGame().probabilityToLose(22, new int[]{1, 2, 3, 1, 2, 3}));
    ExampleRunner.eq(105, 0.05, new MafiaGame().probabilityToLose(367, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}));
    ExampleRunner.eq(106, 1.0, new MafiaGame().probabilityToLose(3, new int[]{1, 1, 1}));
    ExampleRunner.eq(107, 0.0, new MafiaGame().probabilityToLose(500, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49}));
    ExampleRunner.eq(108, 0.0, new MafiaGame().probabilityToLose(10, new int[]{1}));
    ExampleRunner.eq(109, 0.0, new MafiaGame().probabilityToLose(500, new int[]{499}));
    ExampleRunner.eq(110, 0.0, new MafiaGame().probabilityToLose(120, new int[]{1, 3, 5, 6, 9}));
    ExampleRunner.eq(111, 0.0, new MafiaGame().probabilityToLose(500, new int[]{1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 8, 9, 10, 13, 14, 15, 17, 17, 17, 17, 17, 18, 22, 24, 24, 25, 105, 150, 150, 150, 150, 150, 493, 493, 493, 493, 493}));
    ExampleRunner.eq(112, 0.0, new MafiaGame().probabilityToLose(500, new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14}));
    ExampleRunner.eq(113, 0.5, new MafiaGame().probabilityToLose(5, new int[]{0, 1, 0, 1}));
    ExampleRunner.eq(114, 0.25, new MafiaGame().probabilityToLose(11, new int[]{0, 0, 1, 1, 2, 2, 3, 3}));
    ExampleRunner.eq(115, 1.0, new MafiaGame().probabilityToLose(10, new int[]{9, 9, 8}));
    ExampleRunner.eq(116, 0.0, new MafiaGame().probabilityToLose(500, new int[]{1, 1, 1, 222, 222, 222, 499, 499, 499}));
    ExampleRunner.eq(117, 0.14285714285714285, new MafiaGame().probabilityToLose(23, new int[]{17, 10, 3, 14, 22, 5, 11, 10, 22, 3, 14, 5, 11, 17}));
    ExampleRunner.eq(118, 0.04, new MafiaGame().probabilityToLose(497, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24}));
    ExampleRunner.eq(119, 0.0, new MafiaGame().probabilityToLose(2, new int[]{1}));
    ExampleRunner.eq(120, 0.3333333333333333, new MafiaGame().probabilityToLose(10, new int[]{0, 1, 2, 0, 1, 2}));
    ExampleRunner.eq(121, 0.0, new MafiaGame().probabilityToLose(2, new int[]{0, 1}));
    ExampleRunner.eq(122, 0.5, new MafiaGame().probabilityToLose(5, new int[]{0, 0, 1, 1}));
    ExampleRunner.eq(123, 0.0, new MafiaGame().probabilityToLose(500, new int[]{20, 30, 5, 4, 4, 4, 4, 31, 23, 22, 2, 2, 2, 2, 43}));
    ExampleRunner.eq(124, 0.0, new MafiaGame().probabilityToLose(20, new int[]{1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 18, 19, 0}));
    ExampleRunner.eq(125, 0.5, new MafiaGame().probabilityToLose(5, new int[]{1, 1, 2, 2, 3}));
    ExampleRunner.eq(126, 1.0, new MafiaGame().probabilityToLose(2, new int[]{0, 0}));
    ExampleRunner.eq(127, 0.0, new MafiaGame().probabilityToLose(500, new int[]{1}));
    ExampleRunner.eq(128, 0.0, new MafiaGame().probabilityToLose(21, new int[]{1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}));
    ExampleRunner.eq(129, 0.3333333333333333, new MafiaGame().probabilityToLose(10, new int[]{1, 1, 2, 2, 3, 3}));
    ExampleRunner.eq(130, 0.0, new MafiaGame().probabilityToLose(500, new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15}));
    ExampleRunner.eq(131, 1.0, new MafiaGame().probabilityToLose(10, new int[]{1, 2, 2}));
    ExampleRunner.eq(132, 0.5, new MafiaGame().probabilityToLose(7, new int[]{1, 1, 2, 2, 3}));
    ExampleRunner.eq(133, 0.0, new MafiaGame().probabilityToLose(50, new int[]{1}));
    ExampleRunner.eq(134, 0.3333333333333333, new MafiaGame().probabilityToLose(16, new int[]{10, 15, 0, 13, 10, 9, 4, 11, 0, 6, 1, 13, 2, 5, 8, 12}));
    ExampleRunner.eq(135, 1.0, new MafiaGame().probabilityToLose(500, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 55, 234, 432, 333, 444, 56, 64}));
    ExampleRunner.eq(136, 0.3333333333333333, new MafiaGame().probabilityToLose(10, new int[]{0, 1, 2, 0, 1, 2, 3, 4}));
    ExampleRunner.eq(137, 0.0, new MafiaGame().probabilityToLose(480, new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3}));
    ExampleRunner.eq(138, 0.0, new MafiaGame().probabilityToLose(293, new int[]{102, 262, 241, 218, 51, 251, 208, 150, 89, 4, 26, 106, 43, 48, 289, 130, 34, 1, 2, 110, 155, 167, 176, 177}));
    ExampleRunner.eq(139, 0.0, new MafiaGame().probabilityToLose(4, new int[]{0, 0, 1, 1}));
    ExampleRunner.eq(140, 1.0, new MafiaGame().probabilityToLose(30, new int[]{0, 1, 0, 2}));
    ExampleRunner.eq(141, 0.5, new MafiaGame().probabilityToLose(17, new int[]{0, 0, 1, 1}));
    ExampleRunner.eq(142, 0.5, new MafiaGame().probabilityToLose(9, new int[]{1, 1, 1, 2, 2, 2, 0}));
    ExampleRunner.eq(143, 0.0, new MafiaGame().probabilityToLose(7, new int[]{1}));
    ExampleRunner.eq(144, 0.0, new MafiaGame().probabilityToLose(78, new int[]{45}));
    ExampleRunner.eq(145, 0.0, new MafiaGame().probabilityToLose(9, new int[]{3, 3, 3, 2, 2, 2, 1, 1, 1}));
    ExampleRunner.eq(146, 0.0, new MafiaGame().probabilityToLose(500, new int[]{1, 1, 384, 348, 394, 281, 483, 283, 438, 28, 283}));
    ExampleRunner.eq(147, 0.5, new MafiaGame().probabilityToLose(5, new int[]{0, 0, 1, 2, 1}));
    ExampleRunner.eq(148, 0.0, new MafiaGame().probabilityToLose(5, new int[]{1}));
    ExampleRunner.eq(149, 0.5, new MafiaGame().probabilityToLose(7, new int[]{3, 3, 3, 1, 1, 1, 2}));
    ExampleRunner.eq(150, 0.2, new MafiaGame().probabilityToLose(19, new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4}));
    ExampleRunner.eq(151, 1.0, new MafiaGame().probabilityToLose(4, new int[]{0, 0}));
    ExampleRunner.eq(152, 1.0, new MafiaGame().probabilityToLose(100, new int[]{1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3}));
    ExampleRunner.eq(153, 0.0, new MafiaGame().probabilityToLose(20, new int[]{1}));
    ExampleRunner.eq(154, 0.0, new MafiaGame().probabilityToLose(2, new int[]{0}));
    ExampleRunner.eq(155, 0.0, new MafiaGame().probabilityToLose(6, new int[]{0, 0, 1, 1, 2}));
    ExampleRunner.eq(156, 0.0, new MafiaGame().probabilityToLose(500, new int[]{0, 0, 1, 2, 3, 1}));
    ExampleRunner.eq(157, 0.0, new MafiaGame().probabilityToLose(21, new int[]{1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7}));
  }
}
