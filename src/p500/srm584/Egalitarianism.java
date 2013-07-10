package p500.srm584;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 7/10/13
 * Time: 3:28 PM
 */
public class Egalitarianism {
  public int maxDifference(String[] isFriend, int d) {
    int max = 0;
    for (int i = 0; i < isFriend.length; i++) {
      ArrayList<Integer> deque = new ArrayList<Integer>();
      ArrayList<Integer> path = new ArrayList<Integer>();
      deque.add(i);
      path.add(0);
      int pos = 0;
      while (pos < deque.size()) {
        int i1 = pos++;
        Integer p = deque.get(i1);
        Integer curPath = path.get(i1);
        for (int n = 0; n < isFriend[p].length(); n++) {
          if (isFriend[p].charAt(n) == 'Y' && !deque.contains(n)) {
            deque.add(n);
            path.add(curPath + 1);
          }
        }
      }
      for (Integer integer : path) {
        max = Math.max(integer, max);
      }
      if (path.size() != isFriend.length) {
        return -1;
      }
    }
    return max * d;
  }

  public static void main(String[] args) {
    System.out.println(20 == new Egalitarianism().maxDifference(new String[]{"NYN", "YNY", "NYN"}, 10));
    System.out.println(3000 == new Egalitarianism().maxDifference(new String[]{"NNYNNN", "NNYNNN", "YYNYNN", "NNYNYY", "NNNYNN", "NNNYNN"}, 1000));
    System.out.println(-1 == new Egalitarianism().maxDifference(new String[]{"NNYN", "NNNY", "YNNN", "NYNN"}, 584));
  }
}
