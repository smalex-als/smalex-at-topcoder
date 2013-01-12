package p300.srm308;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 19.04.2008
 * Time: 21:03:50
 */
public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        int offset = 0;
        String result = "";
        while (offset < archive.length()) {
            final String str = archive.substring(offset);
            for (int i = 0; i < dictionary.length; i++) {
                if (str.startsWith(dictionary[i])) {
                    result += (char) (i + 'A');
                    offset += dictionary[i].length();
                    break;
                }
            }
        }
        System.out.println("result = " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("BDC".equals(new HuffmanDecoding().decode("101101", new String[]{"00","10","01","11"})));
        System.out.println("CBAC".equals(new HuffmanDecoding().decode("10111010", new String[]{"0","111","10"})));
        System.out.println("BBBABBAABBABBAAABBA".equals(new HuffmanDecoding().decode("0001001100100111001", new String[]{"1","0"})));
        System.out.println("DBHABBACAIAIC".equals(new HuffmanDecoding().decode("001101100101100110111101011001011001010",
                new String[]{"110","011","10","0011","00011","111","00010","0010","010","0000"})));
    }
}
