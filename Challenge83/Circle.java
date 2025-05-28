package Challenge83;

public class Circle extends Shape {
    private float radius;
    public Circle(float r){
        radius = r;
    }
    public float calculateArea(){
        return (float)Math.PI*radius*radius;
    }
}
