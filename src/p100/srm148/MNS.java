package p100.srm148;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Tanya
 * Date: 09.02.2008
 * Time: 22:55:12
 */
public class MNS {
    private Set<String> sets = new HashSet<String>();
    private boolean[] fixed;
    private int[] cur;
    private int[] numbers;

    public 	int combos(int[] numbers) {
        this.numbers = numbers;
        fixed = new boolean[numbers.length];
        cur = new int[numbers.length];
        go(0);
        for (String key : sets) {
            System.out.println("key = " + key);
        }
        return sets.size();
    }

    private void go(int idx) {
        if (idx == numbers.length) {
            int c = cur[0] + cur[1] + cur[2];
            if (cur[3] + cur[4] + cur[5] == c && cur[6] + cur[7] + cur[8] == c
                    && cur[0] + cur[3] + cur[6] == c && cur[1] + cur[4] + cur[7] == c && cur[2] + cur[5] + cur[8] == c) {
                sets.add(Arrays.toString(cur));
            }
        }
        for (int j = 0; j < numbers.length; j++) {
            if (!fixed[j]) {
                cur[idx] = numbers[j];
                fixed[j] = true;
                go(idx + 1);
                fixed[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new MNS().combos(new int[]{1,2,3,3,2,1,2,2,2}));
//        System.out.println(new MNS().combos(new int[]{1,2,3,4,5}));
    }
}
