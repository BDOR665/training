package com.javatraining.javabasic1;

import java.util.Scanner;

public class Nameage {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.println("나이를 입력하세요");
        age = sc.nextInt();

        System.out.println("이름은"+name+"이고, 나이는"+age+"입니다.");
    }
}
