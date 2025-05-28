package equals;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String id;
    public Person(String name,int age, String id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    @Override
    public String toString(){
        return "Name = "+name+ " , Age = "+age+" , Id = "+id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
}
