package p300.srm389;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 24.01.2008
 * Time: 15:17:52
 */
public class ApproximateDivision {
    public double quotient(int a, int b, int terms) {
        int t = 1;
        int n = 0;
        while (t < b) {
            t = t << 1;
            n++;
        }
        int c = t - b;
        long prev_c = 1l << 24;
        long result = 0;
        System.out.println("t = " + t);
        System.out.println("c = " + c);
        System.out.println("n = " + n);
        int prev_n = n;
        System.out.println("prev_n = " + prev_n);
        for (int i = 0; i < terms; i++) {
            result += (prev_c >> (prev_n));
//            System.out.println("result = " + result);
            prev_c *= c;
            prev_n += n;
            if (c == 0) {
                break;
            }
        }
//        double result2 = 0;
//        for (int i = 0; i < terms; i++) {
//            final double t2 = Math.pow((double) t, i + 1);
//            final double c2 = Math.pow((double) c, (double) i);
////            System.out.println("c2 = " + c2);
////            System.out.println("t2 = " + t2);
//            System.out.println("result2 = " + (result2 * ((long) 1 << 32)));
//            result2 += c2 / t2;
//        }
//        result2 *= a;
//        System.out.println(result2);
        final double res = ((double) a * result) / (1l << 24);
        System.out.println(res);
        System.out.println("");
        return res;
    }

    public static void main(String[] args) {
        final long start = System.currentTimeMillis();
        System.out.println("0.34375".equals("" + new ApproximateDivision().quotient(2, 5, 2)));
        System.out.println("0.34375".equals("" + new ApproximateDivision().quotient(7, 8, 5)));
        System.out.println("0.34375".equals("" + new ApproximateDivision().quotient(1, 3, 10)));
        System.out.println("0.34375".equals("" + new ApproximateDivision().quotient(1, 7, 20)));
        System.out.println(String.format("time: %.4f", (System.currentTimeMillis() - start) / 1000f));
    }
}
