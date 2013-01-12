package p400.srm461;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 13.02.2010
 * Time: 20:20:12
 */
public class NameInput {
  private String predictionSequence;
  private String name;

  public int countUpDownKeyPresses(String[] inPredictionSequence, String[] inName) {
    predictionSequence = join(inPredictionSequence);
    name = join(inName);
//    System.out.println("predictionSequence1 = " + predictionSequence);
//    System.out.println("name = " + name);
    int result = 0;
    int[][] map = new int[name.length() + 1][predictionSequence.length() + 1];
    for (int j = 1; j <= name.length(); j++) {
      final char c = name.charAt(j - 1);
      for (int i = 1; i <= predictionSequence.length(); i++) {
        int min = 99999;
        int minIndex = -1;
        for (int k = 0; k < predictionSequence.length(); k++) {
          if (predictionSequence.charAt(k) == c) {
            if (min > Math.abs(k - (i - 1))) {
              min = Math.abs(k - (i - 1));
              minIndex = k;
            } else if (min > Math.abs(predictionSequence.length() - k + (i - 1))) {
              min = Math.abs(predictionSequence.length() - k + (i - 1));
              minIndex = k;
            }
          }
        }
        if (minIndex == -1) {
          return -1;
        }
        map[j][i] = map[j - 1][i] + minInc(predictionSequence, i - 1, minIndex);
//        System.out.println("minIndex = " + minIndex);
//        System.out.println("min = " + min);
//
//        final int index0 = predictionSequence.indexOf(c, i - 1);
//        final int index1 = predictionSequence.lastIndexOf(c, i - 1);
//        System.out.println("c = " + c);
//        System.out.println("index0 = " + index0);
//        System.out.println("index1 = " + index1);
//        if (index0 == -1 && index1 == -1) {
//          return -1;
//        }
//        final int inc0 = index0 == -1 ? 999999 : minInc(predictionSequence, i - 1, index0);
//        final int inc1 = index1 == -1 ? 999999 : minInc(predictionSequence, i - 1, index1);
//        if (inc0 < inc1) {
//          map[j][i] = map[j - 1][i] + index0;
//        } else {
//          map[j][i] = map[j - 1][i] + index1;
//        }
      }
    }
    System.out.println("result = " + result);
    return result;
  }


  public int countUpDownKeyPresses2(String[] inPredictionSequence, String[] inName) {
    String predictionSequence = join(inPredictionSequence);
    String name = join(inName);
//    System.out.println("predictionSequence1 = " + predictionSequence);
//    System.out.println("name = " + name);
    int result = 0;
    int pos = 0;
    for (int i = 0; i < name.length(); i++) {
      final int index0 = predictionSequence.indexOf(name.charAt(i), pos);
      final int index1 = predictionSequence.lastIndexOf(name.charAt(i), pos);
      if (index0 == -1 && index1 == -1) {
        return -1;
      }
      final int inc0 = index0 == -1 ? 999999 : minInc(predictionSequence, pos, index0);
      final int inc1 = index1 == -1 ? 999999 : minInc(predictionSequence, pos, index1);
      if (inc0 < inc1) {
        result += inc0;
        pos = index0;
      } else {
        result += inc1;
        pos = index1;
      }
    }
    System.out.println("result = " + result);
    return result;
  }

  private int minInc(String predictionSequence, int pos, int index0) {
    return Math.min(Math.abs((index0 - pos) % predictionSequence.length()),
        Math.abs((predictionSequence.length() - (index0 - pos)) % predictionSequence.length()));
  }

  private String join(String[] pieces) {
    StringBuilder sb = new StringBuilder();
    for (String piece : pieces) {
      sb.append(piece);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
//    System.out.println(5 == new NameInput().countUpDownKeyPresses(new String[]{"Jjhon"}, new String[]{"John"}));
//    System.out.println(186 == new NameInput().countUpDownKeyPresses(new String[]{"abcdefghijklmnopqrstuvwxyz","ABCDEFGHIJKLMNOPQRSTUVWXYZ","0123456789"}, new String[]{"Joh","nAndFr","iends"}));
    System.out.println(16 == new NameInput().countUpDownKeyPresses(new String[]{"aaaabbbab", "baabbabaabba"}, new String[]{"bbaaababba", "baababababbb"}));
//    System.out.println(-1 == new NameInput().countUpDownKeyPresses(new String[]{"john"}, new String[]{"John"}));
//    System.out.println(0 == new NameInput().countUpDownKeyPresses(new String[]{"4"}, new String[]{"4444444444444"}));
//    System.out.println(38 == new NameInput().countUpDownKeyPresses(new String[]{"abcABC123","cbaCBA321"}, new String[]{"aB32C2AaB3c","c32bA"}));
  }
}
