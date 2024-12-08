package enumeration.ex3;

import enumeration.ex2.ClassGrade;

public class DiscountService {
    // 할인된 금액 반환
    public int discount(Grade grade, int price) {
        int discountPercent = 0;
        if (grade == Grade.BASIC) {
            discountPercent = 10;
        } else if (grade == Grade.GOLD) {
            discountPercent = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }
        return price * discountPercent / 100;
    }
}
