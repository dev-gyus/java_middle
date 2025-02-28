package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RectangleTest {
    // 입력한 순서를 유지하면서 중복제거 + 데이터의 값으로 정렬해서 출력
    public static void main(String[] args) {
        Set<Rectangle> rectangleSet = new HashSet<>();
        rectangleSet.add(new Rectangle(10, 10));
        rectangleSet.add(new Rectangle(20, 20));
        rectangleSet.add(new Rectangle(20, 20)); // 중복

        for(Rectangle rectangle : rectangleSet) {
            System.out.println(rectangle);
        }
    }
}