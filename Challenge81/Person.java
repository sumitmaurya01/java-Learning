package Challenge81;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person per = (Person) o;
        return age == per.age && Objects.equals(name, per.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
