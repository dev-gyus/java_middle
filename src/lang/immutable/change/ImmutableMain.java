package lang.immutable.change;

public class ImmutableMain {

    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);
        System.out.println("immutableObj = " + immutableObj.getValue());

        ImmutableObj addedImmutableObj = immutableObj.add(20);
        System.out.println("20 added");
        System.out.println("immutableObj = " + immutableObj.getValue());
        System.out.println("addedImmutableObj = " + addedImmutableObj.getValue());
    }
}