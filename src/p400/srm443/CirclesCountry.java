package p400.srm443;

import utils.ExampleRunner;

/**
 * Created by smalex on 28/05/15.
 */
public class CirclesCountry {
  public int leastBorders(int[] X, int[] Y, int[] R, int x1, int y1, int x2, int y2) {
    int cnt = 0;
    for (int i = 0; i < X.length; i++) {
      if (inCircle(X[i], Y[i], R[i], x1, y1) != inCircle(X[i], Y[i], R[i], x2, y2)) {
        cnt++;
      }
    }
    return cnt;
  }

  public boolean inCircle(int Xc, int Yc, int r, int x, int y) {
    return (x - Xc) * (x - Xc) + (y - Yc) * (y - Yc) < r * r;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(101, 21, new CirclesCountry().leastBorders(new int[]{-223, -247, -384, -157, -329, -152, -397, -251, -239, -255, -396, 220, 290, -317, -332, -259, -254, -333, 364, -380, -248, -244, -380, 295, -223, -5, 303, -174, 301, -248, -228, 93, -247, -251, 32, -370, -6, 27, -248, -197, -276, 290, 276, -326, -204, -362, -249, -254, 38}, new int[]{127, 202, 0, 358, 49, 359, -7, 203, 135, 193, -5, 526, -653, 114, 46, 177, 194, 45, -622, 22, 203, 198, 16, -649, 143, 153, -644, 206, -641, 202, 182, 356, 196, 199, 156, 55, 152, 155, 203, 151, 132, -643, -682, 60, 241, 59, 203, 191, 178}, new int[]{376, 30, 720, 58, 594, 51, 748, 41, 345, 123, 744, 15, 96, 517, 600, 142, 120, 602, 13, 688, 35, 12, 703, 42, 411, 90, 79, 17, 21, 32, 85, 14, 23, 114, 46, 652, 92, 56, 34, 288, 468, 62, 131, 577, 13, 643, 37, 57, 14}, -391, -2, 364, -626));
    ExampleRunner.eq(102, 0, new CirclesCountry().leastBorders(new int[]{-18, -231, -13, -21, -170, 1, 242, -102, -160, -196, 2, 240, 49, 245, -208, 219, 3, -69, -108, -24, -130, 29, -220, -186, -470, 388, -108, -119, -132, -5, -127, -230, -195, -107, 79, -188, -108, 401, -498, 203, -224, 171, -174, -128, -49, -109, -7, 421, -106}, new int[]{602, 375, 585, 595, 366, 608, -621, 681, 414, 300, 621, -683, 761, 838, 400, 486, 623, 593, 680, 593, 578, 618, 571, 361, -684, 595, 678, 590, 576, 603, 583, 375, 300, 684, 423, 359, 586, 514, -693, 486, 375, 606, 367, 581, 693, 677, 601, 948, 685}, new int[]{64, 598, 12, 74, 716, 41, 32, 22, 468, 799, 11, 107, 17, 34, 535, 28, 14, 131, 30, 79, 201, 11, 295, 733, 86, 28, 34, 183, 204, 49, 194, 596, 797, 13, 19, 736, 171, 15, 125, 71, 585, 51, 678, 197, 24, 36, 52, 65, 11}, 249, 833, 240, 838));
    ExampleRunner.eq(103, 3, new CirclesCountry().leastBorders(new int[]{1, -3, 2, 5, -4, 12, 12}, new int[]{1, -1, 2, 5, 5, 1, 1}, new int[]{8, 1, 2, 1, 1, 1, 2}, -5, 1, 12, 1));
    ExampleRunner.eq(104, 1, new CirclesCountry().leastBorders(new int[]{0, 5}, new int[]{0, 5}, new int[]{20, 1}, 0, 0, 5, 5));
    ExampleRunner.eq(105, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{100}, 25, 25, 30, 30));
    ExampleRunner.eq(106, 3, new CirclesCountry().leastBorders(new int[]{-107, -38, 140, 148, -198, 172, -179, 148, 176, 153, -56, -187}, new int[]{175, -115, 23, -2, -49, -151, -52, 42, 0, 68, 109, -174}, new int[]{135, 42, 70, 39, 89, 39, 43, 150, 10, 120, 16, 8}, 102, 16, 19, -108));
    ExampleRunner.eq(107, 2, new CirclesCountry().leastBorders(new int[]{0, -6, 6}, new int[]{0, 1, 2}, new int[]{2, 2, 2}, -5, 1, 5, 1));
    ExampleRunner.eq(108, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{10}, 0, 0, 0, 0));
    ExampleRunner.eq(109, 0, new CirclesCountry().leastBorders(new int[]{2}, new int[]{0}, new int[]{100}, 0, 0, 4, 0));
    ExampleRunner.eq(110, 2, new CirclesCountry().leastBorders(new int[]{0, 0, 3}, new int[]{0, 0, 0}, new int[]{1, 10, 1}, 0, 0, 3, 0));
    ExampleRunner.eq(111, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{5}, 0, 1, 0, 2));
    ExampleRunner.eq(112, 1, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{2, 6}, 0, 0, 0, 3));
    ExampleRunner.eq(113, 2, new CirclesCountry().leastBorders(new int[]{0, -1, 2}, new int[]{0, 1, 1}, new int[]{10, 1, 1}, -1, 1, 2, 1));
    ExampleRunner.eq(114, 3, new CirclesCountry().leastBorders(new int[]{1, -3, 2, 5, -4, 12, 12, 0}, new int[]{1, -1, 2, 5, 5, 1, 1, 0}, new int[]{8, 1, 2, 1, 1, 1, 2, 1000}, -5, 1, 12, 1));
    ExampleRunner.eq(115, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{10}, 1, 1, 2, 2));
    ExampleRunner.eq(116, 0, new CirclesCountry().leastBorders(new int[]{0, -6, 6}, new int[]{0, 1, 2}, new int[]{2, 2, 2}, 5, 1, 5, 1));
    ExampleRunner.eq(117, 0, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{10, 15}, 1, 1, 2, 2));
    ExampleRunner.eq(118, 0, new CirclesCountry().leastBorders(new int[]{3}, new int[]{3}, new int[]{3}, 2, 3, 4, 3));
    ExampleRunner.eq(119, 0, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{5, 10}, 0, 0, 4, 0));
    ExampleRunner.eq(120, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{100}, -1, 0, 1, 0));
    ExampleRunner.eq(121, 2, new CirclesCountry().leastBorders(new int[]{0, -10, 10}, new int[]{0, 0, 0}, new int[]{100, 5, 5}, -10, 0, 10, 0));
    ExampleRunner.eq(122, 1, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{2, 4}, 1, 0, 3, 0));
    ExampleRunner.eq(123, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{10}, -5, 0, 5, 0));
    ExampleRunner.eq(124, 2, new CirclesCountry().leastBorders(new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{5, 10, 15}, 0, 0, 11, 0));
    ExampleRunner.eq(125, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{10}, 0, 0, 1, 1));
    ExampleRunner.eq(126, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{100}, 0, 1, 0, 2));
    ExampleRunner.eq(127, 2, new CirclesCountry().leastBorders(new int[]{0, 999, 0, -12, 0, 500, -12}, new int[]{0, 999, 0, 0, 300, 31, 0}, new int[]{599, 10, 998, 50, 33, 2, 47}, -61, 1, 499, 30));
    ExampleRunner.eq(128, 1, new CirclesCountry().leastBorders(new int[]{0, -2, -2}, new int[]{0, 2, -2}, new int[]{100, 1, 1}, -2, -2, 1, 1));
    ExampleRunner.eq(129, 1, new CirclesCountry().leastBorders(new int[]{1, -3, 2, 5, -4, 12, 12}, new int[]{1, -1, 2, 5, 5, 1, 1}, new int[]{8, 1, 2, 1, 1, 1, 2}, -5, 1, 1, 1));
    ExampleRunner.eq(130, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{200}, 0, 1, 0, -1));
    ExampleRunner.eq(131, 0, new CirclesCountry().leastBorders(new int[]{0, 1}, new int[]{0, 1}, new int[]{2, 800}, -5, 1, 5, 1));
    ExampleRunner.eq(132, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{10}, 1, 1, 2, 1));
    ExampleRunner.eq(133, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{10}, 0, 1, 1, 0));
    ExampleRunner.eq(134, 3, new CirclesCountry().leastBorders(new int[]{-107, -38, 140, 148, -198, 172, -179, 148, 176, 153, -56, -187, 0}, new int[]{175, -115, 23, -2, -49, -151, -52, 42, 0, 68, 109, -174, 0}, new int[]{135, 42, 70, 39, 89, 39, 43, 150, 10, 120, 16, 8, 1000}, 102, 16, 19, -108));
    ExampleRunner.eq(135, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{50}, 1, 1, 2, 2));
    ExampleRunner.eq(136, 0, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{4, 5}, 0, 0, 0, 1));
    ExampleRunner.eq(137, 2, new CirclesCountry().leastBorders(new int[]{0, 5, -5}, new int[]{0, 0, 0}, new int[]{20, 1, 1}, 5, 0, -5, 0));
    ExampleRunner.eq(138, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{5}, 3, 0, 4, 0));
    ExampleRunner.eq(139, 4, new CirclesCountry().leastBorders(new int[]{0, 0, 15, 15, 7, 7, 7, 0, 0}, new int[]{0, 0, 0, 0, 0, 9, -9, 0, 0}, new int[]{1, 2, 1, 2, 4, 4, 4, 200, 1000}, 0, 0, 15, 0));
    ExampleRunner.eq(140, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{10}, -1, 0, 1, 0));
    ExampleRunner.eq(141, 2, new CirclesCountry().leastBorders(new int[]{0, -6, 6, 0}, new int[]{0, 1, 2, 0}, new int[]{2, 2, 2, 100}, -5, 1, 5, 1));
    ExampleRunner.eq(142, 0, new CirclesCountry().leastBorders(new int[]{1}, new int[]{1}, new int[]{100}, 1, 1, 1, 2));
    ExampleRunner.eq(143, 1, new CirclesCountry().leastBorders(new int[]{8, 6, 3}, new int[]{3, 5, 8}, new int[]{5, 100, 1000}, 12, 16, 100, 100));
    ExampleRunner.eq(144, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{2}, -1, 0, 1, 0));
    ExampleRunner.eq(145, 2, new CirclesCountry().leastBorders(new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{2, 4, 10}, 0, 0, 0, 5));
    ExampleRunner.eq(146, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{100}, 1, 1, 5, 5));
    ExampleRunner.eq(147, 3, new CirclesCountry().leastBorders(new int[]{2, 2, 2, 15}, new int[]{2, 2, 2, 2}, new int[]{1, 10, 50, 1}, 2, 2, 15, 2));
    ExampleRunner.eq(148, 1, new CirclesCountry().leastBorders(new int[]{0, 1, 2}, new int[]{0, 0, 0}, new int[]{5, 3, 1}, 0, 0, 2, 0));
    ExampleRunner.eq(149, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{100}, 1, 1, -1, -1));
    ExampleRunner.eq(150, 1, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{1, 3}, 0, 0, 0, 2));
    ExampleRunner.eq(151, 2, new CirclesCountry().leastBorders(new int[]{0, 0, 0, 0}, new int[]{0, 0, 10, -10}, new int[]{1000, 500, 2, 2}, 0, 9, 0, -9));
    ExampleRunner.eq(152, 8, new CirclesCountry().leastBorders(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49}, -28, 0, 12, 0));
    ExampleRunner.eq(153, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{10}, 1, 1, 1, -1));
    ExampleRunner.eq(154, 0, new CirclesCountry().leastBorders(new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{2, 3, 4, 5}, -1, 0, 1, 0));
    ExampleRunner.eq(155, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{2}, 0, 0, 1, 1));
    ExampleRunner.eq(156, 2, new CirclesCountry().leastBorders(new int[]{1, 1, 1, 4}, new int[]{1, 1, 1, 1}, new int[]{100, 5, 1, 1}, 4, 1, 1, 1));
    ExampleRunner.eq(157, 0, new CirclesCountry().leastBorders(new int[]{-3, 2, 2, 0, -4, 12, 12, 12}, new int[]{-1, 2, 3, 1, 5, 1, 1, 1}, new int[]{1, 3, 1, 7, 1, 1, 2, 3}, 2, 3, 2, 3));
    ExampleRunner.eq(158, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{2}, 1, 0, -1, 0));
    ExampleRunner.eq(159, 1, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{2, 10}, 1, 1, 3, 3));
    ExampleRunner.eq(160, 1, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{10, 100}, 0, 0, 50, 0));
    ExampleRunner.eq(161, 2, new CirclesCountry().leastBorders(new int[]{0, 6, 3, 3}, new int[]{0, 0, 0, 0}, new int[]{2, 2, 10, 25}, 0, 0, 6, 0));
    ExampleRunner.eq(162, 0, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{10, 9}, 1, -1, 1, 1));
    ExampleRunner.eq(163, 0, new CirclesCountry().leastBorders(new int[]{2}, new int[]{2}, new int[]{2}, 1, 2, 3, 2));
    ExampleRunner.eq(164, 0, new CirclesCountry().leastBorders(new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{4, 6, 8}, -1, 0, 1, 0));
    ExampleRunner.eq(165, 0, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{5, 10}, 0, 0, 1, 1));
    ExampleRunner.eq(166, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{4}, 1, 0, 0, 1));
    ExampleRunner.eq(167, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{100}, 0, 0, 1, 1));
    ExampleRunner.eq(168, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{5}, 0, 0, 1, 0));
    ExampleRunner.eq(169, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{5}, 1, 1, 2, 2));
    ExampleRunner.eq(170, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{1000}, -1, 0, 1, 0));
    ExampleRunner.eq(171, 1, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{10, 1000}, 1, 1, 50, 50));
    ExampleRunner.eq(172, 2, new CirclesCountry().leastBorders(new int[]{0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74}, new int[]{0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 0, 0, 74, 74));
    ExampleRunner.eq(173, 2, new CirclesCountry().leastBorders(new int[]{1, 1, 1, 4}, new int[]{1, 1, 1, 1}, new int[]{10, 5, 1, 1}, 1, 1, 4, 1));
    ExampleRunner.eq(174, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{100}, 1, 1, 0, 0));
    ExampleRunner.eq(175, 3, new CirclesCountry().leastBorders(new int[]{0, 0, 0, -6, -2, 2}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{99, 98, 97, 6, 1, 1}, -2, 0, 2, 0));
    ExampleRunner.eq(176, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{100}, 1, 1, 2, 2));
    ExampleRunner.eq(177, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{100}, 1, 0, 0, 1));
    ExampleRunner.eq(178, 1, new CirclesCountry().leastBorders(new int[]{1, 2}, new int[]{0, 0}, new int[]{2, 15}, 0, 0, 5, 0));
    ExampleRunner.eq(179, 2, new CirclesCountry().leastBorders(new int[]{0, -2, 2}, new int[]{0, 0, 0}, new int[]{10, 1, 1}, -2, 0, 2, 0));
    ExampleRunner.eq(180, 0, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{5, 10}, 0, 0, 1, 0));
    ExampleRunner.eq(181, 0, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{1, 2}, 0, 0, 0, 0));
    ExampleRunner.eq(182, 1, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{2, 5}, 1, 0, 3, 0));
    ExampleRunner.eq(183, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{1000}, 2, 2, -2, -2));
    ExampleRunner.eq(184, 0, new CirclesCountry().leastBorders(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}, new int[]{10, 11, 12, 13}, 0, 0, 2, 2));
    ExampleRunner.eq(185, 2, new CirclesCountry().leastBorders(new int[]{-3, 2, 2, 0, -4, 12, 12, 12}, new int[]{-1, 2, 3, 1, 5, 1, 1, 1}, new int[]{1, 3, 1, 7, 1, 1, 2, 3}, 2, 3, -3, 1));
    ExampleRunner.eq(186, 2, new CirclesCountry().leastBorders(new int[]{-1000, -1}, new int[]{1000, 1}, new int[]{1000, 1}, -1000, 1000, -1, 1));
    ExampleRunner.eq(187, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{999}, 5, 5, 15, 15));
    ExampleRunner.eq(188, 2, new CirclesCountry().leastBorders(new int[]{1, 4, 1}, new int[]{1, 1, 1}, new int[]{1, 1, 10}, 1, 1, 4, 1));
    ExampleRunner.eq(189, 0, new CirclesCountry().leastBorders(new int[]{1}, new int[]{1}, new int[]{2}, 1, 1, 1, 1));
    ExampleRunner.eq(190, 2, new CirclesCountry().leastBorders(new int[]{0, 2, 4}, new int[]{0, 0, 0}, new int[]{1, 4, 1}, 0, 0, 4, 0));
    ExampleRunner.eq(191, 0, new CirclesCountry().leastBorders(new int[]{2}, new int[]{0}, new int[]{10}, 3, 0, -5, 0));
    ExampleRunner.eq(192, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{100}, 99, 99, 101, 101));
    ExampleRunner.eq(193, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{5}, 0, 0, 1, 1));
    ExampleRunner.eq(194, 1, new CirclesCountry().leastBorders(new int[]{0, 10}, new int[]{0, 0}, new int[]{100, 5}, 0, 0, 10, 0));
    ExampleRunner.eq(195, 2, new CirclesCountry().leastBorders(new int[]{0, 3, 1, 1}, new int[]{0, 0, 0, 0}, new int[]{1, 1, 5, 10}, 0, 0, 3, 0));
    ExampleRunner.eq(196, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{5}, 1, 1, 2, 1));
    ExampleRunner.eq(197, 0, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{999, 2}, -5, 1, 5, 1));
    ExampleRunner.eq(198, 2, new CirclesCountry().leastBorders(new int[]{0, 3, -3}, new int[]{0, 3, -3}, new int[]{10, 1, 1}, 3, 3, -3, -3));
    ExampleRunner.eq(199, 2, new CirclesCountry().leastBorders(new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{10, 5, 2}, 0, 0, 7, 7));
    ExampleRunner.eq(200, 3, new CirclesCountry().leastBorders(new int[]{0, -3, 3, 3}, new int[]{0, 0, 0, 0}, new int[]{6, 1, 1, 2}, -3, 0, 3, 0));
    ExampleRunner.eq(201, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{4}, -2, 0, 2, 0));
    ExampleRunner.eq(202, 2, new CirclesCountry().leastBorders(new int[]{2, -1, 0}, new int[]{0, 0, 0}, new int[]{1, 1, 10}, -1, 0, 2, 0));
    ExampleRunner.eq(203, 5, new CirclesCountry().leastBorders(new int[]{-3, 2, 2, 0, -4, 12, 12, 12, 12}, new int[]{-1, 2, 3, 1, 5, 1, 1, 1, 12}, new int[]{1, 3, 1, 7, 1, 1, 2, 3, 50}, 2, 3, 13, 2));
    ExampleRunner.eq(204, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{4}, 3, 3, 10, 10));
    ExampleRunner.eq(205, 2, new CirclesCountry().leastBorders(new int[]{0, 0, 2, -2}, new int[]{0, 0, 0, 0}, new int[]{100, 10, 1, 1}, -2, 0, 2, 0));
    ExampleRunner.eq(206, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{20}, 19, 19, 25, 25));
    ExampleRunner.eq(207, 1, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{5}, 0, 0, 4, -4));
    ExampleRunner.eq(208, 4, new CirclesCountry().leastBorders(new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0}, new int[]{100, 50, 25, 15, 5}, 40, 40, 3, 3));
    ExampleRunner.eq(209, 1, new CirclesCountry().leastBorders(new int[]{0, 1}, new int[]{0, 1}, new int[]{1000, 10}, 100, 100, 1, 1));
    ExampleRunner.eq(210, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{5}, 1, 1, -1, -1));
    ExampleRunner.eq(211, 2, new CirclesCountry().leastBorders(new int[]{2, 2, 11, 11, 7}, new int[]{1, 1, 1, 1, 2}, new int[]{1, 4, 1, 4, 100}, 4, 1, 11, 3));
    ExampleRunner.eq(212, 3, new CirclesCountry().leastBorders(new int[]{10, 0, 5, 10, 5}, new int[]{0, 0, 0, 0, 0}, new int[]{4, 2, 20, 2, 100}, 0, 1, 10, 0));
    ExampleRunner.eq(213, 0, new CirclesCountry().leastBorders(new int[]{0, 0}, new int[]{0, 0}, new int[]{10, 20}, 1, 0, -1, 0));
    ExampleRunner.eq(214, 2, new CirclesCountry().leastBorders(new int[]{0, 0, 0}, new int[]{0, -1, 2}, new int[]{4, 1, 1}, 0, -1, 0, 2));
    ExampleRunner.eq(215, 2, new CirclesCountry().leastBorders(new int[]{0, 10, 0}, new int[]{0, 0, 0}, new int[]{2, 2, 100}, 0, 0, 10, 0));
    ExampleRunner.eq(216, 2, new CirclesCountry().leastBorders(new int[]{5, 3, 7}, new int[]{5, 5, 5}, new int[]{5, 1, 2}, 3, 5, 7, 5));
    ExampleRunner.eq(217, 5, new CirclesCountry().leastBorders(new int[]{-3, 2, 2, 0, -4, 12, 12, 12, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-1, 2, 3, 1, 5, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{1, 3, 1, 7, 1, 1, 2, 3, 50, 51, 52, 53, 54, 55, 56, 57}, 2, 3, 13, 2));
    ExampleRunner.eq(218, 1, new CirclesCountry().leastBorders(new int[]{0, 1000}, new int[]{0, 1000}, new int[]{100, 1}, 99, 99, 1000, 1000));
    ExampleRunner.eq(219, 2, new CirclesCountry().leastBorders(new int[]{0, 2, -2}, new int[]{0, 2, -2}, new int[]{100, 1, 1}, 2, 2, -2, -2));
    ExampleRunner.eq(220, 48, new CirclesCountry().leastBorders(new int[]{101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24}, new int[]{101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24}, new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47}, 101, 101, 1, 1));
    ExampleRunner.eq(221, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{400}, 399, 399, 399, 401));
    ExampleRunner.eq(222, 1, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{10}, -9, 9, 0, 0));
    ExampleRunner.eq(223, 0, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{5}, 0, 0, 0, 1));
    ExampleRunner.eq(224, 1, new CirclesCountry().leastBorders(new int[]{0}, new int[]{0}, new int[]{2}, 1, 2, 1, 1));
    ExampleRunner.eq(225, 0, new CirclesCountry().leastBorders(new int[]{0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0}, new int[]{10, 9, 8, 7, 6, 5}, 1, 1, -1, -1));
    ExampleRunner.eq(226, 2, new CirclesCountry().leastBorders(new int[]{0, 20, -20}, new int[]{0, 20, -20}, new int[]{1000, 10, 10}, 20, 20, -20, -20));
    ExampleRunner.eq(227, 3, new CirclesCountry().leastBorders(new int[]{0, 0, 0, 0}, new int[]{0, 7, 6, -6}, new int[]{10, 1, 3, 2}, 0, 7, 0, -6));
    ExampleRunner.eq(228, 0, new CirclesCountry().leastBorders(new int[]{1, 1, 1, 1, 1}, new int[]{1, 1, 1, 1, 1}, new int[]{1, 2, 3, 4, 5}, 1, 1, 1, 1));
  }
}


