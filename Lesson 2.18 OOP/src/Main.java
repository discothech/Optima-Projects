public class Main {
    public static void main(String[] args) {
        Person newPerson = new Person();
        newPerson.name = "Sergik";
        newPerson.surname = "Zbarik";
       // newPerson.ID=21822;
        System.out.println("Hello world!");
        Programmer newCoder = new Programmer();
        newCoder.name = "Sergio";
        newCoder.surname = "Zbarakh";
        newCoder.printInfo();
    }
}