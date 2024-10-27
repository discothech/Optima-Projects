import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person [] list = new Person[5];
        Scanner nameScan = new Scanner(System.in);
        Scanner ageScan = new Scanner(System.in);
        Scanner avgMark = new Scanner(System.in);
        for (int i = 1; i<5; i++){
            System.out.println("Enter name: ");
            String name = nameScan.nextLine();
            System.out.println("Enter surname: ");
            String surname = nameScan.nextLine();
            System.out.println("Enter age: ");
            int age = ageScan.nextInt();
            System.out.println("Enter Mark: ");
            double mark = avgMark.nextInt();
            Person person = new Person(surname, name, age, mark);
            list[i] = person;
        }
        System.out.println(String.format(" № %12s %10s %4s %.5s","Surname", "Name", "Age", "Mark"));
        for (int i = 0; i < 5; i++) {
            System.out.println(String.format(" %d %12s %10s %4s %,2f",i,list[i].surname, list[i].name, list[i].age, list[i].avgMark));
        }
    }
}