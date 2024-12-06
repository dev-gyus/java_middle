package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);
        Integer autoBoxedValue = value;

        // Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();
        int autoUnboxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("autoBoxedValue = " + autoBoxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
        System.out.println("autoUnboxedValue = " + autoUnboxedValue);
    }
}
