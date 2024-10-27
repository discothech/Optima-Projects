package com.company;

public class Main {

    public static void main(String[] args) {

        List list = new List(10);
        list.add(0, new Teacher("Denisova", "Svitlana", Subjects.history, 60));
        list.add(1, new Teacher("Uebanov", "Ukurei", Subjects.english, 30));
        list.add(2, new Teacher("Epifancev", "Churka", Subjects.math, 33));
        list.add(3, new Teacher("Loch", "Mykola", Subjects.chemistry, 36));
        list.add(4, new Teacher("Tumov", "Kapitan", Subjects.history, 66));
        list.print();
        list.delete(0);
        list.delete(list.last);
        list.print();
    }
}