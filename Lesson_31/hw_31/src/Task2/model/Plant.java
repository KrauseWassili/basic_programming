package Task2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Plant {
    private int initialHeight;
    private int springGrowth;
    private int summerGrowth;
    private int autumnGrowth;
    private int winterGrowth;
    private int maxHeigth;
    private int growthDeviation;
    private List<Integer> heightList = new ArrayList<>();

    public Plant(int initialHeight, int springGrowth, int summerGrowth, int autumnGrowth, int winterGrowth, int maxHeigth, int growthDeviation) {
        this.initialHeight = initialHeight;
        this.springGrowth = springGrowth;
        this.summerGrowth = summerGrowth;
        this.autumnGrowth = autumnGrowth;
        this.winterGrowth = winterGrowth;
        this.maxHeigth = maxHeigth;
        this.growthDeviation = growthDeviation;
    }

    public int getSpringGrowth() {
        return springGrowth;
    }

    public int getSummerGrowth() {
        return summerGrowth;
    }

    public int getAutumnGrowth() {
        return autumnGrowth;
    }

    public int getWinterGrowth() {
        return winterGrowth;
    }

    public List<Integer> getHeightList() {
        return heightList;
    }

    Random random = new Random();


    public void spring() {
        growing(springGrowth,false);
    }

    public void summer() {
        growing(summerGrowth,false);
    }

    public void autumn() {
        growing(autumnGrowth,false);
    }

    public void winter() {
        growing(winterGrowth,false);
    }

    public void growing(int maxDelta,boolean cut) {     //Получаем максимальное значение прироста и параметр, отвечающий за событие срезаем растение или нет.
        if (cut) {                                       //если срезаем растение, то пишем 0
            heightList.add(0);
        } else {
            int newHeight = random.nextInt(maxDelta - growthDeviation, maxDelta); //получаем новое значение, на которое вырастет растение
            if (newHeight < 0) {                                                              //если прирост составит 0 см, то засчет отклонения прирост окажется отрицательным.
                newHeight = 0;                                                                  //устраняем этот недостаток
            }
            if (heightList.isEmpty()) { //Если впервые вызываем функцию, то добавляем высоту саженца
                newHeight += initialHeight;
                heightList.add(newHeight);
            }
            else if (heightList.getLast() + newHeight < maxHeigth) { // Если не превышаем максимальную высоту растения, тогда добавляем новое значение
                heightList.add(heightList.getLast() + newHeight);
            } else {
                heightList.add(maxHeigth);
            }
        }
    }



    public void year() {
        spring();
        summer();
        autumn();
        winter();
    }



}
