package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        // 모든 Enum 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        // String -> Enum 변환, Enum 타입에 없는 문자열이 들어가면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}
