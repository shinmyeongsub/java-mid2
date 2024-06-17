package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        // 타입 매개변수를 선언하지 않으면 Object로 들어감, 원시 타입 (row type), 권장 (if Object를 받아야 한다면)
//        GenericBox<Object> integerBox = new GenericBox<>();
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
