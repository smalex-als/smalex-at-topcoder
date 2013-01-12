// BEGIN CUT HERE
package p400.srm413;

import java.util.Arrays;

import static utils.ExampleRunner.eq;

public class InfiniteSequence2 {
  private long[] cache2 = new long[5000001];
  private int p;
  private int q;
  private int x;
  private int y;

  public InfiniteSequence2() {
    Arrays.fill(cache2, 0, cache2.length, -1);
  }

  public long calc(long n, int p, int q, int x, int y) {
    this.p = p;
    this.q = q;
    this.x = x;
    this.y = y;
    return go(n);
  }

  public long go(long n) {
    if (n <= 0) {
      return 1L;
    }
    if (n < cache2.length && cache2[(int) n] != -1) {
      return cache2[(int) n];
    }
    final long l = go(n / p - x) + go(n / q - y);
    if (n < cache2.length) {
      cache2[((int) n)] = l;
    }
    return l;
  }

  // BEGIN CUT HERE
  public static void main(String[] args) {
    try {
      eq(0, (new InfiniteSequence2()).calc(12L, 2, 3, 1, 0), 8L);
      eq(1, (new InfiniteSequence2()).calc(0, 2, 2, 0, 0), 1L);
      eq(2, (new InfiniteSequence2()).calc(123L, 45, 67, 8, 9), 2L);
      eq(3, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 10131990), 11993312L);
      eq(4, (new InfiniteSequence2()).calc(10000000000000L, 2, 3, 3434343, 0), 1182936L);
      eq(5, (new InfiniteSequence2()).calc(9999999999998L, 2, 2, 3000000, 0), 37498466L);
      eq(6, (new InfiniteSequence2()).calc(1234567891011L, 2, 3, 0, 1000000), 711689L);
      eq(7, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 1000000000, 999999999), 8192L);
      eq(8, (new InfiniteSequence2()).calc(9999999999999L, 2, 3, 1000000000, 999999999), 1369L);
      eq(9, (new InfiniteSequence2()).calc(8335957747793L, 5, 2, 10, 6), 50167999L);
      eq(20, (new InfiniteSequence2()).calc(27025202362L, 9, 8, 6, 0), 2689L);
      eq(21, (new InfiniteSequence2()).calc(3426365180540L, 12, 7, 3, 5), 7446L);
      eq(22, (new InfiniteSequence2()).calc(6429294702567L, 17, 10, 0, 2), 3613L);
      eq(23, (new InfiniteSequence2()).calc(3135145174067L, 9, 10, 6, 4), 5352L);
      eq(24, (new InfiniteSequence2()).calc(8167369133069L, 8, 2, 7, 10), 4493437L);
      eq(25, (new InfiniteSequence2()).calc(7373131176229L, 18, 6, 8, 7), 5594L);
      eq(26, (new InfiniteSequence2()).calc(4324734575198L, 4, 7, 1, 4), 169441L);
      eq(27, (new InfiniteSequence2()).calc(8980412776091L, 9, 4, 6, 7), 75983L);
      eq(28, (new InfiniteSequence2()).calc(7281982906996L, 6, 7, 6, 7), 34334L);
      eq(29, (new InfiniteSequence2()).calc(6505572660336L, 5, 7, 4, 4), 70498L);
      eq(30, (new InfiniteSequence2()).calc(3895141616124L, 20, 6, 2, 10), 4614L);
      eq(31, (new InfiniteSequence2()).calc(364610515434L, 15, 4, 4, 9), 8361L);
      eq(32, (new InfiniteSequence2()).calc(7178945117276L, 15, 9, 9, 6), 3602L);
      eq(33, (new InfiniteSequence2()).calc(2399752392754L, 16, 8, 9, 3), 2883L);
      eq(34, (new InfiniteSequence2()).calc(12943947739L, 12, 10, 8, 6), 550L);
      eq(35, (new InfiniteSequence2()).calc(570036140795L, 9, 5, 9, 5), 13739L);
      eq(36, (new InfiniteSequence2()).calc(2902376710097L, 15, 10, 7, 8), 2149L);
      eq(37, (new InfiniteSequence2()).calc(280959997301L, 4, 9, 8, 7), 18466L);
      eq(38, (new InfiniteSequence2()).calc(6619364228444L, 17, 8, 0, 8), 4598L);
      eq(39, (new InfiniteSequence2()).calc(5771114738097L, 17, 2, 2, 4), 551168L);
      eq(40, (new InfiniteSequence2()).calc(7856631704567L, 13, 2, 2, 5), 1290156L);
      eq(41, (new InfiniteSequence2()).calc(4683269455306L, 6, 8, 5, 0), 35162L);
      eq(42, (new InfiniteSequence2()).calc(8829112805732L, 13, 3, 7, 0), 161652L);
      eq(43, (new InfiniteSequence2()).calc(6715409959708L, 8, 2, 4, 10), 4762979L);
      eq(44, (new InfiniteSequence2()).calc(2245117142618L, 11, 8, 8, 2), 5769L);
      eq(45, (new InfiniteSequence2()).calc(7488231192379L, 14, 6, 1, 5), 11671L);
      eq(46, (new InfiniteSequence2()).calc(1500911165193L, 6, 3, 8, 8), 403690L);
      eq(47, (new InfiniteSequence2()).calc(5856008936987L, 11, 8, 1, 0), 12288L);
      eq(48, (new InfiniteSequence2()).calc(1936960709859L, 13, 10, 4, 6), 2400L);
      eq(49, (new InfiniteSequence2()).calc(5407476153275L, 20, 10, 9, 7), 1729L);
      eq(50, (new InfiniteSequence2()).calc(1237239036029L, 10, 10, 8, 8), 4096L);
      eq(51, (new InfiniteSequence2()).calc(1011789366143L, 9, 7, 8, 8), 7399L);
      eq(52, (new InfiniteSequence2()).calc(5763939964443L, 6, 4, 2, 4), 290025L);
      eq(53, (new InfiniteSequence2()).calc(4818909002904L, 7, 7, 3, 6), 24576L);
      eq(54, (new InfiniteSequence2()).calc(6996504569917L, 10, 8, 0, 1), 16018L);
      eq(55, (new InfiniteSequence2()).calc(5499480298490L, 17, 8, 10, 8), 3140L);
      eq(56, (new InfiniteSequence2()).calc(8139544617505L, 10, 3, 9, 2), 230579L);
      eq(57, (new InfiniteSequence2()).calc(8464722308542L, 6, 5, 5, 1), 160031L);
      eq(58, (new InfiniteSequence2()).calc(8611789376348L, 285228807, 740759357, 6939507, 933110197), 2L);
      eq(59, (new InfiniteSequence2()).calc(5568529195746L, 654887345, 34949302, 37127827, 450573621), 2L);
      eq(60, (new InfiniteSequence2()).calc(1801447267605L, 494613813, 889023313, 87755422, 335354339), 2L);
      eq(61, (new InfiniteSequence2()).calc(8736569229320L, 346811308, 308044881, 396473730, 745425661), 2L);
      eq(62, (new InfiniteSequence2()).calc(3416402586708L, 470503468, 977648525, 434248626, 590079443), 2L);
      eq(63, (new InfiniteSequence2()).calc(5624473442062L, 884167640, 559412926, 188213258, 143408281), 2L);
      eq(64, (new InfiniteSequence2()).calc(5550431419379L, 273911902, 238433455, 776532036, 238962600), 2L);
      eq(65, (new InfiniteSequence2()).calc(4930113903881L, 407487133, 707900975, 619290071, 665947467), 2L);
      eq(66, (new InfiniteSequence2()).calc(7981058657199L, 937370165, 404158662, 711845894, 776808932), 2L);
      eq(67, (new InfiniteSequence2()).calc(9668824272813L, 472713776, 260152961, 501252995, 642548898), 2L);
      eq(68, (new InfiniteSequence2()).calc(1340704365084L, 437116468, 850952929, 967681094, 25187188), 2L);
      eq(69, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 0), 17592186044416L);
      eq(70, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 2, 2222222), 44470458L);
      eq(71, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 1234567, 0), 86169543L);
      eq(72, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 1100000), 95846721L);
      eq(73, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 1000000, 0), 104592532L);
      eq(74, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 1, 1), 4398046511104L);
      eq(75, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 1000000), 104592532L);
      eq(76, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 1, 4), 2766178294444L);
      eq(77, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 10000000), 12144693L);
      eq(78, (new InfiniteSequence2()).calc(9999999999999L, 2, 2, 1111111, 0), 94972147L);
      eq(79, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 5000000), 23289372L);
      eq(80, (new InfiniteSequence2()).calc(1000000000000L, 2, 3, 1, 1), 1893461615L);
      eq(81, (new InfiniteSequence2()).calc(999999999999L, 2, 2, 499999, 0), 19949114L);
      eq(82, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 100000), 879148277L);
      eq(83, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 400000), 244787015L);
      eq(84, (new InfiniteSequence2()).calc(999999999999L, 2, 2, 0, 0), 1099511627776L);
      eq(85, (new InfiniteSequence2()).calc(2358775268291L, 2, 2, 3350, 679115), 13407808L);
      eq(86, (new InfiniteSequence2()).calc(10000000000L, 2, 2, 0, 0), 17179869184L);
      eq(87, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 123456), 724865000L);
      eq(88, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 500007), 199182503L);
      eq(89, (new InfiniteSequence2()).calc(10000000000000L, 2, 3, 13, 17), 1953326158L);
      eq(90, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 2000000), 54796271L);
      eq(91, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 124342, 1138), 272433069L);
      eq(92, (new InfiniteSequence2()).calc(10000000000000L, 2, 3, 1, 2), 9664293228L);
      eq(93, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 1, 1000000), 96791648L);
      eq(94, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 3000000), 37498466L);
      eq(95, (new InfiniteSequence2()).calc(9999999999999L, 2, 2, 0, 0), 17592186044416L);
      eq(96, (new InfiniteSequence2()).calc(100000000000L, 2, 2, 2, 3), 24230196227L);
      eq(97, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 131071), 686650497L);
      eq(98, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 999973, 997), 49870998L);
      eq(99, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 16777216), 7450599L);
      eq(100, (new InfiniteSequence2()).calc(999173121312L, 2, 2, 5, 154456), 47819197L);
      eq(101, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 23000, 270000), 72411191L);
      eq(102, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 1000000, 1), 96791648L);
      eq(103, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 1234567, 1), 79850809L);
      eq(104, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 123456, 444), 330443974L);
      eq(105, (new InfiniteSequence2()).calc(10000000000000L, 2, 3, 1, 0), 16010084397L);
      eq(106, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 2345, 123797), 232774981L);
      eq(107, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 123456, 0), 724865000L);
      eq(108, (new InfiniteSequence2()).calc(10000000000000L, 2, 3, 0, 0), 24595366566L);
      eq(109, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 2, 123321), 630709045L);
      eq(110, (new InfiniteSequence2()).calc(8796093022208L, 2, 2, 0, 0), 17592186044416L);
      eq(111, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 2, 2), 2199023255552L);
      eq(112, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 2, 3), 2199023255552L);
      eq(113, (new InfiniteSequence2()).calc(9999999999999L, 2, 2, 1000000, 0), 104592532L);
      eq(114, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 1001, 104729), 322241427L);
      eq(115, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 1, 0), 7800976744450L);
      eq(116, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 12345, 324567), 76283543L);
      eq(117, (new InfiniteSequence2()).calc(10000000000000L, 2, 3, 453, 345), 148235861L);
      eq(118, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 1), 7800976744450L);
      eq(119, (new InfiniteSequence2()).calc(9999999999999L, 2, 2, 0, 182311), 506394388L);
      eq(120, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 390000), 250633419L);
      eq(121, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 390012), 250626223L);
      eq(122, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 10000000, 47), 8871503L);
      eq(123, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 390717), 250204273L);
      eq(124, (new InfiniteSequence2()).calc(10000000000000L, 3, 2, 7, 5), 3829335023L);
      eq(125, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 1048575), 100135912L);
      eq(126, (new InfiniteSequence2()).calc(1234567891011L, 2, 3, 0, 1), 3377145969L);
      eq(127, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 391717), 249608366L);
      eq(128, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 397717), 246095851L);
      eq(129, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 1, 2), 3900488372226L);
      eq(130, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 123, 1234566), 54025419L);
      eq(131, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 234512, 0), 401142982L);
      eq(132, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 0, 65536), 1296998106L);
      eq(133, (new InfiniteSequence2()).calc(10000000000000L, 2, 2, 3, 1757567), 53867288L);
    } catch (Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
// END CUT HERE
}
