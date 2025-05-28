package in.kgcoding;

import java.util.Scanner;
public class Packages {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("you are inside in.kgcoding.Packages class");
        System.out.println("Enter you name");
        String name = input.nextLine();
        System.out.printf("Hello %s , good morning . Have a nice day today !!!",name);
    }
}
