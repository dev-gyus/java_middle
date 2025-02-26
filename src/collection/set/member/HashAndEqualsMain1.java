package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2();
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        // memberNoHashNoeq 클래스에는 eqauls를 재정의 하지 않았기 때문에 m1과 m2가 동등성 비교를 하지 않아서 중복으로 저장됨
        System.out.println(set);

        // 현재 set에 m1, m2가 저장 되어 있음에도memberNoHashNoeq 클래스에는 hashCode를 재정의 하지 않았기 때문에 searchValue로 m1, m2 객체를 조회할 수 없음
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue));
    }
}
