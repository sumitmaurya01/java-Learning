package Challange106;

import java.util.function.BinaryOperator;

public class LExpressionTakes2IntAndReturn1Int {
    public static void main(String[] args) {
        BinaryOperator<Integer>multi =(a,b)->{return a*b;};
        int a =multi.apply(6,3);
        System.out.println(a);
    }
}
