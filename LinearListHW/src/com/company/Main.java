package com.company;

public class Main {

    public static void main(String[] args) {

        List list = new List(10);
        list.add(0, new Student("Denisova", "Svitlana", Marks.seven, 13));
        list.add(1, new Student("Prianyk", "Andrii", Marks.ten, 12));
        list.add(2, new Student("Epifancev", "Churka", Marks.five, 13));
        list.add(3, new Student("Serbriannik", "Mykola", Marks.eleven, 12));
        list.add(4, new Student("Tumov", "Volodymyr", Marks.six, 12));
        list.print();
        list.delete(0);
        list.delete(list.last);
        list.print();
    }
}