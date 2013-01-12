package p300.srm389;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 24.01.2008
 * Time: 15:01:16
 */
public class BoxesOfBooks {
    public int boxes (int[] weights, int maxWeight) {
        int boxCnt = 0;
        int current = Integer.MAX_VALUE / 2;
        for (int i = 0; i < weights.length; i++) {
            int weight = weights[i];
            if (current + weight > maxWeight) {
                current = 0;
                boxCnt++;
            }
            current += weight;
        }
        System.out.println("boxCnt = " + boxCnt);
        System.out.println("current = " + current);
        return boxCnt;
    }

    public static void main(String[] args) {
        System.out.println(3 == new BoxesOfBooks().boxes(new int[]{5,5,5,5,5,5}, 10));
    }
}
