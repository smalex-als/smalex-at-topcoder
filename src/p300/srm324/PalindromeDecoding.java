package p300.srm324;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 19.04.2008
 * Time: 17:32:24
 */
public class PalindromeDecoding {
    public String decode(String code, int[] position, int[] length) {
        StringBuilder sb = new StringBuilder(code);

        for (int i = 0; i < position.length; i++) {
            final StringBuilder str = new StringBuilder(sb.substring(position[i], length[i] + position[i]));
            sb.insert(position[i] + length[i], str.reverse().toString());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("abba".equals(new PalindromeDecoding().decode("ab", new int[]{0}, new int[]{2})));
        System.out.println("Mississippi".equals(new PalindromeDecoding().decode("Misip", new int[]{2,3,1,7}, new int[]{1,1,2,2})));
        System.out.println("XYYXXYYXXYYXXYYXXYYXXYYXXYYXXYYX".equals(new PalindromeDecoding().decode("XY", new int[]{0, 0, 0, 0}, new int[]{2, 4, 8, 16})));
    }
}
