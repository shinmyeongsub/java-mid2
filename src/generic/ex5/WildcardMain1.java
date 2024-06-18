package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.setValue(new Dog("멍멍이", 100));
        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(catBox);

        // 매개변수로 넣은 타입으로 리턴을 할 수 있다.
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);

        // 반환 타입을 동적으로 변경 불가능
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);

        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
    }
}
