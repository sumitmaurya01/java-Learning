package Challenge115;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        List<String> l1 = List.of("1", "2", "3", "4");
        Function<String, Integer> integer = Integer::parseInt;
        Integer ans=l1.stream().map(Integer::parseInt)
                .map(i->i*i)
                .reduce(0,Integer::sum);
        System.out.println(ans);
    }

}
