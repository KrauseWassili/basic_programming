/*
Задача 1
Реализовать 3 класса геометрических фигур: круг (Circle), квадрат(Square) и прямоугольник (Rectangle).
Круг определяется радиусом, квадрат и прямоугольник своими сторонами.
В каждом классе должен быть метод расчета площади фигуры calcArea().
В main создать List из нескольких разных фигур и посчитать суммарную площадь всех фигур в List
Написать метод, который находит фигуру с самой большой площадью
Написать метод, который формирует List из фигур, с площадью больше, чем заданное значение
 */

package Task1;

import Task1.model.Circle;
import Task1.model.Figure;
import Task1.model.Rectangle;
import Task1.model.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figure> figureList = new ArrayList<>();
        figureList.add(new Circle(1.0));
        figureList.add(new Square(2.0));
        figureList.add(new Rectangle(3.0, 4.0));


        System.out.println("Суммарная площадь всех фигур составляет " + calcAreaSum(figureList));
        System.out.println("Фигура с самой большой площадью: " + largestFigure(figureList));
        double minArea = 3.5;
        System.out.println("Фигуры площадью больше чем " + minArea + ":");
        printFigureList(figureMoreThen(figureList,minArea));
    }

    public static double calcAreaSum(List<Figure> figureList) {
        double res = 0;
        for (Figure figure : figureList) {
            res += figure.calcArea();
        }
        return res;
    }

    public static Figure largestFigure(List<Figure> figureList) {
        Figure res = figureList.getFirst();
        for (int i = 1; i < figureList.size(); i++) {
            if (res.calcArea() < figureList.get(i).calcArea()) {
                res = figureList.get(i);
            }
        }
        return res;
    }

    public static List<Figure> figureMoreThen (List<Figure> figureList,double area){
        List<Figure> res = new ArrayList<>();
        for(Figure figure : figureList){
            if(figure.calcArea() > area){
                res.add(figure);
            }
        }
        return res;
    }

    public static void printFigureList (List<Figure> figureList){
        for (Figure figure : figureList) {
            System.out.println(figure);
        }
    }
}
