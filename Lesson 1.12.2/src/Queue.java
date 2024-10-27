

public class Queue <T> {
    private Integer [] vect;
    private int back;
    public Queue (int size){
        vect = new Integer[size];
        back = -1;
    }
    private boolean isFull(){// перевірка на запоненість
        return (back == vect.length-1);
    }
    private boolean isEmpty(){// перевірка на пустоту
        return (back == -1);
    }
    public boolean enqueue (int value){// додавання
        if(isFull()){
            return false;
        }
        vect [++back] = value;
        return true;
    }
    public Integer dequeue () {// видалення
        if(isEmpty()) {
            return null;
        }
        int temp = vect[0];
        for(int i = 0; i < back; i++) {
            vect[i] = vect [i+1];
        }
        vect[back--] = null;
        return temp;
    }
    public Integer front () {// показати елемент з початку
        if(isEmpty()) {
            return null;
        }
        return vect[0];
    }
    public Integer rear () {// показати елемент з кінця
        if(isEmpty()) {
            return null;
        }
        return vect[back];
    }
    public void show () {// показати елементи черги
        for(int i = 0; i<=vect.length; i++){
            System.out.println(vect[i]);
        }
    }

}