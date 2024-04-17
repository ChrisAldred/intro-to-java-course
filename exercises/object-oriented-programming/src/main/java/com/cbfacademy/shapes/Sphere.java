package com.cbfacademy.shapes;

public class Sphere extends Shape{

    final private static double pi = 3.1415;

    private double radius;
    
    public Sphere(double radius) {
        this.name = "Sphere";
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return (4 * pi) * (radius * radius);
    }
}
