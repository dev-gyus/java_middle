package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        // String은 불변객체라 한번 생성한 다음 그 객체의 문자열 자체를 변경하는 것은 불가능
        String str = "hello";
        String concatenatedStr = str.concat(" java");
        System.out.println("str = " + str);
        System.out.println("concatenatedStr = " + concatenatedStr);
    }
}
