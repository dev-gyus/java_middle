package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {
    public static void main(String[] args) {
//        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        // 데이터 추가
        // queue는 삽입시 offer
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peek() = " + deque.peek());

        // 큐처럼 꺼내기
        // queue는 꺼낼때 poll
        System.out.println("deque.pollFirst() = " + deque.poll());
        System.out.println("deque.pollFirst() = " + deque.poll());
        System.out.println("deque.pollFirst() = " + deque.poll());
    }
}
