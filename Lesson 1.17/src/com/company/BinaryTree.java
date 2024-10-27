package com.company;

public class BinaryTree {
    private Node root;//Posylannia na korin dereva
    public void add (City city){
        root = insert(root, city);
    }
    private Node insert(Node current, City city){
        if (current == null){
            return new Node(city);
        }
        else {
            if (city.code<current.data.code){
                current.left=insert(current.left, city);
            }
            else if (city.code>current.data.code){
                current.right=insert(current.right, city);
            }
        }
        return current;
    }
    public void print(){
        preOrder(root);
    }
    //  Obhid inOrder

    private void preOrder(Node current){
        if(current == null){
            return;
        }
        System.out.println(current.data.name + " " + current.data.code);// Vyvid batkivskoho elementu
        preOrder(current.left);
        preOrder(current.right);
    }

    public City search(int key){
        return find(root, key);
    }

    public City find(Node current, int key){
        if (current == null){
            return  null;
        }
        else if (key == current.data.code){
            return current.data;
        }
        else if(key<current.data.code){
            return find(current.left, key);
        }
        else if(key>current.data.code){
            return find(current.right, key);
        }
        return null;
    }

    /*
        //  Obhid inOrder
    private void inOrder(Node current){
        if(current == null){
            return;
        }
        inOrder(current.left);
        System.out.println(current.data.name);
        inOrder(current.right);
    }
     */
}
