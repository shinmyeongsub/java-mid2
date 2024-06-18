package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
//        Integer result = (Integer) GenericMethod.objMethod(i);

        // 타입 인자 (Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);
        Integer integer = GenericMethod.<Integer>numberMethod(i);
        System.out.println("integer = " + integer);

        Double j = 10.11;
        Double v = GenericMethod.<Double>numberMethod(j);
        System.out.println("v = " + v);

    }
}
