package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(NSD(142, 69));
    }

    public static int NSD(int a, int b) {
        while (a != 0 && b != 0) {
        if (a > b){
                a = a % b;
            }
        else{
            b = b % a;
            }
        }
        return a + b;
    }

}