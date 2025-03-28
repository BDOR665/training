package com.javatraining.javaintermediate.abstractandinterface;

public class Triangle extends Shapeabstract implements Shapeinterface {

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
