package p200.srm217;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 05.04.2008
 * Time: 16:03:51
 */
public class PlayGame {
    public int saveCreatures(int[] you, int[] computer) {
        Arrays.sort(you);
        Arrays.sort(computer);
        System.out.println(Arrays.toString(you));
        System.out.println(Arrays.toString(computer));
        int len = you.length;
        int result = 0;
        int prevCaptured = len - 1;
        for (int i = len - 1; i >= 0; i--) {
            int num = you[i];
            for (int j = prevCaptured; j >= 0; j--) {
                if (computer[j] < num) {
                    result += num;
                    prevCaptured = j - 1;
                    break;
                }
            }
        }
        System.out.println("result = " + result);
        return result;
    }

    public static void main(String[] args) {
//        {5, 1, 5, 15, 100} me
//        {5, 100, 1, 5, 15} computer
        System.out.println(120 == new PlayGame().saveCreatures(new int[]{5, 15, 100, 1, 5}, new int[]{5, 15, 100, 1, 5}));
        System.out.println(99 == new PlayGame().saveCreatures(new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19}, new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}));
        System.out.println(25084 == new PlayGame().saveCreatures(new int[]{651, 321, 106, 503, 227, 290, 915, 549, 660, 115,
 491, 378, 495, 789, 507, 381, 685, 530, 603, 394,
 7, 704, 101, 620, 859, 490, 744, 495, 379, 781,
 550, 356, 950, 628, 177, 373, 132, 740, 946, 609,
 29, 329, 57, 636, 132, 843, 860, 594, 718, 849}
                ,
new int[]{16, 127, 704, 614, 218, 67, 169, 621, 340, 319,
 366, 658, 798, 803, 524, 608, 794, 896, 145, 627,
 401, 253, 137, 851, 67, 426, 571, 302, 546, 225,
 311, 111, 804, 135, 284, 784, 890, 786, 740, 612,
 360, 852, 228, 859, 229, 249, 540, 979, 55, 82}));
    }
}
