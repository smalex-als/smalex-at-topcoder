package p400.srm404;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 05.06.2008
 * Time: 15:38:31
 */
public class RevealTriangle {
  public String[] calcTriangle(String[] questionMarkTriangle) {
    int[][] rows = toArray(questionMarkTriangle);

    for (int i = rows.length - 1; i >= 0; i--) {
      int[] row = rows[i];
      while (hasQuestionMark(row)) {
        for (int j = 1; j < row.length; j++) {
          if (row[j - 1] != -1 || row[j] != -1) {
            findValue(rows, i, j);
          }
        }
      }
    }
//        dump(rows);

    final String[] result = toResult(rows);
    System.out.println("result = " + Arrays.toString(result));
    return result;
  }

  private boolean findValue(int[][] rows, int i, int j) {
    int a = rows[i][j - 1];
    int b = rows[i][j];
    int c = rows[i + 1][j - 1];
    if (a == -1 && b != -1) {
      rows[i][j - 1] = (c + 10 - b) % 10;
      return true;
    } else if (b == -1 && a != -1) {
      rows[i][j] = (c + 10 - a) % 10;
      return true;
    }
    return false;
  }

  private int[][] toArray(String[] questionMarkTriangle) {
    int[][] rows = new int[questionMarkTriangle.length][];
    for (int i = 0; i < questionMarkTriangle.length; i++) {
      String s = questionMarkTriangle[i];
      rows[i] = new int[s.length()];
      for (int j = 0; j < s.length(); j++) {
        rows[i][j] = '?' == s.charAt(j) ? -1 : s.charAt(j) - '0';
      }
    }
    return rows;
  }

  private String[] toResult(int[][] rows) {
    final String[] result = new String[rows.length];
    for (int i = 0; i < rows.length; i++) {
      int[] row = rows[i];
      String sum = "";
      for (int j = 0; j < row.length; j++) {
        sum += row[j];
      }
      result[i] = sum;
    }
    return result;
  }

  private boolean hasQuestionMark(int[] row) {
    for (int i = 0; i < row.length; i++) {
      if (row[i] == -1) {
        return true;
      }
    }
    return false;
  }

  private void dump(int[][] rows) {
    for (int i = rows.length - 1; i >= 0; i--) {
      System.out.println(Arrays.toString(rows[i]));
    }
  }

  public static void main(String[] args) {
    System.out.println(Arrays.equals(new String[]{"457", "92", "1"},
        new RevealTriangle().calcTriangle(new String[]{"4??", "?2", "1"})));
    System.out.println(Arrays.equals(new String[]{"0002", "002", "02", "2"},
        new RevealTriangle().calcTriangle(new String[]{"???2", "??2", "?2", "2"})));
    System.out.println(Arrays.equals(new String[]{"7054", "759", "24", "6"},
        new RevealTriangle().calcTriangle(new String[]{"??5?", "??9", "?4", "6"})));
    System.out.println(Arrays.equals(new String[]{"98765432123456789", "7531975335791357", "284062868260482",
                                                  "02468044086420", "2604848484062", "864222222468", "40644444604", "4608888064", "068666860",
                                                  "64422446", "0864680", "840048", "24042", "6446", "080", "88", "6"},
        new RevealTriangle().calcTriangle(new String[]{"????????1????????", "7???????????????",
                                                       "???????????0???", "?????????8????", "2????????????", "????2???????", "???4???????",
                                                       "??????8???", "????6????", "???2????", "????6??",
                                                       "??0???", "??0??", "?4??", "??0", "8?", "6"})));
  }
}
