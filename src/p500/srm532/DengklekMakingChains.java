package p500.srm532;

import java.util.ArrayList;
import java.util.List;

import utils.ExampleRunner;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/9/12
 * Time: 11:19 AM
 */
public class DengklekMakingChains {
  class Chain {
    boolean whole;
    boolean left;
    boolean right;
    String str;

    public Chain(String str) {
      this.str = str;
      whole = !str.contains(".");
      left = !str.startsWith(".");
      right = !str.endsWith(".");
    }

    public int getWeight() {
      int result = 0;
      for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (c == '.') {
          continue;
        }
        result += c - '0';
      }
      return result;
    }


    @Override
    public String toString() {
      return "Chain{" +
          "str=" + str +
          ", left=" + left +
          ", right=" + right +
          '}';
    }
  }

  public int maxBeauty(String[] chains) {
    List<Chain> list = new ArrayList<Chain>();
    for (String chain : chains) {
      list.add(new Chain(chain));
    }

    int result = 0;
    for (Chain chain : list) {
      if (chain.whole) {
        result += chain.getWeight();
      }
    }

    int maxOne = 0;

    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < list.size(); j++) {
        Chain chainA = list.get(i);
        Chain chainB = list.get(j);
        if (i != j && !chainA.whole && !chainB.whole) {
          maxOne = Math.max(maxOne, getRight(chainA.str) + getLeft(chainB.str));
        }
      }
    }
    int maxTwo = 0;
    for (Chain chain : list) {
      if (!chain.whole) {
        maxTwo = Math.max(maxTwo, getLeft(chain.str));
        maxTwo = Math.max(maxTwo, getRight(chain.str));
      }
    }
    return Math.max(result + Math.max(maxOne, maxTwo), getAnotherCase(chains));
  }

  int getAnotherCase(String[] chains) {
    int result = 0;
    for (String chain : chains) {
      for (int j = 0; j < chain.length(); j++) {
        char c = chain.charAt(j);
        if (c != '.') {
          result = Math.max(result, c - '0');
        }
      }
    }
    return result;
  }

  private int getRight(String str) {
    int result = 0;
    for (int i = str.length() - 1; i >= 0; i--) {
      char c = str.charAt(i);
      if (c == '.') {
        break;
      }
      result += c - '0';
    }
    return result;
  }

  private int getLeft(String str) {
    int result = 0;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == '.') {
        break;
      }
      result += c - '0';
    }
    return result;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 19, new DengklekMakingChains().maxBeauty(new String[]{".15", "7..", "402", "..3"}));
    		ExampleRunner.eq(2, 36, new DengklekMakingChains().maxBeauty(new String[]{"..1", "7..", "567", "24.", "8..", "234"}));
    		ExampleRunner.eq(3, 0, new DengklekMakingChains().maxBeauty(new String[]{"...", "..."}));
    		ExampleRunner.eq(4, 28, new DengklekMakingChains().maxBeauty(new String[]{"16.", "9.8", ".24", "52.", "3.1", "532", "4.4", "111"}));
    		ExampleRunner.eq(5, 7, new DengklekMakingChains().maxBeauty(new String[]{"..1", "3..", "2..", ".7."}));
    		ExampleRunner.eq(6, 58, new DengklekMakingChains().maxBeauty(new String[]{"412", "..7", ".58", "7.8", "32.", "6..", "351", "3.9", "985", "...", ".46"}));
    		ExampleRunner.eq(7, 0, new DengklekMakingChains().maxBeauty(new String[]{"...", ".0."}));
    		ExampleRunner.eq(8, 4, new DengklekMakingChains().maxBeauty(new String[]{".4."}));
    		ExampleRunner.eq(9, 17, new DengklekMakingChains().maxBeauty(new String[]{"..9", "1.1", "2.2", "8.."}));
    		ExampleRunner.eq(10, 0, new DengklekMakingChains().maxBeauty(new String[]{"...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "...", "..."}));
    		ExampleRunner.eq(11, 0, new DengklekMakingChains().maxBeauty(new String[]{"000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000"}));
    		ExampleRunner.eq(12, 1350, new DengklekMakingChains().maxBeauty(new String[]{"999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999"}));
    		ExampleRunner.eq(13, 2, new DengklekMakingChains().maxBeauty(new String[]{"1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1", "1.1"}));
    		ExampleRunner.eq(14, 59, new DengklekMakingChains().maxBeauty(new String[]{"65.", "12.", ".68", "..2", ".82", "0.4", "..0", ".15", ".41", "4.7", ".1.", "1.1", "8.6", "4.5", "..6", "6.1", "811", "83.", "...", "...", "...", ".46", "8..", ".1.", "260", "7.3", "..4", "4..", "4..", "66.", "708", "6.."}));
    		ExampleRunner.eq(15, 18, new DengklekMakingChains().maxBeauty(new String[]{"3..", "90.", "..9", "30.", "7..", "5.4", "7.2", "9.0", ".6.", ".0.", ".42", "..1", "12.", "...", "..5", "..9", "..3"}));
    		ExampleRunner.eq(16, 54, new DengklekMakingChains().maxBeauty(new String[]{"663", "...", "..1", "67.", "355", ".0.", "5.1", ".32", "1..", "8.6", "..8", "..6", ".67", "...", "07.", "37.", "58.", ".2.", "..0", "60.", "3.6"}));
    		ExampleRunner.eq(17, 46, new DengklekMakingChains().maxBeauty(new String[]{"9..", ".81", ".48", "222", "694", "1.6"}));
    		ExampleRunner.eq(18, 96, new DengklekMakingChains().maxBeauty(new String[]{"..9", "...", "0.4", "32.", "6..", "6..", ".4.", "3..", ".81", "22.", "5.2", "21.", "890", ".53", "8..", "...", "..8", ".4.", "9..", "4.5", ".0.", ".6.", "738", "..5", "8.0", "5.1", "6..", "974", ".1.", "1..", ".8.", "1..", "749", "..1", "...", "..3", "...", "39.", "9.0", "0.."}));
    		ExampleRunner.eq(19, 66, new DengklekMakingChains().maxBeauty(new String[]{"2..", "131", ".77", "075", "...", "...", "..8", ".75", "523", "7.4", "4.2", "3.6", "9..", ".1.", ".97", "282", "61.", "3..", "9.1", "..3", "..7", ".4.", "...", "..1", "..1", "50.", ".80", "2.6", "3..", "83.", "..6", "6.3", ".03", "1..", ".3."}));
    		ExampleRunner.eq(20, 15, new DengklekMakingChains().maxBeauty(new String[]{"6.4", "...", "3.7", "..7", "8.."}));
    		ExampleRunner.eq(21, 39, new DengklekMakingChains().maxBeauty(new String[]{"89.", "431", "0.9", ".49", "42.", ".86", "07.", "...", "54.", "2..", "...", "7.1", "79.", "7.5"}));
    		ExampleRunner.eq(22, 70, new DengklekMakingChains().maxBeauty(new String[]{".6.", "636", "5.9", "..0", "...", ".9.", ".11", "...", "9.4", "5..", "503", "192", "7..", ".63", ".45", "652", "67."}));
    		ExampleRunner.eq(23, 36, new DengklekMakingChains().maxBeauty(new String[]{"59.", "8..", "...", ".26", "..1", ".3.", "25.", "6.7", "9..", "508", "85.", "..7", "4.4", ".0.", "..9"}));
    		ExampleRunner.eq(24, 32, new DengklekMakingChains().maxBeauty(new String[]{"..8", ".17", ".4.", "...", "8.2", "..2", "5.5", "..3", "77.", ".4.", "...", ".76", ".90", "...", ".82", ".2.", "..8", ".7.", ".95", "...", "3..", ".6.", "45.", "97.", "9.4", "4.9", "88.", "..3", ".5.", "101", "...", "9.1", "95."}));
    		ExampleRunner.eq(25, 24, new DengklekMakingChains().maxBeauty(new String[]{"9..", "8..", "8.1", ".39", ".09", "1.3", "...", "...", "3..", "..2", "...", "..4", "02.", "...", "..0", "1..", "..9", "1.8", "7..", ".9.", "1..", ".48", ".10", "93.", "0.7", ".44", "65.", "2.6", "...", "4.3", ".5."}));
    		ExampleRunner.eq(26, 37, new DengklekMakingChains().maxBeauty(new String[]{"4..", "244", "3.6", "193", ".4.", "8..", ".7.", "...", "...", "..5", "0.1"}));
    		ExampleRunner.eq(27, 73, new DengklekMakingChains().maxBeauty(new String[]{".36", "..5", "...", "..0", "83.", ".94", "95.", "..3", "72.", ".87", "9.5", "04.", ".10", "...", "12.", "50.", "62.", "..9", "...", "2.4", "..0", "..8", "0.0", "6.1", "799", "1.8", ".76", ".8.", "0..", ".3.", "..1", "08.", "9.9", "97.", "...", "359", "..6", "90."}));
    		ExampleRunner.eq(28, 108, new DengklekMakingChains().maxBeauty(new String[]{"3..", "588", ".51", "...", "541", "003", ".81", "3..", "165", "..9", "6.8", "2.3", ".68", "9..", ".10", "...", ".66", "723", ".8.", "6..", "61.", "303", "9.5", "8.2", "..7", "..1", "9.3", ".34", ".7.", "0..", "777"}));
    		ExampleRunner.eq(29, 35, new DengklekMakingChains().maxBeauty(new String[]{"79.", "..7", "..9", "8..", "4.5", "0.4", "811", "..6", "8..", "...", "..6", "3.0", "4.9"}));
    		ExampleRunner.eq(30, 6, new DengklekMakingChains().maxBeauty(new String[]{"3.6"}));
    		ExampleRunner.eq(31, 38, new DengklekMakingChains().maxBeauty(new String[]{".2.", "87.", ".94", "..7", ".28", ".29", "4..", "280", "..3", "2..", "...", "3.1", "7.8", ".66", "40.", "...", "6.."}));
    		ExampleRunner.eq(32, 30, new DengklekMakingChains().maxBeauty(new String[]{"741", "4..", "..5", ".9.", "4.3", "58."}));
    		ExampleRunner.eq(33, 42, new DengklekMakingChains().maxBeauty(new String[]{"9..", "...", "...", "3.7", "1..", "...", "998", ".5."}));
    		ExampleRunner.eq(34, 47, new DengklekMakingChains().maxBeauty(new String[]{"697", "..4", "4.5", "29.", ".86", "74.", ".90", "...", "...", "..0"}));
    		ExampleRunner.eq(35, 84, new DengklekMakingChains().maxBeauty(new String[]{"4..", ".3.", "140", "..0", ".4.", "..2", "64.", "011", "7.5", ".79", "3.7", "820", "7..", "..7", "...", ".36", ".8.", "168", "69.", ".41", ".0.", ".69", "0.8", "48.", "8..", "612", "6.8", "804", ".9.", "14.", "...", "8..", "9.3", "...", "2.4", ".7.", "..0", ".17", "6.7", "...", ".4.", ".3."}));
    		ExampleRunner.eq(36, 9, new DengklekMakingChains().maxBeauty(new String[]{".9.", "10."}));
    		ExampleRunner.eq(37, 82, new DengklekMakingChains().maxBeauty(new String[]{"3.3", "...", "..6", "637", "18.", "...", "5.8", "9.4", "970", "...", "6..", ".7.", ".2.", "..5", ".60", "088", "...", "593", "..4", "2..", ".80", "4.4"}));
    		ExampleRunner.eq(38, 43, new DengklekMakingChains().maxBeauty(new String[]{".12", ".7.", ".65", "8.0", "18.", "4..", "..8", "40.", "91.", "3.3", "8..", "...", "67.", ".6.", "2.3", ".79", "..5", "9.8", "9.5", "...", "1..", "145", "3.2", "0..", ".7.", "6.4", "1..", "42.", "...", "14.", "89.", "..7", "..1", ".27"}));
    		ExampleRunner.eq(39, 34, new DengklekMakingChains().maxBeauty(new String[]{"0..", ".8.", ".5.", "6..", ".89", "...", "603", "8..", ".1.", "5..", "5..", "1.9", "..6", ".0.", "6.1", "..4", "0.."}));
    		ExampleRunner.eq(40, 97, new DengklekMakingChains().maxBeauty(new String[]{".14", "41.", "...", "99.", "2..", ".56", "...", "...", "3.7", "..8", "437", "6..", "...", "...", "23.", "...", "397", ".1.", "..5", "..4", "7..", "24.", "...", "197", "1..", "707", "9.6", ".3.", "73.", ".87", "...", "49."}));
    		ExampleRunner.eq(41, 16, new DengklekMakingChains().maxBeauty(new String[]{".5.", ".0.", ".80", "3..", "3.2", "7..", "35."}));
    		ExampleRunner.eq(42, 50, new DengklekMakingChains().maxBeauty(new String[]{".19", ".2.", "3.8", "90.", ".52", "4.2", ".5.", ".86", "..6", "106", "3..", ".9.", "68.", "6..", "9.2", "08.", "81.", ".84", ".3.", "3.1", "3..", "366", "7.1", "5.5", "..7", "2..", "...", ".04", "82.", "19."}));
    		ExampleRunner.eq(43, 76, new DengklekMakingChains().maxBeauty(new String[]{"24.", ".7.", "0..", "829", ".9.", "849", ".7.", "..4", "743", "8.2", "...", "9.7", ".85", "71.", ".34"}));
    		ExampleRunner.eq(44, 118, new DengklekMakingChains().maxBeauty(new String[]{"9.2", "7..", "716", "888", "27.", "04.", "3..", "..2", "632", ".2.", ".7.", "..2", ".8.", "..2", "5.8", "214", "997", "18.", "7..", ".2.", ".72", ".4.", "...", ".96", "5.3", "315", ".94", "93.", "2..", ".97"}));
    		ExampleRunner.eq(45, 106, new DengklekMakingChains().maxBeauty(new String[]{".4.", ".6.", ".9.", "8.6", "6.1", "..8", ".41", ".8.", ".1.", "618", "79.", "..8", "95.", "226", ".75", ".55", ".2.", "..8", "652", "888", "..4", "9.6", "...", "..1", ".1.", "844", ".2.", "9..", "..6", "...", ".17", "1..", "0.4", ".9.", "..0", "19.", "02.", "..4"}));
    		ExampleRunner.eq(46, 150, new DengklekMakingChains().maxBeauty(new String[]{"..6", ".03", "...", "6.0", "0..", ".8.", "..3", "...", "5.3", ".77", "69.", "9.2", "45.", "...", "017", "..3", "32.", "392", "..5", ".0.", "...", "169", "..8", "91.", "429", ".6.", "723", "207", "..7", "..5", "0..", "94.", "..8", ".84", "853", "2.5", "...", ".4.", "...", "043", "80.", "442", "135", "...", ".84", ".0.", "410", "6.1"}));
    		ExampleRunner.eq(47, 46, new DengklekMakingChains().maxBeauty(new String[]{"97.", "239", ".0.", ".8.", ".52", ".80", "..1", "..5", "42.", "8..", "0..", "..9", "...", "8..", "..7", ".4.", "5.7", "..9", ".23", "1.0", ".93", "..2", "...", "28.", "...", "...", "...", "78.", ".9.", ".46", "9.1", ".41", "..9", ".6.", ".97", "..2"}));
    		ExampleRunner.eq(48, 77, new DengklekMakingChains().maxBeauty(new String[]{".1.", ".37", ".80", "...", "7..", "145", "67.", "92.", ".55", "...", "61.", ".93", ".0.", "2.9", "0..", "501", "..5", "..0", "..6", ".71", "...", "5..", "...", ".1.", "...", ".4.", "...", ".21", "345", "..8", "..9", "..8", "96.", "..7", ".78", "324", ".48", "1..", "5..", "..1", ".84", "...", ".7.", "109"}));
    		ExampleRunner.eq(49, 82, new DengklekMakingChains().maxBeauty(new String[]{"2.6", "54.", "71.", "779", ".4.", ".0.", ".68", "098", "3.6", "9.6", "14.", "..9", "..3", ".72", "0..", ".5.", ".5.", "...", "..4", "870", "17.", "67.", ".6.", "..8", "3..", "4.4", ".4.", "8.5", "6.."}));
    		ExampleRunner.eq(50, 80, new DengklekMakingChains().maxBeauty(new String[]{"...", "28.", "35.", "7..", "3.4", "..3", ".0.", "..2", "...", ".58", "...", "981", "6.0", "167", "377", ".2.", "5..", ".76", ".52", ".64", "73.", "99.", ".45", ".9.", "80.", "52.", "6.9", "...", "46.", "2.3", "..3", ".60", "..2", "...", ".4.", "...", "..3", "..."}));
    		ExampleRunner.eq(51, 75, new DengklekMakingChains().maxBeauty(new String[]{"...", "0.9", "52.", "...", "...", "83.", "...", "45.", ".67", "3.5", "753", ".9.", "2.3", "44.", ".1.", "930", "8.4", "6.7", "055", "...", "8.0", "0.3", ".10", ".4.", ".7.", "9..", "482"}));
    		ExampleRunner.eq(52, 8, new DengklekMakingChains().maxBeauty(new String[]{"4.5", "3.4"}));
    		ExampleRunner.eq(53, 76, new DengklekMakingChains().maxBeauty(new String[]{"8.7", "07.", ".87", "8.1", "184", "3.6", ".76", ".2.", ".1.", "8.8", "95.", "38.", "...", "7.3", "996", ".4.", ".1.", "..8", "06.", "..6", "..8", "532", "08.", "9.."}));
    		ExampleRunner.eq(54, 49, new DengklekMakingChains().maxBeauty(new String[]{".7.", "32.", ".46", "890", ".08", ".02", ".49", "381", "0..", ".96", "..1", "..8"}));
    		ExampleRunner.eq(55, 177, new DengklekMakingChains().maxBeauty(new String[]{".2.", "22.", "33.", "99.", "...", "3..", "88.", ".16", ".1.", ".79", "..3", "111", "..3", ".35", "4.9", "780", "904", "..7", "3.6", "7..", "0..", "292", "..6", ".1.", "6..", "87.", ".88", "1.6", "..2", "379", "2.7", "07.", ".3.", "31.", "982", "3..", "0.9", "...", "912", ".40", "974", ".5.", ".1.", "512", ".4.", "92.", "2.9", ".54", "957", "..8"}));
    		ExampleRunner.eq(56, 42, new DengklekMakingChains().maxBeauty(new String[]{"44.", "5..", "...", "55.", "26.", "393", "...", "...", "49.", ".05", "73.", "3.5", ".7.", ".6.", "16.", "531", "3.."}));
    		ExampleRunner.eq(57, 13, new DengklekMakingChains().maxBeauty(new String[]{"40.", "540", "..0", ".5."}));
    		ExampleRunner.eq(58, 88, new DengklekMakingChains().maxBeauty(new String[]{".8.", "1..", "0.4", ".1.", "4.4", "914", "372", "4..", "7..", "..4", "..3", "8.0", "..6", ".0.", "4.1", ".85", ".3.", ".16", "3.4", "664", ".81", "...", ".7.", "27.", "3.8", "437", "...", "323", "8.7", "0.9", "200", "09.", ".0.", "3..", "2.9", "...", ".41", "6..", "7.9", "8.3"}));
    		ExampleRunner.eq(59, 30, new DengklekMakingChains().maxBeauty(new String[]{"4.6", "89.", ".9.", "04.", ".36", "55.", "...", ".58", ".93", ".3.", "9.0", "..0", "..4", ".63", "6.."}));
    		ExampleRunner.eq(60, 2, new DengklekMakingChains().maxBeauty(new String[]{"101"}));
    		ExampleRunner.eq(61, 8, new DengklekMakingChains().maxBeauty(new String[]{"7.8"}));
    		ExampleRunner.eq(62, 58, new DengklekMakingChains().maxBeauty(new String[]{"412", "..7", ".58", "7.8", "32.", "6..", "351", "3.9", "985", "...", ".46"}));
    		ExampleRunner.eq(63, 5, new DengklekMakingChains().maxBeauty(new String[]{"5.5"}));
    		ExampleRunner.eq(64, 9, new DengklekMakingChains().maxBeauty(new String[]{"7.9"}));
    		ExampleRunner.eq(65, 2, new DengklekMakingChains().maxBeauty(new String[]{"1.2"}));
    		ExampleRunner.eq(66, 9, new DengklekMakingChains().maxBeauty(new String[]{"8.9"}));
    		ExampleRunner.eq(67, 31, new DengklekMakingChains().maxBeauty(new String[]{"16.", "9.8", ".24", "52.", "3.1", "532", "4.4", "111", "8.9"}));
    		ExampleRunner.eq(68, 572, new DengklekMakingChains().maxBeauty(new String[]{"487", "482", "220", "149", "237", "097", "000", "161", "533", "943", "749", "875", "075", "164", "396", "588", "16.", "841", "368", "0.1", "30.", "598", "10.", "512", "805", "820", "617", "645", "458", "637", "298", "89.", "837", "5.0", "5.0", "178", "872", ".21", "033", "832", "950", "210", "377", "381", "866", "108", "8.4", "718", "2.2", "901"}));
    		ExampleRunner.eq(69, 9, new DengklekMakingChains().maxBeauty(new String[]{"9.8"}));
    		ExampleRunner.eq(70, 15, new DengklekMakingChains().maxBeauty(new String[]{"9.9", "123"}));
    		ExampleRunner.eq(71, 7, new DengklekMakingChains().maxBeauty(new String[]{"123", "..1"}));
    		ExampleRunner.eq(72, 24, new DengklekMakingChains().maxBeauty(new String[]{"123", "456", "2.2", "1..", "..1"}));
    		ExampleRunner.eq(73, 7, new DengklekMakingChains().maxBeauty(new String[]{"..1", "3..", "2..", ".7."}));
    		ExampleRunner.eq(74, 19, new DengklekMakingChains().maxBeauty(new String[]{"444", "..7"}));
    		ExampleRunner.eq(75, 20, new DengklekMakingChains().maxBeauty(new String[]{"111", "8.8", "9.9"}));
    		ExampleRunner.eq(76, 29, new DengklekMakingChains().maxBeauty(new String[]{"16.", "9.8", ".24", ".52", "3.1", "532", "4.4", "111"}));
    		ExampleRunner.eq(77, 9, new DengklekMakingChains().maxBeauty(new String[]{"5.6", "102", ".7."}));
    		ExampleRunner.eq(78, 12, new DengklekMakingChains().maxBeauty(new String[]{"..5", "2..", "7.6"}));
    		ExampleRunner.eq(79, 3, new DengklekMakingChains().maxBeauty(new String[]{"111"}));
    		ExampleRunner.eq(80, 9, new DengklekMakingChains().maxBeauty(new String[]{".9.", "123"}));
    		ExampleRunner.eq(81, 1, new DengklekMakingChains().maxBeauty(new String[]{"1.1"}));
    		ExampleRunner.eq(82, 1, new DengklekMakingChains().maxBeauty(new String[]{"..1"}));
    		ExampleRunner.eq(83, 7, new DengklekMakingChains().maxBeauty(new String[]{"123", "1.."}));
    		ExampleRunner.eq(84, 138, new DengklekMakingChains().maxBeauty(new String[]{"412", "..7", ".58", "7.8", "32.", "6..", "351", "3.9", "985", "...", ".46", "999", "777", "364", "224", ".97", "87."}));
    		ExampleRunner.eq(85, 4, new DengklekMakingChains().maxBeauty(new String[]{"111", "1.."}));
    		ExampleRunner.eq(86, 26, new DengklekMakingChains().maxBeauty(new String[]{"555", "4.5", "21.", ".01", "6.7"}));
    		ExampleRunner.eq(87, 9, new DengklekMakingChains().maxBeauty(new String[]{"111", ".11", "11.", ".9."}));
    		ExampleRunner.eq(88, 17, new DengklekMakingChains().maxBeauty(new String[]{"0.0", "1.1", "2.2", "3.3", "4.4", "5.5", "6.6", "7.7", "8.8", "9.9"}));
    		ExampleRunner.eq(89, 41, new DengklekMakingChains().maxBeauty(new String[]{"234", "435", "111", "...", "7.9", "44.", "23.", "3..", "..3", ".23", "..3"}));
    		ExampleRunner.eq(90, 17, new DengklekMakingChains().maxBeauty(new String[]{"9.9", "8.8", "7.7", "6.6", "5.5", "4.4", "3.3", "2.2", "1.1"}));
    		ExampleRunner.eq(91, 9, new DengklekMakingChains().maxBeauty(new String[]{"9.9"}));
    		ExampleRunner.eq(92, 12, new DengklekMakingChains().maxBeauty(new String[]{"1.9", "111"}));
    		ExampleRunner.eq(93, 0, new DengklekMakingChains().maxBeauty(new String[]{"...", "..."}));
    		ExampleRunner.eq(94, 9, new DengklekMakingChains().maxBeauty(new String[]{".9.", ".1."}));
    		ExampleRunner.eq(95, 6, new DengklekMakingChains().maxBeauty(new String[]{"5.6"}));
    		ExampleRunner.eq(96, 15, new DengklekMakingChains().maxBeauty(new String[]{"123", "1.9"}));
    		ExampleRunner.eq(97, 18, new DengklekMakingChains().maxBeauty(new String[]{".99"}));
    		ExampleRunner.eq(98, 7, new DengklekMakingChains().maxBeauty(new String[]{"7.3"}));
    		ExampleRunner.eq(99, 7, new DengklekMakingChains().maxBeauty(new String[]{"010", ".7."}));
    		ExampleRunner.eq(100, 34, new DengklekMakingChains().maxBeauty(new String[]{"..1", "9.8", "567", "24.", "8.6", ".42"}));
    		ExampleRunner.eq(101, 7, new DengklekMakingChains().maxBeauty(new String[]{"111", "111", "1.1"}));
    		ExampleRunner.eq(102, 1, new DengklekMakingChains().maxBeauty(new String[]{".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".1.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0.", ".0."}));
    		ExampleRunner.eq(103, 9, new DengklekMakingChains().maxBeauty(new String[]{"7.4", "..1", "5.."}));
    		ExampleRunner.eq(104, 11, new DengklekMakingChains().maxBeauty(new String[]{"5.3", "123"}));
    		ExampleRunner.eq(105, 9, new DengklekMakingChains().maxBeauty(new String[]{"111", "6.."}));
    		ExampleRunner.eq(106, 9, new DengklekMakingChains().maxBeauty(new String[]{"122", "..1", "2..", ".9."}));
    		ExampleRunner.eq(107, 9, new DengklekMakingChains().maxBeauty(new String[]{"111", ".9.", "11.", ".11"}));
    		ExampleRunner.eq(108, 28, new DengklekMakingChains().maxBeauty(new String[]{"16.", "9.8", ".24", "52.", "3.1", "532", "4.4", "111"}));
    		ExampleRunner.eq(109, 14, new DengklekMakingChains().maxBeauty(new String[]{"9.6", "..1", "8.."}));
    		ExampleRunner.eq(110, 7, new DengklekMakingChains().maxBeauty(new String[]{"..1", "123"}));
    		ExampleRunner.eq(111, 6, new DengklekMakingChains().maxBeauty(new String[]{"12.", ".12", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12.", "12."}));
    		ExampleRunner.eq(112, 6, new DengklekMakingChains().maxBeauty(new String[]{"...", ".6.", "111", "1.."}));
    		ExampleRunner.eq(113, 4, new DengklekMakingChains().maxBeauty(new String[]{"3.4"}));
    		ExampleRunner.eq(114, 2, new DengklekMakingChains().maxBeauty(new String[]{"1.1", "1.1"}));
    		ExampleRunner.eq(115, 22, new DengklekMakingChains().maxBeauty(new String[]{".15", "7..", "..3", "402", "9.9"}));
    		ExampleRunner.eq(116, 6, new DengklekMakingChains().maxBeauty(new String[]{"123", ".2."}));
    		ExampleRunner.eq(117, 18, new DengklekMakingChains().maxBeauty(new String[]{"9.9", "9.9", "9.9", "9.9"}));
    		ExampleRunner.eq(118, 10, new DengklekMakingChains().maxBeauty(new String[]{".9.", ".91"}));
    		ExampleRunner.eq(119, 7, new DengklekMakingChains().maxBeauty(new String[]{"7.7"}));
    		ExampleRunner.eq(120, 9, new DengklekMakingChains().maxBeauty(new String[]{".9."}));
    		ExampleRunner.eq(121, 136, new DengklekMakingChains().maxBeauty(new String[]{"412", "..7", ".58", "7.8", "32.", "6..", "351", "3.9", "985", "...", ".46", "412", "..7", ".58", "7.8", "32.", "6..", "351", "3.9", "985", "...", ".46", "412", "..7", ".58", "7.8", "32.", "6..", "351", "3.9", "985", "...", ".46", "1..", "2..", "3..", "4..", "5..", "6..", "7..", "8..", "9..", "..1", "..2", "..3", "..4", "..5"}));
    		ExampleRunner.eq(122, 7, new DengklekMakingChains().maxBeauty(new String[]{".7.", ".1."}));
    		ExampleRunner.eq(123, 63, new DengklekMakingChains().maxBeauty(new String[]{"111", "222", "333", "444", "555", "1.1", "1.9", "9.1", "5.5"}));
    		ExampleRunner.eq(124, 6, new DengklekMakingChains().maxBeauty(new String[]{"4.6"}));
    		ExampleRunner.eq(125, 11, new DengklekMakingChains().maxBeauty(new String[]{"123", "..5"}));
    		ExampleRunner.eq(126, 4, new DengklekMakingChains().maxBeauty(new String[]{"111", "1.1"}));
    		ExampleRunner.eq(127, 7, new DengklekMakingChains().maxBeauty(new String[]{"3.2", "3.4", "2.."}));
    		ExampleRunner.eq(128, 14, new DengklekMakingChains().maxBeauty(new String[]{"9.6", "44.", "..4"}));
    		ExampleRunner.eq(129, 35, new DengklekMakingChains().maxBeauty(new String[]{"..1", "2..", "888", "4.7", "4.7"}));
    		ExampleRunner.eq(130, 6, new DengklekMakingChains().maxBeauty(new String[]{"123"}));
    		ExampleRunner.eq(131, 9, new DengklekMakingChains().maxBeauty(new String[]{"..9"}));
    		ExampleRunner.eq(132, 12, new DengklekMakingChains().maxBeauty(new String[]{"123", "123"}));
    		ExampleRunner.eq(133, 9, new DengklekMakingChains().maxBeauty(new String[]{"111", ".9."}));
    		ExampleRunner.eq(134, 9, new DengklekMakingChains().maxBeauty(new String[]{".9.", "11.", "111", ".11"}));
    		ExampleRunner.eq(135, 18, new DengklekMakingChains().maxBeauty(new String[]{"5.9", "9.1"}));
    		ExampleRunner.eq(136, 18, new DengklekMakingChains().maxBeauty(new String[]{"9.8", "8.9", "2..", "..3"}));
    		ExampleRunner.eq(137, 14, new DengklekMakingChains().maxBeauty(new String[]{"7.6", "8.1"}));
    		ExampleRunner.eq(138, 20, new DengklekMakingChains().maxBeauty(new String[]{"1.1", "2.2", "3.3", "8.8", "9.9", "111", "11.", "1..", "..2", ".22", ".3."}));
    		ExampleRunner.eq(139, 9, new DengklekMakingChains().maxBeauty(new String[]{".9.", "000", "000", ".01", "10.", "000", "000", "010", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000", "000"}));
    		ExampleRunner.eq(140, 12, new DengklekMakingChains().maxBeauty(new String[]{"9.8", "111"}));
    		ExampleRunner.eq(141, 10, new DengklekMakingChains().maxBeauty(new String[]{"111", "5.2", "5..", "..1"}));
    		ExampleRunner.eq(142, 9, new DengklekMakingChains().maxBeauty(new String[]{"9.6"}));
    		ExampleRunner.eq(143, 5, new DengklekMakingChains().maxBeauty(new String[]{"32."}));
    		ExampleRunner.eq(144, 9, new DengklekMakingChains().maxBeauty(new String[]{".9.", "111"}));
    		ExampleRunner.eq(145, 5, new DengklekMakingChains().maxBeauty(new String[]{"1.5"}));
    		ExampleRunner.eq(146, 3, new DengklekMakingChains().maxBeauty(new String[]{"..1", ".2.", "2.3"}));
    		ExampleRunner.eq(147, 4, new DengklekMakingChains().maxBeauty(new String[]{"4.4"}));
    		ExampleRunner.eq(148, 36, new DengklekMakingChains().maxBeauty(new String[]{"..1", "7..", "567", "24.", "8..", "234"}));
    		ExampleRunner.eq(149, 5, new DengklekMakingChains().maxBeauty(new String[]{"5.3"}));
    		ExampleRunner.eq(150, 2, new DengklekMakingChains().maxBeauty(new String[]{".11"}));
    		ExampleRunner.eq(151, 9, new DengklekMakingChains().maxBeauty(new String[]{"111", ".9.", "11.", "..1"}));
    		ExampleRunner.eq(152, 15, new DengklekMakingChains().maxBeauty(new String[]{"123", "8.9"}));
    		ExampleRunner.eq(153, 22, new DengklekMakingChains().maxBeauty(new String[]{".15", "7..", "402", "..3", "9.9"}));
    		ExampleRunner.eq(154, 18, new DengklekMakingChains().maxBeauty(new String[]{"9.9", "9.9", "1.3", "4.2"}));
    		ExampleRunner.eq(155, 7, new DengklekMakingChains().maxBeauty(new String[]{"111", ".7."}));
    		ExampleRunner.eq(156, 11, new DengklekMakingChains().maxBeauty(new String[]{"9.9", "11."}));
    		ExampleRunner.eq(157, 7, new DengklekMakingChains().maxBeauty(new String[]{"1.4", "1.6"}));
    		ExampleRunner.eq(158, 9, new DengklekMakingChains().maxBeauty(new String[]{".9.", "3.7"}));
    		ExampleRunner.eq(159, 36, new DengklekMakingChains().maxBeauty(new String[]{"..9", "999"}));
    		ExampleRunner.eq(160, 18, new DengklekMakingChains().maxBeauty(new String[]{"99."}));
    		ExampleRunner.eq(161, 9, new DengklekMakingChains().maxBeauty(new String[]{"111", "222"}));
    		ExampleRunner.eq(162, 7, new DengklekMakingChains().maxBeauty(new String[]{".7."}));
    		ExampleRunner.eq(163, 7, new DengklekMakingChains().maxBeauty(new String[]{"..3", "4..", ".5."}));
    		ExampleRunner.eq(164, 45, new DengklekMakingChains().maxBeauty(new String[]{"999", "9.9", "..9", "1.."}));
    		ExampleRunner.eq(165, 1, new DengklekMakingChains().maxBeauty(new String[]{"1.."}));
    		ExampleRunner.eq(166, 3, new DengklekMakingChains().maxBeauty(new String[]{"3.2"}));
    		ExampleRunner.eq(167, 3, new DengklekMakingChains().maxBeauty(new String[]{"1.2", "..2"}));
    		ExampleRunner.eq(168, 18, new DengklekMakingChains().maxBeauty(new String[]{"6.8", "111", "7.6"}));
    		ExampleRunner.eq(169, 25, new DengklekMakingChains().maxBeauty(new String[]{"123", "456", "2.2", "2..", "..2"}));
    		ExampleRunner.eq(170, 2, new DengklekMakingChains().maxBeauty(new String[]{"2.1"}));
    		ExampleRunner.eq(171, 8, new DengklekMakingChains().maxBeauty(new String[]{"1.5", "3.6"}));
    		ExampleRunner.eq(172, 1, new DengklekMakingChains().maxBeauty(new String[]{".1."}));
    		ExampleRunner.eq(173, 45, new DengklekMakingChains().maxBeauty(new String[]{"999", ".99"}));
    		ExampleRunner.eq(174, 18, new DengklekMakingChains().maxBeauty(new String[]{"..5", "3..", "8.9", "9.8"}));
    		ExampleRunner.eq(175, 2, new DengklekMakingChains().maxBeauty(new String[]{".2.", ".1."}));
    		ExampleRunner.eq(176, 13, new DengklekMakingChains().maxBeauty(new String[]{"..7", "123"}));
    		ExampleRunner.eq(177, 2, new DengklekMakingChains().maxBeauty(new String[]{".1.", ".2."}));
    		ExampleRunner.eq(178, 11, new DengklekMakingChains().maxBeauty(new String[]{"5.7", "1.6"}));
    		ExampleRunner.eq(179, 16, new DengklekMakingChains().maxBeauty(new String[]{"79."}));
    		ExampleRunner.eq(180, 9, new DengklekMakingChains().maxBeauty(new String[]{"111", "..1", "1..", ".9."}));
    		ExampleRunner.eq(181, 5, new DengklekMakingChains().maxBeauty(new String[]{".5."}));
    		ExampleRunner.eq(182, 90, new DengklekMakingChains().maxBeauty(new String[]{".9.", "11.", "111", ".11", "23.", "123", "2.2", "91.", "11.", "2.9", "9.8", "238", "944", "2..", "191", "101", "...", "123", "322", "12.", "12.", "12.", "21.", "123", "43.", "23."}));
    		ExampleRunner.eq(183, 10, new DengklekMakingChains().maxBeauty(new String[]{"333", "1.."}));
    		ExampleRunner.eq(184, 12, new DengklekMakingChains().maxBeauty(new String[]{"3..", "333"}));
    		ExampleRunner.eq(185, 10, new DengklekMakingChains().maxBeauty(new String[]{"111", "5.5", "2..", "..1"}));
    		ExampleRunner.eq(186, 22, new DengklekMakingChains().maxBeauty(new String[]{"8.7", "123", "9.0", "0.2"}));
    		ExampleRunner.eq(187, 18, new DengklekMakingChains().maxBeauty(new String[]{"9.9", "9.9"}));
    		ExampleRunner.eq(188, 4, new DengklekMakingChains().maxBeauty(new String[]{"..1", "111"}));
    		ExampleRunner.eq(189, 22, new DengklekMakingChains().maxBeauty(new String[]{"123", "456", "..1"}));
    		ExampleRunner.eq(190, 26, new DengklekMakingChains().maxBeauty(new String[]{"111", "111", "111", "..8", "9.9"}));
    		ExampleRunner.eq(191, 27, new DengklekMakingChains().maxBeauty(new String[]{"999", ".7.", ".7."}));
    		ExampleRunner.eq(192, 12, new DengklekMakingChains().maxBeauty(new String[]{"..1", "9.9", "3.."}));
    		ExampleRunner.eq(193, 12, new DengklekMakingChains().maxBeauty(new String[]{"5.6", "..7"}));
    		ExampleRunner.eq(194, 8, new DengklekMakingChains().maxBeauty(new String[]{"5.8"}));
    		ExampleRunner.eq(195, 10, new DengklekMakingChains().maxBeauty(new String[]{"111", "3.4", "1.3", "2.4"}));
    		ExampleRunner.eq(196, 1, new DengklekMakingChains().maxBeauty(new String[]{".1.", "000", ".0."}));
    		ExampleRunner.eq(197, 9, new DengklekMakingChains().maxBeauty(new String[]{".5.", ".9."}));
    		ExampleRunner.eq(198, 3, new DengklekMakingChains().maxBeauty(new String[]{"2.3"}));
    		ExampleRunner.eq(199, 36, new DengklekMakingChains().maxBeauty(new String[]{"999", "9.9"}));
    		ExampleRunner.eq(200, 8, new DengklekMakingChains().maxBeauty(new String[]{"1.3", "5.7"}));
    		ExampleRunner.eq(201, 13, new DengklekMakingChains().maxBeauty(new String[]{"111", "9.9", "1.1"}));
    		ExampleRunner.eq(202, 10, new DengklekMakingChains().maxBeauty(new String[]{"9.9", "000", "1..", "..1"}));
    		ExampleRunner.eq(203, 34, new DengklekMakingChains().maxBeauty(new String[]{"999", "..7"}));
    		ExampleRunner.eq(204, 9, new DengklekMakingChains().maxBeauty(new String[]{"1.1", "1.1", "1.1", ".9."}));
    		ExampleRunner.eq(205, 7, new DengklekMakingChains().maxBeauty(new String[]{"6.7"}));
    		ExampleRunner.eq(206, 12, new DengklekMakingChains().maxBeauty(new String[]{"111", "6.4", "5.1"}));
    		ExampleRunner.eq(207, 16, new DengklekMakingChains().maxBeauty(new String[]{"9.8", "7..", "..7", "4.4"}));
    		ExampleRunner.eq(208, 16, new DengklekMakingChains().maxBeauty(new String[]{"8.9", ".43", "43."}));
    		ExampleRunner.eq(209, 17, new DengklekMakingChains().maxBeauty(new String[]{"1.1", "1.1", "9.9", "8.."}));
    		ExampleRunner.eq(210, 3, new DengklekMakingChains().maxBeauty(new String[]{"1.1", "2.2"}));
    		ExampleRunner.eq(211, 20, new DengklekMakingChains().maxBeauty(new String[]{"222", "9.9", "5.1", "1.4"}));
    		ExampleRunner.eq(212, 8, new DengklekMakingChains().maxBeauty(new String[]{"5.2", "6.."}));
    		ExampleRunner.eq(213, 17, new DengklekMakingChains().maxBeauty(new String[]{"532", "7.."}));
    		ExampleRunner.eq(214, 15, new DengklekMakingChains().maxBeauty(new String[]{"9.7", "8.1", "8.2"}));
    		ExampleRunner.eq(215, 10, new DengklekMakingChains().maxBeauty(new String[]{"6.9", "1.2"}));
    		ExampleRunner.eq(216, 5, new DengklekMakingChains().maxBeauty(new String[]{"5.."}));
    		ExampleRunner.eq(217, 31, new DengklekMakingChains().maxBeauty(new String[]{"..3", "1..", "5.9", "777"}));
    		ExampleRunner.eq(218, 4, new DengklekMakingChains().maxBeauty(new String[]{"13."}));
    		ExampleRunner.eq(219, 9, new DengklekMakingChains().maxBeauty(new String[]{"111", "111", ".9.", ".1.", "1..", "..1"}));
    		ExampleRunner.eq(220, 45, new DengklekMakingChains().maxBeauty(new String[]{"999", "99."}));
    		ExampleRunner.eq(221, 9, new DengklekMakingChains().maxBeauty(new String[]{"2.9"}));
    		ExampleRunner.eq(222, 9, new DengklekMakingChains().maxBeauty(new String[]{"9.1"}));
    		ExampleRunner.eq(223, 664, new DengklekMakingChains().maxBeauty(new String[]{"956", "482", "168", "314", "849", "207", "060", "705", "673", "849", "265", "774", "579", "830", "223", "671", "554", "026", "061", "117", "300", "483", "012", "903", "885", "770", "893", "074", "783", "710", "083", "450", "145", "620", "356", "667", "677", "191", "627", "276", "513", "995", "926", "532", "444", "279", "237", "315", "785", "832"}));
    		ExampleRunner.eq(224, 3, new DengklekMakingChains().maxBeauty(new String[]{"12."}));
    		ExampleRunner.eq(225, 1350, new DengklekMakingChains().maxBeauty(new String[]{"999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999", "999"}));
    		ExampleRunner.eq(226, 34, new DengklekMakingChains().maxBeauty(new String[]{"1..", "23.", "456", "..1", ".77"}));
    		ExampleRunner.eq(227, 7, new DengklekMakingChains().maxBeauty(new String[]{"...", ".7.", "211"}));
    		ExampleRunner.eq(228, 9, new DengklekMakingChains().maxBeauty(new String[]{"5.3", "4.4"}));
    		ExampleRunner.eq(229, 30, new DengklekMakingChains().maxBeauty(new String[]{"16.", "9.9", ".24", "52.", "8.8", "532", "4.4", "111", "...", "..."}));
    		ExampleRunner.eq(230, 2, new DengklekMakingChains().maxBeauty(new String[]{"..2"}));
    		ExampleRunner.eq(231, 9, new DengklekMakingChains().maxBeauty(new String[]{".9.", "123", "1.."}));
    		ExampleRunner.eq(232, 12, new DengklekMakingChains().maxBeauty(new String[]{"9.9", "111"}));
    		ExampleRunner.eq(233, 13, new DengklekMakingChains().maxBeauty(new String[]{"9.9", "111", "1.1"}));
    		ExampleRunner.eq(234, 20, new DengklekMakingChains().maxBeauty(new String[]{"9.9", "111", "8.8"}));
    		ExampleRunner.eq(235, 12, new DengklekMakingChains().maxBeauty(new String[]{"9.9", "3.."}));
    		ExampleRunner.eq(236, 8, new DengklekMakingChains().maxBeauty(new String[]{"111", "3.5"}));
    		ExampleRunner.eq(237, 6, new DengklekMakingChains().maxBeauty(new String[]{"6.6"}));
    		ExampleRunner.eq(238, 9, new DengklekMakingChains().maxBeauty(new String[]{"1.9"}));
    		ExampleRunner.eq(239, 16, new DengklekMakingChains().maxBeauty(new String[]{"3..", "..4", "7.7", "9.2"}));
    		ExampleRunner.eq(240, 18, new DengklekMakingChains().maxBeauty(new String[]{"9.9", "8.7", "2..", "..3", "010"}));
    		ExampleRunner.eq(241, 32, new DengklekMakingChains().maxBeauty(new String[]{"333", "2..", "777"}));
    		ExampleRunner.eq(242, 16, new DengklekMakingChains().maxBeauty(new String[]{"1..", "3.9", "402", "..1"}));
    		ExampleRunner.eq(243, 18, new DengklekMakingChains().maxBeauty(new String[]{"0.0", "9.9", "9.9"}));
    		ExampleRunner.eq(244, 11, new DengklekMakingChains().maxBeauty(new String[]{"9..", "..1", "3.2"}));
    		ExampleRunner.eq(245, 9, new DengklekMakingChains().maxBeauty(new String[]{"402", "..3"}));
    		ExampleRunner.eq(246, 59, new DengklekMakingChains().maxBeauty(new String[]{"111", "222", "333", "444", "555", "1.1", "5.5", "9.9"}));
    		ExampleRunner.eq(247, 22, new DengklekMakingChains().maxBeauty(new String[]{"..8", "8.9", "123", "5.."}));
    		ExampleRunner.eq(248, 12, new DengklekMakingChains().maxBeauty(new String[]{"111", "9.."}));
    		ExampleRunner.eq(249, 21, new DengklekMakingChains().maxBeauty(new String[]{"9.9", "111", "9.9"}));
    		ExampleRunner.eq(250, 15, new DengklekMakingChains().maxBeauty(new String[]{"123", ".45"}));
    		ExampleRunner.eq(251, 9, new DengklekMakingChains().maxBeauty(new String[]{"111", ".9.", "..1", "1.."}));
    		ExampleRunner.eq(252, 5, new DengklekMakingChains().maxBeauty(new String[]{"23."}));
    		ExampleRunner.eq(253, 4, new DengklekMakingChains().maxBeauty(new String[]{".22"}));
    		ExampleRunner.eq(254, 6, new DengklekMakingChains().maxBeauty(new String[]{"1.3", "3.4"}));
    		ExampleRunner.eq(255, 6, new DengklekMakingChains().maxBeauty(new String[]{"..1", "111", "11."}));
    		ExampleRunner.eq(256, 9, new DengklekMakingChains().maxBeauty(new String[]{"9.."}));
    		ExampleRunner.eq(257, 24, new DengklekMakingChains().maxBeauty(new String[]{"..1", "8.7", "1.1", "9.9", "9.7", "123"}));
    		ExampleRunner.eq(258, 2, new DengklekMakingChains().maxBeauty(new String[]{"1..", "..1"}));
    		ExampleRunner.eq(259, 9, new DengklekMakingChains().maxBeauty(new String[]{".9.", ".2."}));
    		ExampleRunner.eq(260, 18, new DengklekMakingChains().maxBeauty(new String[]{".8.", "..9", "9..", "..."}));
    		ExampleRunner.eq(261, 9, new DengklekMakingChains().maxBeauty(new String[]{"111", "3.6"}));
    		ExampleRunner.eq(262, 14, new DengklekMakingChains().maxBeauty(new String[]{"9.8", "51."}));
    		ExampleRunner.eq(263, 28, new DengklekMakingChains().maxBeauty(new String[]{"13.", "9.9", ".24", "22.", "3.1", "532", "4.4", "111"}));
    		ExampleRunner.eq(264, 5, new DengklekMakingChains().maxBeauty(new String[]{"111", "11."}));
    		ExampleRunner.eq(265, 10, new DengklekMakingChains().maxBeauty(new String[]{"111", "7.3"}));
    		ExampleRunner.eq(266, 9, new DengklekMakingChains().maxBeauty(new String[]{"3.3", "11.", "..1", "111", ".9."}));
    		ExampleRunner.eq(267, 17, new DengklekMakingChains().maxBeauty(new String[]{"..8", "9.9"}));
    		ExampleRunner.eq(268, 6, new DengklekMakingChains().maxBeauty(new String[]{"6.5"}));
    		ExampleRunner.eq(269, 6, new DengklekMakingChains().maxBeauty(new String[]{"6.3"}));
    		ExampleRunner.eq(270, 27, new DengklekMakingChains().maxBeauty(new String[]{".9.", "999"}));
    		ExampleRunner.eq(271, 15, new DengklekMakingChains().maxBeauty(new String[]{"6..", "3.9"}));
    		ExampleRunner.eq(272, 9, new DengklekMakingChains().maxBeauty(new String[]{".9.", "...", "023", "111"}));
    		ExampleRunner.eq(273, 16, new DengklekMakingChains().maxBeauty(new String[]{"5.4", "4.5", "222"}));
    		ExampleRunner.eq(274, 6, new DengklekMakingChains().maxBeauty(new String[]{"2.3", "111"}));
    		ExampleRunner.eq(275, 12, new DengklekMakingChains().maxBeauty(new String[]{"...", "..0", "..1", "..2", "..3", "..4", "..5", "..6", "..7", "..8", ".1.", ".10", ".11", ".12", ".13", ".14", ".15", ".16", ".17", ".18", ".2.", ".20", ".21", ".22", ".23", ".24", ".25", ".26", ".27", ".28", ".3.", ".30", ".31", ".32", ".33", ".34", ".35", ".36", ".37", ".38", ".4.", ".40", ".41", ".42", ".43", ".44", ".45", ".46", ".47", ".48"}));
    		ExampleRunner.eq(276, 3, new DengklekMakingChains().maxBeauty(new String[]{"3.."}));
    		ExampleRunner.eq(277, 25, new DengklekMakingChains().maxBeauty(new String[]{"666", "4.5", "..3"}));
    		ExampleRunner.eq(278, 6, new DengklekMakingChains().maxBeauty(new String[]{"222"}));
    		ExampleRunner.eq(279, 9, new DengklekMakingChains().maxBeauty(new String[]{"..1", "111", "1..", ".9."}));
    		ExampleRunner.eq(280, 7, new DengklekMakingChains().maxBeauty(new String[]{"...", ".7.", "211", "..1"}));
    		ExampleRunner.eq(281, 8, new DengklekMakingChains().maxBeauty(new String[]{"...", "...", "000", "8.7"}));
    		ExampleRunner.eq(282, 9, new DengklekMakingChains().maxBeauty(new String[]{"15.", "9.2"}));
    		ExampleRunner.eq(283, 38, new DengklekMakingChains().maxBeauty(new String[]{"1.2", ".9.", "6.9", "1.1", "111", "147", "8.8", "9.8", "7.5", "5..", ".7.", ".77"}));
    		ExampleRunner.eq(284, 14, new DengklekMakingChains().maxBeauty(new String[]{".13", "9.9", "14."}));
    		ExampleRunner.eq(285, 17, new DengklekMakingChains().maxBeauty(new String[]{"8.9", "1.9"}));
    		ExampleRunner.eq(286, 31, new DengklekMakingChains().maxBeauty(new String[]{"16.", "9.8", ".24", "52.", "3.1", "532", "9.9", "111"}));
    		ExampleRunner.eq(287, 33, new DengklekMakingChains().maxBeauty(new String[]{"..3", "3..", "9.7", "777"}));
    		ExampleRunner.eq(288, 27, new DengklekMakingChains().maxBeauty(new String[]{"9.8", "7..", "..5", "444"}));
    		ExampleRunner.eq(289, 5, new DengklekMakingChains().maxBeauty(new String[]{"3.3", "2.2"}));
    		ExampleRunner.eq(290, 20, new DengklekMakingChains().maxBeauty(new String[]{"6.6", "333", "2.5"}));
    		ExampleRunner.eq(291, 18, new DengklekMakingChains().maxBeauty(new String[]{"1.9", "9.1"}));
    		ExampleRunner.eq(292, 45, new DengklekMakingChains().maxBeauty(new String[]{"1.9", "9.1", "999"}));
    		ExampleRunner.eq(293, 7, new DengklekMakingChains().maxBeauty(new String[]{"34."}));
    		ExampleRunner.eq(294, 2, new DengklekMakingChains().maxBeauty(new String[]{"2.2"}));
    		ExampleRunner.eq(295, 9, new DengklekMakingChains().maxBeauty(new String[]{".11", "11.", "5.3", "6.3"}));
    		ExampleRunner.eq(296, 9, new DengklekMakingChains().maxBeauty(new String[]{"1.1", "8.7"}));
    		ExampleRunner.eq(297, 22, new DengklekMakingChains().maxBeauty(new String[]{"123", "456", "1.."}));
    		ExampleRunner.eq(298, 22, new DengklekMakingChains().maxBeauty(new String[]{"7.9", "1.1", "138", ".20"}));
    		ExampleRunner.eq(299, 29, new DengklekMakingChains().maxBeauty(new String[]{"16.", "9.9", ".24", "22.", "3.1", "532", "4.4", "111"}));  }
}
