package p500.srm524;

import java.math.BigInteger;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 1/6/12
 * Time: 8:40 PM
 */
public class MagicDiamonds {
  public long minimalTransfer(long n) {
    long result = 0L;
    while (n > 0) {
      if (!BigInteger.valueOf(n).isProbablePrime(100)) {
        return result + 1;
      }
      n--;
      result++;
    }
    return result;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 2L,new MagicDiamonds().minimalTransfer(2L));
    ExampleRunner.eq(2, 1L,new MagicDiamonds().minimalTransfer(4294967297L));
    ExampleRunner.eq(3, 2L,new MagicDiamonds().minimalTransfer(2147483647L));
    ExampleRunner.eq(4, 1L,new MagicDiamonds().minimalTransfer(1L));
    ExampleRunner.eq(5, 1L,new MagicDiamonds().minimalTransfer(8566L));
    ExampleRunner.eq(6, 1L,new MagicDiamonds().minimalTransfer(6308L));
    ExampleRunner.eq(7, 1L,new MagicDiamonds().minimalTransfer(4081L));
    ExampleRunner.eq(8, 1L,new MagicDiamonds().minimalTransfer(5680L));
    ExampleRunner.eq(9, 1L,new MagicDiamonds().minimalTransfer(4427L));
    ExampleRunner.eq(10, 1L,new MagicDiamonds().minimalTransfer(2739L));
    ExampleRunner.eq(11, 1L,new MagicDiamonds().minimalTransfer(6181L));
    ExampleRunner.eq(12, 1L,new MagicDiamonds().minimalTransfer(6274L));
    ExampleRunner.eq(13, 1L,new MagicDiamonds().minimalTransfer(3601L));
    ExampleRunner.eq(14, 1L,new MagicDiamonds().minimalTransfer(7506L));
    ExampleRunner.eq(15, 2L,new MagicDiamonds().minimalTransfer(8951L));
    ExampleRunner.eq(16, 1L,new MagicDiamonds().minimalTransfer(5345L));
    ExampleRunner.eq(17, 1L,new MagicDiamonds().minimalTransfer(9621L));
    ExampleRunner.eq(18, 1L,new MagicDiamonds().minimalTransfer(9300L));
    ExampleRunner.eq(19, 2L,new MagicDiamonds().minimalTransfer(23L));
    ExampleRunner.eq(20, 1L,new MagicDiamonds().minimalTransfer(720L));
    ExampleRunner.eq(21, 1L,new MagicDiamonds().minimalTransfer(2151L));
    ExampleRunner.eq(22, 1L,new MagicDiamonds().minimalTransfer(7854L));
    ExampleRunner.eq(23, 2L,new MagicDiamonds().minimalTransfer(3607L));
    ExampleRunner.eq(24, 1L,new MagicDiamonds().minimalTransfer(1881L));
    ExampleRunner.eq(25, 1L,new MagicDiamonds().minimalTransfer(6076L));
    ExampleRunner.eq(26, 1L,new MagicDiamonds().minimalTransfer(9369L));
    ExampleRunner.eq(27, 2L,new MagicDiamonds().minimalTransfer(3853L));
    ExampleRunner.eq(28, 1L,new MagicDiamonds().minimalTransfer(8229L));
    ExampleRunner.eq(29, 1L,new MagicDiamonds().minimalTransfer(205L));
    ExampleRunner.eq(30, 1L,new MagicDiamonds().minimalTransfer(980L));
    ExampleRunner.eq(31, 1L,new MagicDiamonds().minimalTransfer(4197L));
    ExampleRunner.eq(32, 1L,new MagicDiamonds().minimalTransfer(1460L));
    ExampleRunner.eq(33, 2L,new MagicDiamonds().minimalTransfer(320020303L));
    ExampleRunner.eq(34, 1L,new MagicDiamonds().minimalTransfer(1021932001L));
    ExampleRunner.eq(35, 1L,new MagicDiamonds().minimalTransfer(1804873438L));
    ExampleRunner.eq(36, 1L,new MagicDiamonds().minimalTransfer(625102087L));
    ExampleRunner.eq(37, 1L,new MagicDiamonds().minimalTransfer(298989654L));
    ExampleRunner.eq(38, 1L,new MagicDiamonds().minimalTransfer(713692516L));
    ExampleRunner.eq(39, 1L,new MagicDiamonds().minimalTransfer(2019257625L));
    ExampleRunner.eq(40, 1L,new MagicDiamonds().minimalTransfer(1567124116L));
    ExampleRunner.eq(41, 1L,new MagicDiamonds().minimalTransfer(196044214L));
    ExampleRunner.eq(42, 1L,new MagicDiamonds().minimalTransfer(436143805L));
    ExampleRunner.eq(43, 1L,new MagicDiamonds().minimalTransfer(1906602942L));
    ExampleRunner.eq(44, 1L,new MagicDiamonds().minimalTransfer(1651588877L));
    ExampleRunner.eq(45, 1L,new MagicDiamonds().minimalTransfer(1477002708L));
    ExampleRunner.eq(46, 1L,new MagicDiamonds().minimalTransfer(1117874276L));
    ExampleRunner.eq(47, 1L,new MagicDiamonds().minimalTransfer(378147332L));
    ExampleRunner.eq(48, 1L,new MagicDiamonds().minimalTransfer(557741133L));
    ExampleRunner.eq(49, 1L,new MagicDiamonds().minimalTransfer(668154454L));
    ExampleRunner.eq(50, 1L,new MagicDiamonds().minimalTransfer(570251827L));
    ExampleRunner.eq(51, 1L,new MagicDiamonds().minimalTransfer(1039736738L));
    ExampleRunner.eq(52, 1L,new MagicDiamonds().minimalTransfer(2099585234L));
    ExampleRunner.eq(53, 1L,new MagicDiamonds().minimalTransfer(1981093541L));
    ExampleRunner.eq(54, 1L,new MagicDiamonds().minimalTransfer(1884363755L));
    ExampleRunner.eq(55, 1L,new MagicDiamonds().minimalTransfer(1865560917L));
    ExampleRunner.eq(56, 1L,new MagicDiamonds().minimalTransfer(745615932L));
    ExampleRunner.eq(57, 1L,new MagicDiamonds().minimalTransfer(1214865010L));
    ExampleRunner.eq(58, 1L,new MagicDiamonds().minimalTransfer(1695760303L));
    ExampleRunner.eq(59, 1L,new MagicDiamonds().minimalTransfer(1246390622L));
    ExampleRunner.eq(60, 1L,new MagicDiamonds().minimalTransfer(1692493778L));
    ExampleRunner.eq(61, 1L,new MagicDiamonds().minimalTransfer(1065227310L));
    ExampleRunner.eq(62, 1L,new MagicDiamonds().minimalTransfer(1265265799L));
    ExampleRunner.eq(63, 1L,new MagicDiamonds().minimalTransfer(1084963329L));
    ExampleRunner.eq(64, 1L,new MagicDiamonds().minimalTransfer(1478843645L));
    ExampleRunner.eq(65, 1L,new MagicDiamonds().minimalTransfer(2006456208L));
    ExampleRunner.eq(66, 1L,new MagicDiamonds().minimalTransfer(1722953950L));
    ExampleRunner.eq(67, 1L,new MagicDiamonds().minimalTransfer(496132103L));
    ExampleRunner.eq(68, 1L,new MagicDiamonds().minimalTransfer(6562762L));
    ExampleRunner.eq(69, 1L,new MagicDiamonds().minimalTransfer(957223956L));
    ExampleRunner.eq(70, 1L,new MagicDiamonds().minimalTransfer(654140677L));
    ExampleRunner.eq(71, 1L,new MagicDiamonds().minimalTransfer(1586450237L));
    ExampleRunner.eq(72, 1L,new MagicDiamonds().minimalTransfer(1018720108L));
    ExampleRunner.eq(73, 1L,new MagicDiamonds().minimalTransfer(2026536822L));
    ExampleRunner.eq(74, 1L,new MagicDiamonds().minimalTransfer(764222894L));
    ExampleRunner.eq(75, 1L,new MagicDiamonds().minimalTransfer(1544043251L));
    ExampleRunner.eq(76, 1L,new MagicDiamonds().minimalTransfer(1034964664L));
    ExampleRunner.eq(77, 1L,new MagicDiamonds().minimalTransfer(684533819L));
    ExampleRunner.eq(78, 2L,new MagicDiamonds().minimalTransfer(559623793L));
    ExampleRunner.eq(79, 1L,new MagicDiamonds().minimalTransfer(1102523518L));
    ExampleRunner.eq(80, 1L,new MagicDiamonds().minimalTransfer(1103984296L));
    ExampleRunner.eq(81, 1L,new MagicDiamonds().minimalTransfer(1487426600L));
    ExampleRunner.eq(82, 1L,new MagicDiamonds().minimalTransfer(1402158154L));
    ExampleRunner.eq(83, 1L,new MagicDiamonds().minimalTransfer(1000000000000L));
    ExampleRunner.eq(84, 3L,new MagicDiamonds().minimalTransfer(3L));
    ExampleRunner.eq(85, 1L,new MagicDiamonds().minimalTransfer(1L));
    ExampleRunner.eq(86, 1L,new MagicDiamonds().minimalTransfer(4L));
    ExampleRunner.eq(87, 2L,new MagicDiamonds().minimalTransfer(5L));
    ExampleRunner.eq(88, 1L,new MagicDiamonds().minimalTransfer(6L));
    ExampleRunner.eq(89, 2L,new MagicDiamonds().minimalTransfer(7L));
    ExampleRunner.eq(90, 1L,new MagicDiamonds().minimalTransfer(8L));
    ExampleRunner.eq(91, 1L,new MagicDiamonds().minimalTransfer(9L));
    ExampleRunner.eq(92, 1L,new MagicDiamonds().minimalTransfer(10L));
    ExampleRunner.eq(93, 1L,new MagicDiamonds().minimalTransfer(1000000000000L));
    ExampleRunner.eq(94, 1L,new MagicDiamonds().minimalTransfer(999999999997L));
    ExampleRunner.eq(95, 2L,new MagicDiamonds().minimalTransfer(999999999989L));
    ExampleRunner.eq(96, 2L,new MagicDiamonds().minimalTransfer(22222223L));
    ExampleRunner.eq(97, 1L,new MagicDiamonds().minimalTransfer(524524524524L));
    ExampleRunner.eq(98, 2L,new MagicDiamonds().minimalTransfer(524524524521L));
    ExampleRunner.eq(99, 2L,new MagicDiamonds().minimalTransfer(51432121451L));
    ExampleRunner.eq(100, 1L,new MagicDiamonds().minimalTransfer(25L));
    ExampleRunner.eq(101, 2L,new MagicDiamonds().minimalTransfer(11L));
    ExampleRunner.eq(102, 2L,new MagicDiamonds().minimalTransfer(999999000001L));
    ExampleRunner.eq(103, 1L,new MagicDiamonds().minimalTransfer(66L));
    ExampleRunner.eq(104, 1L,new MagicDiamonds().minimalTransfer(16L));
    ExampleRunner.eq(105, 1L,new MagicDiamonds().minimalTransfer(49L));
    ExampleRunner.eq(106, 2L,new MagicDiamonds().minimalTransfer(100000000019L));
    ExampleRunner.eq(107, 2L,new MagicDiamonds().minimalTransfer(982451653L));
    ExampleRunner.eq(108, 2L,new MagicDiamonds().minimalTransfer(31L));
    ExampleRunner.eq(109, 1L,new MagicDiamonds().minimalTransfer(424248523252L));
    ExampleRunner.eq(110, 1L,new MagicDiamonds().minimalTransfer(27L));
    ExampleRunner.eq(111, 1L,new MagicDiamonds().minimalTransfer(999966000289L));
    ExampleRunner.eq(112, 1L,new MagicDiamonds().minimalTransfer(10010602793L));
    ExampleRunner.eq(113, 1L,new MagicDiamonds().minimalTransfer(97969L));
    ExampleRunner.eq(114, 1L,new MagicDiamonds().minimalTransfer(1000000000L));
    ExampleRunner.eq(115, 2L,new MagicDiamonds().minimalTransfer(13L));
    ExampleRunner.eq(116, 2L,new MagicDiamonds().minimalTransfer(1000000007L));
  }
}
