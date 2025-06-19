package polymorphism;

interface First {
    default void show() {
        System.out.println("First -> show() ");
    }
    default void doit(){
        System.out.println("From first interface...");
    }
}
