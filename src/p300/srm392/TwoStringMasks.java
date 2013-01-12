package p300.srm392;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 19.04.2008
 * Time: 22:19:34
 */
public class TwoStringMasks {
    public String shortestCommon(String s0, String s1) {
        // Petr algorithm
        for (int l1 = 0; l1 <= 150; l1++) {
            int l2 = s0.length() + l1 - s1.length();
            if (l2 < 0) {
                continue;
            }
            String tmp1 = createTmpString(s0, l1);
            String tmp2 = createTmpString(s1, l2);
            if (tmp1.length() != tmp2.length()) {
                throw new RuntimeException("tmp1.length() != tmp2.length()");
            }
            System.out.println("tmp1 = " + tmp1);
            System.out.println("tmp2 = " + tmp2);
            String res = "";

            for (int i = 0; i < tmp1.length(); i++) {
                final char c1 = tmp1.charAt(i);
                final char c2 = tmp2.charAt(i);
                if (c1 == '?' && c2 == '?') {
                    // ok, just skip
                } else if (c1 == '?') {
                    res += c2;
                } else if (c2 == '?') {
                    res += c1;
                } else if (c1 == c2) {
                    res += c1;
                } else {
                    res = null;
                    break;
                }
            }
            if (res != null) {
                return res;
            }
        }
        return "impossible";
    }

    private String createTmpString(String s0, int l1) {
        String tmp1 = "";
        for (int i = 0; i < s0.length(); i++) {
            if (s0.charAt(i) == '*') {
                for (int j = 0; j < l1; j++) {
                    tmp1 += "?";
                }
            } else {
                tmp1 += s0.charAt(i);
            }
        }
        return tmp1;
    }

    public static void main(String[] args) {
        runTest("TOPC*DER", "T*PCODER", "TOPCODER");
        runTest("HELLO*", "HI*", "impossible");
        runTest("GOOD*LUCK", "*", "GOODLUCK");
        runTest("*SAMPLETEST", "THIRDSAMPLE*", "THIRDSAMPLETEST");
        runTest("*TOP", "*CODER", "impossible");
        runTest("LASTCASE*", "*LASTCASE", "LASTCASE");
        runTest("A*", "*B", "AB");
    }

    private static void runTest(String a, String b, String c) {
        System.out.println(c.equals(new TwoStringMasks().shortestCommon(a, b)));
    }
}
