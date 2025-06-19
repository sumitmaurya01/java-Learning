import java.lang.Thread;
import java.lang.Runnable;
class Print implements Runnable{
    public  void run(){
        for(int i=0; i<10; i++){
            System.out.printf("Hello from %s\n",Thread.currentThread().getName());
        }
       // System.out.println("\n");
    }
}
public class Challenge99 {
    public static void main(String[] args) {
        Print p1 = new Print();
        Print p2 = new Print();
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        t1.setName("first");
        t2.setName("second");
        t1.start();
        t2.start();
    }
}
