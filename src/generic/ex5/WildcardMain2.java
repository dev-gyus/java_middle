package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(objBox);
        writeBox(animalBox);
        // 와일드 카드의 하한의 타입이 Animal이므로 Animal 포함 Animal의 부모 타입만 올 수 있음
//        writeBox(dogBox);
//        writeBox(catBox);
    }

    // 와일드 카드의 하한 타입을 지정
    // Animal 포함 부모 타입이 지정된 Box 클래스만 메소드 매개변수로 전달 가능
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
