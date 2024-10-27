public class BinaryTree {
    Node root;//посилання на корінь дерева
    void add(int value){//додавання елемента до дерева
        root = insert(root, value);
    }
    private Node insert(Node node, int value){//рекурсивна вставка нового вузла
        if(node == null){
            return new Node(value);
        }
        if(value < node.value){//нове значення менше за поточний вузол
            node.left = insert(node.left, value);//перехід в ліве піддерево
        }
        else{
            node.right = insert(node.right, value);//в іншому випадку перехід в праве піддерево
        }
        return node;
    }
    private int height(Node node){
        if(node == null) return 0;//умова зупинки рекурсії, при досягнені нульового вузла
//рекурсивне визначення висоти піддерева
        return max(height(node.right), height(node.left))+1;
    }
    private int max(int l, int r){
        return (l>r)?l:r;//використовуємо тернарний оператор для визначення максимального з двох значень
    }

    boolean balance(){
        return checkBalance(root);//перевірку збалансованості починаємо від кореня дерева
    }
    private boolean checkBalance(Node node){
        if(node == null) return true;//умовою виходу з рекурсії є отримання пустого піддерева
        int leftSide = height(node.left);//визначаємо висоту лівого піддерева
        int rightSide = height(node.right);//визначаємо висоту правого піддерева
//Перевіряємо, що різниця висоти лівого та правого піддерев не більше 1.
//Також перевіряємо збалансованість лівого та правого піддерев.
        if(Math.abs(rightSide-leftSide)<=1 && checkBalance(node.left) && checkBalance(node.right)) return true;//Якщо всі перевірки успішні, то повертаємо значення true, тобто що дерево є збалансованим.
        return false;//В іншому випадку повертаємо значення false, тобто що дерево є незбалансованим.
    }

}