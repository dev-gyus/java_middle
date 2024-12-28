package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer integer = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + integer);

        Integer integerValue = GenericMethod.<Integer>numberMethod(i);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        // 자바 컴파일러가 제네릭 메서드에 전달하는 인자의 타입을 보고 타입 인자 정의를 해주지 않아도 메서드의 타입에 대해 추론을 해줌
        // 제네릭 메서드에 타입 인자를 개발자가 전달하지 않아도 자바 컴파일러가 타입 인자를 제네릭 메서드에 전달해줌
        Integer integerValue1 = GenericMethod.numberMethod(i);
        Double doubleValue1 = GenericMethod.numberMethod(20.0);
    }
}
