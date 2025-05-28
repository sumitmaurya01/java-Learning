package Abstraction;
import java.util.Scanner;
abstract class Person implements Interface{
    protected String name;
    protected int  age;
    protected long phoneNo;
    protected Scanner input = new Scanner(System.in);
    protected String address;
    protected void Set(){
        System.out.println("Enter the name : ");
        name = input.nextLine();
        System.out.println("Enter the age : ");
        age = input.nextInt();
        System.out.println("Enter the phone  Number : ");
        phoneNo = input.nextLong();

        input.nextLine(); // to clear the next line \n in the input buffer

        System.out.println("Enter the Address : ");
        address = input.nextLine();

    }

    // overriding of interface method
    public void speak(){
        System.out.println("Hello ");
    }

    abstract  void set();
    public  String toString(){
        return "Name = "+name+
                "\nAge = "+age+
                "\nPhone Number = "+phoneNo+
                "\naddress = "+address;
    }
}
