/*
Wassili Krause HW_16_3 cochort_68M

Задача 3
Дано три переменные:

isQuietHours — сейчас тихое время (ночь, например)
hasNeighborsComplaint — жалуются ли соседи
isHoliday — сейчас праздник
Музыку можно включить, если не тихое время и соседи не жалуются.
В праздник музыку можно включать даже если соседи жалуются или тихое время. Запишите условие для
переменной isMusicAllowed: можно ли включать музыку
 */

package app;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        boolean isQuietHours            = false;
        boolean hasNeighborsComplaint   = true;
        boolean isHoliday               = false;

        boolean isMusicAllowed = !isQuietHours && !hasNeighborsComplaint || isHoliday;

        System.out.println("Можно ли включать музыку?");
        if (isMusicAllowed) {
            System.out.println("Да!");
        }else {
            System.out.println("Нет!");
        }

    }
}