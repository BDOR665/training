package com.javatraining.javaintermediate.rectangle;

public class Rectangle {

    private int length; // 길이
    private int width; // 넓이

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /* 넓이 계산*/
    public int rectanlgeExtent(){
        return length * width;
    }

    /* 둘레 계산 */
    public int rectanlgeCircumference(){
        return 2*length + 2*width;
    }
}
