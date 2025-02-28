package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    // 입력한 순서를 유지하면서 중복제거 + 데이터의 값으로 정렬해서 출력
    public static void main(String[] args) {
        Integer[] inputArr1 = {1,2,3,4,5};
        Integer[] inputArr2 = {3,4,5,6,7};
        // 합집합
        Set<Integer> union = new HashSet<>(Arrays.asList(inputArr1));
        union.addAll(Arrays.asList(inputArr2));
        for (Integer i : union) {
            System.out.println(i);
        }
        System.out.println();
        // 교집합
        Set<Integer> intersection = new HashSet<>(Arrays.asList(inputArr1));
        Set<Integer> crossSet2 = new HashSet<>(Arrays.asList(inputArr2));
        for (Integer i : intersection) {
            if (crossSet2.contains(i)) {
                System.out.println(i);
            }
        }
        System.out.println();
        // 차집합
        Set<Integer> difference1 = new HashSet<>(Arrays.asList(inputArr1));
        Set<Integer> difference2 = new HashSet<>(Arrays.asList(inputArr2));
        difference1.removeAll(difference2);
        for (Integer i : difference1) {
            System.out.println(i);
        }
    }
}
