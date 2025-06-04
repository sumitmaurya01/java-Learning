package ThrowKeyword;
import java.util.Scanner;
class InsufficientAmount extends Exception{
    public InsufficientAmount(String s){
        super(s);
    }
}
public class BankAtmWithdrawal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total amount present in your bank: ");
        int totalAmount = scan.nextInt();
            System.out.println("enter the amount to withdrawal");
            int withdrawal = scan.nextInt();
            try {
                if (withdrawal > totalAmount) {
                    throw new InsufficientAmount("insufficient amount  can't withdrwal higher amount than total");
                } else {
                    System.out.println("Amount withdrawal Successfully...");
                    totalAmount -= withdrawal;
                    System.out.println("Amount remaining -> " + totalAmount);

                }
            } catch (InsufficientAmount e) {
                System.out.println(e);
            }
        }
}
