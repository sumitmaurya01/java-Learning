package executorService.ReturningFuture;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {
    private final String name ;
    public FetchName (String name){
        this.name=name;
    }
    public String call() throws InterruptedException{
        System.out.println("Getting full name of "+name);
        Thread.sleep(3000);
        return name+" Human .";
    }
}
