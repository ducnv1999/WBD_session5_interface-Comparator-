package com.code;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(String color_, boolean filled_, double size) {
        super(color_,filled_,size,size);
    }
    public double getSize(){
        return getWidth();
    }
    public void setSize(double size){
        setWidth(size);
        setHeight_(size);
    }

    @Override
    public void setWidth(double width_) {
        setSize(width_);
    }

    @Override
    public void setHeight_(double height_) {
        setSize(height_);
    }

    @Override
    public String toString() {
        return "A Square with size = "+getSize()+", which is subclass of "+ super.toString();
    }

}
