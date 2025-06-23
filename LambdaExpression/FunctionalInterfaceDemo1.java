package LambdaExpression;

@FunctionalInterface
interface Demo{
    void test();
    default void  test2(){
        System.out.println("Default methods from Interface");
    }
    static void test3(){
        System.out.println("Static method from interface");
    }
}

public class FunctionalInterfaceDemo1 {
    public static void main(String[] args){
        Demo d1 = ()->{
            System.out.println("Hello this is the Functional abstract methods ");
        };
        d1.test();
        d1.test2();
        Demo.test3();
    }
}
