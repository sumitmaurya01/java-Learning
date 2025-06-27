package Challenge113;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer>integers=List.of(1,1,2,3,4,4,5,2,4,6,7,8,7,99,12,383,0);
        List<Integer>res=integers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(res);
    }
}
