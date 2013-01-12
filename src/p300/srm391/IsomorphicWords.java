package p300.srm391;

public class IsomorphicWords {
    public int countPairs(String[] words) {
        final int n = words.length;
        String[] enc = new String[n];
        for (int i = 0; i < n; i++) {
            enc[i] = norm(words[i]);
        }
        int ret = 0;
        for (String s0 : enc) {
            for (String s1 : enc) {
                if (s0.equals(s1)) {
                    ret++;
                }
            }
        }
        return (ret - n) / 2;
    }

    private String norm(String word) {
        String map = "";
        String res = "";
        for (int j = 0; j < word.length(); j++) {
            final char c = word.charAt(j);
            if (map.indexOf(c) == -1) {
                map += c;
            }
            res += (char)('a' + map.indexOf(c));
        }
        System.out.println("res = " + res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(1 == new IsomorphicWords().countPairs(new String[]{"abca", "zbxz", "opqr"}));
        System.out.println(4 == new IsomorphicWords().countPairs(new String[]{"aa", "ab", "bb", "cc", "cd"}));
        System.out.println(278 == new IsomorphicWords().countPairs(new String[]
                {"whwwxaisjfip", "kswshxgvodxu", "hdpdbsgiuesf", "hohhixapjgad", "hwpwjabdsxag", "adgdwjfisvjx", "oipfjksikvbp", "xiwiujfkbgjv", "ofoophvakjwg", "vuvvihwsbkwo", "ujuuoiegvxed", "koiosgufpwgv", "dbsbiwegofwx", "ebfhvwaoujwi", "oefehvbjsavk", "pjhsibfjbugh", "dpapvxdubjxi", "bkxkdfhgpvfs", "gwkwbfpjeufd", "gsjsbfwkvdfa", "bsbbjpokedox", "vjgjieohwaed", "fasaijogupjv", "vsasxguhwbgk", "wgjgphedixhv", "wdfdauokigub", "skakgpdvbwpi", "vkieoaxkagsi", "bwvwdkuoiakp", "whshpovuixok", "hvjaokxvkpuj", "gbkgowsevijx", "uadahgvfjsgi", "wuwwjfosxhog", "wubufgkxapgd", "shjhkwifeowv", "xugosawuafkg", "jivikaowefad"}));
        System.out.println(13 == new IsomorphicWords().countPairs(new String[]{
                "cacccdaabc", "cdcccaddbc", "dcdddbccad", "bdbbbaddcb",
                "bdbcadbbdc", "abaadcbbda", "babcdabbac", "cacdbaccad",
                "dcddabccad", "cacccbaadb", "bbcdcbcbdd", "bcbadcbbca" }));
    }
}
