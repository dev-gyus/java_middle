package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;
        for (String elem : arr) {
            System.out.println(elem + ":" + elem.length());
            sum += elem.length();
        }
        System.out.println("sum = " + sum);
    }
}
