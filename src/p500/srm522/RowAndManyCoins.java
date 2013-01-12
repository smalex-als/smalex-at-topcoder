package p500.srm522;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 10/25/11
 * Time: 9:31 PM
 */
public class RowAndManyCoins {
  public String getWinner(String cells) {
    return cells.startsWith("A") || cells.endsWith("A") ? "Alice" : "Bob";
  }

  public static void main(String[] args) {

    ExampleRunner.eq(1, "Alice", new RowAndManyCoins().getWinner("ABBB"));
    ExampleRunner.eq(2, "Bob", new RowAndManyCoins().getWinner("BBBB"));
    ExampleRunner.eq(3, "Alice", new RowAndManyCoins().getWinner("BA"));
    ExampleRunner.eq(4, "Bob", new RowAndManyCoins().getWinner("BABBABBB"));
    ExampleRunner.eq(5, "Alice", new RowAndManyCoins().getWinner("ABABBBABAABBAA"));
    ExampleRunner.eq(6, "Bob", new RowAndManyCoins().getWinner("BBBAAABBAAABBB"));
    ExampleRunner.eq(7, "Alice", new RowAndManyCoins().getWinner("AA"));
    ExampleRunner.eq(8, "Alice", new RowAndManyCoins().getWinner("BA"));
    ExampleRunner.eq(9, "Alice", new RowAndManyCoins().getWinner("AB"));
    ExampleRunner.eq(10, "Bob", new RowAndManyCoins().getWinner("BB"));
    ExampleRunner.eq(11, "Alice", new RowAndManyCoins().getWinner("AAA"));
    ExampleRunner.eq(12, "Alice", new RowAndManyCoins().getWinner("BAA"));
    ExampleRunner.eq(13, "Alice", new RowAndManyCoins().getWinner("ABA"));
    ExampleRunner.eq(14, "Alice", new RowAndManyCoins().getWinner("BBA"));
    ExampleRunner.eq(15, "Alice", new RowAndManyCoins().getWinner("AAB"));
    ExampleRunner.eq(16, "Bob", new RowAndManyCoins().getWinner("BAB"));
    ExampleRunner.eq(17, "Alice", new RowAndManyCoins().getWinner("ABB"));
    ExampleRunner.eq(18, "Bob", new RowAndManyCoins().getWinner("BBB"));
    ExampleRunner.eq(19, "Alice", new RowAndManyCoins().getWinner("AAAA"));
    ExampleRunner.eq(20, "Alice", new RowAndManyCoins().getWinner("BAAA"));
    ExampleRunner.eq(21, "Alice", new RowAndManyCoins().getWinner("ABAA"));
    ExampleRunner.eq(22, "Alice", new RowAndManyCoins().getWinner("BBAA"));
    ExampleRunner.eq(23, "Alice", new RowAndManyCoins().getWinner("AABA"));
    ExampleRunner.eq(24, "Alice", new RowAndManyCoins().getWinner("BABA"));
    ExampleRunner.eq(25, "Alice", new RowAndManyCoins().getWinner("ABBA"));
    ExampleRunner.eq(26, "Alice", new RowAndManyCoins().getWinner("BBBA"));
    ExampleRunner.eq(27, "Alice", new RowAndManyCoins().getWinner("AAAB"));
    ExampleRunner.eq(28, "Bob", new RowAndManyCoins().getWinner("BAAB"));
    ExampleRunner.eq(29, "Alice", new RowAndManyCoins().getWinner("ABAB"));
    ExampleRunner.eq(30, "Bob", new RowAndManyCoins().getWinner("BBAB"));
    ExampleRunner.eq(31, "Alice", new RowAndManyCoins().getWinner("AABB"));
    ExampleRunner.eq(32, "Bob", new RowAndManyCoins().getWinner("BABB"));
    ExampleRunner.eq(33, "Alice", new RowAndManyCoins().getWinner("ABBB"));
    ExampleRunner.eq(34, "Bob", new RowAndManyCoins().getWinner("BBBB"));
    ExampleRunner.eq(35, "Alice", new RowAndManyCoins().getWinner("ABBAAABBBBABBABAAAAABBBA"));
    ExampleRunner.eq(36, "Alice", new RowAndManyCoins().getWinner("ABBAAABBBBABBABAAAAABBBB"));
    ExampleRunner.eq(37, "Alice", new RowAndManyCoins().getWinner("BBBAAABBBBABBABAAAAABBBA"));
    ExampleRunner.eq(38, "Bob", new RowAndManyCoins().getWinner("BBBAAABBBBABBABAAAAABBBB"));
    ExampleRunner.eq(39, "Alice", new RowAndManyCoins().getWinner("AAABAAABABBABBBBBAABBABABAABABBBBAAAAA"));
    ExampleRunner.eq(40, "Alice", new RowAndManyCoins().getWinner("AAABAAABABBABBBBBAABBABABAABABBBBAAAAB"));
    ExampleRunner.eq(41, "Alice", new RowAndManyCoins().getWinner("BAABAAABABBABBBBBAABBABABAABABBBBAAAAA"));
    ExampleRunner.eq(42, "Bob", new RowAndManyCoins().getWinner("BAABAAABABBABBBBBAABBABABAABABBBBAAAAB"));
    ExampleRunner.eq(43, "Alice", new RowAndManyCoins().getWinner("AAAABBBAAAAAABBBBBAA"));
    ExampleRunner.eq(44, "Alice", new RowAndManyCoins().getWinner("AAAABBBAAAAAABBBBBAB"));
    ExampleRunner.eq(45, "Alice", new RowAndManyCoins().getWinner("BAAABBBAAAAAABBBBBAA"));
    ExampleRunner.eq(46, "Bob", new RowAndManyCoins().getWinner("BAAABBBAAAAAABBBBBAB"));
    ExampleRunner.eq(47, "Alice", new RowAndManyCoins().getWinner("ABAABABABABBBAABA"));
    ExampleRunner.eq(48, "Alice", new RowAndManyCoins().getWinner("ABAABABABABBBAABB"));
    ExampleRunner.eq(49, "Alice", new RowAndManyCoins().getWinner("BBAABABABABBBAABA"));
    ExampleRunner.eq(50, "Bob", new RowAndManyCoins().getWinner("BBAABABABABBBAABB"));
    ExampleRunner.eq(51, "Alice", new RowAndManyCoins().getWinner("AABBBBBABBABBABABAABBAABBABAAA"));
    ExampleRunner.eq(52, "Alice", new RowAndManyCoins().getWinner("AABBBBBABBABBABABAABBAABBABAAB"));
    ExampleRunner.eq(53, "Alice", new RowAndManyCoins().getWinner("BABBBBBABBABBABABAABBAABBABAAA"));
    ExampleRunner.eq(54, "Bob", new RowAndManyCoins().getWinner("BABBBBBABBABBABABAABBAABBABAAB"));
    ExampleRunner.eq(55, "Alice", new RowAndManyCoins().getWinner("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    ExampleRunner.eq(56, "Alice", new RowAndManyCoins().getWinner("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB"));
    ExampleRunner.eq(57, "Alice", new RowAndManyCoins().getWinner("BAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    ExampleRunner.eq(58, "Bob", new RowAndManyCoins().getWinner("BAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB"));
    ExampleRunner.eq(59, "Alice", new RowAndManyCoins().getWinner("ABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBA"));
    ExampleRunner.eq(60, "Alice", new RowAndManyCoins().getWinner("ABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB"));
    ExampleRunner.eq(61, "Alice", new RowAndManyCoins().getWinner("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBA"));
    ExampleRunner.eq(62, "Bob", new RowAndManyCoins().getWinner("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB"));
    ExampleRunner.eq(63, "Alice", new RowAndManyCoins().getWinner("ABABABABABABABABABABABABABABABABABABABABABABABABA"));
    ExampleRunner.eq(64, "Alice", new RowAndManyCoins().getWinner("ABABABABABABABABABABABABABABABABABABABABABABABABB"));
    ExampleRunner.eq(65, "Alice", new RowAndManyCoins().getWinner("BBABABABABABABABABABABABABABABABABABABABABABABABA"));
    ExampleRunner.eq(66, "Bob", new RowAndManyCoins().getWinner("BBABABABABABABABABABABABABABABABABABABABABABABABB"));
    ExampleRunner.eq(67, "Alice", new RowAndManyCoins().getWinner("AABABABABABABABABABABABABABABABABABABABABABABABAA"));
    ExampleRunner.eq(68, "Alice", new RowAndManyCoins().getWinner("AABABABABABABABABABABABABABABABABABABABABABABABAB"));
    ExampleRunner.eq(69, "Alice", new RowAndManyCoins().getWinner("BABABABABABABABABABABABABABABABABABABABABABABABAA"));
    ExampleRunner.eq(70, "Bob", new RowAndManyCoins().getWinner("BABABABABABABABABABABABABABABABABABABABABABABABAB"));
    ExampleRunner.eq(71, "Alice", new RowAndManyCoins().getWinner("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    ExampleRunner.eq(72, "Alice", new RowAndManyCoins().getWinner("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB"));
    ExampleRunner.eq(73, "Alice", new RowAndManyCoins().getWinner("BAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"));
    ExampleRunner.eq(74, "Bob", new RowAndManyCoins().getWinner("BAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB"));
    ExampleRunner.eq(75, "Alice", new RowAndManyCoins().getWinner("AAAAAAAAAAAAAAAAAAAAAAAAAABAAAAAAAAAAAAAAAAAAAAAAA"));
    ExampleRunner.eq(76, "Alice", new RowAndManyCoins().getWinner("AAAAAAAAAAAAAAAAAAAAAAAAAABAAAAAAAAAAAAAAAAAAAAAAB"));
    ExampleRunner.eq(77, "Alice", new RowAndManyCoins().getWinner("BAAAAAAAAAAAAAAAAAAAAAAAAABAAAAAAAAAAAAAAAAAAAAAAA"));
    ExampleRunner.eq(78, "Bob", new RowAndManyCoins().getWinner("BAAAAAAAAAAAAAAAAAAAAAAAAABAAAAAAAAAAAAAAAAAAAAAAB"));
    ExampleRunner.eq(79, "Alice", new RowAndManyCoins().getWinner("ABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBA"));
    ExampleRunner.eq(80, "Alice", new RowAndManyCoins().getWinner("ABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB"));
    ExampleRunner.eq(81, "Alice", new RowAndManyCoins().getWinner("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBA"));
    ExampleRunner.eq(82, "Bob", new RowAndManyCoins().getWinner("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB"));
    ExampleRunner.eq(83, "Alice", new RowAndManyCoins().getWinner("ABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBABA"));
    ExampleRunner.eq(84, "Alice", new RowAndManyCoins().getWinner("ABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBABB"));
    ExampleRunner.eq(85, "Alice", new RowAndManyCoins().getWinner("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBABA"));
    ExampleRunner.eq(86, "Bob", new RowAndManyCoins().getWinner("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBABB"));
    ExampleRunner.eq(87, "Alice", new RowAndManyCoins().getWinner("ABABABABABABABABABABABABABABABABABABABABABABABABAA"));
    ExampleRunner.eq(88, "Alice", new RowAndManyCoins().getWinner("ABABABABABABABABABABABABABABABABABABABABABABABABAB"));
    ExampleRunner.eq(89, "Alice", new RowAndManyCoins().getWinner("BBABABABABABABABABABABABABABABABABABABABABABABABAA"));
    ExampleRunner.eq(90, "Bob", new RowAndManyCoins().getWinner("BBABABABABABABABABABABABABABABABABABABABABABABABAB"));
    ExampleRunner.eq(91, "Alice", new RowAndManyCoins().getWinner("AABABABABABABABABABABABABABABABABABABABABABABABABA"));
    ExampleRunner.eq(92, "Alice", new RowAndManyCoins().getWinner("AABABABABABABABABABABABABABABABABABABABABABABABABB"));
    ExampleRunner.eq(93, "Alice", new RowAndManyCoins().getWinner("BABABABABABABABABABABABABABABABABABABABABABABABABA"));
    ExampleRunner.eq(94, "Bob", new RowAndManyCoins().getWinner("BABABABABABABABABABABABABABABABABABABABABABABABABB"));
    ExampleRunner.eq(95, "Alice", new RowAndManyCoins().getWinner("BBBABABBBBBBBA"));
    ExampleRunner.eq(96, "Bob", new RowAndManyCoins().getWinner("BABAB"));
    ExampleRunner.eq(97, "Alice", new RowAndManyCoins().getWinner("BBBBBABA"));
    ExampleRunner.eq(98, "Alice", new RowAndManyCoins().getWinner("BABABABA"));
    ExampleRunner.eq(99, "Alice", new RowAndManyCoins().getWinner("ABBBBA"));
    ExampleRunner.eq(100, "Alice", new RowAndManyCoins().getWinner("BAAAAAAAAAAAAAAAAAAAAAAAAA"));
    ExampleRunner.eq(101, "Bob", new RowAndManyCoins().getWinner("BABABAB"));
    ExampleRunner.eq(102, "Bob", new RowAndManyCoins().getWinner("BAABAAB"));
  }
}
