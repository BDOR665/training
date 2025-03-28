package com.javatraining.javaintermediate.reversed;

import java.util.Scanner;

public class StringReversedUpDown {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력 : ");
        String input = sc.nextLine();

        /* 문자열 뒤집기 */
        String reversed = new StringBuilder(input).reverse().toString();

        /* 대소문자 변환 */
        StringBuilder change = new StringBuilder();
        for (char ch : input.toCharArray()){
            if (Character.isUpperCase(ch)){
                change.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)){
                change.append(Character.toUpperCase(ch));
            } else {
                change.append(ch);
            }

        }

        System.out.println("뒤집은 문자열 : " + reversed);
        System.out.println("대소문자 변환 : " + change);

    }
}
