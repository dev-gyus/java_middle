package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            builder.append("Hello Java");
        }
        long endTime = System.currentTimeMillis();

        System.out.printf("endTime - startTime = " + (endTime - startTime));
    }
}
