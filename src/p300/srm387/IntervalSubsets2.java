package p300.srm387;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 10.01.2008
 * Time: 12:05:57
 */
public class IntervalSubsets2 {
    private int numberOfSubsets(int[] start, int[] finish) {
        int n = start.length;
        int[] c = new int[105];
        int[] d = new int[105];
        d[0] = 1;
        for (int i = 0; i <= 100; i++) {
            if (d[i] > 0) {
                int lmax = 100;
                for (int j = 0; j < n; j++) {
                    if (start[j] > i && finish[j] < lmax) {
                        lmax = finish[j];
                    }
                }
                for (int j = 0; j < n; j++) {
                    if (start[j] > i && start[j] <= lmax) {
                        System.out.println(String.format("[i=%d][lmax=%d] put at d[%d] = %d",
                                i, lmax, finish[j], d[i]));
                        d[finish[j]] += d[i];
                    }
                }
            }
        }
//        for (int i = 0; i < d.length; i++) {
//            if (d[i] > 0) {
//                System.out.println("d[" + i + "] = " + d[i]);
//            }
//        }

        int gmin = 0;
        for (int i = 0; i < n; i++) {
            gmin = Math.max(gmin, start[i]);
        }
        System.out.println("gmin = " + gmin);
        for (int i = 0; i < n; i++) {
            if (finish[i] >= gmin) {
                c[finish[i]] = 1;
            }
        }
        int ans = 0;
        for (int i = 0; i <= 100; i++) {
            final int i1 = c[i] * d[i];
            if (i1 > 0) {
                System.out.println(" i = " + i + " c = " + i1);
            }
            ans += i1;
        }
        System.out.println("ans = " + ans);
        return ans;
    }

    public static void main(String[] args) {
        final long start = System.currentTimeMillis();
        System.out.println(2 == new IntervalSubsets2().numberOfSubsets(new int[]{68, 25, 1, 1}, new int[]{75, 64, 2, 3}));
        System.out.println(2 == new IntervalSubsets2().numberOfSubsets(new int[]{4, 2, 3}, new int[]{4, 5, 3}));
        System.out.println(5 == new IntervalSubsets2().numberOfSubsets(new int[]{3, 4, 3, 2, 1}, new int[]{4, 5, 4, 5, 5}));
        System.out.println(4 == new IntervalSubsets2().numberOfSubsets(new int[]{1, 1, 3, 3}, new int[]{2, 2, 4, 4}));
        System.out.println(5 == new IntervalSubsets2().numberOfSubsets(new int[]{3, 4, 3, 2, 1}, new int[]{4, 5, 4, 5, 5}));
//        System.out.println(86093442 == new IntervalSubsets2().numberOfSubsets(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 16, 17, 17},
//                new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 16, 17, 17}));
//
//        System.out.println(58106 == new IntervalSubsets2().numberOfSubsets(new int[]{90, 88, 86, 84, 82, 80, 78, 76, 74, 72, 70, 68, 66, 64, 62, 60, 58, 56, 54, 52, 50, 48, 46, 44, 42, 40, 38, 36, 34, 32, 30, 28, 26, 24, 22, 20, 18, 16, 14, 12, 10, 8, 6, 4, 2},
//                new int[]{99, 97, 95, 93, 91, 89, 87, 85, 83, 81, 79, 77, 75, 73, 71, 69, 67, 65, 63, 61, 59, 57, 55, 53, 51, 49, 47, 45, 43, 41, 39, 37, 35, 33, 31, 29, 27, 25, 23, 21, 19, 17, 15, 13, 11}));
//        System.out.println(String.format("%.4f seconds", (System.currentTimeMillis() - start) / 1000.f));
    }
}
