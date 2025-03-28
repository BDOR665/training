package com.javatraining.javaintermediate.sort;

import java.util.Scanner;

import static com.javatraining.javaintermediate.sort.BubbleSort.bubbleSort;
import static com.javatraining.javaintermediate.sort.InsertionSort.insertionSort;
import static com.javatraining.javaintermediate.sort.SelectionSort.selectionSort;
import static com.javatraining.javaintermediate.sort.SequentialSort.sequentialSort;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 배열의 길이를 입력 : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("배열의 요소들을 입력 : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        /* 정렬 전 출력 */
        System.out.println("정렬 전 배열");
        for (int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();

        /* 배열 선택 */
        bubbleSort(arr);
        /*selectionSort(arr);
        insertionSort(arr);
        sequentialSort(arr);*/

        /* 정렬 후 출력 */
        System.out.println("정렬 후 배열");
        for (int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();

        sc.close();
    }
}
