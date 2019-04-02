package com.code;

public class Rectangle extends Shape {
    private double width;
    private double height_;

    public Rectangle() {
    }

    public Rectangle(double width, double height_) {
        this.width = width;
        this.height_ = height_;
    }

    public Rectangle(String color_, boolean filled_, double width, double height_) {
        super(color_, filled_);
        this.width = width;
        this.height_ = height_;
    }

    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight_() {
        return height_;
    }
    public void setHeight_(double height_) {
        this.height_ = height_;
    }

    public double getArea(){
        return width * height_;
    }

    public double getPrimeeter(){
        return 2*(width +height_);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "+ getWidth()+", height_ = "+ getHeight_()+", Which is a subclass of "+ super.toString();
    }

}
