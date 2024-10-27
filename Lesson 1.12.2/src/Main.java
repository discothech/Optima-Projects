public class Main {
    public static void main(String[] args) {

        /*
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.show();
        System.out.println("After pop");
        myStack.pop();
        myStack.show();
         */
        Queue<Integer> myQueue = new Queue<>(5);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.show();
        // System.out.println("After pop");
        // myQueue.dequeue();
        // myQueue.show();
    }
}