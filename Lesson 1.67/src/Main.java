public class Main {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(14);
        binaryTree.add(9);
        binaryTree.add(1);
        binaryTree.add(13);
        System.out.println(binaryTree.balance());
        Stacks stacks = new Stacks(5);
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.push(5);
        stacks.push(6);
        stacks.push(7);
        stacks.push(8);
        stacks.push(9);
        stacks.push(10);
        stacks.push(11);
        stacks.pop();
        stacks.pop();
    }
}