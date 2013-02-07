package p500.srm569;

import utils.ExampleRunner;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 2/7/13
 * Time: 6:30 AM
 */
public class TheDeviceDiv2 {
  public String identify(String[] plates) {

    for (int j = 0; j < plates[0].length(); j++) {
      int cnt0 = 0;
      int cnt1 = 0;
      for (int i = 0; i < plates.length; i++) {
        String plate = plates[i];
        if (plate.charAt(j) == '0') {
          cnt0++;
        } else if (plate.charAt(j) == '1') {
          cnt1++;
        }
      }
      if (!(cnt0 >= 1 && cnt1 >= 2)) {
        return "NO";
      }
    }

    return "YES";
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, "NO", new TheDeviceDiv2().identify(new String[]{"010", "011", "000"}));
    ExampleRunner.eq(1, "YES", new TheDeviceDiv2().identify(new String[]{"1", "0", "1", "0"}));
  }
}
