package ThrowsKeyword;
import java.util.Scanner;
class InvalidAgeException extends Exception{
        public InvalidAgeException(String s){
            super(s);
        }
    }
public class ValidAge {
    static void checkAge(int age) throws InvalidAgeException{

            if(age<18){
                throw new InvalidAgeException("not eligible");
            }
            else{
                System.out.println("Eligible");
            }

    }
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age to check eligibility: ");
        int age = scan.nextInt();
        try{
            checkAge(age);
            System.out.println(" ");
        }
        catch(InvalidAgeException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Thanks for eligibility check");
        }
    }
}
