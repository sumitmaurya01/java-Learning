package in.kgcoding;

public class Car {
    public String color;
    public String model;
    private float fuelLevel;
    long  price; //  here  price is default so it can be access only in this package
// default constructor
    public Car(){

    }
    public Car(String color, String model,float fuelLevel,long price){
        this.color = color;
        this.model=model;
        this.fuelLevel=fuelLevel;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelLevel=" + fuelLevel +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
