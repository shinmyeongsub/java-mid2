package generic.ex1;

public class GenericBox<T> { // 'T' -> Type 매개변수, 이후에 String, Integer로 변할 수 있다.
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
