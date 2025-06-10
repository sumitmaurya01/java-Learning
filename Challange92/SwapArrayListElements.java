package Challange92;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class SwapArrayListElements {
    // class to create an object of user defined exception to throw an exception
    static class InvalidIdx extends Exception {
        public InvalidIdx(String s) {
            super(s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Welcome to the program of swapping elements of list ---");
        System.out.println("Enter the size of the list");
        int size = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements of the list...");
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Integer e = sc.nextInt();
            ls.add(e);
        }
        System.out.println("Before Swapping");
        for (Integer i : ls) {
            System.out.print(i + " ");
        }
        boolean isSwapped = false;
        try {
            System.out.println("\nEnter the index to be swapped");
            int i = sc.nextInt();
            int j = sc.nextInt();
            if ((i < 0 || i >= size) || (j < 0 || j >= size)) {
                throw new InvalidIdx("Invalid index");
            }
            Collections.swap(ls, i, j);
            isSwapped = true;
            System.out.println("Successfully Swapped ");
        }
        catch (InvalidIdx e) {
            System.out.println("you are trying to swap invalid indexes \n try to enter in range 0 to " + (size-1));
        }
         if(isSwapped){
            System.out.println("\nAfter Swapping...");
            for(Integer i : ls){
                System.out.print(i+" ");
            }
        }
    }

}