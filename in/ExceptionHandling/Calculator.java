package in.ExceptionHandling;
import java.util.Scanner;
public class Calculator {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("-- Welcome of Division Program --");
         try{
             System.out.println("Enter Dividend: ");
             int dividend = scanner.nextInt();
             System.out.println("Enter Divisior: ");
             int divisor=scanner.nextInt();
             int ans = dividend/divisor;
            System.out.println(" The quotient = "+ans);
         }
         catch(ArithmeticException e){

             System.out.println("Dividing by zero not possible");
             System.out.println(e);
         }
System.out.println("Out of try  Catch");
     }
}
