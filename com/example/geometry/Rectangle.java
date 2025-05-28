package com.example.geometry;

public class Rectangle {
    private float length;
    private float breadth;
    public Rectangle(float length,float breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public float area(){
        return length*breadth;
    }
}
