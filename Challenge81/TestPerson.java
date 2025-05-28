package Challenge81;

public class TestPerson  {
   public static void main(String[] args){
       Person p1=new Person("sumit",30);
       Person p2=new Person("sumit",30);
       if(p1.equals(p2)){
            System.out.println("Equal ");
       }
       else{
           System.out.println("Not equal");
       }
   }
}
