package Challange95;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class UniqueCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str = sc.nextLine();
        Set<Character> st = new HashSet<>();
//        for(int i=0; i<str.length(); i++){
//            Character ch = str.charAt(i);
//            st.add(ch);
//        }
//
        for(char ch : str.toCharArray()){
            st.add(ch);
        }
        System.out.println(st.size());
    }

}
