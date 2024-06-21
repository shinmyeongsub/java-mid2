package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("== MyArrayList ==");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size); // 찾는데 O(1), 데이터 미는데 O(n)

        MyArrayList<Integer> arrayList = new MyArrayList<>(size);
        addLast(arrayList, size);

        int loop = 10000;
        System.out.println("== MyArrayList 조회 ==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);

        System.out.println("== MyArrayList 조회 ==");
        search(arrayList, loop, 0,0);
        search(arrayList, loop, size / 2,25000);
        search(arrayList, loop, size - 1, 49999);

        System.out.println("== MyLinkedList ==");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size); // 찾는데 O(n), 데이터 추가 O(1)

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size);

        System.out.println("== MyLinkedList 조회 ==");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);

        System.out.println("== MyLinkedList 조회 ==");
        search(linkedList, loop, 0,0);
        search(linkedList, loop, size / 2,25000);
        search(linkedList, loop, size - 1, 49999);
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기 : " + size + " , 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2 ,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("중간 추가 - 크기 : " + size + " , 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("중간 추가 - 크기 : " + size + " , 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index : " + index + " 반복, 계산 시간 : " + (endTime - startTime) + "ms");
    }

    private static void search(MyList<Integer> list, int loop, int index, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue : " + findValue + " 반복, 계산 시간 : " + (endTime - startTime) + "ms");
    }
}
