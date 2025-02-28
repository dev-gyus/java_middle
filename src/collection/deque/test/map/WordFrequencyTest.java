package collection.deque.test.map;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        Map<String, Integer> frequency = new HashMap<>();

        String[] slicedText = text.split(" ");
        for (String s : slicedText) {
            frequency.put(s, frequency.getOrDefault(s, 0) + 1);
        }

        System.out.println(frequency);
    }
}
