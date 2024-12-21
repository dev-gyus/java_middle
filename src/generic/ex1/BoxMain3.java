package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("string = " + string);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(3.14159);
        Double doubleObj = doubleBox.get();
        System.out.println("doubleObj = " + doubleObj);
    }
}
