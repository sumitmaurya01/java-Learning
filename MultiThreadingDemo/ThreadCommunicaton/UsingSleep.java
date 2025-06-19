package MultiThreadingDemo.ThreadCommunicaton;

public class UsingSleep {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("inside the main and it will sleep for 5 sec");
        Thread.sleep(5000);
        System.out.println("system wokeup , good morning buddy");
    }
}
