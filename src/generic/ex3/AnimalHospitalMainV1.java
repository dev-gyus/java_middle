package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("고양이1", 300);

        // 강아지 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 강아지 병원에 고양이 전달
        dogHospital.set(cat); // 다른 타입을 인자로 전달 해도 컴파일 에러 발생 안함

        // 문제2: 강아지 타입 반환
        dogHospital.set(cat);
        Dog animal = (Dog) dogHospital.bigger(new Dog("강아지2", 200)); // 캐스팅 예외 발생
        System.out.println("biggerAnimal = " + animal);
    }
}
