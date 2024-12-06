package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A");
        stringBuilder.append("B");
        stringBuilder.append("C");
        stringBuilder.append("D");
        System.out.println("sb = " + stringBuilder);

        stringBuilder.insert(4, "Java");
        System.out.println("insert = " + stringBuilder);

        stringBuilder.delete(4, 8);
    }
}
