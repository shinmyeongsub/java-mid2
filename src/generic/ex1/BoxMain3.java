package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입 결정
        integerBox.set(10);
//        integerBox.set("100"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); // Integer 타입 변환 (캐스팅 x)
        System.out.println("integer = " + integer);

        // 원하는 모든 타입 사용 가능
        GenericBox<String> stringGenericBox = new GenericBox<String>();
        stringGenericBox.set("hello");
        String str = stringGenericBox.get();
        System.out.println("str = " + str);

        GenericBox<Double> doubleGenericBox = new GenericBox<Double>();
        doubleGenericBox.set(10.123);
        Double doubleValue = doubleGenericBox.get();
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerGenericBox2 = new GenericBox<>();
    }
}
