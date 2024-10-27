package study;

public class HashTable {
    private Element arr[];
    private int size;
    public HashTable(int size){
        arr = new Element[size];
        this.size = size;
    }
    public boolean insert(Element element){
        int index = hashFunction(element.key);
        if (arr[index] == null){
            arr[index] = element;
            return true;
        }
        else{
            return collision(index, element);
        }
    }
    private boolean collision (int startIndex, Element element){
        int newIndex = startIndex;
        for(int i = 0; i<size; i++) {
            if(arr[newIndex]==null){
                arr[newIndex] = element;
                return true;
            }
            newIndex = (startIndex + i*i)%size; //Завдання 1
        }
        return false;
    }
    public int hashFunction(int key){
        return key%size;//0...size-1
    }

    //Завдання 2
    public int search (Element element){
        int index = hashFunction(element.key);
        if(element.name==arr[index].name){
            return index;
        }
        else{
            int newIndex = index;
            for(int i=1; i<size; i++){
                if(arr[newIndex]==null){
                    return -1;
                }
                if(arr[newIndex].name==element.name){
                    return newIndex;
                }
                newIndex = (index + i*i)%size;
            }
            return -1;
        }
    }
    public void print(){
        for (int i = 0; i<size; i++){
            if (arr[i] != null){
                System.out.println(i+"  "+ arr[i].name);
            }
        }
    }
}

    /*
    private Element arr[];
    private int size;
    public HashTable(int size){
        arr = new Element[size];
        this.size = size;
    }
    public int hashFunc(int key){
        int hash = key%size;
        return hash;
    }
    public boolean insert(Element element){
        int index = hashFunc(element.key);
        if (arr[index] == null){
            arr[index] = element;
            return  true;
        } else{
            if (!arr[index].equals(element)) {
                return collision(index, element);
            }
        }
        return false;
    }
    private boolean collision(int index, Element element){
        int newInd = index;
        for (int i = 1; i < arr.length; i++){
            newInd = (i+ index) % size;
            if (arr[newInd] == null){
                    arr[newInd] = element;
                    return true;
            }
            if (arr[newInd].equals(element)) return false;
        }
        return false;
    }
    public void print(){
        for (int i = 0; i < arr.length; i++){
            if (arr[i]!=null){
                System.out.println(i+" "+arr[i].toString());
            }
        }
    }
     */
