package p300.srm341;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 25.01.2008
 * Time: 0:52:51
 */
public class KLastNonZeroDigits {
    public String getKDigits(int N, int K) {
        long F = 1;
        for (int i=1; i <= N; i++) {
            F *= i;
        }
        System.out.println("F = " + F);
        final String s = ("" + F).replaceAll("[0]{1," + K + "}$", "");
        final String r = s.substring(Math.max(s.length() - K, 0), s.length());
//        System.out.println("r = " + r);
        return r;
    }

    public static void main(String[] args) {
        System.out.println("288".equals(new KLastNonZeroDigits().getKDigits(10, 3)));
        System.out.println("2".equals(new KLastNonZeroDigits().getKDigits(6, 1)));
        System.out.println("72".equals(new KLastNonZeroDigits().getKDigits(6, 3)));
        System.out.println("04".equals(new KLastNonZeroDigits().getKDigits(7, 2)));
        System.out.println("200817664".equals(new KLastNonZeroDigits().getKDigits(20, 9)));
        System.out.println("1".equals(new KLastNonZeroDigits().getKDigits(1, 1)));
    }
}
