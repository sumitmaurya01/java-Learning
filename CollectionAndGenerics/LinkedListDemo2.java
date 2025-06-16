package CollectionAndGenerics;
import java.util.*;

public class LinkedListDemo2 extends Object{
    public static void dequeImplementation(){
        System.out.println("Linked list Implement using deque interface");
        Deque<Integer> lList = new LinkedList<>();
        lList.add(5);
        lList.add(10);
        lList.add(3);
        lList.addFirst(68);
        lList.addFirst(90);
        System.out.println(lList);

        System.out.println(" iterator traversal...");
        System.out.println(" using pool : "+lList.poll());
        //System.out.println(" using pool : "+lList.get(2)); // implemented as deque so can,t use get

        Iterator<Integer> it = lList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static void listImplementation(){
        System.out.println("\n\n\t\tImplement using list interface..");
        List<Integer> lList = new LinkedList<>();
        lList.add(20);
        lList.add(30);
        lList.addFirst(40);
        lList.addLast(5);
        System.out.println(lList);
        System.out.println("using get(1) : "+lList.get(1));
        System.out.println("using remove(40) : "+lList.remove(Integer.valueOf(40)));
        System.out.println(lList);
    ListIterator<Integer>itr=lList.listIterator(lList.size());
    System.out.println("\nReverse order traversal: \n");
    while(itr.hasPrevious()){
        System.out.println(itr.previous());
    }
// clone linkedList;
//        List<Integer>l2=(LinkedList<Integer>)((LinkedList<Integer>) lList).clone();
    // using copy constructor
        List<Integer>l2=new LinkedList<>(lList);
        l2.add(10);
        System.out.println(lList);
        System.out.println(l2);

    }
    public static void main(String[] args){
        dequeImplementation();
        listImplementation();
    }
}
