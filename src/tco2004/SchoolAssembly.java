package tco2004;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 06.04.2008
 * Time: 18:46:02
 */
public class SchoolAssembly {
  public int getBeans(int kids, int quantity) {
    int result = 0;
    int colors[] = new int[5];
    while (kids > 0) {
      boolean found = false;
      for (int i = 0; i < colors.length; i++) {
        if (colors[i] >= quantity) {
          colors[i] -= quantity;
          kids--;
          found = true;
          break;
        }
      }
      if (!found) {
        result++;
        int c = 20;
        while (c > 0) {
          for (int i = 0; i < colors.length; i++) {
            if (c > 0 && colors[i] == 0) {
              if (c > quantity - 1) {
                colors[i] += quantity - 1;
                c -= quantity - 1;
              } else {
                colors[i] += c;
                c = 0;
                break;
              }
            }
          }
          for (int i = 0; i < colors.length; i++) {
            if (c > 0 && colors[i] == 0) {
              if (c > quantity - 1) {
                colors[i] += quantity - 1;
                c -= quantity - 1;
              } else {
                colors[i] += c;
                c = 0;
                break;
              }
            }
          }
        }
      }
    }
    System.out.println("result = " + result);
    return result;
  }

  public static void main(String[] args) {
//        System.out.println(2 == new SchoolAssembly().getBeans(1, 5));
//        System.out.println(1 == new SchoolAssembly().getBeans(1, 2));
    System.out.println(3 == new SchoolAssembly().getBeans(5, 5));
  }
}
