package p300.srm390;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 02.02.2008
 * Time: 20:02:38
 */
public class FingerCounting {
    public int maxNumber(int weakFinger, int maxCount) {
        int r = 0;
        boolean stop = false;
        while (maxCount >= 0) {
            for (int p = 1; p <=5; p++) {
                if (p == weakFinger) {
                    if (maxCount == 0) {
                        stop = true;
                        break;
                    }
                    maxCount--;
                }
                r++;
            }
            if (stop) {
                break;
            }
            if (maxCount >= 0) {
                for (int p = 4; p > 1; p--) {
                    if (p == weakFinger) {
                        if (maxCount == 0) {
                            stop = true;
                            break;
                        }
                        maxCount--;
                    }
                    r++;
                }
            }
            if (stop) {
                break;
            }
        }
        System.out.println("r = " + r);
        return r;
    }

    public static void main(String[] args) {
        System.out.println(15 == new FingerCounting().maxNumber(2, 3));
        System.out.println(0 == new FingerCounting().maxNumber(1, 0));
        System.out.println(193 == new FingerCounting().maxNumber(2, 48));
        System.out.println(7788 == new FingerCounting().maxNumber(5, 973));
        System.out.println(399998 == new FingerCounting().maxNumber(3, 99999));
    }
}
