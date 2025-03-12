package com.javatraining.javabasic2;

import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arrayAve= new int[5];

        int sum = 0;

        for(int i=0; i<arrayAve.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("배열["+i+"]의 값을 넣어주세요 : ");
            arrayAve[i] = sc.nextInt();
        }
        for (int num : arrayAve) {
            sum += num;
        }
        double ave = (double) sum/arrayAve.length;

        System.out.println("배열의 평균은 : "+ave+"입니당!");

    }
}
