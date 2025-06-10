package Challange93;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args){
        System.out.println("Welcome to List reversing program ");
        List<Integer>ls = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        //List<Integer> ls = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Before reversing");
        for(Integer i: ls){
            System.out.print(i+" ");
        }

        Collections.reverse(ls);
        System.out.println("\nAfter Reversing");
        for(Integer i: ls){
            System.out.print(i+" ");
        }
    }
}
