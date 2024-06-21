package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // {1, 2, 5, 8, 14, 99, 9}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        System.out.println("Arrays.toString(buckets) = " + Arrays.toString(buckets));
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        System.out.println("Arrays.toString(buckets) = " + Arrays.toString(buckets));

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); // 중복
        System.out.println("Arrays.toString(buckets) = " + Arrays.toString(buckets));

        // 검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains(" + searchValue + ") = " + contains);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if(!bucket.contains(value)) { // O(n)
            bucket.add(value);
        }
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

    private static boolean contains(LinkedList<Integer>[] bucktes, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = bucktes[hashIndex];
        return bucket.contains(searchValue);
    }
}
