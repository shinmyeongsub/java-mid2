package collection.compare;

import java.util.Collections;
import java.util.LinkedList;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser(30, "a");
        MyUser myUser2 = new MyUser(20, "b");
        MyUser myUser3 = new MyUser(10, "c");

        LinkedList<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);

        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
//        list.sort(null);
        Collections.sort(list);
        System.out.println(list);

        System.out.println("IdComparator 정렬");
//        list.sort(new NameComparator());
        Collections.sort(list, new NameComparator());
        System.out.println(list);
    }
}
