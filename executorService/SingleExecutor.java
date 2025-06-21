package executorService;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.currentThread;

class PrintTask implements Runnable{
    private final char symbol;
    public PrintTask(char c){
        symbol=c;
    }
    public void run(){
        for(int i=1; i<1000; i++){
            System.out.printf("%d%c",i,symbol);
        }
        System.out.printf("\n%s %c completed\n",currentThread().getName(),symbol);
    }
}
public class SingleExecutor {
    public static void main(String[] args) {
        PrintTask t1 = new PrintTask('*');
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(t1);
        executor.shutdown();
    }

}
