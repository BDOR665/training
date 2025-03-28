package com.javatraining.javaintermediate.abstractandinterface;

public class Circle extends Shapeabstract implements Shapeinterface {

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
