package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<Integer>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int initialCapacity) {
        this.capacity = initialCapacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[this.capacity];
        for (int i = 0; i < this.capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    /**
     * 데이터 추가
     * O(n)
     * @param value 추가할 데이터
     * @return      추가 결과
     */
    public boolean add(Integer value) {
        LinkedList<Integer> bucket = this.buckets[hashIndex(value)]; // O(1)
        if (!bucket.contains(value)) {  // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
            bucket.add(value);          // last node를 알고 있기 때문에 O(1)
            size++;
            return true;
        }
        return false;
    }

    /**
     * 해당 밸류가 이미 저장이 되어있는지 확인
     * O(n)
     * @param searchValue   찾을 데이터
     * @return              저장 되어있는지 여부
     */
    public boolean contains(int searchValue) {
        LinkedList<Integer> bucket = this.buckets[hashIndex(searchValue)]; // O(1)
        return bucket.contains(searchValue); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
    }

    /**
     * 해당 밸류를 버킷에서 삭제
     * O(n)
     * @param deleteValue   찾을 데이터
     * @return              저장 되어있는지 여부
     */
    public boolean remove(int deleteValue) {
        LinkedList<Integer> bucket = this.buckets[hashIndex(deleteValue)];
        // LinkedList.remove()에 숫자를 인자로 전달 하는 경우 인자의 숫자에 해당하는 index의 데이터를 지우는 경우가 있어서 객체로 전달한다
        boolean hadRemoved = bucket.remove(Integer.valueOf(deleteValue)); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
        if (hadRemoved) {
            size--;
        }
        return hadRemoved;
    }

    public int size() {
        return this.size;
    }

    private int hashIndex(int value) {
        return value % this.capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
            "elementData=" + Arrays.toString(Arrays.copyOf(this.buckets, this.capacity)) +
            ", size=" + this.size +
            ", capacity=" + this.capacity +
            '}';
    }
}
