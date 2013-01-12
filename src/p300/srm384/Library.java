package p300.srm384;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 14.04.2008
 * Time: 9:59:20
 */
public class Library {
    public int documentAccess(String[] records, String[] userGroups, String[] roomRights) {
        Set<String> userGroupsSet = new HashSet<String>(Arrays.asList(userGroups));
        Set<String> roomRightsSet = new HashSet<String>(Arrays.asList(roomRights));
        Set<String> documents = new HashSet<String>();
        for (int i = 0; i < records.length; i++) {
            String record = records[i];
            String[] row = record.split(" ");
            String room = row[1];
            String group = row[2];
            if (userGroupsSet.contains(group) && roomRightsSet.contains(room)) {
                documents.add(row[0]);
            }
        }
        return documents.size();
    }

    public static void main(String[] args) {
        System.out.println(2 == new Library().documentAccess(new String[]{"diary computers editor", "fairytale gardening editor",
                "comix cars author", "comix cars librarian"},
                new String[]{"employee", "editor", "author"},
                new String[]{"history", "cars", "computers"}));

        System.out.println(2 == new Library().documentAccess(new String[]{"diary computers editor", "fairytale gardening editor", "comix cars author", "comix cars librarian"},
                new String[]{"employee", "editor", "author", "librarian"},
                new String[]{"history", "cars", "computers"}));

        System.out.println(0 == new Library().documentAccess(new String[]{"diary computers editor", "fairytale gardening editor", "comix cars author", "comix cars librarian"},
                new String[]{"employee", "editor", "author", "librarian"},
                new String[]{}));

        System.out.println(3 == new Library().documentAccess(new String[]{"a b c", "a b d", "b b c", "b b d", "e c d", "e c b", "e c c", "t d e"},
                new String[]{"c", "d", "x"},
                new String[]{"a", "b", "c"}));
    }
}
