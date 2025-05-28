package Random;

public class Test {
    public static void main(String[] args){
        Car c1 = new Car();
        Bike b1 = new  Bike();
        c1.start();
        b1.start();
        Vehicle v1 = new Car();
        v1.start();// this will call the method of the class car bcz the reference in that variable is
        // of car class
    }
}

