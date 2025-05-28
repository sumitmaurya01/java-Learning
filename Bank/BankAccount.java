package Bank;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private float balance;
public BankAccount(String accountNumber,String accountHolder){
    this.accountNumber=accountNumber;
    this.accountHolderName = accountHolder;
    //this.balance=b;
}
public String toString(){
    return "BankAccount {" +"AccountNumber="+accountNumber+ ", AccountHolder= "+accountHolderName+ " , Balance = "+balance+" }";
}
    // deposit
    public void deposit(float balance) {
        if (balance <= 0) {
            System.out.println("Invalid deposit");
        } else {
            this.balance += balance;
            System.out.println("Amount successfully deposited , Current balance is : "+this.balance);
        }
    }
    public void withdraw(float balance){
    if(this.balance < balance){
        System.out.println("Insufficient balance , can't withdrawal");
    }
    else{
        this.balance-=balance;
        System.out.println("Amount " +balance+ " has successfully  withdrawal from you account ");
        System.out.println("Current balance available is: "+this.balance);
    }
    }

}

