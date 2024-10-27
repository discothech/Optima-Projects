package com.company;

public class Main {
    public static void main(String[] args) {
        int arr[] = {4,3,2,10,12,1,5,6};
        SortShellKnutt(arr);
    }
    public static void SortShellKnutt(int[] arr){
        int n = arr.length;
        int step = 1;
        while (step <= n/9) {
            step=step*3 + 1;
        }

        for( ; step >0; step/=3){
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
