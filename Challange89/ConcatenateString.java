package Challange89;
import java.util.Scanner;
public class ConcatenateString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- welcome to variable strings concatenation program ");
        String result = VarArgs.concate("sumit","maurya","Hello","world");
        System.out.println(result);
        String secondResult = VarArgs.concate("hey","Buddy","How","Are","You","?");
        System.out.println(secondResult);

        // using loop;
        int size = sc.nextInt();
        sc.nextLine();// to clear the buffer
        String[] str= new String[size];
        for(int i=0; i<size; i++){
            str[i] = sc.nextLine();
        }
        System.out.println(VarArgs.concate(str));
    }
}
