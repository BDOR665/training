package com.javatraining.javabasic2;

import java.util.Scanner;

public class IntSumSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();

        System.out.println("두번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();

        System.out.println("두개의 정수의 합은 : " + IntSum(num1, num2));
        System.out.println("두개의 정수의 차는 : " + IntSub(num1, num2));
    }


    public static int IntSum(int num1, int num2) {
        return num1 + num2;
    }

    public static int IntSub(int num1, int num2) {
        return num1 - num2;
    }

}


