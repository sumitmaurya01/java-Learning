package equals;

public class EqualsAndHashcode {
    public static void main(String[] args){
        Person p1 = new Person("Sumit",24,"1001");
        Person p2 = new Person("ad",24,"1001");
        Person p3 = new Person("Sumit",24,"1001");
        System.out.println("Using == condition");
        if(p1 == p3){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }

        System.out.println("Using .equals() condition ");
        if(p1.equals(p2)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }
    }
}
