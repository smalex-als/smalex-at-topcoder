package p400.srm485;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 16.12.10
 * Time: 12:24
 */
public class MicrowaveSelling {
  public int mostAttractivePrice(int minPrice, int maxPrice) {
    int goodPrice = maxPrice;
    int goodLength = 0;

    for (int i = maxPrice; i >= minPrice; i--) {
      final String str = String.valueOf(i);
      int length = 0;
      for (int j = str.length() - 1; j >= 0; j--) {
        if (str.charAt(j) == '9') {
          length++;
        } else {
          break;
        }
      }
      if (length > goodLength) {
        goodPrice = i;
        goodLength = length;
      }
    }
    return goodPrice;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 599, new MicrowaveSelling().mostAttractivePrice(460, 680));
    ExampleRunner.eq(2, 999, new MicrowaveSelling().mostAttractivePrice(10, 1000));
    ExampleRunner.eq(3, 2999, new MicrowaveSelling().mostAttractivePrice(1255, 2999));
    ExampleRunner.eq(4, 25, new MicrowaveSelling().mostAttractivePrice(20, 25));
    ExampleRunner.eq(5, 999999, new MicrowaveSelling().mostAttractivePrice(1, 1000000));
    ExampleRunner.eq(6, 999999, new MicrowaveSelling().mostAttractivePrice(1, 999999));
    ExampleRunner.eq(7, 899999, new MicrowaveSelling().mostAttractivePrice(1, 999998));
    ExampleRunner.eq(8, 999999, new MicrowaveSelling().mostAttractivePrice(10, 1000000));
    ExampleRunner.eq(9, 1, new MicrowaveSelling().mostAttractivePrice(1, 1));
    ExampleRunner.eq(10, 999999, new MicrowaveSelling().mostAttractivePrice(999999, 999999));
    ExampleRunner.eq(11, 9, new MicrowaveSelling().mostAttractivePrice(6, 11));
    ExampleRunner.eq(12, 299999, new MicrowaveSelling().mostAttractivePrice(6, 315279));
    ExampleRunner.eq(13, 99, new MicrowaveSelling().mostAttractivePrice(79, 100));
    ExampleRunner.eq(14, 3999, new MicrowaveSelling().mostAttractivePrice(770, 4520));
    ExampleRunner.eq(15, 1999, new MicrowaveSelling().mostAttractivePrice(1024, 2048));
    ExampleRunner.eq(16, 3349, new MicrowaveSelling().mostAttractivePrice(3310, 3358));
    ExampleRunner.eq(17, 9999, new MicrowaveSelling().mostAttractivePrice(9999, 9999));
    ExampleRunner.eq(18, 9999, new MicrowaveSelling().mostAttractivePrice(9999, 10000));
    ExampleRunner.eq(19, 99999, new MicrowaveSelling().mostAttractivePrice(99091, 107993));
    ExampleRunner.eq(20, 79999, new MicrowaveSelling().mostAttractivePrice(3019, 80000));
    ExampleRunner.eq(21, 399999, new MicrowaveSelling().mostAttractivePrice(60020, 499997));
    ExampleRunner.eq(22, 199999, new MicrowaveSelling().mostAttractivePrice(18, 200318));
    ExampleRunner.eq(23, 990000, new MicrowaveSelling().mostAttractivePrice(990000, 990000));
    ExampleRunner.eq(24, 789999, new MicrowaveSelling().mostAttractivePrice(770709, 790334));
    ExampleRunner.eq(25, 99999, new MicrowaveSelling().mostAttractivePrice(10000, 199998));
    ExampleRunner.eq(26, 527189, new MicrowaveSelling().mostAttractivePrice(527186, 527189));
    ExampleRunner.eq(27, 999299, new MicrowaveSelling().mostAttractivePrice(999299, 999369));
    ExampleRunner.eq(28, 895999, new MicrowaveSelling().mostAttractivePrice(895992, 896005));
    ExampleRunner.eq(29, 899999, new MicrowaveSelling().mostAttractivePrice(667202, 983878));
    ExampleRunner.eq(30, 39999, new MicrowaveSelling().mostAttractivePrice(400, 40000));
    ExampleRunner.eq(31, 599999, new MicrowaveSelling().mostAttractivePrice(81592, 673912));
    ExampleRunner.eq(32, 69999, new MicrowaveSelling().mostAttractivePrice(56097, 74992));
    ExampleRunner.eq(33, 799999, new MicrowaveSelling().mostAttractivePrice(785785, 800020));
    ExampleRunner.eq(34, 5999, new MicrowaveSelling().mostAttractivePrice(17, 6998));
    ExampleRunner.eq(35, 899999, new MicrowaveSelling().mostAttractivePrice(3, 999991));
    ExampleRunner.eq(36, 999999, new MicrowaveSelling().mostAttractivePrice(80, 1000000));
    ExampleRunner.eq(37, 666666, new MicrowaveSelling().mostAttractivePrice(666666, 666666));
    ExampleRunner.eq(38, 89999, new MicrowaveSelling().mostAttractivePrice(999, 90999));
    ExampleRunner.eq(39, 19, new MicrowaveSelling().mostAttractivePrice(18, 21));
    ExampleRunner.eq(40, 189, new MicrowaveSelling().mostAttractivePrice(100, 198));
    ExampleRunner.eq(41, 12339, new MicrowaveSelling().mostAttractivePrice(12330, 12345));
    ExampleRunner.eq(42, 899, new MicrowaveSelling().mostAttractivePrice(899, 909));
    ExampleRunner.eq(43, 8999, new MicrowaveSelling().mostAttractivePrice(1, 9989));
    ExampleRunner.eq(44, 899, new MicrowaveSelling().mostAttractivePrice(99, 909));
    ExampleRunner.eq(45, 8999, new MicrowaveSelling().mostAttractivePrice(8999, 9099));
    ExampleRunner.eq(46, 89999, new MicrowaveSelling().mostAttractivePrice(1, 99998));
    ExampleRunner.eq(47, 8999, new MicrowaveSelling().mostAttractivePrice(1, 9100));
    ExampleRunner.eq(48, 8, new MicrowaveSelling().mostAttractivePrice(1, 8));
    ExampleRunner.eq(49, 9, new MicrowaveSelling().mostAttractivePrice(9, 18));
    ExampleRunner.eq(50, 989, new MicrowaveSelling().mostAttractivePrice(989, 991));
    ExampleRunner.eq(51, 89, new MicrowaveSelling().mostAttractivePrice(19, 90));
    ExampleRunner.eq(52, 9, new MicrowaveSelling().mostAttractivePrice(1, 10));
    ExampleRunner.eq(53, 9999, new MicrowaveSelling().mostAttractivePrice(1, 10897));
    ExampleRunner.eq(54, 9, new MicrowaveSelling().mostAttractivePrice(9, 10));
    ExampleRunner.eq(55, 1089, new MicrowaveSelling().mostAttractivePrice(1088, 1090));
    ExampleRunner.eq(56, 89, new MicrowaveSelling().mostAttractivePrice(89, 90));
    ExampleRunner.eq(57, 28999, new MicrowaveSelling().mostAttractivePrice(20000, 29099));
    ExampleRunner.eq(58, 28, new MicrowaveSelling().mostAttractivePrice(21, 28));
    ExampleRunner.eq(59, 3, new MicrowaveSelling().mostAttractivePrice(2, 3));
    ExampleRunner.eq(60, 899, new MicrowaveSelling().mostAttractivePrice(898, 909));
    ExampleRunner.eq(61, 9, new MicrowaveSelling().mostAttractivePrice(8, 16));
    ExampleRunner.eq(62, 8999, new MicrowaveSelling().mostAttractivePrice(1, 9991));
    ExampleRunner.eq(63, 2999, new MicrowaveSelling().mostAttractivePrice(1000, 3000));
    ExampleRunner.eq(64, 2899, new MicrowaveSelling().mostAttractivePrice(2000, 2989));
    ExampleRunner.eq(65, 89, new MicrowaveSelling().mostAttractivePrice(9, 90));
    ExampleRunner.eq(66, 8999, new MicrowaveSelling().mostAttractivePrice(998, 9100));
    ExampleRunner.eq(67, 8999, new MicrowaveSelling().mostAttractivePrice(1, 9099));
    ExampleRunner.eq(68, 899, new MicrowaveSelling().mostAttractivePrice(800, 910));
    ExampleRunner.eq(69, 899, new MicrowaveSelling().mostAttractivePrice(1, 919));
    ExampleRunner.eq(70, 109, new MicrowaveSelling().mostAttractivePrice(109, 110));
    ExampleRunner.eq(71, 99, new MicrowaveSelling().mostAttractivePrice(98, 110));
    ExampleRunner.eq(72, 2899, new MicrowaveSelling().mostAttractivePrice(2000, 2998));
    ExampleRunner.eq(73, 89, new MicrowaveSelling().mostAttractivePrice(89, 92));
    ExampleRunner.eq(74, 4999, new MicrowaveSelling().mostAttractivePrice(4888, 5888));
    ExampleRunner.eq(75, 8999, new MicrowaveSelling().mostAttractivePrice(1, 9998));
    ExampleRunner.eq(76, 109, new MicrowaveSelling().mostAttractivePrice(108, 109));
    ExampleRunner.eq(77, 89, new MicrowaveSelling().mostAttractivePrice(89, 91));
    ExampleRunner.eq(78, 899, new MicrowaveSelling().mostAttractivePrice(1, 909));
    ExampleRunner.eq(79, 899, new MicrowaveSelling().mostAttractivePrice(199, 910));
    ExampleRunner.eq(80, 3999, new MicrowaveSelling().mostAttractivePrice(3999, 4600));
    ExampleRunner.eq(81, 8999, new MicrowaveSelling().mostAttractivePrice(1, 9909));
    ExampleRunner.eq(82, 19, new MicrowaveSelling().mostAttractivePrice(19, 20));
    ExampleRunner.eq(83, 1089, new MicrowaveSelling().mostAttractivePrice(1088, 1092));
    ExampleRunner.eq(84, 8899, new MicrowaveSelling().mostAttractivePrice(8099, 8909));
    ExampleRunner.eq(85, 969, new MicrowaveSelling().mostAttractivePrice(965, 970));
    ExampleRunner.eq(86, 1999, new MicrowaveSelling().mostAttractivePrice(1888, 2888));
    ExampleRunner.eq(87, 899, new MicrowaveSelling().mostAttractivePrice(899, 990));
    ExampleRunner.eq(88, 9999, new MicrowaveSelling().mostAttractivePrice(10, 12099));
    ExampleRunner.eq(89, 8999, new MicrowaveSelling().mostAttractivePrice(1, 9899));
    ExampleRunner.eq(90, 89, new MicrowaveSelling().mostAttractivePrice(79, 98));
    ExampleRunner.eq(91, 899999, new MicrowaveSelling().mostAttractivePrice(1, 909999));
    ExampleRunner.eq(92, 899, new MicrowaveSelling().mostAttractivePrice(881, 991));
    ExampleRunner.eq(93, 899, new MicrowaveSelling().mostAttractivePrice(9, 909));
    ExampleRunner.eq(94, 899, new MicrowaveSelling().mostAttractivePrice(199, 909));
    ExampleRunner.eq(95, 8999, new MicrowaveSelling().mostAttractivePrice(8100, 9099));
    ExampleRunner.eq(96, 8999, new MicrowaveSelling().mostAttractivePrice(8999, 9998));
    ExampleRunner.eq(97, 8879, new MicrowaveSelling().mostAttractivePrice(8878, 8888));
    ExampleRunner.eq(98, 8999, new MicrowaveSelling().mostAttractivePrice(1000, 9998));
    ExampleRunner.eq(99, 1899, new MicrowaveSelling().mostAttractivePrice(1099, 1909));
    ExampleRunner.eq(100, 8999, new MicrowaveSelling().mostAttractivePrice(8998, 9991));
    ExampleRunner.eq(101, 89999, new MicrowaveSelling().mostAttractivePrice(1, 92000));
    ExampleRunner.eq(102, 2009, new MicrowaveSelling().mostAttractivePrice(2003, 2010));
    ExampleRunner.eq(103, 99, new MicrowaveSelling().mostAttractivePrice(9, 100));
    ExampleRunner.eq(104, 8999, new MicrowaveSelling().mostAttractivePrice(8999, 9990));
    ExampleRunner.eq(105, 989, new MicrowaveSelling().mostAttractivePrice(900, 998));
    ExampleRunner.eq(106, 899, new MicrowaveSelling().mostAttractivePrice(199, 991));
    ExampleRunner.eq(107, 9899, new MicrowaveSelling().mostAttractivePrice(9000, 9998));
    ExampleRunner.eq(108, 9989, new MicrowaveSelling().mostAttractivePrice(9980, 9995));
    ExampleRunner.eq(109, 899, new MicrowaveSelling().mostAttractivePrice(800, 980));
    ExampleRunner.eq(110, 19, new MicrowaveSelling().mostAttractivePrice(10, 20));
    ExampleRunner.eq(111, 8899, new MicrowaveSelling().mostAttractivePrice(8899, 8909));
    ExampleRunner.eq(112, 9909, new MicrowaveSelling().mostAttractivePrice(9909, 9910));
    ExampleRunner.eq(113, 1999, new MicrowaveSelling().mostAttractivePrice(1, 1999));
    ExampleRunner.eq(114, 7959, new MicrowaveSelling().mostAttractivePrice(7950, 7960));
    ExampleRunner.eq(115, 9989, new MicrowaveSelling().mostAttractivePrice(9989, 9990));
    ExampleRunner.eq(116, 99, new MicrowaveSelling().mostAttractivePrice(99, 99));
    ExampleRunner.eq(117, 1499, new MicrowaveSelling().mostAttractivePrice(1236, 1526));
    ExampleRunner.eq(118, 899999, new MicrowaveSelling().mostAttractivePrice(18999, 999990));
    ExampleRunner.eq(119, 99989, new MicrowaveSelling().mostAttractivePrice(99989, 99990));
    ExampleRunner.eq(120, 989, new MicrowaveSelling().mostAttractivePrice(989, 990));
    ExampleRunner.eq(121, 19, new MicrowaveSelling().mostAttractivePrice(19, 24));
  }
}
