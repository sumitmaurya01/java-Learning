package TEST;
class Test{
    int a,b;
    void show(){
        System.out.println("Test");
    }
    class Testing extends Test{
        int a,b;
        void showTesting(){
            System.out.println("How are you ");
        }
    }
}
public class DoesClassInsideClassExtends {
    public static void main(String[] args){
        Test t1 = new Test();
        Test.Testing t2 = t1.new Testing();
        t1.show();
        t2.showTesting();
    }
}
