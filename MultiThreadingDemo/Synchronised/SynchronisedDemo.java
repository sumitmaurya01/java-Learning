package MultiThreadingDemo.Synchronised;
class Counter{
    private int count = 0;
    public synchronized void increaseCounter(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
class Perform extends Thread{
    Counter c;
    public Perform(Counter c){
        this.c=c;
    }
    public void run(){
       for(int i=0; i<200000; i++){
           c.increaseCounter();
       }
//        System.out.printf("\ncount = %d : thread = %s",c.getCount(),currentThread().getName());
    }

}

public class SynchronisedDemo {
    public static void main(String[] args) throws InterruptedException{
        Counter c1 = new Counter();
        Perform p1=new Perform(c1);
        Perform p2=new Perform(c1);
        p1.start();
        p2.start();
        p1.join();
        p2.join();
//        System.out.println("count = "+ c1.getCount());
//        for(int i=1; i<1000; i++){
//            System.out.print(i+" ");
//        }
//        System.out.println("\ncount = "+ c1.getCount());
        System.out.println("current count : "+c1.getCount());

    }
}
