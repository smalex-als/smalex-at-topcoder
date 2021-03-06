package p400.srm434;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 07.02.2009
 * Time: 20:19:22
 */
public class HexatridecimalSum implements Comparator<String> {
  public String maximizeSum(String[] numbers, int k) {
    String[] cost = createCosts(numbers);
    String res = "";
    for (String number : numbers) {
      res = add(res, number);
    }
    for (int i = 0; i < k; i++) {
      res = add(res, cost[cost.length - 1 - i]);
    }
    return res;
  }

  private String[] createCosts(String[] numbers) {
    String[] cost = new String[36];
    for (int i = 0; i < 36; i++) {
      String curNumber = "";
      for (String number : numbers) {
        StringBuilder newNumber = new StringBuilder();
        for (int j = 0; j < number.length(); j++) {
          int cur = 0;
          final int c = getNumber(number.charAt(j));
          if (i == c) {
            cur += 35 - c;
          }
          if (cur > 0 || newNumber.length() > 0) {
            newNumber.append(toChar(cur));
          }
        }
        curNumber = add(curNumber, newNumber.toString());
      }
      cost[i] = curNumber;
    }
    Arrays.sort(cost, this);
    return cost;
  }

  private String add(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int pr = 0;
    for (int i = 0; i < a.length() || i < b.length() || pr > 0; i++) {
      if (i < a.length()) {
        pr += getNumber(a.charAt(a.length() - 1 - i));
      }
      if (i < b.length()) {
        pr += getNumber(b.charAt(b.length() - 1 - i));
      }
      if (pr >= 36) {
        sb.append(toChar(pr - 36));
        pr = 1;
      } else {
        sb.append(toChar(pr));
        pr = 0;
      }
    }
    return sb.reverse().toString();
  }

  private int getNumber(char c) {
    if (c >= '0' && c <= '9') {
      return c - '0';
    } else if (c >= 'A' && c <= 'Z') {
      return c - 'A' + 10;
    } else {
      throw new RuntimeException();
    }
  }

  private char toChar(long a) {
    if (a >= 0 && a <= 9) {
      return (char) ('0' + a);
    } else if (a >= 10 && a <= 35) {
      return (char) ('A' + (a - 10));
    } else {
      throw new RuntimeException();
    }
  }

  public int compare(String o1, String o2) {
    while (o1.length() > 0 && o1.charAt(0) == '0') {
      o1 = o1.substring(1);
    }
    while (o2.length() > 0 && o2.charAt(0) == '0') {
      o2 = o2.substring(1);
    }
    if (o1.length() < o2.length()) {
      return -1;
    } else if (o2.length() < o1.length()) {
      return 1;
    }
    return o1.compareTo(o2);
  }

  public static void main(String[] args) {
    System.out.println("ZZLLO".equals(
        new HexatridecimalSum().maximizeSum(new String[]{"HELLO"}, 2)));
    System.out.println("1100TC85".equals(
        new HexatridecimalSum().maximizeSum(new String[]{"500", "POINTS", "FOR", "THIS", "PROBLEM"}, 5)));
    System.out.println("QNO".equals(
        new HexatridecimalSum().maximizeSum(new String[]{"TO", "BE", "OR", "NOT", "TO", "BE"}, 0)));
    System.out.println("1B9KG009JCTTFOMNN3QI86HEHJENK39KL7NM34FCP3JZ7AYXF6H1".equals(
        new HexatridecimalSum().maximizeSum(new String[]{"93K7XFUCPTGJWUDCPQY9TW0Y9B7Q2PWXQUUTFEZEHIFRIB03HW", "NX73A16PXA5LUE6QUQGN7N6BU67EUBZ0OICX1KBI9FA2CL12DW", "WPPW7YHK88YBBIO1QF3SFDLR1IY4LYCV8QJF6DRXV3TFDOF8BB", "8GI5V4WHLITBU1FGPXZZRGE7CVSLSIJU5QU4RIFIM9JY5CZ61K", "SE4H3ZSWY9VZFUD9ZVI86BORAGLLVQ9X0M9NBWTN4DUHHQC4QB", "1OQMXFC9P5MM22BZ4PCGG85K1JQIDU4OWIN8ULTL36ATYJO5CO", "LA5PS8WEPQQGKIBKK3AJJKMIDZCAC16QD2P4JM2ZGJICLQ3W35", "LJ426OYAJQR1JA2KEEKTAXKOPH4JPRUHCSXUTWMHQRPQYZ3NSJ", "YQGL4F859I9MI7NF3HS5HX2P72MKU8WDF3M0OPU7FHJ3RJYKJC", "G33JGBHDE2RB4QJGXXFX9VAOX38S28WP90NTSV59PPAZ8EK7PT", "Y60VRNHNOB9IOKW1QTU10OOWUEE4MKESF1LE18U1RK3A0T3VI8", "AY4V2AXS7MIKMRHQB0LLDQ93MJV7TZOAN8TH8N1GLIU348BZFU", "5B0FWG84172JESCVRE90OUWDYUQIN72DP6CZFDPUY83FE4PFSX", "RNCDVS1CIJNA9LJEMGNK8HWH77V8ZU2M2YLMM9XYM02RWX5GQ5", "BXDSXXW4LP8HZE5LY8O8BVCA5OS9B76KAC3FTGS5RNH98JKD0V", "X4M33FMQNY4R6EDTR25PM05SMGQKLCBBPA1GI8S51RWMHIDE39", "78A12DEUOE2RIHO1JM96GRFY7NJZ7A8K3DVDB9INK9I27AXOU4", "8GVY77WXG6ONPGO8JQ6WIJ5Q3XZRWEF9GYWPLN4YXKQVGFLTLN", "HBVNDOL5JYHDJ609VLQY8ICT89QV8ZJBL3WJKAHUI3XR8W8OMP", "P3WQQW3CA4PCXNCDT875S8KEVL96J7ISFN03PWAM6HYDJ65YS9", "539TE7CZ7PHIG3OISCJ3QRV9PE9AU5SIEC97QYSUDWR1TJ65NM", "72EE9MCI4XWVQECERCA4Y5U38VJJJFBC8IACKR5P9U6KFRI4E8", "R84THEWU249MS9VCDGHS1RZE6BJWUPI6YZUNVRUHAVPJ9JXPNO", "1STASRSSNLENYON24GFXEYOZ5FAIXW6ZNSYP7QI58ZLSBEKAB1", "9KX798QWM0ZI0I5RRBZUC8NR4AS7KJ71B3ZVHXJ6B2W75DRM97", "1AQF41UN87FRX59Q99DZIRN31ZQU1BAAB1RNSDZP4P0Z20JMME", "FWGR8UHYS90MECZOXFPS0KL54BI5DNZ1QQ3MWCXHH03DYYDK9W", "SQLQDAOZN3OLILS52AQ1P4WJZA1IURDQT6S1W0J85B90E8PDV7", "3MRL6HW3IA1YA7IFSK7EKE59MA3S27W6N4RWHEEE2BNMM5HD5S", "SPX5AZO3RY1FJAYY5Z2EV2IIXHZ58MJLNVB1QF94HZSN15S7Q", "U891OKNOIPYT9WXR043VQVXTB1MVPO279SPEU36GTW49FBNY21", "ZYHAIHKWAQMZQCHNUFAFDI3RS7MLZF1TR700YTX2JQVE04PW6J", "GRNSHY1SRSUGV7XPEEIV1S2FOXDP7LN4L7LYOTTIXDQKM6ALJP", "IF5XITKWVG8YHIOJVEV9WDH2UI9N2X1XJXXXFG90BZ18EXHIB6", "TQ0V30Z8VOXOBX7KMS76S911YQHNIMX2Q9SVOKLTGFVUIEC8Y2", "4GGZ3N9W5V47UICIPRDISM32AAKTVF7ZF2TT4ZB8BOBHAQYO5B", "MW98WVZW5KVI584BPRFFEA57YEOKBIEU55FBX96IRTKF169Y65", "ZKXRCHMUKNREN1XY9WBMEVLJBWQNN5LLB98BWINGM819X37FG2", "6INPNKN9I63LL2PFQT786QNBJM7MFWA7OHAOOJ6M7T6D1V0CT4", "4J4YNK2LAOF3PWY91G7ZPT76I14MPDV6TB3BPF0TYT72AU7J3K", "I64ACGGK7BZ5D2VCJS2Z8JT11671M7XLN9J90HCHZ6LGRW9EM4", "414LCRJ4END5I0G65N4MFNFVZDIVD6B0D3KEZVIXA1QD49ISA2", "2RQGQA7228YECVJC1Y0Q2Y2TWWIQ5NFTSHBPEQ0YXD6M50DQFS", "M4JVHO4WPRH88VQV0P4SOQNPJG0JUU61WBKPZOQM8OETG0UKM5", "YDA5PRZFYD20BFSZ1RLYYBYQKJZNMWR95QEAO4U0PC89AA4B5Q", "2X3E64DAWU2N1MAGBE4FUMVZQB3GPV9LO5HAIZZUEIN9VB4GXV", "LG1OQR2L8E5S4OHGHK0HDTR3FOKXRYUDP1ZJCXV8S4ZINN2SDT", "4N8LIWWJEFII6Q11IFLJZ29AL22GODKQOI0F8T6XGA01U17GXN", "1JBNQ0CTVE9LF2V10FPIRMQC3R9IWDVD3NW6R4EOT6C3DPD57G", "SBSW40X7KMPVFRWG0NHYVZXO3NRK4RC9J9VNF1W9I1B70XBBZO"}, 18)));
    System.out.println("1DYZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZYM".equals(
        new HexatridecimalSum().maximizeSum(new String[]{"YNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN"}, 1)));
  }
}
