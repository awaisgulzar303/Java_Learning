package org.example.abstractdemo;

public class Main {
    public static void main(String[] args) {
        ShapeService shapeService = new ShapeService();
        shapeService.testSquare();
        shapeService.testTriangle();
        System.out.println("Testing polymorphism:");
        shapeService.testPolymorphism("square");
        shapeService.testPolymorphism("triangle");

        shapeService.calculate(1, 1);
        shapeService.calculate(1.0, 1.0);
    }
}
