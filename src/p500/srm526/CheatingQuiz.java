package p500.srm526;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 12/6/11
 * Time: 9:19 PM
 */
public class CheatingQuiz {
  public int[] howMany(String answers) {
    int[] v = new int[3];
    v[0] = count(answers, 'A');
    v[1] = count(answers, 'B');
    v[2] = count(answers, 'C');
    int[] result = new int[answers.length()];

    for (int i = 0; i < answers.length(); i++) {
      char ch = answers.charAt(i);
      result[i] = getNotEmpty(v);
      v[ch - 'A']--;
    }

    return result;
  }

  private int getNotEmpty(int[] v) {
    int result = 0;
    for (int i = 0; i < v.length; i++) {
      if (v[i] > 0) {
        result++;
      }

    }
    return result;
  }

  private int count(String answers, char ch) {
    int result = 0;
    for (int i = 0; i < answers.length(); i++) {
      if (answers.charAt(i) == ch) {
        result++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(new CheatingQuiz().howMany("CAAAAAC")));
  }
}
