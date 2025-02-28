package collection.deque.test.map;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Map<String, Integer> commonSum = new HashMap<>();
        map1.forEach((k, v) -> {
            if (map2.containsKey(k)) {
                commonSum.put(k, map2.get(k) + v);
            }
        });
        System.out.println(commonSum);
    }
}
