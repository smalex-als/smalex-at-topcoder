package p300.srm386;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CandidateKeys3 {
    public int[] getKeys(String[] table) {
        int n = table[0].length();
        int N = 1 << n;
        int minv = n + 1, maxv = -1;
        boolean[] not_valid = new boolean[N];
        StringBuilder[] superKeys = new StringBuilder[table.length];
        for (int j = 0; j < superKeys.length; j++) {
            superKeys[j] = new StringBuilder();
        }
        for (int i = 1; i < N; ++i) {
            if (not_valid[i]) {
                continue;
            }
            createSuperKeys(table, superKeys, i, n);
            if (!hasUniqSuperKeys(superKeys)) {
                continue;
            }
            int len = superKeys[0].length();
            if (len > maxv)
                maxv = len;
            if (len < minv)
                minv = len;
            excludeSubSequences(not_valid, i, N);
        }
        if (minv > maxv) {
            return new int[0];
        }
        return new int[]{minv, maxv};
    }

    private void createSuperKeys(String[] table, StringBuilder[] superKeys, int i, int n) {
        for (StringBuilder entry : superKeys) {
            entry.setLength(0);
        }
        for (int j = 0; j < n; ++j) {
            if (((1 << j) & i) != 0) {
                for (int k = 0; k < table.length; ++k) {
                    superKeys[k].append(table[k].charAt(j));
                }
            }
        }
    }

    private void excludeSubSequences(boolean[] not_valid, int i, int n) {
        for (int j = i + 1; j < n; ++j) {
            if ((i & j) == i) {
                not_valid[j] = true;
            }
        }
    }

    private boolean hasUniqSuperKeys(StringBuilder[] superKeys) {
        Set<String> set = new HashSet<String>();
        for (StringBuilder superKey : superKeys) {
            set.add(superKey.toString());
        }
        return set.size() == superKeys.length;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(new int[]{},
                new CandidateKeys3().getKeys(new String[]{
                        "ABC",
                        "ABC",
                        "ABC"})));
        System.out.println(Arrays.equals(new int[]{1, 3},
                new CandidateKeys3().getKeys(new String[]{
                        "AABB",
                        "BABA",
                        "CAAB",
                        "DAAA",
                        "EBBB",
                        "FBBA",
                        "GBAB",
                        "HBAA"
                }
                )));
        System.out.println(Arrays.equals(new int[]{1, 1},
                new CandidateKeys3().getKeys(new String[]{
                        "ABC",
                        "ABD",
                        "ABE"})));
        System.out.println(Arrays.equals(new int[]{1, 2},
                new CandidateKeys3().getKeys(new String[]{
                        "ABC",
                        "ACD",
                        "BBE"})));
        System.out.println(Arrays.equals(new int[]{1, 2},
                new CandidateKeys3().getKeys(new String[]{
                        "ACB",
                        "ADC",
                        "BEB"})));
    }
}
