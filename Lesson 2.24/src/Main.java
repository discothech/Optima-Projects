public class Main {
    public static void main(String[] args) {
        Lorry lorry = new Lorry();
        lorry.carClass = "Lorry";
        lorry.marka = "Mercedes";
        lorry.engine = new Engine(12345, "Gas");
        lorry.carrying = 5;
        lorry.driver="Vasia";
        System.out.println(lorry.toString());
    }
}