package collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("set = " + set);

        // 검색
        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println("result = " + result);

        MySet<Integer> intSet = new MyHashSetV3<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        boolean result2 = intSet.contains(1);
        System.out.println("result2 = " + result2);
    }
}
