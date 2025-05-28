package jobs;

public class Employee {
    private String name;
    private int age;
    private int salary;
    public void setName(String name){
        if(name.isEmpty()){
            System.out.println("Invalid name ");
        }
        else {
            this.name = name;
        }
    }
    public void setAge(int age) {
        if(age<18) System.out.println("too Young");
        else if(age > 60 ) System.out.println("Too Elder");
        else
        this.age=age;
    }
    public void setSalary(int salary){
        if(salary <= 0) System.out.println("Invalid salary");
        else{
        this.salary=salary;
        }
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }

    //this is default method so this method cam only accessed from this package
    // if one try to access it from out of the package it will throw an error
     String displayEmployeeDetails(){
        return "name = "+name+", salary = "+salary+" ,age = "+age;
    }
}
