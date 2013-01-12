package p500.srm505;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 5/3/11
 * Time: 3:19 PM
 */
public class PerfectSequences {
  public String fixIt(int[] seq) {
    if (seq.length == 1) {
      return "Yes";
    }
    long maxValue = 50 * 1000000000L;
    for (int i = 0; i < seq.length; i++) {
      long mul = 1;
      long sum = 0;
      for (int j = 0; j < seq.length; j++) {
        if (j != i) {
          mul *= (long) seq[j];
          sum += (long) seq[j];
          if (mul > maxValue) {
            return "No";
          }
        }
      }
      long x = 0;
      if (mul > 1) {
        x = sum / (mul - 1);
      }
      if (sum + x == mul * x && x >= 0 && x != seq[i]) {
        return "Yes";
      }
    }
    return "No";
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, "Yes", new PerfectSequences().fixIt(new int[]{1, 3, 4}));
    ExampleRunner.eq(2, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 2}));
    ExampleRunner.eq(3, "No", new PerfectSequences().fixIt(new int[]{1, 2, 3}));
    ExampleRunner.eq(4, "No", new PerfectSequences().fixIt(new int[]{1, 4, 2, 4, 2, 4}));
    ExampleRunner.eq(5, "Yes", new PerfectSequences().fixIt(new int[]{1000000, 1, 1, 1, 1, 2}));
    ExampleRunner.eq(6, "Yes", new PerfectSequences().fixIt(new int[]{8}));
    ExampleRunner.eq(7, "No", new PerfectSequences().fixIt(new int[]{2, 0, 2}));
    ExampleRunner.eq(8, "Yes", new PerfectSequences().fixIt(new int[]{1}));
    ExampleRunner.eq(9, "No", new PerfectSequences().fixIt(new int[]{1, 1}));
    ExampleRunner.eq(10, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(11, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(12, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(13, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(14, "Yes", new PerfectSequences().fixIt(new int[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(15, "No", new PerfectSequences().fixIt(new int[]{2, 2}));
    ExampleRunner.eq(16, "Yes", new PerfectSequences().fixIt(new int[]{2, 3}));
    ExampleRunner.eq(17, "No", new PerfectSequences().fixIt(new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}));
    ExampleRunner.eq(18, "No", new PerfectSequences().fixIt(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
    ExampleRunner.eq(19, "No", new PerfectSequences().fixIt(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
    ExampleRunner.eq(20, "No", new PerfectSequences().fixIt(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
    ExampleRunner.eq(21, "No", new PerfectSequences().fixIt(new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 2}));
    ExampleRunner.eq(22, "No", new PerfectSequences().fixIt(new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 2}));
    ExampleRunner.eq(23, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(24, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1, 3, 3}));
    ExampleRunner.eq(25, "Yes", new PerfectSequences().fixIt(new int[]{3, 3, 1, 1, 4}));
    ExampleRunner.eq(26, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4}));
    ExampleRunner.eq(27, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 4}));
    ExampleRunner.eq(28, "No", new PerfectSequences().fixIt(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 2, 2}));
    ExampleRunner.eq(29, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 17}));
    ExampleRunner.eq(30, "Yes", new PerfectSequences().fixIt(new int[]{5, 6, 1, 1, 100000099, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(31, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(32, "Yes", new PerfectSequences().fixIt(new int[]{1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5}));
    ExampleRunner.eq(33, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(34, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 24, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(35, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 999999999, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2}));
    ExampleRunner.eq(36, "No", new PerfectSequences().fixIt(new int[]{2, 2}));
    ExampleRunner.eq(37, "Yes", new PerfectSequences().fixIt(new int[]{2, 6}));
    ExampleRunner.eq(38, "No", new PerfectSequences().fixIt(new int[]{1000000000, 0, 38299922, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    ExampleRunner.eq(39, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7774555, 0, 0, 0, 0, 0, 0, 0}));
    ExampleRunner.eq(40, "No", new PerfectSequences().fixIt(new int[]{0, 0, 0, 1000000000, 1000000000, 0, 0, 0, 0, 0, 1000000000}));
    ExampleRunner.eq(41, "Yes", new PerfectSequences().fixIt(new int[]{2, 0}));
    ExampleRunner.eq(42, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 0}));
    ExampleRunner.eq(43, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(44, "No", new PerfectSequences().fixIt(new int[]{1000000000, 0, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(45, "No", new PerfectSequences().fixIt(new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 4, 4, 4, 4, 4}));
    ExampleRunner.eq(46, "No", new PerfectSequences().fixIt(new int[]{33026956, 632559057, 168404187, 385338462, 963971668, 580626110, 688845411, 745876673, 416994136, 561618163, 704084435, 789417209, 462640432, 585022216, 399545080, 694407009, 454771122, 898028531, 928908760, 989702386, 348727488, 963765823, 280560280, 940572343, 242240857, 639996254, 362016623, 619998657, 525720989, 858496754, 26460477, 958414924, 242383993, 101764257, 169139807, 981944857, 172131451, 24148662, 892780244, 187207520, 517074520, 945787355, 406335895, 688806026, 752931141}));
    ExampleRunner.eq(47, "No", new PerfectSequences().fixIt(new int[]{362684493, 983065962, 800613923, 85043730, 16009177, 758714179, 502490244, 888192677, 365766547, 503764543, 467228412, 864745601, 161785543, 778724895, 15111873, 636229710, 961423622, 638508900, 617097843, 427119071, 507274698, 780452326, 108613648, 552218003, 705732378, 240741951, 893695950, 987950994, 568090697, 880960608, 593261707, 134470826, 734321006, 650913517, 836938937, 117522565, 882903283, 969771675, 383327996, 590280184, 456353368, 609565983, 694775802, 568418471, 672314730, 316361789}));
    ExampleRunner.eq(48, "No", new PerfectSequences().fixIt(new int[]{245726289, 38971969, 507388014, 957614046, 267105550, 799802082, 563119096, 211277644, 596097542, 12566866, 493042513, 181025060, 51091524, 162620791, 556888926, 883984592, 493368800, 976035109, 545314387, 67614053, 529722328, 501480979, 976441510, 572078885, 90006247, 943326833, 206107476, 673593445, 247603404, 542561041}));
    ExampleRunner.eq(49, "No", new PerfectSequences().fixIt(new int[]{740518369, 469050958, 770035971, 552371378, 530433229, 880582052, 881456019, 200433998, 322036933, 985526330, 938280595, 936180409, 717049777, 819989386, 735327083, 42157613, 409013546, 921681504, 97126287, 158182086, 657072379, 537787936, 107518477, 231168347, 913531508}));
    ExampleRunner.eq(50, "No", new PerfectSequences().fixIt(new int[]{25170685, 964513307, 492967279, 982007937, 559001697, 833610292, 166874392, 887828955, 379765250}));
    ExampleRunner.eq(51, "No", new PerfectSequences().fixIt(new int[]{931798489, 882110799, 991926172, 947880344, 540960281, 728785242, 534860781, 658052628, 109890273, 850613840, 794976763, 228616731, 404366613, 296750160, 870469911, 929103907, 679229118, 60129406, 166879900, 845806164, 792006994, 132561248, 481715008, 482087465, 659864185, 350101719, 727683679, 227573453, 557928672, 493007725, 453066851, 802311902}));
    ExampleRunner.eq(52, "No", new PerfectSequences().fixIt(new int[]{373887788, 415711145, 310374165, 523583747, 342891904, 40932198, 28857642, 68055468, 114256388, 859693196, 690092173, 979546006, 89437884, 348682750, 775365019, 477382695, 920791467, 56361679, 730838708, 366000119, 66776390, 194650993, 195573159}));
    ExampleRunner.eq(53, "No", new PerfectSequences().fixIt(new int[]{22304476, 664712880, 401013389, 6929406, 5778558, 940159113, 751840870, 133381875, 588767228, 998798173, 356957032, 763165721, 295063759, 588584463, 814370542, 515708, 535171479, 336555288, 319388720, 396602809, 708135400, 864051498, 301362549}));
    ExampleRunner.eq(54, "No", new PerfectSequences().fixIt(new int[]{741765553, 456774009, 533604433, 820067058, 594906395, 258522485, 11650505, 409421539, 892560739}));
    ExampleRunner.eq(55, "No", new PerfectSequences().fixIt(new int[]{300816276, 454973798, 742331406, 755698020, 940141506, 599760630, 512222450, 879682044, 597818271, 157846582, 176266661, 808614300, 560986386}));
    ExampleRunner.eq(56, "No", new PerfectSequences().fixIt(new int[]{157560712, 632883160, 697122761, 69603065, 557492655, 428395926, 223462897, 702818384, 286651060, 158641323, 293352293, 928119943, 4858649, 139320380, 403334609, 930005315, 314633192, 643543941, 232672668, 528641224, 66881119, 990583243, 689655628, 994509068, 677542961, 421962193, 396739551, 484640975, 969175884, 73796405, 678016481, 787069038, 561517343, 894978319, 420082144, 537433202, 308784331, 0, 665937774, 661558659, 0, 973954702, 823751786, 435217062, 519604036}));
    ExampleRunner.eq(57, "No", new PerfectSequences().fixIt(new int[]{0, 142256848, 647414975, 944547165, 974891107, 196329611, 439305591, 97015536, 995463577, 637492148, 537187340, 746902475, 127919529, 507774853, 228138238, 926401369, 463546723, 281890186, 59290016, 348938098, 794807187, 636314981, 448765003, 437748968, 310004453, 876331648, 899131727, 445658508, 267658418, 288782383, 263539820, 723307259, 765468027, 951121465, 175485099, 753579267, 952010370, 941693023, 350610776, 64977708, 86244358, 434280221, 778250815, 308861494, 37682311, 0}));
    ExampleRunner.eq(58, "No", new PerfectSequences().fixIt(new int[]{758776957, 195989846, 0, 975844987, 804883696, 97184003}));
    ExampleRunner.eq(59, "No", new PerfectSequences().fixIt(new int[]{892835749, 563321490, 349988607, 119764338, 238112558, 718591423, 255123719, 634041281, 582292194, 600037483, 628087878, 751390258, 998785609, 827256784, 646792212, 769535458, 309643213, 222895543, 263218595, 684187341, 150686771, 439777371, 253316351, 798440323, 414667048, 146505635, 105307080, 980635112, 739255336, 312014833, 652876045, 716904935, 201800334, 19955414, 489383022, 94760120, 269199457, 35543248, 236501369, 522747404, 0, 110009102, 811398527, 90326975, 899089045, 5251277}));
    ExampleRunner.eq(60, "No", new PerfectSequences().fixIt(new int[]{760847072, 603729615, 320155108, 0, 313294295, 487128078, 821931671, 498806714}));
    ExampleRunner.eq(61, "No", new PerfectSequences().fixIt(new int[]{629553163, 19154880, 818072353, 594124628, 454662792, 459296989, 923405015, 559413409, 104030781, 768526287, 895501928, 147181267, 737747175, 241984611, 825695596, 308172432, 675940481, 113081110, 62479708, 296729796, 0, 320225312, 244357249, 945828381, 87076680, 800737359, 681870473}));
    ExampleRunner.eq(62, "No", new PerfectSequences().fixIt(new int[]{494495565, 347874827, 770559173, 426468794, 883431375, 516733968, 367689519, 526281004, 577008908, 0, 85015368, 711624667, 874290945, 503593099, 481674654}));
    ExampleRunner.eq(63, "No", new PerfectSequences().fixIt(new int[]{699551279, 941150245, 481315009, 182148490, 719214777, 0, 47236562, 101057522, 914596641, 137509260}));
    ExampleRunner.eq(64, "No", new PerfectSequences().fixIt(new int[]{281193106, 773682102, 326249118, 544024106, 85839611, 694848176, 474808109, 951253331, 655868653, 982428546, 819633142, 972283215, 566782363, 70820421, 944178039, 745858269, 28095535, 327973358, 929534901, 633943338, 671420987, 331627908, 53384880, 285552589, 679720945, 745408987, 351939331, 249135837, 347536818, 272763321, 324595931, 636054744, 0, 145483539, 138412156, 426686312, 247419717, 400093729}));
    ExampleRunner.eq(65, "No", new PerfectSequences().fixIt(new int[]{621056907, 844474529, 509676853, 236008104, 349902541, 0, 466437586, 409360698, 25086152, 114299339, 98512398}));
    ExampleRunner.eq(66, "No", new PerfectSequences().fixIt(new int[]{2, 0, 2}));
    ExampleRunner.eq(67, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 1}));
    ExampleRunner.eq(68, "No", new PerfectSequences().fixIt(new int[]{0, 0, 0, 0, 0}));
    ExampleRunner.eq(69, "Yes", new PerfectSequences().fixIt(new int[]{1, 3, 4}));
    ExampleRunner.eq(70, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(71, "Yes", new PerfectSequences().fixIt(new int[]{2, 1}));
    ExampleRunner.eq(72, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(73, "Yes", new PerfectSequences().fixIt(new int[]{12, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}));
    ExampleRunner.eq(74, "Yes", new PerfectSequences().fixIt(new int[]{0, 1000000}));
    ExampleRunner.eq(75, "Yes", new PerfectSequences().fixIt(new int[]{1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(76, "Yes", new PerfectSequences().fixIt(new int[]{1, 0}));
    ExampleRunner.eq(77, "No", new PerfectSequences().fixIt(new int[]{12121212, 4444444, 12312313, 848484, 1000000, 100000000, 99999999}));
    ExampleRunner.eq(78, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(79, "No", new PerfectSequences().fixIt(new int[]{2, 2}));
    ExampleRunner.eq(80, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(81, "No", new PerfectSequences().fixIt(new int[]{100, 100, 100}));
    ExampleRunner.eq(82, "No", new PerfectSequences().fixIt(new int[]{1000000000, 99999999, 99999999, 99999999, 9999999, 999999999, 99999999, 999999, 99999999, 99999999, 999999999, 99999999, 99999999, 9999999, 9999999}));
    ExampleRunner.eq(83, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(84, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(85, "No", new PerfectSequences().fixIt(new int[]{0, 0, 0}));
    ExampleRunner.eq(86, "Yes", new PerfectSequences().fixIt(new int[]{5}));
    ExampleRunner.eq(87, "Yes", new PerfectSequences().fixIt(new int[]{0, 1, 2}));
    ExampleRunner.eq(88, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(89, "Yes", new PerfectSequences().fixIt(new int[]{0, 9}));
    ExampleRunner.eq(90, "Yes", new PerfectSequences().fixIt(new int[]{8}));
    ExampleRunner.eq(91, "No", new PerfectSequences().fixIt(new int[]{1, 2, 3}));
    ExampleRunner.eq(92, "No", new PerfectSequences().fixIt(new int[]{1, 1}));
    ExampleRunner.eq(93, "Yes", new PerfectSequences().fixIt(new int[]{0}));
    ExampleRunner.eq(94, "Yes", new PerfectSequences().fixIt(new int[]{1, 2, 0}));
    ExampleRunner.eq(95, "No", new PerfectSequences().fixIt(new int[]{0, 0}));
    ExampleRunner.eq(96, "Yes", new PerfectSequences().fixIt(new int[]{1, 0, 0}));
    ExampleRunner.eq(97, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(98, "No", new PerfectSequences().fixIt(new int[]{10000000, 20000000, 30000000}));
    ExampleRunner.eq(99, "No", new PerfectSequences().fixIt(new int[]{0, 0, 0, 0}));
    ExampleRunner.eq(100, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 5}));
    ExampleRunner.eq(101, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1000000000, 7, 7, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(102, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0}));
    ExampleRunner.eq(103, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1}));
    ExampleRunner.eq(104, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(105, "Yes", new PerfectSequences().fixIt(new int[]{1, 2}));
    ExampleRunner.eq(106, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 9999999, 99999999, 9999}));
    ExampleRunner.eq(107, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(108, "Yes", new PerfectSequences().fixIt(new int[]{1, 0, 2}));
    ExampleRunner.eq(109, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 0, 1}));
    ExampleRunner.eq(110, "No", new PerfectSequences().fixIt(new int[]{1, 1, 100}));
    ExampleRunner.eq(111, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 2}));
    ExampleRunner.eq(112, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));
    ExampleRunner.eq(113, "Yes", new PerfectSequences().fixIt(new int[]{2, 1000000000}));
    ExampleRunner.eq(114, "Yes", new PerfectSequences().fixIt(new int[]{1000000, 1, 1, 1, 1, 2}));
    ExampleRunner.eq(115, "Yes", new PerfectSequences().fixIt(new int[]{5, 0, 0}));
    ExampleRunner.eq(116, "No", new PerfectSequences().fixIt(new int[]{100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 99999999}));
    ExampleRunner.eq(117, "No", new PerfectSequences().fixIt(new int[]{1, 4, 2, 4, 2, 4}));
    ExampleRunner.eq(118, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1}));
    ExampleRunner.eq(119, "Yes", new PerfectSequences().fixIt(new int[]{1, 2, 1}));
    ExampleRunner.eq(120, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 1000000000, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3}));
    ExampleRunner.eq(121, "No", new PerfectSequences().fixIt(new int[]{2, 3, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(122, "Yes", new PerfectSequences().fixIt(new int[]{0, 2, 3}));
    ExampleRunner.eq(123, "No", new PerfectSequences().fixIt(new int[]{0, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 0, 1000000000}));
    ExampleRunner.eq(124, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(125, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 0, 0, 0, 2}));
    ExampleRunner.eq(126, "Yes", new PerfectSequences().fixIt(new int[]{1}));
    ExampleRunner.eq(127, "Yes", new PerfectSequences().fixIt(new int[]{2, 1, 4}));
    ExampleRunner.eq(128, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(129, "Yes", new PerfectSequences().fixIt(new int[]{0, 2}));
    ExampleRunner.eq(130, "Yes", new PerfectSequences().fixIt(new int[]{10, 1, 1, 2, 5}));
    ExampleRunner.eq(131, "No", new PerfectSequences().fixIt(new int[]{7777, 7777777, 7777, 1000000, 1000000000}));
    ExampleRunner.eq(132, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 0, 0, 0, 0, 1}));
    ExampleRunner.eq(133, "No", new PerfectSequences().fixIt(new int[]{5, 1, 1}));
    ExampleRunner.eq(134, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 2, 2, 5}));
    ExampleRunner.eq(135, "No", new PerfectSequences().fixIt(new int[]{0, 0, 1, 1}));
    ExampleRunner.eq(136, "Yes", new PerfectSequences().fixIt(new int[]{0, 1}));
    ExampleRunner.eq(137, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 2, 0}));
    ExampleRunner.eq(138, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1000000000, 7, 7}));
    ExampleRunner.eq(139, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(140, "Yes", new PerfectSequences().fixIt(new int[]{1, 0, 0, 0}));
    ExampleRunner.eq(141, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 100000009}));
    ExampleRunner.eq(142, "Yes", new PerfectSequences().fixIt(new int[]{2, 0, 3}));
    ExampleRunner.eq(143, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1}));
    ExampleRunner.eq(144, "Yes", new PerfectSequences().fixIt(new int[]{0, 3, 2}));
    ExampleRunner.eq(145, "No", new PerfectSequences().fixIt(new int[]{100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000, 100000000}));
    ExampleRunner.eq(146, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 11, 10}));
    ExampleRunner.eq(147, "Yes", new PerfectSequences().fixIt(new int[]{2, 2, 3}));
    ExampleRunner.eq(148, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(149, "No", new PerfectSequences().fixIt(new int[]{100000000, 99999999, 99999998, 99999997, 9999996}));
    ExampleRunner.eq(150, "Yes", new PerfectSequences().fixIt(new int[]{1000000, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2}));
    ExampleRunner.eq(151, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1, 2}));
    ExampleRunner.eq(152, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 2}));
    ExampleRunner.eq(153, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 9}));
    ExampleRunner.eq(154, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 0, 0, 0, 0, 5}));
    ExampleRunner.eq(155, "Yes", new PerfectSequences().fixIt(new int[]{0, 5, 1, 1, 1}));
    ExampleRunner.eq(156, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 0, 0, 1}));
    ExampleRunner.eq(157, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 0, 1, 0}));
    ExampleRunner.eq(158, "No", new PerfectSequences().fixIt(new int[]{1, 3, 0, 4}));
    ExampleRunner.eq(159, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 0, 0, 5}));
    ExampleRunner.eq(160, "Yes", new PerfectSequences().fixIt(new int[]{0, 12, 0, 0}));
    ExampleRunner.eq(161, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 294967296, 0, 0}));
    ExampleRunner.eq(162, "No", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(163, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 3}));
    ExampleRunner.eq(164, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2}));
    ExampleRunner.eq(165, "Yes", new PerfectSequences().fixIt(new int[]{1000000, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(166, "No", new PerfectSequences().fixIt(new int[]{0, 0, 0, 3, 4}));
    ExampleRunner.eq(167, "Yes", new PerfectSequences().fixIt(new int[]{1000000000, 0}));
    ExampleRunner.eq(168, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 5, 0, 0}));
    ExampleRunner.eq(169, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1}));
    ExampleRunner.eq(170, "No", new PerfectSequences().fixIt(new int[]{5, 1}));
    ExampleRunner.eq(171, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 2}));
    ExampleRunner.eq(172, "No", new PerfectSequences().fixIt(new int[]{100000000, 99999999, 99999998, 99999997, 99999996, 99999995, 99999994, 99999993, 99999992, 99999991, 99999990, 99999989, 99999988, 99999987, 99999986, 999999, 9999999, 99999995, 99999982}));
    ExampleRunner.eq(173, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 0, 2}));
    ExampleRunner.eq(174, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 5, 154}));
    ExampleRunner.eq(175, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1000000000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    ExampleRunner.eq(176, "Yes", new PerfectSequences().fixIt(new int[]{2, 0}));
    ExampleRunner.eq(177, "No", new PerfectSequences().fixIt(new int[]{1, 1, 2, 4}));
    ExampleRunner.eq(178, "No", new PerfectSequences().fixIt(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000}));
    ExampleRunner.eq(179, "No", new PerfectSequences().fixIt(new int[]{2, 0, 2, 1000000000}));
    ExampleRunner.eq(180, "Yes", new PerfectSequences().fixIt(new int[]{1, 1, 1, 3, 4}));
    ExampleRunner.eq(181, "Yes", new PerfectSequences().fixIt(new int[]{1, 0, 3}));
    ExampleRunner.eq(182, "Yes", new PerfectSequences().fixIt(new int[]{0, 0, 0, 0, 0, 0, 1000000000}));
    ExampleRunner.eq(183, "Yes", new PerfectSequences().fixIt(new int[]{2, 1, 1}));
    ExampleRunner.eq(184, "Yes", new PerfectSequences().fixIt(new int[]{0, 1, 0}));
  }
}
