package com.javatraining.javaintermediate.sort;

public class BubbleSort {

    public static void bubbleSort(int[] arr){

        int tmp;

        /* 회전 반복 */
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length -1 -i; j++){
                if (arr[j] > arr[j+1]){

                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;

                }
            }

        }

    }
}
