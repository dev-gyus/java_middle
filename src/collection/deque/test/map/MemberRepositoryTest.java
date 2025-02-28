package collection.deque.test.map;

public class MemberRepositoryTest {
    public static void main(String[] args) {
        MemberRepository repository = new MemberRepository();
        Member member = new Member("1", "A");
        repository.save(member);
        repository.remove("1");
        Member idFoundMember = repository.findById("1");
        System.out.println("idFoundMember is null : " + idFoundMember == null);
        Member nameFoundMember = repository.findByName("A");
        System.out.println("nameFoundMember is null : " + nameFoundMember == null);
    }
}
