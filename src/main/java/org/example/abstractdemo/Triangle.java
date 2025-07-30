package org.example.abstractdemo;

public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle(int base, int height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return (base * height) / 2;
    }
}
