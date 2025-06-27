package Challenge112;
import java.util.Optional;
import java.util.function.Function;

public class FunctionalAndOptional {
    public static void main(String[] args) {

        Function<String,Optional<String>>f1=(s)->{
            if(s==null || s.isEmpty()){
                return Optional.empty();
            }else {
                return Optional.of(s.toUpperCase());
            }
        };
        String str="Sumit";
        System.out.println("non-empty: "+f1.apply(str));
        String str1=null;
        System.out.println("empty: "+f1.apply(str1));

    }
}
