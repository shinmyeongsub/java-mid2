package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        // 입력 1,2,5,8
        Integer[] inputArray = new Integer[100];
        inputArray[0] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        int result = inputArray[searchValue]; // O(1)
        System.out.println("result = " + result);
    }
}
