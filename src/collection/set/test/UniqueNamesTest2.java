package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNamesTest2 {
    // 입력한 순서를 유지하면서 중복제거
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(inputArr));
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
