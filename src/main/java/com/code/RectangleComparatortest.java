package com.code;

import java.util.Arrays;
import java.util.Comparator;


public class RectangleComparatortest {
    public static void main(String[] args) {
        Rectangle []rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(2.3,4.5);
        rectangles[2] = new Rectangle("red",true,3.4,5.6);

        System.out.println("Pre - sorted:");
        for (Rectangle rectangle:rectangles){
            System.out.println(rectangle);
        }

        Comparator<Rectangle> rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles,rectangleComparator);

        System.out.println("After - sorted:");
        for (Rectangle rectangle:rectangles){
            System.out.println(rectangle);
        }
    }

}
