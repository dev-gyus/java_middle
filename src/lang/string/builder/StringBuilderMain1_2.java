package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("A");
//        stringBuilder.append("B");
//        stringBuilder.append("C");
//        stringBuilder.append("D");
        String string = stringBuilder.append("A").append("B").append("C").append("D")
            .insert(4, "Java")
            .delete(4, 8)
            .reverse()
            .toString();
        System.out.println("string = " + string);
    }
}
