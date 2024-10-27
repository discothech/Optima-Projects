public class StackArray {
    private Integer [] vect;
    private int last;
    public StackArray (int size){
        vect = new Integer[size];
        last = -1;
    }
    // isFool
    private boolean isFull (){
        return (last == vect.length-1);
    }
    // isEmpty
    private boolean isEmpty (){
        return (last == -1);
    }
    // додавання
    public boolean push (int value){
        if(isFull()){
            return false;
        }
        vect [++last] = value;
        return true;
    }
    //видалення
    public Integer pop () {
        if(isEmpty()) {
            return null;
        }
        int temp = vect[last];
        vect[last--] = null;
        return temp;
    }
    // показати елемент з вершини
    public Integer peek () {
        if(isEmpty()) {
            return null;
        }
        return vect[last];
    }
    // показати усі елементи
    public void show () {
        for(int i=0; i<=last; i++){
            System.out.println(vect[i]);
        }
    }
}
