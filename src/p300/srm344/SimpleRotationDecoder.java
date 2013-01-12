package p300.srm344;

/**
 * Created by IntelliJ IDEA.
 * User: Tanya
 * Date: 14.04.2008
 * Time: 23:00:00
 */
public class SimpleRotationDecoder {
    public String decode(String cipherText) {
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                for (int k = 0; k < 26; k++) {
                    String password = "" + (char) ('a' + i) + (char) ('a' + j) + (char) ('a' + k);
                    String decrypted = decrypt(cipherText, password);
                    if (checkString(decrypted)) {
                        System.out.println("password = " + password);
                        System.out.println("decrypted = " + decrypted);
                        System.out.println("OK");
                        return decrypted;
                    }
                }
            }
        }
        return "";
    }

    private boolean checkString(String decrypted) {
        if (decrypted.charAt(0) == ' ') return false;
        if (decrypted.charAt(decrypted.length() - 1) == ' ') return false;
        for (int i = 1; i < decrypted.length() - 3; i++) {
            if (decrypted.charAt(i) == decrypted.charAt(i + 1) && decrypted.charAt(i + 1) == ' ') {
                return false;
            }
        }
        char [] vol = new char[]{'a', 'e', 'i', 'o', 'u'};
        for (String word : decrypted.split(" ")) {
            if (word.length() < 2 || word.length() > 8) {
                return false;
            }
            boolean found = false;
            for (char c : vol) {
                if (word.indexOf(c) != -1) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    private String decrypt(String text, String password) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            int chr = (int) text.charAt(i);
            if (chr == ' ') {
                chr = 0;
            } else {
                chr -= 'a' - 1;
            }
            int c = chr - (int) password.charAt(i % 3) + 'a' - 1;
            if (c < 0) c += 27;
            if (c == 0) {
                sb.append(' ');
            } else {
                sb.append((char)((c - 1) + 'a'));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("the quick brown fox jumps over the lazy dog again".equals(
                new SimpleRotationDecoder().decode("mmbtvrbhhtgohaktklqegnrmlelojotyeyeiudvtil ey ffg")));
        System.out.println("the quick brown fox jumps over the lazy dog again".equals(
                new SimpleRotationDecoder().decode("ntgntgntgntofwlfwlfwlnookookook")));
        System.out.println("naeiui jrghnca pnzxaxz avs".equals(
                new SimpleRotationDecoder().decode("shxnaaeqjlofhhsuurbhpdgt z")));
    }




}
