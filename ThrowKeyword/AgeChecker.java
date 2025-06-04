package ThrowKeyword;
import java.util.Scanner;

//import static jdk.internal.org.jline.utils.Colors.s;

public class AgeChecker {
    static class InvalidAge extends Exception{
        public InvalidAge(String s){
            super(s);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Age checker for voting using \"throw\" ");
        System.out.println("Enter your age : ");
        int age = scan.nextInt();
       try {
           if (age < 18) {
               throw new InvalidAge("You can't vote");
           } else {
               System.out.println("Your are Eligible to vote");
           }
       }
       catch(InvalidAge e){
           System.out.println(e);
       }
    }

}
