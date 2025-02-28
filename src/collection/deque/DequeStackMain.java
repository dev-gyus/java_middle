package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeStackMain {
    public static void main(String[] args) {
//        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        // 데이터 추가
        // stack은 삽입시 push
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peek() = " + deque.peek());

        // 스택처럼 꺼내기
        // stack은 꺼낼때 pop
        System.out.println("deque.pollLast() = " + deque.pop());
        System.out.println("deque.pollLast() = " + deque.pop());
        System.out.println("deque.pollLast() = " + deque.pop());
    }
}
