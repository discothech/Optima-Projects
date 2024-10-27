package com.company;

public class Main {
    public static void main(String[] args) {
        int arr[] = {4,3,2,10,12,5,6};
        SortShell(arr);
    }
    public static void SortShell(int[] arr){
        int n = arr.length;
        for (int step = n/2; step > 0; step/= 2){
            for (int i = step; i < n; i ++){
                int temp = arr[i];
                int j;
                for (j = i; j >= step && arr[j - step] > temp; j -= step){
                    arr[j] = arr[j - step];
                }
                arr[j] = temp;
            }
        }
    }
}
