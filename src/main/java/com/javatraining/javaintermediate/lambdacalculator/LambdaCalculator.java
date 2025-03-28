package com.javatraining.javaintermediate.lambdacalculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class LambdaCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자 입력 : ");
        double num1 = sc.nextDouble();
        System.out.println("두 번째 숫자 입력 : ");
        double num2 = sc.nextDouble();
        System.out.println("연산자 입력 : ");
        String operator = sc.next();

        Map<String, BiFunction<Double, Double, Double>> calMap = new HashMap<>();
        calMap.put("+",(a, b)-> a+b);
        calMap.put("-",(a, b)-> a-b);
        calMap.put("*",(a, b)-> a*b);
        calMap.put("/",(a, b)-> b!=0 ? a/b : Double.NaN);

        if (calMap.containsKey(operator)){
            double result = calMap.get(operator).apply(num1, num2);
            System.out.println("계산 결과 : " +  result);
        }else {
            System.out.println("사칙연산만 가능합니다!");
        }
        sc.close();
    }
}
