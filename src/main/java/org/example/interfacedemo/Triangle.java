package org.example.interfacedemo;

public class Triangle implements Shape {

    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public int getPoints() {
        return 3;
    }
}
