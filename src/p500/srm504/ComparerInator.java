package p500.srm504;

public class ComparerInator {
  public int makeProgram(int[] A, int[] B, int[] wanted) {
    int[] res = new int[]{1, 1, 7, 7};
    for (int i = 0; i < 4; i++) {
      boolean ok = true;
      for (int j = 0; j < A.length && ok; j++) {
        int a = A[j];
        int b = B[j];
        int w = wanted[j];
        int r = 0;
        switch (i) {
          case 0:
            r = a;
            break;
          case 1:
            r = b;
            break;
          case 2:
            r = a < b ? a : b;
            break;
          case 3:
            r = a < b ? b : a;
            break;
        }
        if (w != r) {
          ok = false;
        }
      }
      if (ok) {
        return res[i];
      }
    }
    return -1;
  }
}
