package p200.srm222;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: smalex
 * Date: 05.04.2008
 * Time: 8:51:09
 */
public class GroceryBagger {
    public int minimumBags(int strength, String[] itemType) {
        int cnt[] = new int[50];
        Map<String, Integer> types = new HashMap<String, Integer>();
        int idx = 0;
        for (String type : itemType) {
            if (!types.containsKey(type)) {
                types.put(type, idx++);
            }
            cnt[types.get(type)]++;
        }
        int sum = 0;
        for (int i : cnt) {
            sum += (i + strength - 1) / strength;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(4 == new GroceryBagger().minimumBags(2, new String[]{"DAIRY", "DAIRY", "PRODUCE", "PRODUCE", "PRODUCE", "MEAT"}));
        System.out.println(3 == new GroceryBagger().minimumBags(3, new String[]{"DAIRY", "DAIRY", "PRODUCE", "PRODUCE", "PRODUCE", "MEAT"}));
    }
}
