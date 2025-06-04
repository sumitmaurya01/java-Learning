package ThrowKeyword;
import java.util.Scanner;
public class DivisorChecker {
    static class InvalidDenominator extends Exception{
        public InvalidDenominator(String s){
            super(s);
        }
    }
    public static void main(String[] args){
        int a,b,result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Numerator: ");
        a=scan.nextInt();
        System.out.println("Enter the Denominator: ");
        b=scan.nextInt();
      try {
          if (b==0) {
            throw new InvalidDenominator("Dominator is Zero");
          }
          else{
              result = a/b;
              System.out.println("the result is: "+result);
          }
      }
      catch(InvalidDenominator e){
          System.out.println(e);
      }
    }
}
