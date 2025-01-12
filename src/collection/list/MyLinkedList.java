package collection.list;


// Type 안정성을 높이기 위한 제네릭 적용
public class MyLinkedList<T> implements MyList<T> {
    private Node<T> first;
    private int size = 0;

    @Override
    public void add(T e) {
        Node<T> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
        }
        else {
            Node<T> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<T> getLastNode() {
        Node<T> lastNode = first;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        return lastNode;
    }
    // 추가 코드
    public void add(int index, T e) {
        Node<T> node = new Node<>(e);
        if (index == 0) {
            node.next = first;
            first = node;
        } else {
            Node<T> prevNode = getNode(index - 1);
            Node<T> nextNode = prevNode.next;
            prevNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    @Override
    public T set(int index, T e) {
        Node<T> x = getNode(index);
        T oldValue = x.item;
        x.item = e;
        return oldValue;
    }

    // 추가 코드
    @Override
    public T remove(int index) {
        T result = null;
        if (index == 0) {
            result = first.item;
            first = first.next;
        } else {
            Node<T> prevNode = getNode(index - 1);
            result = prevNode.next.item;
            prevNode.next = prevNode.next.next;
        }
        size--;
        return result;
    }

    @Override
    public T get(int index) {
        Node<T> node = getNode(index);
        return node.item;
    }

    private Node<T> getNode(int index) {
        Node<T> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public int indexOf(T o) {
        int index = 0;
        for (Node<T> x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
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

    static class Node<T> {
        T item;
        Node<T> next;

        public Node(T item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            Node<T> x = this;
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
}
