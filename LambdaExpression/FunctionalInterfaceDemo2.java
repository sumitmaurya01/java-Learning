package LambdaExpression;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;
public class FunctionalInterfaceDemo2 {

    public static void main(String[] args){
        // consumer interface
        Consumer<String>str=(str1)->{
            System.out.println(str1);
        };
        System.out.print("From Consumer = ");
    str.accept("hiii");

    // supplier functional interface
        Supplier<Integer>supplier=()->{
            int sum = 0;
            for(int i=0; i<10; i++){
                sum+=i;
            }
            return sum;
        };
        System.out.println("From Supplier = "+supplier.get());

        // using function

        Function<Integer,String>function =(Integer num)->{
            return num.toString();
        };
        System.out.println("from function Interface which takes a datatype value and return it in specified type "+function.apply(8));

        // predicate interface with return in boolean value
        Predicate<Integer>predicate=(Integer age)->{
            if(age>=18)
                return true;
            return false;
        };
        System.out.println("Using predicate which returns in boolean value: "+predicate.test(19));
    }
}
