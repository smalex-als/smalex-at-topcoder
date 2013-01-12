package p300.srm390;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 02.02.2008
 * Time: 20:39:34
 */
public class SetOfPatterns {
    public int howMany(String[] patterns, int k) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(26 == new SetOfPatterns().howMany(new String[]{"?"}, 1));
        System.out.println(3 == new SetOfPatterns().howMany(new String[]{"a", "b", "c"}, 1));
        System.out.println(1 == new SetOfPatterns().howMany(new String[]{"a?", "?b"}, 2));
        System.out.println(881343 == new SetOfPatterns().howMany(new String[]{"?????"}, 1));
    }
}
