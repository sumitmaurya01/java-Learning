package Challenge103;
import java.lang.Runnable;
public class PrintRunnable implements Runnable{
    private final int ch;
   public  PrintRunnable(int ch){
        this.ch=ch;
    }
    public void run() {

       //System.out.printf("Hello");
       System.out.printf("\n %d \n",ch);
        System.out.println("Execution completed of thread : " + Thread.currentThread().getName());
    }
}
