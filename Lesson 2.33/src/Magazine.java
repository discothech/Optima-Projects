public class Magazine implements Printable {
    String name;
    Magazine(String name){
        this.name = name;
    }
    @Override
    public void print(){
        System.out.println("Prit magazine "+name);
    }
    static void printMagazines(Printable[] printable){
        for (Printable a: printable){
            if (a instanceof Magazine){
                ((Magazine)a).print();
            }
        }
    }
}
