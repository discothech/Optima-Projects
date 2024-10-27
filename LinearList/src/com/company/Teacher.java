package com.company;
public class Teacher {
    String name;
    String surname;
    Subjects subject;
    int age;

    public Teacher(String name, String surname, Subjects subject, int age){
        this.name = name;
        this.surname = surname;
        this.subject = subject;
        this.age = age;
    }

    public String toString(){
        return name+" "+surname+" "+subject+" "+age;
    }
}
