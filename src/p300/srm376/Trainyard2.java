package p300.srm376;

import java.util.Arrays;

public class Trainyard2 {

    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    public int reachableSquares(String[] layout, int fuel) {
        String[] s = layout;
        int n = s.length;
        int m = s[0].length();

        int[][] w = new int[n][m];
        int[] qx = new int[n * m];
        int[] qy = new int[n * m];
        for (int[] x : w) {
            Arrays.fill(x, Integer.MAX_VALUE / 2);
        }
        int now = 0;
        int all = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (s[i].charAt(j) == 'S') {
                    qx[0] = i;
                    qy[0] = j;
                    w[i][j] = 0;
                }
            }
        }

        while (now < all) {
            int x = qx[now];
            int y = qy[now];
            now++;
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
                if (k < 2 && (s[x].charAt(y) == '.' || s[x].charAt(y) == '|')) {
                    continue;
                }
                if (k < 2 && (s[nx].charAt(ny) == '.' || s[nx].charAt(ny) == '|')) {
                    continue;
                }
                if (k >= 2 && (s[x].charAt(y) == '.' || s[x].charAt(y) == '-')) {
                    continue;
                }
                if (k >= 2 && (s[nx].charAt(ny) == '.' || s[nx].charAt(ny) == '-')) {
                    continue;
                }
                if (w[nx][ny] > w[x][y] + 1) {
                    w[nx][ny] = w[x][y] + 1;
                    qx[all] = nx;
                    qy[all] = ny;
                    all++;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (w[i][j] <= fuel) {
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        final long start = System.currentTimeMillis();
        System.out.println(4 == new Trainyard2().reachableSquares(new String[]{
                ".-....",
                "-S---.",
                "......"}, 2));
        System.out.println(10 == new Trainyard2().reachableSquares(new String[]{
                "..+-+.",
                "..|.|.",
                "S-+-+."}, 10));
        System.out.println(15 == new Trainyard2().reachableSquares(new String[]{
                "-....-",
                "|....+",
                "+-S++|",
                "|.|..|",
                "..+-++"}, 8));
        System.out.println(6 == new Trainyard2().reachableSquares(new String[]{
                ".|...",
                "-+S+|",
                ".|..."}, 5));
        System.out.println(100 == new Trainyard2().reachableSquares(new String[]
                 	{"++++++++++", "++++++++++", "++++++++++", "++++++++++",
                             "++++++++++", "++++S+++++", "++++++++++", "++++++++++", "++++++++++", "++++++++++"}, 10));
        System.out.println(String.format("%.4f seconds", (System.currentTimeMillis() - start) / 1000.f));
    }

}

