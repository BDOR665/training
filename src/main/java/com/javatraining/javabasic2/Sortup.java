package com.javatraining.javabasic2;

import java.util.Scanner;

public class Sortup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1 = new int[5];

        System.out.println("정수 5개를 입력하세요 : ");
        for(int i=0;i<5;i++){
            arr1[i] = sc.nextInt();
        }

        // 버블 정렬 (반복적으로 비교하여 정렬)
        for (int i = 0; i < arr1.length - 1; i++) {  // 전체 반복 횟수, 한 번 반복할 때마다 가장 큰 숫자가 제자리를 찾음.
            for (int j = 0; j < arr1.length - 1 - i; j++) {  // 각 라운드에서 비교할 인덱스 범위, 인접한 두 숫자를 비교해서 큰 숫자를 뒤로 이동.
                if (arr1[j] > arr1[j + 1]) {
                    // 자리 바꾸기 (swap)
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        // 정렬된 결과 출력
        System.out.print("오름차순 정렬 결과: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
