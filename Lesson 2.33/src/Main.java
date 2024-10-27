public class Main {
    public static void main(String[] args) {
        Truba truba = new Truba(50.3);
        Baraban baraban = new Baraban(18.4);
        Gitara gitara = new Gitara(6);
        Instrument [] list = {truba, baraban, gitara};
        for (int i=0; i<3; i++){
            list[i].play();
        }




        /*
        Book book1 = new Book("Romeo and Juliet");
        Book book2 = new Book("Harry Potter");
        Magazine magazine1 = new Magazine("Time");
        Magazine magazine2 = new Magazine("Vogue");
        Printable [] list = {book1, book2, magazine1, magazine2};
        for (int i=0; i<list.length; i++){
            list[i].print();
        }
        Magazine.printMagazines(list);

         */
    }
}