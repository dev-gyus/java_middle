package enumeration.ref2;


import enumeration.ref1.ClassGrade;

public class DiscountService {
    // 할인된 금액 반환
    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
