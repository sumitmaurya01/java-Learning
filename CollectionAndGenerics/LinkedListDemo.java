package CollectionAndGenerics;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.io.IOException;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.add(20);
        list.addFirst(30);
        list.addLast(50);
        list.addLast(40);
        System.out.println(list);
        list.remove(Integer.valueOf(50));
        System.out.println(list);
         list.removeLastOccurrence(Integer.valueOf(10));
        System.out.println("original list : "+list);
        LinkedList<Integer> l2 = (LinkedList<Integer>) list.clone();
        l2.add(5869);
        list.removeFirst();
        System.out.println(list);
        System.out.println(l2);
        l2.add(19);
        l2.add(23);
        l2.add(25);
        System.out.println("list 1 : "+list);
        System.out.println("list 2 : "+l2);
        list.addAll(l2);
        System.out.println("List 1 after addingAll l2 : "+list);
        Iterator<Integer> it = list.iterator();
        System.out.println("using iterator...: ");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
       try{
        list.remove(91);
       }catch(Exception e){
           System.out.println("\n"+e);
           System.out.println("cant delete that idx");
       }
        ListIterator<Integer> itr = list.listIterator(list.size());
        System.out.println("\nreverse order traversal...: ");
        while(itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }
    }
}
