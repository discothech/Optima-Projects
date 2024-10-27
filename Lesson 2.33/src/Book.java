public class Book implements Printable{
    String name;
    Book(String name){
        this.name = name;
    }
    @Override
    public void print(){
        System.out.println("Prit book "+name);
    }
}
