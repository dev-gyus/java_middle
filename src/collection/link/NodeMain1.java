package collection.link;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NodeMain1 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기 : A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색하기");
        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
        System.out.println("first.item = " + first.item);
        System.out.println("first.next.item = " + first.next.item);
        System.out.println("first.next.next.item = " + first.next.next.item);
        int[] a = new int[]{1,2,3};
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(b));
        List<Integer> list = new ArrayList<>();
        Integer[] array = list.toArray(new Integer[0]);
        String asdf = "asdf";
    }
}
