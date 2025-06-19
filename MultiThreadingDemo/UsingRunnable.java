package MultiThreadingDemo;
import java.lang.Runnable;
import java.lang.Thread;

import static java.lang.Thread.currentThread;

class MyRunnable implements Runnable{
    public void run(){
        System.out.println("\nThread starts : "+Thread.currentThread().getName());
        for(int i=1; i<500;i++){
            System.out.printf("%d%c ",i,symbol);
           if(i==200) System.out.println("\n");
           if(i==300) System.out.println("\n");
           if(i==400) System.out.println("\n");
           if(i==100) System.out.println("\n");
        }
        System.out.printf("\n%s %c completed\n",Thread.currentThread().getName(),symbol);
    }
    private final char symbol;
    public MyRunnable(char ch){
        symbol=ch;
    }
}
public class UsingRunnable {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable('*');
        Thread t1 = new Thread(runnable);
        MyRunnable runnable2 = new MyRunnable('%');
        Thread t2 = new Thread(runnable2);
        t1.setName("phla");
        t2.setName("dusra");
        System.out.println("t1 starts");
        t1.start();
        System.out.println("t2 starts");
        t2.start();
        System.out.println("Execution in main completed...");
    }
}
