package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj1.hashCode() = " + obj1.hashCode()); // 정수값으로 구성된 해시 코드를 반환
        System.out.println("obj2.hashCode() = " + obj2.hashCode()); // 정수값으로 구성된 해시 코드를 반환
        System.out.println("obj1 = " + obj1); // hashcode를 16진수로 변환해서 표현
        // 자바에서 제공되는 클래스는 각 클래스마다 hashCode를 이미 오버라이딩 해놓았음
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("strA.hashCode() = " + strA.hashCode());
        System.out.println("strAB.hashCode() = " + strAB.hashCode()); // 문자열이 추가되면 해시 충돌을 막기 위해 추가적인 과정이 포함되어 값이 반환됨

        // hashCode는 마이너스 값이 들어올 수 있다
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까? 다를까?, 인스턴스는 다르지만 값은 같다
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // equals, hashCode를 오버라이딩 하지 않은 경우와 한 경우를 비교
        System.out.println("(member1 == member2) = " + (member1 == member2));
        System.out.println("member1.equals(member2) = " + member1.equals(member2));
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
