package Challenge103;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class TestSingleThreadExecutor {
    public static void main(String[] args){
       ExecutorService service  = Executors.newSingleThreadExecutor();
      //  ExecutorService service  = Executors.newFixedThreadPool(5);
        for(int i=1; i<=10; i++) {

            PrintRunnable p = new PrintRunnable(i);
            service.submit(p);
        }

        service.shutdown();
    }
}
