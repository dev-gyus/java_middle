package collection.deque.test.map;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "2000"}, {"JPA", "30000"}};
        // 주어진 배열로부터 Map 생성 - 코드 작성
        Map<String, String> map = Arrays.stream(productArr)
            .collect(Collectors.toMap(product -> product[0], product -> product[1]));
        // Map의 모든 데이터 출력 - 코드 작성
        map.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
