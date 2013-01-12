package p500.srm529;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 1/15/12
 * Time: 7:32 PM
 */
public class PairingPawns {
  public int savedPawnCount(int[] start) {
    for (int i = start.length - 1; i > 0; i--) {
      if (start[i] >= 2) {
        start[i - 1] += start[i] / 2;
      }
    }
    return start[0];
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 1, new PairingPawns().savedPawnCount(new int[]{0, 2}));
    ExampleRunner.eq(2, 11, new PairingPawns().savedPawnCount(new int[]{10, 3}));
    ExampleRunner.eq(3, 1, new PairingPawns().savedPawnCount(new int[]{0, 0, 0, 8}));
    ExampleRunner.eq(4, 1, new PairingPawns().savedPawnCount(new int[]{0, 1, 1, 2}));
    ExampleRunner.eq(5, 0, new PairingPawns().savedPawnCount(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 123456}));
    ExampleRunner.eq(6, 1, new PairingPawns().savedPawnCount(new int[]{0, 0, 0, 7, 0, 0, 7, 0, 0, 7, 0, 0, 7, 0, 0, 7, 0, 0, 8}));
    ExampleRunner.eq(7, 0, new PairingPawns().savedPawnCount(new int[]{0, 0, 0, 7, 0, 0, 7, 0, 0, 7, 0, 0, 7, 0, 0, 7, 0, 0, 7}));
    ExampleRunner.eq(8, 0, new PairingPawns().savedPawnCount(new int[]{0}));
    ExampleRunner.eq(9, 47, new PairingPawns().savedPawnCount(new int[]{47}));
    ExampleRunner.eq(10, 1999998, new PairingPawns().savedPawnCount(new int[]{1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000}));
    ExampleRunner.eq(11, 0, new PairingPawns().savedPawnCount(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    ExampleRunner.eq(12, 1, new PairingPawns().savedPawnCount(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(13, 1, new PairingPawns().savedPawnCount(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1000000}));
    ExampleRunner.eq(14, 1, new PairingPawns().savedPawnCount(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 524288}));
    ExampleRunner.eq(15, 0, new PairingPawns().savedPawnCount(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 524287}));
    ExampleRunner.eq(16, 3, new PairingPawns().savedPawnCount(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1000000}));
    ExampleRunner.eq(17, 514777, new PairingPawns().savedPawnCount(new int[]{296172, 23166, 484266, 687650}));
    ExampleRunner.eq(18, 712834, new PairingPawns().savedPawnCount(new int[]{326498, 573090, 43163, 237303, 308856, 936954, 287349, 333671, 380443, 816305, 136232, 641843, 537022}));
    ExampleRunner.eq(19, 1696885, new PairingPawns().savedPawnCount(new int[]{935806, 930822, 726198, 91596, 874671, 926003, 584880, 583333, 951900, 125157, 843631, 706680, 969893}));
    ExampleRunner.eq(20, 1337076, new PairingPawns().savedPawnCount(new int[]{628467, 764087, 996960, 189181, 290032, 661246, 371913, 786053, 69227, 748484, 934722, 481379, 226438}));
    ExampleRunner.eq(21, 922604, new PairingPawns().savedPawnCount(new int[]{408610, 692840, 133581, 606047, 377552, 418390, 970948, 386835, 434282, 499504, 772163, 21519, 499425}));
    ExampleRunner.eq(22, 445588, new PairingPawns().savedPawnCount(new int[]{104312, 205556, 385889, 515195, 524230, 805166, 698782, 462888, 867430, 910398}));
    ExampleRunner.eq(23, 1189446, new PairingPawns().savedPawnCount(new int[]{834584, 374313, 670825}));
    ExampleRunner.eq(24, 603051, new PairingPawns().savedPawnCount(new int[]{90628, 745761, 174598, 344859, 199502, 691156, 750761, 643245, 374202, 20591, 178485, 274317, 625374}));
    ExampleRunner.eq(25, 1264494, new PairingPawns().savedPawnCount(new int[]{595437, 681024, 987140, 560231, 71792, 231829}));
    ExampleRunner.eq(26, 1271241, new PairingPawns().savedPawnCount(new int[]{619305, 859420, 298876, 481878, 962945, 304731, 366576, 963210, 619741, 615607, 410461, 592172}));
    ExampleRunner.eq(27, 1035277, new PairingPawns().savedPawnCount(new int[]{370011, 663212, 762762, 458496, 914591, 269474, 482930, 972100, 798919, 20788, 982460, 802120, 978784, 896382, 550700, 844141, 771965, 178721, 287008}));
    ExampleRunner.eq(28, 800526, new PairingPawns().savedPawnCount(new int[]{23487, 827261, 753020, 725053, 884126, 526825, 227472, 568060, 720019, 555970, 405658, 943208, 222104}));
    ExampleRunner.eq(29, 882729, new PairingPawns().savedPawnCount(new int[]{420184, 260533, 909871, 307463, 561129, 210216, 916947, 936018, 576308, 433888}));
    ExampleRunner.eq(30, 970463, new PairingPawns().savedPawnCount(new int[]{472170, 503962, 680078, 46334, 586035, 384550, 894619, 358283, 931703, 379962, 537917, 352437}));
    ExampleRunner.eq(31, 750764, new PairingPawns().savedPawnCount(new int[]{414916, 216937, 350163, 990649, 124295, 12533, 502296}));
    ExampleRunner.eq(32, 705043, new PairingPawns().savedPawnCount(new int[]{143544, 742937, 588822, 51132, 18569, 678930, 551704, 539019, 87963, 81057, 344078, 76651, 892682, 655345, 453020, 816349}));
    ExampleRunner.eq(33, 1200104, new PairingPawns().savedPawnCount(new int[]{665901, 483893, 823767, 244403, 13778, 997276, 926260, 581622, 554753, 781922, 570864, 707929, 66155, 681048, 28483, 513813, 115033, 386375, 769387}));
    ExampleRunner.eq(34, 595931, new PairingPawns().savedPawnCount(new int[]{25703, 525269, 581823, 719566, 496756, 529524, 901339, 711643, 769279, 581100, 285451, 882139, 180353, 229155, 116604, 627613, 377505, 171870}));
    ExampleRunner.eq(35, 1098706, new PairingPawns().savedPawnCount(new int[]{669675, 560739, 91551, 446108, 669164, 399005, 607221, 213327, 927559, 173339, 327036, 288732, 332767, 280493, 381870, 104675}));
    ExampleRunner.eq(36, 1067665, new PairingPawns().savedPawnCount(new int[]{479733, 731593, 346458, 550679, 404094, 881478, 480409, 442523, 477508, 199819, 284563, 391653, 802012}));
    ExampleRunner.eq(37, 435803, new PairingPawns().savedPawnCount(new int[]{129695, 344160, 175962, 256509, 297311, 792405, 468074, 848459, 176097}));
    ExampleRunner.eq(38, 1035704, new PairingPawns().savedPawnCount(new int[]{639871, 278691, 310078, 786778, 777235, 416673, 581410, 832767, 402632, 952157}));
    ExampleRunner.eq(39, 1018379, new PairingPawns().savedPawnCount(new int[]{377631, 783115, 555323, 679812, 124445, 339174, 192583, 153299, 716775}));
    ExampleRunner.eq(40, 1419139, new PairingPawns().savedPawnCount(new int[]{846358, 465074, 919870, 265206, 710677, 736564, 181904, 293138, 847844, 413971, 821, 669847, 304173, 3882, 136508, 579580, 365473, 586875}));
    ExampleRunner.eq(41, 958163, new PairingPawns().savedPawnCount(new int[]{514815, 77494, 971997, 800270, 779312, 199340, 38552, 338413, 242151, 581449, 961285, 264528, 922495, 91620}));
    ExampleRunner.eq(42, 1099620, new PairingPawns().savedPawnCount(new int[]{539824, 706411, 532646, 217935, 244537, 414565, 774413, 574258, 348731}));
    ExampleRunner.eq(43, 1275159, new PairingPawns().savedPawnCount(new int[]{838210, 509291, 227539, 416539, 802745, 252432, 274816, 946024, 456107, 55436, 942099, 827606, 999663, 813063, 816048}));
    ExampleRunner.eq(44, 1401579, new PairingPawns().savedPawnCount(new int[]{803045, 626042, 801560, 491300, 6743, 367226, 184079, 747639, 232039, 789334, 321098, 302152, 543591, 41240, 535224, 304246, 223321, 421076, 129852, 128707}));
    ExampleRunner.eq(45, 1233213, new PairingPawns().savedPawnCount(new int[]{776229, 271206, 852186, 487211, 369999, 209936, 518235, 773140, 538277, 226707, 759121, 207552, 330575, 838177, 304929, 650151, 79921}));
    ExampleRunner.eq(46, 1232210, new PairingPawns().savedPawnCount(new int[]{725827, 870860, 283813}));
    ExampleRunner.eq(47, 268497, new PairingPawns().savedPawnCount(new int[]{171281, 194433}));
    ExampleRunner.eq(48, 1445462, new PairingPawns().savedPawnCount(new int[]{844814, 545853, 937420, 185729, 396950, 986527, 529001, 120770, 793719, 870887, 514368}));
    ExampleRunner.eq(49, 622885, new PairingPawns().savedPawnCount(new int[]{111390, 593097, 152175, 781919, 886101, 249006, 455193, 597895, 731502, 390868, 54193, 620412, 642823, 386547, 133072, 715807, 91317, 451484, 461303}));
    ExampleRunner.eq(50, 606401, new PairingPawns().savedPawnCount(new int[]{16486, 885946, 587769}));
    ExampleRunner.eq(51, 1081471, new PairingPawns().savedPawnCount(new int[]{864829, 99999, 666570}));
    ExampleRunner.eq(52, 1438017, new PairingPawns().savedPawnCount(new int[]{783978, 868842, 504466, 390541, 29485, 917708, 599039, 86954, 703341, 72310, 628731, 711403, 673179, 693511, 262066, 285459}));
    ExampleRunner.eq(53, 972278, new PairingPawns().savedPawnCount(new int[]{509556, 210186, 817277, 768305, 812004, 208690}));
    ExampleRunner.eq(54, 1225096, new PairingPawns().savedPawnCount(new int[]{441067, 908974, 684086, 692685, 780154, 548427, 147564, 371123, 213025}));
    ExampleRunner.eq(55, 548509, new PairingPawns().savedPawnCount(new int[]{47135, 797542, 30905, 540146, 100368, 310079, 150378, 684789, 643288, 162806, 458893, 191799, 969485, 110973, 496563, 984099, 647640, 234895, 449146}));
    ExampleRunner.eq(56, 706208, new PairingPawns().savedPawnCount(new int[]{298485, 504433, 622026}));
    ExampleRunner.eq(57, 989466, new PairingPawns().savedPawnCount(new int[]{630763, 357931, 359398, 360280, 717663}));
    ExampleRunner.eq(58, 353912, new PairingPawns().savedPawnCount(new int[]{293367, 60639, 60116, 60689, 61348, 60296, 60583, 60296, 60530, 121732}));
    ExampleRunner.eq(59, 809708, new PairingPawns().savedPawnCount(new int[]{589110, 221135, 220185, 220443, 219518, 218538, 220338, 440048}));
    ExampleRunner.eq(60, 635715, new PairingPawns().savedPawnCount(new int[]{595544, 40478, 39855, 40020, 39560, 40156, 39302, 40343, 39549, 40060, 39546, 39513, 39969, 39687, 39561, 79962}));
    ExampleRunner.eq(61, 757254, new PairingPawns().savedPawnCount(new int[]{660788, 96621, 96733, 95541, 95712, 97110, 96699, 95592, 97548, 95442, 96068, 95815, 193108}));
    ExampleRunner.eq(62, 806966, new PairingPawns().savedPawnCount(new int[]{742366, 64522, 65092, 63906, 64071, 66162, 64154, 64271, 64244, 64264, 64354, 64144, 129396}));
    ExampleRunner.eq(63, 665836, new PairingPawns().savedPawnCount(new int[]{643107, 22729, 22706, 22638, 23083, 22442, 22828, 22803, 23365, 22318, 22939, 22447, 22817, 23406, 22292, 23127, 45794}));
    ExampleRunner.eq(64, 722757, new PairingPawns().savedPawnCount(new int[]{625313, 97013, 97622, 98339, 97995, 97924, 97635, 98260, 97695, 195058}));
    ExampleRunner.eq(65, 590933, new PairingPawns().savedPawnCount(new int[]{456451, 133971, 135547, 133939, 134792, 135502, 134590, 135549, 267902}));
    ExampleRunner.eq(66, 674175, new PairingPawns().savedPawnCount(new int[]{501761, 171672, 172733, 174315, 172861, 172146, 347016}));
    ExampleRunner.eq(67, 611904, new PairingPawns().savedPawnCount(new int[]{486479, 125863, 125148, 124352, 125547, 126000, 123202, 250146}));
    ExampleRunner.eq(68, 247556, new PairingPawns().savedPawnCount(new int[]{132644, 115472, 113462, 116034, 228904}));
    ExampleRunner.eq(69, 245449, new PairingPawns().savedPawnCount(new int[]{106540, 277819}));
    ExampleRunner.eq(70, 875949, new PairingPawns().savedPawnCount(new int[]{641023, 234613, 235639, 234274, 235315, 235923, 234933, 470510}));
    ExampleRunner.eq(71, 426268, new PairingPawns().savedPawnCount(new int[]{270491, 156475, 310160}));
    ExampleRunner.eq(72, 442578, new PairingPawns().savedPawnCount(new int[]{309181, 132916, 267757}));
    ExampleRunner.eq(73, 66786, new PairingPawns().savedPawnCount(new int[]{63894, 2806, 2896, 3263, 2842, 2850, 2874, 2944, 3004, 3055, 3061, 2876, 2931, 2919, 2967, 3031, 2845, 3021, 5930}));
    ExampleRunner.eq(74, 321280, new PairingPawns().savedPawnCount(new int[]{287718, 34002, 32959, 33426, 33144, 33100, 33186, 33209, 33162, 33311, 32939, 33198, 33140, 33009, 66382}));
    ExampleRunner.eq(75, 832540, new PairingPawns().savedPawnCount(new int[]{382391, 450678, 450366, 897750}));
    ExampleRunner.eq(76, 441987, new PairingPawns().savedPawnCount(new int[]{403096, 39170, 38626, 38240, 39625, 37828, 38966, 38782, 38402, 38361, 38307, 38521, 38572, 38281, 77718}));
    ExampleRunner.eq(77, 252486, new PairingPawns().savedPawnCount(new int[]{229978, 22876, 21694, 22706, 22168, 23018, 22520, 45001}));
    ExampleRunner.eq(78, 636661, new PairingPawns().savedPawnCount(new int[]{599167, 37834, 36853, 37349, 37749, 37780, 36458, 37612, 37408, 37390, 37117, 37389, 36563, 37410, 37067, 37400, 36981, 74782}));
    ExampleRunner.eq(79, 666414, new PairingPawns().savedPawnCount(new int[]{616881, 49093, 49837, 50352, 50003, 49224, 50651, 49732, 49963, 50295, 49814, 50237, 49626, 49699, 99882}));
    ExampleRunner.eq(80, 565143, new PairingPawns().savedPawnCount(new int[]{262318, 605651}));
    ExampleRunner.eq(81, 963000, new PairingPawns().savedPawnCount(new int[]{844456, 119182, 118188, 118044, 117017, 117107, 235358}));
    ExampleRunner.eq(82, 911029, new PairingPawns().savedPawnCount(new int[]{788187, 122603, 123364, 122395, 123463, 122657, 123481, 123080, 121917, 124048, 123433, 124041, 122580, 246990}));
    ExampleRunner.eq(83, 964415, new PairingPawns().savedPawnCount(new int[]{646118, 317398, 319261, 319634, 318605, 637304}));
    ExampleRunner.eq(84, 923084, new PairingPawns().savedPawnCount(new int[]{807428, 115142, 117032, 114721, 116532, 114501, 116178, 116546, 114439, 116121, 115611, 115756, 115490, 115199, 232074}));
    ExampleRunner.eq(85, 829549, new PairingPawns().savedPawnCount(new int[]{734477, 95016, 95689, 94142, 94789, 94818, 191144}));
    ExampleRunner.eq(86, 676075, new PairingPawns().savedPawnCount(new int[]{562247, 114189, 113560, 112649, 114277, 114491, 113899, 111770, 113385, 228582}));
    ExampleRunner.eq(87, 706134, new PairingPawns().savedPawnCount(new int[]{526893, 179756, 178057, 179368, 179269, 359150}));
    ExampleRunner.eq(88, 887543, new PairingPawns().savedPawnCount(new int[]{645573, 242294, 240675, 243116, 242589, 483294}));
    ExampleRunner.eq(89, 802659, new PairingPawns().savedPawnCount(new int[]{467694, 334537, 337157, 332816, 668896}));
    ExampleRunner.eq(90, 115305, new PairingPawns().savedPawnCount(new int[]{109688, 5736, 5369, 5702, 5333, 5972, 5538, 5743, 5359, 5627, 5423, 5506, 5688, 5729, 5388, 5518, 5586, 11220}));
    ExampleRunner.eq(91, 446967, new PairingPawns().savedPawnCount(new int[]{362174, 85593, 83540, 84308, 84278, 84574, 85784, 84682, 169148}));
    ExampleRunner.eq(92, 25962, new PairingPawns().savedPawnCount(new int[]{13362, 12283, 12891, 13096, 25582}));
    ExampleRunner.eq(93, 432604, new PairingPawns().savedPawnCount(new int[]{322388, 110268, 109760, 110708, 110177, 111237, 109559, 221366}));
    ExampleRunner.eq(94, 73886, new PairingPawns().savedPawnCount(new int[]{48348, 25665, 25058, 51535}));
    ExampleRunner.eq(95, 258456, new PairingPawns().savedPawnCount(new int[]{221969, 36085, 36869, 37218, 36723, 36283, 36430, 36928, 36861, 37185, 36962, 72785}));
    ExampleRunner.eq(96, 6674, new PairingPawns().savedPawnCount(new int[]{5676, 1011, 960, 962, 1138, 935, 1051, 1015, 885, 1151, 903, 958, 1106, 1916}));
    ExampleRunner.eq(97, 739683, new PairingPawns().savedPawnCount(new int[]{632880, 106605, 106958, 106698, 107961, 106866, 106745, 107165, 105430, 108400, 213966}));
    ExampleRunner.eq(98, 330080, new PairingPawns().savedPawnCount(new int[]{295504, 34564, 35139, 33814, 34033, 34380, 34655, 34556, 34460, 34479, 34489, 34929, 34661, 34607, 34560, 35296, 68760}));
    ExampleRunner.eq(99, 793787, new PairingPawns().savedPawnCount(new int[]{753955, 40118, 39273, 39795, 39665, 40132, 39822, 40428, 39275, 39606, 40391, 40139, 39463, 39386, 39858, 39895, 40569, 38296, 79764}));
    ExampleRunner.eq(100, 242744, new PairingPawns().savedPawnCount(new int[]{221909, 20492, 21750, 20324, 20781, 21270, 20520, 20989, 20788, 20865, 21107, 20924, 20631, 20831, 20817, 20693, 20769, 20647, 20658, 41544}));
    ExampleRunner.eq(101, 112896, new PairingPawns().savedPawnCount(new int[]{108876, 3888, 4050, 4445, 3986, 4211, 4061, 4055, 4116, 4074, 4069, 4139, 4098, 4103, 3911, 4272, 3983, 4035, 8304}));
    ExampleRunner.eq(102, 448844, new PairingPawns().savedPawnCount(new int[]{430234, 18752, 18351, 18448, 18654, 19080, 18444, 18390, 19025, 18450, 18298, 18220, 18811, 18883, 18832, 17710, 18488, 18309, 36487}));
    ExampleRunner.eq(103, 532123, new PairingPawns().savedPawnCount(new int[]{72418, 919411}));
    ExampleRunner.eq(104, 171763, new PairingPawns().savedPawnCount(new int[]{164202, 7538, 7395, 7990, 7515, 7795, 7435, 7240, 7728, 7360, 7582, 7870, 7234, 15634}));
    ExampleRunner.eq(105, 808683, new PairingPawns().savedPawnCount(new int[]{677913, 131801, 129722, 129161, 129954, 130959, 130634, 130476, 261063}));
    ExampleRunner.eq(106, 711836, new PairingPawns().savedPawnCount(new int[]{578114, 133960, 133679, 133308, 132755, 267570}));
    ExampleRunner.eq(107, 779813, new PairingPawns().savedPawnCount(new int[]{678514, 101497, 101912, 99862, 101007, 100437, 99865, 101139, 100698, 100143, 102749, 100528, 100698, 100702, 202672}));
    ExampleRunner.eq(108, 851016, new PairingPawns().savedPawnCount(new int[]{351016, 1000000}));
    ExampleRunner.eq(109, 56732, new PairingPawns().savedPawnCount(new int[]{54182, 2586, 2567, 2411, 2465, 2633, 2488, 2431, 2540, 2558, 2452, 2324, 2426, 5116}));
    ExampleRunner.eq(110, 966318, new PairingPawns().savedPawnCount(new int[]{899687, 66754, 66493, 66411, 66987, 65762, 66490, 67793, 66094, 66822, 66779, 67020, 66534, 65763, 67600, 66583, 66170, 66618, 133452}));
    ExampleRunner.eq(111, 63526, new PairingPawns().savedPawnCount(new int[]{51117, 12379, 12470, 12632, 12012, 12434, 12467, 24178}));
    ExampleRunner.eq(112, 404275, new PairingPawns().savedPawnCount(new int[]{316755, 87459, 88438, 86393, 86466, 88042, 86947, 175098}));
    ExampleRunner.eq(113, 944641, new PairingPawns().savedPawnCount(new int[]{884302, 60715, 59575, 60135, 60240, 61322, 60478, 60358, 121100}));
    ExampleRunner.eq(114, 807722, new PairingPawns().savedPawnCount(new int[]{746433, 61232, 61874, 60872, 60071, 61941, 60744, 61716, 60131, 60882, 62105, 61063, 60876, 61226, 62345, 61066, 60477, 61485, 60930, 122404}));
    ExampleRunner.eq(115, 49853, new PairingPawns().savedPawnCount(new int[]{35216, 14560, 14684, 14826, 14479, 15051, 29280}));
    ExampleRunner.eq(116, 20863, new PairingPawns().savedPawnCount(new int[]{19753, 1128, 1060, 1174, 1040, 1147, 1076, 1100, 929, 1192, 1043, 1043, 1042, 1085, 1029, 1036, 1167, 1050, 2116}));
    ExampleRunner.eq(117, 3921, new PairingPawns().savedPawnCount(new int[]{1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000}));
    ExampleRunner.eq(118, 3, new PairingPawns().savedPawnCount(new int[]{0, 1, 1, 2, 32, 11, 21, 1, 0, 99, 87}));
    ExampleRunner.eq(119, 3921, new PairingPawns().savedPawnCount(new int[]{1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000}));
    ExampleRunner.eq(120, 1, new PairingPawns().savedPawnCount(new int[]{0, 2}));
    ExampleRunner.eq(121, 1, new PairingPawns().savedPawnCount(new int[]{0, 0, 4}));
    ExampleRunner.eq(122, 100, new PairingPawns().savedPawnCount(new int[]{100}));
    ExampleRunner.eq(123, 1999938, new PairingPawns().savedPawnCount(new int[]{1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000, 1000000}));
    ExampleRunner.eq(124, 1, new PairingPawns().savedPawnCount(new int[]{0, 0, 0, 8}));
    ExampleRunner.eq(125, 1, new PairingPawns().savedPawnCount(new int[]{0, 2, 0, 0}));
    ExampleRunner.eq(126, 1, new PairingPawns().savedPawnCount(new int[]{1}));
    ExampleRunner.eq(127, 2, new PairingPawns().savedPawnCount(new int[]{1, 1, 2}));
    ExampleRunner.eq(128, 39, new PairingPawns().savedPawnCount(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190}));
  }
}
