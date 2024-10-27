public class HashTable {
    Integer arr[];
    int size;
    HashTable(int size){
        arr=new Integer[size];
        this.size=size;
    }
    boolean insert(int value) {
        int index = hashFunction(value);
        if (arr[index] == null) {
            arr[index] = value;
            return true;
        } else {
            return collision(value, index);
        }
    }
    int hashFunction(int key){
            return key%size;
        }
    boolean collision(int value, int index){
            int newIndex;
            for (int i = 0; i < size; i++) {
                newIndex = (index+i)%size;
                if (arr[newIndex]==null){
                    arr[newIndex]=value;
                    return true;
                }
            }
            return  false;
    }
}
