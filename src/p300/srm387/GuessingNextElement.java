package p300.srm387;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 10.01.2008
 * Time: 8:56:47
 */
public class GuessingNextElement {
    public int guess(int[] A) {
        if (A[1] - A[0] == A[2] - A[1]) {
            return A[A.length - 1] + (A[1] - A[0]);
        } else {
            return (A[1] / A[0]) * A[A.length - 1];
        }
    }

    public static void main(String[] args) {
        System.out.println(9 == new GuessingNextElement().guess(new int[]{1, 3, 5, 7}));
        System.out.println(24 == new GuessingNextElement().guess(new int[]{3, 6, 12})); 
    }
}
