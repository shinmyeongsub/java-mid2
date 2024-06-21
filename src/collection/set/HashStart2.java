package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        // 입력 1,2,5,8
        Integer[] inputArray = new Integer[10];
        inputArray[0] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
//        // 데이터를 찾는 성능이 너무 느림 O(n)
//        for (Integer integer : inputArray) {
//            if(integer == searchValue){
//                System.out.println(integer);
//            }
//        }
        int result = inputArray[searchValue]; // O(1)
        System.out.println("result = " + result);
    }
}
