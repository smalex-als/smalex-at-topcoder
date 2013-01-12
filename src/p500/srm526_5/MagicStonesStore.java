package p500.srm526_5;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 12/23/11
 * Time: 9:07 PM
 */
public class MagicStonesStore {
  private boolean[] prime;

  public String ableToDivide(int n) {
    initPrime(2 * n + 1);
    for (int i = 0; i <= 2 * n; i++) {
      if (isPrime(i) && isPrime(2 * n - i)) {
        return "YES";
      }
    }
    return "NO";
  }

  private boolean isPrime(int num) {
    return prime[num];
  }

  private void initPrime(int n) {
    prime = new boolean[n];
    for (int i = 2; i < prime.length; i++) {
      prime[i] = true;
    }
    for (int i = 2; i * i < n; i++) {
      if (prime[i]) {
        for (int j = i + i; j < n; j += i) {
          prime[j] = false;
        }
      }
    }
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, "NO", new MagicStonesStore().ableToDivide(1));
    ExampleRunner.eq(2, "YES", new MagicStonesStore().ableToDivide(2));
    ExampleRunner.eq(3, "YES", new MagicStonesStore().ableToDivide(3));
    ExampleRunner.eq(4, "YES", new MagicStonesStore().ableToDivide(5));
    ExampleRunner.eq(5, "NO", new MagicStonesStore().ableToDivide(1));
    ExampleRunner.eq(6, "YES", new MagicStonesStore().ableToDivide(2));
    ExampleRunner.eq(7, "YES", new MagicStonesStore().ableToDivide(3));
    ExampleRunner.eq(8, "YES", new MagicStonesStore().ableToDivide(4));
    ExampleRunner.eq(9, "YES", new MagicStonesStore().ableToDivide(5));
    ExampleRunner.eq(10, "YES", new MagicStonesStore().ableToDivide(6));
    ExampleRunner.eq(11, "YES", new MagicStonesStore().ableToDivide(7));
    ExampleRunner.eq(12, "YES", new MagicStonesStore().ableToDivide(8));
    ExampleRunner.eq(13, "YES", new MagicStonesStore().ableToDivide(9));
    ExampleRunner.eq(14, "YES", new MagicStonesStore().ableToDivide(10));
    ExampleRunner.eq(15, "YES", new MagicStonesStore().ableToDivide(1000));
    ExampleRunner.eq(16, "YES", new MagicStonesStore().ableToDivide(999));
    ExampleRunner.eq(17, "YES", new MagicStonesStore().ableToDivide(998));
    ExampleRunner.eq(18, "YES", new MagicStonesStore().ableToDivide(997));
    ExampleRunner.eq(19, "YES", new MagicStonesStore().ableToDivide(996));
    ExampleRunner.eq(20, "YES", new MagicStonesStore().ableToDivide(995));
    ExampleRunner.eq(21, "YES", new MagicStonesStore().ableToDivide(994));
    ExampleRunner.eq(22, "YES", new MagicStonesStore().ableToDivide(993));
    ExampleRunner.eq(23, "YES", new MagicStonesStore().ableToDivide(992));
    ExampleRunner.eq(24, "YES", new MagicStonesStore().ableToDivide(991));
    ExampleRunner.eq(25, "YES", new MagicStonesStore().ableToDivide(990));
    ExampleRunner.eq(26, "YES", new MagicStonesStore().ableToDivide(734));
    ExampleRunner.eq(27, "YES", new MagicStonesStore().ableToDivide(589));
    ExampleRunner.eq(28, "YES", new MagicStonesStore().ableToDivide(397));
    ExampleRunner.eq(29, "YES", new MagicStonesStore().ableToDivide(492));
    ExampleRunner.eq(30, "YES", new MagicStonesStore().ableToDivide(629));
    ExampleRunner.eq(31, "YES", new MagicStonesStore().ableToDivide(368));
    ExampleRunner.eq(32, "YES", new MagicStonesStore().ableToDivide(230));
    ExampleRunner.eq(33, "YES", new MagicStonesStore().ableToDivide(923));
    ExampleRunner.eq(34, "YES", new MagicStonesStore().ableToDivide(784));
    ExampleRunner.eq(35, "YES", new MagicStonesStore().ableToDivide(259));
    ExampleRunner.eq(36, "YES", new MagicStonesStore().ableToDivide(84));
    ExampleRunner.eq(37, "YES", new MagicStonesStore().ableToDivide(986));
    ExampleRunner.eq(38, "YES", new MagicStonesStore().ableToDivide(399));
    ExampleRunner.eq(39, "YES", new MagicStonesStore().ableToDivide(443));
    ExampleRunner.eq(40, "YES", new MagicStonesStore().ableToDivide(609));
    ExampleRunner.eq(41, "YES", new MagicStonesStore().ableToDivide(165));
    ExampleRunner.eq(42, "YES", new MagicStonesStore().ableToDivide(953));
    ExampleRunner.eq(43, "YES", new MagicStonesStore().ableToDivide(529));
    ExampleRunner.eq(44, "YES", new MagicStonesStore().ableToDivide(520));
    ExampleRunner.eq(45, "YES", new MagicStonesStore().ableToDivide(372));
    ExampleRunner.eq(46, "YES", new MagicStonesStore().ableToDivide(776));
    ExampleRunner.eq(47, "YES", new MagicStonesStore().ableToDivide(322));
    ExampleRunner.eq(48, "YES", new MagicStonesStore().ableToDivide(254));
    ExampleRunner.eq(49, "YES", new MagicStonesStore().ableToDivide(295));
    ExampleRunner.eq(50, "YES", new MagicStonesStore().ableToDivide(108));
    ExampleRunner.eq(51, "YES", new MagicStonesStore().ableToDivide(972));
    ExampleRunner.eq(52, "YES", new MagicStonesStore().ableToDivide(514));
    ExampleRunner.eq(53, "YES", new MagicStonesStore().ableToDivide(336));
    ExampleRunner.eq(54, "YES", new MagicStonesStore().ableToDivide(367));
    ExampleRunner.eq(55, "YES", new MagicStonesStore().ableToDivide(803));
    ExampleRunner.eq(56, "YES", new MagicStonesStore().ableToDivide(918));
    ExampleRunner.eq(57, "YES", new MagicStonesStore().ableToDivide(521));
    ExampleRunner.eq(58, "YES", new MagicStonesStore().ableToDivide(225));
    ExampleRunner.eq(59, "YES", new MagicStonesStore().ableToDivide(253));
    ExampleRunner.eq(60, "YES", new MagicStonesStore().ableToDivide(774));
    ExampleRunner.eq(61, "YES", new MagicStonesStore().ableToDivide(888));
    ExampleRunner.eq(62, "YES", new MagicStonesStore().ableToDivide(142));
    ExampleRunner.eq(63, "YES", new MagicStonesStore().ableToDivide(690));
    ExampleRunner.eq(64, "YES", new MagicStonesStore().ableToDivide(361));
    ExampleRunner.eq(65, "YES", new MagicStonesStore().ableToDivide(280));
    ExampleRunner.eq(66, "YES", new MagicStonesStore().ableToDivide(5));
    ExampleRunner.eq(67, "YES", new MagicStonesStore().ableToDivide(800));
    ExampleRunner.eq(68, "YES", new MagicStonesStore().ableToDivide(878));
    ExampleRunner.eq(69, "YES", new MagicStonesStore().ableToDivide(979));
    ExampleRunner.eq(70, "YES", new MagicStonesStore().ableToDivide(409));
    ExampleRunner.eq(71, "YES", new MagicStonesStore().ableToDivide(862));
    ExampleRunner.eq(72, "YES", new MagicStonesStore().ableToDivide(449));
    ExampleRunner.eq(73, "YES", new MagicStonesStore().ableToDivide(941));
    ExampleRunner.eq(74, "YES", new MagicStonesStore().ableToDivide(509));
    ExampleRunner.eq(75, "YES", new MagicStonesStore().ableToDivide(280));
    ExampleRunner.eq(76, "YES", new MagicStonesStore().ableToDivide(421));
    ExampleRunner.eq(77, "YES", new MagicStonesStore().ableToDivide(378));
    ExampleRunner.eq(78, "YES", new MagicStonesStore().ableToDivide(123));
    ExampleRunner.eq(79, "YES", new MagicStonesStore().ableToDivide(666));
    ExampleRunner.eq(80, "YES", new MagicStonesStore().ableToDivide(268));
    ExampleRunner.eq(81, "YES", new MagicStonesStore().ableToDivide(770));
    ExampleRunner.eq(82, "YES", new MagicStonesStore().ableToDivide(134));
    ExampleRunner.eq(83, "YES", new MagicStonesStore().ableToDivide(992));
    ExampleRunner.eq(84, "YES", new MagicStonesStore().ableToDivide(485));
    ExampleRunner.eq(85, "YES", new MagicStonesStore().ableToDivide(412));
    ExampleRunner.eq(86, "YES", new MagicStonesStore().ableToDivide(978));
    ExampleRunner.eq(87, "YES", new MagicStonesStore().ableToDivide(110));
    ExampleRunner.eq(88, "YES", new MagicStonesStore().ableToDivide(798));
    ExampleRunner.eq(89, "YES", new MagicStonesStore().ableToDivide(600));
    ExampleRunner.eq(90, "YES", new MagicStonesStore().ableToDivide(904));
    ExampleRunner.eq(91, "YES", new MagicStonesStore().ableToDivide(75));
    ExampleRunner.eq(92, "YES", new MagicStonesStore().ableToDivide(211));
    ExampleRunner.eq(93, "YES", new MagicStonesStore().ableToDivide(410));
    ExampleRunner.eq(94, "YES", new MagicStonesStore().ableToDivide(814));
    ExampleRunner.eq(95, "YES", new MagicStonesStore().ableToDivide(676));
    ExampleRunner.eq(96, "YES", new MagicStonesStore().ableToDivide(301));
    ExampleRunner.eq(97, "YES", new MagicStonesStore().ableToDivide(524));
    ExampleRunner.eq(98, "YES", new MagicStonesStore().ableToDivide(702));
    ExampleRunner.eq(99, "YES", new MagicStonesStore().ableToDivide(790));
    ExampleRunner.eq(100, "YES", new MagicStonesStore().ableToDivide(221));
    ExampleRunner.eq(101, "YES", new MagicStonesStore().ableToDivide(27));
    ExampleRunner.eq(102, "YES", new MagicStonesStore().ableToDivide(998));
    ExampleRunner.eq(103, "YES", new MagicStonesStore().ableToDivide(547));
    ExampleRunner.eq(104, "YES", new MagicStonesStore().ableToDivide(563));
    ExampleRunner.eq(105, "YES", new MagicStonesStore().ableToDivide(445));
    ExampleRunner.eq(106, "YES", new MagicStonesStore().ableToDivide(992));
    ExampleRunner.eq(107, "YES", new MagicStonesStore().ableToDivide(217));
    ExampleRunner.eq(108, "YES", new MagicStonesStore().ableToDivide(395));
    ExampleRunner.eq(109, "YES", new MagicStonesStore().ableToDivide(417));
    ExampleRunner.eq(110, "YES", new MagicStonesStore().ableToDivide(323));
    ExampleRunner.eq(111, "YES", new MagicStonesStore().ableToDivide(471));
    ExampleRunner.eq(112, "YES", new MagicStonesStore().ableToDivide(639));
    ExampleRunner.eq(113, "YES", new MagicStonesStore().ableToDivide(272));
    ExampleRunner.eq(114, "YES", new MagicStonesStore().ableToDivide(473));
    ExampleRunner.eq(115, "YES", new MagicStonesStore().ableToDivide(129));
    ExampleRunner.eq(116, "YES", new MagicStonesStore().ableToDivide(99));
    ExampleRunner.eq(117, "YES", new MagicStonesStore().ableToDivide(746));
    ExampleRunner.eq(118, "YES", new MagicStonesStore().ableToDivide(882));
    ExampleRunner.eq(119, "YES", new MagicStonesStore().ableToDivide(14));
    ExampleRunner.eq(120, "YES", new MagicStonesStore().ableToDivide(516));
    ExampleRunner.eq(121, "YES", new MagicStonesStore().ableToDivide(356));
    ExampleRunner.eq(122, "YES", new MagicStonesStore().ableToDivide(458));
    ExampleRunner.eq(123, "YES", new MagicStonesStore().ableToDivide(721));
    ExampleRunner.eq(124, "YES", new MagicStonesStore().ableToDivide(602));
    ExampleRunner.eq(125, "YES", new MagicStonesStore().ableToDivide(25));
    ExampleRunner.eq(126, "YES", new MagicStonesStore().ableToDivide(500));
    ExampleRunner.eq(127, "YES", new MagicStonesStore().ableToDivide(961));
    ExampleRunner.eq(128, "YES", new MagicStonesStore().ableToDivide(36));
    ExampleRunner.eq(129, "YES", new MagicStonesStore().ableToDivide(12));
    ExampleRunner.eq(130, "YES", new MagicStonesStore().ableToDivide(403));
    ExampleRunner.eq(131, "YES", new MagicStonesStore().ableToDivide(11));
    ExampleRunner.eq(132, "YES", new MagicStonesStore().ableToDivide(33));
    ExampleRunner.eq(133, "YES", new MagicStonesStore().ableToDivide(65));
    ExampleRunner.eq(134, "YES", new MagicStonesStore().ableToDivide(17));
    ExampleRunner.eq(135, "YES", new MagicStonesStore().ableToDivide(24));
  }
}
