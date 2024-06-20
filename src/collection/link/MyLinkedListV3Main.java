package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> list = new MyLinkedListV3();
        System.out.println("== 데이터 추가 ==");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 첫 번째 항목에 추가, 삭제
        System.out.println("첫 번째 항목에 추가");
        list.add(0, "d"); // O(1)
        System.out.println(list);

        System.out.println("첫 번째 항목에 삭제");
        list.remove(0); // O(1)
        System.out.println(list);

        System.out.println("중간 항목에 추가");
        list.add(1,"e"); // O(n)
        System.out.println(list);

        System.out.println("중간 항목에 삭제");
        list.remove(1); // O(n)
        System.out.println(list);

        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println(intList);
    }
}
