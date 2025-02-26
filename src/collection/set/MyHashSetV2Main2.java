package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main2 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member hi = new Member("hi");
        Member JPA = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("Spring"); new Member("spring");

        System.out.println("hi = " + hi.hashCode());
        System.out.println("jpa.hashCode() = " + JPA.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());

        set.add(hi);
        set.add(JPA);
        set.add(java);
        set.add(spring);
        System.out.println(set);

        // 검색
        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);
    }
}
