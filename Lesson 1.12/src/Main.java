3public class Main {
    public static void main(String[] args) {
            StackArray stack = new StackArray(10);
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.pop();
            stack.show();
            System.out.println("Top Element");
            System.out.println(stack.peek());
    }
}