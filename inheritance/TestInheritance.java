package inheritance;

public class TestInheritance {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.vehicleName="maruti";
        Bike b1 = new  Bike();
        b1.vehicleName="ktm";
        b1.commute();
        c1.commute();

    }
}
