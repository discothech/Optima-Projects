import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileOutputStream fos = new FileOutputStream("D://LearningVideos/List.txt", true)){
            // Перша частина
            for(int i = 1; i<=5; i++) {
                System.out.println("Model name: ");
                Scanner n = new Scanner(System.in);
                String name = n.nextLine();
                System.out.println("Price: ");
                Scanner a = new Scanner(System.in);
                int age = a.nextInt();
                fos.write((i + ". " + name + "" + age + "\n").getBytes());
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        // Друга частина
        try(FileOutputStream fos = new FileOutputStream("D://LearningVideos/List.txt", true)){
            File file = new File("D://LearningVideos/List.txt");
            FileReader fr = new FileReader("D://LearningVideos/List.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            ArrayList<String> list = new ArrayList<>();//створюємо список для збереження інформації
            while (line != null) {
                list.add(line);//записуємо кожен рядок у список
                line = reader.readLine();//зчитуємо всі рядки з файлу
            }
            int count = 0;
            String regular = "\\d+[^.]";//рядок, який описує регулярний вираз, що шукає всі числові значення, після яких не стоїть крапка
            Pattern pattern = Pattern.compile(regular);//створення шаблону для порівняння
            Matcher matcher;//застосовується для пошуку співпадінь
            for (String s: list) {
                matcher = pattern.matcher(s);
                if(matcher.find()){//якщо числове значення, яке відповідає віку людини, знайдено, то виконуємо перевірку
                    if(Integer.parseInt(matcher.group())>20000)//якщо знайдене значення більше за 20, то збільшуємо count на один
                        count++;
                }
            }
            System.out.println("\n Number of phones that cost 20000 or more: "+count);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}