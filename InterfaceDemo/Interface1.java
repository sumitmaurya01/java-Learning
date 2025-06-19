package InterfaceDemo;

public interface Interface1 {
    void show();
    default void show1(){
        System.out.println("This is from interface 1");
    }
}
