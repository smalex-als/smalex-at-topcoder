package p300.srm378;

public class HanoiState2 {
    class State {
        int[] a;

        public State(String s) {
            a = new int[s.length()];
            for (int i = 0; i < a.length; i++) a[i] = s.charAt(i) - 'A';
        }

        public State() {
            a = new int[n];
        }

        public String toString() {
            String s = "";
            for (int i = 0; i < a.length; i++) s += (char) (a[i] + 'A');
            return s;
        }

        public State getState1(int u, int from, int to) {
            State ret = new State();
            for (int i = 0; i < a.length; i++) {
                if (i > u) ret.a[i] = a[i];
                if (i < u) ret.a[i] = 3 - from - to;
            }
            ret.a[u] = to;
            return ret;
        }

        public State getState2(int u, int from, int to) {
            State ret = new State();
            for (int i = 0; i < a.length; i++) {
                if (i >= u) ret.a[i] = a[i];
                if (i < u) ret.a[i] = 3 - from - to;
            }
            return ret;
        }
    }

    public String partwayState(String target, int moves) {
        n = target.length();
        String start = "";
        for (int i = 0; i < n; i++) start += 'A';
        State startState = new State(start);
        System.out.println("startState = " + startState);
        State targetState = new State(target);
        System.out.println("targetState = " + targetState);
        return doit(startState, targetState, moves);
    }

    private int n;

    private String doit(State s, State t, int moves) {
        System.out.println("enter");
        System.out.println("s = " + s);
        System.out.println("t = " + t);
        System.out.println("moves = " + moves);
        if (moves == 0) return s.toString();
        for (int i = n - 1; i >= 0; i--) {
            if (s.a[i] != t.a[i]) {
                int dis = 1 << i;
                State temp1 = s.getState1(i, s.a[i], t.a[i]);
                System.out.println("temp1 = " + temp1);
                State temp2 = s.getState2(i, s.a[i], t.a[i]);
                System.out.println("temp2 = " + temp2);
                if (dis <= moves) return doit(temp1, t, moves - dis);
                else return doit(s, temp2, moves);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HanoiState2 m = new HanoiState2();
        System.out.println(m.partwayState("CCC", 4));
    }

}
