package p300.srm396;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 03.04.2008
 * Time: 19:28:01
 */
public class RemovingDigits {
    public String maxNumber(String inNumber, String inDigits) {
        int queueGet = 0;
        int queuePut = 0;
        List<String> valuesList = new ArrayList<String>();
        List<String> digitsList = new ArrayList<String>();
        valuesList.add(inNumber);
        digitsList.add(inDigits);
        queuePut++;
        while (queueGet < queuePut) {
            String number = valuesList.get(queueGet);
            String digits = digitsList.get(queueGet);
            queueGet++;
            if (digits.length() == 0) {
                break;
            }
            char c = digits.charAt(0);
            int idx = -1;
            while ((idx = number.indexOf(c, idx + 1)) != -1) {
//                System.out.println("idx = " + idx);
                final String newValue = number.substring(0, idx) + number.substring(idx + 1);
                valuesList.add(newValue);
                final String newdigits = digits.substring(1);
                digitsList.add(newdigits);
//                    System.out.println("newdigits = " + newdigits);
//                    System.out.println("newValue = " + newValue);
                queuePut++;
            }
        }
        System.out.println("valuesList.size() = " + valuesList.size());
        String maxString = "";
        for (int i = 0; i < digitsList.size(); i++) {
            String s = digitsList.get(i);
            if (s.length() == 0) {
                if (maxString.compareTo(valuesList.get(i)) < 0) {
                    maxString = valuesList.get(i);
                }
            }
        }
        System.out.println("result = " + maxString);
        return maxString;
    }

    public static void main(String[] args) {
        System.out.println("24".equals(new RemovingDigits().maxNumber("12345", "513")));
        System.out.println("52".equals(new RemovingDigits().maxNumber("112352", "1123")));
        System.out.println("654321".equals(new RemovingDigits().maxNumber("123456654321", "612534")));
        System.out.println("654321".equals(new RemovingDigits().maxNumber("654321123456", "612534")));
        System.out.println("698265265".equals(new RemovingDigits().maxNumber("2654982765982365", "2345978")));
    }
}
