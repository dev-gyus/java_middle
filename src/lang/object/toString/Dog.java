package lang.object.toString;

public class Dog {
    private String dogName;
    private int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public String toString() {
        return "dogName: " + dogName + ", age: " + age;
    }
}
