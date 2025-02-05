package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elementData = new int[10];
    private int size = 0;

    /**
     * 데이터 추가
     * O(n)
     * @param value 추가할 데이터
     * @return      추가 결과
     */
    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }
        elementData[size] = value;
        size++;
        return true;
    }

    /**
     * 해당 밸류가 이미 저장이 되어있는지 확인
     * O(n)
     * @param value 찾을 데이터
     * @return      저장 되어있는지 여부
     */
    public boolean contains(int value) {
        for (int elementDatum : elementData) {
            if (elementDatum == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
            "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
            ", size=" + size +
            '}';
    }
}
