package org.example.abstractdemo;

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

    // Method overloading example

    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(double a, double b) {
        return a + b;
    }

    public void testPolymorphism(String type) {
        Shape shape;
        if (type.equals("square")) {
            shape = new Square(5);
            System.out.println(shape.calculateArea());
        } else if (type.equals("triangle")) {
            shape = new Triangle(3, 10);
            System.out.println(shape.calculateArea());
        } else {
            System.out.println("Unknown shape type");
        }
    }
}
