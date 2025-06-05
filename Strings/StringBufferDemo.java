package Strings;
// same as string but its mutable and all the methods inside the StringBuffer are Synchronised
public class StringBufferDemo {
    public static void main(String[] args){
            StringBuffer sb = new StringBuffer();
            System.out.println(sb.capacity());
            sb.append("this is the test for SB");
            System.out.println(sb);
            System.out.println(sb.capacity());// capacity increases by (oldCapacity*2)+2 or (oldCapacity+1)*2
            System.out.println(sb.delete(5,10));
            System.out.println(sb);
            String str =new String("suimt");
            System.out.println(str.concat("hello"));
            System.out.println(str);


    }
}
