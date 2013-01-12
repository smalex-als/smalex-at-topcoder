package p300.srm396;

import static java.lang.Math.min;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 06.04.2008
 * Time: 23:36:26
 */
public class DNAString {
    public int minChanges(int maxPeriod, String[] dna) {
        String s = "";
        for (int i = 0; i < dna.length; i++) {
            s += dna[i];
        }
        String look = "ACGT";
        int ret = Integer.MAX_VALUE;
        for (int p = 1; p <= maxPeriod; p++) {
            int tmp = 0;
            for (int i = 0; i < p; i++) {
                int[] cnt = new int[4];
                int tot = 0;
                for (int j = i; j < s.length(); j += p) {
                    final char c = s.charAt(j);
                    System.out.println("charAt(" + j + ") p = " + p + " c = " + c);
                    cnt[look.indexOf(c)]++;
                    tot++;
                }
                int cur = Integer.MAX_VALUE;
                for (int j = 0; j < cnt.length; j++) {
                    cur = min(cur, tot - cnt[j]);
                }
                tmp += cur;
            }
            ret = min(ret, tmp);
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(1 == new DNAString().minChanges(3, new String[]{"ATAGATA"}));
//        System.out.println(3 == new DNAString().minChanges(2, new String[]{"ACGTGCA"}));
    }
}
