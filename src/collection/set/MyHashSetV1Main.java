package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1); // O(1)
        set.add(2); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
        set.add(5); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
        set.add(8); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
        set.add(14); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
        set.add(99); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
        set.add(9); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
        System.out.println(set);

        // 검색
        int searchValue = 9;
        System.out.println("set.contains(" + searchValue + ") = " + set.contains(searchValue));
    }
}
