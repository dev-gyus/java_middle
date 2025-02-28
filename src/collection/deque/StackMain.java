package collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        // stack쓸때는 stack 쓰지말고 deque를 stack처럼 쓰는게 좋음 (vector를 쓰기 때문에 안쓰는걸 권장)
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // 다음 꺼낼 요소 확인(꺼내지는 않고 확인만)
        System.out.println("stack.peek() = " + stack.peek()); // 3

        // 스택 요소 꺼내기
        System.out.println("stack.pop() = " + stack.pop()); // 3
        System.out.println("stack.pop() = " + stack.pop()); // 2
        System.out.println("stack.pop() = " + stack.pop()); // 1
    }
}
