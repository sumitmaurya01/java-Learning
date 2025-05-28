package ExceptionHandling;

public class Arithmethic {
    public static void main(String[] args){
        System.out.println("\n\nWelcome to Exception Handling program\n");
        try{
            int a = 100 ;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }// if we don't know the Exception class we can do catch(Exception e){ sop(e); }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("You can't divide by zero");
        }
        System.out.println("Program ends here...");
    }
}
