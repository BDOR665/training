package com.javatraining.javaintermediate.sort;

public class SequentialSort {

    public static void sequentialSort(int[] arr){

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j< arr.length; j++){

                if(arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }
            }
        }
    }
}
