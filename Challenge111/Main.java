package Challenge111;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int fact=1;
        int n=5;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println("using procedural programming: "+fact);
        Function<Integer,Integer>f1=(a)->{
          int f=1;
            for(int i=1; i<=n; i++){
              f*=i;
          }
            return f;
        };
        System.out.println("using functional programming :  "+f1.apply(n));

    }
}
