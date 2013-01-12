package p300.srm386;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 05.01.2008
 * Time: 20:51:10
 */
public class CandidateKeys {
    public int[] getKeys(String[] table) {
        int w = table[0].length();
        int h = table.length;
        System.out.println("");
        int[] counter = new int[w];

        for (int cols = 0; cols < w; cols++) {
            int[] letters = new int[26];
            for (int i = 0; i < table.length; i++) {
                letters[table[i].charAt(cols) - 'A']++;
            }
            for (int i = 0; i < letters.length; i++) {
                int letter = letters[i];
                if (letter > 1) {
                    counter[cols] = 1;
                }
            }
            if (isSimilar(table, h, cols)) {
                counter[cols] = h;
            }
        }
        int maxLen = 0;
        int minLen = 0;
        for (int i : counter) {
            // if not exclude column
            if (i != h) {
                if (i == 0) {
                    minLen++;
                }
                if (i > 0) {
                    maxLen++;
                }
            }
        }
        maxLen = Math.max(maxLen, minLen);
        System.out.println("maxLen = " + maxLen);
        System.out.println("minLen = " + minLen);
        if (minLen > 0) {
            return new int[]{minLen, maxLen};
        } else {
            return new int[]{};
        }
    }

    private boolean isSimilar(String[] table, int h, int k) {
        for (int i = 1; i < h; i++) {
            if (table[i - 1].charAt(k) != table[i].charAt(k)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(new int[]{},
                new CandidateKeys().getKeys(new String[]{
                        "ABC",
                        "ABC",
                        "ABC"})));
        System.out.println(Arrays.equals(new int[]{1, 3},
                new CandidateKeys().getKeys(new String[]{
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
                new CandidateKeys().getKeys(new String[]{
                        "ABC",
                        "ABD",
                        "ABE"})));
        System.out.println(Arrays.equals(new int[]{1, 2},
                new CandidateKeys().getKeys(new String[]{
                        "ABC",
                        "ACD",
                        "BBE"})));
        System.out.println(Arrays.equals(new int[]{1, 2},
                new CandidateKeys().getKeys(new String[]{
                        "ACB",
                        "ADC",
                        "BEB"})));
    }
}
