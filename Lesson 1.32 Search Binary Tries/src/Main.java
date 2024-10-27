public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert("Sony");
        tree.insert("Sanyo");
        tree.insert("Sharp");
        tree.insert("Blaupunkt");
        tree.insert("Beko");
        tree.insert("Panasonic");
        tree.print();
        String data ="Sony";
        System.out.println("Find: "+data);
        if (tree.find(data)!=null){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


        //String a ="Abc";
        //String b ="Bcd";
        //System.out.println(b.compareTo(a));
        /*tree.insert(1);
        tree.insert(5);
        tree.insert(6);
        tree.insert(17);
        tree.insert(19);
        tree.insert(21);
        tree.insert(10);
        System.out.println(tree.find(17).studentID);
         */
    }
}