package cpm.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //2
        String[] boys = {"Tom", "Sam", "Alan", "Leam", "Fluffy", "Borys", "Mike", "Murchyk", "Tom", "Tomas"};
        String[] girls = {"Eva", "Masha", "Emi", "Mia", "Lea", "Bea", "Lilly", "Byanka", "Bilka", "Rigina"};
        int b = boys.length;
        int g = girls.length;
        int randValueBoys = (int)(Math.random()*b);
        int randValueGirls = (int)(Math.random()*g);
        System.out.println(boys[randValueBoys]);
        System.out.println(girls[randValueGirls]);

        //3.1
        int[] simpleNumbers = {2, 3, 5, 7, 11, 13, 17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
        int amount = simpleNumbers.length;
        int n = Arrays.binarySearch(simpleNumbers, 41);
        System.out.println(n);
        //4.1

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i*5+i%3;
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);

        //5.1
        char[] numbers = {'m', 'a', 'n', 'i', 'm', 'r', 'p', 'r', 'g', 'o', 'g'};
        char temp;

        temp=numbers[0];
        numbers[0] = numbers[6];
        numbers[6] = temp;

        temp=numbers[1];
        numbers[1] = numbers[5];
        numbers[5] = temp;

        temp=numbers[2];
        numbers[2] = numbers[9];
        numbers[9] = temp;

        temp=numbers[3];
        numbers[3] = numbers[8];
        numbers[8] = temp;

        temp=numbers[4];
        numbers[4] = numbers[7];
        numbers[7] = temp;

        System.out.println(numbers);
    }
}