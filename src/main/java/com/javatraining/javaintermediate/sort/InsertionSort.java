package com.javatraining.javaintermediate.sort;

public class InsertionSort {

    public static void insertionSort(int[] arr){

        for (int i = 1; i < arr.length; i++){

            int key = arr[i]; // 현재 비교할 값
            int j = i-1;

            /* 정렬된 왼쪽 부분에서 key보다 큰 값들을 오른쪽으로 한 칸씩 이동 */
            while (j>=0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }
}
