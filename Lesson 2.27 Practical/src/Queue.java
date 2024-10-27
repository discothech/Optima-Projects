public class Queue {
    private int arr[];
    private int last = -1;
    private int MAX_SIZE = 10;
    Queue(int size){
        try{
            if (size>MAX_SIZE) throw new Exception("Array size should be less than 10");
            arr = new int[size];
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void add(int data){
        try{
            if (last>= arr.length-1) throw new Exception("Array is full");
            arr[++last]=data;
        }
       catch(Exception ex){
           System.out.println(ex.getMessage());
        }
    }
    // FIFO
    public int del(){
        try{
            if (last<0) throw new Exception("Array is empty!");
            int temp = arr[0];
            for (int i=0; i<last; i++){
                arr[i]=arr[i+1];
            }
            arr[last]=-1;
            last--;
            return temp;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            return -1;
        }
    }
}
