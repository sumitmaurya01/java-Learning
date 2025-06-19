package InterfaceDemo;

public class Test implements Interface1,Interface2{
    public void show(){
        System.out.println("override the show() method of both interfaces.. ");
    }
    public void show1(){
        Interface1.super.show1();
        Interface2.super.show1();
    }
    public static void main(String[] args){
        Test t1 = new Test();
        t1.show();
        t1.show1();

    }
}
