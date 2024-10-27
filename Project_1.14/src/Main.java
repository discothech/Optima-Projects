public class Main {
    public static void main(String[] args) {
        HashTableSepChain table = new HashTableSepChain(10);
        table.insert(new Element("One", 1));
        table.insert(new Element("Twelvw", 12));
        table.insert(new Element("Eleven", 11));
        table.insert(new Element("Twenty Two", 22));
        table.insert(new Element("Five", 5));
        table.print();
        System.out.println("Find element with key 22");
        System.out.println(table.search(22).value);
    }
}