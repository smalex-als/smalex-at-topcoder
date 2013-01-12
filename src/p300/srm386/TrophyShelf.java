package p300.srm386;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 05.01.2008
 * Time: 20:04:42
 */
public class TrophyShelf {
    public int[] countVisible(int[] throphies) {
        int maxR = throphies[throphies.length - 1];
        int maxL = throphies[0];
        int retR = 1, retL = 1;
        for (int i = 0; i < throphies.length; i++) {
            int throphy = throphies[i];
            if (throphy > maxL) {
                maxL = throphy;
                retL++;
            }
        }
        for (int i = throphies.length - 1; i >= 0; i--) {
            int throphy = throphies[i];
            if (throphy > maxR) {
                maxR = throphy;
                retR++;
            }
        }
        System.out.println("retR = " + retR);
        System.out.println("retL = " + retL);
        return new int[]{retL, retR};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(new TrophyShelf().countVisible(new int[]{1, 2, 3, 4, 5}), new int[]{5, 1}));
        System.out.println(Arrays.equals(new TrophyShelf().countVisible(new int[]{5, 5, 5, 5}), new int[]{1, 1}));
        System.out.println(Arrays.equals(new TrophyShelf().countVisible(new int[]{1, 2, 5, 2, 1}), new int[]{3, 3}));
        System.out.println(Arrays.equals(new TrophyShelf().countVisible(new int[]{1, 4, 2, 5, 3, 7, 1}), new int[]{4, 2}));
    }
}
