package enumeration.ex3;


import enumeration.ex2.ClassGrade;

public class ClassGradeEx3_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int result = discountService.discount(Grade.BASIC, price);
        System.out.println("result = " + result);
    }
}