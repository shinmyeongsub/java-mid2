package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        // Object의 기본 hashCode의 객체의 참조값을 기반으로 생성
        Object object1 = new Object();
        Object object2 = new Object();

        System.out.println("object1 = " + object1.hashCode());
        System.out.println("object2 = " + object2.hashCode());

        // 각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i = " + i.hashCode());
        System.out.println("strA = " + strA.hashCode());
        System.out.println("strAB = " + strAB.hashCode());

        // hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까?
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // equals, hashCode를 오버라이딩 하지 않는 경우와, 한 경우를 비교
        System.out.println("member1 == member2 = " + (member1 == member2)); // 동일성 - 참조가 같아야 합니다.
        System.out.println("member1 equals member2 = " + (member1.equals(member2))); // 동등성 - 값이 같아야 합니다. (논리적으로)
        System.out.println("member1.hashCode = " + member1.hashCode());
        System.out.println("member2.hashCode = " + member2.hashCode());
    }
}
