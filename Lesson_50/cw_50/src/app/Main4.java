package app;

import java.io.*;
import java.net.URL;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data2.txt"))   ) {


            writer.write("hello from java 72882");
            writer.newLine();
            writer.write("Привет из Java программы");

        } catch (IOException e){
            System.out.println("не смогли записать файл");
        }

        List<String> list = null;
        try (BufferedReader reader = new BufferedReader( new FileReader("data2.txt")   )) {
            list = reader.lines().toList();
        }catch (IOException e){
            System.out.println("Errror!");
        }
        System.out.println(list);

        // чтение URL

        list = null;
        try (BufferedReader reader
                     = new BufferedReader( new InputStreamReader(new URL("https://www.w3schools.com/").openStream() ))) {
            list = reader.lines().toList();
        }catch (IOException e){
            System.out.println("Errror!");
        }
        list.forEach(s-> System.out.println(s));


    }
}