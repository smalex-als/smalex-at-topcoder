package p400.srm460;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 18.03.2010
 * Time: 8:11:25
 */
public class TheQuestionsAndAnswersDivTwo {
  public int find(String[] questions) {
    return 1 << new HashSet(Arrays.asList(questions)).size();
  }

  public static void main(String[] args) {
    System.out.println(4 == new TheQuestionsAndAnswersDivTwo().find(
        new String[]{"How_are_you_doing?", "How_do_you_like_our_country?", "How_are_you_doing?"}));
    System.out.println(16 == new TheQuestionsAndAnswersDivTwo().find(
        new String[]{"Do_you_like_my_story?", "Do_you_like_my_story", "DO_YOU_LIKE_MY_STORY?", "Do__you__like__my__story?"}));
    System.out.println(2 == new TheQuestionsAndAnswersDivTwo().find(new String[]{"Whazzup?"}));
  }
}
