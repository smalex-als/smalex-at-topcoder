package p600.srm619;

import utils.ExampleRunner;

import java.util.LinkedList;

/**
 * Created by smalex on 10/06/15.
 */
public class ChooseTheBestOne {
  public int countNumber(int N) {
    LinkedList<Integer> items = new LinkedList<Integer>();
    for (int i = 1; i <= N; i++) {
      items.add(i);
    }
    int cur = 0;
    for (int i = 1; i < N; i++) {
      int count = (int)(((long) i * (long) i * (long) i - 1L) % (long) items.size());
      final int index = (cur + count) % items.size();
      items.remove(index);
      cur = index;
    }
    return items.get(0);
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 2, new ChooseTheBestOne().countNumber(3));
    ExampleRunner.eq(2, 6, new ChooseTheBestOne().countNumber(6));
    ExampleRunner.eq(3, 8, new ChooseTheBestOne().countNumber(10));
    ExampleRunner.eq(4, 341, new ChooseTheBestOne().countNumber(1234));
    ExampleRunner.eq(5, 1368, new ChooseTheBestOne().countNumber(2414));
    ExampleRunner.eq(6, 767, new ChooseTheBestOne().countNumber(1506));
    ExampleRunner.eq(7, 405, new ChooseTheBestOne().countNumber(1113));
    ExampleRunner.eq(8, 1286, new ChooseTheBestOne().countNumber(2462));
    ExampleRunner.eq(9, 1635, new ChooseTheBestOne().countNumber(3423));
    ExampleRunner.eq(10, 1386, new ChooseTheBestOne().countNumber(3647));
    ExampleRunner.eq(11, 833, new ChooseTheBestOne().countNumber(2172));
    ExampleRunner.eq(12, 1520, new ChooseTheBestOne().countNumber(2065));
    ExampleRunner.eq(13, 299, new ChooseTheBestOne().countNumber(2749));
    ExampleRunner.eq(14, 732, new ChooseTheBestOne().countNumber(1756));
    ExampleRunner.eq(15, 583, new ChooseTheBestOne().countNumber(2471));
    ExampleRunner.eq(16, 551, new ChooseTheBestOne().countNumber(1840));
    ExampleRunner.eq(17, 42, new ChooseTheBestOne().countNumber(2577));
    ExampleRunner.eq(18, 1389, new ChooseTheBestOne().countNumber(2293));
    ExampleRunner.eq(19, 1070, new ChooseTheBestOne().countNumber(2201));
    ExampleRunner.eq(20, 1618, new ChooseTheBestOne().countNumber(1839));
    ExampleRunner.eq(21, 32, new ChooseTheBestOne().countNumber(120));
    ExampleRunner.eq(22, 818, new ChooseTheBestOne().countNumber(3522));
    ExampleRunner.eq(23, 1283, new ChooseTheBestOne().countNumber(2078));
    ExampleRunner.eq(24, 208, new ChooseTheBestOne().countNumber(657));
    ExampleRunner.eq(25, 634, new ChooseTheBestOne().countNumber(1421));
    ExampleRunner.eq(26, 276, new ChooseTheBestOne().countNumber(2040));
    ExampleRunner.eq(27, 776, new ChooseTheBestOne().countNumber(1660));
    ExampleRunner.eq(28, 499, new ChooseTheBestOne().countNumber(1366));
    ExampleRunner.eq(29, 117, new ChooseTheBestOne().countNumber(201));
    ExampleRunner.eq(30, 2687, new ChooseTheBestOne().countNumber(4887));
    ExampleRunner.eq(31, 654, new ChooseTheBestOne().countNumber(1780));
    ExampleRunner.eq(32, 87, new ChooseTheBestOne().countNumber(2056));
    ExampleRunner.eq(33, 158, new ChooseTheBestOne().countNumber(1090));
    ExampleRunner.eq(34, 706, new ChooseTheBestOne().countNumber(996));
    ExampleRunner.eq(35, 72, new ChooseTheBestOne().countNumber(612));
    ExampleRunner.eq(36, 806, new ChooseTheBestOne().countNumber(1298));
    ExampleRunner.eq(37, 1526, new ChooseTheBestOne().countNumber(1650));
    ExampleRunner.eq(38, 1108, new ChooseTheBestOne().countNumber(1634));
    ExampleRunner.eq(39, 2654, new ChooseTheBestOne().countNumber(2899));
    ExampleRunner.eq(40, 250, new ChooseTheBestOne().countNumber(2306));
    ExampleRunner.eq(41, 997, new ChooseTheBestOne().countNumber(1369));
    ExampleRunner.eq(42, 482, new ChooseTheBestOne().countNumber(1261));
    ExampleRunner.eq(43, 615, new ChooseTheBestOne().countNumber(3396));
    ExampleRunner.eq(44, 1289, new ChooseTheBestOne().countNumber(2793));
    ExampleRunner.eq(45, 1583, new ChooseTheBestOne().countNumber(2566));
    ExampleRunner.eq(46, 2210, new ChooseTheBestOne().countNumber(2856));
    ExampleRunner.eq(47, 2681, new ChooseTheBestOne().countNumber(3607));
    ExampleRunner.eq(48, 380, new ChooseTheBestOne().countNumber(1080));
    ExampleRunner.eq(49, 112, new ChooseTheBestOne().countNumber(2626));
    ExampleRunner.eq(50, 923, new ChooseTheBestOne().countNumber(4207));
    ExampleRunner.eq(51, 2549, new ChooseTheBestOne().countNumber(2852));
    ExampleRunner.eq(52, 2112, new ChooseTheBestOne().countNumber(2525));
    ExampleRunner.eq(53, 587, new ChooseTheBestOne().countNumber(2349));
    ExampleRunner.eq(54, 2587, new ChooseTheBestOne().countNumber(3063));
    ExampleRunner.eq(55, 2580, new ChooseTheBestOne().countNumber(3306));
    ExampleRunner.eq(56, 1770, new ChooseTheBestOne().countNumber(1902));
    ExampleRunner.eq(57, 1195, new ChooseTheBestOne().countNumber(2141));
    ExampleRunner.eq(58, 2533, new ChooseTheBestOne().countNumber(2637));
    ExampleRunner.eq(59, 189, new ChooseTheBestOne().countNumber(559));
    ExampleRunner.eq(60, 228, new ChooseTheBestOne().countNumber(3037));
    ExampleRunner.eq(61, 3478, new ChooseTheBestOne().countNumber(3588));
    ExampleRunner.eq(62, 1508, new ChooseTheBestOne().countNumber(4916));
    ExampleRunner.eq(63, 2755, new ChooseTheBestOne().countNumber(4888));
    ExampleRunner.eq(64, 1471, new ChooseTheBestOne().countNumber(1781));
    ExampleRunner.eq(65, 662, new ChooseTheBestOne().countNumber(929));
    ExampleRunner.eq(66, 813, new ChooseTheBestOne().countNumber(867));
    ExampleRunner.eq(67, 1740, new ChooseTheBestOne().countNumber(2643));
    ExampleRunner.eq(68, 482, new ChooseTheBestOne().countNumber(1028));
    ExampleRunner.eq(69, 112, new ChooseTheBestOne().countNumber(498));
    ExampleRunner.eq(70, 17, new ChooseTheBestOne().countNumber(62));
    ExampleRunner.eq(71, 606, new ChooseTheBestOne().countNumber(1235));
    ExampleRunner.eq(72, 89, new ChooseTheBestOne().countNumber(386));
    ExampleRunner.eq(73, 835, new ChooseTheBestOne().countNumber(3801));
    ExampleRunner.eq(74, 482, new ChooseTheBestOne().countNumber(611));
    ExampleRunner.eq(75, 1886, new ChooseTheBestOne().countNumber(3748));
    ExampleRunner.eq(76, 733, new ChooseTheBestOne().countNumber(1433));
    ExampleRunner.eq(77, 72, new ChooseTheBestOne().countNumber(612));
    ExampleRunner.eq(78, 20, new ChooseTheBestOne().countNumber(56));
    ExampleRunner.eq(79, 1986, new ChooseTheBestOne().countNumber(2280));
    ExampleRunner.eq(80, 12, new ChooseTheBestOne().countNumber(101));
    ExampleRunner.eq(81, 2837, new ChooseTheBestOne().countNumber(3834));
    ExampleRunner.eq(82, 40, new ChooseTheBestOne().countNumber(4884));
    ExampleRunner.eq(83, 45, new ChooseTheBestOne().countNumber(4338));
    ExampleRunner.eq(84, 900, new ChooseTheBestOne().countNumber(2205));
    ExampleRunner.eq(85, 1, new ChooseTheBestOne().countNumber(1));
    ExampleRunner.eq(86, 2, new ChooseTheBestOne().countNumber(2));
    ExampleRunner.eq(87, 4200, new ChooseTheBestOne().countNumber(5000));
    ExampleRunner.eq(88, 1656, new ChooseTheBestOne().countNumber(4999));
    ExampleRunner.eq(89, 1680, new ChooseTheBestOne().countNumber(4000));
    ExampleRunner.eq(90, 140, new ChooseTheBestOne().countNumber(842));
    ExampleRunner.eq(91, 45, new ChooseTheBestOne().countNumber(1765));
    ExampleRunner.eq(92, 2035, new ChooseTheBestOne().countNumber(4894));
  }
}
