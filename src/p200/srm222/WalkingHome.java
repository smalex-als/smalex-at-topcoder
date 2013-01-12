package p200.srm222;

/**
 * Created by IntelliJ IDEA.
 * User: Tanya
 * Date: 02.02.2008
 * Time: 12:42:09
 */
public class WalkingHome {
    public int fewestCrossings(String[] map) {
        int height = map.length;
        int width = map[0].length();
        int[][] m = new int[height][width];
        int queueX[] = new int[width * height * 10];
        int queueY[] = new int[width * height * 10];
        int queueGet = 0, queuePut = 0;

        for (int[] ints : m) {
            for (int i = 0; i < ints.length; i++) {
                ints[i] = -1;
            }
        }
        for (int i = 0; i < map.length; i++) {
            int j = map[i].indexOf('S');
            if (j != -1) {
                queuePut = addQueue(queueY, queueX, queuePut, i, j);
                m[queueY[0]][queueX[0]] = 1;
                break;
            }
        }
        int[][] directions = new int[][]{
                {0,1},
                {0,-1},
                {1,0},
                {-1,0},
        };
//        dump(m);
        while (queueGet < queuePut) {
            int dy = queueY[queueGet];
            int dx = queueX[queueGet];
//            System.out.println("dy = " + dy + " dx = " + dx);
            queueGet++;
            for (int i = 0; i < directions.length; i++) {
                int[] direction = directions[i];
                int nextX = direction[0] + dx;
                int nextY = direction[1] + dy;
                if (nextX < 0 || nextX >= width || nextY < 0 || nextY >= height) {
                    continue;
                }
                char chr = peek(map, nextY, nextX);
                if (direction[0] == 0 && chr == '|') {
                    continue;
                }
                if (direction[1] == 0 && chr == '-') {
                    continue;
                }
                if (chr == '|' || chr == '-' || chr == '.' || chr == 'H') {
                    int cost = (chr == '.' || chr == 'H') ? 0 : 1;
                    char curChr = peek(map, dy, dx);
                    if (chr == '|' && curChr == '|') {
                        cost = 0;
                    }
                    if (chr == '-' && curChr == '-') {
                        cost = 0;
                    }
                    if (m[nextY][nextX] != -1 && m[nextY][nextX] <= m[dy][dx] + cost) {
                        continue;
                    }
//                    dump(m);
                    m[nextY][nextX] = m[dy][dx] + cost;
                    if (chr != 'H') {
                        queuePut = addQueue(queueY, queueX, queuePut, nextY, nextX);
                    }
                }
            }

        }
        dump(m);
        int result = -1;
        for (int i = 0; i < map.length; i++) {
            int j = map[i].indexOf('H');
            if (j != -1) {
                if (m[i][j] == -1) {
                    result = -1;
                } else {
                    result = m[i][j] - 1;
                }
                break;
            }
        }
        System.out.println("result = " + result);
        return result;
    }

    private int addQueue(int[] queueY, int[] queueX, int queuePut, int y, int x) {
        queueY[queuePut] = y;
        queueX[queuePut] = x;
        queuePut++;
        return queuePut;
    }

    private char peek(String[] map, int y, int x) {
        return map[y].charAt(x);
    }

    private void dump(int[][] m) {
        System.out.println("DUMP");
        for (int[] ints : m) {
            for (int anInt : ints) {
                System.out.print(" " + anInt);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        System.out.println(1 == new WalkingHome().fewestCrossings(new String[]{
                "H.|..",
                "..|.S"}));
        System.out.println(0 == new WalkingHome().fewestCrossings(new String[]{
                "S.|..",
                "..|.H",
                "..|..",
                "....."}));
        System.out.println(1 == new WalkingHome().fewestCrossings(new String[]{
                "S.||...",
                "..||...",
                "..||...",
                "..||..H"}));
        System.out.println(1 == new WalkingHome().fewestCrossings(new String[]{
                "S.....",
                "---*--",
                "...|..",
                "...|.H"}));
        System.out.println(2 == new WalkingHome().fewestCrossings(new String[]{
                "S.F..",
                "..F..",
                "--*--",
                "..|..",
                "..|.H"}));
        System.out.println(27 == new WalkingHome().fewestCrossings(new String[]{
                "H|.|.|.|.|.|.|.|.|.|.|.|.|.",
                "F|F|F|F|F|F|F|F|F|F|F|F|F|-",
                "S|.|.|.|.|.|.|.|.|.|.|.|.|."}));
        System.out.println(-1 == new WalkingHome().fewestCrossings(new String[]{
                "S-H"}));
    }
}
