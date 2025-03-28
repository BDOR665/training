package com.javatraining.javaintermediate.sort;

public class SelectionSort {

    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length-1; i++){

            int minIdx = i;

            /* 배열에서 최소값 인덱스를 찾음 */
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[minIdx]){

                    minIdx = j;

                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }
    }
}
