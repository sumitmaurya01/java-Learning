package TEST;
import java.util.*;

public class ConvertList {
    public static void main(String[] args) {
        // Step 1: Create and fill ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Zara");
        arrayList.add("Alex");
        arrayList.add("Monica");

        // Step 2: Convert to LinkedList
        List<String> linkedList = new LinkedList<>(arrayList);

        // Step 3: Print to prove it works
        System.out.println("ArrayList: " + arrayList.getClass().getSimpleName());
        System.out.println("LinkedList: " + linkedList.getClass().getSimpleName());
        linkedList.forEach(System.out::println);
    }
}
