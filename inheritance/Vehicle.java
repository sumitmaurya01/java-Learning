package inheritance;

public class Vehicle {
    public int noOfWheels;
    public String vehicleName;
    public void commute() {
        System.out.printf("The number of the wheels in the %s Vehicle = %d \n", vehicleName, noOfWheels);
    }
}
