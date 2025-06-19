package CollectionAndGenerics.ListAndSet;
import java.util.*;

public class Sets {
    public static void main(String[] args){
        System.out.println("set does not maintain the insertion order..");
     Set s1 = new HashSet();
     s1.add("Sumit");
     s1.add(10);
     s1.add('z');
     s1.add("Sumit");
     s1.add("2");
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

    public static class TreeSetDemo {
        public static void main(String[] args){
            TreeSet<Integer>tSet = new TreeSet<Integer>();
            tSet.add(10);
            tSet.add(5);
            tSet.add(40);
            tSet.add(40);
    //        try {
    //            tSet.addFirst(100);
    //        }catch(Exception e){
    //            System.out.println("Invalid number");
    //        }
            System.out.println(tSet);
            Iterator<Integer>itr = tSet.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }
}
