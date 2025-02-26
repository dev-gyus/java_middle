package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2();
        Member m1 = new Member("A");
        Member m2 = new Member("A");

        // hashCode에 대해 재정의를 했기 때문에 동일한 해시코드를 반환
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        // equals에 대해 재정의를 했기 때문에 동등성 비교를 수행하므로 동일한 객체로 판단
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        // 객체의 참조값은 서로 다른 인스턴스이므로 참조값이 다르게 조회됨
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));

        // hashCode를 재정의 했기 때문에 동일한 해시 코드를 반환해 동일한 인덱스에 대해 데이터가 저장됨
        set.add(m1);
        set.add(m2);
        // Member 클래스는 hashCode, eqauls를 재정의 했기 때문에 m1과 m2가 동일성 비교를 해서 중복된 데이터로 판단해 하나만 추가됨
        System.out.println(set);

        // 현재 set에 m1, m2가 저장 되어 있을때 member 클래스에는 hashCode를 재정의 했기 때문에, searchValue의 hashCode가 m1, m2와 동일한 해시코드가 반환되고
        // 해시 코드가 같기 때문에 같은 해시 인덱스에 객체가 저장되어 접근이 가능함, 또 equals를 재정의 했기 때문에 동등성으로 비교를 해서 검색이 가능함
        Member searchValue = new Member("A");
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue));
    }
}
