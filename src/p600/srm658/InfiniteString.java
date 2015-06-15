package p600.srm658;

import utils.ExampleRunner;

/**
 * Created by smalex on 15/06/15.
 */
public class InfiniteString {
  public String equal(String s, String t) {
    return findRepeat(t).equals(findRepeat(s)) ? "Equal" : "Not equal";
  }

  private String findRepeat(String s) {
    StringBuilder sb = new StringBuilder();
    for (int len = 1; len < s.length(); len++) {
      sb.delete(0, sb.length());
      if (s.length() % len == 0) {
        String sub = s.substring(0, len);
        final int cnt = s.length() / len;
        for (int j = 1; j <= cnt; j++) {
          sb.append(sub);
        }
        if (sb.toString().equals(s)) {
          return sub;
        }
      }
    }
    return s;
  }

  private String findRepeat2(String s) {
    for (int len = 1; len < s.length(); len++) {
      if (s.length() % len == 0) {
        String sub = s.substring(0, len);
        for (int i = 0; i + len <= s.length(); i += len) {
          final String substring = s.substring(i, i + len);
          if (!substring.equals(sub)) {
            sub = null;
            break;
          }
        }
        if (sub != null) {
          return sub;
        }
      }
    }
    return s;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, "Equal", new InfiniteString().equal("ab", "abab"));
    ExampleRunner.eq(2, "Not equal", new InfiniteString().equal("abab", "aba"));
    ExampleRunner.eq(3, "Equal", new InfiniteString().equal("aaaaa", "aaaaaa"));
    ExampleRunner.eq(4, "Equal", new InfiniteString().equal("ababab", "abab"));
    ExampleRunner.eq(5, "Not equal", new InfiniteString().equal("a", "z"));
    ExampleRunner.eq(6, "Equal", new InfiniteString().equal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
    ExampleRunner.eq(7, "Equal", new InfiniteString().equal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a"));
    ExampleRunner.eq(8, "Not equal", new InfiniteString().equal("abc", "bca"));
    ExampleRunner.eq(9, "Not equal", new InfiniteString().equal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", "a"));
    ExampleRunner.eq(10, "Equal", new InfiniteString().equal("afasfasfaaafsafasfaasdafasfafsaf", "afasfasfaaafsafasfaasdafasfafsaf"));
    ExampleRunner.eq(11, "Equal", new InfiniteString().equal("fjskflaksfjskflaksfjskflaksfjskflaksfjskflaks", "fjskflaksfjskflaksfjskflaks"));
    ExampleRunner.eq(12, "Not equal", new InfiniteString().equal("ffjskflaksfjskflaksfjskflaksjskflaks", "fjskflaksfjfjskflaksskflaks"));
    ExampleRunner.eq(13, "Equal", new InfiniteString().equal("abababababababababababababababababababab", "ababababababababababab"));
    ExampleRunner.eq(14, "Not equal", new InfiniteString().equal("ababababababababababababababababa", "abababababababababababababab"));
    ExampleRunner.eq(15, "Equal", new InfiniteString().equal("a", "aa"));
    ExampleRunner.eq(16, "Not equal", new InfiniteString().equal("aba", "bab"));
    ExampleRunner.eq(17, "Equal", new InfiniteString().equal("aaaaa", "aaa"));
    ExampleRunner.eq(18, "Equal", new InfiniteString().equal("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabc", "abcabcabcabcabcabcabcabcabc"));
    ExampleRunner.eq(19, "Equal", new InfiniteString().equal("abc", "abcabcabcabcabcabcabcabcabc"));
    ExampleRunner.eq(20, "Not equal", new InfiniteString().equal("aba", "ab"));
    ExampleRunner.eq(21, "Not equal", new InfiniteString().equal("aaa", "aaaab"));
    ExampleRunner.eq(22, "Not equal", new InfiniteString().equal("abcab", "abc"));
    ExampleRunner.eq(23, "Not equal", new InfiniteString().equal("abcd", "zzzz"));
    ExampleRunner.eq(24, "Not equal", new InfiniteString().equal("abc", "abca"));
    ExampleRunner.eq(25, "Not equal", new InfiniteString().equal("abba", "abbaabb"));
    ExampleRunner.eq(26, "Not equal", new InfiniteString().equal("aabba", "a"));
    ExampleRunner.eq(27, "Not equal", new InfiniteString().equal("abcdabc", "abcd"));
    ExampleRunner.eq(28, "Not equal", new InfiniteString().equal("abc", "abcab"));
    ExampleRunner.eq(29, "Equal", new InfiniteString().equal("a", "a"));
    ExampleRunner.eq(30, "Not equal", new InfiniteString().equal("abcabcabcabcabcd", "abc"));
    ExampleRunner.eq(31, "Not equal", new InfiniteString().equal("ababa", "ab"));
    ExampleRunner.eq(32, "Not equal", new InfiniteString().equal("aab", "aa"));
    ExampleRunner.eq(33, "Not equal", new InfiniteString().equal("abc", "abcabca"));
    ExampleRunner.eq(34, "Not equal", new InfiniteString().equal("ababaaaa", "ab"));
    ExampleRunner.eq(35, "Not equal", new InfiniteString().equal("ab", "ababcb"));
    ExampleRunner.eq(36, "Not equal", new InfiniteString().equal("bbbbbbd", "b"));
    ExampleRunner.eq(37, "Not equal", new InfiniteString().equal("aaaaaab", "aa"));
    ExampleRunner.eq(38, "Not equal", new InfiniteString().equal("abaa", "aba"));
    ExampleRunner.eq(39, "Not equal", new InfiniteString().equal("bcabc", "bca"));
    ExampleRunner.eq(40, "Not equal", new InfiniteString().equal("a", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"));
    ExampleRunner.eq(41, "Not equal", new InfiniteString().equal("aaaaab", "aa"));
    ExampleRunner.eq(42, "Not equal", new InfiniteString().equal("abcaba", "abc"));
    ExampleRunner.eq(43, "Not equal", new InfiniteString().equal("abcabcd", "abc"));
    ExampleRunner.eq(44, "Not equal", new InfiniteString().equal("abca", "abc"));
    ExampleRunner.eq(45, "Not equal", new InfiniteString().equal("ab", "ababf"));
    ExampleRunner.eq(46, "Not equal", new InfiniteString().equal("ab", "ababababc"));
    ExampleRunner.eq(47, "Not equal", new InfiniteString().equal("abcdef", "abcdee"));
    ExampleRunner.eq(48, "Not equal", new InfiniteString().equal("aaabbbaaa", "aaabbb"));
    ExampleRunner.eq(49, "Not equal", new InfiniteString().equal("abab", "abababa"));
    ExampleRunner.eq(50, "Equal", new InfiniteString().equal("a", "aaaaa"));
    ExampleRunner.eq(51, "Not equal", new InfiniteString().equal("a", "aaaaaaab"));
    ExampleRunner.eq(52, "Not equal", new InfiniteString().equal("aaa", "aaaaaac"));
    ExampleRunner.eq(53, "Not equal", new InfiniteString().equal("aab", "aabaaab"));
    ExampleRunner.eq(54, "Not equal", new InfiniteString().equal("abcd", "abcdab"));
    ExampleRunner.eq(55, "Not equal", new InfiniteString().equal("ababcd", "ab"));
    ExampleRunner.eq(56, "Not equal", new InfiniteString().equal("a", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"));
    ExampleRunner.eq(57, "Not equal", new InfiniteString().equal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaba"));
    ExampleRunner.eq(58, "Not equal", new InfiniteString().equal("ab", "ababa"));
    ExampleRunner.eq(59, "Not equal", new InfiniteString().equal("abcabcab", "abcabc"));
    ExampleRunner.eq(60, "Not equal", new InfiniteString().equal("abcabcabcd", "abc"));
    ExampleRunner.eq(61, "Not equal", new InfiniteString().equal("abcdab", "abcd"));
    ExampleRunner.eq(62, "Equal", new InfiniteString().equal("a", "aaa"));
    ExampleRunner.eq(63, "Not equal", new InfiniteString().equal("aac", "aaca"));
    ExampleRunner.eq(64, "Equal", new InfiniteString().equal("aa", "aaaaaaaa"));
    ExampleRunner.eq(65, "Not equal", new InfiniteString().equal("dbdbbbbbd", "db"));
    ExampleRunner.eq(66, "Equal", new InfiniteString().equal("aba", "aba"));
    ExampleRunner.eq(67, "Not equal", new InfiniteString().equal("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc", "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcab"));
    ExampleRunner.eq(68, "Not equal", new InfiniteString().equal("ababababa", "abab"));
    ExampleRunner.eq(69, "Not equal", new InfiniteString().equal("aabb", "aabba"));
    ExampleRunner.eq(70, "Not equal", new InfiniteString().equal("vedvv", "vedv"));
    ExampleRunner.eq(71, "Not equal", new InfiniteString().equal("a", "aaaaaaaaaaaaaaaaaaaab"));
    ExampleRunner.eq(72, "Not equal", new InfiniteString().equal("abcdabcdab", "abcd"));
    ExampleRunner.eq(73, "Not equal", new InfiniteString().equal("caacaaa", "caacaaac"));
    ExampleRunner.eq(74, "Not equal", new InfiniteString().equal("aba", "abaabaab"));
    ExampleRunner.eq(75, "Not equal", new InfiniteString().equal("aabba", "aabb"));
    ExampleRunner.eq(76, "Not equal", new InfiniteString().equal("abab", "bab"));
    ExampleRunner.eq(77, "Not equal", new InfiniteString().equal("abcdddda", "aabbba"));
    ExampleRunner.eq(78, "Not equal", new InfiniteString().equal("a", "ab"));
    ExampleRunner.eq(79, "Not equal", new InfiniteString().equal("abacaba", "abac"));
  }
}
