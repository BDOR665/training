package com.javatraining.javaintermediate.shapesarray;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(String type, double base, double height) {
        super(type);
        this.base = base;
        this.height = height;
    }

    @Override
    public double shapeExtent() {
        return 0.5 * base * height;
    }
}
