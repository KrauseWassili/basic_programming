package Task1.model;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Окружность с радиусом " + radius + " и площадью " + calcArea();
    }

    public double calcArea(){
        return 3.14159 * Math.pow(radius,2);
    }
}
