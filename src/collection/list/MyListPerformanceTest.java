package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==MyArrayList 추가==");
        addFirst(new MyArrayList<>(), size); // O(n)
        addMid(new MyArrayList<>(), size); // 찾는데는 O(1)인데, 추가한 인덱스부터 마지막 데이터까지 모두 이동시켜야하므로 O(n)

        MyArrayList<Integer> arrayList = new MyArrayList<>();
        addLast(arrayList, size); // 찾는데 O(1), 마지막 데이터 추가이므로 O(1)

        int loop = 10_000;
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, arrayList.size() / 2);
        getIndex(arrayList, loop, arrayList.size() - 1);

        findValue(arrayList, loop, 0);
        findValue(arrayList, loop, arrayList.size() / 2);
        findValue(arrayList, loop, arrayList.size() - 1);


        System.out.println("==MyLinkedList 추가==");
        addFirst(new MyLinkedList<>(), size); // O(1)
        addMid(new MyLinkedList<>(), size); // 찾는데 O(n), 데이터 추가하는데 O(1) 총 O(n)

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size); // 찾는데 O(n)인데, 데이터 추가하는데 O(1) 총 O(n)

        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, linkedList.size() / 2);
        getIndex(linkedList, loop, linkedList.size() - 1);

        findValue(linkedList, loop, 0);
        findValue(linkedList, loop, linkedList.size() / 2);
        findValue(linkedList, loop, linkedList.size() - 1);
    }

    // 첫번째 인덱스에 추가
    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    // 중간 인덱스 지점 추가2
    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    // 마지막 인덱스 지점 추가
    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("인덱스 조회 반복 횟수: " + loop + ", 조회 시간: " + (endTime - startTime) + "ms");
    }

    private static void findValue(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("데이터 검색 반복 횟수: " + loop + ", 조회 시간: " + (endTime - startTime) + "ms");
    }
}
