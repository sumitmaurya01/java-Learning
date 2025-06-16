package CollectionAndGenerics.ListAndSet;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Lists {
    public static void main(String[] args){
        System.out.println("List maintains the insertion order..");
        List l1 = new ArrayList();
        l1.add(10);
        l1.add("sumit");
        l1.add(20);
        l1.add('v');
//        for(Object s : l1){
//            System.out.println(s);
//        }

    System.out.println("Using iterators...");
        ListIterator i = l1.listIterator();
        while(i.hasNext()){
            System.out.println(i.next());
            //i.remove();
        }
//
//        System.out.println("After removing");
//        System.out.println(l1);
        System.out.println("backward traversal...");
        //ListIterator it = l1.listIterator(l1.size());// hume phle last me jana hoga tb...
        while(i.hasPrevious()){
            System.out.println(i.previous());
            i.remove();
        }
        System.out.println("After removing "+l1);
    }
}
