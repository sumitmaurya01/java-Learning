package com.example.geometry;
import java.util.Scanner;
public class Circle {
    private float radius;
    public Circle(float radius){
        this.radius = radius;
    }
    public float area(){
        return (float)Math.PI * radius * radius;
    }
}
