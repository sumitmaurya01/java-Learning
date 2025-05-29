package ExceptionHandling;

 class TryCatch {
    public static void main(String[] args){
        try{
             int a = 10;
             int b=0;
             int c = a/b;
             System.out.println(c);
        }

        // try this after removing the comment from the catch block


//        catch(ArithmeticException e){
//            System.out.println("Can't be divided by zero");
//           e.printStackTrace();
//            System.out.println(e);
//            System.out.println(e.getMessage());
//        }
        finally{
            System.out.println("Inside finally");
        }
        System.out.println("Hello...");
    }
}
/*
if there is finally just after the try block (not catch)and any exception occurs then
after try the only finally block will be executed and then terminate the code
if there is not exception then program will run freely
 . if there's catch block after the try then only the lines / code after the
 finally will be executed even after the exception occurs
 */