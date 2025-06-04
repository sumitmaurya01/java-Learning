package in.ExceptionHandling;
import java.util.Scanner;
public class ThrowAndThrows {
    static void printName(String s) throws IllegalArgumentException{
        if(s.contains("-")){

            throw new IllegalArgumentException("Name contain '-' "  );// predefined exception
        }
        else{
            System.out.println("Name = "+s);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("--Welcome to Throw and throws --");
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        printName(name);
    }
}
