import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        String file = "Text.txt";
        ArrayList<String>text=readFileWithSplittingTextInWords(file);
        // String regular = "^[+-]?[1-9]\\d*$";
        // String regular = "^[+-]?([0]|([1-9]\\d*))\\.\\d+$";
        String regular = "^([+-]?([0]|([1-9]\\d*))\\.\\d+)|(([+-]?[1-9]\\d*)|0)$";
        Pattern pattern = Pattern.compile(regular);
        Matcher matcher;
        for(int i=0; i < text.size(); i++){
            matcher = pattern.matcher(text.get(i));
            if(matcher.find()){
                System.out.print(text.get(i)+" ");
            }
        }
    }
    public static ArrayList <String> readFileWithSplittingTextInWords (String nameFile){
        ArrayList<String> list = new ArrayList<String>();
        try(BufferedReader bufferedReader = new BufferedReader (new FileReader(nameFile));){
            String s;
            while ((s=bufferedReader.readLine())!=null){
                list.add(s);
            }
        }
        catch(Exception e){ System.out.println(e.getMessage());}
        String pattern = "\s";
        ArrayList<String>words=new ArrayList<>();
        for (String line:list){
            String[] splitResult;
            splitResult = line.split(pattern);
            for (String word:splitResult){
                words.add(word);
            }
        }
        return words;
    }
}

/*
public class Main {
    public static void main(String[] args) {
        String file = "Email.txt";
        ArrayList<String>text=ReadFile(file);
        String regular = "^[0-9A-Za-z][0-9a-zA-Z\\.-_]{1,}[0-9A-Za-z]{1}@([a-zA-Z0-9_.+-]+)\\.[a-zA-Z0-9_.+-]+$";
        Pattern pattern = Pattern.compile(regular);
        Matcher matcher;
        for(int i=0; i < text.size(); i++){
            matcher = pattern.matcher(text.get(i));
            System.out.print(text.get(i)+" ");
            if(matcher.find()){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }
    public static ArrayList <String> ReadFile(String file){
        ArrayList<String> array = new ArrayList<String>();
        try(FileInputStream fis = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(fis);
            BufferedReader read = new BufferedReader(reader)){
            String line = read.readLine();
            while(line!=null){
                array.add(line);
                line = read.readLine();
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return array;
    }
}
 */