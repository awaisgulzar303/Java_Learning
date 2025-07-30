package org.example.interfacedemo;

public class ShapeService {

    public void testSquare() {
        Square square = new Square(5);
        System.out.println("Points of the square: ");
        System.out.println(square.getPoints());
        System.out.println("Area of the square: ");
        System.out.println(square.calculateArea());
    }

    public void testTriangle() {
        Triangle triangle = new Triangle(3, 10);
        System.out.println("Points of the triangle: ");
        System.out.println(triangle.getPoints());
        System.out.println("Area of the triangle: ");
        System.out.println(triangle.calculateArea());
    }
}
