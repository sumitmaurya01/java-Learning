package CollectionAndGenerics.vectorDemo;
import java.util.*;

public class VectorDemo {
    public static void main(String[] args){
        Vector<Integer>vec=new Vector<>();
        vec.add(10);
        vec.add(20);
        vec.add(30);
        ((Vector<Integer>)vec).insertElementAt(23,2);
        System.out.println(vec);
        System.out.println("element at idx 3: "+vec.get(3));
        vec.addFirst(9);
        vec.addLast(80);
        System.out.println("add 9 at first and 80 at last: "+vec);


       // ListIterator<Integer>itr=vec.listIterator();
        Iterator<Integer> itr=vec.iterator();
        System.out.println(" traversing through itr : ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        vec.removeFirst();
        System.out.println("after removing first: "+vec);
        ((Vector<Integer>)vec).removeElementAt(2);
        System.out.println("after removing element at 2: "+vec);



// cloning vector to list
        LinkedList<Integer>ll=new LinkedList(vec);
//        System.out.println("element in linkedList : "+ll);
        System.out.println("last element in the linked list after converting to linked list: " +ll.getLast());
          ((Vector<Integer>)vec).removeAllElements();
          System.out.println("After removing all elements: "+vec);
    }
}
