import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D://Projects//Lesson 2.46 Serialize//Test.txt"))) {
            Country country = new Country("Ukraine", 603.7, 42000000);
            City city = new City("Kyiv", country, 2000000);
            oos.writeObject(city);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Test.txt"))) {
            City newCity = (City)ois.readObject();
            System.out.println(newCity.toString());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}