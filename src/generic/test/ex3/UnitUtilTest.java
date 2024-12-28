package generic.test.ex3;

import generic.test.ex3.unit.Marine;

public class UnitUtilTest {

    public static void main(String[] args) {
        Marine marine1 = new Marine("마린1", 50);
        Marine marine2 = new Marine("마린2", 60);
        Marine maxMarine = UnitUtil.maxHp(marine1, marine2);
        System.out.println("maxMarine = " + maxMarine.getName());
    }
}
