package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==ArrayList 추가==");
        addFirst(new ArrayList<>(), size); // O(n)
        addMid(new ArrayList<>(), size); // 찾는데는 O(1)인데, 추가한 인덱스부터 마지막 데이터까지 모두 이동시켜야하므로 O(n)

        ArrayList<Integer> arrayList = new ArrayList<>();
        addLast(arrayList, size); // 찾는데 O(1), 마지막 데이터 추가이므로 O(1)

        int loop = 10_000;
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, arrayList.size() / 2);
        getIndex(arrayList, loop, arrayList.size() - 1);

        findValue(arrayList, loop, 0);
        findValue(arrayList, loop, arrayList.size() / 2);
        findValue(arrayList, loop, arrayList.size() - 1);


        System.out.println("==LinkedList 추가==");
        addFirst(new LinkedList<>(), size); // O(1)
        addMid(new LinkedList<>(), size); // 찾는데 O(n), 데이터 추가하는데 O(1) 총 O(n)

        LinkedList<Integer> linkedList = new LinkedList<>();
        addLast(linkedList, size); // 찾는데 O(n)인데, 데이터 추가하는데 O(1) 총 O(n)

        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, linkedList.size() / 2);
        getIndex(linkedList, loop, linkedList.size() - 1);

        findValue(linkedList, loop, 0);
        findValue(linkedList, loop, linkedList.size() / 2);
        findValue(linkedList, loop, linkedList.size() - 1);
    }

    // 첫번째 인덱스에 추가
    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    // 중간 인덱스 지점 추가2
    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    // 마지막 인덱스 지점 추가
    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("인덱스 조회 반복 횟수: " + loop + ", 조회 시간: " + (endTime - startTime) + "ms");
    }

    private static void findValue(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("데이터 검색 반복 횟수: " + loop + ", 조회 시간: " + (endTime - startTime) + "ms");
    }
}
