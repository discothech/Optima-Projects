package com.company;

public class Student implements Comparable{
    String surname;
    String name;
    String optional;
    double avgMark;

    Student(String surname, String name, String optional, double avgMark){
        this.surname = surname;
        this.name = name;
        this.optional = optional;
        this.avgMark = avgMark;
    }
    public String toString(){
        return String.format("%12s %10s %12s %.2f ", surname, name, optional, avgMark);
    }
    @Override
    public int compareTo(Object o){
        Student s = (Student)o;
        return Double.compare(avgMark, s.avgMark);
    }
    public static void quickSort(Student [] arr, int low, int high){
        if (low<high){
            int pi = partition(arr, low, high);
            quickSort(arr,low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    static int partition(Student [] arr, int low, int high){
        Student pivot = arr[high];
        int i = low-1;
        for (int j=low; j<=high-1; j++){
            if (arr[j].compareTo(pivot)<0){
                i++;
                Student temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        Student temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high]=temp;
        return i+1;
    }
}
