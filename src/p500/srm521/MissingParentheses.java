package p500.srm521;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 10/13/11
 * Time: 7:30 AM
 */
public class MissingParentheses {
  public int countCorrections(String par) {
    int open = 0;
    int result = 0;
    for (int i = 0; i < par.length(); i++) {
      if (par.charAt(i) == '(') {
        open++;
      }
      if (par.charAt(i) == ')') {
        open--;
      }
      if (open < 0) {
        open = 0;
        result++;
      }
    }
//    System.out.println("result = " + result);
//    System.out.println("open = " + open);
    return result + open;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 2, new MissingParentheses().countCorrections("(()(()"));
    ExampleRunner.eq(2, 1, new MissingParentheses().countCorrections("()()(()"));
    ExampleRunner.eq(3, 0, new MissingParentheses().countCorrections("(())(()())"));
    ExampleRunner.eq(4, 7, new MissingParentheses().countCorrections("())(())((()))))()((())))()())())())()()()"));
    ExampleRunner.eq(5, 0, new MissingParentheses().countCorrections("()"));
    ExampleRunner.eq(6, 12, new MissingParentheses().countCorrections(")(())((((()()())))(()(())((()(()(((())(()(((((()))"));
    ExampleRunner.eq(7, 8, new MissingParentheses().countCorrections("())()))())()()()))())()()((()()())))(()()()()(()))"));
    ExampleRunner.eq(8, 14, new MissingParentheses().countCorrections("())())(()(())()())())(()))))()()((((()()(())(()((("));
    ExampleRunner.eq(9, 6, new MissingParentheses().countCorrections(")(()(()()()()())()(()(((())))()(((())))()))))())(("));
    ExampleRunner.eq(10, 12, new MissingParentheses().countCorrections("()()()()())((()))()()()(())))))))(())))()((()()()("));
    ExampleRunner.eq(11, 32, new MissingParentheses().countCorrections("(((()(((((()((((((((()((()(((((()(()(((()(((()()(("));
    ExampleRunner.eq(12, 28, new MissingParentheses().countCorrections("((()((()(()()()()(((((((((((()()(((()((((((((()()("));
    ExampleRunner.eq(13, 16, new MissingParentheses().countCorrections(")))((()()(()))())((())(()))))))())())()())))(((()("));
    ExampleRunner.eq(14, 16, new MissingParentheses().countCorrections("()()()(())()))()))()))())))))(((())(())(()))))))))"));
    ExampleRunner.eq(15, 20, new MissingParentheses().countCorrections(")(())()))()((())))))))()(())()))())())))()))))((()"));
    ExampleRunner.eq(16, 20, new MissingParentheses().countCorrections("())((()))))()))))()()())))()(()()))()))))()))))())"));
    ExampleRunner.eq(17, 18, new MissingParentheses().countCorrections("))))(((()(()(())())))))()))))))()))())(())(())))(("));
    ExampleRunner.eq(18, 21, new MissingParentheses().countCorrections("()(((((((((((((((()(((((("));
    ExampleRunner.eq(19, 18, new MissingParentheses().countCorrections("((((()((((((()((((()(((("));
    ExampleRunner.eq(20, 11, new MissingParentheses().countCorrections(")))))))))))()"));
    ExampleRunner.eq(21, 3, new MissingParentheses().countCorrections("()((((())"));
    ExampleRunner.eq(22, 4, new MissingParentheses().countCorrections(")))("));
    ExampleRunner.eq(23, 1, new MissingParentheses().countCorrections("(((((((((((((((((()))))))))))))))))"));
    ExampleRunner.eq(24, 35, new MissingParentheses().countCorrections(")))))))))))))))))(((((((((((((((((("));
    ExampleRunner.eq(25, 5, new MissingParentheses().countCorrections("(((((((((((((((()))))))))))))))))))))"));
    ExampleRunner.eq(26, 37, new MissingParentheses().countCorrections(")))))))))))))))))))(((((((((((((((((("));
    ExampleRunner.eq(27, 1, new MissingParentheses().countCorrections("(((((((((((((()))))))))))))"));
    ExampleRunner.eq(28, 27, new MissingParentheses().countCorrections(")))))))))))(((((((((((((((("));
    ExampleRunner.eq(29, 0, new MissingParentheses().countCorrections("((()(())()())((()())()()()()()()()()()()(()()())))"));
    ExampleRunner.eq(30, 0, new MissingParentheses().countCorrections("(((((((((()()((())(()))()())()())()())))))(()())))"));
    ExampleRunner.eq(31, 0, new MissingParentheses().countCorrections("(((((()))))()()(((((((((((((()))))(()())))))))))))"));
    ExampleRunner.eq(32, 2, new MissingParentheses().countCorrections("(()))()()()()()(()(()()((())())()())()(())()()()()"));
    ExampleRunner.eq(33, 2, new MissingParentheses().countCorrections("((((((())))))((((())()))((()()())((())(())()))))))"));
    ExampleRunner.eq(34, 2, new MissingParentheses().countCorrections("(((((())(((()))))()((()))()()))))((()))(((((()))))"));
    ExampleRunner.eq(35, 2, new MissingParentheses().countCorrections("((()((())())))()(((()()()()()())))()()(()()())()))"));
    ExampleRunner.eq(36, 0, new MissingParentheses().countCorrections("(((()())()()))(()())((((())))()((())()))(())(()())"));
    ExampleRunner.eq(37, 2, new MissingParentheses().countCorrections("((((((((()))((())()(((((())))))((((((())))))))))))"));
    ExampleRunner.eq(38, 2, new MissingParentheses().countCorrections("(((())()()((((()()())(()))()()()()()(())())((())))"));
    ExampleRunner.eq(39, 6, new MissingParentheses().countCorrections("())(())))((((((((())())()(((())((()()(())())))))))"));
    ExampleRunner.eq(40, 2, new MissingParentheses().countCorrections("((((()))((())()))(((((()())()))(((((())))))((())))"));
    ExampleRunner.eq(41, 2, new MissingParentheses().countCorrections("((()()(())(()()()()()()()(())())())())))"));
    ExampleRunner.eq(42, 2, new MissingParentheses().countCorrections("(()(())(())))((()))(()(()(()))"));
    ExampleRunner.eq(43, 2, new MissingParentheses().countCorrections("(((()))))(()((()))))"));
    ExampleRunner.eq(44, 0, new MissingParentheses().countCorrections("()(()())((()))((()()()(())))((()))()(()())()()(())"));
    ExampleRunner.eq(45, 0, new MissingParentheses().countCorrections("((()(())()(()()())(((())()(()()(()((()))())))))())"));
    ExampleRunner.eq(46, 0, new MissingParentheses().countCorrections("((())(()((((((((())())))))(()))))(((((())()())))))"));
    ExampleRunner.eq(47, 2, new MissingParentheses().countCorrections("())((()(()(())(()()))()()()()()()((())()()()()()))"));
    ExampleRunner.eq(48, 4, new MissingParentheses().countCorrections("(()()()(()))((((())))((()()()()(())))()))(())))())"));
    ExampleRunner.eq(49, 4, new MissingParentheses().countCorrections("(((((((((())))()))()))))((((((((()))())())))))))))"));
    ExampleRunner.eq(50, 0, new MissingParentheses().countCorrections("((((()))())((()())))"));
    ExampleRunner.eq(51, 0, new MissingParentheses().countCorrections("()(((((((()))))(((()))(())))))"));
    ExampleRunner.eq(52, 2, new MissingParentheses().countCorrections("()(()((())))))(()())"));
    ExampleRunner.eq(53, 4, new MissingParentheses().countCorrections("((())())()())(())((()()()())(((())))()))((())(()()"));
    ExampleRunner.eq(54, 6, new MissingParentheses().countCorrections("(())((())()()))()()))())()())()())()()()()()()()()"));
    ExampleRunner.eq(55, 4, new MissingParentheses().countCorrections("(()()()())((()(()))()())())()()()()()())((()()()()"));
    ExampleRunner.eq(56, 2, new MissingParentheses().countCorrections("((((()()()(()))(((()))()(()())(())))(())))(())()))"));
    ExampleRunner.eq(57, 4, new MissingParentheses().countCorrections("(()))(())(())())((()(()())())(())(()()()())()()(()"));
    ExampleRunner.eq(58, 4, new MissingParentheses().countCorrections("((((((()))))))(((())))(()(((()))((((()()()))))((()"));
    ExampleRunner.eq(59, 6, new MissingParentheses().countCorrections("(((())((((()(()()())))()()())()((()(())(())(((()))"));
    ExampleRunner.eq(60, 5, new MissingParentheses().countCorrections("(((()))())()()(()))())(()())()(()))((())))()()())"));
    ExampleRunner.eq(61, 1, new MissingParentheses().countCorrections("(((((((())))()))))()(()(()((())(((((())))(())))))"));
    ExampleRunner.eq(62, 9, new MissingParentheses().countCorrections("(((()))(()(())((((()(()((())(((()))(((())((()))))"));
    ExampleRunner.eq(63, 5, new MissingParentheses().countCorrections("(((())))((())(()))((()()()(()(((()()()())))(((())"));
    ExampleRunner.eq(64, 3, new MissingParentheses().countCorrections(")()())(((()))()(()(()()())((())()(())((()))))(())"));
    ExampleRunner.eq(65, 5, new MissingParentheses().countCorrections("(())(((()())(())()((())))()(()())(())()())())))))"));
    ExampleRunner.eq(66, 3, new MissingParentheses().countCorrections("((())()))((())((((((())(((()))))))(()(()())))))))"));
    ExampleRunner.eq(67, 5, new MissingParentheses().countCorrections("()()())((((()())))(()()))((()(()(()(())()(())()()"));
    ExampleRunner.eq(68, 50, new MissingParentheses().countCorrections("(((((((((((((((((((((((((((((((((((((((((((((((((("));
    ExampleRunner.eq(69, 50, new MissingParentheses().countCorrections("))))))))))))))))))))))))))))))))))))))))))))))))))"));
    ExampleRunner.eq(70, 50, new MissingParentheses().countCorrections(")))))))))))))))))))))))))((((((((((((((((((((((((("));
    ExampleRunner.eq(71, 6, new MissingParentheses().countCorrections(")))((("));
    ExampleRunner.eq(72, 2, new MissingParentheses().countCorrections(")("));
    ExampleRunner.eq(73, 2, new MissingParentheses().countCorrections("())("));
    ExampleRunner.eq(74, 5, new MissingParentheses().countCorrections(")())(()(("));
    ExampleRunner.eq(75, 10, new MissingParentheses().countCorrections(")))))((((("));
    ExampleRunner.eq(76, 4, new MissingParentheses().countCorrections("()()((()())()((()()()()))))()()((()())()((()()()()"));
    ExampleRunner.eq(77, 15, new MissingParentheses().countCorrections(")())))(((((()((((())((("));
    ExampleRunner.eq(78, 2, new MissingParentheses().countCorrections(")(())("));
    ExampleRunner.eq(79, 8, new MissingParentheses().countCorrections("()))))((((()"));
    ExampleRunner.eq(80, 4, new MissingParentheses().countCorrections("()))((()"));
    ExampleRunner.eq(81, 4, new MissingParentheses().countCorrections("))(("));
    ExampleRunner.eq(82, 13, new MissingParentheses().countCorrections("()))))))((())(((((()()("));
    ExampleRunner.eq(83, 3, new MissingParentheses().countCorrections(")(("));
    ExampleRunner.eq(84, 6, new MissingParentheses().countCorrections(")()))((()("));
    ExampleRunner.eq(85, 7, new MissingParentheses().countCorrections("))))(((()"));
    ExampleRunner.eq(86, 10, new MissingParentheses().countCorrections("())(())((()))))()((())))()())())())()()()((("));
    ExampleRunner.eq(87, 11, new MissingParentheses().countCorrections("))())))(((((("));
    ExampleRunner.eq(88, 3, new MissingParentheses().countCorrections("(()())))(()"));
    ExampleRunner.eq(89, 3, new MissingParentheses().countCorrections("((("));
    ExampleRunner.eq(90, 3, new MissingParentheses().countCorrections("))("));
    ExampleRunner.eq(91, 8, new MissingParentheses().countCorrections("))))))(("));
    ExampleRunner.eq(92, 7, new MissingParentheses().countCorrections("())))(((("));
    ExampleRunner.eq(93, 4, new MissingParentheses().countCorrections("())))("));
    ExampleRunner.eq(94, 2, new MissingParentheses().countCorrections("(()))("));
    ExampleRunner.eq(95, 5, new MissingParentheses().countCorrections("))))(())(()"));
    ExampleRunner.eq(96, 4, new MissingParentheses().countCorrections(")))()()("));
    ExampleRunner.eq(97, 45, new MissingParentheses().countCorrections("))))))))))))))))))))()))((((((((((()((((((((((((("));
    ExampleRunner.eq(98, 3, new MissingParentheses().countCorrections("()))("));
    ExampleRunner.eq(99, 5, new MissingParentheses().countCorrections(")))(("));
    ExampleRunner.eq(100, 2, new MissingParentheses().countCorrections(")()()()("));
    ExampleRunner.eq(101, 6, new MissingParentheses().countCorrections(")))()((("));
    ExampleRunner.eq(102, 10, new MissingParentheses().countCorrections("((((())))))))))((((("));
    ExampleRunner.eq(103, 4, new MissingParentheses().countCorrections(")((("));
    ExampleRunner.eq(104, 8, new MissingParentheses().countCorrections("))))(())((((()"));
    ExampleRunner.eq(105, 8, new MissingParentheses().countCorrections("))))(((("));
    ExampleRunner.eq(106, 1, new MissingParentheses().countCorrections(")"));
    ExampleRunner.eq(107, 2, new MissingParentheses().countCorrections(")()("));
    ExampleRunner.eq(108, 9, new MissingParentheses().countCorrections(")))))))((())()(((())))()()("));
    ExampleRunner.eq(109, 2, new MissingParentheses().countCorrections("())()("));
    ExampleRunner.eq(110, 2, new MissingParentheses().countCorrections("))"));
    ExampleRunner.eq(111, 9, new MissingParentheses().countCorrections("(())))(()))(((((((())"));
    ExampleRunner.eq(112, 14, new MissingParentheses().countCorrections("))))(((((((((("));
    ExampleRunner.eq(113, 2, new MissingParentheses().countCorrections("(()))((())"));
    ExampleRunner.eq(114, 1, new MissingParentheses().countCorrections("("));
    ExampleRunner.eq(115, 3, new MissingParentheses().countCorrections(")((()"));
    ExampleRunner.eq(116, 15, new MissingParentheses().countCorrections(")))))))))(())))(((("));
    ExampleRunner.eq(117, 3, new MissingParentheses().countCorrections(")())("));
    ExampleRunner.eq(118, 1, new MissingParentheses().countCorrections("())"));
    ExampleRunner.eq(119, 5, new MissingParentheses().countCorrections("))((("));
    ExampleRunner.eq(120, 4, new MissingParentheses().countCorrections(")(()((((()))))))()()(()(()(())()()()))())("));
    ExampleRunner.eq(121, 2, new MissingParentheses().countCorrections("())(()"));
    ExampleRunner.eq(122, 4, new MissingParentheses().countCorrections("))))"));
    ExampleRunner.eq(123, 34, new MissingParentheses().countCorrections("))))))))))))))))))((()))()(())(())(((((((((((((((("));
    ExampleRunner.eq(124, 20, new MissingParentheses().countCorrections("(((((((((((((((((((("));
    ExampleRunner.eq(125, 12, new MissingParentheses().countCorrections("))))))(((((("));
  }
}
