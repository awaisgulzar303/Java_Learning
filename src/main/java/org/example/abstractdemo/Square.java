package org.example.abstractdemo;

public class Square extends Shape {
    private int length;

    public Square(int length) {
        super(4);
        this.length = length;
    }

    @Override
    public int calculateArea() {
        return length * length;
    }
}