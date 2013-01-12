package p500.srm508;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 6/2/11
 * Time: 7:40 PM
 * with help
 */
public class DivideAndShift {

  public int getLeast(int N, int M) {
    M--;
    int min = Math.min(M, N - M);
    for (int i = 1; i <= N; i++) {
      if (N % i == 0) {
        int k = N / i;
        int newMin = getFactorsCount(k) + Math.min(M % i, i - M % i);
//        System.out.println("newMin = " + newMin + " i = " + i);
        min = Math.min(newMin, min);
      }
    }
    return min;
  }

  private int getFactorsCount(int k) {
    int res = 0;
    int i;
    for (i = 2; i * i <= k; i++) {
      while (k % i == 0) {
        k /= i;
        res++;
      }
    }
    if (k > 1) {
      res++;
    }
    return res;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 3, new DivideAndShift().getLeast(56, 14));
    ExampleRunner.eq(2, 2, new DivideAndShift().getLeast(49, 5));
    ExampleRunner.eq(3, 6, new DivideAndShift().getLeast(256, 7));
    ExampleRunner.eq(4, 0, new DivideAndShift().getLeast(1, 1));
    ExampleRunner.eq(5, 1, new DivideAndShift().getLeast(7, 3));
    ExampleRunner.eq(6, 0, new DivideAndShift().getLeast(6, 1));
    ExampleRunner.eq(7, 1, new DivideAndShift().getLeast(93, 13));
    ExampleRunner.eq(8, 2, new DivideAndShift().getLeast(256, 255));
    ExampleRunner.eq(9, 9, new DivideAndShift().getLeast(1000000, 1234));
    ExampleRunner.eq(10, 7, new DivideAndShift().getLeast(123456, 12347));
    ExampleRunner.eq(11, 6, new DivideAndShift().getLeast(999999, 215));
    ExampleRunner.eq(12, 5, new DivideAndShift().getLeast(999999, 234625));
    ExampleRunner.eq(13, 1, new DivideAndShift().getLeast(3, 2));
    ExampleRunner.eq(14, 1, new DivideAndShift().getLeast(2, 2));
    ExampleRunner.eq(15, 1, new DivideAndShift().getLeast(4, 3));
    ExampleRunner.eq(16, 1, new DivideAndShift().getLeast(5, 3));
    ExampleRunner.eq(17, 2, new DivideAndShift().getLeast(8, 6));
    ExampleRunner.eq(18, 2, new DivideAndShift().getLeast(9, 6));
    ExampleRunner.eq(19, 2, new DivideAndShift().getLeast(12, 11));
    ExampleRunner.eq(20, 1, new DivideAndShift().getLeast(14, 8));
    ExampleRunner.eq(21, 2, new DivideAndShift().getLeast(15, 9));
    ExampleRunner.eq(22, 3, new DivideAndShift().getLeast(16, 11));
    ExampleRunner.eq(23, 3, new DivideAndShift().getLeast(16, 12));
    ExampleRunner.eq(24, 3, new DivideAndShift().getLeast(27, 23));
    ExampleRunner.eq(25, 4, new DivideAndShift().getLeast(32, 11));
    ExampleRunner.eq(26, 4, new DivideAndShift().getLeast(32, 12));
    ExampleRunner.eq(27, 2, new DivideAndShift().getLeast(32, 16));
    ExampleRunner.eq(28, 1, new DivideAndShift().getLeast(35, 29));
    ExampleRunner.eq(29, 3, new DivideAndShift().getLeast(100, 58));
    ExampleRunner.eq(30, 4, new DivideAndShift().getLeast(108, 6));
    ExampleRunner.eq(31, 7, new DivideAndShift().getLeast(512, 13));
    ExampleRunner.eq(32, 10, new DivideAndShift().getLeast(4096, 666));
    ExampleRunner.eq(33, 4, new DivideAndShift().getLeast(5096, 776));
    ExampleRunner.eq(34, 6, new DivideAndShift().getLeast(10000, 6123));
    ExampleRunner.eq(35, 11, new DivideAndShift().getLeast(6144, 20));
    ExampleRunner.eq(36, 8, new DivideAndShift().getLeast(6144, 63));
    ExampleRunner.eq(37, 12, new DivideAndShift().getLeast(8192, 4110));
    ExampleRunner.eq(38, 2, new DivideAndShift().getLeast(19999, 521));
    ExampleRunner.eq(39, 2, new DivideAndShift().getLeast(19945, 229));
    ExampleRunner.eq(40, 3, new DivideAndShift().getLeast(25998, 15633));
    ExampleRunner.eq(41, 9, new DivideAndShift().getLeast(59049, 12157));
    ExampleRunner.eq(42, 10, new DivideAndShift().getLeast(59049, 57851));
    ExampleRunner.eq(43, 5, new DivideAndShift().getLeast(59049, 59045));
    ExampleRunner.eq(44, 18, new DivideAndShift().getLeast(524288, 55022));
    ExampleRunner.eq(45, 15, new DivideAndShift().getLeast(524288, 625));
    ExampleRunner.eq(46, 9, new DivideAndShift().getLeast(200000, 47237));
    ExampleRunner.eq(47, 4, new DivideAndShift().getLeast(173734, 58450));
    ExampleRunner.eq(48, 5, new DivideAndShift().getLeast(360216, 6327));
    ExampleRunner.eq(49, 3, new DivideAndShift().getLeast(360216, 284234));
    ExampleRunner.eq(50, 0, new DivideAndShift().getLeast(1000000, 1));
    ExampleRunner.eq(51, 2, new DivideAndShift().getLeast(1000000, 999999));
    ExampleRunner.eq(52, 8, new DivideAndShift().getLeast(1000000, 964998));
    ExampleRunner.eq(53, 6, new DivideAndShift().getLeast(1000000, 631233));
    ExampleRunner.eq(54, 11, new DivideAndShift().getLeast(1000000, 718118));
    ExampleRunner.eq(55, 7, new DivideAndShift().getLeast(1000000, 66));
    ExampleRunner.eq(56, 9, new DivideAndShift().getLeast(1000000, 999593));
    ExampleRunner.eq(57, 6, new DivideAndShift().getLeast(999999, 33));
    ExampleRunner.eq(58, 1, new DivideAndShift().getLeast(999999, 999999));
    ExampleRunner.eq(59, 6, new DivideAndShift().getLeast(999999, 96495));
    ExampleRunner.eq(60, 5, new DivideAndShift().getLeast(969696, 696696));
    ExampleRunner.eq(61, 1, new DivideAndShift().getLeast(999983, 427));
    ExampleRunner.eq(62, 6, new DivideAndShift().getLeast(510510, 44128));
    ExampleRunner.eq(63, 6, new DivideAndShift().getLeast(510510, 362585));
    ExampleRunner.eq(64, 4, new DivideAndShift().getLeast(881790, 61));
    ExampleRunner.eq(65, 6, new DivideAndShift().getLeast(881790, 428));
    ExampleRunner.eq(66, 3, new DivideAndShift().getLeast(881790, 17290));
    ExampleRunner.eq(67, 2, new DivideAndShift().getLeast(881790, 337156));
    ExampleRunner.eq(68, 5, new DivideAndShift().getLeast(881790, 337151));
    ExampleRunner.eq(69, 6, new DivideAndShift().getLeast(881790, 337152));
    ExampleRunner.eq(70, 7, new DivideAndShift().getLeast(5184, 1367));
    ExampleRunner.eq(71, 12, new DivideAndShift().getLeast(972000, 44));
    ExampleRunner.eq(72, 7, new DivideAndShift().getLeast(972000, 277634));
    ExampleRunner.eq(73, 12, new DivideAndShift().getLeast(972000, 324044));
    ExampleRunner.eq(74, 2, new DivideAndShift().getLeast(408484, 31267));
    ExampleRunner.eq(75, 4, new DivideAndShift().getLeast(637377, 636123));
    ExampleRunner.eq(76, 3, new DivideAndShift().getLeast(999954, 233632));
    ExampleRunner.eq(77, 3, new DivideAndShift().getLeast(676892, 123456));
    ExampleRunner.eq(78, 4, new DivideAndShift().getLeast(356478, 183526));
    ExampleRunner.eq(79, 1, new DivideAndShift().getLeast(876542, 123537));
    ExampleRunner.eq(80, 3, new DivideAndShift().getLeast(964999, 488425));
    ExampleRunner.eq(81, 18, new DivideAndShift().getLeast(524288, 27));
    ExampleRunner.eq(82, 7, new DivideAndShift().getLeast(360360, 4374));
    ExampleRunner.eq(83, 2, new DivideAndShift().getLeast(77777, 11111));
    ExampleRunner.eq(84, 10, new DivideAndShift().getLeast(997920, 508988));
    ExampleRunner.eq(85, 11, new DivideAndShift().getLeast(997920, 97115));
    ExampleRunner.eq(86, 11, new DivideAndShift().getLeast(1000000, 806790));
    ExampleRunner.eq(87, 11, new DivideAndShift().getLeast(1000000, 100012));
    ExampleRunner.eq(88, 9, new DivideAndShift().getLeast(1000000, 42354));
    ExampleRunner.eq(89, 9, new DivideAndShift().getLeast(362880, 77777));
    ExampleRunner.eq(90, 1, new DivideAndShift().getLeast(1000000, 1000000));
    ExampleRunner.eq(91, 8, new DivideAndShift().getLeast(418944, 161799));
    ExampleRunner.eq(92, 3, new DivideAndShift().getLeast(345534, 234139));
    ExampleRunner.eq(93, 0, new DivideAndShift().getLeast(7, 1));
    ExampleRunner.eq(94, 3, new DivideAndShift().getLeast(984712, 302000));
    ExampleRunner.eq(95, 1, new DivideAndShift().getLeast(999983, 500000));
    ExampleRunner.eq(96, 2, new DivideAndShift().getLeast(999947, 336327));
    ExampleRunner.eq(97, 7, new DivideAndShift().getLeast(720720, 462363));
    ExampleRunner.eq(98, 4, new DivideAndShift().getLeast(600, 67));
    ExampleRunner.eq(99, 18, new DivideAndShift().getLeast(786432, 222222));
    ExampleRunner.eq(100, 2, new DivideAndShift().getLeast(169, 7));
    ExampleRunner.eq(101, 3, new DivideAndShift().getLeast(987524, 254782));
    ExampleRunner.eq(102, 13, new DivideAndShift().getLeast(147456, 127523));
    ExampleRunner.eq(103, 1, new DivideAndShift().getLeast(999983, 1515));
    ExampleRunner.eq(104, 17, new DivideAndShift().getLeast(786432, 24606));
    ExampleRunner.eq(105, 1, new DivideAndShift().getLeast(13, 5));
    ExampleRunner.eq(106, 1, new DivideAndShift().getLeast(11, 5));
    ExampleRunner.eq(107, 9, new DivideAndShift().getLeast(1000000, 100));
    ExampleRunner.eq(108, 1, new DivideAndShift().getLeast(12, 5));
    ExampleRunner.eq(109, 3, new DivideAndShift().getLeast(1000000, 100000));
    ExampleRunner.eq(110, 1, new DivideAndShift().getLeast(3000, 2001));
    ExampleRunner.eq(111, 1, new DivideAndShift().getLeast(10, 5));
    ExampleRunner.eq(112, 1, new DivideAndShift().getLeast(999983, 999982));
    ExampleRunner.eq(113, 2, new DivideAndShift().getLeast(77, 75));
    ExampleRunner.eq(114, 1, new DivideAndShift().getLeast(55997, 20000));
    ExampleRunner.eq(115, 1, new DivideAndShift().getLeast(100, 100));
    ExampleRunner.eq(116, 1, new DivideAndShift().getLeast(53, 42));
    ExampleRunner.eq(117, 1, new DivideAndShift().getLeast(200006, 100004));
    ExampleRunner.eq(118, 1, new DivideAndShift().getLeast(127, 5));
    ExampleRunner.eq(119, 3, new DivideAndShift().getLeast(125, 8));
    ExampleRunner.eq(120, 9, new DivideAndShift().getLeast(997920, 22222));
    ExampleRunner.eq(121, 2, new DivideAndShift().getLeast(20, 14));
    ExampleRunner.eq(122, 7, new DivideAndShift().getLeast(1000000, 123456));
    ExampleRunner.eq(123, 11, new DivideAndShift().getLeast(1000000, 14));
    ExampleRunner.eq(124, 1, new DivideAndShift().getLeast(200, 2));
    ExampleRunner.eq(125, 8, new DivideAndShift().getLeast(1000000, 598432));
    ExampleRunner.eq(126, 1, new DivideAndShift().getLeast(6, 3));
    ExampleRunner.eq(127, 18, new DivideAndShift().getLeast(524288, 11111));
    ExampleRunner.eq(128, 1, new DivideAndShift().getLeast(100003, 19));
    ExampleRunner.eq(129, 1, new DivideAndShift().getLeast(700001, 350000));
    ExampleRunner.eq(130, 1, new DivideAndShift().getLeast(77, 8));
    ExampleRunner.eq(131, 4, new DivideAndShift().getLeast(161051, 123));
    ExampleRunner.eq(132, 1, new DivideAndShift().getLeast(999983, 444444));
    ExampleRunner.eq(133, 3, new DivideAndShift().getLeast(324, 19));
    ExampleRunner.eq(134, 3, new DivideAndShift().getLeast(590340, 59));
    ExampleRunner.eq(135, 9, new DivideAndShift().getLeast(1000000, 985421));
    ExampleRunner.eq(136, 1, new DivideAndShift().getLeast(8, 2));
    ExampleRunner.eq(137, 1, new DivideAndShift().getLeast(333101, 257733));
    ExampleRunner.eq(138, 1, new DivideAndShift().getLeast(999958, 499979));
    ExampleRunner.eq(139, 1, new DivideAndShift().getLeast(5098, 1219));
    ExampleRunner.eq(140, 6, new DivideAndShift().getLeast(999999, 123457));
    ExampleRunner.eq(141, 1, new DivideAndShift().getLeast(999983, 555555));
    ExampleRunner.eq(142, 1, new DivideAndShift().getLeast(7, 7));
    ExampleRunner.eq(143, 7, new DivideAndShift().getLeast(720720, 86719));
    ExampleRunner.eq(144, 1, new DivideAndShift().getLeast(9, 9));
    ExampleRunner.eq(145, 1, new DivideAndShift().getLeast(15, 4));
    ExampleRunner.eq(146, 1, new DivideAndShift().getLeast(65, 6));
    ExampleRunner.eq(147, 18, new DivideAndShift().getLeast(524288, 262044));
    ExampleRunner.eq(148, 1, new DivideAndShift().getLeast(6, 4));
    ExampleRunner.eq(149, 1, new DivideAndShift().getLeast(524288, 524288));
    ExampleRunner.eq(150, 1, new DivideAndShift().getLeast(523673, 10000));
    ExampleRunner.eq(151, 1, new DivideAndShift().getLeast(17, 5));
    ExampleRunner.eq(152, 0, new DivideAndShift().getLeast(2, 1));
    ExampleRunner.eq(153, 1, new DivideAndShift().getLeast(71, 5));
    ExampleRunner.eq(154, 1, new DivideAndShift().getLeast(10007, 5000));
    ExampleRunner.eq(155, 1, new DivideAndShift().getLeast(8, 8));
    ExampleRunner.eq(156, 3, new DivideAndShift().getLeast(84822, 58094));
    ExampleRunner.eq(157, 1, new DivideAndShift().getLeast(33, 13));
    ExampleRunner.eq(158, 10, new DivideAndShift().getLeast(80640, 11));
    ExampleRunner.eq(159, 2, new DivideAndShift().getLeast(68, 4));
    ExampleRunner.eq(160, 1, new DivideAndShift().getLeast(147, 147));
    ExampleRunner.eq(161, 1, new DivideAndShift().getLeast(100003, 12345));
    ExampleRunner.eq(162, 3, new DivideAndShift().getLeast(899197, 123934));
    ExampleRunner.eq(163, 11, new DivideAndShift().getLeast(1000000, 15724));
    ExampleRunner.eq(164, 18, new DivideAndShift().getLeast(524288, 524270));
    ExampleRunner.eq(165, 12, new DivideAndShift().getLeast(531441, 531411));
    ExampleRunner.eq(166, 7, new DivideAndShift().getLeast(987584, 675947));
    ExampleRunner.eq(167, 2, new DivideAndShift().getLeast(999997, 65537));
    ExampleRunner.eq(168, 9, new DivideAndShift().getLeast(500000, 102020));
    ExampleRunner.eq(169, 18, new DivideAndShift().getLeast(524288, 1934));
    ExampleRunner.eq(170, 2, new DivideAndShift().getLeast(18, 5));
    ExampleRunner.eq(171, 1, new DivideAndShift().getLeast(983557, 343));
    ExampleRunner.eq(172, 1, new DivideAndShift().getLeast(55, 6));
    ExampleRunner.eq(173, 2, new DivideAndShift().getLeast(931327, 889286));
    ExampleRunner.eq(174, 7, new DivideAndShift().getLeast(362880, 123456));
    ExampleRunner.eq(175, 1, new DivideAndShift().getLeast(391, 18));
    ExampleRunner.eq(176, 2, new DivideAndShift().getLeast(1001, 1000));
    ExampleRunner.eq(177, 1, new DivideAndShift().getLeast(524287, 123456));
    ExampleRunner.eq(178, 4, new DivideAndShift().getLeast(198273, 128376));
    ExampleRunner.eq(179, 2, new DivideAndShift().getLeast(4199, 18));
    ExampleRunner.eq(180, 2, new DivideAndShift().getLeast(8, 4));
    ExampleRunner.eq(181, 1, new DivideAndShift().getLeast(7, 4));
    ExampleRunner.eq(182, 16, new DivideAndShift().getLeast(524288, 50));
    ExampleRunner.eq(183, 1, new DivideAndShift().getLeast(87, 85));
    ExampleRunner.eq(184, 5, new DivideAndShift().getLeast(510510, 1991));
    ExampleRunner.eq(185, 1, new DivideAndShift().getLeast(200006, 3));
    ExampleRunner.eq(186, 10, new DivideAndShift().getLeast(997920, 111111));
    ExampleRunner.eq(187, 17, new DivideAndShift().getLeast(524288, 523066));
    ExampleRunner.eq(188, 1, new DivideAndShift().getLeast(510510, 30031));
    ExampleRunner.eq(189, 3, new DivideAndShift().getLeast(5706, 5322));
  }
}
