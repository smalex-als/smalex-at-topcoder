package p300.srm393;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 11.03.2008
 * Time: 21:10:59
 */
public class VariableSpeedLimit {
    public double journeyTime(int journeyLength, int[] speedLimit) {
        int result = 0;
        while (journeyLength > 0) {
            for (int i = 0; journeyLength > 0 && i < speedLimit.length; i++) {
                if (journeyLength > speedLimit[i]) {
                    journeyLength -= speedLimit[i];
                    result++;
                } else {
                    return (double) journeyLength / speedLimit[i] + result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        assertResult(new VariableSpeedLimit().journeyTime(100, new int[]{50, 25}), 2.5d);
        assertResult(new VariableSpeedLimit().journeyTime(1000, new int[]{50, 40, 30, 40, 50}), 24d);
        assertResult(new VariableSpeedLimit().journeyTime(2058, new int[]{80,43,57,23,28,45,60,75,73,80}), 37.4d);
        assertResult(new VariableSpeedLimit().journeyTime(17216, new int[]{26,30,62,55,51,56,58,4,60,23,31}), 415.03333333333336d);
    }

    private static void assertResult(double r, double w) {
        if (r == w) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL: exprected = " + w + " but was = " + r);
        }
    }
}
