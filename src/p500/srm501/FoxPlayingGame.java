package p500.srm501;

import java.util.Arrays;

import utils.ExampleRunner;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 30.03.11
 * Time: 15:18
 * with help
 */
public class FoxPlayingGame {

  public double theMax(int nA, int nB, int paramA, int paramB) {
    double pa = (double) paramA / 1000.0d;
    double pb = (double) paramB / 1000.0d;
    double ans = -1e50d;
    double a = nA * pa;
    for (int i = 0; i <= nB; i++) {
      double b = a;
      for (int j = 1; j <= i; j++) {
        b *= pb;
      }
      ans = Math.max(ans, b);
    }
    return ans;
  }


  public double theMax2(int nA, int nB, int paramA, int paramB) {
    double scoreA = paramA / 1000.0;
    double scoreB = paramB / 1000.0;
    double[] pow = new double[nB + 1];
    pow[0] = nA * scoreA;
    for (int i = 1; i < pow.length; ++i) pow[i] = scoreB * pow[i - 1];
    Arrays.sort(pow);
    return pow[pow.length - 1];
  }

  public double theMax3(int n, int m, int paramA, int paramB) {
    double a = paramA / 1000.;
    double b = paramB / 1000.;
    double[][] dMax = new double[n + 1][m + 1];
    double[][] dMin = new double[n + 1][m + 1];
    for (double[] ar : dMax) {
      Arrays.fill(ar, Double.NEGATIVE_INFINITY);
    }
    for (double[] ar : dMin) {
      Arrays.fill(ar, Double.POSITIVE_INFINITY);
    }
    dMax[0][0] = dMin[0][0] = 0.;
    for (int i = 0; i <= n; ++i) {
      for (int j = 0; j <= m; ++j) {
        if (i < n) {
          dMax[i + 1][j] = Math.max(dMax[i + 1][j], dMin[i][j] + a);
          dMax[i + 1][j] = Math.max(dMax[i + 1][j], dMax[i][j] + a);
          dMin[i + 1][j] = Math.min(dMin[i + 1][j], dMin[i][j] + a);
          dMin[i + 1][j] = Math.min(dMin[i + 1][j], dMax[i][j] + a);
        }
        if (j < m) {
          dMax[i][j + 1] = Math.max(dMax[i][j + 1], dMax[i][j] * b);
          dMax[i][j + 1] = Math.max(dMax[i][j + 1], dMin[i][j] * b);
          dMin[i][j + 1] = Math.min(dMin[i][j + 1], dMax[i][j] * b);
          dMin[i][j + 1] = Math.min(dMin[i][j + 1], dMin[i][j] * b);
        }
      }
    }
    return dMax[n][m];
  }


  public static void main(String[] args) {
    System.out.println(240.0 == new FoxPlayingGame().theMax(5, 4, 3000, 2000));
    System.out.println(6.0 == new FoxPlayingGame().theMax(3, 3, 2000, 100));
    System.out.println(-8.0 == new FoxPlayingGame().theMax(4, 3, -2000, 2000));
    System.out.println(160.0 == new FoxPlayingGame().theMax(5, 5, 2000, -2000));
    ExampleRunner.eq(5, 515323.9982341775d, new FoxPlayingGame().theMax(41, 34, 9876, -1234));
  }
}
