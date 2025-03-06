package com.javatraining.javabasic1;

import java.util.Scanner;

public class Sumtest {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력해주세요 : ");
        num1 = sc.nextInt();

        System.out.println("두 번째 숫자를 입력해주세요 : ");
        num2 = sc.nextInt();

        System.out.println("입력받은 두 숫자의 합계는 : " + (num1+num2) + "입니다.");
    }
}