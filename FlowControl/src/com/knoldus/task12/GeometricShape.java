package com.knoldus.task12;
import java.util.Scanner;

public class GeometricShape {

    //define enum
    enum Shape {
        CIRCLE, SQUARE, RECTANGLE, TRIANGLE;
    }
    static void circleArea(int radius,double area){
        area = Math.PI * radius * radius;
        System.out.println("Area of Circle= "+area);
    }
    static void SquareArea(int side,double area){
        area = side * side;
        System.out.println("Area of Square= "+area);
    }
    static void RectangleArea(int length,int breadth,double area){
        area = length * breadth;
        System.out.println("Area of Rectangle= "+area);
    }
    static void TriangleArea(int base,int height,double area){
        area = 0.5 * base * height;
        System.out.println("Area of Triangle= "+area);
    }
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        double area = 0.0;

        // calculating area of different shapes
        for (Shape shape:Shape.values()) {
            if(shape==Shape.CIRCLE){
                System.out.println("Enter the radius");
                int radius=input.nextInt();
                circleArea(radius,area);
            }
            else if(shape==Shape.SQUARE){
                System.out.println("Enter the side");
                int side=input.nextInt();
                SquareArea(side,area);
            }
            else if(shape==Shape.RECTANGLE) {
                System.out.println("Enter the length of rectangle");
                int length = input.nextInt();
                System.out.println("Enter the breadth of rectangle");
                int breadth = input.nextInt();
                RectangleArea(length,breadth,area);
            }
            else if(shape==Shape.TRIANGLE){
                System.out.println("Enter the base of triangle");
                int base=input.nextInt();
                System.out.println("Enter the height of triangle");
                int height=input.nextInt();
                TriangleArea(base,height,area);
            }
        }

    }
}

