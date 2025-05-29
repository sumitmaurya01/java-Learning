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
