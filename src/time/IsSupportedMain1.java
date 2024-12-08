package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
//        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
//        System.out.println("minute = " + minute); // 예외 발생

        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);

        if (supported) {
            System.out.println(now.get(ChronoField.SECOND_OF_MINUTE));
        }
    }
}
