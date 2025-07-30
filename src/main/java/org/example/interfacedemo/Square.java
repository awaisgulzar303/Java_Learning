package org.example.interfacedemo;

public class Square implements Shape {

    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int calculateArea() {
        return length * length;
    }

    @Override
    public int getPoints() {
        return 4;
    }
}