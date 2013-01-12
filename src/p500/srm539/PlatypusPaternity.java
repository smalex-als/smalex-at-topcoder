package p500.srm539;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 4/4/12
 * Time: 9:11 PM
 */
public class PlatypusPaternity {
  public int maxFamily(String[] femaleCompatibility, String[] maleCompatibility, String[] siblingGroups) {
    int result = 0;
    for (int i = 0; i < maleCompatibility.length; i++) {
      String male = maleCompatibility[i];
      for (int j = 0; j < femaleCompatibility.length; j++) {
        String female = femaleCompatibility[j];
        for (int k = 0; k < siblingGroups.length; k++) {
          String sibling = siblingGroups[k];
          int tmpResult = 0;
          boolean fail = false;
          for (int n = 0; n < male.length(); n++) {
            if (sibling.charAt(n) == 'Y') {
              if (male.charAt(n) == 'Y' && female.charAt(n) == 'Y') {
                tmpResult++;
              } else {
                fail = true;
              }
            }
          }
          if (!fail) {
            result = Math.max(result, tmpResult);
          }
        }
      }
    }
    if (result != 0) {
      result += 2;
    }
    System.out.println("result = " + result);
    return result;
  }

  public static void main(String[] args) {
    System.out.println(5 == new PlatypusPaternity().maxFamily(
        new String[]{"YYYY", "YYYY"}, new String[]{"NNYN", "YYYN"}, new String[]{"YYYN", "NNNY"}));
  }
}
