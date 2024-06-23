package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser(30, "a");
        MyUser myUser2 = new MyUser(20, "b");
        MyUser myUser3 = new MyUser(10, "c");

        MyUser[] array = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // 추가
        System.out.println("NameComparator 정렬");
        Arrays.sort(array, new NameComparator());
        System.out.println(Arrays.toString(array));

        System.out.println("NameComparator().reversed 정렬");
        Arrays.sort(array, new NameComparator().reversed());
        System.out.println(Arrays.toString(array));

    }
}
