import java.util.ArrayList;

public class Stack {
    class Node{
        int data;
        Node previous;
        Node(int data){
            this.data=data;
        }
    }
    private Node top;

    public void push(int value){
        Node newNode=new Node(value);
        newNode.previous=top;
        top=newNode;
    }
    public Integer pop(){
        if (top==null) return null;
        int deletedNode= top.data;
        top=top.previous;
        return deletedNode;
    }
    public void print(){
        Node temp = top;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.previous;
        }
    }
}
