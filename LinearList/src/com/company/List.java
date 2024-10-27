package com.company;

public class List {
    private Teacher[] vector;
    int last;

    List(int size){
        vector = new Teacher[size];
        last = -1;
    }

    private boolean isFull(){
    if(last == vector.length-1){
        return true;
    } else {
        return false;
    }
    }

    private boolean isEmpty(){
        if(last == -1){
            return true;
        } else {
            return false;
        }
    }


    public boolean add(int index, Teacher value){
        if(isFull()){
            System.out.println("Array is full!");
            return false;
        }
        if(index<0 || index > last+1){
            System.out.println("Incorrect index!");
            return false;
        }
        for(int i = last; i >= index; i--){
            vector[i+1] = vector[i];
        }
        vector[index] = value;
        last++;
        return true;
    }

    public Teacher delete(int index){
        if(isEmpty()){
            System.out.println("Array is empty!");
            return null;
        }
        if(index<0 || index > last){
            System.out.println("Incorrect index!");
            return null;
        }
        Teacher deleteValue = vector[index];
        for(int i = index; i < last; i++){
            vector[i] = vector[i+1];
        }
        vector[index] = null;
        last--;
        return deleteValue;
    }

    public void print (){
        for(int i = 0; i <= last; i++){
            System.out.println(vector[i]);
        }
    }
}
