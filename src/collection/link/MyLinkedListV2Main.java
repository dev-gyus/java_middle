package collection.link;


public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        // 마지막에 추가 // O(n)
        list.add("a");
        list.add("b");
        list.add("c");

        // 원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addList"); // O(n) <- 특정 인덱스까지 접근해야하므로 n번 반복
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0, "addFirst"); // O(1) <- 첫번째 인덱스에 추가하는건 1번만 하면됨
        System.out.println(list);

        // 삭제
        Object removed1 = list.remove(4);
        System.out.println("removed(4) = " + removed1);

        Object removed2 = list.remove(0);
        System.out.println("removed(0) = " + removed2);
        System.out.println(list);
    }
}
