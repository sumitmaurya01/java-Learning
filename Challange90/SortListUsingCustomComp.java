package Challange90;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class SortListUsingCustomComp {
    public static void main(String[] args){
        System.out.println(" --- Welcome to string sorting program ---");
        Scanner sc = new Scanner(System.in);
        List<String> ls = new ArrayList<>();
        System.out.println("Enter the number of String ot be inserted...");
        int size = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<size; i++){
            ls.add(sc.nextLine());
        }
        System.out.println("Before Sorting..");
        for(String s : ls){
            System.out.print(s+" ");
        }
        Collections.sort(ls);
        System.out.println("\nAfter 1st Sorting..\n");
        for(String s : ls){
            System.out.print(s+" ");
        }
        Collections.sort(ls, Comparator.naturalOrder());
        System.out.println("\nAfter Sorting in natural order..");
        for(String s : ls){
            System.out.print(s+" ");
        }
        // sort using case_insensitive
        Collections.sort(ls,String.CASE_INSENSITIVE_ORDER);
        System.out.println("\nAfter Sorting in case insensitive order..");
        for(String s : ls){
            System.out.print(s+" ");
        }
    }
}
