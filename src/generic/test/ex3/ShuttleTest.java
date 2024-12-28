package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zealot;
import generic.test.ex3.unit.Zergling;

public class ShuttleTest {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.set(new Marine("마린1", 50));
        shuttle1.showInfo();

        Shuttle<Zealot> shuttle2 = new Shuttle<>();
        shuttle2.set(new Zealot("질럿1", 60));
        shuttle2.showInfo();

        Shuttle<Zergling> shuttle3 = new Shuttle<>();
        shuttle3.set(new Zergling("저글링1", 40));
        shuttle3.showInfo();
    }
}
