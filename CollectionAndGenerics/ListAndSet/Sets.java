package CollectionAndGenerics.ListAndSet;
import java.util.*;

public class Sets {
    public static void main(String[] args){
        System.out.println("set does not maintain the insertion order..");
     Set s1 = new HashSet();
     s1.add("Sumit");
     s1.add(10);
     s1.add('z');
//     System.out.println(s1);
//     for(Object s : s1){
//        System.out.println(s);
//     }
        System.out.println("Using iterator...");
        Iterator it = s1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }
       System.out.println("after removing "+s1);
    }
}
