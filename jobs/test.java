package jobs;

public class test {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setName("sumit");
        e1.setAge(15);//  young
        e1.setAge(70); // elder
        e1.setAge(20);
        e1.setSalary(5000);
        System.out.println(e1.displayEmployeeDetails());
        e1 = new Employee();
        e1.setName("ram");
        e1.setAge(24);
        e1.setSalary(45000);
        System.out.println(e1.displayEmployeeDetails());
    }
}
