package Abstraction;

public class Student extends Person{
    private int standard;
    private int rollNo;
    private String sId;
    public void set(){
        System.out.println("Enter Student info ");
        super.Set();
        System.out.println("Enter the standard: ");
        standard = input.nextInt();
        System.out.println("Enter the roll Number: ");
        rollNo = input.nextInt();
        input.nextLine();
        System.out.println("Enter Student id: ");
        sId = input.nextLine();


    }
    @Override
    public String toString(){
        return super.toString()+
                " \nRoll Number = "+ rollNo+
                " \nStandard = "+standard+
                 " \nStudent id = "+sId;
    }
}
