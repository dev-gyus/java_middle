package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now();// UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0); // UTC 기준 1970/1/1 00:00:00
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // 조회
        long epochSecond = later.getEpochSecond(); // instant에 추가된 초 시간을 조회
        System.out.println("epochSecond = " + epochSecond);
    }
}
