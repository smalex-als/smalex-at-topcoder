package p300.srm395;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 23.04.2008
 * Time: 22:47:13
 */
public class StreetWalking {
    public long minTime(int X, int Y, int walkTime, int sneakTime) {
        long min = Math.min(X, Y);
        long result = Math.min(min * walkTime * 2, min * sneakTime);
        long rest = Math.max(X, Y) - min;
        result += Math.min(rest * walkTime, rest * sneakTime + (rest % 2 == 0 ? 0: walkTime));
        System.out.println("result = " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(18 == new StreetWalking().minTime(4, 2, 3, 10));
        System.out.println(16 == new StreetWalking().minTime(4, 2, 3, 5));
        System.out.println(20 == new StreetWalking().minTime(2, 0, 12, 10));
        System.out.println(247 == new StreetWalking().minTime(25, 18, 7, 11));
        System.out.println(240 == new StreetWalking().minTime(24, 16, 12, 10));
        System.out.println(41010000000l == new StreetWalking().minTime(10000000, 50000000, 800, 901));
    }
}
