package app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args)  {
        try (Writer writer = new FileWriter("data1.txt");    ) {

            writer.write("hello from java 72882" + System.lineSeparator());
            writer.write("Привет из Java программы");
            //writer.flush();
            //writer.close();
        } catch (IOException e){

            System.out.println("Что-то пошло не так ");
        }


    }
}