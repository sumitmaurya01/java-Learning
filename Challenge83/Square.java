package Challenge83;

public class Square extends Shape {
    private float side;
    public Square(float s){
     side=s;
    }
    public float calculateArea(){
        return (float)side*side;
    }
}
