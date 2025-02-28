package collection.map;

import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        // if 활용해서 학생 key가 없는 경우에만 데이터 추가
        if (!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }
        // if 사용 안하고 학생 key가 없는 경우에만 데이터 추가
        studentMap.putIfAbsent("studentA", 100);
        System.out.println(studentMap); // studentA는 키값이 이미 위에서 추가되었기 때문에 덮어씌워지지 않음

        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println(containsKey);

        studentMap.remove("studentA");
        System.out.println(studentMap);
    }
}
