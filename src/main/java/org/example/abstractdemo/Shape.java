package org.example.abstractdemo;

public abstract class Shape {
    private int points;

    Shape(int points) {
        this.points = points;
    }

    protected int getPoints() {
        return points;
    }

    public abstract int calculateArea();
}
