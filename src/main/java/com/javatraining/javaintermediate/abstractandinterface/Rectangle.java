package com.javatraining.javaintermediate.abstractandinterface;

public class Rectangle extends Shapeabstract implements Shapeinterface{

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
