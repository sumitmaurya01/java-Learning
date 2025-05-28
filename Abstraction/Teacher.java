package Abstraction;

public class Teacher extends Person{
    private int salary;
    private String teacherId;
    private String teaches;

    public void set(){
        System.out.println("Enter teacher info ");
        super.Set();
        System.out.println("Enter the Salary");
        salary = input.nextInt();
        input.nextLine();// to clear the buffer
        System.out.println("Enter the Teacher id: ");
        teacherId = input.nextLine();
        System.out.println("What does he/she teaches");
        teaches = input.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n Salary = "+salary+
                "\n Teacher Id ="+teacherId+
                "\nTeaches = "+teaches;
    }


}
