import java.lang.Thread;
class PrintThread extends Thread{
    public void run(){
        System.out.printf("\nthread %s started..\n",currentThread().getName());
        System.out.printf("thread %s Ended..\n",currentThread().getName());

    }
}
public class Challenge101 {
    public static void main(String[] args) throws InterruptedException{
        PrintThread t1 = new PrintThread();
        PrintThread t2 = new PrintThread();
        PrintThread t3 = new PrintThread();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}
