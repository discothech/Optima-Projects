public class HashTableSepChain {
    Node arr[];
    int size;
    HashTableSepChain(int size){
        arr = new Node[size];
        this.size = size;
    }

    private int hashFunc(int key){
        return key%size;
    }

    public boolean insert(Element element){
        int index = hashFunc (element.key);
        if(arr[index]==null){
            arr[index] = new Node(element);
            return true;
        } else{
            Node cur = arr[index];
            while(cur.next!=null){
                if(cur.data.equals(element)) return false;
                cur = cur.next;
            }
            Node newNode = new Node(element);
            cur.next = newNode;
            return true;
        }
    }

    public void print(){
        for(int i = 0; i < arr.length; i++){// перебираємо елементи масиву;
            if(arr[i]!=null){// комірка не порожня;
                Node cur = arr[i];// створюємо вказівник на перший елемент списку комірки;
                while (cur!=null){// проходимо до кінця списку;
                    System.out.println(i+" "+cur.data.value); //виводимо елементи списку;
                    cur = cur.next;// переходимо до наступного значення списку
                }
            }
        }
    }


    public Element search (int key) {
        int index = hashFunc(key);
        Node cur = arr[index];
        while(cur.data.key!=key&& cur!=null){
            cur=cur.next;
        }
        if(cur==null) return null;
        return cur.data;
    }



}