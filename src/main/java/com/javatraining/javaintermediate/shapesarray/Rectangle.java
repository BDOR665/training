package com.javatraining.javaintermediate.shapesarray;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String type, double width, double height) {
        super(type);
        this.width = width;
        this.height = height;
    }

    @Override
    public double shapeExtent() {
        return width * height;
    }
}
