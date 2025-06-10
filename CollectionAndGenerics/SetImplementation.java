package CollectionAndGenerics;
import java.util.Set;
import java.util.HashSet;
public class SetImplementation {
    public static void main(String[] args){
        Set<String> st = new HashSet<>();
        boolean isAdded = st.add("apple");
        System.out.println(isAdded);
        isAdded = st.add("apple");
        System.out.println(isAdded);
        boolean isContain = st.contains("banana");
        System.out.println("Contains banana = "+isContain);
        st.add("banana");
        st.add("grapes");
        st.add("orange");
        for(String str : st){
            System.out.println(str);
        }
        System.out.println("Size = "+st.size());
        st.remove("orange");

        System.out.println(st.contains("orange"));
        System.out.println("Size = "+st.size());
    }
}
