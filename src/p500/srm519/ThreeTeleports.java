package p500.srm519;

import utils.ExampleRunner;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by smalex on 02/06/15.
 */
public class ThreeTeleports {

  private class Point implements Comparable<Point> {
    int index;
    long cost;

    public Point(int index, long cost) {
      this.index = index;
      this.cost = cost;
    }

    @Override
    public int compareTo(Point o) {
      return Long.compare(cost, o.cost);
    }

    @Override
    public String toString() {
      return "Point{" +
          "index=" + index +
          ", cost=" + cost +
          '}';
    }
  }

  public int shortestDistance(int xMe, int yMe, int xHome, int yHome, String[] teleports) {
    long[][] grid = new long[8][8];
    for (long[] row : grid) {
      Arrays.fill(row, -1);
    }

    final int meIndex = 0;
    final int homeIndex = 7;
    add(grid, meIndex, homeIndex, dist(xMe, yMe, xHome, yHome));
    for (int i = 0; i < teleports.length; i++) {
      final String[] pieces = teleports[i].split(" +");
      final int t0 = i * 2 + 1;
      final int t1 = i * 2 + 2;
      final int x0 = Integer.parseInt(pieces[0]);
      final int y0 = Integer.parseInt(pieces[1]);
      final int x1 = Integer.parseInt(pieces[2]);
      final int y1 = Integer.parseInt(pieces[3]);
      add(grid, t0, meIndex, dist(xMe, yMe, x0, y0));
      add(grid, t1, meIndex, dist(xMe, yMe, x1, y1));
      add(grid, t0, homeIndex, dist(xHome, yHome, x0, y0));
      add(grid, t1, homeIndex, dist(xHome, yHome, x1, y1));
      add(grid, t1, t0, 10L);
      add(grid, t0, t1, 10L);

      for (int j = i + 1; j < teleports.length; j++) {
        final String[] pieces2 = teleports[j].split(" +");
        final int bx2 = Integer.parseInt(pieces2[0]);
        final int by2 = Integer.parseInt(pieces2[1]);
        final int bx3 = Integer.parseInt(pieces2[2]);
        final int by3 = Integer.parseInt(pieces2[3]);
        final int t2 = j * 2 + 1;
        final int t3 = j * 2 + 2;

        add(grid, t2, t0, dist(bx2, by2, x0, y0));
        add(grid, t3, t0, dist(bx3, by3, x0, y0));
        add(grid, t2, t1, dist(bx2, by2, x1, y1));
        add(grid, t3, t1, dist(bx3, by3, x1, y1));
      }
    }
    long[] visited = new long[8];
    Arrays.fill(visited, Long.MAX_VALUE);
    visited[0] = 0L;

    PriorityQueue<Point> q = new PriorityQueue<Point>();
    q.add(new Point(0, 0L));
    while (!q.isEmpty()) {
      final Point poll = q.poll();
      final int index = poll.index;
      final long c = poll.cost;
      if (index == 7) {
        return (int) c;
      }
      for (int i = 0; i < grid[index].length; i++) {
        if (grid[index][i] >= 0L && c + grid[index][i] < visited[i]) {
          q.add(new Point(i, c + grid[index][i]));
          visited[i] = Math.min(c + grid[index][i], visited[i]);
        }
      }
    }
    return -1;
  }

  private void add(long[][] grid, int v0, int v1, long cost) {
    grid[v0][v1] = cost;
    grid[v1][v0] = cost;
  }

  private long dist(int xMe, int yMe, int x, int y) {
    return (long) Math.abs(x - xMe) + (long) Math.abs(y - yMe);
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 3, new ThreeTeleports().shortestDistance(3, 3, 4, 5, new String[]{"1000 1001 1000 1002", "1000 1003 1000 1004", "1000 1005 1000 1006"}));
    ExampleRunner.eq(2, 14, new ThreeTeleports().shortestDistance(0, 0, 20, 20, new String[]{"1 1 18 20", "1000 1003 1000 1004", "1000 1005 1000 1006"}));
    ExampleRunner.eq(3, 14, new ThreeTeleports().shortestDistance(0, 0, 20, 20, new String[]{"1000 1003 1000 1004", "18 20 1 1", "1000 1005 1000 1006"}));
    ExampleRunner.eq(4, 30, new ThreeTeleports().shortestDistance(10, 10, 10000, 20000, new String[]{"1000 1003 1000 1004", "3 3 10004 20002", "1000 1005 1000 1006"}));
    ExampleRunner.eq(5, 117, new ThreeTeleports().shortestDistance(3, 7, 10000, 30000, new String[]{"3 10 5200 4900", "12212 8699 9999 30011", "12200 8701 5203 4845"}));
    ExampleRunner.eq(6, 2000000000, new ThreeTeleports().shortestDistance(0, 0, 1000000000, 1000000000, new String[]{"1 1 2 2", "3 3 4 4", "5 5 6 6"}));
    ExampleRunner.eq(7, 2000000000, new ThreeTeleports().shortestDistance(0, 1000000000, 1000000000, 0, new String[]{"1 1 2 2", "3 3 4 4", "5 5 6 6"}));
    ExampleRunner.eq(8, 36, new ThreeTeleports().shortestDistance(0, 0, 1000000000, 1000000000, new String[]{"0 1 0 999999999", "1 1000000000 999999999 0", "1000000000 1 1000000000 999999999"}));
    ExampleRunner.eq(9, 42, new ThreeTeleports().shortestDistance(7, 2, 999999991, 4, new String[]{"0 1 0 999999999", "1 1000000000 999999999 0", "1000000000 1 1000000000 999999999"}));
    ExampleRunner.eq(10, 500000032, new ThreeTeleports().shortestDistance(10, 500000000, 1000000000, 1000000000, new String[]{"0 1 0 999999999", "1 1000000000 999999999 0", "1000000000 1 1000000000 999999999"}));
    ExampleRunner.eq(11, 800000000, new ThreeTeleports().shortestDistance(100000000, 500000000, 900000000, 500000000, new String[]{"0 1 0 999999999", "1 1000000000 999999999 0", "1000000000 1 1000000000 999999999"}));
    ExampleRunner.eq(12, 400000032, new ThreeTeleports().shortestDistance(100000000, 100000000, 900000000, 900000000, new String[]{"0 1 0 999999999", "1 1000000000 999999999 0", "1000000000 1 1000000000 999999999"}));
    ExampleRunner.eq(13, 1999999970, new ThreeTeleports().shortestDistance(0, 0, 1000000000, 1000000000, new String[]{"10 10 20 20", "30 30 40 40", "50 50 60 60"}));
    ExampleRunner.eq(14, 306192581, new ThreeTeleports().shortestDistance(630664613, 48733225, 873984926, 111605493, new String[]{"496495503 532857995 6389190 205314732", "351146273 99276298 616908938 737305630", "149168564 223552081 896571830 750247780"}));
    ExampleRunner.eq(15, 205264376, new ThreeTeleports().shortestDistance(50408182, 27065196, 71243950, 211493804, new String[]{"460798245 193700180 768780978 110314044", "161021468 381388250 38241460 277796212", "132401597 100164166 555601411 757948526"}));
    ExampleRunner.eq(16, 202104653, new ThreeTeleports().shortestDistance(712631043, 118540020, 532788793, 140802423, new String[]{"260045739 373051551 534047058 967908021", "420942603 167942392 1752658 859937375", "928889958 363876166 948383842 599106823"}));
    ExampleRunner.eq(17, 854429983, new ThreeTeleports().shortestDistance(546584061, 324784219, 966183692, 999475275, new String[]{"661541168 612406094 429392943 370311369", "680615656 677465501 325928495 616181925", "547062176 137391772 718766719 174029970"}));
    ExampleRunner.eq(18, 878909704, new ThreeTeleports().shortestDistance(866154370, 322991744, 210516672, 546263750, new String[]{"96594644 804330222 205018575 615354689", "672041722 224166329 767001599 433866842", "829621741 766952971 35347560 237749511"}));
    ExampleRunner.eq(19, 831575087, new ThreeTeleports().shortestDistance(813300993, 984676869, 954874690, 294675479, new String[]{"547128517 972299039 241873242 209633570", "884270246 526283458 348993624 663818661", "443452221 232587364 147469751 396526508"}));
    ExampleRunner.eq(20, 596000856, new ThreeTeleports().shortestDistance(824232356, 763852653, 316650882, 317179572, new String[]{"666331214 94848296 477923139 276070409", "399770590 652426803 611280619 557969047", "387720696 51570693 580888001 747874855"}));
    ExampleRunner.eq(21, 446478595, new ThreeTeleports().shortestDistance(272910313, 968932248, 211109133, 454430785, new String[]{"276284707 433053339 420117411 756213781", "463896611 622885230 316291167 744006274", "882163211 914764017 201629599 992297292"}));
    ExampleRunner.eq(22, 516726397, new ThreeTeleports().shortestDistance(333373883, 162127112, 758288658, 535408203, new String[]{"301497316 99178126 799699526 915898169", "510380099 847661103 663240458 643662878", "516479190 886338396 630580976 727878106"}));
    ExampleRunner.eq(23, 206115442, new ThreeTeleports().shortestDistance(513658547, 74790663, 649497119, 4513793, new String[]{"897416087 150884582 338400872 733815494", "317208874 536047322 304705529 828936845", "876575 650834011 927727672 614182273"}));
    ExampleRunner.eq(24, 565086109, new ThreeTeleports().shortestDistance(890781683, 725016422, 223949611, 729365455, new String[]{"837010969 527691546 465582551 801723024", "53348214 899908371 238290034 675589157", "378572645 776632317 67054402 300225591"}));
    ExampleRunner.eq(25, 175678225, new ThreeTeleports().shortestDistance(671841872, 266168722, 761730781, 351958038, new String[]{"377298076 821197206 600551083 929681356", "474188466 626805504 181527483 556858312", "123521315 82002428 223621568 656571357"}));
    ExampleRunner.eq(26, 1227102929, new ThreeTeleports().shortestDistance(113609575, 199402546, 971590229, 883308753, new String[]{"744525829 50839519 958841937 382679275", "163149158 740144914 392701099 790710178", "472377598 380977537 444595305 723543772"}));
    ExampleRunner.eq(27, 920547207, new ThreeTeleports().shortestDistance(34745001, 812395769, 978246999, 451840145, new String[]{"535143777 712994346 29745647 117880392", "170907737 778817344 196765135 218545545", "851728243 112142809 437824671 175015147"}));
    ExampleRunner.eq(28, 534401409, new ThreeTeleports().shortestDistance(238531736, 490888840, 818814410, 289729074, new String[]{"49633963 630835852 380961180 442790597", "987665175 651154119 683443633 862022026", "165297338 279480238 832064542 526237341"}));
    ExampleRunner.eq(29, 603039672, new ThreeTeleports().shortestDistance(726193834, 757504680, 110855185, 371980211, new String[]{"221032227 914814041 177485617 599940635", "143241481 504287599 116315997 508799197", "467907376 904218420 8586378 467750868"}));
    ExampleRunner.eq(30, 786395810, new ThreeTeleports().shortestDistance(521929712, 318949212, 953456006, 988385697, new String[]{"888889590 491833199 453233527 579263848", "254546297 955685711 462575961 294916199", "467724564 950513093 670863496 432807182"}));
    ExampleRunner.eq(31, 1118071245, new ThreeTeleports().shortestDistance(6346093, 433210778, 990738508, 655051170, new String[]{"838325312 552167142 978083117 809531431", "85317813 536122004 81312943 111391313", "452715627 313591789 202784053 331060"}));
    ExampleRunner.eq(32, 775019195, new ThreeTeleports().shortestDistance(23703008, 294481282, 879597716, 890702265, new String[]{"548714867 864135503 299644062 152852762", "744500033 326837995 758408571 796371805", "588539897 957430875 542141665 246273536"}));
    ExampleRunner.eq(33, 255527816, new ThreeTeleports().shortestDistance(145498650, 392127453, 106767214, 175331073, new String[]{"535104496 227065053 131260293 229282354", "799049409 992413071 551610714 493058672", "997181444 979615910 515667313 732225457"}));
    ExampleRunner.eq(34, 3645738, new ThreeTeleports().shortestDistance(43767499, 293613968, 923531489, 877694217, new String[]{"43766240 293262939 422848910 391571754", "423570510 391739114 860143685 364709398", "859696623 365194596 922682678 877070828"}));
    ExampleRunner.eq(35, 4440311, new ThreeTeleports().shortestDistance(257303836, 567013022, 559816427, 455017415, new String[]{"908198683 645993163 102156109 463093409", "559129648 454419496 101580415 463430281", "907886971 646772770 256344090 566821070"}));
    ExampleRunner.eq(36, 4321420, new ThreeTeleports().shortestDistance(251747174, 214945386, 915592983, 47527, new String[]{"46330587 376224822 343332664 837421511", "342600537 838350568 916109879 795241", "46508754 375623483 252326212 214982438"}));
    ExampleRunner.eq(37, 4466643, new ThreeTeleports().shortestDistance(730373425, 894753427, 242867242, 580292800, new String[]{"731370559 894260538 172085400 979696883", "363158 916339097 172202330 980134715", "1092044 916434891 242013485 579549409"}));
    ExampleRunner.eq(38, 4037810, new ThreeTeleports().shortestDistance(44431990, 149823130, 366572829, 342647922, new String[]{"256908645 198313227 709862831 854534743", "710540444 855250605 44064139 150465583", "257583322 198383935 366941723 343167644"}));
    ExampleRunner.eq(39, 3934088, new ThreeTeleports().shortestDistance(26554310, 445514835, 921490406, 189666250, new String[]{"232701270 702993783 27114202 445183655", "232197206 703689877 867358576 813207569", "922407358 189531062 866873232 813512913"}));
    ExampleRunner.eq(40, 3780654, new ThreeTeleports().shortestDistance(806025998, 977572157, 137475848, 518499417, new String[]{"300541907 750846639 261777803 20498007", "806086410 977277507 299630466 751837744", "137470494 518212575 260805942 20756966"}));
    ExampleRunner.eq(41, 4786633, new ThreeTeleports().shortestDistance(172221514, 635197135, 513983821, 30256221, new String[]{"228570717 762145365 171563344 635477977", "514432142 30864120 246132856 854567327", "229215795 762882261 246873370 855236210"}));
    ExampleRunner.eq(42, 3591409, new ThreeTeleports().shortestDistance(484243167, 568782388, 635773238, 553089901, new String[]{"433961062 561211307 731058277 471001013", "635422730 552873347 433722128 562168089", "484182728 569260814 730742352 471974824"}));
    ExampleRunner.eq(43, 3404306, new ThreeTeleports().shortestDistance(888440684, 918829226, 463020864, 489848629, new String[]{"888499837 917836841 37096754 270276299", "36615580 270408718 204642168 268085611", "462714380 489547658 203676351 267919738"}));
    ExampleRunner.eq(44, 3223650, new ThreeTeleports().shortestDistance(847805538, 349559051, 718319133, 781723914, new String[]{"848735459 349913415 875148587 836885115", "853355015 139284922 717935849 781696273", "853922317 139254496 875553612 836359458"}));
    ExampleRunner.eq(45, 3947271, new ThreeTeleports().shortestDistance(972542529, 533951492, 404979554, 524765571, new String[]{"54197249 420779627 658459747 295997579", "404840511 524223595 657614524 296528492", "972648462 534303792 54861802 421546927"}));
    ExampleRunner.eq(46, 3882761, new ThreeTeleports().shortestDistance(922397295, 120406410, 946248138, 902180543, new String[]{"968688738 508615169 947154032 901341020", "922035635 119733598 505998745 436520840", "506560174 436417638 968296341 508660983"}));
    ExampleRunner.eq(47, 4650940, new ThreeTeleports().shortestDistance(140442590, 423955552, 381051282, 739157713, new String[]{"817785273 844831633 807923175 758265776", "807505937 757728853 141318993 424271395", "380472740 740100286 817007921 845037669"}));
    ExampleRunner.eq(48, 4531392, new ThreeTeleports().shortestDistance(265812178, 546280252, 199699268, 797385816, new String[]{"767300196 303589461 200493762 796484481", "185452201 185667426 766498232 304308185", "265722902 547031623 185297155 185986578"}));
    ExampleRunner.eq(49, 4650432, new ThreeTeleports().shortestDistance(632841087, 294160314, 329243573, 743769717, new String[]{"743660503 752676070 376957534 447358131", "743084539 753638725 633770263 293932260", "377237876 448284125 329013656 743251417"}));
    ExampleRunner.eq(50, 5371399, new ThreeTeleports().shortestDistance(361636101, 203058830, 434802682, 881001269, new String[]{"221381092 261647733 360887805 202979837", "434024867 880063690 562486609 644340562", "561595250 645213325 221678001 260880078"}));
    ExampleRunner.eq(51, 4317012, new ThreeTeleports().shortestDistance(9649579, 460291009, 5078017, 414501854, new String[]{"3726072 525772909 891715551 699525377", "3963892 526707921 10367369 459902547", "892241242 698944467 5573758 414937410"}));
    ExampleRunner.eq(52, 4332503, new ThreeTeleports().shortestDistance(760370766, 313775395, 436426943, 133380682, new String[]{"760509378 314607049 981117324 144817332", "342167113 210421618 981616998 145710117", "342799252 210073412 435501254 133316968"}));
    ExampleRunner.eq(53, 4691315, new ThreeTeleports().shortestDistance(415423343, 524068936, 871257497, 510345517, new String[]{"166734363 756275100 483158338 186218485", "165862224 755668983 415920710 523303262", "871082452 509851953 482192307 186533833"}));
    ExampleRunner.eq(54, 1110359, new ThreeTeleports().shortestDistance(408709545, 19818312, 907384075, 935316792, new String[]{"908013745 936128408 408766869 19792665", "907700932 935589088 408222639 20044607", "906906269 935720441 408683231 19615732"}));
    ExampleRunner.eq(55, 1275871, new ThreeTeleports().shortestDistance(678896388, 272811031, 974078426, 686078654, new String[]{"975017215 685758903 678906491 272803813", "974676866 685915435 678572249 273284657", "974247459 686825470 679414142 272893204"}));
    ExampleRunner.eq(56, 1833550, new ThreeTeleports().shortestDistance(834690520, 940005356, 958288744, 8948665, new String[]{"957592754 8653203 835460756 939933504", "834998702 940724437 959022890 9627275", "835227301 940899508 958130690 9331917"}));
    ExampleRunner.eq(57, 1580088, new ThreeTeleports().shortestDistance(860336881, 6062489, 565263345, 621528510, new String[]{"859658631 6004615 565888255 620711850", "859926272 6954049 564361902 621511067", "564631673 621041364 859899536 6038574"}));
    ExampleRunner.eq(58, 1773673, new ThreeTeleports().shortestDistance(553455458, 915427850, 12558279, 382265250, new String[]{"553123299 914597814 12313069 382684524", "554028822 915928902 12858951 382663825", "554322441 915834138 13368240 381912317"}));
    ExampleRunner.eq(59, 1891749, new ThreeTeleports().shortestDistance(883668557, 648159861, 725143100, 363296639, new String[]{"725987322 363002914 884256666 649095099", "883913159 648543784 726045820 362936145", "883509057 647192604 725410094 364060451"}));
    ExampleRunner.eq(60, 1594441, new ThreeTeleports().shortestDistance(57410944, 767040452, 442440953, 202788472, new String[]{"443351874 203641790 57320885 766384843", "443434206 201903966 57988518 766691811", "442668676 203163481 57393912 766065785"}));
    ExampleRunner.eq(61, 1084428, new ThreeTeleports().shortestDistance(655895284, 670602750, 15785618, 752456236, new String[]{"15098545 751733030 656876365 670352215", "655132632 671281532 16702367 751800318", "15940240 752817614 655841285 671117169"}));
    ExampleRunner.eq(62, 1619549, new ThreeTeleports().shortestDistance(216564110, 232397552, 663275024, 217633078, new String[]{"663089563 218618259 217423090 231502831", "662994348 216866075 217342483 232800025", "663471159 218550458 216318662 232136976"}));
    ExampleRunner.eq(63, 1859868, new ThreeTeleports().shortestDistance(310401578, 851184245, 945105322, 826414352, new String[]{"945634105 826112125 311004685 851742792", "945712756 826876436 310586196 851789967", "309518520 851821934 945666020 826366500"}));
    ExampleRunner.eq(64, 1454306, new ThreeTeleports().shortestDistance(140529534, 778518573, 421124743, 902221938, new String[]{"420464081 901986466 140769925 778200802", "140123764 779311194 421946918 901656305", "140146583 779165308 420195493 902719178"}));
    ExampleRunner.eq(65, 970109, new ThreeTeleports().shortestDistance(172612040, 218257441, 479447071, 954584480, new String[]{"480081384 954546952 172350045 218221178", "172512847 217555053 478775303 954659375", "479248236 955087303 172067841 217534668"}));
    ExampleRunner.eq(66, 1451068, new ThreeTeleports().shortestDistance(365148679, 516462508, 262445444, 854069332, new String[]{"364595394 516628551 262378156 855055435", "261529527 853236558 364819650 517347108", "262578930 853982244 364790325 515590378"}));
    ExampleRunner.eq(67, 1935082, new ThreeTeleports().shortestDistance(943571916, 789588185, 27475276, 191482273, new String[]{"942855606 790455407 27002990 192178557", "944484156 788843306 27199778 191479818", "27414378 190509090 944204209 790480792"}));
    ExampleRunner.eq(68, 1693125, new ThreeTeleports().shortestDistance(884679002, 526275681, 344998300, 877963230, new String[]{"885093350 525281944 345752526 877149167", "885476268 526368121 345867073 877065320", "345135154 878342657 885153968 525573813"}));
    ExampleRunner.eq(69, 1215180, new ThreeTeleports().shortestDistance(260633944, 764469353, 447834027, 260101624, new String[]{"260203725 763952424 447979553 260939680", "447953426 260140251 259770878 765372207", "261133629 764276065 447343759 260069695"}));
    ExampleRunner.eq(70, 1937136, new ThreeTeleports().shortestDistance(456105671, 672341185, 160456638, 1542670, new String[]{"159578348 1057696 455535149 673275958", "159905957 1767193 455115669 672513105", "457055197 671916146 159521177 1975481"}));
    ExampleRunner.eq(71, 1669973, new ThreeTeleports().shortestDistance(219563023, 657800264, 161354481, 990960963, new String[]{"219715046 658052159 160433557 991306084", "220274019 658476931 162228969 991207664", "162001360 991472930 219295899 657259520"}));
    ExampleRunner.eq(72, 1805562, new ThreeTeleports().shortestDistance(871816760, 773474856, 69431425, 582201089, new String[]{"68549041 582125418 872374087 772811290", "871091348 773871328 69888587 582681865", "871654744 773597092 70073195 583080619"}));
    ExampleRunner.eq(73, 1860340, new ThreeTeleports().shortestDistance(723552702, 446044757, 506632797, 212654751, new String[]{"722647315 445855628 506673455 211929595", "506032528 213289618 723983513 446994815", "507242513 213198187 724300993 446713353"}));
    ExampleRunner.eq(74, 250581, new ThreeTeleports().shortestDistance(643729313, 579469950, 458675469, 564240749, new String[]{"643737194 579541992 292324374 575773962", "459114022 564318234 644488528 579128105", "458680424 564330752 292270286 575795554"}));
    ExampleRunner.eq(75, 375438, new ThreeTeleports().shortestDistance(645480437, 30976971, 642491624, 813956858, new String[]{"440826652 674992349 645464695 30940501", "645813109 31197660 641501668 813884275", "642411071 814042803 440923466 674932455"}));
    ExampleRunner.eq(76, 338138, new ThreeTeleports().shortestDistance(194908615, 399537617, 480772206, 679952356, new String[]{"710432895 532260636 480829253 679992698", "481347899 680307272 194314622 400188243", "194846489 399496469 710359037 532324233"}));
    ExampleRunner.eq(77, 258370, new ThreeTeleports().shortestDistance(188203740, 894001326, 611862458, 112072569, new String[]{"187601640 893974686 612735834 111346634", "664716824 754351240 188237572 893968702", "611876923 112140395 664649713 754308748"}));
    ExampleRunner.eq(78, 2648349, new ThreeTeleports().shortestDistance(410334001, 976686045, 548006854, 959698717, new String[]{"409398287 976182602 547051880 959444509", "548651986 959251373 992348428 235453981", "993330733 235549593 411032437 977655203"}));
    ExampleRunner.eq(79, 261234, new ThreeTeleports().shortestDistance(108123087, 218083574, 952167030, 281512065, new String[]{"951647202 281079347 108031518 217793901", "851133055 344629831 108157750 218105234", "851093848 344571693 952140430 281593011"}));
    ExampleRunner.eq(80, 182730, new ThreeTeleports().shortestDistance(640961680, 9800688, 547936182, 125596476, new String[]{"227584670 160515679 640974387 9769446", "640832367 9130963 546963385 126242387", "547879147 125609937 227603148 160465892"}));
    ExampleRunner.eq(81, 1656748, new ThreeTeleports().shortestDistance(743695770, 736162224, 791258070, 134616547, new String[]{"744652576 735580925 784725497 815048519", "790697228 133837596 743821409 735970918", "791412760 134665885 785065310 814300896"}));
    ExampleRunner.eq(82, 1168986, new ThreeTeleports().shortestDistance(80301858, 826413595, 409044578, 289436766, new String[]{"603571157 421362949 409089649 289364578", "408329576 289469617 80677380 826459196", "79635990 826855332 604350031 422092195"}));
    ExampleRunner.eq(83, 357918, new ThreeTeleports().shortestDistance(402997626, 974866052, 410601023, 976666447, new String[]{"257874349 353667986 410599639 976626671", "410841963 977392295 402106060 974643252", "257774403 353733269 403086520 974928667"}));
    ExampleRunner.eq(84, 297263, new ThreeTeleports().shortestDistance(163273342, 152247602, 436640006, 52351390, new String[]{"163225303 152774985 436300752 52576578", "436635464 52427408 629247185 684839214", "629296406 684872457 163182903 152291382"}));
    ExampleRunner.eq(85, 329057, new ThreeTeleports().shortestDistance(267117142, 660278827, 988066327, 971801584, new String[]{"184548180 47599697 267162850 660365634", "988302068 970995435 266454704 659766440", "184525595 47533464 988123241 971750794"}));
    ExampleRunner.eq(86, 242875, new ThreeTeleports().shortestDistance(105265889, 372130284, 295586799, 278164339, new String[]{"295373298 277524134 104716469 371718656", "743404192 163670744 105294517 372069038", "743412272 163740330 295540550 278193405"}));
    ExampleRunner.eq(87, 1711228, new ThreeTeleports().shortestDistance(450438763, 543262536, 907778177, 341091975, new String[]{"907166811 341265177 451308981 543540165", "907586189 341089958 489844366 784580910", "489297290 784717296 450764017 543771023"}));
    ExampleRunner.eq(88, 1273144, new ThreeTeleports().shortestDistance(727930453, 792916213, 535371809, 496301091, new String[]{"534398597 496319596 382099332 257994564", "535915505 496371603 727996727 792323561", "728106404 793394649 382376820 257969280"}));
    ExampleRunner.eq(89, 1345320, new ThreeTeleports().shortestDistance(797762822, 105049316, 501338537, 963127925, new String[]{"502122596 962253685 107133342 852206971", "798054002 105980808 107903206 852919413", "500949508 962401626 797693327 104888829"}));
    ExampleRunner.eq(90, 1708988, new ThreeTeleports().shortestDistance(479701668, 55648194, 790815034, 931331108, new String[]{"480103474 55315516 791765669 931354967", "790106620 931658623 864533988 536949875", "479157797 55937404 865123715 536354907"}));
    ExampleRunner.eq(91, 2567051, new ThreeTeleports().shortestDistance(558494097, 471878520, 747970147, 137526654, new String[]{"747031025 137237805 699409969 431028574", "558554643 471217710 698729696 430541959", "748894468 136601188 559119718 471786887"}));
    ExampleRunner.eq(92, 333110, new ThreeTeleports().shortestDistance(499739134, 998104108, 103065617, 36342563, new String[]{"907475399 854269762 499663207 998158032", "907535851 854229365 103144343 36366227", "102387995 35913426 498742368 997641357"}));
    ExampleRunner.eq(93, 397426, new ThreeTeleports().shortestDistance(301113766, 787205896, 391837360, 214797774, new String[]{"391903320 214716644 604288997 590754091", "301571157 786718547 391789985 215403869", "301144315 787258921 604376632 590674984"}));
    ExampleRunner.eq(94, 1998, new ThreeTeleports().shortestDistance(1, 1, 1000, 1000, new String[]{"0 1 1 0", "2 1 1 2", "3 3 4 4"}));
    ExampleRunner.eq(95, 36, new ThreeTeleports().shortestDistance(0, 0, 1000000000, 1000000000, new String[]{"0 1 0 999999999", "1 1000000000 999999999 0", "1000000000 1 1000000000 999999999"}));
    ExampleRunner.eq(96, 200000000, new ThreeTeleports().shortestDistance(0, 0, 100000000, 100000000, new String[]{"999999999 999999999 555555555 555555555", "5 6 1 1", "444444444 444444444 555555556 555555556"}));
    ExampleRunner.eq(97, 1999999954, new ThreeTeleports().shortestDistance(0, 0, 999999993, 999999993, new String[]{"999999970 999999970 999999995 999999995", "999999996 999999996 999999997 999999997", "999999998 999999998 999999999 999999999"}));
    ExampleRunner.eq(98, 638, new ThreeTeleports().shortestDistance(0, 0, 10000, 10000, new String[]{"1 1 50 50", "52 52 8000 8000", "7700 7700 9999 9999"}));
    ExampleRunner.eq(99, 2000000000, new ThreeTeleports().shortestDistance(0, 0, 1000000000, 1000000000, new String[]{"1 1 2 2", "3 3 4 4", "5 5 6 6"}));
    ExampleRunner.eq(100, 2000000000, new ThreeTeleports().shortestDistance(0, 0, 1000000000, 1000000000, new String[]{"1 1 2 2", "6 6 3 3", "4 4 5 5"}));
    ExampleRunner.eq(101, 1100000011, new ThreeTeleports().shortestDistance(0, 0, 1000000000, 1000000000, new String[]{"999999999 999999998 999999998 999999999", "999999997 99999998 999999996 999999998", "999999999 999999996 999999997 1000000000"}));
    ExampleRunner.eq(102, 316457060, new ThreeTeleports().shortestDistance(3, 3, 199999999, 123123123, new String[]{"1 2 2 3", "1000 1000 230000 200000", "300 300 3333333 3333333"}));
    ExampleRunner.eq(103, 2000000000, new ThreeTeleports().shortestDistance(0, 0, 1000000000, 1000000000, new String[]{"0 999999998 0 999999999", "1 1000000000 999999999 0", "1000000000 999999998 1000000000 999999999"}));
    ExampleRunner.eq(104, 14, new ThreeTeleports().shortestDistance(0, 0, 20, 20, new String[]{"1000 1003 1000 1004", "18 20 1 1", "1000 1005 1000 1006"}));
    ExampleRunner.eq(105, 117, new ThreeTeleports().shortestDistance(3, 7, 10000, 30000, new String[]{"3 10 5200 4900", "12212 8699 9999 30011", "12200 8701 5203 4845"}));
    ExampleRunner.eq(106, 1999899013, new ThreeTeleports().shortestDistance(1000000000, 1000000000, 1, 999, new String[]{"100000 1004 99998 1001", "99999 1002 3 997", "2 998 1 99"}));
    ExampleRunner.eq(107, 14, new ThreeTeleports().shortestDistance(0, 0, 1000000000, 1000000000, new String[]{"999999999 1000000000 1000000000 999999999", "999999998 1000000000 1000000000 999999998", "999999999 999999999 1 1"}));
    ExampleRunner.eq(108, 1999899018, new ThreeTeleports().shortestDistance(1000000000, 1000000000, 1, 990, new String[]{"100000 1004 99998 1001", "99999 1002 3 997", "2 998 1 99"}));
  }
}