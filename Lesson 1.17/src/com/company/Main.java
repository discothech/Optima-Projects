package com.company;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(new City("Kyiv", 44, 5000000));
        tree.add(new City("Lviv", 34, 550000));
        tree.add(new City("Odesa", 25, 1000000));
        tree.add(new City("Kharkiv", 784, 1500000));
        tree.add(new City("Mykolaiv", 512, 85000));
        tree.add(new City("Ivano-Frankivsk", 10, 850000));
        tree.print();
        City city = tree.search(512);
        System.out.println("\n"+"City with key 512 is "+city.name);
    }
}