package p500.srm583;

/**
 * Created with IntelliJ IDEA.
 * User: smalex
 * Date: 6/18/13
 * Time: 7:27 PM
 */
public class IDNumberVerification {

  public String verify(String id, String[] regionCodes) {
    try {
      String regionCode = id.substring(0, 6);
      if (!checkRegionCode(regionCode, regionCodes)) {
        System.out.println("checkRegionCode");
        return "Invalid";
      }
      int sequentialCode = Integer.parseInt(id.substring(14, 17));
      if (sequentialCode == 0 || !getChecksum(id, id.charAt(17))) {
        System.out.println("sequentialCode");
        return "Invalid";
      }
      if (!isValidBirthdayCode(id.substring(6, 14))) {
        return "Invalid";
      }
      return sequentialCode % 2 == 1 ? "Male" : "Female";
    } catch (NumberFormatException e) {
      return "Invalid";
    }
  }

  private boolean isValidBirthdayCode(String birthdayCode) {
    int year = Integer.parseInt(birthdayCode.substring(0, 4));
    int month = Integer.parseInt(birthdayCode.substring(4, 6));
    int day = Integer.parseInt(birthdayCode.substring(6));
    if (year < 1900 || year > 2011) {
      System.out.println("year = " + year);
      return false;
    }
    if (month < 1 || month > 12) {
      System.out.println("month = " + month);
      return false;
    }
    if (day < 1 || day > 31) {
      System.out.println("day = " + day);
      return false;
    }

    int daysInMonth;
    if (month == 4 || month == 6 || month == 9 || month == 11) {
      daysInMonth = 30;
    } else if (month == 2) {
      boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
      daysInMonth = (leapYear) ? 29 : 28;
    } else {
      daysInMonth = 31;
    }
    if (day > daysInMonth) {
      return false;
    }
    return true;
  }

  private boolean checkRegionCode(String regionCode, String[] regionCodes) {
    for (String code : regionCodes) {
      if (regionCode.equals(code)) {
        return true;
      }
    }
    return false;
  }

  private boolean getChecksum(String id, char valid) {
    int a = 2;
    int sum = (valid == 'X' ? 10 : valid - '0');
    for (int i = 16; i >= 0; i--) {
      int num = id.charAt(i) - '0';
      sum += a * num;
      a = a<<1;
    }
    if (sum % 11 != 1) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Male".equals(new IDNumberVerification().verify("441323200312060636", new String[]{"441323"})));
    System.out.println("Female".equals(new IDNumberVerification().verify("62012319240507058X", new String[]{"620123"})));
    System.out.println("Male".equals(new IDNumberVerification().verify("441323201212060633", new String[]{"441323"})));
//    for (int i = 1; i < 10; i++) {
//      System.out.println("i = " + i);
//      System.out.println("Male".equals(new IDNumberVerification().verify("44132320121206063" + i, new String[]{"441323"})));
//    }
  }
}
