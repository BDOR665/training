package com.javatraining.javaintermediate.shapesinterface;

public class Triangle implements Shape {

    private String type;
    private double base;
    private double height;

    public Triangle(String type, double base, double height) {
        this.type = type;
        this.base = base;
        this.height = height;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double shapeExtent() {
        return 0.5 * base * height;
    }
}
