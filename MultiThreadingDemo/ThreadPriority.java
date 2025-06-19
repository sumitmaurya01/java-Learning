package MultiThreadingDemo;
class PrintTest extends Thread{
    private final char symbol;
    public PrintTest(char ch){
        this.symbol=ch;
    }
    public void run() {
        System.out.printf("Thread %s execution Starts: %c", currentThread().getName(), symbol);
        for(int i=1; i<=500; i++){
            if(i%100==0) System.out.println("\n");
            System.out.printf("%d%c",i,symbol);
        }
        System.out.printf("\n %s completed \n",currentThread().getName());
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println("Main starts here");
        PrintTest t1 = new PrintTest('*');
        PrintTest t2 = new PrintTest('$');
        PrintTest t3 = new PrintTest('#');
        // set the name of the threads
        t1.setName("mid p");
        t2.setName("low p");
        t3.setName("high p");

        // set the priority of the threads
        t1.setPriority(6);
        t2.setPriority(1);
        t3.setPriority(8);
        System.out.println("t1 started....");
        t1.start();
        System.out.println("t2 started....");
        t2.start();
        System.out.println("t3 started....");
        t3.start();
        System.out.println("\nMain ends here...");

    }
}
