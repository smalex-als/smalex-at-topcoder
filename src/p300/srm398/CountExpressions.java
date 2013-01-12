package p300.srm398;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 15.04.2008
 * Time: 15:09:21
 */
public class CountExpressions {
  private Set<String> set = new HashSet<String>();

  public int calcExpressions(int x, int y, int val) {
    set = new HashSet<String>();
    int op[] = new int[]{x, x, y, y};
    boolean used[] = new boolean[op.length];
    for (int i0 = 0; i0 < op.length; i0++) {
      used[i0] = true;
      for (int i1 = 0; i1 < op.length; i1++) {
        if (!used[i1]) {
          used[i1] = true;
          for (int i2 = 0; i2 < op.length; i2++) {
            if (!used[i2]) {
              used[i2] = true;
              for (int i3 = 0; i3 < op.length; i3++) {
                if (!used[i3]) {
                  iter(new int[]{op[i0], op[i1], op[i2], op[i3]}, val);
                }
              }
              used[i2] = false;
            }
          }
          used[i1] = false;
        }
      }
      used[i0] = false;
    }
    return set.size();
  }

  private void iter(int[] op, int val) {
    int cnt = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {
          int res = calc(op[0], op[1], i);
          res = calc(res, op[2], j);
          res = calc(res, op[3], k);
          if (res == val) {
            set.add(op[0] + decOperation(i) + op[1] + decOperation(j) + op[2] + decOperation(k) + op[3]);
          }
        }
      }
    }
  }

  private String decOperation(int i) {
    switch (i) {
      case 0:
        return "+";
      case 1:
        return "-";
      case 2:
        return "*";
    }
    return "";
  }

  private int calc(int res, int p, int i) {
    switch (i) {
      case 0:
        return res + p;
      case 1:
        return res - p;
      case 2:
        return res * p;
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(9 == new CountExpressions().calcExpressions(7, 8, 16));
    System.out.println(5 == new CountExpressions().calcExpressions(3, 5, 7));
    System.out.println(6 == new CountExpressions().calcExpressions(99, 100, 98010000));
    System.out.println(2 == new CountExpressions().calcExpressions(-99, 42, -1764));
    System.out.println(0 == new CountExpressions().calcExpressions(100, -100, -100000000));
    System.out.println(17 == new CountExpressions().calcExpressions(1, 2, 5));
  }
}
