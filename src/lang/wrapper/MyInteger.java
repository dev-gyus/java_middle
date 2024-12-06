package lang.wrapper;

// 내가 직접 만든 int를 감싼 래퍼 클래스
public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value == target) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
