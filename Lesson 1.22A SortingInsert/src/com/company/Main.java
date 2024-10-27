package com.company;

public class Main {

    public static void main(String[] args) {
        int arr [] = {4,3,2,10,12,5,6};
        InsertionSort(arr, arr.length);
    }
    public static void InsertionSort(int [] arr, int size){
        for (int i = 1; i < size; i++){
            int element = arr[i];//2
            int j = i-1;//1
            while(j>=0 && (arr[j]>element)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = element;

        }
    }
}