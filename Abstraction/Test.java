package Abstraction;

public class Test {
    public static void main(String[] args){
        Student s1=new Student();
        Teacher t1= new Teacher();
        //Person p1 = new Person();
        // Person is the an abstract class so we can't create the object of that
        s1.set();
        t1.set();
        System.out.println("Student details are: \n\n");
        s1.speak();
        System.out.println(s1);
        System.out.println("Teacher details are: \n\n");
        t1.speak();
        System.out.println(t1);
    }
}
