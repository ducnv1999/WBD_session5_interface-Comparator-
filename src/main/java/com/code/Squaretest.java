package com.code;

public class Squaretest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("red",true,5.8);
        System.out.println(square);

    }
}
