package com.company;

import static com.company.Student.quickSort;

public class Main {
    public static void main(String[] args) {
        Student[] list = new Student[10];
        list[0]=new Student("Ivanov", "Durak", "math", 10.2);
        list[1]=new Student("Niazov", "Oleh", "music", 9.4);
        list[2]=new Student("Adamov", "Alex", "programming", 11.2);
        list[3]=new Student("Ogievich", "Alla", "painting", 8.2);
        list[4]=new Student("Kornienko", "Helena", "dancing", 6.2);
        list[5]=new Student("Lebid", "Katia", "music", 9.2);
        list[6]=new Student("Cherney", "Olga", "music", 9.1);
        list[7]=new Student("Gariev", "Michail", "math", 11.1);
        list[8]=new Student("Chalapchyi", "Serhii", "programming", 10.7);
        list[9]=new Student("Kovalenko", "Andrew", "box", 7.6);

        System.out.println("Elementy do sortuvannia:  ");
        for (Student i:list){
            System.out.println(i.toString());
        }
        quickSort(list, 0, 9);
        System.out.println(" ");
        System.out.println("Elementy pislia sortuvannia:  ");
        for (Student i:list){
            System.out.println(i.toString());
        }
    }
}