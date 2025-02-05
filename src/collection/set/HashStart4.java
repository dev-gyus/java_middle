package collection.set;

import java.util.Arrays;

public class HashStart4 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // 입력: {1, 2, 5, 8, 14, 99}
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));
        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("searchValue = " + inputArray[hashIndex(1)]);
        System.out.println("searchValue = " + inputArray[hashIndex(2)]);
        System.out.println("searchValue = " + inputArray[hashIndex(5)]);
        System.out.println("searchValue = " + inputArray[hashIndex(8)]);
        System.out.println("searchValue = " + inputArray[hashIndex(14)]);
        System.out.println("searchValue = " + inputArray[hashIndex(99)]);
        System.out.println("inputArray = " + Arrays.toString(inputArray));
    }

    private static void add(Integer[] inputArray, Integer value) {
        inputArray[hashIndex(value)] = value;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
