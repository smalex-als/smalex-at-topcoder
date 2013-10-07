package p500.srm593;

import utils.ExampleRunner;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 10/7/13
 * Time: 12:18 PM
 */
public class WolfDelaymaster {
  public String check(String w) {
    String et = "wolf";
    int pos = 0;
    while (true) {
      int[] cnt = new int[et.length()];
      for (int i = 0; i < et.length(); i++) {
        char c = et.charAt(i);
        // бежим пока один и тот же символ
        for (;pos < w.length() && w.charAt(pos) == c; pos++, cnt[i]++);
        if (cnt[i] == 0) {
          return "INVALID";
        }
        // если последнее буква, то сравним счетчики
        if (isLastChar(et, i)) {
          for (int k = 1; k < cnt.length; k++) {
            if (cnt[k - 1] != cnt[k]) {
              return "INVALID";
            }
          }
        }
        // если строка кончилась
        if (pos == w.length()) {
          // если последний символ то ОК, если нет то НЕОК
          return isLastChar(et, i) ? "VALID" : "INVALID";
        }
      }
    }
  }

  private boolean isLastChar(String et, int i) {
    return i == et.length() - 1;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, "INVALID", new WolfDelaymaster().check(""));
    ExampleRunner.eq(1, "VALID", new WolfDelaymaster().check("wolf"));
    ExampleRunner.eq(2, "INVALID", new WolfDelaymaster().check("wwolfolf"));
    ExampleRunner.eq(3, "VALID", new WolfDelaymaster().check("wolfwwoollffwwwooolllfffwwwwoooollllffff"));
    ExampleRunner.eq(4, "INVALID", new WolfDelaymaster().check("flowolf"));
    ExampleRunner.eq(5, "INVALID", new WolfDelaymaster().check("o"));
    ExampleRunner.eq(6, "INVALID", new WolfDelaymaster().check("fo"));
    ExampleRunner.eq(7, "INVALID", new WolfDelaymaster().check("lfw"));
    ExampleRunner.eq(8, "INVALID", new WolfDelaymaster().check("llwl"));
    ExampleRunner.eq(9, "INVALID", new WolfDelaymaster().check("ofwff"));
    ExampleRunner.eq(10, "INVALID", new WolfDelaymaster().check("fwwloo"));
    ExampleRunner.eq(11, "INVALID", new WolfDelaymaster().check("llwolow"));
    ExampleRunner.eq(12, "INVALID", new WolfDelaymaster().check("flffwwff"));
    ExampleRunner.eq(13, "INVALID", new WolfDelaymaster().check("lllfoffff"));
    ExampleRunner.eq(14, "INVALID", new WolfDelaymaster().check("ffwffwwoow"));
    ExampleRunner.eq(15, "INVALID", new WolfDelaymaster().check("wflolwfolwo"));
    ExampleRunner.eq(16, "INVALID", new WolfDelaymaster().check("wlwwlfolflow"));
    ExampleRunner.eq(17, "INVALID", new WolfDelaymaster().check("ofwwoooffwlll"));
    ExampleRunner.eq(18, "INVALID", new WolfDelaymaster().check("wwfwfllwowolfl"));
    ExampleRunner.eq(19, "INVALID", new WolfDelaymaster().check("ollooolwoofwwwf"));
    ExampleRunner.eq(20, "INVALID", new WolfDelaymaster().check("ooffwffflfwlwwol"));
    ExampleRunner.eq(21, "INVALID", new WolfDelaymaster().check("wofowlwlolllfolof"));
    ExampleRunner.eq(22, "INVALID", new WolfDelaymaster().check("llfoowfoofffooolof"));
    ExampleRunner.eq(23, "INVALID", new WolfDelaymaster().check("wlwwwflwfoolwwwwwol"));
    ExampleRunner.eq(24, "INVALID", new WolfDelaymaster().check("wlwofwfwlfffowollofo"));
    ExampleRunner.eq(25, "INVALID", new WolfDelaymaster().check("ofowfffwllooooflowfwl"));
    ExampleRunner.eq(26, "INVALID", new WolfDelaymaster().check("owwoolwowfwlflllwwlwol"));
    ExampleRunner.eq(27, "INVALID", new WolfDelaymaster().check("wlowloffowoowwofwlwwlol"));
    ExampleRunner.eq(28, "INVALID", new WolfDelaymaster().check("wolwllloloolfowoffolwlfo"));
    ExampleRunner.eq(29, "INVALID", new WolfDelaymaster().check("lflwfoolowoofwwffooffflwo"));
    ExampleRunner.eq(30, "INVALID", new WolfDelaymaster().check("wowflwfofloolwoolwwflflflo"));
    ExampleRunner.eq(31, "INVALID", new WolfDelaymaster().check("olwllfofofowwfofofofwwoffof"));
    ExampleRunner.eq(32, "INVALID", new WolfDelaymaster().check("llfollfloowllwfllolfoloflflo"));
    ExampleRunner.eq(33, "INVALID", new WolfDelaymaster().check("owloowllowfofwowowfllfflfoool"));
    ExampleRunner.eq(34, "INVALID", new WolfDelaymaster().check("owfwllwfwloolwfwlwofwowoowwffl"));
    ExampleRunner.eq(35, "INVALID", new WolfDelaymaster().check("owoofffwoloffwooflolwlwwfofoflo"));
    ExampleRunner.eq(36, "INVALID", new WolfDelaymaster().check("oowlooolwwfwwfwfowloolwllowoffwl"));
    ExampleRunner.eq(37, "INVALID", new WolfDelaymaster().check("owlwlfollfwwfoffololwfoowlwloflof"));
    ExampleRunner.eq(38, "INVALID", new WolfDelaymaster().check("ofolowlwwoowfowlfwowwwowoofoolwlff"));
    ExampleRunner.eq(39, "INVALID", new WolfDelaymaster().check("lowwffllwlofllwwwfwowofoowlolfloowo"));
    ExampleRunner.eq(40, "INVALID", new WolfDelaymaster().check("wfollwlwoolwlolwowloowlflfwfwofflfow"));
    ExampleRunner.eq(41, "INVALID", new WolfDelaymaster().check("olfowwwflofowlwwofofwwoowowlfwllfwflf"));
    ExampleRunner.eq(42, "INVALID", new WolfDelaymaster().check("oowfflloowwolwwwlfwofoolwwwwwwfwfffowo"));
    ExampleRunner.eq(43, "INVALID", new WolfDelaymaster().check("wolfwlfwllfoofofllfwffwfowwfowflfflolll"));
    ExampleRunner.eq(44, "INVALID", new WolfDelaymaster().check("wolffwlfllfflwlowwwlwoffflowflfwfowwoooo"));
    ExampleRunner.eq(45, "INVALID", new WolfDelaymaster().check("loofwwwfooolffwlwoowwwwwfoofwowwollffowoo"));
    ExampleRunner.eq(46, "INVALID", new WolfDelaymaster().check("oofoolllowwlfllofwofwfololllflflfoollwwflo"));
    ExampleRunner.eq(47, "INVALID", new WolfDelaymaster().check("loooofwfflwwflolloolofwfoowlwolfwfowwllwooo"));
    ExampleRunner.eq(48, "INVALID", new WolfDelaymaster().check("wlolfwfffflffwfowfowlfwwwolowolfolwolffofwfo"));
    ExampleRunner.eq(49, "INVALID", new WolfDelaymaster().check("wlwoloolooffowwwlwwowlwoflflwwlwlflfoowlfowow"));
    ExampleRunner.eq(50, "INVALID", new WolfDelaymaster().check("offwllfllffwlwlffwowfwwlolooofolofwoolwwlfoooo"));
    ExampleRunner.eq(51, "INVALID", new WolfDelaymaster().check("wfolwwlwolwfffwofoffowlolflfoffoofolfwfwolflwwl"));
    ExampleRunner.eq(52, "INVALID", new WolfDelaymaster().check("woffffllfowwlfwffloffooolfoflfflfflwfoflfffowlfl"));
    ExampleRunner.eq(53, "INVALID", new WolfDelaymaster().check("folfffolwlllowwlllloloowlllfwooowlwwwfwlllllooolo"));
    ExampleRunner.eq(54, "INVALID", new WolfDelaymaster().check("fofflwllwooowowwwllllwlwllwwlwwfwwfwofwwfolowlolwo"));
    ExampleRunner.eq(55, "VALID", new WolfDelaymaster().check("wwwwwwwwwwwwoooooooooooollllllllllllffffffffffff"));
    ExampleRunner.eq(56, "VALID", new WolfDelaymaster().check("wwwwoooollllffffwwwwwwwooooooolllllllfffffff"));
    ExampleRunner.eq(57, "VALID", new WolfDelaymaster().check("wwwwwwwwwwoooooooooollllllllllffffffffff"));
    ExampleRunner.eq(58, "VALID", new WolfDelaymaster().check("wwwwoooollllffffwwwwwwwwoooooooollllllllffffffff"));
    ExampleRunner.eq(59, "VALID", new WolfDelaymaster().check("wwwooolllfffwwwwoooollllffffwwwwoooollllffff"));
    ExampleRunner.eq(60, "VALID", new WolfDelaymaster().check("wwwwwwwwwooooooooolllllllllfffffffff"));
    ExampleRunner.eq(61, "VALID", new WolfDelaymaster().check("wwoollffwwoollffwwoollffwwwwwooooolllllfffff"));
    ExampleRunner.eq(62, "VALID", new WolfDelaymaster().check("wwwwwwwwwooooooooolllllllllfffffffff"));
    ExampleRunner.eq(63, "VALID", new WolfDelaymaster().check("wwwwwwwwwwoooooooooollllllllllffffffffff"));
    ExampleRunner.eq(64, "VALID", new WolfDelaymaster().check("wwoollffwwwwoooollllffffwolf"));
    ExampleRunner.eq(65, "VALID", new WolfDelaymaster().check("wwwwwooooolllllfffff"));
    ExampleRunner.eq(66, "VALID", new WolfDelaymaster().check("wwwwwwwwwooooooooolllllllllfffffffffwolf"));
    ExampleRunner.eq(67, "VALID", new WolfDelaymaster().check("wwwwoooollllffff"));
    ExampleRunner.eq(68, "VALID", new WolfDelaymaster().check("wwwwwwwwoooooooollllllllffffffff"));
    ExampleRunner.eq(69, "VALID", new WolfDelaymaster().check("wwwwwooooolllllfffffwolfwwwwwwoooooollllllffffff"));
    ExampleRunner.eq(70, "VALID", new WolfDelaymaster().check("wwwwwwwooooooolllllllfffffff"));
    ExampleRunner.eq(71, "VALID", new WolfDelaymaster().check("wwwwwooooolllllfffffwwoollff"));
    ExampleRunner.eq(72, "VALID", new WolfDelaymaster().check("wwwwwwoooooollllllffffffwwwooolllfff"));
    ExampleRunner.eq(73, "VALID", new WolfDelaymaster().check("wwwwoooollllffffwwwwwwoooooollllllffffff"));
    ExampleRunner.eq(74, "VALID", new WolfDelaymaster().check("wwwwwwwwwwoooooooooollllllllllffffffffff"));
    ExampleRunner.eq(75, "VALID", new WolfDelaymaster().check("wwwwwooooolllllfffffwwwooolllfffwwoollff"));
    ExampleRunner.eq(76, "VALID", new WolfDelaymaster().check("wwwwwwoooooollllllffffffwolfwwwwwooooolllllfffff"));
    ExampleRunner.eq(77, "VALID", new WolfDelaymaster().check("wwwwwwoooooollllllffffffwwwwoooollllffff"));
    ExampleRunner.eq(78, "VALID", new WolfDelaymaster().check("wwwwoooollllffffwwwooolllfffwwwwwooooolllllfffff"));
    ExampleRunner.eq(79, "VALID", new WolfDelaymaster().check("wwwwwwwwwwoooooooooollllllllllffffffffffwwoollff"));
    ExampleRunner.eq(80, "VALID", new WolfDelaymaster().check("wwoollffwwwwwwwwoooooooollllllllffffffff"));
    ExampleRunner.eq(81, "VALID", new WolfDelaymaster().check("wolfwwwwwwwwoooooooollllllllffffffffwwoollff"));
    ExampleRunner.eq(82, "VALID", new WolfDelaymaster().check("wwwwwwoooooollllllffffffwwwooolllfff"));
    ExampleRunner.eq(83, "VALID", new WolfDelaymaster().check("wwwooolllfffwwwwwwoooooollllllffffffwwoollff"));
    ExampleRunner.eq(84, "VALID", new WolfDelaymaster().check("wwwwwwwwwooooooooolllllllllfffffffff"));
    ExampleRunner.eq(85, "VALID", new WolfDelaymaster().check("wwwwwooooolllllfffffwwwwwwwooooooolllllllfffffff"));
    ExampleRunner.eq(86, "VALID", new WolfDelaymaster().check("wwoollffwwwwwwwwwwoooooooooollllllllllffffffffff"));
    ExampleRunner.eq(87, "VALID", new WolfDelaymaster().check("wwwooolllfff"));
    ExampleRunner.eq(88, "VALID", new WolfDelaymaster().check("wwwwwwwooooooolllllllfffffffwwwooolllfff"));
    ExampleRunner.eq(89, "VALID", new WolfDelaymaster().check("wwoollffwwwwwwwwwooooooooolllllllllfffffffff"));
    ExampleRunner.eq(90, "VALID", new WolfDelaymaster().check("wwwwwwwooooooolllllllfffffff"));
    ExampleRunner.eq(91, "VALID", new WolfDelaymaster().check("wolfwwoollffwwwwoooollllffffwwwwwooooolllllfffff"));
    ExampleRunner.eq(92, "VALID", new WolfDelaymaster().check("wwwooolllfffwwoollff"));
    ExampleRunner.eq(93, "VALID", new WolfDelaymaster().check("wwwwwwwwoooooooollllllllffffffff"));
    ExampleRunner.eq(94, "VALID", new WolfDelaymaster().check("wwwooolllfffwwwwwwwwwooooooooolllllllllfffffffff"));
    ExampleRunner.eq(95, "VALID", new WolfDelaymaster().check("wwwwwooooolllllfffff"));
    ExampleRunner.eq(96, "VALID", new WolfDelaymaster().check("wwwooolllfffwwwooolllfff"));
    ExampleRunner.eq(97, "VALID", new WolfDelaymaster().check("wwwwwooooolllllfffffwwwwwwwooooooolllllllfffffff"));
    ExampleRunner.eq(98, "VALID", new WolfDelaymaster().check("wwwwwwwwwooooooooolllllllllfffffffffwolf"));
    ExampleRunner.eq(99, "VALID", new WolfDelaymaster().check("wwoollffwwwwoooollllffff"));
    ExampleRunner.eq(100, "VALID", new WolfDelaymaster().check("wwwwwooooolllllfffffwwwooolllfff"));
    ExampleRunner.eq(101, "VALID", new WolfDelaymaster().check("wwwooolllfffwwwwwwoooooollllllffffffwwoollff"));
    ExampleRunner.eq(102, "VALID", new WolfDelaymaster().check("wwwwwooooolllllfffffwwoollff"));
    ExampleRunner.eq(103, "VALID", new WolfDelaymaster().check("wwwwwwwwoooooooollllllllffffffff"));
    ExampleRunner.eq(104, "VALID", new WolfDelaymaster().check("wwoollffwwoollff"));
    ExampleRunner.eq(105, "VALID", new WolfDelaymaster().check("wwoollffwwwwwwoooooollllllffffffwwwooolllfff"));
    ExampleRunner.eq(106, "INVALID", new WolfDelaymaster().check("wwwooolllff"));
    ExampleRunner.eq(107, "INVALID", new WolfDelaymaster().check("wwoollfff"));
    ExampleRunner.eq(108, "INVALID", new WolfDelaymaster().check("ffwwooll"));
    ExampleRunner.eq(109, "VALID", new WolfDelaymaster().check("wolfwolf"));
    ExampleRunner.eq(110, "INVALID", new WolfDelaymaster().check("wolfwolfwwoollffwolfwwwooolllff"));
    ExampleRunner.eq(111, "INVALID", new WolfDelaymaster().check("wofl"));
    ExampleRunner.eq(112, "INVALID", new WolfDelaymaster().check("wolfwol"));
    ExampleRunner.eq(113, "INVALID", new WolfDelaymaster().check("wol"));
    ExampleRunner.eq(114, "INVALID", new WolfDelaymaster().check("wwooollllllfff"));
    ExampleRunner.eq(115, "INVALID", new WolfDelaymaster().check("w"));
    ExampleRunner.eq(116, "INVALID", new WolfDelaymaster().check("wlof"));
    ExampleRunner.eq(117, "INVALID", new WolfDelaymaster().check("wolfwwwwww"));
    ExampleRunner.eq(118, "INVALID", new WolfDelaymaster().check("wolff"));
    ExampleRunner.eq(119, "INVALID", new WolfDelaymaster().check("llll"));
    ExampleRunner.eq(120, "INVALID", new WolfDelaymaster().check("wwolf"));
    ExampleRunner.eq(121, "INVALID", new WolfDelaymaster().check("wlofwlof"));
    ExampleRunner.eq(122, "INVALID", new WolfDelaymaster().check("wo"));
    ExampleRunner.eq(123, "INVALID", new WolfDelaymaster().check("woowllff"));
    ExampleRunner.eq(124, "VALID", new WolfDelaymaster().check("wwoollff"));
    ExampleRunner.eq(125, "INVALID", new WolfDelaymaster().check("wwwwwwwww"));
    ExampleRunner.eq(126, "INVALID", new WolfDelaymaster().check("fwolf"));
    ExampleRunner.eq(127, "INVALID", new WolfDelaymaster().check("flwo"));
    ExampleRunner.eq(128, "INVALID", new WolfDelaymaster().check("ooo"));
    ExampleRunner.eq(129, "INVALID", new WolfDelaymaster().check("flow"));
    ExampleRunner.eq(130, "INVALID", new WolfDelaymaster().check("wwwww"));
    ExampleRunner.eq(131, "INVALID", new WolfDelaymaster().check("wwolfwoolfwollfwolff"));
    ExampleRunner.eq(132, "INVALID", new WolfDelaymaster().check("wwwwoooollllf"));
    ExampleRunner.eq(133, "INVALID", new WolfDelaymaster().check("wwww"));
    ExampleRunner.eq(134, "INVALID", new WolfDelaymaster().check("fwol"));
    ExampleRunner.eq(135, "INVALID", new WolfDelaymaster().check("wwwwwooooolllllfffffwwwolfwwooooooolllllllfffffff"));
    ExampleRunner.eq(136, "INVALID", new WolfDelaymaster().check("wwolfwoollff"));
    ExampleRunner.eq(137, "INVALID", new WolfDelaymaster().check("wolfwoolfwwollff"));
    ExampleRunner.eq(138, "INVALID", new WolfDelaymaster().check("wowollff"));
    ExampleRunner.eq(139, "INVALID", new WolfDelaymaster().check("wolfwo"));
    ExampleRunner.eq(140, "INVALID", new WolfDelaymaster().check("olfw"));
    ExampleRunner.eq(141, "INVALID", new WolfDelaymaster().check("wwwwwwww"));
    ExampleRunner.eq(142, "INVALID", new WolfDelaymaster().check("wollfwwoolff"));
    ExampleRunner.eq(143, "INVALID", new WolfDelaymaster().check("woolf"));
    ExampleRunner.eq(144, "INVALID", new WolfDelaymaster().check("wfol"));
    ExampleRunner.eq(145, "INVALID", new WolfDelaymaster().check("wolfw"));
    ExampleRunner.eq(146, "INVALID", new WolfDelaymaster().check("llffwwoo"));
    ExampleRunner.eq(147, "INVALID", new WolfDelaymaster().check("oolf"));
    ExampleRunner.eq(148, "INVALID", new WolfDelaymaster().check("wwwolllllllf"));
    ExampleRunner.eq(149, "INVALID", new WolfDelaymaster().check("wwoollf"));
    ExampleRunner.eq(150, "INVALID", new WolfDelaymaster().check("wwwwooollff"));
    ExampleRunner.eq(151, "INVALID", new WolfDelaymaster().check("wwwwwolf"));
    ExampleRunner.eq(152, "INVALID", new WolfDelaymaster().check("wwfollof"));
    ExampleRunner.eq(153, "INVALID", new WolfDelaymaster().check("wwwoollllffffff"));
    ExampleRunner.eq(154, "INVALID", new WolfDelaymaster().check("ww"));
    ExampleRunner.eq(155, "INVALID", new WolfDelaymaster().check("wolfwolfwwolf"));
    ExampleRunner.eq(156, "INVALID", new WolfDelaymaster().check("wwwwww"));
    ExampleRunner.eq(157, "INVALID", new WolfDelaymaster().check("wwwolfoollff"));
    ExampleRunner.eq(158, "INVALID", new WolfDelaymaster().check("wwllooff"));
    ExampleRunner.eq(159, "INVALID", new WolfDelaymaster().check("olfwolf"));
    ExampleRunner.eq(160, "INVALID", new WolfDelaymaster().check("wolfl"));
    ExampleRunner.eq(161, "INVALID", new WolfDelaymaster().check("wolfwwoo"));
    ExampleRunner.eq(162, "INVALID", new WolfDelaymaster().check("wolw"));
    ExampleRunner.eq(163, "INVALID", new WolfDelaymaster().check("wwowoolllfff"));
    ExampleRunner.eq(164, "INVALID", new WolfDelaymaster().check("www"));
    ExampleRunner.eq(165, "INVALID", new WolfDelaymaster().check("wolllfff"));
    ExampleRunner.eq(166, "INVALID", new WolfDelaymaster().check("wolfwwwwoooollllff"));
    ExampleRunner.eq(167, "INVALID", new WolfDelaymaster().check("wwwoollffwoollff"));
    ExampleRunner.eq(168, "INVALID", new WolfDelaymaster().check("woolllfff"));
    ExampleRunner.eq(169, "INVALID", new WolfDelaymaster().check("wlfo"));
    ExampleRunner.eq(170, "INVALID", new WolfDelaymaster().check("wolffwol"));
    ExampleRunner.eq(171, "INVALID", new WolfDelaymaster().check("wolwolff"));
    ExampleRunner.eq(172, "INVALID", new WolfDelaymaster().check("wwooollffwwollff"));
    ExampleRunner.eq(173, "INVALID", new WolfDelaymaster().check("wolfwwoollffwwwooolllfffwwwwoooollllfff"));
    ExampleRunner.eq(174, "INVALID", new WolfDelaymaster().check("woollf"));
    ExampleRunner.eq(175, "INVALID", new WolfDelaymaster().check("oooo"));
  }
}
