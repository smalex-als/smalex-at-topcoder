package p300.srm388;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 15.01.2008
 * Time: 23:53:15
 */
public class VoteRigging {
    public int minimumVotes(int[] votes) {
        if (votes.length == 1) {
            return 0;
        }

        int cnt = 0;
        while (true) {
            int pos = max(votes);
            if (pos == 0) {
                break;
            } else {
                votes[0]++;
                votes[pos]--;
                cnt++;
            }
        }
        System.out.println(Arrays.toString(votes));
        System.out.println("cnt = " + cnt);
        return cnt;
    }

    private int max(int[] votes) {
        int pos = 0;
        int m = votes[pos];
        for (int i = 1; i < votes.length; i++) {
            int vote = votes[i];
            if (vote >= m) {
                m = vote;
                pos = i;
            }
        }
        return pos;
    }
    
    public static void main(String[] args) {
        System.out.println(2 == new VoteRigging().minimumVotes(new int[]{5, 7, 7}));
        System.out.println(1 == new VoteRigging().minimumVotes(new int[]{10, 10, 10, 10}));
        System.out.println(4 == new VoteRigging().minimumVotes(new int[]{5, 10, 7, 3, 8}));
        System.out.println(98 == new VoteRigging().minimumVotes(new int[]{1, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100}));
        System.out.println(41 == new VoteRigging().minimumVotes(new int[]{1, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
        System.out.println(78 == new VoteRigging().minimumVotes(new int[]{3, 12, 43, 45, 99, 32, 32, 75, 21, 56, 2, 75, 23, 97, 98, 43, 23, 23, 76, 43, 21, 45, 97, 53, 84}));
    }
}
