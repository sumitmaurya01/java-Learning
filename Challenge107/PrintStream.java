package Challenge107;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintStream {
    public static void main(String[] args) {
        List<String>list=List.of("sumit","ram","mohan","sohan","krishna");
        Stream<String> stream=list.stream();
        List<String >res=stream.collect(Collectors.toList());
        System.out.println(res);


    }
}
