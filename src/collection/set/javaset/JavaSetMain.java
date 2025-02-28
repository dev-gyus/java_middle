package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        // 순서 보장 x
        Set<String> hashSet = new HashSet<>();
        // 순서 보장 o
        Set<String> linkedHashSet = new LinkedHashSet<>();
        // 정렬된 상태로 유지
        Set<String> treeSet = new TreeSet<>();

        run(hashSet);
        run(linkedHashSet);
        run(treeSet);
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        // hashSet = O(1)
        // linkedHashSet = O(1)
        // treeSet = O(logN) <- 정렬
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("set = " + set);
    }
}
