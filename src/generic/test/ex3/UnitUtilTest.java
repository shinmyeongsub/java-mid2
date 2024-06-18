package generic.test.ex3;

import generic.test.ex3.unit.Marine;
import generic.test.ex3.unit.Zealot;

public class UnitUtilTest {
    public static void main(String[] args) {
        Marine m1 = new Marine("마린1", 40);
        Marine m2 = new Marine("마린2", 50);

        Marine marine = UnitUtil.maxHp(m1, m2);
        System.out.println("result : " + marine);

        Zealot z1 = new Zealot("질럿1", 30);
        Zealot z2 = new Zealot("질럿2", 30);

        Zealot zealot = UnitUtil.maxHp(z1, z2);
        System.out.println("result : " + zealot);
    }
}
