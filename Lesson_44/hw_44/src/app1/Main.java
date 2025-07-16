/*
1

Допустим вы продаете автомобили. Т.е. есть класс Auto. У каждой машины есть номер (id), бренд, год выпуска, цена.
У вас есть список автомобилей.
Ваша программа должна уметь получать список автомобилей отсортированный по:
 номеру
цене
году выпуска
бренду

Естественно, вам придется реализовать соответствующие компараторы. Естественно, реализовывать нужно лямбда-выражением.
*/
package app1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Auto> autoList = new ArrayList<>(List.of(
           new Auto(120,"Toyota",2011, 16000),
           new Auto(111,"Nissan",2021, 19100),
           new Auto(123,"Jiguli",2012, 16200),
           new Auto(433,"Dacia",2023, 13300),
           new Auto(144,"Jaguar",2014, 12440),
           new Auto(325,"Toyota",2025, 13500),
           new Auto(176,"Ford",2016, 17600),
           new Auto(807,"Ferrari",2027, 11700)
        ));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Исходный список машин:");
        System.out.println(autoList);

        while (true) {
            System.out.println("\nВыберите критерий сортировки:\n 1. id\n 2. бренд\n 3. год выпуска\n 4. цена по возрастанию\n 5. цена по убыванию\n 0. завершить");
            int mode = scanner.nextInt();
            if (mode >= 1 && mode <= 5) {
                SortAutos.sortBy(autoList,mode);
                System.out.println(autoList);
            }else if (mode <0 || mode > 5){
                System.out.println(mode + "- неверный критерий!");
            }
            else break;
        }
    }



}
