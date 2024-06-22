package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] integers = {30, 20, 20, 10, 10};
        Set<Integer> set = new HashSet<>(List.of(integers));

        for (Integer integer : set) {
            System.out.println("integer = " + integer);
        }
    }
}
