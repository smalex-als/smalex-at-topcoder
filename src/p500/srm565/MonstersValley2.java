package p500.srm565;

import utils.ExampleRunner;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 1/13/13
 * Time: 9:30 AM
 */
public class MonstersValley2 {
  public int minimumPrice(int[] dread, int[] price) {
    return solve(dread, price, 0, 0L, 0);
  }

  private int solve(int[] dread, int[] price, int pos, long scariness, int totalPrice) {
    if (dread.length == pos) {
      return totalPrice;
    }
    int c0 = solve(dread, price, pos + 1, scariness + dread[pos], totalPrice + price[pos]);
    if (dread[pos] <= scariness) {
      int c1 = solve(dread, price, pos + 1, scariness, totalPrice);
      return Math.min(c0, c1);
    }
    return c0;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 2, new MonstersValley2().minimumPrice(new int[]{8, 5, 10}, new int[]{1, 1, 2}));
    ExampleRunner.eq(2, 5, new MonstersValley2().minimumPrice(new int[]{1, 2, 4, 1000000000}, new int[]{1, 1, 1, 2}));
    ExampleRunner.eq(3, 2, new MonstersValley2().minimumPrice(new int[]{200, 107, 105, 206, 307, 400}, new int[]{1, 2, 1, 1, 1, 2}));
    ExampleRunner.eq(4, 5, new MonstersValley2().minimumPrice(new int[]{5216, 12512, 613, 1256, 66, 17202, 30000, 23512, 2125, 33333}, new int[]{2, 2, 1, 1, 1, 1, 2, 1, 2, 1}));
    ExampleRunner.eq(5, 2, new MonstersValley2().minimumPrice(new int[]{606}, new int[]{2}));
    ExampleRunner.eq(6, 2, new MonstersValley2().minimumPrice(new int[]{524657775}, new int[]{2}));
    ExampleRunner.eq(7, 3, new MonstersValley2().minimumPrice(new int[]{3, 2, 5, 7}, new int[]{1, 1, 2, 2}));
    ExampleRunner.eq(8, 40, new MonstersValley2().minimumPrice(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288}, new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
    ExampleRunner.eq(9, 28, new MonstersValley2().minimumPrice(new int[]{1, 2, 4, 6, 16, 19, 64, 105, 256, 464, 1024, 1463, 4096, 4515, 16384, 21445, 65536, 68543, 262144, 479277}, new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
    ExampleRunner.eq(10, 2, new MonstersValley2().minimumPrice(new int[]{1999999991, 1999999992, 1999999993, 1999999994, 1999999995, 1999999996, 1999999997, 1999999998, 1999999999, 2000000000}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(11, 2, new MonstersValley2().minimumPrice(new int[]{276378, 939933, 574877, 888702, 683628}, new int[]{1, 1, 2, 1, 1}));
    ExampleRunner.eq(12, 3, new MonstersValley2().minimumPrice(new int[]{492214, 378290, 162083, 858555}, new int[]{2, 2, 2, 1}));
    ExampleRunner.eq(13, 3, new MonstersValley2().minimumPrice(new int[]{138742, 878514, 852494, 542526, 953090, 618335, 834947, 451187, 818761, 498817, 701160, 996792, 845435, 145660, 183611, 150459, 635733, 718307}, new int[]{2, 1, 1, 1, 2, 1, 1, 1, 2, 2, 1, 2, 1, 1, 2, 2, 2, 2}));
    ExampleRunner.eq(14, 4, new MonstersValley2().minimumPrice(new int[]{406711, 813026, 985429, 693445, 653459, 851295, 299367, 676132, 770750, 363356, 658504}, new int[]{2, 2, 2, 1, 2, 2, 1, 1, 1, 2, 2}));
    ExampleRunner.eq(15, 3, new MonstersValley2().minimumPrice(new int[]{278033, 630470, 39142, 604719, 36490, 400221, 576007, 298209, 202048, 406921}, new int[]{1, 2, 1, 2, 1, 1, 2, 2, 2, 1}));
    ExampleRunner.eq(16, 3, new MonstersValley2().minimumPrice(new int[]{549037, 846063, 786688, 666614, 592108}, new int[]{1, 2, 1, 1, 2}));
    ExampleRunner.eq(17, 4, new MonstersValley2().minimumPrice(new int[]{229505, 433280, 915022}, new int[]{1, 1, 2}));
    ExampleRunner.eq(18, 2, new MonstersValley2().minimumPrice(new int[]{773105}, new int[]{2}));
    ExampleRunner.eq(19, 3, new MonstersValley2().minimumPrice(new int[]{633301, 301906, 445427, 509043, 673939}, new int[]{2, 1, 1, 2, 2}));
    ExampleRunner.eq(20, 4, new MonstersValley2().minimumPrice(new int[]{274987, 988110, 468154, 354593}, new int[]{2, 2, 2, 1}));
    ExampleRunner.eq(21, 4, new MonstersValley2().minimumPrice(new int[]{597625, 249122, 838726, 402201, 933860, 658620}, new int[]{2, 2, 2, 2, 1, 1}));
    ExampleRunner.eq(22, 3, new MonstersValley2().minimumPrice(new int[]{202840, 843337, 326007, 731681, 931244, 610300, 140830, 347449, 178713, 160244, 772831, 243548, 350741, 445070, 943259, 85348}, new int[]{1, 2, 1, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1}));
    ExampleRunner.eq(23, 5, new MonstersValley2().minimumPrice(new int[]{78341, 111924, 510644, 87408, 619644, 910888, 695650, 66650, 223357}, new int[]{1, 1, 2, 1, 1, 1, 1, 2, 2}));
    ExampleRunner.eq(24, 2, new MonstersValley2().minimumPrice(new int[]{854876, 611886, 818411, 568380, 109228, 412632, 148292, 177354, 806246, 831430, 643369, 671409, 374510, 97982}, new int[]{2, 1, 2, 1, 1, 2, 2, 1, 1, 2, 1, 2, 2, 2}));
    ExampleRunner.eq(25, 3, new MonstersValley2().minimumPrice(new int[]{333735, 907985, 13361, 107282, 879340, 825598, 497004, 35801, 451639, 541320, 859429, 587990, 989163}, new int[]{1, 2, 1, 2, 1, 1, 2, 1, 1, 1, 2, 1, 2}));
    ExampleRunner.eq(26, 4, new MonstersValley2().minimumPrice(new int[]{730354301, 612652745, 231201198, 1785940683, 1573792486, 1862050299, 55215265, 1482185079, 580169303, 745811023, 116284213, 1674085202, 243582700, 1259989441, 459631588, 1113164735, 549938993, 1675101506, 144384566, 1897340738}, new int[]{2, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 2, 2, 2}));
    ExampleRunner.eq(27, 2, new MonstersValley2().minimumPrice(new int[]{1415229038, 834285838, 1214442017, 1217534876}, new int[]{2, 1, 2, 1}));
    ExampleRunner.eq(28, 3, new MonstersValley2().minimumPrice(new int[]{368805779, 1818947888, 1788720857, 1788391727, 659610167, 1757059785, 1951203365, 1365448488, 1291565579, 212981422}, new int[]{1, 2, 1, 1, 1, 2, 1, 2, 1, 1}));
    ExampleRunner.eq(29, 3, new MonstersValley2().minimumPrice(new int[]{953379700, 1963120299, 648003103, 1545329216, 248966873, 997656371, 1408722762, 640985409, 150299963, 651226125, 1983428467}, new int[]{2, 1, 1, 1, 2, 1, 2, 2, 1, 1, 2}));
    ExampleRunner.eq(30, 3, new MonstersValley2().minimumPrice(new int[]{1547217503, 1787964172, 281041017, 127192884, 686068400, 1518709677, 75143338, 877524025, 1830002240, 95142533, 1229301205}, new int[]{2, 1, 2, 1, 1, 2, 1, 1, 1, 1, 2}));
    ExampleRunner.eq(31, 4, new MonstersValley2().minimumPrice(new int[]{131144893, 1253402892, 327490895, 758530919, 575176500, 1048213981, 636183295, 306142540, 475491284, 117815209, 894552824, 1065451684}, new int[]{2, 2, 2, 1, 1, 2, 2, 1, 2, 1, 2, 1}));
    ExampleRunner.eq(32, 2, new MonstersValley2().minimumPrice(new int[]{1691715165, 1069375201, 110077378, 367162390, 1055161432, 232475527}, new int[]{2, 1, 2, 1, 1, 1}));
    ExampleRunner.eq(33, 2, new MonstersValley2().minimumPrice(new int[]{559787380, 111124697, 211951612, 26295899, 989297246, 813172925}, new int[]{1, 2, 1, 2, 1, 2}));
    ExampleRunner.eq(34, 4, new MonstersValley2().minimumPrice(new int[]{86780821, 1140185415, 85548635, 347237270, 1167764408, 1604033858, 1993911067, 1875463689, 1361486142, 675528710, 1858647747, 1826530257, 1355912372, 1314505700, 194376352, 1067180132}, new int[]{1, 2, 1, 1, 1, 2, 2, 1, 2, 1, 2, 1, 1, 2, 2, 2}));
    ExampleRunner.eq(35, 2, new MonstersValley2().minimumPrice(new int[]{853744211, 1559615791, 866431564, 1860458362, 1080823152, 973755754, 926899774}, new int[]{1, 1, 1, 1, 2, 1, 1}));
    ExampleRunner.eq(36, 4, new MonstersValley2().minimumPrice(new int[]{637463334, 492295149, 644830292, 569798827, 43394064, 1651455355, 898690609, 1248694777, 1949378803, 931930223}, new int[]{2, 2, 1, 1, 2, 1, 1, 2, 1, 2}));
    ExampleRunner.eq(37, 2, new MonstersValley2().minimumPrice(new int[]{1992350787, 1204067578, 1971977184, 1986727084, 550738791, 958698508}, new int[]{2, 1, 1, 1, 2, 1}));
    ExampleRunner.eq(38, 1, new MonstersValley2().minimumPrice(new int[]{1383678529, 138906144, 940996497, 619586457}, new int[]{1, 2, 2, 1}));
    ExampleRunner.eq(39, 2, new MonstersValley2().minimumPrice(new int[]{1782688262, 895047095, 1625373870, 1009836949, 985560038, 1470346827, 296839142, 34727454, 413009041, 1114435639, 1692481802, 422406335, 795130000, 1455087504, 410389760, 961349143, 1693064512, 621415696, 98442513}, new int[]{2, 2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1}));
    ExampleRunner.eq(40, 3, new MonstersValley2().minimumPrice(new int[]{992388416, 198261504, 772412033, 1889458810}, new int[]{1, 2, 2, 2}));
    ExampleRunner.eq(41, 10, new MonstersValley2().minimumPrice(new int[]{55812, 129413, 3369997, 2698415, 50526015, 32026198, 5355511, 100092466, 265746384, 156194334, 99374300, 635472617, 180646818, 91608661, 417850817, 1022057911, 1729513937}, new int[]{1, 1, 2, 1, 1, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1}));
    ExampleRunner.eq(42, 10, new MonstersValley2().minimumPrice(new int[]{2589192, 23314744, 97814, 245124401, 390282178, 758765331, 159041187, 1912259796}, new int[]{1, 2, 1, 2, 2, 2, 1, 1}));
    ExampleRunner.eq(43, 8, new MonstersValley2().minimumPrice(new int[]{1661394, 73478485, 124895705, 402068495, 507240373, 1961191628}, new int[]{1, 1, 2, 2, 2, 2}));
    ExampleRunner.eq(44, 9, new MonstersValley2().minimumPrice(new int[]{1252017, 3776329, 21140492, 5357875, 59227052, 88302560, 344236822, 52938928, 256182128, 321584565, 22692247}, new int[]{2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1}));
    ExampleRunner.eq(45, 8, new MonstersValley2().minimumPrice(new int[]{174927, 10654989, 55924062, 70457525, 52549382, 393666222, 773214540, 1177429024, 1280559141}, new int[]{2, 1, 1, 2, 2, 1, 1, 2, 2}));
    ExampleRunner.eq(46, 13, new MonstersValley2().minimumPrice(new int[]{335520, 7166533, 19084297, 44364675, 66301712, 243376382, 369091309, 441177770, 553345446, 768799475, 1459642711, 854126713}, new int[]{2, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(47, 14, new MonstersValley2().minimumPrice(new int[]{178041, 241271, 3554145, 15146146, 29336857, 41372319, 78867753, 27414201, 108212503, 69279302, 312855571, 110338295, 82908093, 467516892, 125004100, 434086364, 172491586, 1039740703, 590277, 1754775248}, new int[]{1, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1}));
    ExampleRunner.eq(48, 12, new MonstersValley2().minimumPrice(new int[]{149235, 2702103, 9621991, 16444946, 24895184, 48928723, 127681201, 45700795, 234008969, 114105628, 350087054, 311983334, 652890170, 347935195, 390614530, 893201743, 1889846895}, new int[]{1, 2, 1, 2, 1, 2, 2, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1}));
    ExampleRunner.eq(49, 11, new MonstersValley2().minimumPrice(new int[]{590449, 4731049, 1584478, 100420763, 86249282, 194454422, 808571587, 534818108, 1742459894}, new int[]{1, 2, 1, 2, 2, 2, 2, 2, 2}));
    ExampleRunner.eq(50, 9, new MonstersValley2().minimumPrice(new int[]{758992, 6901301, 80078202, 103054334, 331245983, 851301800, 209431393}, new int[]{2, 2, 2, 1, 1, 1, 2}));
    ExampleRunner.eq(51, 11, new MonstersValley2().minimumPrice(new int[]{375459, 617787, 10425424, 12611536, 12212171, 75005736, 8846978, 9301694, 142058581, 72615651, 60574288, 592619153, 459336400, 430567015, 1287700983, 1045283211, 269698502}, new int[]{1, 1, 1, 2, 2, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 1}));
    ExampleRunner.eq(52, 13, new MonstersValley2().minimumPrice(new int[]{197538, 2088936, 3509470, 20939186, 50206421, 22604497, 133400415, 187910255, 11826249, 388209892, 6886617, 588380619, 240052207, 63701601, 551901468, 209580949, 1758858199}, new int[]{2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 2, 1, 1, 1, 2, 2, 1}));
    ExampleRunner.eq(53, 13, new MonstersValley2().minimumPrice(new int[]{3843, 437808, 4088636, 21920545, 17728351, 17282550, 111536526, 20625035, 71882430, 129029409, 39581290, 535389768, 749333266, 558761224, 687500849, 1309193142, 1247523583, 1385101352}, new int[]{2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1, 1}));
    ExampleRunner.eq(54, 8, new MonstersValley2().minimumPrice(new int[]{7290252, 124728206, 425327327, 980140755, 1694076474}, new int[]{2, 1, 2, 1, 2}));
    ExampleRunner.eq(55, 13, new MonstersValley2().minimumPrice(new int[]{849513, 6100784, 12751708, 26051050, 84524432, 275567165, 512229310, 936185513, 539883036, 315995883}, new int[]{1, 2, 1, 2, 2, 2, 1, 2, 2, 2}));
    ExampleRunner.eq(56, 10, new MonstersValley2().minimumPrice(new int[]{443857, 5975205, 24095251, 43860354, 49925895, 60205760, 294428884, 207406340, 463155265, 813378725, 757188699, 1390259091, 1674862744}, new int[]{1, 1, 1, 1, 1, 2, 2, 1, 2, 1, 2, 2, 1}));
    ExampleRunner.eq(57, 10, new MonstersValley2().minimumPrice(new int[]{250438, 568979, 18796848, 31305606, 81014756, 98204282, 141687369, 97810698, 220060650, 631383745, 777312423, 156798369, 1845437234}, new int[]{1, 1, 2, 2, 1, 1, 2, 2, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(58, 9, new MonstersValley2().minimumPrice(new int[]{672107, 2643074, 529850, 35636615, 81113168, 96575175, 104125968, 39236967, 165081715, 60078595, 914507263, 175347362, 679297708, 1718078629}, new int[]{1, 1, 2, 1, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1}));
    ExampleRunner.eq(59, 12, new MonstersValley2().minimumPrice(new int[]{167878, 3169023, 3526829, 15558338, 8689814, 15469622, 70341228, 161912435, 270279010, 191495798, 471391453, 336129399, 667939157, 772487373, 1109149871, 296224343, 35789463}, new int[]{2, 2, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 2, 1}));
    ExampleRunner.eq(60, 10, new MonstersValley2().minimumPrice(new int[]{122173, 2071445, 898765, 753106, 29143508, 54727654, 32025475, 142197187, 207263662, 350616206, 282479798, 567189003, 251941626, 357631619, 2918998, 697433033}, new int[]{2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 2, 1}));
    ExampleRunner.eq(61, 14, new MonstersValley2().minimumPrice(new int[]{48219, 920898, 2179240, 9993589, 29116629, 59158375, 61577353, 39926727, 79239592, 92299665, 38869806, 114951159, 224003787, 252096248, 953956706, 626496202, 397656017, 434784538, 1407497740}, new int[]{1, 2, 2, 2, 1, 1, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 1}));
    ExampleRunner.eq(62, 10, new MonstersValley2().minimumPrice(new int[]{117426, 417423, 6529466, 13572907, 20582830, 3355360, 56555551, 6642336, 186172523, 186804224, 15277581, 59444651, 254457068, 310528342, 423416841, 782884539, 743464702, 369610019, 643257039}, new int[]{1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1}));
    ExampleRunner.eq(63, 7, new MonstersValley2().minimumPrice(new int[]{874437, 6826273, 39807214, 18556188, 38704414, 282109373, 314755786, 213092538, 134585833, 1119684013, 918295190}, new int[]{2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 2}));
    ExampleRunner.eq(64, 11, new MonstersValley2().minimumPrice(new int[]{265556, 2061422, 1500718, 17959647, 28180125, 82100102, 134639402, 206809129, 187309364, 128555403, 439962828, 102933635, 669498463, 769511250, 1169307215, 196661619, 1182466435}, new int[]{2, 1, 2, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1}));
    ExampleRunner.eq(65, 8, new MonstersValley2().minimumPrice(new int[]{3257543, 372916, 73752274, 95265442, 170354021, 300856091, 141810509, 1488011678}, new int[]{2, 1, 1, 1, 2, 2, 1, 2}));
    ExampleRunner.eq(66, 10, new MonstersValley2().minimumPrice(new int[]{678548, 1356065, 3601825, 12822103, 103809657, 193401443, 234096960, 74135382, 579744808, 141624669, 731841174, 446013106, 465189490}, new int[]{2, 2, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 1}));
    ExampleRunner.eq(67, 14, new MonstersValley2().minimumPrice(new int[]{319437, 1878550, 3190318, 20409721, 14727941, 43516041, 93601628, 163005037, 136571399, 254741226, 109779898, 201373153, 316232079, 24567749, 400406805, 1018098274, 1550461119, 36029233}, new int[]{2, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 1, 2}));
    ExampleRunner.eq(68, 8, new MonstersValley2().minimumPrice(new int[]{1191368, 44420765, 64593392, 244992255, 147789565, 557199513, 1613458523}, new int[]{1, 1, 2, 1, 1, 2, 1}));
    ExampleRunner.eq(69, 8, new MonstersValley2().minimumPrice(new int[]{6928298, 51309118, 152835695, 208537301, 692935143, 1301925202}, new int[]{2, 1, 2, 1, 1, 2}));
    ExampleRunner.eq(70, 12, new MonstersValley2().minimumPrice(new int[]{45990, 1720448, 2902020, 21294374, 51616526, 33583070, 69583419, 220564857, 59475757, 253250147, 542046018, 475926079, 435733089, 333071866, 119591805, 49108731}, new int[]{2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 2, 1, 2, 1, 1, 1}));
    ExampleRunner.eq(71, 5, new MonstersValley2().minimumPrice(new int[]{1, 2, 4, 1000000000}, new int[]{1, 1, 1, 2}));
    ExampleRunner.eq(72, 2, new MonstersValley2().minimumPrice(new int[]{1999999999, 2000000000, 2000000000}, new int[]{1, 1, 1}));
    ExampleRunner.eq(73, 2, new MonstersValley2().minimumPrice(new int[]{1200000000, 1200000001, 1200000002}, new int[]{1, 1, 1}));
    ExampleRunner.eq(74, 2, new MonstersValley2().minimumPrice(new int[]{1999999997, 1999999998, 1999999999}, new int[]{1, 1, 1}));
    ExampleRunner.eq(75, 2, new MonstersValley2().minimumPrice(new int[]{1900000000, 1900000001, 2000000000}, new int[]{1, 1, 2}));
    ExampleRunner.eq(76, 2, new MonstersValley2().minimumPrice(new int[]{1000000000, 2000000000, 1}, new int[]{1, 1, 2}));
    ExampleRunner.eq(77, 2, new MonstersValley2().minimumPrice(new int[]{1999999998, 1999999999, 1}, new int[]{1, 1, 2}));
    ExampleRunner.eq(78, 2, new MonstersValley2().minimumPrice(new int[]{1999999998, 1999999999, 2000000000}, new int[]{1, 1, 1}));
    ExampleRunner.eq(79, 3, new MonstersValley2().minimumPrice(new int[]{99999990, 99999991, 2000000000, 2000000000, 2000000000, 2000000000}, new int[]{1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(80, 1, new MonstersValley2().minimumPrice(new int[]{2000000000, 2000000000, 2000000000, 2000000000}, new int[]{1, 2, 1, 2}));
    ExampleRunner.eq(81, 2, new MonstersValley2().minimumPrice(new int[]{1000000000, 1500000000, 2000000000}, new int[]{1, 1, 1}));
    ExampleRunner.eq(82, 2, new MonstersValley2().minimumPrice(new int[]{294967296, 1999999999, 100, 2000000000, 2000000000}, new int[]{1, 1, 1, 1, 1}));
    ExampleRunner.eq(83, 2, new MonstersValley2().minimumPrice(new int[]{1500000000, 2000000000, 1}, new int[]{1, 1, 1}));
    ExampleRunner.eq(84, 2, new MonstersValley2().minimumPrice(new int[]{1500000000, 1700000000, 10}, new int[]{1, 1, 2}));
    ExampleRunner.eq(85, 2, new MonstersValley2().minimumPrice(new int[]{1000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(86, 2, new MonstersValley2().minimumPrice(new int[]{8, 5, 10}, new int[]{1, 1, 2}));
    ExampleRunner.eq(87, 2, new MonstersValley2().minimumPrice(new int[]{1999999999, 1999999999, 2000000000, 2000000000}, new int[]{1, 1, 1, 1}));
    ExampleRunner.eq(88, 2, new MonstersValley2().minimumPrice(new int[]{1999999999, 2000000000, 1}, new int[]{1, 1, 1}));
    ExampleRunner.eq(89, 4, new MonstersValley2().minimumPrice(new int[]{1999999996, 1999999997, 1999999998, 1999999999, 2000000000}, new int[]{2, 2, 2, 2, 2}));
    ExampleRunner.eq(90, 2, new MonstersValley2().minimumPrice(new int[]{1999999999, 2000000000, 2000000000, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, new int[]{1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(91, 4, new MonstersValley2().minimumPrice(new int[]{1919427963, 1963318973, 1906880669, 1906607128, 1952278976, 1915114853, 1907778220, 1900673962, 1921459521, 1935440793, 1950828766, 1981945119, 1946884274, 1923084047, 1900916467, 1957256737, 1951034149, 1999287908, 1925102935, 1904125040}, new int[]{2, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 2}));
    ExampleRunner.eq(92, 2, new MonstersValley2().minimumPrice(new int[]{1999999999, 1999999999, 2000000000}, new int[]{1, 2, 1}));
    ExampleRunner.eq(93, 2, new MonstersValley2().minimumPrice(new int[]{1500000000, 1600000000, 2000000000, 2000000000, 2000000000}, new int[]{1, 1, 1, 1, 1}));
    ExampleRunner.eq(94, 2, new MonstersValley2().minimumPrice(new int[]{1999999999, 2000000000, 2000000000, 2000000000}, new int[]{1, 1, 1, 1}));
    ExampleRunner.eq(95, 2, new MonstersValley2().minimumPrice(new int[]{1557383327, 1495758780, 1698059636, 1153294385, 1510891668, 767210130, 395854773, 1466735568, 1425178914, 1292334654, 1537286368, 401889856, 685507531, 1171817724, 1234482542, 1429944859, 569683690, 1627876535, 1997329960, 2000000000}, new int[]{1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2}));
    ExampleRunner.eq(96, 2, new MonstersValley2().minimumPrice(new int[]{2, 2}, new int[]{2, 2}));
    ExampleRunner.eq(97, 2, new MonstersValley2().minimumPrice(new int[]{1999999999, 2000000000, 2000000000}, new int[]{1, 1, 2}));
    ExampleRunner.eq(98, 3, new MonstersValley2().minimumPrice(new int[]{50, 10, 60, 110}, new int[]{1, 1, 2, 2}));
    ExampleRunner.eq(99, 2, new MonstersValley2().minimumPrice(new int[]{1000000000, 2000000000, 100, 200}, new int[]{1, 1, 2, 2}));
    ExampleRunner.eq(100, 3, new MonstersValley2().minimumPrice(new int[]{1000000000, 2000000000, 10}, new int[]{2, 1, 2}));
    ExampleRunner.eq(101, 2, new MonstersValley2().minimumPrice(new int[]{1500000000, 1500000000, 2000000000}, new int[]{1, 1, 2}));
    ExampleRunner.eq(102, 2, new MonstersValley2().minimumPrice(new int[]{1999999999, 2000000000, 2000000000, 2000000000}, new int[]{1, 1, 2, 1}));
    ExampleRunner.eq(103, 2, new MonstersValley2().minimumPrice(new int[]{1000000001, 1000000002, 1000000003, 1000000004}, new int[]{1, 1, 1, 1}));
    ExampleRunner.eq(104, 2, new MonstersValley2().minimumPrice(new int[]{999999999, 999999999, 1999999999, 2000000000}, new int[]{1, 2, 1, 2}));
    ExampleRunner.eq(105, 2, new MonstersValley2().minimumPrice(new int[]{500000000, 2000000000, 2000000000}, new int[]{1, 1, 2}));
    ExampleRunner.eq(106, 8, new MonstersValley2().minimumPrice(new int[]{200000000, 500000000, 1000000000, 2000000000, 2000000000, 2000000000}, new int[]{2, 2, 2, 2, 2, 2}));
    ExampleRunner.eq(107, 3, new MonstersValley2().minimumPrice(new int[]{500000000, 1000000000, 2000000000, 2000000000}, new int[]{1, 1, 1, 2}));
    ExampleRunner.eq(108, 2, new MonstersValley2().minimumPrice(new int[]{999999999, 999999999, 1999999999, 1999999999}, new int[]{1, 1, 1, 1}));
    ExampleRunner.eq(109, 3, new MonstersValley2().minimumPrice(new int[]{1999999999, 2000000000, 2000000000}, new int[]{2, 1, 1}));
    ExampleRunner.eq(110, 2, new MonstersValley2().minimumPrice(new int[]{1900000000, 1900000000, 1900000001, 1, 1, 1900000000, 1900000005, 1, 1}, new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}));
    ExampleRunner.eq(111, 1, new MonstersValley2().minimumPrice(new int[]{2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(112, 5, new MonstersValley2().minimumPrice(new int[]{888888888, 1000000000, 2000000000, 2000000000}, new int[]{1, 2, 2, 1}));
    ExampleRunner.eq(113, 4, new MonstersValley2().minimumPrice(new int[]{1, 1999999997, 1999999999, 1000000000}, new int[]{1, 1, 2, 1}));
    ExampleRunner.eq(114, 5, new MonstersValley2().minimumPrice(new int[]{1000, 50000, 156478949, 2000000000, 2000000000, 2000000000, 1000000000}, new int[]{1, 1, 2, 1, 1, 1, 1}));
    ExampleRunner.eq(115, 4, new MonstersValley2().minimumPrice(new int[]{1999999999, 2000000000, 2000000000}, new int[]{2, 2, 2}));
    ExampleRunner.eq(116, 2, new MonstersValley2().minimumPrice(new int[]{1900000000, 2000000000, 2000000000}, new int[]{1, 1, 1}));
    ExampleRunner.eq(117, 2, new MonstersValley2().minimumPrice(new int[]{1999999999, 1999999999, 1999999999, 1999999999, 2000000000}, new int[]{1, 1, 1, 2, 2}));
    ExampleRunner.eq(118, 3, new MonstersValley2().minimumPrice(new int[]{1999999995, 1999999996, 1999999997, 1999999998, 1999999999}, new int[]{1, 2, 1, 2, 1}));
    ExampleRunner.eq(119, 2, new MonstersValley2().minimumPrice(new int[]{1900000000, 1900000000, 2000000000}, new int[]{1, 1, 2}));
    ExampleRunner.eq(120, 3, new MonstersValley2().minimumPrice(new int[]{1999999999, 2000000000, 999999999, 333333333, 222222222}, new int[]{1, 2, 1, 2, 1}));
    ExampleRunner.eq(121, 2, new MonstersValley2().minimumPrice(new int[]{10, 1, 11}, new int[]{1, 1, 2}));
    ExampleRunner.eq(122, 1, new MonstersValley2().minimumPrice(new int[]{1, 1}, new int[]{1, 2}));
    ExampleRunner.eq(123, 3, new MonstersValley2().minimumPrice(new int[]{50, 50, 50, 60, 150}, new int[]{1, 1, 1, 2, 2}));
    ExampleRunner.eq(124, 3, new MonstersValley2().minimumPrice(new int[]{1202024340, 1044415051, 1528948584, 249531286, 1984244858, 929774143, 1623005829, 521683809, 1911530809, 742947743, 1252792943, 1761317813, 1553892843, 728381134, 1244931238, 626144345, 938136115, 428748531, 1168924832, 939248668}, new int[]{2, 2, 1, 1, 1, 1, 1, 2, 1, 2, 2, 1, 2, 2, 1, 1, 1, 2, 2, 2}));
    ExampleRunner.eq(125, 2, new MonstersValley2().minimumPrice(new int[]{100, 99, 99, 150}, new int[]{1, 2, 1, 2}));
    ExampleRunner.eq(126, 2, new MonstersValley2().minimumPrice(new int[]{2000000000, 2000000000, 2000000000, 2000000000}, new int[]{2, 2, 2, 2}));
    ExampleRunner.eq(127, 2, new MonstersValley2().minimumPrice(new int[]{2000000000, 2000000000, 2000000000, 2000000000, 999999999, 999999999, 1999999999, 2000000000}, new int[]{2, 2, 2, 2, 2, 2, 2, 2}));
    ExampleRunner.eq(128, 3, new MonstersValley2().minimumPrice(new int[]{5, 5, 4, 9}, new int[]{2, 1, 2, 2}));
    ExampleRunner.eq(129, 2, new MonstersValley2().minimumPrice(new int[]{1000000000, 2000000000, 2000000000, 1}, new int[]{1, 1, 1, 1}));
    ExampleRunner.eq(130, 2, new MonstersValley2().minimumPrice(new int[]{1999999970, 1999999971, 1999999972, 1999999973, 1999999974, 1999999975, 1999999976, 1999999977, 1999999978, 1999999979, 1999999980, 1999999981, 1999999982, 1999999983, 1999999984, 1999999985, 1999999986, 1999999987, 1999999988, 1999999989}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(131, 3, new MonstersValley2().minimumPrice(new int[]{4, 2, 1, 6, 15}, new int[]{1, 1, 1, 2, 1}));
    ExampleRunner.eq(132, 3, new MonstersValley2().minimumPrice(new int[]{10, 10, 20}, new int[]{2, 2, 1}));
    ExampleRunner.eq(133, 3, new MonstersValley2().minimumPrice(new int[]{2, 3, 5}, new int[]{2, 1, 1}));
    ExampleRunner.eq(134, 1, new MonstersValley2().minimumPrice(new int[]{8, 5, 2}, new int[]{1, 1, 1}));
    ExampleRunner.eq(135, 2, new MonstersValley2().minimumPrice(new int[]{1, 1, 1, 2}, new int[]{1, 2, 1, 2}));
    ExampleRunner.eq(136, 2, new MonstersValley2().minimumPrice(new int[]{2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000, 2000000000}, new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
    ExampleRunner.eq(137, 2, new MonstersValley2().minimumPrice(new int[]{99, 99}, new int[]{2, 2}));
    ExampleRunner.eq(138, 3, new MonstersValley2().minimumPrice(new int[]{1, 1, 2, 3}, new int[]{1, 1, 2, 2}));
    ExampleRunner.eq(139, 1, new MonstersValley2().minimumPrice(new int[]{2000000000, 2000000000, 2000000000}, new int[]{1, 1, 1}));
    ExampleRunner.eq(140, 2, new MonstersValley2().minimumPrice(new int[]{10, 9, 1, 1, 1, 18}, new int[]{1, 1, 2, 2, 2, 2}));
    ExampleRunner.eq(141, 3, new MonstersValley2().minimumPrice(new int[]{888888888, 999999999, 1000000000, 1999999999}, new int[]{1, 1, 1, 2}));
    ExampleRunner.eq(142, 3, new MonstersValley2().minimumPrice(new int[]{1999999998, 1999999999, 1999999999}, new int[]{1, 2, 1}));
  }
}
