package lang.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();

        int result = valueAdder.getValue();
        System.out.println("result = " + result);
        System.out.println("result = " + valueAdder);
    }
}
