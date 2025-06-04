package ThrowKeyword;
import java.util.Scanner;
class OutOfBound extends Exception{
    public OutOfBound(String s){
        super(s);
    }
}
public class ArrayAccessProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-- Welcome to index checker program --");
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            int ele = scan.nextInt();
            arr[i] = ele;
        }
            System.out.println("Enter the Index to access the value of it..");
            int idx = scan.nextInt();
            try {
                if (idx < 0 || idx >= size) {
                    throw new OutOfBound(" entered index in out of bound , please enter index in range of 0 to " + (size - 1));
                } else {
                    System.out.println("the element at idx = " + (arr[idx]));
                }
            } catch (OutOfBound e) {
                System.out.println(e);
            }
        }
}
