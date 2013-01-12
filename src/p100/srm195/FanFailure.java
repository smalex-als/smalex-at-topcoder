package p100.srm195;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Tanya
 * Date: 05.04.2008
 * Time: 9:14:10
 */
public class FanFailure {
    public int[] getRange(int[] capacities, int minCooling) {
        Arrays.sort(capacities);
        int cooling = 0;
        int maxFS = 0;
        if (minCooling == 0) {
            int[] arr = new int[2];
            Arrays.fill(arr, capacities.length);
            return arr;
        }
        for (int i = capacities.length - 1; i >= 0; i--) {
            cooling += capacities[i];
            if (cooling >= minCooling) {
                maxFS = i;
                break;
            }
        }

        int maxc = 0;
        cooling = 0;
        for (int i = 0; i < capacities.length; i++) {
            cooling += capacities[i];
            if (cooling >= minCooling) {
                maxc = capacities.length - i - 1;
                break;
            }
        }
        return new int[]{maxFS, maxc};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(new int[]{2, 1}, new FanFailure().getRange(new int[]{1, 2, 3}, 2)));
        System.out.println(Arrays.equals(new int[]{0, 0}, new FanFailure().getRange(new int[]{8, 5, 6, 7}, 22)));
    }
}
