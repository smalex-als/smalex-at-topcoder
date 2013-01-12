package p200.srm233;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 27.01.2008
 * Time: 0:08:26
 */
public class SmartWordToy {
    int minPresses(String from, String to, String[] forbid) {
        int dist[] = new int[1 + encode("zzzz")];
        int queue[] = new int[1 + encode("zzzz")];
        System.out.println("queue = " + encode("zzzz"));
        createDist(forbid, dist);

        int queuePut = 0, queueGet = 0;
        queue[queuePut++] = encode(from);
        dist[encode(from)] = 1;
        int target = encode(to);
        while (queueGet < queuePut) {
            int pos = queue[queueGet++];
            if (pos == target) {
                return dist[pos] - 1;
            }
            for (int delta = -1; delta <= 1; delta += 2)
                for (int i = 0; i < 4; i++) {
                    int npos = next(pos, i, delta);
                    if (dist[npos] == 0) {
                        dist[npos] = dist[pos] + 1;
                        queue[queuePut++] = npos;
                    }
                }
        }
        return -1;
    }

    private int next(int pos, int i, int delta) {
        int shift = i * 5;
        int c = (pos >> shift) & 31;
        pos -= c << shift;
        pos += ((c + delta + 26) % 26) << shift;
        return pos;
    }

    private void createDist(String[] forbid, int[] dist) {
        for (String s : forbid) {
            char[] word = new char[4];
            String[] strings = s.split(" ");
            for (int i0 = 0; i0 < strings[0].length(); i0++) {
                word[0] = strings[0].charAt(i0);
                for (int i1 = 0; i1 < strings[1].length(); i1++) {
                    word[1] = strings[1].charAt(i1);
                    for (int i2 = 0; i2 < strings[2].length(); i2++) {
                        word[2] = strings[2].charAt(i2);
                        for (int i3 = 0; i3 < strings[3].length(); i3++) {
                            word[3] = strings[3].charAt(i3);
                            String s1 = new String(word);
                            dist[encode(s1)] = -10;
                        }
                    }
                }
            }
        }
    }

    private int encode(String s) {
        int res = 0;
        int shift = 0;
        for (int i = 0; i < s.length(); i++) {
            res |= ((int) (s.charAt(i) - 'a')) << shift;
            shift += 5;
        }
        return res;
    }

    private String decode(int n) {
        byte[] res = new byte[4];
        res[0] = (byte) (((n >> 15) & 31) + 'a');
        res[1] = (byte) (((n >> 10) & 31) + 'a');
        res[2] = (byte) (((n >> 5) & 31) + 'a');
        res[3] = (byte) (((n) & 31) + 'a');
        return new String(res);
    }

    public static void main(String[] args) {
        System.out.println(8 == new SmartWordToy().minPresses("aaaa",
                "zzzz",
                new String[]{"a a a z", "a a z a", "a z a a", "z a a a", "a z z z", "z a z z", "z z a z", "z z z a"}));
    }
}
