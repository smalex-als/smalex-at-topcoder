package p500.srm585;// BEGIN CUT HERE

// END CUT HERE

public class TrafficCongestionDivTwo {
  public long theMinCars(int treeHeight) {
    long res = ((1L << ((long) treeHeight + 1L)) - 1L);

    long r = res % 3;
    res /= 3;
    if (r != 0) {
      res++;
    }
    return res;
  }
}

