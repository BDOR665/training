package com.javatraining.javabasic2;

import java.util.Scanner;

public class SquareExtent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("사각형의 가로의 값을 입력하세요 : ");
        int width = sc.nextInt();
        System.out.println("사각형의 세로의 값을 입력하세요 : ");
        int length = sc.nextInt();
        System.out.println("직사각형의 넓이는 : "+width*length+"입니다!");
    }
}
