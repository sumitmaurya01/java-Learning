package in.kgcoding;

public class TestAccessModifiers {
   public static void main(String[] args) {
       Car c1 = new Car();
       c1.color = "BMW red";
       c1.model="2015";
       System.out.println(c1.toString());
       Car c2 = new Car("Black","porsche 2019",1,5000);
       c2.price=300500; // price can be accessed in the kgcoding package only bcz its is with default modifier
       System.out.println(c2);

   }
}
