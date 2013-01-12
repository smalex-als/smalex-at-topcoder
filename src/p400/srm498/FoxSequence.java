package p400.srm498;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 2/26/11
 * Time: 8:19 PM
 */
public class FoxSequence {
  public String isValid(int[] seq) {
    int index = 0;
    index = whileInc(seq, index);
    if (index == -1) {
      return "NO";
    }
    index = whileDec(seq, index);
    if (index == -1) {
      return "NO";
    }
    index = whileEq(seq, index);
    index = whileInc(seq, index);
    if (index == -1) {
      return "NO";
    }
    index = whileDec(seq, index);
    if (index == -1) {
      return "NO";
    }
    return index == seq.length - 1 ? "YES" : "NO";
  }

  private int whileEq(int[] seq, int index) {
    for (; index < seq.length - 1; index++) {
      if (seq[index] != seq[index + 1]) {
        break;
      }
    }
    return index;
  }

  private int whileDec(int[] seq, int index) {
    int diff = 9999;
    int length = 0;
    for (; index < seq.length - 1; index++, length++) {
      if (diff == 9999) {
        diff = seq[index + 1] - seq[index];
      }
      if (seq[index] <= seq[index + 1] || diff != seq[index + 1] - seq[index]) {
        break;
      }
    }
    if (length == 0) {
      return -1;
    }
    return index;
  }

  private int whileInc(int[] seq, int index) {
    int diff = -9999;
    int length = 0;
    for (; index < seq.length - 1; index++, length++) {
      if (diff == -9999) {
        diff = seq[index + 1] - seq[index];
      }
      if (seq[index] >= seq[index + 1] || diff != seq[index + 1] - seq[index]) {
        break;
      }
    }
    if (length == 0) {
      return -1;
    }
    return index;
  }

  public static void main(String[] args) {
    System.out.println("YES".equals(new FoxSequence().isValid(new int[]{1, 3, 5, 7, 5, 3, 1, 1, 1, 3, 5, 7, 5, 3, 1})));
    System.out.println("NO".equals(new FoxSequence().isValid(new int[]{6, 1, 6})));
    System.out.println("NO".equals(new FoxSequence().isValid(new int[]{2000})));
  }
}
