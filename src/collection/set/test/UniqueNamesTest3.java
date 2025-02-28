package collection.set.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    // 입력한 순서를 유지하면서 중복제거 + 데이터의 값으로 정렬해서 출력
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new TreeSet<>(Arrays.asList(inputArr));
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
