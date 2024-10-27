package study;
public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable(10);
        Element Tom = new Element("Tom", 15);
        Element Alex = new Element("Alex", 23);
        table.insert(new Element("Kate", 1));
        table.insert(new Element("Sam", 4));
        // table.insert(new Element("Tom", 15));
        table.insert(Tom);
        table.insert(new Element("Dmytro", 25));
        //table.insert(new Element("Alex", 23));
        table.print();
        Element Olena = (new Element("Olena", 11));
        System.out.println(table.search(Olena));
    }
   /* public boolean insert(Element element){

    }

    */
    /*
     private int hashFunction(){

    }
     */

}
     /*
        HashTable table = new HashTable(20);
        table.insert(new Element("Kate", 1));
        table.insert(new Element("Sam", 12));
        table.insert(new Element("Tom", 11));
        table.insert(new Element("Bob", 13));
        table.insert(new Element("Nina", 3));
        table.print();
         */