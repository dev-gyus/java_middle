package lang.string.test;

public class TestString8 {
    public static void main(String[] args) {
        String original = "hello java spring jpa java";
        String replacedStr = original.replace("java", "jvm");
        System.out.println("replacedStr = " + replacedStr);
    }
}
