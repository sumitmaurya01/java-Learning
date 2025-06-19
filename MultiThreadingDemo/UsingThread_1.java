package MultiThreadingDemo;
import java.lang.Thread;
import java.util.Scanner;

class MyThread extends Thread{
    // jo kaam ko thread me krna hai wo run me likh denge
    public void run(){
        for(int i=1; i<=1000; i++){
            System.out.printf("%d%c ",i,symbol);
            if(i==500) System.out.println("\n");
        }
        System.out.printf("\nExection of %s completed",currentThread().getName());

    }
    private final char symbol;
    public MyThread(char c){
        symbol = c;
    }
}
public class UsingThread_1 {
    public static void main(String[] args){
        long startTime=System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        MyThread t1 = new MyThread('*');
        System.out.println("t1 started");
        t1.setName("sumit");
        t1.start();
        MyThread t2 = new MyThread('$');
        System.out.println("\nt2 started");
        t1.setName("maurya");
        t2.start();
        //System.out.println("\n\nExecution in main has completed");
//        try{
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("\n\nEnter two numbers to add: ");
//        int a = sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println("Sum : "+(a+b));
        long endTime=System.currentTimeMillis();
        System.out.println("\ntotal time : "+(endTime-startTime));
    }
}
