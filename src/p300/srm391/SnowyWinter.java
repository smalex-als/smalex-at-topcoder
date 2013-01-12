package p300.srm391;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 27.02.2008
 * Time: 22:55:38
 */
public class SnowyWinter {
    public int snowyHighwayLength(int[] startPoints, int[] endPoints) {
        boolean m[] = new boolean[10000];
        for (int i = 0; i < startPoints.length; i++) {
            for (int j = startPoints[i]; j < endPoints[i]; j++) {
                m[j] = true;
            }
        }
        int ret = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i]) {
                ret++;
            }
        }
        System.out.println("ret = " + ret);
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(44 == new SnowyWinter().snowyHighwayLength(new int[]{17, 85, 57}, new int[]{33, 86, 84}));
        System.out.println(132 == new SnowyWinter().snowyHighwayLength(new int[]{45, 100, 125, 10, 15, 35, 30, 9},
                new int[]{46, 200, 175, 20, 25, 45, 40, 10}));
        System.out.println(9691 == new SnowyWinter().snowyHighwayLength(new int[]{4387,711,2510,1001,4687,3400,5254,584,284,1423,3755,929,2154,5719,1326,2368,554},
                new int[]{7890,5075,2600,6867,7860,9789,6422,5002,4180,7086,8615,9832,4169,7188,9975,8690,1423}));
        System.out.println(9813 == new SnowyWinter().snowyHighwayLength(new int[]{8786,7391,201,4414,5822,5872,157,1832,7487,7518,2267,1763,3984,3102,7627,4099,524,1543,1022,3060},
                                new int[]{9905,7957,3625,6475,9314,9332,4370,8068,8295,8177,7772,2668,7191,8480,9211,4802,2625,1924,9970,4180}));
        System.out.println(10000 == new SnowyWinter().snowyHighwayLength(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                new int[]{10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000}));


        // 24 3 5
        // 25 15 6
    }
}
