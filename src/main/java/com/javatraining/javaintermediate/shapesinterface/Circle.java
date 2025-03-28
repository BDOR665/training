package com.javatraining.javaintermediate.shapesinterface;

public class Circle implements Shape {

    private String type;
    private double radius;

    public Circle(String type, double radius) {
        this.type = type;
        this.radius = radius;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double shapeExtent() {
        return Math.PI * radius * radius;
    }
}
