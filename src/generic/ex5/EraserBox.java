package generic.ex5;

public class EraserBox<T> {

    public boolean instanceCheck(Object param) {
//        return param instanceof T;    // 타입 Eraser 때문에 안됨
        return false;
    }

    public T create() {
//        return new T();   // 타입 Eraser 때문에 안됨
        return null;
    }
}
