package Task1.model;

public class Rectangle extends Figure{
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами " + sideA + " и " + sideB + " и площадью " + calcArea();
    }

    public double calcArea(){
        return sideA*sideB;
    }
}
