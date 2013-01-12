package p200.srm216;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 06.04.2008
 * Time: 19:32:28
 */
public class RockStar {
    public int getNumSongs(int ff, int fs, int sf, int ss) {
        int result = 0;
        if (ff == 0 && fs == 0) {
            return ss + (sf > 0 ? 1 : 0);
        }
        result = ff + Math.min(sf, fs) * 2 + (fs > 0 ? ss : 0) + (fs > sf ? 1 : 0);
//        System.out.println("result = " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(100 == new RockStar().getNumSongs(100, 0, 0, 200));
        System.out.println(201 == new RockStar().getNumSongs(0, 0, 20, 200));
        System.out.println(5 == new RockStar().getNumSongs(1, 2, 1, 1));
        System.out.println(999 == new RockStar().getNumSongs(192, 279, 971, 249));
    }
}
