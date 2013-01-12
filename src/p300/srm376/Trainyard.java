package p300.srm376;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 20.01.2008
 * Time: 22:52:31
 */
public class Trainyard {
    private String[] layout;
    private int maxY;
    private int maxX;
    private boolean[] visited;

    public int reachableSquares(String[] layout, int fuel) {
        this.layout = layout;
        this.maxX = layout[0].length();
        this.maxY = layout.length;
        int startX = -1, startY = -1;
        for (int y = 0; y < layout.length; y++) {
            final int x = layout[y].indexOf("S");
            if (x != -1) {
                startX = x;
                startY = y;
            }
        }
        visited = new boolean[maxX * maxY];
        visited[startX + startY * maxX] = true;

        move(startX, startY, 0, -1, fuel);
        move(startX, startY, 0, 1, fuel);
        move(startX, startY, -1, 0, fuel);
        move(startX, startY, 1, 0, fuel);

        int result = 0;
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) {
                result++;
            }
        }
//        for (int y = 0; y < maxY; y++) {
//            for (int x = 0; x < maxX; x++) {
//                System.out.print(visited[x + y * maxX] + " ");
//            }
//            System.out.println("");
//        }
        System.out.println("result = " + result);
        return result;
    }

    private void move(int startX, int startY, int dX, int dY, int fuel) {
        if (fuel - 1 < 0) {
            return;
        }
        fuel--;
        final int nextX = startX + dX;
        final int nextY = startY + dY;
        if (nextX >= 0 && nextX < maxX && nextY >= 0 && nextY < maxY) {
            final char c = layout[nextY].charAt(nextX);
            if (dX != 0 && (c == '-' || c == '+')) {
                printMatch(nextX, nextY, fuel);
                visited[nextX + nextY * maxX] = true;
                move(nextX, nextY, dX, dY, fuel);
                if (c == '+') {
                    move(nextX, nextY, 0, 1, fuel);
                    move(nextX, nextY, 0, -1, fuel);
                }
            } else if (dY != 0 && (c == '|' || c == '+')) {
                printMatch(nextX, nextY, fuel);
                visited[nextX + nextY * maxX] = true;
                move(nextX, nextY, dX, dY, fuel);
                if (c == '+') {
                    move(nextX, nextY, 1, 0, fuel);
                    move(nextX, nextY, -1, 0, fuel);
                }
            }
//            if (c == '+') {
//                move(nextX, nextY, 1, 0, fuel);
//                move(nextX, nextY, -1, 0, fuel);
//                move(nextX, nextY, 0, 1, fuel);
//                move(nextX, nextY, 0, -1, fuel);
//            }
        }
    }

    private void printMatch(int nextX, int nextY,  int fuel) {
//        System.out.println("next[" + fuel + ": " + nextX + ", " + nextY + "]");
    }

    public static void main(String[] args) {
        final long start = System.currentTimeMillis();
        
        System.out.println(4 == new Trainyard().reachableSquares(new String[]{
                ".-....",
                "-S---.",
                "......"}, 2));
        System.out.println(10 == new Trainyard().reachableSquares(new String[]{
                "..+-+.",
                "..|.|.",
                "S-+-+."}, 10));
        System.out.println(15 == new Trainyard().reachableSquares(new String[]{
                "-....-",
                "|....+",
                "+-S++|",
                "|.|..|",
                "..+-++"}, 8));
        System.out.println(6 == new Trainyard().reachableSquares(new String[]{
                ".|...",
                "-+S+|",
                ".|..."}, 5));
        System.out.println(100 == new Trainyard().reachableSquares(new String[]
                 	{"++++++++++", "++++++++++", "++++++++++", "++++++++++",
                             "++++++++++", "++++S+++++", "++++++++++", "++++++++++", "++++++++++", "++++++++++"}, 10));
        System.out.println(String.format("%.4f seconds", (System.currentTimeMillis() - start) / 1000.f));
    }
}
