package CollectionAndGenerics.MapDemo;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<Integer,String>mpp = new TreeMap<>();


        // follows sorting order acc to keys and don't contain nULl key
        mpp.put(1,"Sumit");
        mpp.put(500,"raj");
        mpp.put(2,"harsh");
        mpp.put(3,"kash");
        mpp.put(181,"rohan");
        System.out.println(mpp);
        Set st = mpp.entrySet();// converts to set
        System.out.println(st);
        for(Map.Entry<Integer,String>e : mpp.entrySet()){
            System.out.println(e.getKey()+" -> "+e.getValue());
        }
    }
}
