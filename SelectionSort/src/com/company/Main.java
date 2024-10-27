package com.company;

public class Main {
    public static void main(String[] args) {
        int [] array = {23, 4, 34, 0, -3, 5,7};
        SelectionSort(array, array.length);
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]+"  ");
        }
    }
    public static void SelectionSort(int [] arr, int size){
        int min;
        int index;
        for (int i=0; i<size; i++){
            min = arr[i];
            index = i;
            for(int j=i; j<size; j++){
                if (arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
        }
    }
}