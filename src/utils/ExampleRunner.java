package utils;

import java.util.Arrays;

public class ExampleRunner {

  public static void eq(int n, Object o1, Object o2) {
    if (nullSafeEquals(o1, o2)) {
      System.err.println("Case " + n + " passed.");
    } else {
      System.err.println("Case " + n + " failed: expected '" + objToString(o1) + "', " +
          "received '" + objToString(o2) + "'.");
    }
  }

  private static String objToString(Object o1) {
    if (o1.getClass().isArray()) {
      if (o1 instanceof Object[]) {
        return Arrays.toString((Object[]) o1);
      }
      if (o1 instanceof boolean[]) {
        return Arrays.toString((boolean[]) o1);
      }
      if (o1 instanceof byte[]) {
        return Arrays.toString((byte[]) o1);
      }
      if (o1 instanceof char[]) {
        return Arrays.toString((char[]) o1);
      }
      if (o1 instanceof double[]) {
        return Arrays.toString((double[]) o1);
      }
      if (o1 instanceof float[]) {
        return Arrays.toString((float[]) o1);
      }
      if (o1 instanceof int[]) {
        return Arrays.toString((int[]) o1);
      }
      if (o1 instanceof long[]) {
        return Arrays.toString((long[]) o1);
      }
      if (o1 instanceof short[]) {
        return Arrays.toString((short[]) o1);
      }
    }
    return String.valueOf(o1);
  }

  private static boolean nullSafeEquals(Object o1, Object o2) {
    if (o1 == o2) {
      return true;
    }
    if (o1 == null || o2 == null) {
      return false;
    }
//    Double.compare(a, b) == 0
    if (o1.equals(o2)) {
      return true;
    }
    if (o1.getClass().isArray() && o2.getClass().isArray()) {
      if (o1 instanceof Object[] && o2 instanceof Object[]) {
        return Arrays.equals((Object[]) o1, (Object[]) o2);
      }
      if (o1 instanceof boolean[] && o2 instanceof boolean[]) {
        return Arrays.equals((boolean[]) o1, (boolean[]) o2);
      }
      if (o1 instanceof byte[] && o2 instanceof byte[]) {
        return Arrays.equals((byte[]) o1, (byte[]) o2);
      }
      if (o1 instanceof char[] && o2 instanceof char[]) {
        return Arrays.equals((char[]) o1, (char[]) o2);
      }
      if (o1 instanceof double[] && o2 instanceof double[]) {
        return Arrays.equals((double[]) o1, (double[]) o2);
      }
      if (o1 instanceof float[] && o2 instanceof float[]) {
        return Arrays.equals((float[]) o1, (float[]) o2);
      }
      if (o1 instanceof int[] && o2 instanceof int[]) {
        return Arrays.equals((int[]) o1, (int[]) o2);
      }
      if (o1 instanceof long[] && o2 instanceof long[]) {
        return Arrays.equals((long[]) o1, (long[]) o2);
      }
      if (o1 instanceof short[] && o2 instanceof short[]) {
        return Arrays.equals((short[]) o1, (short[]) o2);
      }
    }
    return false;
  }
}
