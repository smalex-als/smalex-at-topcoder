package p500.srm503;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 4/16/11
 * Time: 8:03 PM
 */
public class ToastXRaspberry {
  public int apply(int upper_limit, int layer_count) {
    int result = 0;
    while (layer_count > 0) {
      layer_count -= upper_limit;
      result++;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(4 == new ToastXRaspberry().apply(4, 13));
  }
}
