package Task1.model;

public class Square extends Figure {
    private double side;

    public Square (double side){
        this.side = side;
    }

    @Override
    public String toString() {
        return "Квадрат со стороной " + side + " и площадью " + calcArea();
    }
    public double calcArea(){
        return Math.pow(side,2);
    }
}
