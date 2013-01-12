package p100.srm197;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 13.02.2008
 * Time: 23:27:53
 * Problem: http://www.topcoder.com/stat?c=problem_statement&pm=2430&rd=5072
 */
public class GeneralChess {
    static public class Point implements Comparable<Point> {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point(String xy) {
            final String[] strings = xy.split(",");
            x = Integer.parseInt(strings[0]);
            y = Integer.parseInt(strings[1]);
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public String toString() {
            return "" + x + "," + y;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Point)) return false;

            Point point = (Point) o;

            if (x != point.x) return false;
            if (y != point.y) return false;

            return true;
        }

        public int hashCode() {
            int result;
            result = x;
            result = 31 * result + y;
            return result;
        }

        public int compareTo(Point o) {
            if (o.getX() > x) {
                return -1;
            } else if (o.getX() < x) {
                return 1;
            } else if (o.getY() > y) {
                return -1;
            } else if (o.getY() < y) {
                return 1;
            }
            return 0;
        }
    }
    
    public String[] attackPositions(String[] pieces) {
        List<Point> points = new ArrayList<Point>(pieces.length);
        for (int i = 0; i < pieces.length; i++) {
            points.add(new Point(pieces[i]));
        }
        Map<Point, Integer> found = new HashMap<Point, Integer>();
        Integer[][] moves = new Integer[][]{{2,1}, {2,-1}, {1,2}, {1,-2}, {-2, 1}, {-2,-1}, {-1,2}, {-1,-2}};
        for (Point point : points) {
            for (Integer[] integers : moves) {
                Point newPoint = new Point(point.x + integers[0], point.y + integers[1]);
                if (!found.containsKey(newPoint)) {
                    found.put(newPoint, 1);
                } else {
                    found.put(newPoint, found.get(newPoint) + 1);
                }
            }
        }
        List<Point> result = new ArrayList<Point>();
        for (Point point : found.keySet()) {
            if (found.get(point) == points.size()) {
                result.add(point);
            }
        }
        Collections.sort(result);
        String[] res = new String[result.size()];
        int i = 0;
        for (Point str : result) {
            res[i++] = str.toString();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(new GeneralChess().attackPositions(new String[]{"0,0"}),
                new String[]{"-2,-1", "-2,1", "-1,-2", "-1,2", "1,-2", "1,2", "2,-1", "2,1"}));
        System.out.println(Arrays.equals(new GeneralChess().attackPositions(new String[]{"2,1", "-1,-2"}),
                new String[]{ "0,0", "1,-1"}));
        System.out.println(Arrays.equals(new GeneralChess().attackPositions(new String[]{"0,0", "2,1"}),
                new String[]{}));
        System.out.println(Arrays.equals(new GeneralChess().attackPositions(new String[]{"-1000,1000",
                "-999,999", "-999,997"}), new String[]{"-1001,998"}));
    }
}
