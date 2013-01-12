package p300.srm330;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 19.04.2008
 * Time: 16:39:47
 */
public class Arrows {
    public int longestArrow(String s) {
        int n = 0, idx;
        int max = -1;
        while ((idx = s.indexOf(">", n)) != -1) {
            int len = 1;
            if (idx - 1 >= 0) {
                char c = s.charAt(idx - 1);
                if (c == '-' || c == '=') {
                    for (int i = idx - 1; i < s.length() && i >= 0 && s.charAt(i) == c; i--) {
                        len++;
                    }
                }
            }
            if (len > max) {
                max = len;
            }
            n = idx + 1;
        }

        n = s.length();
        while ((idx = s.lastIndexOf("<", n)) != -1) {
            int len = 1;
            if (idx + 1 < s.length()) {
                char c = s.charAt(idx + 1);
                if (c == '-' || c == '=') {
                    for (int i = idx + 1; i < s.length() && i >= 0 && s.charAt(i) == c; i++) {
                        len++;
                    }
                }
            }
            if (len > max) {
                max = len;
            }
            n = idx - 1;
        }
//        System.out.println("max = " + max);
        return max;
    }

    public static void main(String[] args) {
        System.out.println(4 == new Arrows().longestArrow("<--->--==>"));
        System.out.println(1 == new Arrows().longestArrow("<<<<<<<<<<"));
        System.out.println(-1 == new Arrows().longestArrow("----==-"));
        System.out.println(6 == new Arrows().longestArrow("<----=====>"));
    }
}
