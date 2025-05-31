package Strings;

public class StringConstructors {
    public static void main(String[] args){
        String s1="hello";
        String s2 = new String("hello world");
        StringBuilder sb = new StringBuilder("String builder");
        String s3 = new String(sb);
        System.out.println(s3);
        s3+=" hello";
        //sb.append(" hello");
        System.out.println(s3);
        //s3.append("hello");
        byte[] b1 ={97,98,99,100,101,102,103,104,65};

        String byteToString = new String(b1);
        System.out.println("byte to string = "+byteToString);
        char[] ch ={'a','b','c'};
        String chToS=new String(ch);
        System.out.println(chToS);
        chToS+=" xyz";
        System.out.println(chToS);

        char[] ch1 = new char[]{'a','p','c'};
        System.out.println("ch1 - "+ch1);
        System.out.println(ch1);
        String ss = new String("str");
        System.out.println("ss - "+ss);

    }
}
