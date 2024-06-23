package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");

        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }

        // 추가
        // 위 while문 사용보다 아래 향상된 for 문 사용하는 것을 권장
        System.out.println("for-each 사용");
        for (int value : myArray) {
            System.out.println("value = " + value);
        }
    }
}
