public class Stack<T> {
    private Node top;
    public void push(T data){
        Node element = new Node(data);
        element.next = top;
        top = element;
    }

    public T pop(){
        if(top == null) return null;
        T tmp = (T)top.data;
        top = top.next;
        return tmp;
    }

    public T peek(){
        return (T)top.data;
    }

    public void show(){
        Node tmp = top;
        while(tmp!=null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

}
