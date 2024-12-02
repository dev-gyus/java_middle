package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 object class에 있음. 이걸 호출 할 수 있는건 Parent가 Object를 상속받았는데 이를 Child가 상속을 받았기 때문
        String string = child.toString();
    }
}
