package p300.srm396;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 03.04.2008
 * Time: 19:02:10
 */
public class VerifyCreditCard {
    private String invalid = "INVALID";
    private String valid = "VALID";

    public String checkDigits(String cardNumber) {
        int sum = 0;
        String res = "";

        final int ost = cardNumber.length() % 2;
        for (int i = 0; i < cardNumber.length(); i++) {
            String piece = cardNumber.substring(i, i + 1);
            final Integer num = new Integer(piece);
            if (i % 2 == ost) {
                res += num * 2;
            } else {
                res += num;
            }
        }
        System.out.println("res = " + res);
        for (int i = 0; i < res.length(); i++) {
            String piece = res.substring(i, i + 1);
            sum += new Integer(piece);
        }
        System.out.println("sum = " + sum);

        return sum % 10 == 0 ? valid : invalid;
    }

    public static void main(String[] args) {
        System.out.println("VALID".equals(new VerifyCreditCard().checkDigits("21378")));
        System.out.println("VALID".equals(new VerifyCreditCard().checkDigits("11111101")));
    }
}
