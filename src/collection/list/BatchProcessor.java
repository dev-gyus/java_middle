package collection.list;

// 의존관계 주입 받는 방식으로 구체적인 클래스에 의존하는 것이 아닌 추상화 객체에 의존하도록 변경
// OCP 원칙을 지킴
// 디자인 패턴중 Strategy 패턴 사용
public class BatchProcessor {
    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
