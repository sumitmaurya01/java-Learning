package Challenge114;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




class Employee{
    final private String name;
    final public int salary;
     Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
         return "Name: "+name+" : Salary "+salary+"\n";
    }
}
public class SortEmployee {
    public static void main(String[] args) {
     List<Employee> employees = new ArrayList<>();
     employees.add(new Employee("Sumit",899));
     employees.add(new Employee("Ajay",1000));
     employees.add(new Employee("Rohan",2345));
     employees.add(new Employee("Suresh",843));
     employees.add(new Employee("Sonu",2359));
     List<Employee>sortedList=employees.stream().
             sorted((a,b)->(b.salary-a.salary))
             .limit(3)// limit lgane se sirf top ke 3 elements hi ayenge
        .collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
