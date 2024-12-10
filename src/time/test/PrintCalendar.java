package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

// 입력받은 년도, 월에 해당하는 달력을 콘솔에 출력
public class PrintCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("년도를 입력하세요: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("월을 입력하세요: ");
        int month = Integer.parseInt(scanner.nextLine());

        printCalendar1(year, month);
        System.out.println();
        printCalendar2(year, month);
    }

    // 답안
    private static void printCalendar2(int year, int month) {
        LocalDate baseDt = LocalDate.of(year, month, 1);
        // 월요일 = 1 , 일요일 = 7
        int firstDayValue = baseDt.getDayOfWeek().getValue();
        System.out.println("Su Mo Tu We Th Fr Sa");
        int firstDayIdx = firstDayValue % 7;
        for (int i = 0; i < firstDayIdx; i++) {
            System.out.print("   ");
        }
        LocalDate nextMonthFirstDay = baseDt.plusMonths(1);
        while (baseDt.isBefore(nextMonthFirstDay)) {
            int day = baseDt.getDayOfMonth();
            System.out.printf("%2d", day);
            System.out.print(" ");
            if (baseDt.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            baseDt = baseDt.plusDays(1);
        }
    }

    // 내가 최초에 푼 방식
    private static void printCalendar1(int year, int month) {
        LocalDate baseDt = LocalDate.of(year, month, 1);
        // 월요일 = 1 , 일요일 = 7
        int firstDayValue = baseDt.getDayOfWeek().getValue();
        LocalDate lastDt = baseDt.with(TemporalAdjusters.lastDayOfMonth());
        int lastDayValue = lastDt.getDayOfMonth();
        System.out.println("Su Mo Tu We Th Fr Sa");
        int firstDayIdx = firstDayValue % 7;

        for (int i = 0; i < firstDayIdx; i++) {
            System.out.print("   ");
        }

        for (int i = 1; i <= lastDayValue; i++) {
            if (i < 10) {
                System.out.printf(" " + i);
            } else {
                System.out.print(i);
            }
            if (++firstDayIdx > 6) {
                System.out.println();
                firstDayIdx = 0;
            } else {
                System.out.print(" ");
            }
        }
    }
}
