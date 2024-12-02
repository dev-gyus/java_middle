package lang.immutable.address;

import lang.immutable.address.ImmutableAddress;
import lang.immutable.address.MemberV1;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress immutableAddress = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", immutableAddress);
        MemberV2 memberB = new MemberV2("회원B", immutableAddress);

        // 회원 A, 회원 B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // 회원B의 주소를 부산으로 변경해야함
        // memberA와 memberB는 서로 같은 ImmutableAddress 인스턴스를 멤버 변수로 공유하고 있으므로 A의 ImmutableAddress 까지 같이 변경됨
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.ImmutableAddress");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
        
    }
}
