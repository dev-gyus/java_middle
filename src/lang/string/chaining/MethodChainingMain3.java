package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
//        ValueAdder adder1 = valueAdder.add(1);
//        ValueAdder adder2 = valueAdder.add(2);
//        ValueAdder adder3 = valueAdder.add(3);

        ValueAdder resultValue = valueAdder.add(1).add(2).add(3);
        int result = resultValue.getValue();
        System.out.println("result = " + result);
        System.out.println("result = " + valueAdder.getValue());
    }
}
