package collection.link;

public class Node {
    Object item;
    Node next;
    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node x = this;
        builder.append("[");
        while (x != null) {
            builder.append(x.item);
            if (x.next != null) {
                builder.append("->");
            }
            x = x.next;
        }
        builder.append("]");
        return builder.toString();
    }
}
