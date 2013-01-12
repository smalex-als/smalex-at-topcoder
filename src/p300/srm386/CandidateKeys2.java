package p300.srm386;

import java.util.Arrays;

public class CandidateKeys2 {
    public int[] getKeys(String[] table) {
        int[] ret = new int[2];
        ret[0] = 1000;
        boolean[] sup = new boolean[1 << table[0].length()];
        int n = table[0].length();

    outer:
        for (int i = 0; i < sup.length; i++) {
            for (int j = 0; j < n; j++) {
                if (((1 << j) & i) == 0) continue;
                if (sup[i ^ (1 << j)]) {
                    sup[i] = true;
                    continue outer;
                }
            }
            for (int a = 0; a < table.length; a++) {
                for (int b = a + 1; b < table.length; b++) {
                    boolean ok = false;
                    for (int k = 0; k < n; k++) {
                        if (((1 << k) & i) == 0) continue;
                        if (table[a].charAt(k) != table[b].charAt(k)) ok = true;
                    }
                    if (!ok) continue outer;
                }
            }
            sup[i] = true;
            ret[0] = Math.min(ret[0], Integer.bitCount(i));
            ret[1] = Math.max(ret[1], Integer.bitCount(i));
            continue outer;
        }
        if (ret[0] == 1000) return new int[0];
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(new int[]{1, 2},
                new CandidateKeys2().getKeys(new String[]{
                        "ABC",
                        "ACD",
                        "BBE"})));

    }
}
