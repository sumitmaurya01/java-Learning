package CollectionAndGenerics.WrapperClass;
import java.util.List;
import java.util.ArrayList;
public class IntegerDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        Integer s = 40;
//        Integer z = 10;
//        list.remove(Integer.valueOf(30));
        list.remove(s);
        System.out.println(list);
    }
}
