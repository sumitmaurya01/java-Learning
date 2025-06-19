package CollectionAndGenerics;
import java.util.Vector;
import java.util.Stack;

public class StackDemo {
    public static void  main(String[] args){
        Stack<Integer>st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.add(1,50);
        System.out.println(st);
        System.out.println("value at idx 3: "+ st.get(3));
        System.out.println("peek : "+st.peek());
        System.out.println("after pop: "+st.pop());
        st.push(102);
        System.out.println(st);

        System.out.println("seraching 50 -: "+st.search(50)+ "  from top");
        st.addElement(4);
        System.out.println(st);


    }
}
