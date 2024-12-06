package lang.string.builder;

import java.util.stream.IntStream;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java";
        }
        long endTime = System.currentTimeMillis();

        System.out.printf("endTime - startTime = " + (endTime - startTime));
    }
}
