package com.javatraining.javaintermediate.shapesinterface;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("원", 5);
        shapes[1] = new Rectangle("사각형", 4, 6);
        shapes[2] = new Triangle("삼각형", 3, 7);

        for (Shape shape : shapes){
            System.out.println(shape.getType() + "의 면적 : " + shape.shapeExtent());
        }

    }
}
