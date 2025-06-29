/*
Задача 2
Допустим, у Вас есть несколько растений (деревья, кусты, цветы).
Необходимо реализовать программу, которая моделирует рост растений.
Все растения растут по-разному, некоторые, растут круглый год, некоторые только весной и летом.
Необходимо учесть, что высаживают растения тоже по-разному, цветы в виде луковиц (т.е. начальный рост 0),
а деревья в виде саженцев (т.е. начальный рост 1,5 метра). Кроме того, цветы зимой обрезают, чтобы они не замерзли,
т.е. высота опять становится 0.
В таблице представлены данные о росте растения в зависимости от сезона, плюс данные о начальном росте:


                    начальное    spring    summer   autumn      winter      макс.
                    значение     весна     лето     осень       зима        высота
tree (деревья) м.   1.5м          15см         15см      5см           5см           5м
bush (кусты)  см.   40см           10см         10см      3см           0см           1,5м
flower (цветы) см.  0см            7см          10см      0см           0см           1м

Подсказка: Ваши классы должны моделировать рост растений за каждый сезон,
т.е. должны быть методы spring(), summer(), autumn() и winter().
Затем, можно объединить вызов этих методов в один вызов, ну т.е. метод год.
Естественно, все растения должны быть помещены в массив\лист, и обрабатываться массово.
 */

package Task2;

import Task2.model.Bush;
import Task2.model.Flower;
import Task2.model.Plant;
import Task2.model.Tree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Plant> plantList = new ArrayList<>();


        plantList.add(new Tree(150, 15, 15, 5, 5, 500, 5));
        plantList.add(new Bush(40, 10, 10, 3, 0, 150, 2));
        plantList.add(new Flower(0, 7, 10, 0, 0, 100, 2));


       for(Plant plant : plantList){
           plant.year();
       }
        for(Plant plant : plantList){
            plant.year();
        }

        printStatistic(plantList);

    }

    public static void printStatistic(List<Plant> plantList) {
        if (!plantList.isEmpty()) {
            for (int i = 0; i < plantList.size(); i++) {
                System.out.print("Растение №" + (i+1) + ":\t");
                printHeigthList(plantList.get(i));
                System.out.print("\n");
            }
        } else {
            System.out.println("Список растений пуст.");
        }
    }

    public static void printHeigthList(Plant plant) {
        for (int i = 0; i < plant.getHeightList().size(); i++) {
            System.out.print(plant.getHeightList().get(i) + "\t\t");
        }
    }

}
