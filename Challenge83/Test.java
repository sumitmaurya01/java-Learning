package Challenge83;

public class Test {
    public static void main(String[] args){
        Circle c1 = new Circle(5);
        Square s1 = new Square(4);
        System.out.println("area of the circle is : "+c1.calculateArea());
        c1.show();
        System.out.println("area of the square is : "+s1.calculateArea());
        s1.show();
    }
}
