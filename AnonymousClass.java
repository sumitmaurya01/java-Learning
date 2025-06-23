class Greeting{
    public void show(){
        System.out.println("GoodMorning");
    }

}
class India{
    // we will convert this GreetIndia class to anonymous class
//    class GreetIndia extends Greeting{
//        public void show(){
//            System.out.println("Namaste");
//        }
//    }
    // we are creating here an anonymous class
    Greeting g = new Greeting(){
        public void show(){
            System.out.println("Namaste");
        }
        public void greetHindi(){
            System.out.println("hello ji kaise hai");
        }
    };
}
public class AnonymousClass {
    // anonymous class are those class which don't have any class name and
    //they are innerClass and they always extends any other class
     //
    public static void main(String[] args){
       /* // this is used to create an object of innerClass and call its method

        India india = new India();
        India.GreetIndia g = india.new GreetIndia();
        g.show();
        */

        // now we will call the anonymous Class


       India india= new India();
       india.g.show();
      // india.g.greetHindi(); // can't call this methods cz the methods is defined in the anonymous class
        // and the reference type is of parent class and its is doing compile time binding so error
        // if we do overriding and after that we call it , it would be correct
    }
}
