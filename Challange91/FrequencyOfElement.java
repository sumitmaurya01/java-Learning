package Challange91;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class FrequencyOfElement {
    // program to count the frequency of a particular element in ArrayList
    public static void main(String[] args){
        System.out.println("Welcome to Frequency counting in Arraylist program");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the numbers of elements in the list....");
        int size = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<size; i++){
            Integer ele = sc.nextInt();
            list.add(ele);
        }
        System.out.println("Frequency of 5 is : "+Collections.frequency(list,5));
    }

}
