package p300.srm397;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 12.04.2008
 * Time: 20:24:13
 */
public class BreakingTheCode {
    public String decodingEncoding(String code, String message) {
        StringBuffer sb = new StringBuffer();
        if (message.length() == 0) {
            return "";
        }
        if (message.charAt(0) >= '0' && message.charAt(0) <= '9') {
            for (int i = 0; i < message.length(); i += 2) {
                int c = new Integer(message.substring(i, i + 2));
                sb.append(code.charAt(c - 1));
            }
        } else {
            for (int i = 0; i < message.length(); i++) {
                sb.append(String.format("%02d", (int)code.indexOf(message.charAt(i)) + 1));
            }
        }
        System.out.println("sb = " + sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("20051920".equals(new BreakingTheCode().decodingEncoding("abcdefghijklmnopqrstuvwxyz", "test")));
        System.out.println("test".equals(new BreakingTheCode().decodingEncoding("abcdefghijklmnopqrstuvwxyz", "20051920")));
        System.out.println("ahxpwmtvza".equals(new BreakingTheCode().decodingEncoding("faxmswrpnqdbygcthuvkojizle", "02170308060416192402")));
        System.out.println("19242626171202251723".equals(new BreakingTheCode().decodingEncoding("qesdfvujrockgpthzymbnxawli", "mwiizkelza")));
    }
}
