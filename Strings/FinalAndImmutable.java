package Strings;

public class FinalAndImmutable  extends Object {
static class First{
    private int a;
    private int b;
    public First(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public boolean equals(Object o1){
       // if(this.instanceof() == o1.instanceof())
        return true;
    }
   }
    static class Second{
        private int a;
        private int b;
        public Second(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        // true because both are pointing to same location in string pool and there reference is same
        System.out.println(s1==s2);
        // false , because s3 and s4 are storing different-2 references
        // and ( == ) checks the refernce not the values
        System.out.println(s3==s4);

        System.out.println(s3.equals(s4));

        System.out.println("\n\n for .equals in oject not on Strings\n\n");
        First f1 = new First(10,20);
        First f2 = new First(20,30);
        System.out.println(f1.equals(f2));
    }

}
