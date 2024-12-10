package time.test;

import java.time.LocalDate;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate originDate = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            System.out.println(originDate.plusWeeks(2 * i));
        }
    }
}
