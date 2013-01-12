package p300.srm390;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 02.02.2008
 * Time: 20:58:11
 */
public class ConcatenateNumber {
    public int getSmallest(int number, int k) {
        int power = 10;
        while (power < number) {
            power *= 10;
        }
        int num = number % k;
        int p = 1;
        while (num > 0) {
            num = (num * power + number) % k;
            if (p > k) {
                return -1;
            }
            p++;
        }
        System.out.println("p = " + p);
        return p;
    }

    public static void main(String[] args) {
        System.out.println(9876 == new ConcatenateNumber().getSmallest(35, 98765));
        System.out.println(-1 == new ConcatenateNumber().getSmallest(1, 2));
        System.out.println(1 == new ConcatenateNumber().getSmallest(121, 11));
        System.out.println(9 == new ConcatenateNumber().getSmallest(2, 9));
    }
}
