package executorService;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class PrintRunnable implements Runnable{
    private final char symbol;
    public PrintRunnable(char ch){
        symbol=ch;
    }
    public void run(){
        System.out.printf("\n%s thread started\n",Thread.currentThread().getName());
        for(int i=0; i<=100; i++){
            try{
                Thread.sleep(9);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.printf("%d%c ",i,symbol);
        }
        System.out.println("\nTask completed by "+Thread.currentThread().getName());
    }

}
public class multipleExecutorService {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("🚀 Main started");

        ExecutorService service = Executors.newFixedThreadPool(3);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            Runnable task = new PrintRunnable((char) ('A' + i));
            service.submit(task);
        }

        service.shutdown();
        if (!service.awaitTermination(5, TimeUnit.SECONDS)) {
            System.out.println("\n⏱️ Not finished in 5s, trying force shutdown...");
            service.shutdownNow();
            // wait again just in case forced shutdown needed cleanup
            service.awaitTermination(5, TimeUnit.SECONDS);
        }

        long endTime = System.currentTimeMillis();

        // Print final time after *all tasks* are done
        System.out.println("\n\n==========================================");
        System.out.println("🕣 TOTAL TIME TAKEN: " + (endTime - startTime) + " ms");
        System.out.println("==========================================");
        System.out.println("🏁 Main thread ends");
    }
}
