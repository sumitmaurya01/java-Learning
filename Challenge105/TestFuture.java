package Challenge105;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestFuture {
    public static void main(String[] args) throws ExecutionException ,InterruptedException{
        ExecutorService service = Executors.newFixedThreadPool(2);
        CallableTask t1 = new CallableTask(5);
        CallableTask t2 = new CallableTask(4);
        CallableTask t3 = new CallableTask(3);
        CallableTask t4 = new CallableTask(0);
        CallableTask t5 = new CallableTask(6);
        Future<Integer>ans1= service.submit(t1);
        Future<Integer>ans2= service.submit(t2);
        Future<Integer>ans3= service.submit(t3);
        Future<Integer>ans4= service.submit(t4);
        Future<Integer>ans5= service.submit(t5);
        System.out.printf("the factorial of %d is  %d\n",t1.getNum(),ans1.get());
        System.out.printf("the factorial of %d is  %d\n",t2.getNum(),ans2.get());
        System.out.printf("the factorial of %d is  %d\n",t3.getNum(),ans3.get());
        System.out.printf("the factorial of %d is  %d\n",t4.getNum(),ans4.get());
        System.out.printf("the factorial of %d is  %d\n",t5.getNum(),ans5.get());
        service.shutdown();
    }
}
