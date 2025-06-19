package CollectionAndGenerics.MapDemo;
import java.sql.SQLOutput;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String>mpp=new HashMap<>();
        mpp.put(1,"Sumit");
        mpp.put(2,"rahul");
        System.out.println(mpp);
        mpp.put(2,"sohan");
        System.out.println(mpp);
        String str = mpp.get(2);
        System.out.println(str);
        Set<Integer> st=mpp.keySet();
        System.out.println("Set of Keys : " +st);
        Collection<String>ls=mpp.values();
        System.out.println(ls);
        System.out.println( mpp.remove(1));
        System.out.println(mpp.remove(2,"Sumit"));// false ,cz not present
    }
}
