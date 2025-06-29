package Task2.model;

public class Flower extends Plant {

    public Flower(int initialHeight, int springGrowth, int summerGrowth, int autumnGrowth, int winterGrowth, int maxHeigth, int growthDeviation) {
        super(initialHeight, springGrowth, summerGrowth, autumnGrowth, winterGrowth, maxHeigth, growthDeviation);
    }


    public void autumn() {
        growing(getAutumnGrowth(), true);
    }

    public void winter() {
        growing(getWinterGrowth(), true);


    }
}
