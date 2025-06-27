package Challenge108;
import java.util.List;
//import java.util.stream.Stream;
//import java.util.stream.Collectors;
public class FilterAndConcatenate {
    public static void main(String[] args) {
        List<String>l1=List.of("sumit","helloWorldThisIsJava","maurya","apple","abcdefghijklmnopq");
        String res=l1.stream().filter(s->s.length()<10).reduce("",(a,b)->a+b);
        System.out.println(res);
    }
}
