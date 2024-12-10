package time.test;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        // 코드 작성
        LocalDate originDate = LocalDate.of(year, month, 1);
        LocalDate firstDate = originDate.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDate = originDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("firstDayOfWeek = " + firstDate.getDayOfWeek());
        System.out.println("lastDayOfWeek = " + lastDate.getDayOfWeek());
    }
}
