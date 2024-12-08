package enumeration.ref3;



public class DiscountService {
    // 할인된 금액 반환
    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
