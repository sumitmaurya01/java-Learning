package MultiThreadingDemo;

public class NeedOfMultithreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for(int i=1; i<=1000; i++){
            System.out.print(i);
        }
        System.out.println("first task complete");
        for(int i=1; i<=1000; i++){
            System.out.print(i);
        }
        System.out.println("Second task complete");
        for(int i=1; i<=1000; i++){
            System.out.print(i);
        }
        System.out.println("third task complete");
        long endTime = System.currentTimeMillis();
        System.out.println("total time taken: "+(endTime-startTime));
    }
}
