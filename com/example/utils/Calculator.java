package com.example.utils;
//import com.example.geometry.*;
// * means all the classes from the geometry package
// if want an individual class then use geometry.ClassName;
import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
public class Calculator {
    public static void main(String[] args){
        Circle c1 = new Circle(4.2f);
        Rectangle r1 = new Rectangle(10,20);
        System.out.printf("area of the circle is %f",c1.area());
        System.out.printf("\nArea of the rectangle is %f",r1.area());
    }
}
