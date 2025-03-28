package com.javatraining.javaintermediate.shapesinterface;

public class Rectangle implements Shape {

    private String type;
    private double width;
    private double height;

    public Rectangle(String type, double width, double height) {
        this.type = type;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double shapeExtent() {
        return width * height;
    }
}
