package Bank;

public class Customer {
    public static void main(String[] args){
        BankAccount  acc1=new BankAccount("123","sumit");
        System.out.println(acc1);
        acc1.deposit(-5);
        acc1.deposit(500);
        acc1.withdraw(200);
        System.out.println(acc1);
        acc1.withdraw(400);
        System.out.println(acc1);
        acc1.deposit(1000);
        System.out.println(acc1);
    }
}
