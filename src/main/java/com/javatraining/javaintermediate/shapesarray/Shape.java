package com.javatraining.javaintermediate.shapesarray;

public abstract class Shape {

    private String type;

    public abstract double shapeExtent();

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
