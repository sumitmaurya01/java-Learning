package executorService.ReturningFuture;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingReturningFuture{
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        FetchName f1 = new FetchName("sumit");
        FetchName f2 = new FetchName("raj");
        FetchName f3 = new FetchName("adi");
        FetchName f4= new FetchName("mis");
        Future<String>name1 = service.submit(f1);
        Future<String>name2 = service.submit(f2);
        Future<String>name3 = service.submit(f3);
        Future<String>name4 = service.submit(f4);

        System.out.println("Full name : "+name1.get());
        System.out.println("Full name : "+name2.get());
        System.out.println("Full name : "+name3.get());
        System.out.println("Full name : "+name4.get());

        service.shutdown();
    }
}
