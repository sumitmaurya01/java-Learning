package Challenge109;
import java.util.List;
import java.util.stream.Collectors;
public class FilterOdd {
    public static void main(String[] args) {
        List<Integer>l1=List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
        List<Integer>res=l1.stream().filter(e->e%2==1).collect(Collectors.toList());
        System.out.println(res);
    }
}
