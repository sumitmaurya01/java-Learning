package Challenge110;

public class Test {
    public static void main(String[] args) {
        FunctionInterface f1 = (a ->{if(a%2==0) return true; return false;});
        System.out.println(f1.check(12));
        System.out.println(f1.check(13));
    }
}
