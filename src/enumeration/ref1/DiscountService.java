package enumeration.ref1;


public class DiscountService {
    // 할인된 금액 반환
    public int discount(ClassGrade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
