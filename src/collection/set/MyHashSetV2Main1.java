package collection.set;

public class MyHashSetV2Main1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A"); // O(1)
        set.add("B"); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
        set.add("C"); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
        set.add("D"); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
        set.add("AB"); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
        set.add("SET"); // 최악의 경우 O(n)일 수는 있지만 거의 O(1)처럼 동작함
        System.out.println(set);

        System.out.println("A.hashCode() = " + "A".hashCode());
        System.out.println("B.hashCode() = " + "B".hashCode());
        System.out.println("AB.hashCode() = " + "AB".hashCode());
        System.out.println("SET.hashCode() = " + "SET".hashCode());

        // 검색
        String searchValue = "D";
        System.out.println("set.contains(" + searchValue + ") = " + set.contains(searchValue));
    }
}
