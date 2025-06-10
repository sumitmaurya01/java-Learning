package CollectionAndGenerics;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
public class MapInterface {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("Sumit",100);
        map.put("Raj",50);
        map.put("akhil",200);
        map.put("Sohan",400);

        System.out.println(map);
        map.put("Sohan",300);
        Set<String> st = map.keySet();// it stores key
        System.out.println(st);
        Collection<Integer>coll=map.values(); // it stores values
        System.out.println(coll);
        System.out.println(map.containsKey("Raj"));
        map.remove("Raj");
        System.out.println(map.containsKey("Raj"));
        System.out.println(map.containsKey("Ajay"));

    }

}
