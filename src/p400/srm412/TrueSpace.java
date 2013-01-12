package p400.srm412;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 31.07.2008
 * Time: 15:02:55
 */
public class TrueSpace {
  public long calculateSpace(int[] sizes, int clusterSize) {
    long l = 0L;
    for (int size : sizes) {
      l += (long) clusterSize * (((long) size + (long) clusterSize - 1L) / (long) clusterSize);
    }
    return l;
  }

  public static void main(String[] args) {
    System.out.println(new TrueSpace().calculateSpace(new int[]{600}, 512) == 1024L);
    System.out.println(new TrueSpace().calculateSpace(new int[]{4096, 33792, 76800}, 1024) == 114688L);
  }
}
