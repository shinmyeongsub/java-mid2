package collection.compare;

public class MyUser implements Comparable<MyUser>{
    private int age;
    private String name;

    public MyUser(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(MyUser o) {
        System.out.println(this + " vs " + o);
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }
}
