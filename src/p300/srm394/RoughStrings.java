package p300.srm394;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 28.04.2008
 * Time: 0:23:39
 */
public class RoughStrings {
    public int minRoughness(String s, int n) {
        int m[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            m[s.charAt(i) - 'a']++;
        }
        int index;
        while (n > 0) {
            int r0 = 0, r1 = 0;
            index = getMinIndex(m);
            n--;
            m[index]--;
            r0 = getRoughness(m);
            if (r0 == 0) {
                break;
            }
            n++;
            m[index]++;
            index = getMaxIndex(m);
            n--;
            m[index]--;
            r1 = getRoughness(m);
            if (r1 == 0) {
                break;
            }
            n++;
            m[index]++;

            index = r0 < r1 ? getMinIndex(m) : getMaxIndex(m);
            n--;
            m[index]--;
        }
//        System.out.println(Arrays.toString(m));
        int roughness = getRoughness(m);
//        System.out.println("roughness = " + roughness);
        return roughness;
    }

    private int getRoughness(int[] m) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > 0) {
                max = Math.max(m[i], max);
                min = Math.min(m[i], min);
            }
        }
//        System.out.println(Arrays.toString(m));
//        System.out.println("min = " + min);
//        System.out.println("max = " + max);
        return max - min;
    }

    private int getMinIndex(int[] m) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > 0 && min > m[i]) {
                min = m[i];
                index = i;
            }
        }
        return index;
    }

    private int getMaxIndex(int[] m) {
        int max = 0;
        int index = -1;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > 0 && max < m[i]) {
                max = m[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(3 == new RoughStrings().minRoughness("aaaaabbc", 1));
        System.out.println(0 == new RoughStrings().minRoughness("aaaabbbbc", 5));
        System.out.println(2 == new RoughStrings().minRoughness("veryeviltestcase", 1));
        System.out.println(0 == new RoughStrings().minRoughness("bbbccca", 2));
        System.out.println(0 == new RoughStrings().minRoughness("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 17));
        System.out.println(3 == new RoughStrings().minRoughness("gggggggooooooodddddddllllllluuuuuuuccckkk", 5));
    }
}
