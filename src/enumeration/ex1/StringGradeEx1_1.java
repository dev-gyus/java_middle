package enumeration.ex1;


public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액 : " + basic);
        System.out.println("GOLD 등급의 할인 금액 : " + gold);
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond);

        // 존재하지 않는 등급의 할인금액
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액 : " + vip);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액: " + diamondd);

        // 소문자 입력
        int goldLowerCase = discountService.discount("gold", price);
        System.out.println("goldLowerCase 등급의 할인 금액: " + goldLowerCase);
    }
}
