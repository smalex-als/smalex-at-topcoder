package p200.srm204;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 06.04.2008
 * Time: 22:12:22
 */
public class Apothecary {
    public int[] balance(int W) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int i = 1;
        while (W > 0) {
            if (W % 3 == 1) {
                a.add(i);
                W -= 1;
            } else if (W % 3 == 2) {
                a.add(-i);
                W += 1;
            }
            W /= 3;
            i *= 3;
        }
        Collections.sort(a);
        int[] r = new int[a.size()];
        for (i = 0; i < r.length; i++)
            r[i] = a.get(i);
        return r;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.equals(new int[]{ -9,  -1,  27 }, new Apothecary().balance(17)));
        System.out.println(Arrays.equals(new int[]{-243, -9, 81, 2187}, new Apothecary().balance(2016)));
    }
}
