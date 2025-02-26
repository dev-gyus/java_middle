package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<E>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int initialCapacity) {
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
    public boolean add(E value) {
        LinkedList<E> bucket = this.buckets[hashIndex(value)]; // O(1)
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
    public boolean contains(E searchValue) {
        LinkedList<E> bucket = this.buckets[hashIndex(searchValue)]; // O(1)
        return bucket.contains(searchValue); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
    }

    /**
     * 해당 밸류를 버킷에서 삭제
     * O(n)
     * @param deleteValue   찾을 데이터
     * @return              저장 되어있는지 여부
     */
    public boolean remove(E deleteValue) {
        LinkedList<E> bucket = this.buckets[hashIndex(deleteValue)];
        // LinkedList.remove()에 숫자를 인자로 전달 하는 경우 인자의 숫자에 해당하는 index의 데이터를 지우는 경우가 있어서 객체로 전달한다
        boolean hadRemoved = bucket.remove(deleteValue); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
        if (hadRemoved) {
            size--;
        }
        return hadRemoved;
    }

    public int size() {
        return this.size;
    }

    private int hashIndex(E value) {
        // hashCode의 경우 - 값이 반환 될 수 있어서 양수값을 가지고 해시 인덱스를 구함
        // 배열의 인덱스는 - 값을 사용할 수 없음
        return Math.abs(value.hashCode()) % this.capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
            "elementData=" + Arrays.toString(Arrays.copyOf(this.buckets, this.capacity)) +
            ", size=" + this.size +
            ", capacity=" + this.capacity +
            '}';
    }
}
