package p400.srm464;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 28.04.2010
 * Time: 10:13:45
 */
public class ColorfulBoxesAndBallsTest {
  public static void main(String[] args) {
    ExampleRunner.eq(1, 1400, new ColorfulBoxesAndBalls().getMaximum(2, 3, 100, 400, 200));
    ExampleRunner.eq(2, 1600, new ColorfulBoxesAndBalls().getMaximum(2, 3, 100, 400, 300));
    ExampleRunner.eq(3, 4640, new ColorfulBoxesAndBalls().getMaximum(5, 5, 464, 464, 464));
    ExampleRunner.eq(4, -100, new ColorfulBoxesAndBalls().getMaximum(1, 4, 20, -30, -10));
    ExampleRunner.eq(5, 0, new ColorfulBoxesAndBalls().getMaximum(9, 1, -1, -10, 4));
    ExampleRunner.eq(6, 0, new ColorfulBoxesAndBalls().getMaximum(1, 1, 0, 0, 0));
    ExampleRunner.eq(7, 200000, new ColorfulBoxesAndBalls().getMaximum(100, 100, 1000, 1000, 1000));
    ExampleRunner.eq(8, -200000, new ColorfulBoxesAndBalls().getMaximum(100, 100, -1000, -1000, -1000));
    ExampleRunner.eq(9, 0, new ColorfulBoxesAndBalls().getMaximum(46, 18, -99, 253, 76));
    ExampleRunner.eq(10, 0, new ColorfulBoxesAndBalls().getMaximum(46, 18, -99, 252, 77));
    ExampleRunner.eq(11, 0, new ColorfulBoxesAndBalls().getMaximum(46, 18, -99, 253, 77));
    ExampleRunner.eq(12, 35981, new ColorfulBoxesAndBalls().getMaximum(4, 61, 379, 565, 277));
    ExampleRunner.eq(13, 20734, new ColorfulBoxesAndBalls().getMaximum(29, 86, -664, 465, -199));
    ExampleRunner.eq(14, 107202, new ColorfulBoxesAndBalls().getMaximum(98, 26, 944, 565, 126));
    ExampleRunner.eq(15, 150144, new ColorfulBoxesAndBalls().getMaximum(96, 96, -221, 310, 782));
    ExampleRunner.eq(16, 73306, new ColorfulBoxesAndBalls().getMaximum(41, 79, 733, 110, 843));
    ExampleRunner.eq(17, 86367, new ColorfulBoxesAndBalls().getMaximum(87, 16, 969, -997, 549));
    ExampleRunner.eq(18, -20658, new ColorfulBoxesAndBalls().getMaximum(33, 33, -976, -185, -313));
    ExampleRunner.eq(19, 36235, new ColorfulBoxesAndBalls().getMaximum(29, 12, 947, 731, -886));
    ExampleRunner.eq(20, 39668, new ColorfulBoxesAndBalls().getMaximum(46, 28, 166, 238, 655));
    ExampleRunner.eq(21, -31776, new ColorfulBoxesAndBalls().getMaximum(40, 2, -792, -48, -488));
    ExampleRunner.eq(22, 9969, new ColorfulBoxesAndBalls().getMaximum(21, 50, -611, 456, -155));
    ExampleRunner.eq(23, 1025, new ColorfulBoxesAndBalls().getMaximum(41, 41, -767, 792, -947));
    ExampleRunner.eq(24, -24400, new ColorfulBoxesAndBalls().getMaximum(18, 32, -408, -533, -956));
    ExampleRunner.eq(25, -27540, new ColorfulBoxesAndBalls().getMaximum(12, 48, -767, -747, -27));
    ExampleRunner.eq(26, 62424, new ColorfulBoxesAndBalls().getMaximum(34, 34, -120, -857, 918));
    ExampleRunner.eq(27, -21849, new ColorfulBoxesAndBalls().getMaximum(36, 37, -795, 183, -612));
    ExampleRunner.eq(28, 141772, new ColorfulBoxesAndBalls().getMaximum(92, 92, 978, 563, 624));
    ExampleRunner.eq(29, 75078, new ColorfulBoxesAndBalls().getMaximum(97, 97, 530, 244, -168));
    ExampleRunner.eq(30, 147224, new ColorfulBoxesAndBalls().getMaximum(77, 77, 12, -239, 956));
    ExampleRunner.eq(31, -37241, new ColorfulBoxesAndBalls().getMaximum(82, 99, -494, 33, -544));
    ExampleRunner.eq(32, 1912, new ColorfulBoxesAndBalls().getMaximum(100, 4, 20, -300, -1));
    ExampleRunner.eq(33, -524, new ColorfulBoxesAndBalls().getMaximum(45, 23, -74, 67, 24));
    ExampleRunner.eq(34, 1400, new ColorfulBoxesAndBalls().getMaximum(2, 2, 500, 200, 100));
    ExampleRunner.eq(35, 44, new ColorfulBoxesAndBalls().getMaximum(8, 2, 2, 4, 8));
    ExampleRunner.eq(36, 199700, new ColorfulBoxesAndBalls().getMaximum(100, 100, 999, 998, -999));
    ExampleRunner.eq(37, 100000, new ColorfulBoxesAndBalls().getMaximum(100, 100, -1000, -1000, 500));
    ExampleRunner.eq(38, 2000, new ColorfulBoxesAndBalls().getMaximum(10, 10, 1, 1, 100));
    ExampleRunner.eq(39, -60870, new ColorfulBoxesAndBalls().getMaximum(63, 65, -700, -258, -952));
    ExampleRunner.eq(40, 5169, new ColorfulBoxesAndBalls().getMaximum(99, 56, 3, 2, 45));
    ExampleRunner.eq(41, -15, new ColorfulBoxesAndBalls().getMaximum(7, 4, -5, -2, 0));
    ExampleRunner.eq(42, 14, new ColorfulBoxesAndBalls().getMaximum(3, 2, 2, 3, 3));
    ExampleRunner.eq(43, 60000, new ColorfulBoxesAndBalls().getMaximum(100, 100, 100, 200, 300));
    ExampleRunner.eq(44, -20, new ColorfulBoxesAndBalls().getMaximum(2, 2, -5, -5, -5));
    ExampleRunner.eq(45, 15000, new ColorfulBoxesAndBalls().getMaximum(7, 8, 1000, 1000, 1));
    ExampleRunner.eq(46, 6000, new ColorfulBoxesAndBalls().getMaximum(10, 10, 300, 300, 1));
    ExampleRunner.eq(47, 0, new ColorfulBoxesAndBalls().getMaximum(10, 10, -10, 1, 0));
    ExampleRunner.eq(48, -11286, new ColorfulBoxesAndBalls().getMaximum(54, 69, 522, -630, -17));
    ExampleRunner.eq(49, 1100, new ColorfulBoxesAndBalls().getMaximum(5, 3, 100, 200, -500));
    ExampleRunner.eq(50, 1090, new ColorfulBoxesAndBalls().getMaximum(10, 1, 10, 501, 500));
    ExampleRunner.eq(51, 2900, new ColorfulBoxesAndBalls().getMaximum(2, 1, 1000, 900, 100));
    ExampleRunner.eq(52, 1000, new ColorfulBoxesAndBalls().getMaximum(2, 2, 100, 300, 250));
    ExampleRunner.eq(53, 300, new ColorfulBoxesAndBalls().getMaximum(100, 100, 2, 1, 1));
    ExampleRunner.eq(54, 163, new ColorfulBoxesAndBalls().getMaximum(10, 9, 1, 10, 9));
    ExampleRunner.eq(55, 6000, new ColorfulBoxesAndBalls().getMaximum(10, 4, 400, 500, 450));
    ExampleRunner.eq(56, 4, new ColorfulBoxesAndBalls().getMaximum(1, 1, 2, -6, 2));
    ExampleRunner.eq(57, 20, new ColorfulBoxesAndBalls().getMaximum(1, 1, 1, 1, 10));
    ExampleRunner.eq(58, 3980, new ColorfulBoxesAndBalls().getMaximum(100, 90, 20, 19, 21));
    ExampleRunner.eq(59, 1300, new ColorfulBoxesAndBalls().getMaximum(2, 3, 400, 100, 300));
  }
}
