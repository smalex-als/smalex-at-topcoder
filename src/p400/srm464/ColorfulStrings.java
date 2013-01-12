package p400.srm464;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 16.03.2010
 * Time: 18:33:41
 */
public class ColorfulStrings {
  private int n;
  private int k;
  private int index = 0;

  public String getKth(int n, int k) {
    this.n = n;
    this.k = k;
    return gfs(0, "", new HashSet<Integer>());
  }

  private String gfs(int level, String prefix, Set<Integer> used) {
    if (prefix.length() == n) {
      if (++index == k) {
        return prefix;
      }
      return "";
    } else {
      Set<Integer> localUsed = new HashSet<Integer>();
      for (int digit = 0; digit < 10; digit++) {
        localUsed.clear();
        boolean ok = true;
        int prod = digit;
        if (used.contains(prod)) {
          continue;
        }
        localUsed.add(prod);
        for (int i = prefix.length() - 1; i >= 0; i--) {
          prod *= prefix.charAt(i) - '0';
          if (localUsed.contains(prod) || used.contains(prod)) {
            ok = false;
            break;
          }
          localUsed.add(prod);
        }
        if (!ok) {
          continue;
        }
        for (Integer integer : localUsed) {
          used.add(integer);
        }
        final String result = gfs(level + 1, prefix + digit, used);
        if (!"".equals(result)) {
          return result;
        }
        for (Integer integer : localUsed) {
          used.remove(integer);
        }
      }
    }
    return "";
  }

  public static void main(String[] args) {
    System.out.println("3469728".equals(new ColorfulStrings().getKth(7, 3416)));
    System.out.println("238".equals(new ColorfulStrings().getKth(3, 4)));
    System.out.println("".equals(new ColorfulStrings().getKth(4, 2000)));
    System.out.println("23457".equals(new ColorfulStrings().getKth(5, 1)));
    System.out.println("52".equals(new ColorfulStrings().getKth(2, 22)));
    System.out.println("257936".equals(new ColorfulStrings().getKth(6, 464)));
    System.out.println("0".equals(new ColorfulStrings().getKth(1, 1)));
    System.out.println("2".equals(new ColorfulStrings().getKth(1, 3)));
    System.out.println("3".equals(new ColorfulStrings().getKth(1, 4)));
    System.out.println("4".equals(new ColorfulStrings().getKth(1, 5)));
    System.out.println("5".equals(new ColorfulStrings().getKth(1, 6)));
    System.out.println("7".equals(new ColorfulStrings().getKth(1, 8)));
    System.out.println("9".equals(new ColorfulStrings().getKth(1, 10)));
    System.out.println("".equals(new ColorfulStrings().getKth(1, 11)));
    System.out.println("".equals(new ColorfulStrings().getKth(1, 430818442)));
    System.out.println("".equals(new ColorfulStrings().getKth(1, 1000000000)));
    System.out.println("23".equals(new ColorfulStrings().getKth(2, 1)));
    System.out.println("47".equals(new ColorfulStrings().getKth(2, 19)));
    System.out.println("59".equals(new ColorfulStrings().getKth(2, 28)));
    System.out.println("75".equals(new ColorfulStrings().getKth(2, 39)));
    System.out.println("78".equals(new ColorfulStrings().getKth(2, 41)));
    System.out.println("79".equals(new ColorfulStrings().getKth(2, 42)));
    System.out.println("84".equals(new ColorfulStrings().getKth(2, 45)));
    System.out.println("92".equals(new ColorfulStrings().getKth(2, 50)));
    System.out.println("98".equals(new ColorfulStrings().getKth(2, 56)));
    System.out.println("".equals(new ColorfulStrings().getKth(2, 57)));
    System.out.println("".equals(new ColorfulStrings().getKth(2, 624459040)));
    System.out.println("234".equals(new ColorfulStrings().getKth(3, 1)));
    System.out.println("295".equals(new ColorfulStrings().getKth(3, 37)));
    System.out.println("453".equals(new ColorfulStrings().getKth(3, 94)));
    System.out.println("678".equals(new ColorfulStrings().getKth(3, 191)));
    System.out.println("687".equals(new ColorfulStrings().getKth(3, 197)));
    System.out.println("695".equals(new ColorfulStrings().getKth(3, 202)));
    System.out.println("946".equals(new ColorfulStrings().getKth(3, 302)));
    System.out.println("947".equals(new ColorfulStrings().getKth(3, 303)));
    System.out.println("987".equals(new ColorfulStrings().getKth(3, 328)));
    System.out.println("".equals(new ColorfulStrings().getKth(3, 329)));
    System.out.println("".equals(new ColorfulStrings().getKth(3, 635838948)));
    System.out.println("2345".equals(new ColorfulStrings().getKth(4, 1)));
    System.out.println("5362".equals(new ColorfulStrings().getKth(4, 607)));
    System.out.println("6948".equals(new ColorfulStrings().getKth(4, 938)));
    System.out.println("7629".equals(new ColorfulStrings().getKth(4, 1073)));
    System.out.println("8576".equals(new ColorfulStrings().getKth(4, 1251)));
    System.out.println("9345".equals(new ColorfulStrings().getKth(4, 1372)));
    System.out.println("9376".equals(new ColorfulStrings().getKth(4, 1389)));
    System.out.println("9682".equals(new ColorfulStrings().getKth(4, 1478)));
    System.out.println("9876".equals(new ColorfulStrings().getKth(4, 1540)));
    System.out.println("".equals(new ColorfulStrings().getKth(4, 1541)));
    System.out.println("".equals(new ColorfulStrings().getKth(4, 387574968)));
    System.out.println("29873".equals(new ColorfulStrings().getKth(5, 681)));
    System.out.println("38794".equals(new ColorfulStrings().getKth(5, 1234)));
    System.out.println("45862".equals(new ColorfulStrings().getKth(5, 1602)));
    System.out.println("47928".equals(new ColorfulStrings().getKth(5, 1821)));
    System.out.println("68472".equals(new ColorfulStrings().getKth(5, 3273)));
    System.out.println("76349".equals(new ColorfulStrings().getKth(5, 3865)));
    System.out.println("98362".equals(new ColorfulStrings().getKth(5, 5444)));
    System.out.println("98765".equals(new ColorfulStrings().getKth(5, 5514)));
    System.out.println("".equals(new ColorfulStrings().getKth(5, 5515)));
    System.out.println("".equals(new ColorfulStrings().getKth(5, 449453393)));
    System.out.println("234578".equals(new ColorfulStrings().getKth(6, 1)));
    System.out.println("259378".equals(new ColorfulStrings().getKth(6, 541)));
    System.out.println("278596".equals(new ColorfulStrings().getKth(6, 1130)));
    System.out.println("479635".equals(new ColorfulStrings().getKth(6, 4797)));
    System.out.println("659873".equals(new ColorfulStrings().getKth(6, 8072)));
    System.out.println("785346".equals(new ColorfulStrings().getKth(6, 10206)));
    System.out.println("927486".equals(new ColorfulStrings().getKth(6, 12337)));
    System.out.println("943782".equals(new ColorfulStrings().getKth(6, 12733)));
    System.out.println("987654".equals(new ColorfulStrings().getKth(6, 13956)));
    System.out.println("".equals(new ColorfulStrings().getKth(6, 13957)));
    System.out.println("".equals(new ColorfulStrings().getKth(6, 957095281)));
    System.out.println("2345789".equals(new ColorfulStrings().getKth(7, 1)));
    System.out.println("3469728".equals(new ColorfulStrings().getKth(7, 3416)));
    System.out.println("3647958".equals(new ColorfulStrings().getKth(7, 4324)));
    System.out.println("4528673".equals(new ColorfulStrings().getKth(7, 6683)));
    System.out.println("5769283".equals(new ColorfulStrings().getKth(7, 10799)));
    System.out.println("7384529".equals(new ColorfulStrings().getKth(7, 14773)));
    System.out.println("7498356".equals(new ColorfulStrings().getKth(7, 15287)));
    System.out.println("7894325".equals(new ColorfulStrings().getKth(7, 16225)));
    System.out.println("9876543".equals(new ColorfulStrings().getKth(7, 21596)));
    System.out.println("".equals(new ColorfulStrings().getKth(7, 21597)));
    System.out.println("".equals(new ColorfulStrings().getKth(7, 451435243)));
    System.out.println("25346879".equals(new ColorfulStrings().getKth(8, 1)));
    System.out.println("26893745".equals(new ColorfulStrings().getKth(8, 875)));
    System.out.println("39648725".equals(new ColorfulStrings().getKth(8, 4659)));
    System.out.println("73964582".equals(new ColorfulStrings().getKth(8, 10578)));
    System.out.println("74652893".equals(new ColorfulStrings().getKth(8, 10698)));
    System.out.println("75693482".equals(new ColorfulStrings().getKth(8, 10897)));
    System.out.println("82934657".equals(new ColorfulStrings().getKth(8, 11643)));
    System.out.println("92685374".equals(new ColorfulStrings().getKth(8, 12873)));
    System.out.println("98746253".equals(new ColorfulStrings().getKth(8, 14256)));
    System.out.println("".equals(new ColorfulStrings().getKth(8, 14257)));
    System.out.println("".equals(new ColorfulStrings().getKth(8, 818676059)));
    System.out.println("".equals(new ColorfulStrings().getKth(9, 1)));
    System.out.println("".equals(new ColorfulStrings().getKth(16, 7821)));
    System.out.println("".equals(new ColorfulStrings().getKth(31, 3323)));
    System.out.println("".equals(new ColorfulStrings().getKth(35, 3637)));
    System.out.println("".equals(new ColorfulStrings().getKth(38, 975045199)));
    System.out.println("".equals(new ColorfulStrings().getKth(39, 240352029)));
    System.out.println("".equals(new ColorfulStrings().getKth(46, 525154836)));
    System.out.println("".equals(new ColorfulStrings().getKth(50, 1)));
    System.out.println("".equals(new ColorfulStrings().getKth(50, 1000000000)));
    System.out.println("1".equals(new ColorfulStrings().getKth(1, 2)));
    System.out.println("26498573".equals(new ColorfulStrings().getKth(8, 666)));
    System.out.println("2349".equals(new ColorfulStrings().getKth(4, 4)));
    System.out.println("".equals(new ColorfulStrings().getKth(47, 98734)));
    System.out.println("".equals(new ColorfulStrings().getKth(13, 13)));
    System.out.println("79362845".equals(new ColorfulStrings().getKth(8, 11256)));
    System.out.println("".equals(new ColorfulStrings().getKth(9, 100)));
    System.out.println("".equals(new ColorfulStrings().getKth(8, 555555)));
    System.out.println("9468573".equals(new ColorfulStrings().getKth(7, 20000)));
    System.out.println("257938".equals(new ColorfulStrings().getKth(6, 465)));
    System.out.println("2648759".equals(new ColorfulStrings().getKth(7, 1000)));
    System.out.println("25398764".equals(new ColorfulStrings().getKth(8, 100)));
    System.out.println("25346978".equals(new ColorfulStrings().getKth(8, 2)));
    System.out.println("".equals(new ColorfulStrings().getKth(7, 1000009)));
    System.out.println("".equals(new ColorfulStrings().getKth(1, 10000)));
    System.out.println("".equals(new ColorfulStrings().getKth(9, 65467)));
    System.out.println("".equals(new ColorfulStrings().getKth(7, 1000000)));
    System.out.println("97286345".equals(new ColorfulStrings().getKth(8, 14000)));
    System.out.println("".equals(new ColorfulStrings().getKth(1, 14444)));
    System.out.println("69582743".equals(new ColorfulStrings().getKth(8, 10000)));
    System.out.println("".equals(new ColorfulStrings().getKth(17, 10007)));
    System.out.println("3769584".equals(new ColorfulStrings().getKth(7, 5000)));
    System.out.println("".equals(new ColorfulStrings().getKth(50, 1000)));
    System.out.println("34598".equals(new ColorfulStrings().getKth(5, 765)));
    System.out.println("".equals(new ColorfulStrings().getKth(50, 99990000)));
    System.out.println("".equals(new ColorfulStrings().getKth(9, 200000)));
    System.out.println("".equals(new ColorfulStrings().getKth(12, 14455)));
    System.out.println("".equals(new ColorfulStrings().getKth(1, 1000)));
    System.out.println("85273694".equals(new ColorfulStrings().getKth(8, 12151)));
    System.out.println("25348796".equals(new ColorfulStrings().getKth(8, 12)));
    System.out.println("25498736".equals(new ColorfulStrings().getKth(8, 200)));
    System.out.println("".equals(new ColorfulStrings().getKth(8, 999999)));
    System.out.println("".equals(new ColorfulStrings().getKth(9, 1000000)));
    System.out.println("27359864".equals(new ColorfulStrings().getKth(8, 1000)));
    System.out.println("25347986".equals(new ColorfulStrings().getKth(8, 8)));
    System.out.println("25436879".equals(new ColorfulStrings().getKth(8, 101)));
    System.out.println("73598264".equals(new ColorfulStrings().getKth(8, 10464)));
    System.out.println("".equals(new ColorfulStrings().getKth(1, 103)));
    System.out.println("".equals(new ColorfulStrings().getKth(49, 99999999)));
    System.out.println("".equals(new ColorfulStrings().getKth(1, 100)));
    System.out.println("".equals(new ColorfulStrings().getKth(8, 1000000000)));
    System.out.println("2347895".equals(new ColorfulStrings().getKth(7, 10)));
    System.out.println("".equals(new ColorfulStrings().getKth(9, 10)));
    System.out.println("".equals(new ColorfulStrings().getKth(50, 5)));
    System.out.println("25438796".equals(new ColorfulStrings().getKth(8, 112)));
    System.out.println("25348697".equals(new ColorfulStrings().getKth(8, 10)));
    System.out.println("25347689".equals(new ColorfulStrings().getKth(8, 3)));
    System.out.println("".equals(new ColorfulStrings().getKth(8, 50000000)));
    System.out.println("85274369".equals(new ColorfulStrings().getKth(8, 12154)));
    System.out.println("".equals(new ColorfulStrings().getKth(50, 10000000)));
    System.out.println("".equals(new ColorfulStrings().getKth(49, 1000000000)));
    System.out.println("".equals(new ColorfulStrings().getKth(1, 20)));
    System.out.println("43789256".equals(new ColorfulStrings().getKth(8, 4999)));
    System.out.println("".equals(new ColorfulStrings().getKth(1, 12)));
    System.out.println("8".equals(new ColorfulStrings().getKth(1, 9)));
    System.out.println("9876534".equals(new ColorfulStrings().getKth(7, 21595)));
    System.out.println("".equals(new ColorfulStrings().getKth(50, 10000)));
    System.out.println("".equals(new ColorfulStrings().getKth(8, 1000000)));
    System.out.println("".equals(new ColorfulStrings().getKth(8, 100000000)));
    System.out.println("".equals(new ColorfulStrings().getKth(10, 1000000000)));
    System.out.println("".equals(new ColorfulStrings().getKth(6, 753000)));
    System.out.println("25943876".equals(new ColorfulStrings().getKth(8, 500)));
    System.out.println("84953726".equals(new ColorfulStrings().getKth(8, 12115)));
    System.out.println("".equals(new ColorfulStrings().getKth(9, 2000)));
    System.out.println("".equals(new ColorfulStrings().getKth(8, 15200)));
    System.out.println("86397254".equals(new ColorfulStrings().getKth(8, 12345)));
    System.out.println("84652793".equals(new ColorfulStrings().getKth(8, 12000)));
    System.out.println("25467893".equals(new ColorfulStrings().getKth(8, 123)));
  }
}
