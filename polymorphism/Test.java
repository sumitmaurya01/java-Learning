package polymorphism;

public class Test implements First,Second {
    public void doit(){
        System.out.println("From test class");
    }
    public static void main(String... args){
        First f1 = new Test();
        Second f2 = new Test();
        f1.show();
       // f1.show2();
        ((Second)f1).show2();
        f2.show2();
        f2.show2();
       // ((Test)f1).doit();
        f1.doit();
    }
}
