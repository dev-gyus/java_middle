package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        // public 생성자를 그대로 두는 경우 객체를 생성해서 discount 메소드의 매개변수로 전달하는 경우의 컴파일 예외 발생 불가
//        ClassGrade classGrade = new ClassGrade();
//        int result = discountService.discount(classGrade, price);
//        System.out.println("result = " + result);
    }
}
