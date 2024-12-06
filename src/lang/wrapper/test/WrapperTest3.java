package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        // Integer -> int
        int intValue = integer1.intValue();
        System.out.println("intValue");
    }
}
