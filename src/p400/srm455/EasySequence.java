package p400.srm455;

import java.util.LinkedList;
import java.util.List;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 3/29/11
 * Time: 1:48 PM
 */
public class EasySequence {

  private List<Integer> a;
  private int sum;

  public int find(int[] A, int[] B) {
    int N = A.length;
    int M = B.length;
    a = new LinkedList<Integer>();
    sum = 0;
    for (int i : A) {
      a.add(i);
      sum += i;
    }
    if (N < M) {
      for (int i = 0; i < M - N; i++) {
        next(N);
      }
    }
    for (int i = 0; i < 50000; i++) {
      if (matched(a, B)) {
        return i;
      }
      next(N);
      a.remove(0);
    }
    return -1;
  }

  private void next(int N) {
    int newPos = a.size();
    a.add(sum % 10);
    sum -= a.get(newPos - N);
    sum += a.get(newPos);
  }

  public boolean matched(List<Integer> a, int B[]) {
    for (int i = 0; i < B.length; i++) {
      if (a.get(i) != B[i]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    ExampleRunner.eq(1, 5, new EasySequence().find(new int[]{1, 2, 3}, new int[]{0, 7, 8, 5}));
    ExampleRunner.eq(2, -1, new EasySequence().find(new int[]{1, 2, 8}, new int[]{7, 4, 2, 3}));
    ExampleRunner.eq(3, 3, new EasySequence().find(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5}));
    ExampleRunner.eq(4, 147, new EasySequence().find(new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{1, 3, 1, 1, 9, 1, 9, 5, 9, 5, 9, 7, 5, 9}));
    ExampleRunner.eq(5, 9371, new EasySequence().find(new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{5, 9, 9, 9, 9, 9, 9, 9, 3, 7, 5, 1, 3, 7, 5, 1, 9, 1, 7, 3, 3, 9, 3, 5, 1, 1, 5, 7, 1, 3, 3, 1, 1, 1, 7, 7, 3, 3, 3, 5, 9, 7, 7, 7, 1, 9, 5, 5, 1, 5}));
    ExampleRunner.eq(6, -1, new EasySequence().find(new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{5, 9, 9, 9, 9, 9, 9, 9, 3, 7, 5, 1, 3, 7, 5, 1, 9, 1, 7, 3, 3, 9, 3, 5, 1, 1, 5, 7, 1, 3, 3, 1, 1, 1, 7, 7, 3, 3, 3, 5, 9, 7, 7, 7, 1, 9, 5, 5, 1, 6}));
    ExampleRunner.eq(7, -1, new EasySequence().find(new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{1, 2, 3, 4, 5}));
    ExampleRunner.eq(8, 18668, new EasySequence().find(new int[]{1, 2, 3, 4, 5, 9, 7}, new int[]{7, 3, 1, 3, 9, 2, 5, 0, 3, 3, 5, 7, 5, 8, 1, 2, 1, 9, 3, 9, 3, 8, 5, 8, 5, 1, 9, 9, 5, 2, 9, 0, 5, 9, 9, 9, 3, 4, 9, 8, 1, 3, 7, 5, 7, 0, 1, 4, 7}));
    ExampleRunner.eq(9, -1, new EasySequence().find(new int[]{1, 2, 3, 4, 5, 9, 7}, new int[]{1, 3, 8, 7, 9, 5, 4}));
    ExampleRunner.eq(10, 0, new EasySequence().find(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}));
    ExampleRunner.eq(11, 0, new EasySequence().find(new int[]{0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0}));
    ExampleRunner.eq(12, 3, new EasySequence().find(new int[]{1, 2, 5, 2, 6}, new int[]{2, 6, 6}));
    ExampleRunner.eq(13, 10, new EasySequence().find(new int[]{1, 9, 9, 9, 2, 3}, new int[]{7}));
    ExampleRunner.eq(14, 28, new EasySequence().find(new int[]{7, 8}, new int[]{4}));
    ExampleRunner.eq(15, 18556, new EasySequence().find(new int[]{4, 2, 4, 8, 7, 2, 1}, new int[]{3, 0, 9, 4, 0, 2, 0, 8, 3, 6, 3, 2, 4, 6, 2, 6, 9, 2, 1, 0, 6, 6, 0, 4, 9, 6, 1, 2, 8, 0, 0, 6, 3, 0, 9, 6, 4, 8, 6, 6, 9, 8, 7, 8, 2, 6, 6}));
    ExampleRunner.eq(16, -1, new EasySequence().find(new int[]{0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));
    ExampleRunner.eq(17, 0, new EasySequence().find(new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    ExampleRunner.eq(18, 0, new EasySequence().find(new int[]{1}, new int[]{1, 1, 1}));
    ExampleRunner.eq(19, 788, new EasySequence().find(new int[]{1, 2, 3, 4}, new int[]{6, 2, 3, 2, 3, 0, 8, 3, 4, 5, 0, 2, 1, 8, 1, 2, 2, 3, 8, 5, 8, 4, 5, 2, 9, 0, 6, 7, 2, 5, 0, 4, 1, 0, 5, 0, 6, 1, 2, 9, 8, 0, 9, 6}));
    ExampleRunner.eq(20, 6, new EasySequence().find(new int[]{1, 7}, new int[]{1, 9, 0, 9, 9, 8, 7, 5, 2, 7, 9, 6, 5, 1, 6, 7, 3, 0}));
    ExampleRunner.eq(21, 0, new EasySequence().find(new int[]{7}, new int[]{7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7}));
    ExampleRunner.eq(22, 12243, new EasySequence().find(new int[]{1, 5, 9, 9, 8, 2, 3}, new int[]{7, 2, 2, 5, 3, 9, 1, 9, 1, 0, 8, 1, 9, 9, 7, 5, 9, 8, 8, 5, 1, 3, 9, 3, 7, 6, 4, 3, 5, 7, 5, 7, 7, 8, 2, 1, 7, 7, 9, 1, 5, 2, 2, 3, 9, 1, 3, 5}));
    ExampleRunner.eq(23, 224, new EasySequence().find(new int[]{1, 5, 9, 9, 8, 2, 3}, new int[]{9, 3, 7, 5, 0, 0, 9, 3, 7, 1, 5, 5, 0, 0, 1, 9, 1, 1, 7, 9, 8, 6, 1, 3, 5, 9, 1, 3, 8, 0, 9, 5, 5}));
    ExampleRunner.eq(24, -1, new EasySequence().find(new int[]{1, 5, 9, 9, 8, 2, 3}, new int[]{9, 3, 7, 5, 0, 0, 9, 3, 7, 1, 5, 5, 0, 0, 1, 9, 1, 1, 7, 9, 8, 6, 1, 3, 5, 9, 1, 3, 8, 0, 9, 5, 5, 8}));
    ExampleRunner.eq(25, 1182, new EasySequence().find(new int[]{7, 8, 9, 4, 2, 7}, new int[]{3, 7, 6, 5, 8, 8, 7, 1, 5, 4, 3, 8, 8, 9, 7, 9, 4, 5, 2, 6, 3, 9, 9, 4, 3, 4, 2, 1, 3, 7, 0, 7, 0, 8, 5, 7, 7, 4, 1, 2, 6, 7, 7, 7}));
    ExampleRunner.eq(26, 1182, new EasySequence().find(new int[]{7, 8, 9, 4, 2, 7}, new int[]{3, 7, 6, 5, 8, 8, 7, 1, 5, 4, 3, 8, 8, 9, 7, 9, 4, 5, 2, 6, 3, 9, 9, 4, 3, 4, 2, 1, 3, 7, 0, 7, 0, 8, 5, 7, 7, 4, 1, 2, 6, 7, 7, 7}));
    ExampleRunner.eq(27, 750, new EasySequence().find(new int[]{4, 7, 2, 8, 3}, new int[]{8, 3, 2, 0, 3, 6, 4, 5, 8, 6, 9, 2, 0, 5, 2, 8, 7, 2, 4, 3, 4, 0, 3, 4, 4, 5, 6, 2, 1, 8, 2, 9, 2, 2, 3, 8, 4, 9, 6, 0, 7, 6, 8, 7}));
    ExampleRunner.eq(28, 1519, new EasySequence().find(new int[]{6, 5, 2, 1, 0, 9, 4}, new int[]{1, 0, 5, 0, 9, 0, 7, 2, 3, 6, 7, 4, 9, 8, 9, 6, 9, 2, 7, 0, 1, 4, 9, 2, 5, 8, 9, 8, 5, 6, 3, 4, 3, 8, 7, 6, 7, 8, 3, 2, 1, 4, 1, 6, 5, 2, 1, 0, 9, 4}));
    ExampleRunner.eq(29, 18631, new EasySequence().find(new int[]{5, 2, 9, 2, 5, 4, 2}, new int[]{3, 1, 6, 3, 4, 7, 2, 6, 9, 7, 8, 3, 2, 7, 2, 8, 7, 7, 6, 9, 6, 5, 8, 8, 9, 1, 6, 3, 0, 5, 2, 6, 3, 5, 4, 5, 0, 5, 8, 0, 7, 9, 4, 3, 6, 7, 6, 2, 7, 5}));
    ExampleRunner.eq(30, 18631, new EasySequence().find(new int[]{3, 8, 9, 0, 4, 3, 2}, new int[]{1, 1, 8, 1, 4, 0, 3, 8, 5, 9, 0, 9, 4, 8, 3, 8, 1, 3, 6, 3, 2, 6, 9, 0, 9, 5, 4, 5, 8, 0, 1, 2, 5, 5, 6, 7, 6, 2, 3, 4, 3, 1, 6, 5, 4, 6, 9, 4, 5, 9}));
    ExampleRunner.eq(31, 18631, new EasySequence().find(new int[]{4, 8, 9, 0, 4, 3, 2}, new int[]{6, 6, 8, 5, 6, 0, 7, 8, 0, 4, 0, 5, 4, 8, 9, 0, 0, 6, 2, 9, 4, 0, 1, 2, 4, 2, 2, 5, 6, 2, 3, 4, 4, 6, 0, 5, 4, 6, 9, 4, 4, 2, 4, 3, 2, 8, 7, 0, 6, 0}));
    ExampleRunner.eq(32, 18631, new EasySequence().find(new int[]{5, 8, 9, 0, 4, 3, 2}, new int[]{1, 1, 8, 9, 8, 0, 1, 8, 5, 9, 0, 1, 4, 8, 5, 2, 9, 9, 8, 5, 6, 4, 3, 4, 9, 9, 0, 5, 4, 4, 5, 6, 3, 7, 4, 3, 2, 0, 5, 4, 5, 3, 2, 1, 0, 0, 5, 6, 7, 1}));
    ExampleRunner.eq(33, 18631, new EasySequence().find(new int[]{6, 8, 9, 0, 4, 3, 2}, new int[]{6, 6, 8, 3, 0, 0, 5, 8, 0, 4, 0, 7, 4, 8, 1, 4, 8, 2, 4, 1, 8, 8, 5, 6, 4, 6, 8, 5, 2, 6, 7, 8, 2, 8, 8, 1, 0, 4, 1, 4, 6, 4, 0, 9, 8, 2, 3, 2, 8, 2}));
    ExampleRunner.eq(34, 18631, new EasySequence().find(new int[]{7, 8, 9, 0, 4, 3, 2}, new int[]{1, 1, 8, 7, 2, 0, 9, 8, 5, 9, 0, 3, 4, 8, 7, 6, 7, 5, 0, 7, 0, 2, 7, 8, 9, 3, 6, 5, 0, 8, 9, 0, 1, 9, 2, 9, 8, 8, 7, 4, 7, 5, 8, 7, 6, 4, 1, 8, 9, 3}));
    ExampleRunner.eq(35, 18631, new EasySequence().find(new int[]{8, 8, 9, 0, 4, 3, 2}, new int[]{6, 6, 8, 1, 4, 0, 3, 8, 0, 4, 0, 9, 4, 8, 3, 8, 6, 8, 6, 3, 2, 6, 9, 0, 4, 0, 4, 5, 8, 0, 1, 2, 0, 0, 6, 7, 6, 2, 3, 4, 8, 6, 6, 5, 4, 6, 9, 4, 0, 4}));
    ExampleRunner.eq(36, 18631, new EasySequence().find(new int[]{9, 8, 9, 0, 4, 3, 2}, new int[]{1, 1, 8, 5, 6, 0, 7, 8, 5, 9, 0, 5, 4, 8, 9, 0, 5, 1, 2, 9, 4, 0, 1, 2, 9, 7, 2, 5, 6, 2, 3, 4, 9, 1, 0, 5, 4, 6, 9, 4, 9, 7, 4, 3, 2, 8, 7, 0, 1, 5}));
    ExampleRunner.eq(37, 18631, new EasySequence().find(new int[]{0, 9, 9, 0, 4, 3, 2}, new int[]{9, 6, 3, 3, 4, 2, 5, 2, 5, 4, 5, 7, 0, 8, 1, 0, 5, 6, 7, 7, 4, 0, 9, 8, 1, 6, 5, 3, 2, 4, 9, 0, 9, 2, 9, 5, 8, 2, 5, 0, 1, 0, 1, 7, 6, 0, 5, 0, 9, 8}));
    ExampleRunner.eq(38, 18631, new EasySequence().find(new int[]{1, 9, 9, 0, 4, 3, 2}, new int[]{4, 1, 3, 7, 6, 2, 9, 2, 0, 9, 5, 3, 0, 8, 7, 2, 4, 9, 3, 3, 6, 4, 1, 0, 6, 3, 3, 3, 0, 6, 1, 2, 8, 3, 3, 3, 6, 6, 1, 0, 2, 1, 9, 5, 4, 2, 3, 6, 0, 9}));
    ExampleRunner.eq(39, 18631, new EasySequence().find(new int[]{2, 9, 9, 0, 4, 3, 2}, new int[]{9, 6, 3, 1, 8, 2, 3, 2, 5, 4, 5, 9, 0, 8, 3, 4, 3, 2, 9, 9, 8, 8, 3, 2, 1, 0, 1, 3, 8, 8, 3, 4, 7, 4, 7, 1, 4, 0, 7, 0, 3, 2, 7, 3, 2, 4, 1, 2, 1, 0}));
    ExampleRunner.eq(40, 18631, new EasySequence().find(new int[]{3, 9, 9, 0, 4, 3, 2}, new int[]{4, 1, 3, 5, 0, 2, 7, 2, 0, 9, 5, 5, 0, 8, 9, 6, 2, 5, 5, 5, 0, 2, 5, 4, 6, 7, 9, 3, 6, 0, 5, 6, 6, 5, 1, 9, 2, 4, 3, 0, 4, 3, 5, 1, 0, 6, 9, 8, 2, 1}));
    ExampleRunner.eq(41, 18631, new EasySequence().find(new int[]{4, 9, 9, 0, 4, 3, 2}, new int[]{9, 6, 3, 9, 2, 2, 1, 2, 5, 4, 5, 1, 0, 8, 5, 8, 1, 8, 1, 1, 2, 6, 7, 6, 1, 4, 7, 3, 4, 2, 7, 8, 5, 6, 5, 7, 0, 8, 9, 0, 5, 4, 3, 9, 8, 8, 7, 4, 3, 2}));
    ExampleRunner.eq(42, 18631, new EasySequence().find(new int[]{5, 9, 9, 0, 4, 3, 2}, new int[]{4, 1, 3, 3, 4, 2, 5, 2, 0, 9, 5, 7, 0, 8, 1, 0, 0, 1, 7, 7, 4, 0, 9, 8, 6, 1, 5, 3, 2, 4, 9, 0, 4, 7, 9, 5, 8, 2, 5, 0, 6, 5, 1, 7, 6, 0, 5, 0, 4, 3}));
    ExampleRunner.eq(43, 18631, new EasySequence().find(new int[]{6, 9, 9, 0, 4, 3, 2}, new int[]{9, 6, 3, 7, 6, 2, 9, 2, 5, 4, 5, 3, 0, 8, 7, 2, 9, 4, 3, 3, 6, 4, 1, 0, 1, 8, 3, 3, 0, 6, 1, 2, 3, 8, 3, 3, 6, 6, 1, 0, 7, 6, 9, 5, 4, 2, 3, 6, 5, 4}));
    ExampleRunner.eq(44, 18631, new EasySequence().find(new int[]{7, 9, 9, 0, 4, 3, 2}, new int[]{4, 1, 3, 1, 8, 2, 3, 2, 0, 9, 5, 9, 0, 8, 3, 4, 8, 7, 9, 9, 8, 8, 3, 2, 6, 5, 1, 3, 8, 8, 3, 4, 2, 9, 7, 1, 4, 0, 7, 0, 8, 7, 7, 3, 2, 4, 1, 2, 6, 5}));
    ExampleRunner.eq(45, 18631, new EasySequence().find(new int[]{8, 9, 9, 0, 4, 3, 2}, new int[]{9, 6, 3, 5, 0, 2, 7, 2, 5, 4, 5, 5, 0, 8, 9, 6, 7, 0, 5, 5, 0, 2, 5, 4, 1, 2, 9, 3, 6, 0, 5, 6, 1, 0, 1, 9, 2, 4, 3, 0, 9, 8, 5, 1, 0, 6, 9, 8, 7, 6}));
    ExampleRunner.eq(46, 18631, new EasySequence().find(new int[]{9, 9, 9, 0, 4, 3, 2}, new int[]{4, 1, 3, 9, 2, 2, 1, 2, 0, 9, 5, 1, 0, 8, 5, 8, 6, 3, 1, 1, 2, 6, 7, 6, 6, 9, 7, 3, 4, 2, 7, 8, 0, 1, 5, 7, 0, 8, 9, 0, 0, 9, 3, 9, 8, 8, 7, 4, 8, 7}));
    ExampleRunner.eq(47, 18631, new EasySequence().find(new int[]{0, 0, 0, 1, 4, 3, 2}, new int[]{4, 8, 6, 0, 7, 6, 5, 6, 8, 8, 0, 0, 3, 0, 5, 4, 0, 2, 4, 8, 3, 6, 7, 0, 0, 8, 2, 6, 9, 2, 7, 4, 8, 8, 4, 2, 5, 8, 9, 4, 0, 2, 0, 8, 1, 4, 9, 4, 8, 4}));
    ExampleRunner.eq(48, 18631, new EasySequence().find(new int[]{1, 0, 0, 1, 4, 3, 2}, new int[]{9, 3, 6, 4, 9, 6, 9, 6, 3, 3, 0, 6, 3, 0, 1, 6, 9, 5, 0, 4, 5, 0, 9, 2, 5, 5, 0, 6, 7, 4, 9, 6, 7, 9, 8, 0, 3, 2, 5, 4, 1, 3, 8, 6, 9, 6, 7, 0, 9, 5}));
    ExampleRunner.eq(49, 18631, new EasySequence().find(new int[]{2, 0, 0, 1, 4, 3, 2}, new int[]{4, 8, 6, 8, 1, 6, 3, 6, 8, 8, 0, 2, 3, 0, 7, 8, 8, 8, 6, 0, 7, 4, 1, 4, 0, 2, 8, 6, 5, 6, 1, 8, 6, 0, 2, 8, 1, 6, 1, 4, 2, 4, 6, 4, 7, 8, 5, 6, 0, 6}));
    ExampleRunner.eq(50, 18631, new EasySequence().find(new int[]{3, 0, 0, 1, 4, 3, 2}, new int[]{9, 3, 6, 2, 3, 6, 7, 6, 3, 3, 0, 8, 3, 0, 3, 0, 7, 1, 2, 6, 9, 8, 3, 6, 5, 9, 6, 6, 3, 8, 3, 0, 5, 1, 6, 6, 9, 0, 7, 4, 3, 5, 4, 2, 5, 0, 3, 2, 1, 7}));
    ExampleRunner.eq(51, 18631, new EasySequence().find(new int[]{4, 0, 0, 1, 4, 3, 2}, new int[]{4, 8, 6, 6, 5, 6, 1, 6, 8, 8, 0, 4, 3, 0, 9, 2, 6, 4, 8, 2, 1, 2, 5, 8, 0, 6, 4, 6, 1, 0, 5, 2, 4, 2, 0, 4, 7, 4, 3, 4, 4, 6, 2, 0, 3, 2, 1, 8, 2, 8}));
    ExampleRunner.eq(52, 18631, new EasySequence().find(new int[]{5, 0, 0, 1, 4, 3, 2}, new int[]{9, 3, 6, 0, 7, 6, 5, 6, 3, 3, 0, 0, 3, 0, 5, 4, 5, 7, 4, 8, 3, 6, 7, 0, 5, 3, 2, 6, 9, 2, 7, 4, 3, 3, 4, 2, 5, 8, 9, 4, 5, 7, 0, 8, 1, 4, 9, 4, 3, 9}));
    ExampleRunner.eq(53, 18631, new EasySequence().find(new int[]{6, 0, 0, 1, 4, 3, 2}, new int[]{4, 8, 6, 4, 9, 6, 9, 6, 8, 8, 0, 6, 3, 0, 1, 6, 4, 0, 0, 4, 5, 0, 9, 2, 0, 0, 0, 6, 7, 4, 9, 6, 2, 4, 8, 0, 3, 2, 5, 4, 6, 8, 8, 6, 9, 6, 7, 0, 4, 0}));
    ExampleRunner.eq(54, 18631, new EasySequence().find(new int[]{7, 0, 0, 1, 4, 3, 2}, new int[]{9, 3, 6, 8, 1, 6, 3, 6, 3, 3, 0, 2, 3, 0, 7, 8, 3, 3, 6, 0, 7, 4, 1, 4, 5, 7, 8, 6, 5, 6, 1, 8, 1, 5, 2, 8, 1, 6, 1, 4, 7, 9, 6, 4, 7, 8, 5, 6, 5, 1}));
    ExampleRunner.eq(55, 18631, new EasySequence().find(new int[]{8, 0, 0, 1, 4, 3, 2}, new int[]{4, 8, 6, 2, 3, 6, 7, 6, 8, 8, 0, 8, 3, 0, 3, 0, 2, 6, 2, 6, 9, 8, 3, 6, 0, 4, 6, 6, 3, 8, 3, 0, 0, 6, 6, 6, 9, 0, 7, 4, 8, 0, 4, 2, 5, 0, 3, 2, 6, 2}));
    ExampleRunner.eq(56, 18631, new EasySequence().find(new int[]{9, 0, 0, 1, 4, 3, 2}, new int[]{9, 3, 6, 6, 5, 6, 1, 6, 3, 3, 0, 4, 3, 0, 9, 2, 1, 9, 8, 2, 1, 2, 5, 8, 5, 1, 4, 6, 1, 0, 5, 2, 9, 7, 0, 4, 7, 4, 3, 4, 9, 1, 2, 0, 3, 2, 1, 8, 7, 3}));
    ExampleRunner.eq(57, 9259, new EasySequence().find(new int[]{0, 1, 0, 1, 4, 3, 2}, new int[]{7, 8, 1, 4, 3, 8, 9, 0, 3, 8, 5, 6, 9, 0, 1, 2, 1, 4, 3, 0, 1, 2, 3, 4, 7, 0, 7, 4, 7, 2, 1, 8, 9, 8, 9, 4, 1, 0, 9, 0, 1, 4, 9, 4, 7, 4, 9, 8, 5, 6}));
    ExampleRunner.eq(58, 18631, new EasySequence().find(new int[]{1, 1, 0, 1, 4, 3, 2}, new int[]{2, 3, 1, 8, 5, 8, 3, 0, 8, 3, 5, 2, 9, 0, 7, 4, 0, 7, 9, 6, 3, 6, 5, 6, 2, 7, 5, 4, 5, 4, 3, 0, 8, 9, 3, 2, 9, 4, 5, 0, 2, 5, 7, 2, 5, 6, 7, 4, 6, 7}));
    ExampleRunner.eq(59, 9259, new EasySequence().find(new int[]{2, 1, 0, 1, 4, 3, 2}, new int[]{7, 8, 1, 2, 7, 8, 7, 0, 3, 8, 5, 8, 9, 0, 3, 6, 9, 0, 5, 2, 5, 0, 7, 8, 7, 4, 3, 4, 3, 6, 5, 2, 7, 0, 7, 0, 7, 8, 1, 0, 3, 6, 5, 0, 3, 8, 5, 0, 7, 8}));
    ExampleRunner.eq(60, 18631, new EasySequence().find(new int[]{3, 1, 0, 1, 4, 3, 2}, new int[]{2, 3, 1, 6, 9, 8, 1, 0, 8, 3, 5, 4, 9, 0, 9, 8, 8, 3, 1, 8, 7, 4, 9, 0, 2, 1, 1, 4, 1, 8, 7, 4, 6, 1, 1, 8, 5, 2, 7, 0, 4, 7, 3, 8, 1, 0, 3, 6, 8, 9}));
    ExampleRunner.eq(61, 9259, new EasySequence().find(new int[]{4, 1, 0, 1, 4, 3, 2}, new int[]{7, 8, 1, 0, 1, 8, 5, 0, 3, 8, 5, 0, 9, 0, 5, 0, 7, 6, 7, 4, 9, 8, 1, 2, 7, 8, 9, 4, 9, 0, 9, 6, 5, 2, 5, 6, 3, 6, 3, 0, 5, 8, 1, 6, 9, 2, 1, 2, 9, 0}));
    ExampleRunner.eq(62, 18631, new EasySequence().find(new int[]{5, 1, 0, 1, 4, 3, 2}, new int[]{2, 3, 1, 4, 3, 8, 9, 0, 8, 3, 5, 6, 9, 0, 1, 2, 6, 9, 3, 0, 1, 2, 3, 4, 2, 5, 7, 4, 7, 2, 1, 8, 4, 3, 9, 4, 1, 0, 9, 0, 6, 9, 9, 4, 7, 4, 9, 8, 0, 1}));
    ExampleRunner.eq(63, 9259, new EasySequence().find(new int[]{6, 1, 0, 1, 4, 3, 2}, new int[]{7, 8, 1, 8, 5, 8, 3, 0, 3, 8, 5, 2, 9, 0, 7, 4, 5, 2, 9, 6, 3, 6, 5, 6, 7, 2, 5, 4, 5, 4, 3, 0, 3, 4, 3, 2, 9, 4, 5, 0, 7, 0, 7, 2, 5, 6, 7, 4, 1, 2}));
    ExampleRunner.eq(64, 18631, new EasySequence().find(new int[]{7, 1, 0, 1, 4, 3, 2}, new int[]{2, 3, 1, 2, 7, 8, 7, 0, 8, 3, 5, 8, 9, 0, 3, 6, 4, 5, 5, 2, 5, 0, 7, 8, 2, 9, 3, 4, 3, 6, 5, 2, 2, 5, 7, 0, 7, 8, 1, 0, 8, 1, 5, 0, 3, 8, 5, 0, 2, 3}));
    ExampleRunner.eq(65, 9259, new EasySequence().find(new int[]{8, 1, 0, 1, 4, 3, 2}, new int[]{7, 8, 1, 6, 9, 8, 1, 0, 3, 8, 5, 4, 9, 0, 9, 8, 3, 8, 1, 8, 7, 4, 9, 0, 7, 6, 1, 4, 1, 8, 7, 4, 1, 6, 1, 8, 5, 2, 7, 0, 9, 2, 3, 8, 1, 0, 3, 6, 3, 4}));
    ExampleRunner.eq(66, 18631, new EasySequence().find(new int[]{9, 1, 0, 1, 4, 3, 2}, new int[]{2, 3, 1, 0, 1, 8, 5, 0, 8, 3, 5, 0, 9, 0, 5, 0, 2, 1, 7, 4, 9, 8, 1, 2, 2, 3, 9, 4, 9, 0, 9, 6, 0, 7, 5, 6, 3, 6, 3, 0, 0, 3, 1, 6, 9, 2, 1, 2, 4, 5}));
    ExampleRunner.eq(67, 18631, new EasySequence().find(new int[]{0, 2, 0, 1, 4, 3, 2}, new int[]{0, 8, 6, 8, 9, 0, 3, 4, 8, 8, 0, 2, 5, 0, 7, 0, 2, 6, 2, 2, 9, 8, 9, 8, 4, 2, 2, 2, 5, 2, 5, 2, 0, 8, 4, 6, 7, 2, 9, 6, 2, 6, 8, 0, 3, 4, 9, 2, 2, 8}));
    ExampleRunner.eq(68, 18631, new EasySequence().find(new int[]{1, 2, 0, 1, 4, 3, 2}, new int[]{5, 3, 6, 2, 1, 0, 7, 4, 3, 3, 0, 8, 5, 0, 3, 2, 1, 9, 8, 8, 1, 2, 1, 0, 9, 9, 0, 2, 3, 4, 7, 4, 9, 9, 8, 4, 5, 6, 5, 6, 3, 7, 6, 8, 1, 6, 7, 8, 3, 9}));
    ExampleRunner.eq(69, 18631, new EasySequence().find(new int[]{2, 2, 0, 1, 4, 3, 2}, new int[]{0, 8, 6, 6, 3, 0, 1, 4, 8, 8, 0, 4, 5, 0, 9, 4, 0, 2, 4, 4, 3, 6, 3, 2, 4, 6, 8, 2, 1, 6, 9, 6, 8, 0, 2, 2, 3, 0, 1, 6, 4, 8, 4, 6, 9, 8, 5, 4, 4, 0}));
    ExampleRunner.eq(70, 18631, new EasySequence().find(new int[]{3, 2, 0, 1, 4, 3, 2}, new int[]{5, 3, 6, 0, 5, 0, 5, 4, 3, 3, 0, 0, 5, 0, 5, 6, 9, 5, 0, 0, 5, 0, 5, 4, 9, 3, 6, 2, 9, 8, 1, 8, 7, 1, 6, 0, 1, 4, 7, 6, 5, 9, 2, 4, 7, 0, 3, 0, 5, 1}));
    ExampleRunner.eq(71, 18631, new EasySequence().find(new int[]{4, 2, 0, 1, 4, 3, 2}, new int[]{0, 8, 6, 4, 7, 0, 9, 4, 8, 8, 0, 6, 5, 0, 1, 8, 8, 8, 6, 6, 7, 4, 7, 6, 4, 0, 4, 2, 7, 0, 3, 0, 6, 2, 0, 8, 9, 8, 3, 6, 6, 0, 0, 2, 5, 2, 1, 6, 6, 2}));
    ExampleRunner.eq(72, 18631, new EasySequence().find(new int[]{5, 2, 0, 1, 4, 3, 2}, new int[]{5, 3, 6, 8, 9, 0, 3, 4, 3, 3, 0, 2, 5, 0, 7, 0, 7, 1, 2, 2, 9, 8, 9, 8, 9, 7, 2, 2, 5, 2, 5, 2, 5, 3, 4, 6, 7, 2, 9, 6, 7, 1, 8, 0, 3, 4, 9, 2, 7, 3}));
    ExampleRunner.eq(73, 18631, new EasySequence().find(new int[]{6, 2, 0, 1, 4, 3, 2}, new int[]{0, 8, 6, 2, 1, 0, 7, 4, 8, 8, 0, 8, 5, 0, 3, 2, 6, 4, 8, 8, 1, 2, 1, 0, 4, 4, 0, 2, 3, 4, 7, 4, 4, 4, 8, 4, 5, 6, 5, 6, 8, 2, 6, 8, 1, 6, 7, 8, 8, 4}));
    ExampleRunner.eq(74, 18631, new EasySequence().find(new int[]{7, 2, 0, 1, 4, 3, 2}, new int[]{5, 3, 6, 6, 3, 0, 1, 4, 3, 3, 0, 4, 5, 0, 9, 4, 5, 7, 4, 4, 3, 6, 3, 2, 9, 1, 8, 2, 1, 6, 9, 6, 3, 5, 2, 2, 3, 0, 1, 6, 9, 3, 4, 6, 9, 8, 5, 4, 9, 5}));
    ExampleRunner.eq(75, 18631, new EasySequence().find(new int[]{8, 2, 0, 1, 4, 3, 2}, new int[]{0, 8, 6, 0, 5, 0, 5, 4, 8, 8, 0, 0, 5, 0, 5, 6, 4, 0, 0, 0, 5, 0, 5, 4, 4, 8, 6, 2, 9, 8, 1, 8, 2, 6, 6, 0, 1, 4, 7, 6, 0, 4, 2, 4, 7, 0, 3, 0, 0, 6}));
    ExampleRunner.eq(76, 18631, new EasySequence().find(new int[]{9, 2, 0, 1, 4, 3, 2}, new int[]{5, 3, 6, 4, 7, 0, 9, 4, 3, 3, 0, 6, 5, 0, 1, 8, 3, 3, 6, 6, 7, 4, 7, 6, 9, 5, 4, 2, 7, 0, 3, 0, 1, 7, 0, 8, 9, 8, 3, 6, 1, 5, 0, 2, 5, 2, 1, 6, 1, 7}));
    ExampleRunner.eq(77, 9259, new EasySequence().find(new int[]{0, 3, 0, 1, 4, 3, 2}, new int[]{3, 8, 1, 2, 5, 2, 7, 8, 3, 8, 5, 8, 1, 0, 3, 8, 3, 8, 1, 4, 7, 4, 5, 2, 1, 4, 7, 0, 3, 2, 9, 6, 1, 8, 9, 8, 3, 4, 9, 2, 3, 8, 7, 6, 9, 4, 9, 6, 9, 0}));
    ExampleRunner.eq(78, 18631, new EasySequence().find(new int[]{1, 3, 0, 1, 4, 3, 2}, new int[]{8, 3, 1, 6, 7, 2, 1, 8, 8, 3, 5, 4, 1, 0, 9, 0, 2, 1, 7, 0, 9, 8, 7, 4, 6, 1, 5, 0, 1, 4, 1, 8, 0, 9, 3, 6, 1, 8, 5, 2, 4, 9, 5, 4, 7, 6, 7, 2, 0, 1}));
    ExampleRunner.eq(79, 9259, new EasySequence().find(new int[]{2, 3, 0, 1, 4, 3, 2}, new int[]{3, 8, 1, 0, 9, 2, 5, 8, 3, 8, 5, 0, 1, 0, 5, 2, 1, 4, 3, 6, 1, 2, 9, 6, 1, 8, 3, 0, 9, 6, 3, 0, 9, 0, 7, 4, 9, 2, 1, 2, 5, 0, 3, 2, 5, 8, 5, 8, 1, 2}));
    ExampleRunner.eq(80, -1, new EasySequence().find(new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9}));
    ExampleRunner.eq(81, 974, new EasySequence().find(new int[]{4, 4, 7, 4, 0, 2}, new int[]{4, 5, 0, 2, 8, 9, 8, 2, 9, 8, 4, 0, 1, 4, 6, 3, 8, 2, 4}));
    ExampleRunner.eq(82, -1, new EasySequence().find(new int[]{9, 8, 7, 6, 5, 4, 3}, new int[]{1, 2, 3, 4, 5, 6, 7}));
    ExampleRunner.eq(83, -1, new EasySequence().find(new int[]{9, 8, 7, 6, 5, 4, 3}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    ExampleRunner.eq(84, 76, new EasySequence().find(new int[]{9, 8, 7, 6, 5, 4, 3}, new int[]{1, 2}));
    ExampleRunner.eq(85, 12, new EasySequence().find(new int[]{9, 8, 7, 6, 5, 4, 3}, new int[]{1}));
    ExampleRunner.eq(86, -1, new EasySequence().find(new int[]{9, 8, 7, 6, 5, 4, 3}, new int[]{1, 4, 7, 6, 2, 5}));
    ExampleRunner.eq(87, 3352, new EasySequence().find(new int[]{9, 8, 7, 6, 5, 4, 3}, new int[]{1, 2, 3, 4, 5}));
    ExampleRunner.eq(88, 1102, new EasySequence().find(new int[]{9, 8, 7, 6, 5, 4, 3}, new int[]{1, 2, 3, 4}));
    ExampleRunner.eq(89, -1, new EasySequence().find(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 8}));
    ExampleRunner.eq(90, 1, new EasySequence().find(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4, 5, 5, 9}));
    ExampleRunner.eq(91, 4, new EasySequence().find(new int[]{1, 2, 3, 4}, new int[]{0, 9, 6, 9, 4, 8}));
    ExampleRunner.eq(92, 3, new EasySequence().find(new int[]{1, 2, 3}, new int[]{6, 1, 0}));
    ExampleRunner.eq(93, 2, new EasySequence().find(new int[]{1, 2}, new int[]{3, 5, 8, 3}));
    ExampleRunner.eq(94, -1, new EasySequence().find(new int[]{9}, new int[]{1}));
    ExampleRunner.eq(95, 0, new EasySequence().find(new int[]{1}, new int[]{1, 1, 1}));
    ExampleRunner.eq(96, 3965, new EasySequence().find(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{0, 3, 0, 3, 4}));
    ExampleRunner.eq(97, -1, new EasySequence().find(new int[]{5, 5, 5}, new int[]{1}));
    ExampleRunner.eq(98, -1, new EasySequence().find(new int[]{1, 2, 8}, new int[]{7, 4, 2, 3}));
    ExampleRunner.eq(99, -1, new EasySequence().find(new int[]{1, 2, 3}, new int[]{1, 2, 3, 7}));
    ExampleRunner.eq(100, 18512, new EasySequence().find(new int[]{4, 1, 1, 6, 0, 4, 5}, new int[]{0, 5, 7, 4, 8, 2, 7, 3, 6, 7, 7, 0, 2, 2, 7, 1, 6, 5, 3, 6, 0, 8, 9, 7, 8, 1, 9, 2, 4, 0, 1, 5, 2, 3, 7, 2, 0, 0, 9, 3, 4, 5, 3, 4, 8, 6, 3, 3, 2, 9}));
    ExampleRunner.eq(101, 9322, new EasySequence().find(new int[]{1, 2, 1, 4, 7, 8, 9}, new int[]{9, 6, 5, 0, 9, 2, 5, 6, 3, 0, 5, 0, 1, 0, 5, 4, 5, 0, 5, 0, 9, 8, 1, 8, 1, 2, 9, 8, 7, 6, 1, 4, 7, 2, 5, 2, 7, 8, 5, 6, 5, 8, 1, 0, 3, 8, 1, 6, 7, 6}));
    ExampleRunner.eq(102, 2263, new EasySequence().find(new int[]{1, 2, 3, 4, 5}, new int[]{0, 7, 8, 5}));
    ExampleRunner.eq(103, 18000, new EasySequence().find(new int[]{2, 5, 1, 9, 4, 6, 7}, new int[]{2, 1, 5, 3, 6, 6, 5, 8, 4, 7, 9, 5, 4, 2, 9, 0, 6, 5, 1, 7, 0, 8, 7, 4, 2, 9, 7, 7}));
    ExampleRunner.eq(104, 5, new EasySequence().find(new int[]{1, 2, 3}, new int[]{0, 7, 8, 5}));
    ExampleRunner.eq(105, 0, new EasySequence().find(new int[]{9}, new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9}));
    ExampleRunner.eq(106, 18711, new EasySequence().find(new int[]{7, 3, 9, 4, 5, 8, 7}, new int[]{5, 9, 5, 5, 6, 5, 4, 9, 3, 7, 9, 3, 0, 5, 6, 3, 3, 9, 9, 5, 0, 5, 4, 5, 7, 5, 1, 7, 4, 3, 2, 9, 1, 7, 3, 9, 4, 5, 8, 7, 3, 9, 5, 1, 8, 1, 4, 1, 9, 9}));
    ExampleRunner.eq(107, 15024, new EasySequence().find(new int[]{1, 2, 3, 6, 8, 9, 4}, new int[]{9, 4, 3, 8, 6, 1, 6, 7, 5, 6}));
    ExampleRunner.eq(108, -1, new EasySequence().find(new int[]{1, 2, 3, 4, 5, 9, 7}, new int[]{4, 5, 3, 7, 4, 9, 8, 1, 0, 3, 6, 5, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9}));
    ExampleRunner.eq(109, 100, new EasySequence().find(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{7, 8, 5, 4}));
    ExampleRunner.eq(110, -1, new EasySequence().find(new int[]{1}, new int[]{1, 2, 1}));
    ExampleRunner.eq(111, 1956, new EasySequence().find(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 2, 3, 2}));
    ExampleRunner.eq(112, 1556, new EasySequence().find(new int[]{1, 2, 8, 6}, new int[]{0, 6, 0, 5}));
    ExampleRunner.eq(113, -1, new EasySequence().find(new int[]{1, 7, 3, 6, 0, 9, 2}, new int[]{0, 7, 8, 5, 9, 6, 2, 9, 6, 5, 1, 1, 1, 3, 5, 6, 8, 6, 5, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}));
    ExampleRunner.eq(114, 0, new EasySequence().find(new int[]{1}, new int[]{1}));
    ExampleRunner.eq(115, 7999, new EasySequence().find(new int[]{5, 9, 4, 6, 7, 1, 8}, new int[]{0, 3, 9, 0, 8, 7, 7, 4, 8, 3, 7, 4, 0, 3, 9, 4, 0, 7, 7, 0, 0}));
    ExampleRunner.eq(116, 75, new EasySequence().find(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{6, 9, 8, 9, 6, 7, 0, 5}));
    ExampleRunner.eq(117, 467, new EasySequence().find(new int[]{1, 6, 5, 3}, new int[]{9, 9, 9, 5, 2}));
    ExampleRunner.eq(118, 9329, new EasySequence().find(new int[]{9, 8, 7, 6, 5, 4, 3}, new int[]{2, 5, 4, 7, 6, 5, 4, 3, 4, 3, 2, 7, 8, 1, 8, 3, 2, 1, 0, 3, 8, 5, 2, 1, 0, 9, 8, 3, 8, 1, 0, 9, 8, 7, 6, 9, 0, 9, 8, 7, 6, 5, 4, 9, 8, 7, 6, 5, 4, 3}));
    ExampleRunner.eq(119, -1, new EasySequence().find(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    ExampleRunner.eq(120, 101, new EasySequence().find(new int[]{1, 2, 3, 4, 5, 7}, new int[]{4, 5, 9}));
    ExampleRunner.eq(121, 3, new EasySequence().find(new int[]{2, 3, 4}, new int[]{9, 6, 9, 4, 9, 2, 5, 6, 3, 4, 3, 0}));
    ExampleRunner.eq(122, 0, new EasySequence().find(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4}));
    ExampleRunner.eq(123, 5, new EasySequence().find(new int[]{1, 2, 3, 4}, new int[]{9}));
    ExampleRunner.eq(124, 1123, new EasySequence().find(new int[]{2, 1, 8, 3}, new int[]{7, 4, 2, 3}));
    ExampleRunner.eq(125, -1, new EasySequence().find(new int[]{2, 2, 2, 2, 2, 2}, new int[]{6}));
    ExampleRunner.eq(126, 18701, new EasySequence().find(new int[]{5, 2, 1, 7, 3, 8, 4}, new int[]{4, 4, 8, 5, 0, 5, 7, 3, 2, 0, 2, 9, 8, 1, 5, 7, 2, 4, 6, 3, 8, 5, 5, 3, 4, 4, 2, 1, 4, 3, 1, 9, 4, 4, 6, 1, 8, 3, 5, 1, 8, 2, 8, 5, 2, 1, 7, 3, 8, 4}));
    ExampleRunner.eq(127, 66, new EasySequence().find(new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{9, 1, 3}));
    ExampleRunner.eq(128, 202, new EasySequence().find(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 0, 7}));
    ExampleRunner.eq(129, 12001, new EasySequence().find(new int[]{4, 5, 6, 7, 8, 9, 1}, new int[]{5, 8, 1, 2, 9, 9, 8}));
    ExampleRunner.eq(130, 2, new EasySequence().find(new int[]{1, 2, 2, 3}, new int[]{2, 3}));
    ExampleRunner.eq(131, 0, new EasySequence().find(new int[]{1}, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    ExampleRunner.eq(132, 4752, new EasySequence().find(new int[]{1, 2, 8, 7, 8, 9, 0}, new int[]{7, 4, 2, 3, 4}));
    ExampleRunner.eq(133, -1, new EasySequence().find(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{3, 4, 5, 6, 1, 3, 4, 5, 3, 4, 3, 4, 5, 6, 1, 3, 4, 5, 3, 4, 3, 4, 5, 6, 1, 3, 4, 5, 3, 4, 3, 4, 5, 6, 1, 3, 4, 5, 3, 4, 3, 4, 5, 6, 1, 3, 4, 5, 3, 4}));
  }
}
