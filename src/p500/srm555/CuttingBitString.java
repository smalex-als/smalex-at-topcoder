package p500.srm555;

import utils.ExampleRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smalex on 11/06/15.
 */
public class CuttingBitString {
  private int ans = Integer.MAX_VALUE;
  private List<String> fives;

  public int getmin(String S) {
    final char[] arr = S.toCharArray();
    fives = new ArrayList<String>();
    long num = 1L;
    while (true) {
      final String e = Long.toBinaryString(num);
      if (e.length() > 50) {
        break;
      }
      fives.add(e);
      num *= 5;
    }
    dfs(arr, 0, 0);
    return ans == Integer.MAX_VALUE ? -1 : ans;
  }

  private void dfs(char[] arr, int x, int cost) {
    if (x == arr.length) {
      ans = Math.min(cost, ans);
      return;
    }
    for (int i = 0; i < fives.size(); i++) {
      String five = fives.get(i);
      if (arr.length - x < five.length()) {
        break;
      }
      if (matched(arr, x, five)) {
        dfs(arr, x + five.length(), cost + 1);
      }
    }
  }

  private boolean matched(char[] arr, int x, String five) {
    for (int i = 0; i < five.length(); i++) {
      if (arr[x + i] != five.charAt(i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 3, new CuttingBitString().getmin("101101101"));
    ExampleRunner.eq(2, 1, new CuttingBitString().getmin("1111101"));
    ExampleRunner.eq(3, -1, new CuttingBitString().getmin("00000"));
    ExampleRunner.eq(4, 3, new CuttingBitString().getmin("110011011"));
    ExampleRunner.eq(5, -1, new CuttingBitString().getmin("1000101011"));
    ExampleRunner.eq(6, 5, new CuttingBitString().getmin("111011100110101100101110111"));
    ExampleRunner.eq(7, 1, new CuttingBitString().getmin("1101100011010111001001101011011100010111011110101"));
    ExampleRunner.eq(8, -1, new CuttingBitString().getmin("0101"));
    ExampleRunner.eq(9, -1, new CuttingBitString().getmin("1001"));
    ExampleRunner.eq(10, 50, new CuttingBitString().getmin("11111111111111111111111111111111111111111111111111"));
    ExampleRunner.eq(11, 4, new CuttingBitString().getmin("10111001110011"));
    ExampleRunner.eq(12, 7, new CuttingBitString().getmin("10011100011110011100111110100001001110011"));
    ExampleRunner.eq(13, 4, new CuttingBitString().getmin("10111110101111000011111010000100111110100001001101"));
    ExampleRunner.eq(14, 22, new CuttingBitString().getmin("11101111011011111101110011101101101111011101101111"));
    ExampleRunner.eq(15, 10, new CuttingBitString().getmin("11111101111111011111011101"));
    ExampleRunner.eq(16, 14, new CuttingBitString().getmin("1011111110111111011111101111111111101111110111"));
    ExampleRunner.eq(17, 8, new CuttingBitString().getmin("11111011111101111110111111011111101111110111111011"));
    ExampleRunner.eq(18, 20, new CuttingBitString().getmin("11111011111111101111111101111111101111110111111111"));
    ExampleRunner.eq(19, 20, new CuttingBitString().getmin("11111011111101111111011111101111111111111101111111"));
    ExampleRunner.eq(20, 2, new CuttingBitString().getmin("11001110001"));
    ExampleRunner.eq(21, 2, new CuttingBitString().getmin("110011000100101101"));
    ExampleRunner.eq(22, 2, new CuttingBitString().getmin("111110100001001"));
    ExampleRunner.eq(23, 5, new CuttingBitString().getmin("101111101"));
    ExampleRunner.eq(24, 6, new CuttingBitString().getmin("11001110001111101"));
    ExampleRunner.eq(25, -1, new CuttingBitString().getmin("0"));
    ExampleRunner.eq(26, 1, new CuttingBitString().getmin("1"));
    ExampleRunner.eq(27, -1, new CuttingBitString().getmin("00"));
    ExampleRunner.eq(28, -1, new CuttingBitString().getmin("10"));
    ExampleRunner.eq(29, -1, new CuttingBitString().getmin("01"));
    ExampleRunner.eq(30, 2, new CuttingBitString().getmin("11"));
    ExampleRunner.eq(31, -1, new CuttingBitString().getmin("000"));
    ExampleRunner.eq(32, -1, new CuttingBitString().getmin("100"));
    ExampleRunner.eq(33, -1, new CuttingBitString().getmin("010"));
    ExampleRunner.eq(34, -1, new CuttingBitString().getmin("110"));
    ExampleRunner.eq(35, -1, new CuttingBitString().getmin("001"));
    ExampleRunner.eq(36, 1, new CuttingBitString().getmin("101"));
    ExampleRunner.eq(37, -1, new CuttingBitString().getmin("011"));
    ExampleRunner.eq(38, 3, new CuttingBitString().getmin("111"));
    ExampleRunner.eq(39, -1, new CuttingBitString().getmin("00000000000000000000000000000000000000000000000000"));
    ExampleRunner.eq(40, 16, new CuttingBitString().getmin("101101101101101101101101101101101101101101101101"));
    ExampleRunner.eq(41, -1, new CuttingBitString().getmin("00010111001110100000101101001100010011111111100110"));
    ExampleRunner.eq(42, -1, new CuttingBitString().getmin("11101001011110011100110111100111000111000100001010"));
    ExampleRunner.eq(43, -1, new CuttingBitString().getmin("01010101001001100110001101101110111100111111001100"));
    ExampleRunner.eq(44, -1, new CuttingBitString().getmin("01000000100101011000001001011111111100100100100111"));
    ExampleRunner.eq(45, -1, new CuttingBitString().getmin("10001110000011011101010011010001011111010100000001"));
    ExampleRunner.eq(46, -1, new CuttingBitString().getmin("11110101100011101001011001110010110000"));
    ExampleRunner.eq(47, -1, new CuttingBitString().getmin("0101011001101011010111000100010"));
    ExampleRunner.eq(48, -1, new CuttingBitString().getmin("001001011000000011001011100001000111000"));
    ExampleRunner.eq(49, -1, new CuttingBitString().getmin("11001111010110010000110011100110011111001101"));
    ExampleRunner.eq(50, -1, new CuttingBitString().getmin("0011100"));
    ExampleRunner.eq(51, 1, new CuttingBitString().getmin("1"));
    ExampleRunner.eq(52, 1, new CuttingBitString().getmin("101"));
    ExampleRunner.eq(53, 1, new CuttingBitString().getmin("11001"));
    ExampleRunner.eq(54, 1, new CuttingBitString().getmin("1111101"));
    ExampleRunner.eq(55, 1, new CuttingBitString().getmin("1001110001"));
    ExampleRunner.eq(56, 1, new CuttingBitString().getmin("110000110101"));
    ExampleRunner.eq(57, 1, new CuttingBitString().getmin("11110100001001"));
    ExampleRunner.eq(58, 1, new CuttingBitString().getmin("10011000100101101"));
    ExampleRunner.eq(59, 1, new CuttingBitString().getmin("1011111010111100001"));
    ExampleRunner.eq(60, 1, new CuttingBitString().getmin("111011100110101100101"));
    ExampleRunner.eq(61, 1, new CuttingBitString().getmin("100101010000001011111001"));
    ExampleRunner.eq(62, 1, new CuttingBitString().getmin("10111010010000111011011101"));
    ExampleRunner.eq(63, 1, new CuttingBitString().getmin("1110100011010100101001010001"));
    ExampleRunner.eq(64, 1, new CuttingBitString().getmin("1001000110000100111001110010101"));
    ExampleRunner.eq(65, 1, new CuttingBitString().getmin("101101011110011000100000111101001"));
    ExampleRunner.eq(66, 1, new CuttingBitString().getmin("11100011010111111010100100110001101"));
    ExampleRunner.eq(67, 1, new CuttingBitString().getmin("10001110000110111100100110111111000001"));
    ExampleRunner.eq(68, 1, new CuttingBitString().getmin("1011000110100010101111000010111011000101"));
    ExampleRunner.eq(69, 1, new CuttingBitString().getmin("110111100000101101101011001110100111011001"));
    ExampleRunner.eq(70, 1, new CuttingBitString().getmin("100010101100011100100011000001001000100111101"));
    ExampleRunner.eq(71, 1, new CuttingBitString().getmin("10101101011110001110101111000101101011000110001"));
    ExampleRunner.eq(72, 1, new CuttingBitString().getmin("1101100011010111001001101011011100010111011110101"));
    ExampleRunner.eq(73, 16, new CuttingBitString().getmin("11110011100111011100111100110110110111100110111001"));
    ExampleRunner.eq(74, 7, new CuttingBitString().getmin("101110011100011001110001111110110011100011111101"));
    ExampleRunner.eq(75, 8, new CuttingBitString().getmin("11001110011111010000100110110111100111110100001001"));
    ExampleRunner.eq(76, 3, new CuttingBitString().getmin("1111010000100111110100001001110000110101"));
    ExampleRunner.eq(77, 4, new CuttingBitString().getmin("101111011100110101100101110011011111010111100001"));
    ExampleRunner.eq(78, 3, new CuttingBitString().getmin("111010001101010010100101000110011100011"));
    ExampleRunner.eq(79, 2, new CuttingBitString().getmin("11110100001001111011100110101100101"));
    ExampleRunner.eq(80, 3, new CuttingBitString().getmin("111101000010011001010100000010111110011"));
    ExampleRunner.eq(81, 5, new CuttingBitString().getmin("1111101101110100100001110110111011100110011100011"));
    ExampleRunner.eq(82, 1, new CuttingBitString().getmin("1001110001"));
    ExampleRunner.eq(83, 2, new CuttingBitString().getmin("11011110000010110110101100111010011101100111001"));
    ExampleRunner.eq(84, 12, new CuttingBitString().getmin("101110011100110110110110111001110011100110111001"));
    ExampleRunner.eq(85, 7, new CuttingBitString().getmin("11111011100111001100111000110011100011011001110001"));
    ExampleRunner.eq(86, 5, new CuttingBitString().getmin("1100110011100011111010000100110111110100001001"));
    ExampleRunner.eq(87, 3, new CuttingBitString().getmin("111110110111110101111000011001110001"));
    ExampleRunner.eq(88, 3, new CuttingBitString().getmin("101111011100110101100101100101010000001011111001"));
    ExampleRunner.eq(89, 2, new CuttingBitString().getmin("100110001001011011110100011010100101001010001"));
    ExampleRunner.eq(90, 2, new CuttingBitString().getmin("101101011110011000100000111101001101"));
    ExampleRunner.eq(91, 3, new CuttingBitString().getmin("111011100110101100101101101"));
    ExampleRunner.eq(92, 1, new CuttingBitString().getmin("1011111010111100001"));
    ExampleRunner.eq(93, 3, new CuttingBitString().getmin("10111001110111100000101101101011001110100111011001"));
    ExampleRunner.eq(94, 2, new CuttingBitString().getmin("10111010010000111011011101100101010000001011111001"));
    ExampleRunner.eq(95, -1, new CuttingBitString().getmin("11111111111111111111111111110"));
    ExampleRunner.eq(96, 29, new CuttingBitString().getmin("1011111011011111011011111011011111011011111011111"));
    ExampleRunner.eq(97, -1, new CuttingBitString().getmin("0011"));
    ExampleRunner.eq(98, -1, new CuttingBitString().getmin("00000000000000000000000001111111111111111111111111"));
    ExampleRunner.eq(99, 2, new CuttingBitString().getmin("11001000110000100111001110010101"));
    ExampleRunner.eq(100, 2, new CuttingBitString().getmin("10101101011110001110101111000101101011000110001101"));
    ExampleRunner.eq(101, 3, new CuttingBitString().getmin("1000111000011011110010011011111100000110111001"));
    ExampleRunner.eq(102, -1, new CuttingBitString().getmin("1010101"));
    ExampleRunner.eq(103, 4, new CuttingBitString().getmin("111110111111011111101101"));
    ExampleRunner.eq(104, -1, new CuttingBitString().getmin("1000000000000000000000000000000000000000000000000"));
    ExampleRunner.eq(105, -1, new CuttingBitString().getmin("000001111101"));
    ExampleRunner.eq(106, 4, new CuttingBitString().getmin("11010110101111000111010111100010110101100011000111"));
    ExampleRunner.eq(107, -1, new CuttingBitString().getmin("110111110101"));
    ExampleRunner.eq(108, 5, new CuttingBitString().getmin("11111011111010111100001"));
    ExampleRunner.eq(109, 2, new CuttingBitString().getmin("11011000110101110010011010110111000101110111101011"));
  }
}
