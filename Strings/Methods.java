package Strings;

public class Methods {
    public static void main(String[] args){
        String s1 = "Sumit";
        String s2 = " SuMIt ";
        System.out.println("s1 ="+s1+"\ns2 ="+s2);
        System.out.println("Length : \ns1 ="+s1.length()+"\ns2 ="+s2.length());
        s2=s2.trim();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println("After trim");
        System.out.println("s1 ="+s1+"\ns2 ="+s2);
        System.out.println("Length : \ns1 ="+s1.length()+"\ns2 ="+s2.length());
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        String str = "        "; // string with spaces are not an empty string
        System.out.println("before trim length = "+str.length()+ " is Empty = "+str.isEmpty());
        str=str.trim();
        System.out.println(" after trim lenght = "+str.length() +" is empty = "+str.isEmpty() );
    }
}
