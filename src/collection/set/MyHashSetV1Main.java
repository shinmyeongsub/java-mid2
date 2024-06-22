package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println(set);

        // 검색
        int searchValue = 9;
        boolean contains = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + contains);

        // 삭제
        boolean remove = set.remove(searchValue);
        System.out.println("remove = " + remove);
        System.out.println("set = " + set);
    }
}
