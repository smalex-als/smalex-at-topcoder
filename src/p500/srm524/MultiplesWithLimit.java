package p500.srm524;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 1/6/12
 * Time: 10:58 PM
 * with help
 */
public class MultiplesWithLimit {
  public String minMultiples(int N, int[] forbiddenDigits) {
    String[] currentBest = new String[N];
    int[] currentLen = new int[N];
    boolean[] forbid = new boolean[10];

    for (int forbiddenDigit : forbiddenDigits) {
      forbid[forbiddenDigit] = true;
    }

    for (int i = 0; i < currentBest.length; i++) {
      currentBest[i] = "";
    }
    int[] queue = new int[N + 1];
    int pos = 0;
    int queueTail = 0;
    while (pos <= queueTail) {
      int now = queue[pos];
//      System.out.println("now = " + currentBest[now]);
      for (int i = 0; i <= 9; i++) {
        if (!forbid[i] && !(i == 0 && "".equals(currentBest[now]))) {
          int next = (now * 10 + i) % N;
          if ("".equals(currentBest[next])) {
            String nextString = currentBest[now] + Integer.toString(i);
            if (nextString.length() > 8) {
              nextString = nextString.substring(0, 3) + "..."
                  + nextString.substring(nextString.length() - 3);
            }
            currentBest[next] = nextString;
            currentLen[next] = currentLen[now] + 1;
            queue[++queueTail] = next;
          }
        }
      }
      pos++;
    }
    if (currentBest[0].equals("")) {
      return "IMPOSSIBLE";
    }
    if (currentLen[0] > 8) {
      return String.format("%s(%d digits)", currentBest[0], currentLen[0]);
    }
    return currentBest[0];
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, "1000", new MultiplesWithLimit().minMultiples(8, new int[]{2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(2, "222...222(9 digits)", new MultiplesWithLimit().minMultiples(9, new int[]{1, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(3, "3668", new MultiplesWithLimit().minMultiples(524, new int[]{5, 2, 4}));
    ExampleRunner.eq(4, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(10000, new int[]{0}));
    ExampleRunner.eq(5, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(1, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(6, "777...777(666 digits)", new MultiplesWithLimit().minMultiples(2007, new int[]{1, 2, 3, 4, 5, 6, 8, 9, 0}));
    ExampleRunner.eq(7, "400", new MultiplesWithLimit().minMultiples(100, new int[]{1, 2, 3}));
    ExampleRunner.eq(8, "200", new MultiplesWithLimit().minMultiples(200, new int[]{3, 4, 5}));
    ExampleRunner.eq(9, "99992", new MultiplesWithLimit().minMultiples(862, new int[]{1, 4, 6, 7, 8}));
    ExampleRunner.eq(10, "2332888", new MultiplesWithLimit().minMultiples(7048, new int[]{1, 4, 5, 6, 7, 9}));
    ExampleRunner.eq(11, "9199499", new MultiplesWithLimit().minMultiples(4261, new int[]{0, 2, 3, 5, 6, 7, 8}));
    ExampleRunner.eq(12, "96138", new MultiplesWithLimit().minMultiples(6867, new int[]{0, 4, 5, 7}));
    ExampleRunner.eq(13, "6479697", new MultiplesWithLimit().minMultiples(9543, new int[]{0, 1, 2, 3, 5, 8}));
    ExampleRunner.eq(14, "44046", new MultiplesWithLimit().minMultiples(7341, new int[]{1, 2, 3, 5, 7, 9}));
    ExampleRunner.eq(15, "21024", new MultiplesWithLimit().minMultiples(7008, new int[]{3, 5, 6, 7, 8}));
    ExampleRunner.eq(16, "337312", new MultiplesWithLimit().minMultiples(4064, new int[]{0, 4, 5, 6, 8, 9}));
    ExampleRunner.eq(17, "10388", new MultiplesWithLimit().minMultiples(5194, new int[]{4, 5, 7}));
    ExampleRunner.eq(18, "387030", new MultiplesWithLimit().minMultiples(4074, new int[]{1, 2, 4, 5, 6}));
    ExampleRunner.eq(19, "444...404(14 digits)", new MultiplesWithLimit().minMultiples(8794, new int[]{1, 2, 3, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(20, "466704", new MultiplesWithLimit().minMultiples(9723, new int[]{1, 2, 3, 8, 9}));
    ExampleRunner.eq(21, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(1940, new int[]{0, 3, 4, 8, 9}));
    ExampleRunner.eq(22, "20600", new MultiplesWithLimit().minMultiples(824, new int[]{1, 3, 4, 8, 9}));
    ExampleRunner.eq(23, "19598", new MultiplesWithLimit().minMultiples(9799, new int[]{4, 7}));
    ExampleRunner.eq(24, "700050", new MultiplesWithLimit().minMultiples(9334, new int[]{1, 2, 3, 6, 8}));
    ExampleRunner.eq(25, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(5310, new int[]{0, 1, 4, 6, 9}));
    ExampleRunner.eq(26, "11556", new MultiplesWithLimit().minMultiples(1926, new int[]{2, 4, 8, 9}));
    ExampleRunner.eq(27, "2421", new MultiplesWithLimit().minMultiples(2421, new int[]{0, 6, 8, 9}));
    ExampleRunner.eq(28, "6876", new MultiplesWithLimit().minMultiples(1719, new int[]{0, 1, 2, 4}));
    ExampleRunner.eq(29, "7556", new MultiplesWithLimit().minMultiples(3778, new int[]{2, 3, 8}));
    ExampleRunner.eq(30, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(4990, new int[]{0, 3, 8, 9}));
    ExampleRunner.eq(31, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(5570, new int[]{0, 3, 4, 7, 8, 9}));
    ExampleRunner.eq(32, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(5334, new int[]{0, 1, 2, 4, 6, 7, 8, 9}));
    ExampleRunner.eq(33, "78272", new MultiplesWithLimit().minMultiples(4892, new int[]{0, 3, 4, 9}));
    ExampleRunner.eq(34, "17424", new MultiplesWithLimit().minMultiples(8712, new int[]{0, 8, 9}));
    ExampleRunner.eq(35, "115560", new MultiplesWithLimit().minMultiples(2568, new int[]{2, 3, 4, 8, 9}));
    ExampleRunner.eq(36, "24024", new MultiplesWithLimit().minMultiples(3432, new int[]{1, 3, 5, 8}));
    ExampleRunner.eq(37, "777...777(9 digits)", new MultiplesWithLimit().minMultiples(2821, new int[]{1, 2, 3, 4, 5, 6, 8, 9}));
    ExampleRunner.eq(38, "67779", new MultiplesWithLimit().minMultiples(7531, new int[]{0, 3, 5}));
    ExampleRunner.eq(39, "11410", new MultiplesWithLimit().minMultiples(1630, new int[]{2, 5, 6, 7, 9}));
    ExampleRunner.eq(40, "4433", new MultiplesWithLimit().minMultiples(4433, new int[]{1, 2, 5, 7, 8, 9}));
    ExampleRunner.eq(41, "7272", new MultiplesWithLimit().minMultiples(1818, new int[]{0, 4, 6, 8}));
    ExampleRunner.eq(42, "80873", new MultiplesWithLimit().minMultiples(6221, new int[]{1, 4, 5, 6}));
    ExampleRunner.eq(43, "7032", new MultiplesWithLimit().minMultiples(3516, new int[]{1, 9}));
    ExampleRunner.eq(44, "101080", new MultiplesWithLimit().minMultiples(7220, new int[]{2, 3, 4, 5, 9}));
    ExampleRunner.eq(45, "22767207", new MultiplesWithLimit().minMultiples(9327, new int[]{1, 3, 4, 5, 8, 9}));
    ExampleRunner.eq(46, "18429", new MultiplesWithLimit().minMultiples(6143, new int[]{0, 3, 5, 6, 7}));
    ExampleRunner.eq(47, "304", new MultiplesWithLimit().minMultiples(76, new int[]{1, 6, 7, 8, 9}));
    ExampleRunner.eq(48, "20208", new MultiplesWithLimit().minMultiples(5052, new int[]{1, 3, 5, 6}));
    ExampleRunner.eq(49, "22977972", new MultiplesWithLimit().minMultiples(2818, new int[]{0, 1, 3, 4, 5, 6, 8}));
    ExampleRunner.eq(50, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(4910, new int[]{0, 3, 4, 5, 7, 8, 9}));
    ExampleRunner.eq(51, "3336", new MultiplesWithLimit().minMultiples(3336, new int[]{0, 1, 7, 8, 9}));
    ExampleRunner.eq(52, "2494", new MultiplesWithLimit().minMultiples(1247, new int[]{3, 5, 7, 8}));
    ExampleRunner.eq(53, "79948", new MultiplesWithLimit().minMultiples(7268, new int[]{0, 2, 3, 5}));
    ExampleRunner.eq(54, "5166716", new MultiplesWithLimit().minMultiples(2102, new int[]{0, 2, 3, 4, 8, 9}));
    ExampleRunner.eq(55, "7664", new MultiplesWithLimit().minMultiples(7664, new int[]{0, 1, 9}));
    ExampleRunner.eq(56, "404888", new MultiplesWithLimit().minMultiples(9416, new int[]{2, 6, 7}));
    ExampleRunner.eq(57, "26442", new MultiplesWithLimit().minMultiples(2034, new int[]{0, 1, 3, 5, 7, 8}));
    ExampleRunner.eq(58, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(8490, new int[]{0, 2, 3, 7, 8, 9}));
    ExampleRunner.eq(59, "23388", new MultiplesWithLimit().minMultiples(1949, new int[]{0, 1, 5, 6, 7, 9}));
    ExampleRunner.eq(60, "500...005(12 digits)", new MultiplesWithLimit().minMultiples(3845, new int[]{1, 2, 3, 4, 6, 7, 8, 9}));
    ExampleRunner.eq(61, "7262", new MultiplesWithLimit().minMultiples(7262, new int[]{5}));
    ExampleRunner.eq(62, "342545", new MultiplesWithLimit().minMultiples(9787, new int[]{1, 6, 7, 8}));
    ExampleRunner.eq(63, "2524", new MultiplesWithLimit().minMultiples(631, new int[]{0, 1, 3, 6, 8, 9}));
    ExampleRunner.eq(64, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(2660, new int[]{0, 5, 7, 8}));
    ExampleRunner.eq(65, "19694", new MultiplesWithLimit().minMultiples(9847, new int[]{0, 2, 7, 8}));
    ExampleRunner.eq(66, "5122", new MultiplesWithLimit().minMultiples(2561, new int[]{4, 6, 7, 9}));
    ExampleRunner.eq(67, "33393393", new MultiplesWithLimit().minMultiples(7011, new int[]{0, 1, 2, 4, 5, 6, 7}));
    ExampleRunner.eq(68, "494445", new MultiplesWithLimit().minMultiples(4155, new int[]{0, 1, 2, 6, 7, 8}));
    ExampleRunner.eq(69, "112822", new MultiplesWithLimit().minMultiples(2969, new int[]{3, 4, 5, 6, 9}));
    ExampleRunner.eq(70, "354855", new MultiplesWithLimit().minMultiples(8655, new int[]{0, 2, 6, 7, 9}));
    ExampleRunner.eq(71, "101166", new MultiplesWithLimit().minMultiples(7782, new int[]{3, 4, 5, 8, 9}));
    ExampleRunner.eq(72, "589944", new MultiplesWithLimit().minMultiples(1569, new int[]{0, 1, 2, 3, 6, 7}));
    ExampleRunner.eq(73, "9112", new MultiplesWithLimit().minMultiples(268, new int[]{3, 4, 5, 6, 7, 8}));
    ExampleRunner.eq(74, "6669160", new MultiplesWithLimit().minMultiples(9736, new int[]{2, 3, 4, 5, 7, 8}));
    ExampleRunner.eq(75, "686", new MultiplesWithLimit().minMultiples(686, new int[]{1, 2, 3, 4, 5, 7}));
    ExampleRunner.eq(76, "788", new MultiplesWithLimit().minMultiples(197, new int[]{1, 2, 3}));
    ExampleRunner.eq(77, "680068", new MultiplesWithLimit().minMultiples(9316, new int[]{2, 3, 4, 7, 9}));
    ExampleRunner.eq(78, "67522", new MultiplesWithLimit().minMultiples(9646, new int[]{1, 4, 8, 9}));
    ExampleRunner.eq(79, "3133188", new MultiplesWithLimit().minMultiples(1809, new int[]{0, 2, 4, 5, 6, 7, 9}));
    ExampleRunner.eq(80, "3504", new MultiplesWithLimit().minMultiples(1752, new int[]{1, 7, 8}));
    ExampleRunner.eq(81, "1371766", new MultiplesWithLimit().minMultiples(5422, new int[]{0, 2, 4, 5, 8, 9}));
    ExampleRunner.eq(82, "670677", new MultiplesWithLimit().minMultiples(2289, new int[]{1, 2, 4, 5, 8, 9}));
    ExampleRunner.eq(83, "5652", new MultiplesWithLimit().minMultiples(471, new int[]{0, 3, 4, 7, 8}));
    ExampleRunner.eq(84, "2166", new MultiplesWithLimit().minMultiples(1083, new int[]{4, 7, 8}));
    ExampleRunner.eq(85, "180208", new MultiplesWithLimit().minMultiples(6436, new int[]{3, 4, 5, 6, 7}));
    ExampleRunner.eq(86, "4555554", new MultiplesWithLimit().minMultiples(5073, new int[]{0, 1, 2, 3, 6, 7, 9}));
    ExampleRunner.eq(87, "4997", new MultiplesWithLimit().minMultiples(263, new int[]{0, 1, 2, 3, 6, 8}));
    ExampleRunner.eq(88, "185080", new MultiplesWithLimit().minMultiples(5288, new int[]{2, 3, 4, 6, 7, 9}));
    ExampleRunner.eq(89, "4677", new MultiplesWithLimit().minMultiples(4677, new int[]{0, 1, 5}));
    ExampleRunner.eq(90, "3229332", new MultiplesWithLimit().minMultiples(8681, new int[]{0, 1, 4, 6, 7, 8}));
    ExampleRunner.eq(91, "30163", new MultiplesWithLimit().minMultiples(4309, new int[]{4, 5, 7, 8, 9}));
    ExampleRunner.eq(92, "9112929", new MultiplesWithLimit().minMultiples(1227, new int[]{0, 3, 4, 5, 6, 7, 8}));
    ExampleRunner.eq(93, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(8610, new int[]{0, 1, 3, 4, 9}));
    ExampleRunner.eq(94, "703970", new MultiplesWithLimit().minMultiples(3434, new int[]{1, 2, 4, 5, 6, 8}));
    ExampleRunner.eq(95, "9974", new MultiplesWithLimit().minMultiples(9974, new int[]{0, 1, 3, 5, 8}));
    ExampleRunner.eq(96, "19130", new MultiplesWithLimit().minMultiples(9565, new int[]{2, 4, 5}));
    ExampleRunner.eq(97, "3904", new MultiplesWithLimit().minMultiples(3904, new int[]{6, 8}));
    ExampleRunner.eq(98, "698688", new MultiplesWithLimit().minMultiples(9704, new int[]{1, 2, 4, 5, 7}));
    ExampleRunner.eq(99, "368368", new MultiplesWithLimit().minMultiples(4784, new int[]{0, 1, 2, 4, 9}));
    ExampleRunner.eq(100, "4485", new MultiplesWithLimit().minMultiples(4485, new int[]{6, 9}));
    ExampleRunner.eq(101, "4774", new MultiplesWithLimit().minMultiples(4774, new int[]{3, 5, 6, 8}));
    ExampleRunner.eq(102, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(2060, new int[]{0, 1, 5, 6, 8, 9}));
    ExampleRunner.eq(103, "5520", new MultiplesWithLimit().minMultiples(1380, new int[]{1, 3, 4, 7, 8, 9}));
    ExampleRunner.eq(104, "17908", new MultiplesWithLimit().minMultiples(4477, new int[]{4, 5, 6}));
    ExampleRunner.eq(105, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(2115, new int[]{0, 1, 2, 3, 4, 5, 8, 9}));
    ExampleRunner.eq(106, "499149", new MultiplesWithLimit().minMultiples(8757, new int[]{2, 3, 6, 7, 8}));
    ExampleRunner.eq(107, "4480", new MultiplesWithLimit().minMultiples(560, new int[]{2, 6, 9}));
    ExampleRunner.eq(108, "4454", new MultiplesWithLimit().minMultiples(262, new int[]{0, 1, 2, 3, 7, 8, 9}));
    ExampleRunner.eq(109, "111...111(9972 digits)", new MultiplesWithLimit().minMultiples(9981, new int[]{0, 2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(110, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(1, new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}));
    ExampleRunner.eq(111, "9", new MultiplesWithLimit().minMultiples(1, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
    ExampleRunner.eq(112, "1", new MultiplesWithLimit().minMultiples(1, new int[]{}));
    ExampleRunner.eq(113, "10", new MultiplesWithLimit().minMultiples(5, new int[]{5}));
    ExampleRunner.eq(114, "12", new MultiplesWithLimit().minMultiples(4, new int[]{4, 8}));
    ExampleRunner.eq(115, "12", new MultiplesWithLimit().minMultiples(3, new int[]{3, 6, 9}));
    ExampleRunner.eq(116, "1000", new MultiplesWithLimit().minMultiples(8, new int[]{2, 4, 6, 8}));
    ExampleRunner.eq(117, "77778", new MultiplesWithLimit().minMultiples(9, new int[]{1, 2, 3, 4, 5, 6, 9}));
    ExampleRunner.eq(118, "888...888(9 digits)", new MultiplesWithLimit().minMultiples(9, new int[]{1, 2, 3, 4, 5, 6, 7, 9}));
    ExampleRunner.eq(119, "888...888(9 digits)", new MultiplesWithLimit().minMultiples(9, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));
    ExampleRunner.eq(120, "10000", new MultiplesWithLimit().minMultiples(10000, new int[]{}));
    ExampleRunner.eq(121, "10000", new MultiplesWithLimit().minMultiples(625, new int[]{5}));
    ExampleRunner.eq(122, "111888", new MultiplesWithLimit().minMultiples(999, new int[]{9}));
    ExampleRunner.eq(123, "1007874", new MultiplesWithLimit().minMultiples(7999, new int[]{9}));
    ExampleRunner.eq(124, "11118888", new MultiplesWithLimit().minMultiples(9999, new int[]{9}));
    ExampleRunner.eq(125, "10374", new MultiplesWithLimit().minMultiples(399, new int[]{8, 9}));
    ExampleRunner.eq(126, "111776", new MultiplesWithLimit().minMultiples(998, new int[]{8, 9}));
    ExampleRunner.eq(127, "1011747", new MultiplesWithLimit().minMultiples(3999, new int[]{8, 9}));
    ExampleRunner.eq(128, "11117776", new MultiplesWithLimit().minMultiples(9998, new int[]{8, 9}));
    ExampleRunner.eq(129, "11008", new MultiplesWithLimit().minMultiples(172, new int[]{2, 4, 6}));
    ExampleRunner.eq(130, "301788", new MultiplesWithLimit().minMultiples(996, new int[]{2, 4, 6}));
    ExampleRunner.eq(131, "1770888", new MultiplesWithLimit().minMultiples(1992, new int[]{2, 4, 6}));
    ExampleRunner.eq(132, "30017988", new MultiplesWithLimit().minMultiples(9996, new int[]{2, 4, 6}));
    ExampleRunner.eq(133, "100...000(14 digits)", new MultiplesWithLimit().minMultiples(8192, new int[]{2, 4, 6, 8}));
    ExampleRunner.eq(134, "300...000(14 digits)", new MultiplesWithLimit().minMultiples(8192, new int[]{1, 2, 4, 6, 8}));
    ExampleRunner.eq(135, "500...000(14 digits)", new MultiplesWithLimit().minMultiples(8192, new int[]{1, 2, 3, 4, 6, 8}));
    ExampleRunner.eq(136, "111...000(18 digits)", new MultiplesWithLimit().minMultiples(7992, new int[]{2, 3, 4, 6, 7, 8, 9}));
    ExampleRunner.eq(137, "444...888(20 digits)", new MultiplesWithLimit().minMultiples(9999, new int[]{1, 2, 3, 5, 6, 7, 9}));
    ExampleRunner.eq(138, "777...000(30 digits)", new MultiplesWithLimit().minMultiples(7992, new int[]{1, 2, 3, 4, 5, 6, 8, 9}));
    ExampleRunner.eq(139, "888...888(36 digits)", new MultiplesWithLimit().minMultiples(9999, new int[]{1, 2, 3, 4, 5, 6, 7, 9}));
    ExampleRunner.eq(140, "888...888(9918 digits)", new MultiplesWithLimit().minMultiples(9927, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));
    ExampleRunner.eq(141, "999...999(9930 digits)", new MultiplesWithLimit().minMultiples(9931, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
    ExampleRunner.eq(142, "999...999(9948 digits)", new MultiplesWithLimit().minMultiples(9949, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
    ExampleRunner.eq(143, "999...999(9966 digits)", new MultiplesWithLimit().minMultiples(9967, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
    ExampleRunner.eq(144, "1000", new MultiplesWithLimit().minMultiples(8, new int[]{2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(145, "3668", new MultiplesWithLimit().minMultiples(524, new int[]{5, 2, 4}));
    ExampleRunner.eq(146, "8", new MultiplesWithLimit().minMultiples(8, new int[]{}));
    ExampleRunner.eq(147, "222...222(9 digits)", new MultiplesWithLimit().minMultiples(9, new int[]{1, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(148, "70288", new MultiplesWithLimit().minMultiples(8786, new int[]{1, 3, 5, 6, 9}));
    ExampleRunner.eq(149, "100...000(14 digits)", new MultiplesWithLimit().minMultiples(8192, new int[]{2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(150, "1", new MultiplesWithLimit().minMultiples(1, new int[]{}));
    ExampleRunner.eq(151, "777...777(10 digits)", new MultiplesWithLimit().minMultiples(4433, new int[]{0, 2, 4, 6, 8, 9, 3, 5}));
    ExampleRunner.eq(152, "111...111(36 digits)", new MultiplesWithLimit().minMultiples(9999, new int[]{0, 2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(153, "222...222(81 digits)", new MultiplesWithLimit().minMultiples(81, new int[]{0, 1, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(154, "200...202(13 digits)", new MultiplesWithLimit().minMultiples(6561, new int[]{1, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(155, "111...101(10 digits)", new MultiplesWithLimit().minMultiples(81, new int[]{2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(156, "111...111(192 digits)", new MultiplesWithLimit().minMultiples(9997, new int[]{0, 2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(157, "999...999(12 digits)", new MultiplesWithLimit().minMultiples(2121, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
    ExampleRunner.eq(158, "111...111(36 digits)", new MultiplesWithLimit().minMultiples(9999, new int[]{2, 3, 4, 5, 6, 7, 8, 9, 0}));
    ExampleRunner.eq(159, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(1, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(160, "220...222(10 digits)", new MultiplesWithLimit().minMultiples(27, new int[]{1, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(161, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(2, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(162, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(2, new int[]{0, 2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(163, "9", new MultiplesWithLimit().minMultiples(9, new int[]{0}));
    ExampleRunner.eq(164, "11118888", new MultiplesWithLimit().minMultiples(9999, new int[]{9}));
    ExampleRunner.eq(165, "888...888(9 digits)", new MultiplesWithLimit().minMultiples(9, new int[]{1, 2, 3, 4, 5, 6, 7, 9, 0}));
    ExampleRunner.eq(166, "6561", new MultiplesWithLimit().minMultiples(6561, new int[]{7}));
    ExampleRunner.eq(167, "444...444(36 digits)", new MultiplesWithLimit().minMultiples(9999, new int[]{1, 2, 3, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(168, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(5, new int[]{0, 5}));
    ExampleRunner.eq(169, "999", new MultiplesWithLimit().minMultiples(999, new int[]{1, 2, 3, 4, 5, 6}));
    ExampleRunner.eq(170, "8", new MultiplesWithLimit().minMultiples(1, new int[]{0, 1, 2, 3, 4, 5, 6, 7}));
    ExampleRunner.eq(171, "IMPOSSIBLE", new MultiplesWithLimit().minMultiples(10000, new int[]{0}));
    ExampleRunner.eq(172, "222...222(9 digits)", new MultiplesWithLimit().minMultiples(9, new int[]{0, 1, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(173, "222...222(18 digits)", new MultiplesWithLimit().minMultiples(99, new int[]{0, 1, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(174, "222...222(10 digits)", new MultiplesWithLimit().minMultiples(9091, new int[]{1, 4, 5, 6, 7, 8, 9, 0}));
    ExampleRunner.eq(175, "100...100(15 digits)", new MultiplesWithLimit().minMultiples(9116, new int[]{2, 3, 4, 5, 6, 7, 8, 9}));
    ExampleRunner.eq(176, "111...111(27 digits)", new MultiplesWithLimit().minMultiples(999, new int[]{2, 3, 4, 5, 6, 7, 8, 9}));
  }
}
