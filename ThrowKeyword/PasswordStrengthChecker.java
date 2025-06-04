package ThrowKeyword;
import java.util.Scanner;
 class InvalidPassword extends Exception{
    public InvalidPassword(String s){
        super(s);
    }
}
public class PasswordStrengthChecker {
     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.println("-- Welcome to password Strength checker --");
         System.out.println("Enter Your Password (must contain '@' symbol");
         String pass = scan.nextLine();
         try{
             if(! pass.contains("@")){
                 throw new InvalidPassword("The password is weak must contain '@' Symbol ");
             }
             else{
                 System.out.println("Strong password..");
             }
         }
         catch(InvalidPassword e){
             System.out.println(e);
         }

     }
}
