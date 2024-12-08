package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2024, 12, 7, 20, 59, 33);
        System.out.println("현재 날짜시간 = " + nowDt);
        System.out.println("지정 날짜시간 = " + ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        // 계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정 날짜 시간 + 1000d = " + ofDtPlus);
        LocalDateTime ofDtYearPlus = ofDt.plusYears(1);
        System.out.println("지정 날짜 시간 + 1y = " + ofDtYearPlus);

        // 비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? = " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가? = " + nowDt.isAfter(ofDt));
        // isEquals() -> 날짜, 시간 데이터만 동일한지 확인
        // equals() -> 날짜, 시간, 타임존 등 모든 시간과 관련된 데이터가 동일한지 확인
        System.out.println("현재 날짜 시간이 지정 날짜 시간과 동일한가? = " + nowDt.isEqual(ofDt));
    }
}
