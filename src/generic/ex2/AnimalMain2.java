package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("고양이", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        // 마지막에 넣은 동물은 고양이 이므로 고양이가 꺼내진다
        Animal foundAnimal = animalBox.get();
        System.out.println("foundAnimal = " + foundAnimal);
        foundAnimal.sound();
    }
}
