package p500.srm522;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 10/25/11
 * Time: 9:42 PM
 */
public class CorrectMultiplicationTwo {
  public int getMinimum(int a, int b, int c) {
    int min = Integer.MAX_VALUE;
    for (int A = 1; A <= 1000000; A++) {
      int B = c / A;
      int C = A * B;
      if (B * C != 0) {
        min = Math.min(Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c), min);
      }
      B++;
      C = A * B;
      if (B * C != 0) {
        min = Math.min(Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c), min);
      }
    }
    return min;
  }

  public static void main(String[] args) {

    ExampleRunner.eq(1, 2, new CorrectMultiplicationTwo().getMinimum(19, 28, 522));
    ExampleRunner.eq(2, 11, new CorrectMultiplicationTwo().getMinimum(10, 30, 500));
    ExampleRunner.eq(3, 0, new CorrectMultiplicationTwo().getMinimum(111, 111, 12321));
    ExampleRunner.eq(4, 1089, new CorrectMultiplicationTwo().getMinimum(1000, 100, 10));
    ExampleRunner.eq(5, 24, new CorrectMultiplicationTwo().getMinimum(399, 522, 199999));
    ExampleRunner.eq(6, 0, new CorrectMultiplicationTwo().getMinimum(1, 1, 1));
    ExampleRunner.eq(7, 1, new CorrectMultiplicationTwo().getMinimum(1, 1, 2));
    ExampleRunner.eq(8, 2, new CorrectMultiplicationTwo().getMinimum(1, 1, 3));
    ExampleRunner.eq(9, 1, new CorrectMultiplicationTwo().getMinimum(1, 2, 1));
    ExampleRunner.eq(10, 0, new CorrectMultiplicationTwo().getMinimum(1, 2, 2));
    ExampleRunner.eq(11, 1, new CorrectMultiplicationTwo().getMinimum(1, 2, 3));
    ExampleRunner.eq(12, 2, new CorrectMultiplicationTwo().getMinimum(1, 3, 1));
    ExampleRunner.eq(13, 1, new CorrectMultiplicationTwo().getMinimum(1, 3, 2));
    ExampleRunner.eq(14, 0, new CorrectMultiplicationTwo().getMinimum(1, 3, 3));
    ExampleRunner.eq(15, 1, new CorrectMultiplicationTwo().getMinimum(2, 1, 1));
    ExampleRunner.eq(16, 0, new CorrectMultiplicationTwo().getMinimum(2, 1, 2));
    ExampleRunner.eq(17, 1, new CorrectMultiplicationTwo().getMinimum(2, 1, 3));
    ExampleRunner.eq(18, 2, new CorrectMultiplicationTwo().getMinimum(2, 2, 1));
    ExampleRunner.eq(19, 1, new CorrectMultiplicationTwo().getMinimum(2, 2, 2));
    ExampleRunner.eq(20, 1, new CorrectMultiplicationTwo().getMinimum(2, 2, 3));
    ExampleRunner.eq(21, 3, new CorrectMultiplicationTwo().getMinimum(2, 3, 1));
    ExampleRunner.eq(22, 2, new CorrectMultiplicationTwo().getMinimum(2, 3, 2));
    ExampleRunner.eq(23, 1, new CorrectMultiplicationTwo().getMinimum(2, 3, 3));
    ExampleRunner.eq(24, 2, new CorrectMultiplicationTwo().getMinimum(3, 1, 1));
    ExampleRunner.eq(25, 1, new CorrectMultiplicationTwo().getMinimum(3, 1, 2));
    ExampleRunner.eq(26, 0, new CorrectMultiplicationTwo().getMinimum(3, 1, 3));
    ExampleRunner.eq(27, 3, new CorrectMultiplicationTwo().getMinimum(3, 2, 1));
    ExampleRunner.eq(28, 2, new CorrectMultiplicationTwo().getMinimum(3, 2, 2));
    ExampleRunner.eq(29, 1, new CorrectMultiplicationTwo().getMinimum(3, 2, 3));
    ExampleRunner.eq(30, 4, new CorrectMultiplicationTwo().getMinimum(3, 3, 1));
    ExampleRunner.eq(31, 3, new CorrectMultiplicationTwo().getMinimum(3, 3, 2));
    ExampleRunner.eq(32, 2, new CorrectMultiplicationTwo().getMinimum(3, 3, 3));
    ExampleRunner.eq(33, 0, new CorrectMultiplicationTwo().getMinimum(1, 1, 1));
    ExampleRunner.eq(34, 1998, new CorrectMultiplicationTwo().getMinimum(1, 1, 1000000));
    ExampleRunner.eq(35, 999999, new CorrectMultiplicationTwo().getMinimum(1, 1000000, 1));
    ExampleRunner.eq(36, 0, new CorrectMultiplicationTwo().getMinimum(1, 1000000, 1000000));
    ExampleRunner.eq(37, 999999, new CorrectMultiplicationTwo().getMinimum(1000000, 1, 1));
    ExampleRunner.eq(38, 0, new CorrectMultiplicationTwo().getMinimum(1000000, 1, 1000000));
    ExampleRunner.eq(39, 1999998, new CorrectMultiplicationTwo().getMinimum(1000000, 1000000, 1));
    ExampleRunner.eq(40, 999999, new CorrectMultiplicationTwo().getMinimum(1000000, 1000000, 1000000));
    ExampleRunner.eq(41, 2, new CorrectMultiplicationTwo().getMinimum(4, 249999, 999994));
    ExampleRunner.eq(42, 2, new CorrectMultiplicationTwo().getMinimum(249999, 4, 999994));
    ExampleRunner.eq(43, 1, new CorrectMultiplicationTwo().getMinimum(4, 249999, 999995));
    ExampleRunner.eq(44, 1, new CorrectMultiplicationTwo().getMinimum(249999, 4, 999995));
    ExampleRunner.eq(45, 0, new CorrectMultiplicationTwo().getMinimum(4, 249999, 999996));
    ExampleRunner.eq(46, 0, new CorrectMultiplicationTwo().getMinimum(249999, 4, 999996));
    ExampleRunner.eq(47, 1, new CorrectMultiplicationTwo().getMinimum(4, 249999, 999997));
    ExampleRunner.eq(48, 1, new CorrectMultiplicationTwo().getMinimum(249999, 4, 999997));
    ExampleRunner.eq(49, 2, new CorrectMultiplicationTwo().getMinimum(4, 249999, 999998));
    ExampleRunner.eq(50, 2, new CorrectMultiplicationTwo().getMinimum(249999, 4, 999998));
    ExampleRunner.eq(51, 121, new CorrectMultiplicationTwo().getMinimum(1, 117315, 117436));
    ExampleRunner.eq(52, 454, new CorrectMultiplicationTwo().getMinimum(316, 1, 148030));
    ExampleRunner.eq(53, 15, new CorrectMultiplicationTwo().getMinimum(350, 666, 239626));
    ExampleRunner.eq(54, 8, new CorrectMultiplicationTwo().getMinimum(1, 104, 613));
    ExampleRunner.eq(55, 311, new CorrectMultiplicationTwo().getMinimum(1, 117, 44109));
    ExampleRunner.eq(56, 1, new CorrectMultiplicationTwo().getMinimum(1, 53, 54));
    ExampleRunner.eq(57, 541, new CorrectMultiplicationTwo().getMinimum(5, 1020, 554040));
    ExampleRunner.eq(58, 586, new CorrectMultiplicationTwo().getMinimum(1830, 383, 4874));
    ExampleRunner.eq(59, 91, new CorrectMultiplicationTwo().getMinimum(1, 6383, 6292));
    ExampleRunner.eq(60, 86, new CorrectMultiplicationTwo().getMinimum(2449, 1, 16599));
    ExampleRunner.eq(61, 0, new CorrectMultiplicationTwo().getMinimum(27327, 1, 27327));
    ExampleRunner.eq(62, 15, new CorrectMultiplicationTwo().getMinimum(1966, 31, 70786));
    ExampleRunner.eq(63, 130, new CorrectMultiplicationTwo().getMinimum(1153, 1, 1023));
    ExampleRunner.eq(64, 0, new CorrectMultiplicationTwo().getMinimum(1, 107217, 107217));
    ExampleRunner.eq(65, 2, new CorrectMultiplicationTwo().getMinimum(2, 6, 17));
    ExampleRunner.eq(66, 6, new CorrectMultiplicationTwo().getMinimum(55, 66, 3400));
    ExampleRunner.eq(67, 2, new CorrectMultiplicationTwo().getMinimum(8, 408, 3248));
    ExampleRunner.eq(68, 2, new CorrectMultiplicationTwo().getMinimum(1, 26699, 26701));
    ExampleRunner.eq(69, 107, new CorrectMultiplicationTwo().getMinimum(1657, 1, 150770));
    ExampleRunner.eq(70, 772, new CorrectMultiplicationTwo().getMinimum(776, 1, 4));
    ExampleRunner.eq(71, 3, new CorrectMultiplicationTwo().getMinimum(615147, 1, 615144));
    ExampleRunner.eq(72, 148, new CorrectMultiplicationTwo().getMinimum(1972, 371, 544118));
    ExampleRunner.eq(73, 615, new CorrectMultiplicationTwo().getMinimum(617, 1256, 2512));
    ExampleRunner.eq(74, 14, new CorrectMultiplicationTwo().getMinimum(3934, 14, 54958));
    ExampleRunner.eq(75, 852, new CorrectMultiplicationTwo().getMinimum(866, 3606, 104589));
    ExampleRunner.eq(76, 17, new CorrectMultiplicationTwo().getMinimum(9369, 67, 533634));
    ExampleRunner.eq(77, 555, new CorrectMultiplicationTwo().getMinimum(557, 735, 2938));
    ExampleRunner.eq(78, 6601, new CorrectMultiplicationTwo().getMinimum(6532, 71, 1));
    ExampleRunner.eq(79, 732, new CorrectMultiplicationTwo().getMinimum(23, 732, 22));
    ExampleRunner.eq(80, 818403, new CorrectMultiplicationTwo().getMinimum(815585, 3185, 366));
    ExampleRunner.eq(81, 8449, new CorrectMultiplicationTwo().getMinimum(8370, 6942, 6862));
    ExampleRunner.eq(82, 136737, new CorrectMultiplicationTwo().getMinimum(134901, 132173, 130336));
    ExampleRunner.eq(83, 234526, new CorrectMultiplicationTwo().getMinimum(16326, 218202, 1));
    ExampleRunner.eq(84, 102062, new CorrectMultiplicationTwo().getMinimum(102079, 7, 23));
    ExampleRunner.eq(85, 926, new CorrectMultiplicationTwo().getMinimum(1231, 63, 367));
    ExampleRunner.eq(86, 20472, new CorrectMultiplicationTwo().getMinimum(6620, 20716, 6863));
    ExampleRunner.eq(87, 22038, new CorrectMultiplicationTwo().getMinimum(35739, 18886, 130337));
    ExampleRunner.eq(88, 9998, new CorrectMultiplicationTwo().getMinimum(9999, 9999, 9999));
    ExampleRunner.eq(89, 999191, new CorrectMultiplicationTwo().getMinimum(999999, 988989, 989796));
    ExampleRunner.eq(90, 651471, new CorrectMultiplicationTwo().getMinimum(715406, 610901, 755977));
    ExampleRunner.eq(91, 888887, new CorrectMultiplicationTwo().getMinimum(999999, 777777, 888888));
    ExampleRunner.eq(92, 1999970, new CorrectMultiplicationTwo().getMinimum(1000000, 999999, 28));
    ExampleRunner.eq(93, 1980, new CorrectMultiplicationTwo().getMinimum(10, 10, 1000000));
    ExampleRunner.eq(94, 499998, new CorrectMultiplicationTwo().getMinimum(499999, 500001, 1000000));
    ExampleRunner.eq(95, 1999426, new CorrectMultiplicationTwo().getMinimum(1000000, 1000000, 573));
    ExampleRunner.eq(96, 999964, new CorrectMultiplicationTwo().getMinimum(999961, 999979, 999983));
    ExampleRunner.eq(97, 999998, new CorrectMultiplicationTwo().getMinimum(999999, 999999, 999999));
    ExampleRunner.eq(98, 123455, new CorrectMultiplicationTwo().getMinimum(999999, 123456, 999999));
    ExampleRunner.eq(99, 1999996, new CorrectMultiplicationTwo().getMinimum(1000000, 1000000, 3));
    ExampleRunner.eq(100, 0, new CorrectMultiplicationTwo().getMinimum(100000, 1, 100000));
    ExampleRunner.eq(101, 93, new CorrectMultiplicationTwo().getMinimum(999, 9, 99999));
    ExampleRunner.eq(102, 499, new CorrectMultiplicationTwo().getMinimum(500, 1000000, 1000000));
    ExampleRunner.eq(103, 532, new CorrectMultiplicationTwo().getMinimum(99, 9, 99999));
    ExampleRunner.eq(104, 1999989, new CorrectMultiplicationTwo().getMinimum(1000000, 1000000, 10));
    ExampleRunner.eq(105, 1, new CorrectMultiplicationTwo().getMinimum(1, 10000, 10001));
    ExampleRunner.eq(106, 0, new CorrectMultiplicationTwo().getMinimum(1000, 1000, 1000000));
    ExampleRunner.eq(107, 1, new CorrectMultiplicationTwo().getMinimum(101, 9901, 1000000));
    ExampleRunner.eq(108, 832455, new CorrectMultiplicationTwo().getMinimum(933343, 832456, 933343));
    ExampleRunner.eq(109, 1802606, new CorrectMultiplicationTwo().getMinimum(909091, 907197, 13681));
    ExampleRunner.eq(110, 0, new CorrectMultiplicationTwo().getMinimum(999999, 1, 999999));
    ExampleRunner.eq(111, 1000, new CorrectMultiplicationTwo().getMinimum(1, 100000, 99000));
    ExampleRunner.eq(112, 1, new CorrectMultiplicationTwo().getMinimum(2, 100000, 199999));
    ExampleRunner.eq(113, 0, new CorrectMultiplicationTwo().getMinimum(2000, 100, 200000));
    ExampleRunner.eq(114, 99998, new CorrectMultiplicationTwo().getMinimum(99999, 9, 9));
    ExampleRunner.eq(115, 57865, new CorrectMultiplicationTwo().getMinimum(50000, 50000, 115733));
    ExampleRunner.eq(116, 1992, new CorrectMultiplicationTwo().getMinimum(4, 5, 999983));
    ExampleRunner.eq(117, 0, new CorrectMultiplicationTwo().getMinimum(1100, 10, 11000));
    ExampleRunner.eq(118, 999998, new CorrectMultiplicationTwo().getMinimum(999999, 999998, 1000000));
    ExampleRunner.eq(119, 0, new CorrectMultiplicationTwo().getMinimum(2200, 10, 22000));
    ExampleRunner.eq(120, 0, new CorrectMultiplicationTwo().getMinimum(1, 600000, 600000));
    ExampleRunner.eq(121, 9, new CorrectMultiplicationTwo().getMinimum(1, 10, 1));
    ExampleRunner.eq(122, 1999993, new CorrectMultiplicationTwo().getMinimum(999997, 999998, 1));
    ExampleRunner.eq(123, 19998, new CorrectMultiplicationTwo().getMinimum(10000, 10000, 1));
  }
}
