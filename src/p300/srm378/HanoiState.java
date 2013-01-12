package p300.srm378;

import java.util.ArrayList;
import java.util.List;

public class HanoiState {
    private List<StringBuilder> pegs;

    public String partwayState(String target, int moves) {
        int max = target.length();
        pegs = createPegs(max);
        dump(pegs);
        move(3, 0, 2);
        dump(pegs);

        return "";
    }

    private void move(int weight, int x0, int x1) {
        StringBuilder fromRow = pegs.get(x0);
        if (fromRow.length() > 0) {
        }
        StringBuilder toRow = pegs.get(x1);
        if (toRow.length() == 0) {
        }
    }

    private List<StringBuilder> createPegs(int max) {
        List<StringBuilder> pegs = new ArrayList<StringBuilder>();
        for (int i = 0; i < 3; i++) {
            pegs.add(new StringBuilder());
        }

        StringBuilder builder = pegs.get(0);
        for (int i = 0; i < max; i++) {
            builder.append(String.format("%2d ", max - i));
        }
        return pegs;
    }

    private void dump(List<StringBuilder> pegs) {
        int k = 0;
        for (StringBuilder peg : pegs) {
            System.out.println(String.format("%2c = %s", (char)('A' + k), peg.length() > 0 ? peg.toString() : "empty"));
            k++;
        }
    }

    public static void assertEquals(Object a1, Object a2) {
        if (!a1.equals(a2)) {
            System.out.println("assertEquals failed: " + a1 + " not equals " + a2);
        }
    }

    public static void main(String[] args) {
        HanoiState m = new HanoiState();
        assertEquals(m.partwayState("CCC", 4), "BBC");
    }
}
