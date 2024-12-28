package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 100);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        // 제네릭 메서드의 타입 인자의 명칭과 클래스 타입 인자의 명칭이 동일한 경우
        // 제네릭 메서드에 전달된 인자의 타입이 우선시됨 (클래스 타입 인자와 관련 x)
        // 근데 애초에 명칭을 같게 두지 않는게 좋음
        Cat cat1 = hospital.printAndReturn(cat);
        System.out.println("return cat = " + cat1);
    }
}
