package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        // 순서 보장x
        run(new HashMap<>()); // O(1)
        // 순서 보장o
        run(new LinkedHashMap<>()); // O(1)
        // key 값으로 정렬
        run(new TreeMap<>()); // O(logN)
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map);
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " = " + map.get(key));
        }
    }
}
