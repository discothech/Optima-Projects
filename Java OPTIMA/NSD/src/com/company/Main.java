package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(NSD(120, 24));
    }
    public static int NSD(int a, int b) {
        while (a != b) {
            if (a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        return a;
    }

}

