public class BinaryTree {
    class Node{
        String data;
        Node left;
        Node right;

        Node(String data){
            this.data = data;
        }
    }
    private Node root;
    public void insert(String data){
        root=insertNode(root, data);
    }
    private Node insertNode(Node current, String data){
        if (current == null){
            return new Node(data);
        }
        if (data.compareTo(current.data)<0){
            current.left=insertNode(current.left, data);
            current=rotationR(current);
        }
        else {
            current.right=insertNode(current.right, data);
            current=rotationL(current);
        }
        return current;
    }

    public void print(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if (node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
    private Node rotationL(Node current){//передаємо батьківський вузол у метод rotationL
        Node temp = current.right;//запам’ятовуємо правого нащадка батьківського елемента
        current.right = temp.left;// лівий вузол правого нащадка стає правим вузлом батька
        temp.left = current; // батько стає лівим вузлом свого правого нащадка
        current = temp;//змінюємо батьківський елемент на його нащадка
        return current; // повертаємо значення перебудованого піддерева з методу
    }
    private Node rotationR(Node current){ //передаємо батьківський вузол у метод rotationR
        Node temp = current.left; //запам’ятовуємо лівого нащадка батьківського елемента
        current.left = temp.right;// правий вузол лівого нащадка стає лівим вузлом батька
        temp.right = current;// батько стає правим вузлом свого лівого нащадка
        current = temp; //змінюємо батьківський елемент на його нащадка
        return current; // повертаємо значення перебудованого піддерева з методу
    }
    public Node find(String key){
        return findNode(root, key);
    }
    private Node findNode(Node current, String key) {
        if (current == null) {
            return null;
        }
        if (key.compareTo(current.data) < 0) {
            current = findNode(current.left, key);
        }
        else if (key.compareTo(current.data)>0) {
            current = findNode(current.right, key);
        }
        else {return current;}
        return current;
    }
}