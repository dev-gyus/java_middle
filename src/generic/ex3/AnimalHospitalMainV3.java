package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
//        AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>();
//        AnimalHospitalV3<Object> objectHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("고양이1", 300);

        // 강아지 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 강아지 병원에 고양이 전달
//        dogHospital.set(cat); // 다른 타입을 인자로 전달시 컴파일 에러 발생

        // 문제2: 강아지 타입 반환
        dogHospital.set(dog);
        Dog animal = dogHospital.bigger(new Dog("강아지2", 200));
        System.out.println("biggerDog = " + animal);
    }
}
