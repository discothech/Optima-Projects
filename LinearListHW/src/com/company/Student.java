package com.company;
public class Student {
    String name;
    String surname;
    Marks mark;
    int age;

    public Student(String name, String surname, Marks subject, int age){
        this.name = name;
        this.surname = surname;
        this.mark = subject;
        this.age = age;
    }

    public String toString(){
        return name+" "+surname+" "+mark+" "+age;
    }
}
