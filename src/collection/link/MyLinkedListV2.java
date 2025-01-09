package collection.link;

public class MyLinkedListV2 {
    private Node first;
    private int size = 0;
    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        }
        else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node lastNode = first;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        return lastNode;
    }
    // 추가 코드
    public void add(int index, Object e) {
        Node node = new Node(e);
        if (index == 0) {
            node.next = first;
            first = node;
        } else {
            Node prevNode = getNode(index - 1);
            Node nextNode = prevNode.next;
            prevNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public Object set(int index, Object e) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = e;
        return oldValue;
    }

    // 추가 코드
    public Object remove(int index) {
        Object result = null;
        if (index == 0) {
            result = first.item;
            first = first.next;
        } else {
            Node prevNode = getNode(index - 1);
            result = prevNode.next.item;
            prevNode.next = prevNode.next.next;
        }
        size--;
        return result;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
            "first=" + first +
            ", size=" + size +
            '}';
    }
}
