package com.code;

import java.util.Arrays;
import java.util.Comparator;


public class SquareComparatortest {
    public static void main(String[] args) {
        Square []squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(3.2);
        squares[2] = new Square("red",true,4.5);

        System.out.println("Pre-sorted");
        for (Square square:squares){
            System.out.println(square);
        }

        Comparator<Square> squareComparator = new SquareComparator();
        Arrays.sort(squares,squareComparator);

        System.out.println("After- sorted");
        for (Square square:squares){
            System.out.println(square);
        }


    }
}
