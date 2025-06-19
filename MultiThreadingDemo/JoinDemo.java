package MultiThreadingDemo;
import java.lang.Thread;
class Print extends Thread{
    private final char symbol;
   public void run(){
       System.out.printf("\nyou are in %s\n",currentThread().getName());
       for(int i=1; i<=500; i++){
           if(i%100 == 0) System.out.println("\n");
           System.out.printf("%d%c ",i,symbol);
       }
       System.out.println("\n");

   }
   public Print(char c){
       symbol = c;
   }
}
public class JoinDemo {
    // join is used to wait for the thread to be completed
    public static void main (String[] args)throws InterruptedException {
    Print t1 = new Print('*');
    Print t2 = new Print('#');
    System.out.println("Your are inside main");
    t1.start();
    System.out.println("\n t1 started..");
    t1.join();
    System.out.println("\nt1 finised");
    t2.start();
    System.out.println("t2 started..");
    t2.join();
    System.out.println("t2 finished..");
        System.out.println("after both the threads completed we are again in main thread");


    }

}
