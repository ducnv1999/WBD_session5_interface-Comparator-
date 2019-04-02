package com.code;

public class Circle extends Shape {
    private double radius = 2.0;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double getArea(){
        return this.radius *this.radius *Math.PI;
    }

    private double getPerimeter(){
        return 2*Math.PI* radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "+ getRadius()+",Area of Circle = "+getArea()+", Perimeter of Circle = "+getPerimeter()+" , Which is subclass of "+ super.toString();
    }
}
