package p500.srm533;

import java.util.Arrays;

import utils.ExampleRunner;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/24/12
 * Time: 4:12 PM
 */
public class PikachuEasy {
  public String check(String word) {
    for (String syllable : Arrays.asList("pi", "ka", "chu")) {
      word = word.replace(syllable, " ");
    }
    return word.trim().length() == 0 ? "YES" : "NO";
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, "YES", new PikachuEasy().check("pikapi"));
    ExampleRunner.eq(2, "YES", new PikachuEasy().check("pipikachu"));
    ExampleRunner.eq(3, "NO", new PikachuEasy().check("pikaqiu"));
    ExampleRunner.eq(4, "NO", new PikachuEasy().check("topcoder"));
    ExampleRunner.eq(5, "NO", new PikachuEasy().check("piika"));
    ExampleRunner.eq(6, "YES", new PikachuEasy().check("chupikachupipichu"));
    ExampleRunner.eq(7, "NO", new PikachuEasy().check("pikapipachu"));
    ExampleRunner.eq(8, "YES", new PikachuEasy().check("chupipikachukakapipi"));
    ExampleRunner.eq(9, "NO", new PikachuEasy().check("pichuchukapipjchuka"));
    ExampleRunner.eq(10, "YES", new PikachuEasy().check("pipikakachupipipichuchukapi"));
    ExampleRunner.eq(11, "NO", new PikachuEasy().check("kapichuchupikapipichupichukachucou"));
    ExampleRunner.eq(12, "YES", new PikachuEasy().check("chuchupichukakakakachuchukakapipichuchupichuchupi"));
    ExampleRunner.eq(13, "NO", new PikachuEasy().check("pichuchupijhuka"));
    ExampleRunner.eq(14, "NO", new PikachuEasy().check("chukachupichukachuchuchuoakachukachu"));
    ExampleRunner.eq(15, "NO", new PikachuEasy().check("pirhupichuchuchuchupichuchukaka"));
    ExampleRunner.eq(16, "NO", new PikachuEasy().check("kapichuchukachukaphupipipikapichuka"));
    ExampleRunner.eq(17, "YES", new PikachuEasy().check("kachuchuchupi"));
    ExampleRunner.eq(18, "NO", new PikachuEasy().check("kakakapkpipichupichukapipikachupi"));
    ExampleRunner.eq(19, "YES", new PikachuEasy().check("pikachuchukachupichuka"));
    ExampleRunner.eq(20, "YES", new PikachuEasy().check("chupichuchupikakapi"));
    ExampleRunner.eq(21, "YES", new PikachuEasy().check("pichuchu"));
    ExampleRunner.eq(22, "YES", new PikachuEasy().check("chuchu"));
    ExampleRunner.eq(23, "YES", new PikachuEasy().check("kapichukapikaka"));
    ExampleRunner.eq(24, "NO", new PikachuEasy().check("chupikakapcchu"));
    ExampleRunner.eq(25, "YES", new PikachuEasy().check("chuchukapikachukaka"));
    ExampleRunner.eq(26, "YES", new PikachuEasy().check("chuchukapipichuka"));
    ExampleRunner.eq(27, "YES", new PikachuEasy().check("kachukapipikakapikachuchupichuka"));
    ExampleRunner.eq(28, "NO", new PikachuEasy().check("kapichuchukakapskachu"));
    ExampleRunner.eq(29, "NO", new PikachuEasy().check("kachupikapikachuchukakakapipikachupqpi"));
    ExampleRunner.eq(30, "YES", new PikachuEasy().check("kakakapichupichuchuchupikakakachu"));
    ExampleRunner.eq(31, "NO", new PikachuEasy().check("lachupichukachukakapipikapipichu"));
    ExampleRunner.eq(32, "NO", new PikachuEasy().check("pichukd"));
    ExampleRunner.eq(33, "NO", new PikachuEasy().check("kapipikypika"));
    ExampleRunner.eq(34, "NO", new PikachuEasy().check("jhupika"));
    ExampleRunner.eq(35, "NO", new PikachuEasy().check("chukachukapichukapicquka"));
    ExampleRunner.eq(36, "NO", new PikachuEasy().check("cfu"));
    ExampleRunner.eq(37, "NO", new PikachuEasy().check("pichukachupichukazichukakapichupikapichu"));
    ExampleRunner.eq(38, "NO", new PikachuEasy().check("kachuchukakakakapikapichuchuchdpipikapipipichuka"));
    ExampleRunner.eq(39, "NO", new PikachuEasy().check("chuchuchujhukachupichukachu"));
    ExampleRunner.eq(40, "NO", new PikachuEasy().check("kaui"));
    ExampleRunner.eq(41, "NO", new PikachuEasy().check("pipuka"));
    ExampleRunner.eq(42, "YES", new PikachuEasy().check("chupikakapikachuchukachuka"));
    ExampleRunner.eq(43, "NO", new PikachuEasy().check("kakapichuchuchupiphuchu"));
    ExampleRunner.eq(44, "YES", new PikachuEasy().check("kachukachupipikachuchu"));
    ExampleRunner.eq(45, "NO", new PikachuEasy().check("pipina"));
    ExampleRunner.eq(46, "YES", new PikachuEasy().check("pipipikakapipipichupikakakakachuchupikapipi"));
    ExampleRunner.eq(47, "YES", new PikachuEasy().check("chupipichupichu"));
    ExampleRunner.eq(48, "NO", new PikachuEasy().check("chucouchukakapikakapikachukakapipichukakakakaka"));
    ExampleRunner.eq(49, "YES", new PikachuEasy().check("chuchupikakakapipichuchukakakapichupi"));
    ExampleRunner.eq(50, "NO", new PikachuEasy().check("cduchupikachu"));
    ExampleRunner.eq(51, "YES", new PikachuEasy().check("kakakachupichupikachupika"));
    ExampleRunner.eq(52, "YES", new PikachuEasy().check("pipikachukachukakakakapi"));
    ExampleRunner.eq(53, "YES", new PikachuEasy().check("chuchupichukachupichu"));
    ExampleRunner.eq(54, "NO", new PikachuEasy().check("chupichuchukachuchukachupkpipichukachu"));
    ExampleRunner.eq(55, "YES", new PikachuEasy().check("kachupikakakapikapikakapichuchukachuchuka"));
    ExampleRunner.eq(56, "NO", new PikachuEasy().check("chuchuchuchupichuchupichuchucauchuchu"));
    ExampleRunner.eq(57, "YES", new PikachuEasy().check("chukakakapipipi"));
    ExampleRunner.eq(58, "YES", new PikachuEasy().check("kakachukachupichupikakapichukapichuka"));
    ExampleRunner.eq(59, "YES", new PikachuEasy().check("kakapichukachuchupipika"));
    ExampleRunner.eq(60, "NO", new PikachuEasy().check("pikakacmu"));
    ExampleRunner.eq(61, "NO", new PikachuEasy().check("pikapichupichupichupiiikachuchupichu"));
    ExampleRunner.eq(62, "YES", new PikachuEasy().check("pikakachupikachupichukachuka"));
    ExampleRunner.eq(63, "NO", new PikachuEasy().check("kachupikakapiohuchuchuchukapi"));
    ExampleRunner.eq(64, "YES", new PikachuEasy().check("kachupichukapipika"));
    ExampleRunner.eq(65, "YES", new PikachuEasy().check("kachukakakachupipikapichuka"));
    ExampleRunner.eq(66, "NO", new PikachuEasy().check("chukapichukakachupipipipikaciupikapipikachu"));
    ExampleRunner.eq(67, "YES", new PikachuEasy().check("chuchupichuchu"));
    ExampleRunner.eq(68, "YES", new PikachuEasy().check("chukakaka"));
    ExampleRunner.eq(69, "YES", new PikachuEasy().check("kapichupi"));
    ExampleRunner.eq(70, "NO", new PikachuEasy().check("chvkapipipikapichu"));
    ExampleRunner.eq(71, "NO", new PikachuEasy().check("ba"));
    ExampleRunner.eq(72, "YES", new PikachuEasy().check("kapika"));
    ExampleRunner.eq(73, "YES", new PikachuEasy().check("chuchuchuchupichukachuchupi"));
    ExampleRunner.eq(74, "NO", new PikachuEasy().check("kapipikakakakzchu"));
    ExampleRunner.eq(75, "YES", new PikachuEasy().check("pichupikapikakachupichupika"));
    ExampleRunner.eq(76, "NO", new PikachuEasy().check("chukacfuchupichuchuchu"));
    ExampleRunner.eq(77, "YES", new PikachuEasy().check("pikakapipipichupichukachuchuchukakachupipichuka"));
    ExampleRunner.eq(78, "NO", new PikachuEasy().check("cyupika"));
    ExampleRunner.eq(79, "NO", new PikachuEasy().check("chukapikakapichkpichukachuchukachukapi"));
    ExampleRunner.eq(80, "NO", new PikachuEasy().check("pichuehuchupipichukachukachupi"));
    ExampleRunner.eq(81, "YES", new PikachuEasy().check("pikakakapi"));
    ExampleRunner.eq(82, "YES", new PikachuEasy().check("kachukapipichukakapikachukapikakaka"));
    ExampleRunner.eq(83, "YES", new PikachuEasy().check("chukachukakapikakachuka"));
    ExampleRunner.eq(84, "YES", new PikachuEasy().check("pichuchuchukapikapikachuchuchuchukapika"));
    ExampleRunner.eq(85, "NO", new PikachuEasy().check("pipithupichupi"));
    ExampleRunner.eq(86, "NO", new PikachuEasy().check("chukachupipikapikapikachuchupichuchupichuchb"));
    ExampleRunner.eq(87, "YES", new PikachuEasy().check("kachukakapikapikachuchupikachukakachukachukapipi"));
    ExampleRunner.eq(88, "NO", new PikachuEasy().check("p"));
    ExampleRunner.eq(89, "NO", new PikachuEasy().check("k"));
    ExampleRunner.eq(90, "NO", new PikachuEasy().check("ch"));
    ExampleRunner.eq(91, "NO", new PikachuEasy().check("c"));
    ExampleRunner.eq(92, "NO", new PikachuEasy().check("kpia"));
    ExampleRunner.eq(93, "NO", new PikachuEasy().check("pchui"));
    ExampleRunner.eq(94, "NO", new PikachuEasy().check("chpiu"));
    ExampleRunner.eq(95, "NO", new PikachuEasy().check("pip"));
    ExampleRunner.eq(96, "NO", new PikachuEasy().check("pikachua"));
    ExampleRunner.eq(97, "NO", new PikachuEasy().check("xxx"));
    ExampleRunner.eq(98, "NO", new PikachuEasy().check("i"));
    ExampleRunner.eq(99, "NO", new PikachuEasy().check("pikachup"));
    ExampleRunner.eq(100, "NO", new PikachuEasy().check("kkaa"));
    ExampleRunner.eq(101, "NO", new PikachuEasy().check("pikachh"));
    ExampleRunner.eq(102, "NO", new PikachuEasy().check("pikach"));
    ExampleRunner.eq(103, "NO", new PikachuEasy().check("pii"));
    ExampleRunner.eq(104, "NO", new PikachuEasy().check("aa"));
    ExampleRunner.eq(105, "NO", new PikachuEasy().check("kpipia"));
    ExampleRunner.eq(106, "NO", new PikachuEasy().check("pikachublachu"));
    ExampleRunner.eq(107, "NO", new PikachuEasy().check("kpiachu"));
    ExampleRunner.eq(108, "YES", new PikachuEasy().check("chu"));
    ExampleRunner.eq(109, "NO", new PikachuEasy().check("cpihu"));
    ExampleRunner.eq(110, "YES", new PikachuEasy().check("pipi"));
    ExampleRunner.eq(111, "NO", new PikachuEasy().check("pik"));
    ExampleRunner.eq(112, "NO", new PikachuEasy().check("ak"));
    ExampleRunner.eq(113, "NO", new PikachuEasy().check("pikak"));
    ExampleRunner.eq(114, "NO", new PikachuEasy().check("ppii"));
    ExampleRunner.eq(115, "NO", new PikachuEasy().check("pikapip"));
    ExampleRunner.eq(116, "NO", new PikachuEasy().check("chuchucpihu"));
    ExampleRunner.eq(117, "NO", new PikachuEasy().check("piz"));
    ExampleRunner.eq(118, "NO", new PikachuEasy().check("ppiikkaacchhuu"));
    ExampleRunner.eq(119, "NO", new PikachuEasy().check("ckahu"));
    ExampleRunner.eq(120, "YES", new PikachuEasy().check("kakaka"));
    ExampleRunner.eq(121, "NO", new PikachuEasy().check("pikpia"));
    ExampleRunner.eq(122, "YES", new PikachuEasy().check("pi"));
    ExampleRunner.eq(123, "YES", new PikachuEasy().check("ka"));
    ExampleRunner.eq(124, "YES", new PikachuEasy().check("pikapika"));
    ExampleRunner.eq(125, "NO", new PikachuEasy().check("ki"));
    ExampleRunner.eq(126, "NO", new PikachuEasy().check("pich"));
    ExampleRunner.eq(127, "YES", new PikachuEasy().check("kakakakaka"));
    ExampleRunner.eq(128, "NO", new PikachuEasy().check("ipi"));
    ExampleRunner.eq(129, "NO", new PikachuEasy().check("ip"));
    ExampleRunner.eq(130, "YES", new PikachuEasy().check("chuchuchuchu"));
    ExampleRunner.eq(131, "YES", new PikachuEasy().check("chupi"));
    ExampleRunner.eq(132, "NO", new PikachuEasy().check("pikpiachu"));
    ExampleRunner.eq(133, "YES", new PikachuEasy().check("pipikakachupi"));
    ExampleRunner.eq(134, "NO", new PikachuEasy().check("kkakakakakaa"));
    ExampleRunner.eq(135, "NO", new PikachuEasy().check("a"));
    ExampleRunner.eq(136, "NO", new PikachuEasy().check("ca"));
    ExampleRunner.eq(137, "YES", new PikachuEasy().check("pipikakachuchupikapi"));
    ExampleRunner.eq(138, "NO", new PikachuEasy().check("kak"));
    ExampleRunner.eq(139, "YES", new PikachuEasy().check("kaka"));
    ExampleRunner.eq(140, "NO", new PikachuEasy().check("cpikahu"));
    ExampleRunner.eq(141, "NO", new PikachuEasy().check("h"));
    ExampleRunner.eq(142, "NO", new PikachuEasy().check("pic"));
    ExampleRunner.eq(143, "NO", new PikachuEasy().check("piu"));
    ExampleRunner.eq(144, "NO", new PikachuEasy().check("ckapihu"));
    ExampleRunner.eq(145, "NO", new PikachuEasy().check("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww"));
    ExampleRunner.eq(146, "NO", new PikachuEasy().check("d"));
  }
}
