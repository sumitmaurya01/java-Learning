package InterfaceDemo;

public interface Interface2 {
    void show();
    default void show1(){
        System.out.println("This is from interface 2");
    }
}
