package p100.srm146;

/**
 * Created by IntelliJ IDEA.
 * User: Tanya
 * Date: 07.02.2008
 * Time: 22:28:25
 */
public class BridgeCrossing {
    int[] side;
    int[] times;
    private int n;
    private int besttime = Integer.MAX_VALUE >> 1;

    int minTime(int[] times) {
        this.times = times;
        n = times.length;
        side = new int[n];
        System.out.println("besttime = " + besttime);
        go(0, n);
        System.out.println("besttime = " + besttime);
        return besttime;
    }

    private void go(int time, int left) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (side[i] == 0 && side[j] == 0) {
                    side[i] = side[j] = 1;
                    int t = time + Math.max(times[i], times[j]);
                    if (left == 2) {
                        if (t < besttime) {
                            besttime = t;
                        }
                    } else {
                        for (int k = 0; k < n; k++) {
                            if (side[k] == 1) {
                                side[k] = 0;
                                go(t + times[k], left - 1);
                                side[k] = 1;
                            }
                        }
                    }
                    side[i] = side[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(17 == new BridgeCrossing().minTime(new int[]{ 1, 2, 5, 10 }));
        System.out.println(302 == new BridgeCrossing().minTime(new int[]{1,25,26,98,99,100}));
        System.out.println(162 == new BridgeCrossing().minTime(new int[]{ 1, 2, 3, 50, 99, 100 }));
    }
}
