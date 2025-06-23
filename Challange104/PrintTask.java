package Challange104;
import java.lang.Runnable;
public class PrintTask implements Runnable{
    //private final int name;

    public void run() {
        System.out.println("\n current thread is: "+Thread.currentThread().getName());
       try{
           Thread.sleep(3000);
       }catch(InterruptedException e){
           e.getMessage();
       }
    }
}
