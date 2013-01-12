package p200.srm207;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 29.01.2008
 * Time: 22:18:17
 */
public class CaptureThemAll {
    public int fastKnight(String knight, String rook, String queen) {
        int[] coorsKnight = toCoords(knight);
        int[] coorsRook = toCoords(rook);
        int[] coorsQueen = toCoords(queen);
        int[][] delta = new int[][]{
                {-2, -1},
                {-2, 1},
                {2, -1},
                {2, 1},
                {-1, -2},
                {1, -2},
                {-1, 2},
                {1, 2}
        };

        return Math.min(
                countStep(coorsKnight, coorsRook, delta) + countStep(coorsRook, coorsQueen, delta),
                countStep(coorsKnight, coorsQueen, delta) + countStep(coorsQueen, coorsRook, delta));
    }

    private int countStep(int[] coorsKnight, int[] coorsQueen, int[][] delta) {
        int[][] map = new int[8][8];
        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map[x].length; y++) {
                map[x][y] = -1;
            }
        }
        map[coorsKnight[0]][coorsKnight[1]] = 0;
        map[coorsQueen[0]][coorsQueen[1]] = -7;
//        dump(map);
        int[][] queue = new int[128][2];
        int queuePut = 0, queueGet = 0;
        queue[queuePut][0] = coorsKnight[0];
        queue[queuePut][1] = coorsKnight[1];
        queuePut++;
        while (queueGet < queuePut) {
            int[] pos = queue[queueGet++];

            for (int i = 0; i < delta.length; i++) {
                int[] xy = delta[i];
                int nextX = xy[0] + pos[0];
                int nextY = xy[1] + pos[1];
                if (nextX >= 0 && nextX < 8 && nextY >= 0 && nextY < 8) {
                    if (map[nextX][nextY] == -1 || map[nextX][nextY] == -7) {
                        final int step = map[pos[0]][pos[1]] + 1;
                        if (map[nextX][nextY] < -1) {
                            return step;
                        }
                        map[nextX][nextY] = step;
                        queue[queuePut][0] = nextX;
                        queue[queuePut][1] = nextY;
                        queuePut++;
                    }
                }
            }
        }
        return -1;
    }

    private int[] toCoords(String pos) {
        final int[] coords = new int[2];
        int x = pos.charAt(0) - 'a';
        int y = pos.charAt(1) - '1';
        coords[0] = x;
        coords[1] = y;
        return coords;
    }

    private void dump(int[][] map) {
        System.out.println("dump");
        for (int[] row : map) {
            for (int col : row) {
                System.out.print(String.format("%3d", col));
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        System.out.println(2 == new CaptureThemAll().fastKnight("a1", "b3", "c5"));
        System.out.println(3 == new CaptureThemAll().fastKnight("b1", "c3", "a3"));
        System.out.println(11 == new CaptureThemAll().fastKnight("a1", "h1", "a8"));
        System.out.println(10 == new CaptureThemAll().fastKnight("a1", "a8", "h8"));
    }
}
