package collection.deque.test.map;

import java.util.*;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String key = null;
        String value = null;
        System.out.println("==단어 입력 단계==");
        while(true) {
            System.out.println("영어 단어를 입력하세요 (종료는 'q'): ");
            key = scanner.nextLine();
            if (key.equals("q")) { break; }
            System.out.println("한글 뜻을 입력하세요: ");
            value = scanner.nextLine();
            dictionary.put(key, value);
        }

        System.out.println("==단어 검색 단계==");
        while(true) {
            System.out.println("영어 단어를 입력하세요 (종료는 'q'): ");
            key = scanner.nextLine();
            if (key.equals("q")) { break; }
            String foundWord = dictionary.get(key);
            if (foundWord != null) {
                System.out.println(key + "의 뜻: " + foundWord);
            } else {
                System.out.println(key + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
