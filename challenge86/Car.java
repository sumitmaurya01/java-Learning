package challenge86;

class Car extends Vehicle {
    private String model;
    private int noOfSeats;
    Car(String model,int noOfSeats,String color,int noOfWheels,int price){
        super(color,noOfWheels,price);
        this.model=model;
        this.noOfSeats=noOfSeats;
    }
    @Override
    public void service(){
        super.service();
        System.out.println("The car is being servicing...");
    }
}
