package ExceptionHandling;
import java.util.Scanner;
public class UsingThrow {
    static class AgeException extends RuntimeException {
        AgeException(String msg) {
            super(msg);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Enter you age to check eligibility to vote: ");
        age = input.nextInt();
        if(age < 18){
            //throw new ArithmeticException("you are not eligible to vote");
            //or
            throw new AgeException("younger , not eligible");
        }
        else{
            System.out.println("You are eligible");
        }
    }
}
