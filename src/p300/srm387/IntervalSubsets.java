package p300.srm387;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 10.01.2008
 * Time: 9:56:42
 */
public class IntervalSubsets {
    private static class Interval implements Comparable<Interval> {
        private int index;
        private int start;
        private int finish;

        Interval(int index, int start, int finish) {
            this.index = index;
            this.start = start;
            this.finish = finish;
        }

        public int getStart() {
            return start;
        }

        public int getFinish() {
            return finish;
        }

        public boolean intersect(Interval newInterval) {
            int diffStart = newInterval.getStart() - start;
            int diffFinish = newInterval.getFinish() - finish;
            if (((diffFinish > 0 && diffStart > 0) || (diffFinish < 0 && diffStart < 0 ))
                    && (newInterval.getStart() != finish && newInterval.getFinish() != start)) {
                return false;
            }
            return true;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Interval)) return false;

            Interval interval = (Interval) o;

            if (index != interval.index) return false;
            if (start != interval.start) return false;
            if (finish != interval.finish) return false;

            return true;
        }

        public int hashCode() {
            int result;
            result = index;
            result = 31 * result + start;
            result = 31 * result + finish;
            return result;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Interval{");
            sb.append(index).append(": ");
            sb.append(start).append(", ").append(finish).append("}");
            return sb.toString();
        }

        public int compareTo(Interval o) {
            int result = compare(start, o.getStart());
            if (result == 0) {
                result = compare(finish, o.getFinish());
            }
            return result;
        }

        private int compare(int a, int b) {
            return (a < b ? -1 : (a == b ? 0 : 1));
        }
    }

    private static class SubInterval {
        private List<Interval> intervals = new ArrayList<Interval>();

        public SubInterval() {
        }

        public boolean addInterval(Interval newInterval) {
            for (Interval interval : intervals) {
                if (interval.intersect(newInterval)) {
                    return false;
                }
            }
            intervals.add(newInterval);
            return true;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SubInterval{");
            for (Interval interval : intervals) {
                sb.append(interval.toString());
            }
            sb.append("}");
            return sb.toString();
        }

        public List<Interval> getIntervals() {
            return intervals;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof SubInterval)) return false;

            SubInterval that = (SubInterval) o;

            if (!intervals.equals(that.intervals)) return false;

            return true;
        }

        public int hashCode() {
            return intervals.hashCode();
        }
    }

    public int numberOfSubsets(int[] start, int[] finish) {
        Set<SubInterval> subsets = new HashSet<SubInterval>();
        List<Interval> intervals = convertToIntervals(start, finish);
        final int n = intervals.size();
        for (int i = 0; i < n; i++) {
            final Interval interval = intervals.get(i);
            for (int j = 0; j < n; j++) {
                SubInterval subInterval = new SubInterval();
                subInterval.addInterval(interval);
                for (int k = 0; k < n; k++) {
                    subInterval.addInterval(intervals.get((k + j) % n));
                }
                Collections.sort(subInterval.getIntervals());
                subsets.add(subInterval);
            }
        }

//        for (SubInterval subset : subsets) {
//            System.out.println(subset.toString());
//        }
        System.out.println("result = " + subsets.size());
        return subsets.size();
    }

    private List<Interval> convertToIntervals(int[] start, int[] finish) {
        List<Interval> intervals = new ArrayList<Interval>();
        for (int i = 0; i < start.length; i++) {
            intervals.add(new Interval(i, start[i], finish[i]));
        }
        return intervals;
    }

    public static void main(String[] args) {
        final long start = System.currentTimeMillis();
        System.out.println(2 == new IntervalSubsets().numberOfSubsets(new int[]{68, 25, 1, 1}, new int[]{75, 64, 2, 3}));
        System.out.println(2 == new IntervalSubsets().numberOfSubsets(new int[]{4, 2, 3}, new int[]{4, 5, 3}));
        System.out.println(5 == new IntervalSubsets().numberOfSubsets(new int[]{3, 4, 3, 2, 1}, new int[]{4, 5, 4, 5, 5}));
        System.out.println(4 == new IntervalSubsets().numberOfSubsets(new int[]{1, 1, 3, 3}, new int[]{2, 2, 4, 4}));
        System.out.println(5 == new IntervalSubsets().numberOfSubsets(new int[]{3, 4, 3, 2, 1}, new int[]{4, 5, 4, 5, 5}));
        System.out.println(86093442 == new IntervalSubsets().numberOfSubsets(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 16, 17, 17}, 
                new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11, 11, 12, 12, 12, 13, 13, 13, 14, 14, 14, 15, 15, 15, 16, 16, 16, 17, 17}));
        System.out.println(58106 == new IntervalSubsets().numberOfSubsets(new int[]{90, 88, 86, 84, 82, 80, 78, 76, 74, 72, 70, 68, 66, 64, 62, 60, 58, 56, 54, 52, 50, 48, 46, 44, 42, 40, 38, 36, 34, 32, 30, 28, 26, 24, 22, 20, 18, 16, 14, 12, 10, 8, 6, 4, 2},
                new int[]{99, 97, 95, 93, 91, 89, 87, 85, 83, 81, 79, 77, 75, 73, 71, 69, 67, 65, 63, 61, 59, 57, 55, 53, 51, 49, 47, 45, 43, 41, 39, 37, 35, 33, 31, 29, 27, 25, 23, 21, 19, 17, 15, 13, 11}));
        System.out.println(String.format("%.4f seconds", (System.currentTimeMillis() - start) / 1000.f));
    }
}
