package app;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main3 {
    public static void main(String[] args) {

        try (Reader reader = new FileReader("data1.txt")) {

            int data;
            while (  (data = reader.read()) != -1 ){
                System.out.print( (char) data);
            }

        } catch (IOException e){
            System.out.println("Не смогли прочитать файл");
        }


    }
}
