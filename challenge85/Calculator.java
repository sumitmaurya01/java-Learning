package challenge85;

public  class Calculator {
   public static int add(int a,int b){
        return a+b;
    }
   public  static int add(int a,int b ,int c){
        return a+b+c;
    }
   public static double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(add(4,5));
        System.out.println(add(4,5,5));
        System.out.println(add(4.5,5.5));
    }
}
