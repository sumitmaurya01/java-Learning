package CollectionAndGenerics;
import java.util.Queue;
import java.util.LinkedList;

public class QueueImplementation {
    public static void main(String[] args){
        Queue<Integer> que = new LinkedList<>();
       // Queue<Integer> que1 = new LinkedList<Integer>();
        que.add(5);
        que.offer(6);
        que.offer(8);// add and offer methods are used to add element in queue
        Integer a = que.peek();
        System.out.println(a);
        que.poll(); // que.remove(); both are used to remove element from top
        int b = que.element();
        System.out.println(b);
        for(int i : que){
            System.out.print(i+" ");
        }
    }
}
