package com.cbfacademy.shapes;

public class Cylinder extends Shape {

    final private static double pi = 3.1415;
    
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.name = "Cylinder";
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea(){
        return height * pi * (radius * radius);
    }
}
