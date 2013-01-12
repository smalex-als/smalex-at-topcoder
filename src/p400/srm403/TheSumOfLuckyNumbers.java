package p400.srm403;

import java.util.ArrayList;
import java.util.List;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: Tanya
 * Date: 29.05.2008
 * Time: 5:53:12
 */
public class TheSumOfLuckyNumbers {
  public int[] sum(int n) {
    int i = 1;
    List<Integer> list = new ArrayList<Integer>();
    while (true) {
      String s = Integer.toBinaryString(i).replace('0', '4').replace('1', '7');
      i++;
      if (s.length() > 1) {
        int next_num = new Integer(s.substring(1));
        if (next_num <= n) {
          list.add(next_num);
        } else {
          break;
        }
      }
    }
    int rest = n;
    int pos = list.size() - 1;
    List<Integer> result = new ArrayList<Integer>();
    if (list.size() > 0) {
      while (rest > 0 && pos >= 0) {
        if (list.get(pos) <= rest) {
          rest -= list.get(pos);
          result.add(list.get(pos));
        } else {
          pos--;
        }
      }
    }
//    if (rest == 0) {
//      System.out.println("OK");
//    }
//    for (Integer integer : list) {
//      System.out.println("all = " + integer);
//    }
//    for (Integer integer : result) {
//      System.out.println("result = " + integer);
//    }

    return new int[]{1};
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, new int[]{4, 7}, new TheSumOfLuckyNumbers().sum(11));
    ExampleRunner.eq(2, new int[]{4, 4, 4}, new TheSumOfLuckyNumbers().sum(12));
    ExampleRunner.eq(3, new int[]{}, new TheSumOfLuckyNumbers().sum(13));
    ExampleRunner.eq(4, new int[]{4, 4, 4, 44, 44}, new TheSumOfLuckyNumbers().sum(100));
    ExampleRunner.eq(5, new int[]{4, 4, 44444, 477774, 477774}, new TheSumOfLuckyNumbers().sum(1000000));
    ExampleRunner.eq(6, new int[]{4, 44}, new TheSumOfLuckyNumbers().sum(48));
    ExampleRunner.eq(7, new int[]{}, new TheSumOfLuckyNumbers().sum(1));
    ExampleRunner.eq(8, new int[]{4, 4, 7, 7, 7, 7, 7, 7, 7}, new TheSumOfLuckyNumbers().sum(57));
    ExampleRunner.eq(9, new int[]{4, 7, 7, 7}, new TheSumOfLuckyNumbers().sum(25));
    ExampleRunner.eq(10, new int[]{4, 4, 7, 7, 47}, new TheSumOfLuckyNumbers().sum(69));
    ExampleRunner.eq(11, new int[]{444, 444, 444, 747, 747, 777}, new TheSumOfLuckyNumbers().sum(3603));
    ExampleRunner.eq(12, new int[]{444, 744, 744, 747, 777}, new TheSumOfLuckyNumbers().sum(3456));
    ExampleRunner.eq(13, new int[]{47, 747, 747, 747, 747, 777}, new TheSumOfLuckyNumbers().sum(3812));
    ExampleRunner.eq(14, new int[]{4, 474, 774, 774, 777, 777}, new TheSumOfLuckyNumbers().sum(3580));
    ExampleRunner.eq(15, new int[]{44, 744, 744, 744, 774, 774}, new TheSumOfLuckyNumbers().sum(3824));
    ExampleRunner.eq(16, new int[]{4, 4, 444, 4444, 474474, 477777}, new TheSumOfLuckyNumbers().sum(957147));
    ExampleRunner.eq(17, new int[]{444, 444, 444, 444, 474447, 474777}, new TheSumOfLuckyNumbers().sum(951000));
    ExampleRunner.eq(18, new int[]{74, 4474, 44477, 44777, 44777, 774777}, new TheSumOfLuckyNumbers().sum(913356));
    ExampleRunner.eq(19, new int[]{4, 44, 4444, 44444, 444444, 477744}, new TheSumOfLuckyNumbers().sum(971124));
    ExampleRunner.eq(20, new int[]{44, 44, 444, 4444, 44444, 474474, 474474}, new TheSumOfLuckyNumbers().sum(998368));
    ExampleRunner.eq(21, new int[]{}, new TheSumOfLuckyNumbers().sum(1));
    ExampleRunner.eq(22, new int[]{}, new TheSumOfLuckyNumbers().sum(2));
    ExampleRunner.eq(23, new int[]{}, new TheSumOfLuckyNumbers().sum(3));
    ExampleRunner.eq(24, new int[]{4}, new TheSumOfLuckyNumbers().sum(4));
    ExampleRunner.eq(25, new int[]{}, new TheSumOfLuckyNumbers().sum(5));
    ExampleRunner.eq(26, new int[]{}, new TheSumOfLuckyNumbers().sum(6));
    ExampleRunner.eq(27, new int[]{7}, new TheSumOfLuckyNumbers().sum(7));
    ExampleRunner.eq(28, new int[]{4, 4}, new TheSumOfLuckyNumbers().sum(8));
    ExampleRunner.eq(29, new int[]{}, new TheSumOfLuckyNumbers().sum(9));
    ExampleRunner.eq(30, new int[]{}, new TheSumOfLuckyNumbers().sum(10));
    ExampleRunner.eq(31, new int[]{}, new TheSumOfLuckyNumbers().sum(17));
    ExampleRunner.eq(32, new int[]{4, 7, 7}, new TheSumOfLuckyNumbers().sum(18));
    ExampleRunner.eq(33, new int[]{4, 4, 4, 7}, new TheSumOfLuckyNumbers().sum(19));
    ExampleRunner.eq(34, new int[]{4, 4, 4, 4, 4}, new TheSumOfLuckyNumbers().sum(20));
    ExampleRunner.eq(35, new int[]{7, 7, 7}, new TheSumOfLuckyNumbers().sum(21));
    ExampleRunner.eq(36, new int[]{4, 4, 44, 4474, 4474, 44474, 47474, 447474, 447777}, new TheSumOfLuckyNumbers().sum(996199));
    ExampleRunner.eq(37, new int[]{4, 4, 44, 474, 44774, 74774, 74774, 74774, 474777}, new TheSumOfLuckyNumbers().sum(744399));
    ExampleRunner.eq(38, new int[]{4, 4, 44, 474, 74474, 74774, 74774, 74774, 474777}, new TheSumOfLuckyNumbers().sum(774099));
    ExampleRunner.eq(39, new int[]{4, 4, 444, 444, 74474, 74474, 74774, 74774, 474777}, new TheSumOfLuckyNumbers().sum(774169));
    ExampleRunner.eq(40, new int[]{4, 4, 444, 474, 74474, 74474, 74774, 74774, 474777}, new TheSumOfLuckyNumbers().sum(774199));
    ExampleRunner.eq(41, new int[]{4, 4, 44, 4474, 4474, 4474, 4474, 47474, 747777}, new TheSumOfLuckyNumbers().sum(813199));
    ExampleRunner.eq(42, new int[]{4, 4, 44, 4474, 4474, 4474, 4474, 47774, 747777}, new TheSumOfLuckyNumbers().sum(813499));
    ExampleRunner.eq(43, new int[]{4, 4, 44, 4474, 4474, 4474, 4774, 47774, 747777}, new TheSumOfLuckyNumbers().sum(813799));
    ExampleRunner.eq(44, new int[]{4, 4, 74, 4474, 4474, 4474, 4774, 47774, 747777}, new TheSumOfLuckyNumbers().sum(813829));
    ExampleRunner.eq(45, new int[]{4, 444, 444, 4444, 4444, 4444, 4444, 47444, 747747}, new TheSumOfLuckyNumbers().sum(813859));
    ExampleRunner.eq(46, new int[]{4, 4, 444, 4444, 4474, 4474, 4474, 47774, 747777}, new TheSumOfLuckyNumbers().sum(813869));
    ExampleRunner.eq(47, new int[]{4, 4, 444, 4474, 4474, 4474, 4474, 47774, 747777}, new TheSumOfLuckyNumbers().sum(813899));
    ExampleRunner.eq(48, new int[]{4, 4, 44, 4474, 4474, 4774, 4774, 47774, 747777}, new TheSumOfLuckyNumbers().sum(814099));
    ExampleRunner.eq(49, new int[]{4, 4, 444, 4444, 4474, 4474, 4774, 47774, 747777}, new TheSumOfLuckyNumbers().sum(814169));
    ExampleRunner.eq(50, new int[]{4, 4, 444, 4474, 4474, 4474, 4774, 47774, 747777}, new TheSumOfLuckyNumbers().sum(814199));
    ExampleRunner.eq(51, new int[]{4, 4, 44, 74, 4474, 7474, 7474, 47474, 747477}, new TheSumOfLuckyNumbers().sum(814499));
    ExampleRunner.eq(52, new int[]{4, 4, 44, 4474, 4474, 4474, 7474, 47474, 747777}, new TheSumOfLuckyNumbers().sum(816199));
    ExampleRunner.eq(53, new int[]{4, 4, 44, 4474, 4474, 4474, 7474, 47774, 747777}, new TheSumOfLuckyNumbers().sum(816499));
    ExampleRunner.eq(54, new int[]{4, 4, 44, 44474, 74474, 74474, 74474, 74474, 474477}, new TheSumOfLuckyNumbers().sum(816899));
    ExampleRunner.eq(55, new int[]{4, 4, 44, 44474, 74474, 74474, 74474, 74474, 474777}, new TheSumOfLuckyNumbers().sum(817199));
    ExampleRunner.eq(56, new int[]{4, 4, 44, 74, 7474, 7474, 7474, 47474, 747477}, new TheSumOfLuckyNumbers().sum(817499));
    ExampleRunner.eq(57, new int[]{4, 4, 44, 4474, 4474, 44474, 44474, 447474, 447777}, new TheSumOfLuckyNumbers().sum(993199));
    ExampleRunner.eq(58, new int[]{44444, 44444, 44444, 44444, 44444, 777777}, new TheSumOfLuckyNumbers().sum(999997));
    ExampleRunner.eq(59, new int[]{44444, 477744, 477774}, new TheSumOfLuckyNumbers().sum(999962));
    ExampleRunner.eq(60, new int[]{74, 74, 74, 77, 777477}, new TheSumOfLuckyNumbers().sum(777776));
    ExampleRunner.eq(61, new int[]{4, 4, 4, 74, 77777}, new TheSumOfLuckyNumbers().sum(77863));
    ExampleRunner.eq(62, new int[]{44444}, new TheSumOfLuckyNumbers().sum(44444));
    ExampleRunner.eq(63, new int[]{4, 444, 447}, new TheSumOfLuckyNumbers().sum(895));
    ExampleRunner.eq(64, new int[]{4, 44444, 477774, 477777}, new TheSumOfLuckyNumbers().sum(999999));
    ExampleRunner.eq(65, new int[]{74, 44474, 44474, 447777, 447777}, new TheSumOfLuckyNumbers().sum(984576));
    ExampleRunner.eq(66, new int[]{44, 444, 44444, 47474, 447474, 447774}, new TheSumOfLuckyNumbers().sum(987654));
    ExampleRunner.eq(67, new int[]{444, 4444, 44444, 44744, 447744, 447744}, new TheSumOfLuckyNumbers().sum(989564));
    ExampleRunner.eq(68, new int[]{44444, 477777, 477777}, new TheSumOfLuckyNumbers().sum(999998));
    ExampleRunner.eq(69, new int[]{44, 44, 444, 44444, 477444, 477477}, new TheSumOfLuckyNumbers().sum(999897));
    ExampleRunner.eq(70, new int[]{44, 44, 44, 444, 4744, 74744, 74777}, new TheSumOfLuckyNumbers().sum(154841));
    ExampleRunner.eq(71, new int[]{444444, 444444}, new TheSumOfLuckyNumbers().sum(888888));
    ExampleRunner.eq(72, new int[]{4, 4, 4, 44, 4444, 47744, 47747}, new TheSumOfLuckyNumbers().sum(99991));
    ExampleRunner.eq(73, new int[]{44, 77}, new TheSumOfLuckyNumbers().sum(121));
    ExampleRunner.eq(74, new int[]{4, 4, 4, 444, 4444, 477444, 477447}, new TheSumOfLuckyNumbers().sum(959791));
    ExampleRunner.eq(75, new int[]{4, 74}, new TheSumOfLuckyNumbers().sum(78));
  }
}
