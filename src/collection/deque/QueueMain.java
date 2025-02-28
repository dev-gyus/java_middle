package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
//        Queue<String> queue = new LinkedList<>();
        // linked list보단 arraydeque가 좀 더 효율적임
        Queue<Integer> queue2 = new ArrayDeque<>();
        // 데이터 추가
        queue2.offer(1);
        queue2.offer(2);
        queue2.offer(3);
        System.out.println(queue2);

        // 다음 꺼낼 데이터 확인 (꺼내지는 않고 확인만)
        System.out.println("queue2.peek() = " + queue2.peek());
        System.out.println();

        // 데이터 꺼내기
        System.out.println("queue2.poll() = " + queue2.poll());
        System.out.println("queue2.poll() = " + queue2.poll());
        System.out.println("queue2.poll() = " + queue2.poll());
        System.out.println(queue2);
    }
}
