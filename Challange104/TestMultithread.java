package Challange104;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class TestMultithread {
    public static void main(String[] args)throws InterruptedException{
        ExecutorService service =Executors.newFixedThreadPool(4);
        for(int i=0; i<10; i++){

            PrintTask p1 = new PrintTask();

            service.submit(p1);
        }
service.shutdown();
        if(!service.awaitTermination(40,TimeUnit.SECONDS)){
            service.shutdownNow();
            System.out.println("Terminated without completion");
            //service.shutdown();
        }
        System.out.println("Hello");
    }
}
