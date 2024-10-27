package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        float arr[]={0.21f, 0.34f, 0.53f, 0.23f, 0.32f, 0.33f, 0.55f, 0.42f, 0.98f, 0.27f};
        bucketSort(arr, 10);
    }
    static public void bucketSort(float arr[], int n){
        if (n<=0){
            return;
        }
        Vector<Float> [] buckets = new Vector[n];
        for (int i =0; i<n; i++){
            buckets[i] = new Vector<Float>();
        }
        for (int i=0; i<1; i++){
            float idx = arr[i]*n;
            buckets [(int)idx].add(arr[i]);
        }
        for (int i=0; i<n; i++){
            Collections.sort(buckets[i]);
        }
        int index = 0;
        for(int i=0; i<n; i++){
            for (int j=0; j<buckets[i].size(); j++){
                arr[index++]=buckets[i].get(j);
            }
        }
    }
}