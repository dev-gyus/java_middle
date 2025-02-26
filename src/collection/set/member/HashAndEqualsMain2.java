package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2();
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        // hashCode에 대해서는 재정의를 했기 때문에 동일한 해시코드를 반환
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        // 객체의 참조값은 서로 다른 인스턴스이므로 참조값이 다르게 조회됨
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));

        // hashCode를 재정의 했기 때문에 동일한 해시 코드를 반환해 동일한 인덱스에 대해 데이터가 저장됨
        set.add(m1);
        set.add(m2);
        // MemberOnlyHash 클래스에는 eqauls를 재정의 하지 않았기 때문에 m1과 m2가 동등성 비교를 하지 않아서 중복으로 저장됨
        System.out.println(set);

        // 현재 set에 m1, m2가 저장 되어 있을때 memberOnlyHash 클래스에는 hashCode를 재정의는 했지만 equals에 대한 재정의는 하지 않았기 때문에
        // 동등성 비교를 하지 않기 때문에 searchValue로는 데이터 유무를 찾을 수 없음
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue));
    }
}
