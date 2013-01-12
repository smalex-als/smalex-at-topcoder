// BEGIN CUT HERE
package p400.srm413;

import static utils.ExampleRunner.eq;


// END CUT HERE

public class Subway2 {
  public double minTime(int length, int maxAcceleration, int maxVelocity) {
    // (v0 * t + 0.5 * a * t^2) = length
    double d_length = (double) length / 2;

    double accelerationLength = getLength(maxAcceleration, (double) maxVelocity / maxAcceleration);
    if (accelerationLength > d_length) {
      return 2 * Math.sqrt(d_length / (0.5 * (double) maxAcceleration));
    }
    double t = (double) maxVelocity / maxAcceleration + (d_length - accelerationLength) / maxVelocity;
    return t * 2;
  }

  private double getLength(double maxAcceleration, double timeAcceleration) {
    return 0.5 * maxAcceleration * timeAcceleration * timeAcceleration;
  }

  // BEGIN CUT HERE
  public static void main(String[] args) {
    try {
      eq(0, (new Subway2()).minTime(1, 2, 10), 1.4142135623730951);
      eq(1, (new Subway2()).minTime(1, 1, 1), 2.0);
      eq(2, (new Subway2()).minTime(10, 1, 1), 11.0);
      eq(3, (new Subway2()).minTime(1, 10, 1), 1.1);
      eq(4, (new Subway2()).minTime(778, 887, 384), 2.458961621570838);
      eq(5, (new Subway2()).minTime(336, 794, 916), 1.301036207838119);
      eq(6, (new Subway2()).minTime(863, 531, 783), 2.549694416902874);
      eq(7, (new Subway2()).minTime(785, 920, 422), 2.318885225633629);

      eq(3, (new Subway2()).minTime(1, 2, 10), 1.4142135623730951);
      eq(3, (new Subway2()).minTime(1, 1, 1), 2.0);
      eq(3, (new Subway2()).minTime(10, 1, 1), 11.0);
      eq(3, (new Subway2()).minTime(1, 10, 1), 1.1);
      eq(3, (new Subway2()).minTime(1, 1, 1), 2.0);
      eq(3, (new Subway2()).minTime(1, 1, 1000), 2.0);
      eq(3, (new Subway2()).minTime(1, 1000, 1), 1.001);
      eq(3, (new Subway2()).minTime(1, 1000, 1000), 0.06324555320336758);
      eq(3, (new Subway2()).minTime(1000, 1, 1), 1001.0);
      eq(3, (new Subway2()).minTime(1000, 1, 1000), 63.245553203367585);
      eq(3, (new Subway2()).minTime(1000, 1000, 1), 1000.001);
      eq(3, (new Subway2()).minTime(1000, 1000, 1000), 2.0);
      eq(3, (new Subway2()).minTime(778, 887, 384), 2.458961621570838);
      eq(3, (new Subway2()).minTime(336, 794, 916), 1.301036207838119);
      eq(3, (new Subway2()).minTime(650, 493, 387), 2.4645764213196637);
      eq(3, (new Subway2()).minTime(28, 363, 422), 0.5554637206007079);
      eq(3, (new Subway2()).minTime(764, 60, 691), 7.136759301905405);
      eq(3, (new Subway2()).minTime(427, 541, 927), 1.7768276368338702);
      eq(3, (new Subway2()).minTime(212, 737, 173), 1.4601689398514521);
      eq(3, (new Subway2()).minTime(430, 568, 369), 1.8149595404404748);
      eq(3, (new Subway2()).minTime(863, 531, 783), 2.549694416902874);
      eq(3, (new Subway2()).minTime(136, 68, 124), 2.8284271247461903);
      eq(3, (new Subway2()).minTime(23, 803, 930), 0.33848243845981674);
      eq(3, (new Subway2()).minTime(168, 70, 59), 3.690314769975787);
      eq(3, (new Subway2()).minTime(12, 457, 394), 0.32408767757678103);
      eq(3, (new Subway2()).minTime(374, 230, 43), 8.884630940343781);
      eq(3, (new Subway2()).minTime(785, 920, 422), 2.318885225633629);
      eq(3, (new Subway2()).minTime(325, 199, 538), 2.5559075328702554);
      eq(3, (new Subway2()).minTime(414, 371, 316), 2.1618786038418234);
      eq(3, (new Subway2()).minTime(981, 92, 527), 6.530863182845241);
      eq(3, (new Subway2()).minTime(863, 874, 957), 1.987374335793859);
      eq(3, (new Subway2()).minTime(282, 997, 171), 1.8206373506484366);
      eq(3, (new Subway2()).minTime(85, 926, 306), 0.6059460589441044);
      eq(3, (new Subway2()).minTime(506, 337, 328), 2.5159766953752625);
      eq(3, (new Subway2()).minTime(314, 730, 847), 1.3116965903765547);
      eq(3, (new Subway2()).minTime(896, 125, 858), 5.354624169818083);
      eq(3, (new Subway2()).minTime(815, 546, 583), 2.4657072487261167);
      eq(3, (new Subway2()).minTime(365, 435, 368), 1.8378248375812094);
      eq(3, (new Subway2()).minTime(88, 751, 44), 2.0585885486018642);
      eq(3, (new Subway2()).minTime(179, 277, 809), 1.6077429972251018);
      eq(3, (new Subway2()).minTime(404, 585, 789), 1.6620448737603815);
      eq(3, (new Subway2()).minTime(400, 755, 652), 1.455749050493678);
      eq(3, (new Subway2()).minTime(677, 61, 933), 6.662840432049294);
      eq(3, (new Subway2()).minTime(13, 740, 369), 0.2650854018430103);
      eq(3, (new Subway2()).minTime(95, 587, 227), 0.8052142980435125);
      eq(3, (new Subway2()).minTime(571, 796, 540), 1.7357993672064023);
      eq(3, (new Subway2()).minTime(468, 379, 435), 2.2224567451738775);
      eq(3, (new Subway2()).minTime(903, 98, 602), 6.07100838882165);
      eq(3, (new Subway2()).minTime(653, 493, 318), 2.698489545460344);
      eq(3, (new Subway2()).minTime(281, 302, 757), 1.9292107983928977);
      eq(3, (new Subway2()).minTime(866, 442, 287), 3.6667428697557822);
      eq(3, (new Subway2()).minTime(620, 445, 690), 2.360727368389914);
      eq(3, (new Subway2()).minTime(32, 730, 441), 0.41873913807217095);
      eq(3, (new Subway2()).minTime(772, 98, 118), 7.7464545140089935);
      eq(3, (new Subway2()).minTime(710, 676, 482), 2.1860467971224433);
      eq(3, (new Subway2()).minTime(857, 568, 928), 2.4566666985176546);
      eq(3, (new Subway2()).minTime(587, 354, 498), 2.575416153087093);
      eq(3, (new Subway2()).minTime(684, 307, 966), 2.98530603410502);
      eq(3, (new Subway2()).minTime(529, 625, 220), 2.7565454545454546);
      eq(3, (new Subway2()).minTime(830, 733, 872), 2.128222618600952);
      eq(3, (new Subway2()).minTime(271, 20, 504), 7.362064927722384);
      eq(3, (new Subway2()).minTime(716, 709, 369), 2.460830743709412);
      eq(3, (new Subway2()).minTime(1, 2, 1), 1.5);
      eq(3, (new Subway2()).minTime(200, 300, 400), 1.632993161855452);
      eq(3, (new Subway2()).minTime(100, 3, 10), 13.333333333333332);
      eq(3, (new Subway2()).minTime(6, 1, 1), 7.0);
      eq(3, (new Subway2()).minTime(40, 3, 4), 11.333333333333332);

    } catch (Exception exx) {
      System.err.println(exx);
      exx.printStackTrace(System.err);
    }
  }
// END CUT HERE
}
