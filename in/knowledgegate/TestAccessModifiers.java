package in.knowledgegate;
import in.kgcoding.Car;
public class TestAccessModifiers {
 public static void main(String[] args){
Car c1 = new Car();
c1.color = "red";
c1.model = "audi_291";
//c1.price=1241; // here price is default so it can't be accessed from another package
System.out.println(c1);
 }
}
