package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        // 동일한 학생 key에 대해 값을 추가
        studentMap.put("studentA", 100);
        System.out.println(studentMap); // 덮어씌워짐

        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println(containsKey);

        studentMap.remove("studentA");
        System.out.println(studentMap);
    }
}
