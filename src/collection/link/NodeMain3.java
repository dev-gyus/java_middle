package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);
        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        // 마지막 노드 조회하기
        Node lastNode = getLastNode(first);

        // 특정 index의 노드 조회하기
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node);

        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, new Node("D"));
        System.out.println(first);
        add(first, new Node("E"));
        System.out.println(first);
        add(first, new Node("F"));
        System.out.println(first);


    }

    private static void add(Node origin, Node add) {
        Node lastNode = getLastNode(origin);
        lastNode.next = add;
    }

    private static void printAll(Node node) {
        Node x = node;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
    }

    private static Node getLastNode(Node start) {
        Node x = start;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
}
