package collection.set;

import collection.set.member.Member;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>(10);
        set.add("hi");
        set.add("JPA");
        set.add("java");
        set.add("spring");
        // 검색
        String searchValue = "JPA";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);
        System.out.println(set);

        MySet<Member> set2 = new MyHashSetV3<>(10);
        Member hi = new Member("hi");
        Member JPA = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("Spring"); new Member("spring");
        set2.add(hi);
        set2.add(JPA);
        set2.add(java);
        set2.add(spring);

        Member searchValue2 = new Member("test");
        boolean result2 = set2.contains(searchValue2);
        System.out.println("set.contains(" + searchValue2 + ") = " + result2);
        System.out.println(set2);

    }
}
