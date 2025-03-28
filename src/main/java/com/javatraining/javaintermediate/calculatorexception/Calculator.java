package com.javatraining.javaintermediate.calculatorexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("첫 번째 숫자를 입력하세요 : ");
            double num1 = sc.nextDouble();
            System.out.println("두 번째 숫자를 입력하세요 : ");
            double num2 = sc.nextDouble();
            System.out.println("연산자를 입력하세요 : ");
            String operator = sc.next();

            double result;

            switch (operator){
                case "+" :
                    result = num1 + num2;
                    System.out.println("결과 : " + result);
                case "-" :
                    result = num1 - num2;
                    System.out.println("결과 : " + result);
                case "*" :
                    result = num1 * num2;
                    System.out.println("결과 : " + result);
                case "/" :
                    if (num2 == 0){
                        throw new ArithmeticException("0으로 나눌 수 없어!");
                    }
                    result = num1 / num2;
                    System.out.println("결과 : " + result);
                    break;
                default:
                    throw new IllegalArgumentException("사칙연산만 할 수 있어요");
            }

        }catch (InputMismatchException e){
            System.out.println("숫자를 잘못입력, 숫자를 입력하세요");
        } catch (ArithmeticException e) {
            System.out.println("수학적 오류 : " + e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("입력 오류 : " + e.getMessage());
        } catch (Exception e ){
            System.out.println("예상치 못한 오류 발생 : " + e.getMessage());
        } finally {
            sc.close();
        }

    }
}

