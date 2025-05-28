package challenge86;

abstract class  Vehicle {
    private String color;
    private int noOfWheels;
    private int price;
    public Vehicle(String color, int noOfWheels, int price){
        this.color=color;
        this.noOfWheels=noOfWheels;
        this.price = price;
    }
     public void service(){
        System.out.println("Vehicle is being serviced");
    }
}
