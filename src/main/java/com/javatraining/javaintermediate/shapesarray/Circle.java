package com.javatraining.javaintermediate.shapesarray;

public class Circle extends Shape {

    private double radius;

    public Circle(String type, double radius) {
        super(type);
        this.radius = radius;
    }

    @Override
    public double shapeExtent() {
        return Math.PI * radius * radius;
    }
}
